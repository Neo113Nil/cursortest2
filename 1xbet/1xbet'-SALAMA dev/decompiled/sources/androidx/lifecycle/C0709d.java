package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0709d f9618c = new C0709d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9619a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9620b = new HashMap();

    public static void b(HashMap map, C0708c c0708c, EnumC0718m enumC0718m, Class cls) {
        EnumC0718m enumC0718m2 = (EnumC0718m) map.get(c0708c);
        if (enumC0718m2 == null || enumC0718m == enumC0718m2) {
            if (enumC0718m2 == null) {
                map.put(c0708c, enumC0718m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0708c.f9617b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0718m2 + ", new value " + enumC0718m);
    }

    public final C0707b a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f9619a;
        if (superclass != null) {
            C0707b c0707bA = (C0707b) map2.get(superclass);
            if (c0707bA == null) {
                c0707bA = a(superclass, null);
            }
            map.putAll(c0707bA.f9615b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0707b c0707bA2 = (C0707b) map2.get(cls2);
            if (c0707bA2 == null) {
                c0707bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0707bA2.f9615b.entrySet()) {
                b(map, (C0708c) entry.getKey(), (EnumC0718m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            D d7 = (D) method.getAnnotation(D.class);
            if (d7 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC0724t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                EnumC0718m enumC0718mValue = d7.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0718m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0718mValue != EnumC0718m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0708c(i7, method), enumC0718mValue, cls);
                z4 = true;
            }
        }
        C0707b c0707b = new C0707b(map);
        map2.put(cls, c0707b);
        this.f9620b.put(cls, Boolean.valueOf(z4));
        return c0707b;
    }
}

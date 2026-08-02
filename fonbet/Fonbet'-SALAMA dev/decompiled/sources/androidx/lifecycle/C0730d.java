package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0730d f9618c = new C0730d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9619a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9620b = new HashMap();

    public static void b(HashMap hashMap, C0729c c0729c, EnumC0739m enumC0739m, Class cls) {
        EnumC0739m enumC0739m2 = (EnumC0739m) hashMap.get(c0729c);
        if (enumC0739m2 == null || enumC0739m == enumC0739m2) {
            if (enumC0739m2 == null) {
                hashMap.put(c0729c, enumC0739m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0729c.f9617b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0739m2 + ", new value " + enumC0739m);
    }

    public final C0728b a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f9619a;
        if (superclass != null) {
            C0728b c0728b = (C0728b) hashMap2.get(superclass);
            if (c0728b == null) {
                c0728b = a(superclass, null);
            }
            hashMap.putAll(c0728b.f9615b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0728b c0728b2 = (C0728b) hashMap2.get(cls2);
            if (c0728b2 == null) {
                c0728b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0728b2.f9615b.entrySet()) {
                b(hashMap, (C0729c) entry.getKey(), (EnumC0739m) entry.getValue(), cls);
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
                    if (!InterfaceC0745t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                EnumC0739m value = d7.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0739m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0739m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0729c(i7, method), value, cls);
                z4 = true;
            }
        }
        C0728b c0728b3 = new C0728b(hashMap);
        hashMap2.put(cls, c0728b3);
        this.f9620b.put(cls, Boolean.valueOf(z4));
        return c0728b3;
    }
}

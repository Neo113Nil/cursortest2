package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0234d f4568c = new C0234d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4569a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4570b = new HashMap();

    public static void b(HashMap hashMap, C0233c c0233c, EnumC0243m enumC0243m, Class cls) {
        EnumC0243m enumC0243m2 = (EnumC0243m) hashMap.get(c0233c);
        if (enumC0243m2 == null || enumC0243m == enumC0243m2) {
            if (enumC0243m2 == null) {
                hashMap.put(c0233c, enumC0243m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0233c.f4567b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0243m2 + ", new value " + enumC0243m);
    }

    public final C0232b a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f4569a;
        if (superclass != null) {
            C0232b c0232b = (C0232b) hashMap2.get(superclass);
            if (c0232b == null) {
                c0232b = a(superclass, null);
            }
            hashMap.putAll(c0232b.f4565b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0232b c0232b2 = (C0232b) hashMap2.get(cls2);
            if (c0232b2 == null) {
                c0232b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0232b2.f4565b.entrySet()) {
                b(hashMap, (C0233c) entry.getKey(), (EnumC0243m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            B b6 = (B) method.getAnnotation(B.class);
            if (b6 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0250u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0243m value = b6.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0243m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0243m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0233c(i2, method), value, cls);
                z = true;
            }
        }
        C0232b c0232b3 = new C0232b(hashMap);
        hashMap2.put(cls, c0232b3);
        this.f4570b.put(cls, Boolean.valueOf(z));
        return c0232b3;
    }
}

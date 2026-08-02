package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0475d f7048c = new C0475d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7049a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7050b = new HashMap();

    public static void b(HashMap hashMap, C0474c c0474c, EnumC0486o enumC0486o, Class cls) {
        EnumC0486o enumC0486o2 = (EnumC0486o) hashMap.get(c0474c);
        if (enumC0486o2 == null || enumC0486o == enumC0486o2) {
            if (enumC0486o2 == null) {
                hashMap.put(c0474c, enumC0486o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0474c.f7047b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0486o2 + ", new value " + enumC0486o);
    }

    public final C0473b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f7049a;
        if (superclass != null) {
            C0473b c0473b = (C0473b) hashMap2.get(superclass);
            if (c0473b == null) {
                c0473b = a(superclass, null);
            }
            hashMap.putAll(c0473b.f7045b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0473b c0473b2 = (C0473b) hashMap2.get(cls2);
            if (c0473b2 == null) {
                c0473b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0473b2.f7045b.entrySet()) {
                b(hashMap, (C0474c) entry.getKey(), (EnumC0486o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            C c5 = (C) method.getAnnotation(C.class);
            if (c5 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0491u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0486o value = c5.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0486o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0486o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0474c(method, i), value, cls);
                z3 = true;
            }
        }
        C0473b c0473b3 = new C0473b(hashMap);
        hashMap2.put(cls, c0473b3);
        this.f7050b.put(cls, Boolean.valueOf(z3));
        return c0473b3;
    }
}

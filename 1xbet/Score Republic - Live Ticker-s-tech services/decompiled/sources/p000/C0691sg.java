package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: sg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691sg {

    /* JADX INFO: renamed from: c */
    public static final C0691sg f7112c = new C0691sg();

    /* JADX INFO: renamed from: a */
    public final HashMap f7113a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f7114b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m4519b(HashMap map, C0654rg c0654rg, ph0 ph0Var, Class cls) {
        ph0 ph0Var2 = (ph0) map.get(c0654rg);
        if (ph0Var2 == null || ph0Var == ph0Var2) {
            if (ph0Var2 == null) {
                map.put(c0654rg, ph0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0654rg.f6838b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ph0Var2 + ", new value " + ph0Var);
    }

    /* JADX INFO: renamed from: a */
    public final C0617qg m4520a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f7113a;
        if (superclass != null) {
            C0617qg c0617qgM4520a = (C0617qg) map2.get(superclass);
            if (c0617qgM4520a == null) {
                c0617qgM4520a = m4520a(superclass, null);
            }
            map.putAll(c0617qgM4520a.f6488b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0617qg c0617qgM4520a2 = (C0617qg) map2.get(cls2);
            if (c0617qgM4520a2 == null) {
                c0617qgM4520a2 = m4520a(cls2, null);
            }
            for (Map.Entry entry : c0617qgM4520a2.f6488b.entrySet()) {
                m4519b(map, (C0654rg) entry.getKey(), (ph0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            mu0 mu0Var = (mu0) method.getAnnotation(mu0.class);
            if (mu0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!yh0.class.isAssignableFrom(parameterTypes[0])) {
                        C0270h1.m2190f("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ph0 ph0VarValue = mu0Var.value();
                if (parameterTypes.length > 1) {
                    if (!ph0.class.isAssignableFrom(parameterTypes[1])) {
                        C0270h1.m2190f("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (ph0VarValue != ph0.ON_ANY) {
                        C0270h1.m2190f("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C0270h1.m2190f("cannot have more than 2 params");
                    return null;
                }
                m4519b(map, new C0654rg(i, method), ph0VarValue, cls);
                z = true;
            }
        }
        C0617qg c0617qg = new C0617qg(map);
        map2.put(cls, c0617qg);
        this.f7114b.put(cls, Boolean.valueOf(z));
        return c0617qg;
    }
}

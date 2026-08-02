package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5413e {

    /* renamed from: c, reason: collision with root package name */
    static C5413e f43302c = new C5413e();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f43303a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f43304b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.e$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final HashMap f43305a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final HashMap f43306b;

        a(HashMap hashMap) {
            this.f43306b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                AbstractC5434v.a aVar = (AbstractC5434v.a) entry.getValue();
                List list = (List) this.f43305a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f43305a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        private static void b(List list, J j11, AbstractC5434v.a aVar, I i11) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = (b) list.get(size);
                    bVar.getClass();
                    try {
                        int i12 = bVar.f43307a;
                        Method method = bVar.f43308b;
                        if (i12 == 0) {
                            method.invoke(i11, new Object[0]);
                        } else if (i12 == 1) {
                            method.invoke(i11, j11);
                        } else if (i12 == 2) {
                            method.invoke(i11, j11, aVar);
                        }
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    } catch (InvocationTargetException e12) {
                        throw new RuntimeException("Failed to call observer method", e12.getCause());
                    }
                }
            }
        }

        final void a(J j11, AbstractC5434v.a aVar, I i11) {
            HashMap hashMap = this.f43305a;
            b((List) hashMap.get(aVar), j11, aVar, i11);
            b((List) hashMap.get(AbstractC5434v.a.ON_ANY), j11, aVar, i11);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.e$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f43307a;

        /* renamed from: b, reason: collision with root package name */
        final Method f43308b;

        b(Method method, int i11) {
            this.f43307a = i11;
            this.f43308b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f43307a == bVar.f43307a && this.f43308b.getName().equals(bVar.f43308b.getName());
        }

        public final int hashCode() {
            return this.f43308b.getName().hashCode() + (this.f43307a * 31);
        }
    }

    C5413e() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i11;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f43306b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f43306b.entrySet()) {
                d(hashMap, (b) entry.getKey(), (AbstractC5434v.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e11) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
            }
        }
        boolean z11 = false;
        for (Method method : methodArr) {
            X x11 = (X) method.getAnnotation(X.class);
            if (x11 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i11 = 0;
                } else {
                    if (!J.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i11 = 1;
                }
                AbstractC5434v.a value = x11.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC5434v.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC5434v.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i11 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new b(method, i11), value, cls);
                z11 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f43303a.put(cls, aVar);
        this.f43304b.put(cls, Boolean.valueOf(z11));
        return aVar;
    }

    private static void d(HashMap hashMap, b bVar, AbstractC5434v.a aVar, Class cls) {
        AbstractC5434v.a aVar2 = (AbstractC5434v.a) hashMap.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                hashMap.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f43308b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    final a b(Class<?> cls) {
        a aVar = (a) this.f43303a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    final boolean c(Class<?> cls) {
        HashMap hashMap = this.f43304b;
        Boolean bool = (Boolean) hashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((X) method.getAnnotation(X.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            hashMap.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e11) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
        }
    }
}

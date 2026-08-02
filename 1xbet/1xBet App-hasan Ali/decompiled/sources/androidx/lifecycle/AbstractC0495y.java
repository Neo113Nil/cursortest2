package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import o4.AbstractC2234l;
import r0.AbstractC2346c;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0495y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f7075a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f7076b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0490t interfaceC0490t) {
        try {
            kotlin.jvm.internal.l.c(constructor.newInstance(interfaceC0490t));
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z3;
        int i = 1;
        HashMap hashMap = f7075a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r42 != null ? r42.getName() : "";
                kotlin.jvm.internal.l.c(name);
                if (name.length() != 0) {
                    kotlin.jvm.internal.l.c(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    kotlin.jvm.internal.l.e("substring(...)", canonicalName);
                }
                kotlin.jvm.internal.l.c(canonicalName);
                String concat = AbstractC2234l.v0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap hashMap2 = f7076b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC2346c.A(constructor));
            } else {
                C0475d c0475d = C0475d.f7048c;
                HashMap hashMap3 = c0475d.f7050b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((C) declaredMethods[i5].getAnnotation(C.class)) != null) {
                                c0475d.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i5++;
                        }
                    } catch (NoClassDefFoundError e5) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0490t.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.l.c(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.l.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.l.e("getInterfaces(...)", interfaces);
                    int length2 = interfaces.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            Class<?> cls2 = interfaces[i6];
                            if (cls2 != null && InterfaceC0490t.class.isAssignableFrom(cls2)) {
                                kotlin.jvm.internal.l.c(cls2);
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                kotlin.jvm.internal.l.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i6++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}

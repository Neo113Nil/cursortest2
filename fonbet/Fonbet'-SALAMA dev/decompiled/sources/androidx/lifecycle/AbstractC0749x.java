package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0749x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9645a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9646b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0744s interfaceC0744s) {
        try {
            t6.h.d(constructor.newInstance(interfaceC0744s), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z4;
        HashMap hashMap = f9645a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : "";
                t6.h.d(name, "fullPackage");
                if (name.length() != 0) {
                    t6.h.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    t6.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                t6.h.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = C6.o.y0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            }
            HashMap hashMap2 = f9646b;
            if (constructor != null) {
                hashMap2.put(cls, Y4.D.D(constructor));
            } else {
                C0730d c0730d = C0730d.f9618c;
                HashMap hashMap3 = c0730d.f9620b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z4 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z4 = false;
                                break;
                            }
                            if (((D) declaredMethods[i8].getAnnotation(D.class)) != null) {
                                c0730d.a(cls, declaredMethods);
                                z4 = true;
                                break;
                            }
                            i8++;
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!z4) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0744s.class.isAssignableFrom(superclass)) {
                        t6.h.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            t6.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    t6.h.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> cls2 = interfaces[i9];
                            if (cls2 != null && InterfaceC0744s.class.isAssignableFrom(cls2)) {
                                t6.h.d(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                t6.h.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i7 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i7));
        return i7;
    }
}

package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0728x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f9645a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f9646b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0723s interfaceC0723s) {
        try {
            t6.h.d(constructor.newInstance(interfaceC0723s), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0146 A[SYNTHETIC] */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i7;
        boolean z4;
        HashMap map = f9645a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i8 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r7 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r7 != null ? r7.getName() : "";
                t6.h.d(name, "fullPackage");
                if (name.length() != 0) {
                    t6.h.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    t6.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                t6.h.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C6.o.y0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            }
            HashMap map2 = f9646b;
            if (declaredConstructor != null) {
                map2.put(cls, Y4.D.D(declaredConstructor));
            } else {
                C0709d c0709d = C0709d.f9618c;
                HashMap map3 = c0709d.f9620b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((D) declaredMethods[i9].getAnnotation(D.class)) != null) {
                                c0709d.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i9++;
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0723s.class.isAssignableFrom(superclass)) {
                        t6.h.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            t6.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            t6.h.d(interfaces, "klass.interfaces");
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && InterfaceC0723s.class.isAssignableFrom(cls2)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    t6.h.d(cls2, "intrface");
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        t6.h.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        t6.h.d(interfaces, "klass.interfaces");
                        while (i7 < r7) {
                            if (cls2 == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                t6.h.d(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    t6.h.b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i8 = 2;
        }
        map.put(cls, Integer.valueOf(i8));
        return i8;
    }
}

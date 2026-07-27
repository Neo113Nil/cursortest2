package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0254y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f4600a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4601b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0249t interfaceC0249t) {
        try {
            kotlin.jvm.internal.i.d(constructor.newInstance(interfaceC0249t), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z;
        HashMap hashMap = f4600a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r32 != null ? r32.getName() : "";
                kotlin.jvm.internal.i.d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.i.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.i.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.i.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = B4.r.M(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
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
            HashMap hashMap2 = f4601b;
            if (constructor != null) {
                hashMap2.put(cls, K1.b.W(constructor));
            } else {
                C0234d c0234d = C0234d.f4568c;
                HashMap hashMap3 = c0234d.f4570b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((B) declaredMethods[i3].getAnnotation(B.class)) != null) {
                                c0234d.a(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e6) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0249t.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.i.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.i.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.i.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            Class<?> intrface = interfaces[i6];
                            if (intrface != null && InterfaceC0249t.class.isAssignableFrom(intrface)) {
                                kotlin.jvm.internal.i.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.i.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i6++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i2));
        return i2;
    }
}

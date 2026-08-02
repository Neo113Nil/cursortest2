package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final HashMap f43221a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap f43222b = new HashMap();

    private static r a(Constructor constructor, I i11) {
        try {
            Object newInstance = constructor.newInstance(i11);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (r) newInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    @NotNull
    public static final String b(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return C.o0.c(new StringBuilder(), kotlin.text.h.X(className, ".", "_", false), "_LifecycleAdapter");
    }

    private static int c(Class cls) {
        Constructor<?> constructor;
        HashMap hashMap = f43221a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i11 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r32 != null ? r32.getName() : "";
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b11 = b(name);
                if (fullPackage.length() != 0) {
                    b11 = fullPackage + '.' + b11;
                }
                constructor = Class.forName(b11).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            }
            HashMap hashMap2 = f43222b;
            if (constructor != null) {
                hashMap2.put(cls, C7714v.a0(constructor));
            } else if (!C5413e.f43302c.c(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && I.class.isAssignableFrom(superclass)) {
                    Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                    if (c(superclass) != 1) {
                        Object obj = hashMap2.get(superclass);
                        Intrinsics.f(obj);
                        arrayList = new ArrayList((Collection) obj);
                    }
                }
                Class<?>[] interfaces = cls.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                int length = interfaces.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Class<?> intrface = interfaces[i12];
                        if (intrface != null && I.class.isAssignableFrom(intrface)) {
                            Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                            if (c(intrface) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Object obj2 = hashMap2.get(intrface);
                            Intrinsics.f(obj2);
                            arrayList.addAll((Collection) obj2);
                        }
                        i12++;
                    } else if (arrayList != null) {
                        hashMap2.put(cls, arrayList);
                    }
                }
            }
            i11 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i11));
        return i11;
    }

    @NotNull
    public static final G d(@NotNull I object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z11 = object instanceof G;
        boolean z12 = object instanceof DefaultLifecycleObserver;
        if (z11 && z12) {
            return new C5424k((DefaultLifecycleObserver) object, (G) object);
        }
        if (z12) {
            return new C5424k((DefaultLifecycleObserver) object, null);
        }
        if (z11) {
            return (G) object;
        }
        Class<?> cls = object.getClass();
        if (c(cls) != 2) {
            return new C5410c0(object);
        }
        Object obj = f43222b.get(cls);
        Intrinsics.f(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            return new q0(a((Constructor) list.get(0), object));
        }
        int size = list.size();
        r[] rVarArr = new r[size];
        for (int i11 = 0; i11 < size; i11++) {
            rVarArr[i11] = a((Constructor) list.get(i11), object);
        }
        return new C5417g(rVarArr);
    }
}

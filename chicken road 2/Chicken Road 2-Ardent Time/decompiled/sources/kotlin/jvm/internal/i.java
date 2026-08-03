package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f7955a = new java.lang.Object[0];

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(java.lang.Object obj) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException();
        g(nullPointerException, kotlin.jvm.internal.i.class.getName());
        throw nullPointerException;
    }

    public static void c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str);
        g(nullPointerException, kotlin.jvm.internal.i.class.getName());
        throw nullPointerException;
    }

    public static void d(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str.concat(" must not be null"));
        g(nullPointerException, kotlin.jvm.internal.i.class.getName());
        throw nullPointerException;
    }

    public static void e(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = kotlin.jvm.internal.i.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            g(nullPointerException, kotlin.jvm.internal.i.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static void g(java.lang.RuntimeException runtimeException, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static java.lang.String h(java.lang.Object obj, java.lang.String str) {
        return str + obj;
    }

    public static void i(java.lang.String str) {
        E1.A a2 = new E1.A("lateinit property " + str + " has not been initialized");
        g(a2, kotlin.jvm.internal.i.class.getName());
        throw a2;
    }

    public static final java.lang.Object[] j(java.util.Collection collection) {
        int size = collection.size();
        java.lang.Object[] objArr = f7955a;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i4);
                d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i3);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i2 = i3;
        }
    }

    public static final java.lang.Object[] k(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (java.lang.Object[]) newInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i4);
                d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i3);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i2 = i3;
        }
    }
}

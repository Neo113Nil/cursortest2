package t6;

import A1.W;
import W5.AbstractC0486a1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f16467a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        g(nullPointerException, h.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        g(nullPointerException, h.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        g(nullPointerException, h.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = h.class.getName();
            int i7 = 0;
            while (!stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            while (stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            StringBuilder l7 = e1.k.l("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            l7.append(str);
            NullPointerException nullPointerException = new NullPointerException(l7.toString());
            g(nullPointerException, h.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    public static void g(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }

    public static void h(String str) {
        W w7 = new W(AbstractC0486a1.h("lateinit property ", str, " has not been initialized"));
        g(w7, h.class.getName());
        throw w7;
    }

    public static final Object[] i(Collection collection) {
        int size = collection.size();
        Object[] objArr = f16467a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i7 = i8;
        }
    }

    public static final Object[] j(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
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
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i8] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i7 = i8;
        }
    }
}

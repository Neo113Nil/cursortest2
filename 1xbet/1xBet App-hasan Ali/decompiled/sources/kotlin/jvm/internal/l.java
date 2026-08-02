package kotlin.jvm.internal;

import X3.C0442b;
import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Uri uri) {
        if (uri != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Uri.parse(this) must not be null");
        j(illegalStateException, l.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void f(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = l.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            j(nullPointerException, l.class.getName());
            throw nullPointerException;
        }
    }

    public static int g(int i, int i5) {
        if (i < i5) {
            return -1;
        }
        return i == i5 ? 0 : 1;
    }

    public static int h(long j5, long j6) {
        if (j5 < j6) {
            return -1;
        }
        return j5 == j6 ? 0 : 1;
    }

    public static final C0442b i(Object[] objArr) {
        f("array", objArr);
        return new C0442b(objArr);
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i = i5;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void k(String str) {
        D2.e eVar = new D2.e(L1.a.n("lateinit property ", str, " has not been initialized"));
        j(eVar, l.class.getName());
        throw eVar;
    }
}

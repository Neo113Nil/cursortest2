package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11236a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11237b;

    /* renamed from: c, reason: collision with root package name */
    public static int f11238c;

    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(w1.L.j("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void k(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void l(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.common.api.j n(Status status) {
        return status.f11084c != null ? new com.google.android.gms.common.api.r(status) : new com.google.android.gms.common.api.j(status);
    }
}

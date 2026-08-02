package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.hx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091hx implements Jw {

    /* renamed from: A, reason: collision with root package name */
    public static final C1091hx f13819A;

    /* renamed from: B, reason: collision with root package name */
    public static final C1091hx f13820B;

    /* renamed from: m, reason: collision with root package name */
    public static final C1091hx f13821m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1091hx f13822n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1091hx f13823o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1091hx f13824p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1091hx f13825q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1091hx f13826r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1091hx f13827s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1091hx f13828t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1091hx f13829u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1091hx f13830v;

    /* renamed from: w, reason: collision with root package name */
    public static final C1091hx f13831w;

    /* renamed from: x, reason: collision with root package name */
    public static final C1091hx f13832x;

    /* renamed from: y, reason: collision with root package name */
    public static final C1091hx f13833y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1091hx f13834z;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13835k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13836l;

    static {
        int i = 0;
        f13821m = new C1091hx("ENABLED", i);
        f13822n = new C1091hx("DISABLED", i);
        f13823o = new C1091hx("DESTROYED", i);
        int i5 = 1;
        f13824p = new C1091hx("TINK", i5);
        f13825q = new C1091hx("CRUNCHY", i5);
        f13826r = new C1091hx("NO_PREFIX", i5);
        int i6 = 2;
        f13827s = new C1091hx("ASSUME_AES_GCM", i6);
        f13828t = new C1091hx("ASSUME_XCHACHA20POLY1305", i6);
        f13829u = new C1091hx("ASSUME_CHACHA20POLY1305", i6);
        f13830v = new C1091hx("ASSUME_AES_CTR_HMAC", i6);
        f13831w = new C1091hx("ASSUME_AES_EAX", i6);
        f13832x = new C1091hx("ASSUME_AES_GCM_SIV", i6);
        int i7 = 3;
        f13833y = new C1091hx("TINK", i7);
        f13834z = new C1091hx("CRUNCHY", i7);
        f13819A = new C1091hx("LEGACY", i7);
        f13820B = new C1091hx("NO_PREFIX", i7);
    }

    public /* synthetic */ C1091hx(String str, int i) {
        this.f13835k = i;
        this.f13836l = str;
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e3) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e3);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC0467k.v(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f13836l, str, objArr));
        }
    }

    public void b(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f13836l, str, objArr), remoteException);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f13836l, str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f13836l, str, objArr));
        }
    }

    public String toString() {
        switch (this.f13835k) {
            case 0:
                return this.f13836l;
            case 1:
                return this.f13836l;
            case 2:
                return this.f13836l;
            case 3:
                return this.f13836l;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        P2.o.f4767B.f4774g.h(this.f13836l, th);
    }

    public C1091hx(String str) {
        this.f13835k = 5;
        this.f13836l = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
    }
}

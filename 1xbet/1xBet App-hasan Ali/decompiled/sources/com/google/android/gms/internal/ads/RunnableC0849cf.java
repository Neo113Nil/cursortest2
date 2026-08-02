package com.google.android.gms.internal.ads;

import Q2.C0393x0;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0849cf implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BinderC0894df f13021k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13022l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f13023m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f13024n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f13025o;

    public /* synthetic */ RunnableC0849cf(BinderC0894df binderC0894df, int i, int i5, boolean z3, boolean z5) {
        this.f13021k = binderC0894df;
        this.f13022l = i;
        this.f13023m = i5;
        this.f13024n = z3;
        this.f13025o = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ?? r11;
        ?? r32;
        C0393x0 c0393x0;
        C0393x0 c0393x02;
        C0393x0 c0393x03;
        BinderC0894df binderC0894df = this.f13021k;
        int i5 = this.f13022l;
        int i6 = this.f13023m;
        boolean z3 = this.f13024n;
        boolean z5 = this.f13025o;
        synchronized (binderC0894df.f13115l) {
            try {
                boolean z6 = binderC0894df.f13120q;
                if (z6 || i6 != 1) {
                    i = i6;
                    r11 = false;
                } else {
                    i6 = 1;
                    i = 1;
                    r11 = true;
                }
                ?? r22 = i5 != i6;
                if (r22 == true && i == 1) {
                    r32 = true;
                    i = 1;
                } else {
                    r32 = false;
                }
                ?? r12 = r22 == true && i == 2;
                ?? r23 = r22 == true && i == 3;
                binderC0894df.f13120q = z6 || r11 == true;
                if (r11 != false) {
                    try {
                        C0393x0 c0393x04 = binderC0894df.f13119p;
                        if (c0393x04 != null) {
                            c0393x04.e();
                        }
                    } catch (RemoteException e3) {
                        U2.j.k("#007 Could not call remote method.", e3);
                    }
                }
                if (r32 != false && (c0393x03 = binderC0894df.f13119p) != null) {
                    c0393x03.d1(c0393x03.N(), 2);
                }
                if (r12 != false && (c0393x02 = binderC0894df.f13119p) != null) {
                    c0393x02.f();
                }
                if (r23 != false) {
                    C0393x0 c0393x05 = binderC0894df.f13119p;
                    if (c0393x05 != null) {
                        c0393x05.b();
                    }
                    binderC0894df.f13114k.F();
                }
                if (z3 != z5 && (c0393x0 = binderC0894df.f13119p) != null) {
                    Parcel N5 = c0393x0.N();
                    ClassLoader classLoader = F5.f8654a;
                    N5.writeInt(z5 ? 1 : 0);
                    c0393x0.d1(N5, 5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

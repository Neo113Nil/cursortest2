package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950er {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0638Ma f13363a;

    public C0950er(InterfaceC0638Ma interfaceC0638Ma) {
        this.f13363a = interfaceC0638Ma;
    }

    public final boolean a() {
        try {
            return this.f13363a.I();
        } catch (Throwable th) {
            throw new Yq(th);
        }
    }

    public final void b(boolean z3) {
        try {
            this.f13363a.m1(z3);
        } catch (Throwable th) {
            throw new Yq(th);
        }
    }
}

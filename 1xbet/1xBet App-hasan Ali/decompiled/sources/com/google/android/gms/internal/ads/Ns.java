package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class Ns implements Is {

    /* renamed from: d, reason: collision with root package name */
    public static Ns f10852d;

    /* renamed from: a, reason: collision with root package name */
    public float f10853a;

    /* renamed from: b, reason: collision with root package name */
    public Es f10854b;

    /* renamed from: c, reason: collision with root package name */
    public Hs f10855c;

    public static Ns a() {
        if (f10852d == null) {
            Ns ns = new Ns();
            ns.f10853a = 0.0f;
            f10852d = ns;
        }
        return f10852d;
    }

    @Override // com.google.android.gms.internal.ads.Is
    public final void d(boolean z3) {
        if (z3) {
            Ws.f12113g.getClass();
            Ws.b();
            return;
        }
        Ws.f12113g.getClass();
        Handler handler = Ws.i;
        if (handler != null) {
            handler.removeCallbacks(Ws.f12116k);
            Ws.i = null;
        }
    }
}

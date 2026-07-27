package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class t2 extends r2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u2 f2827h;

    public t2(u2 u2Var) {
        this.f2827h = u2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final String b() {
        s2 s2Var = (s2) this.f2827h.f2832a.get();
        return s2Var == null ? "Completer object has been garbage collected, future will fail soon" : B0.c.k("tag=[", String.valueOf(s2Var.f2817a), "]");
    }
}

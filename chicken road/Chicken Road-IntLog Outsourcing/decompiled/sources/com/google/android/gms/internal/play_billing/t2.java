package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class t2 extends r2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u2 f5263h;

    public t2(u2 u2Var) {
        this.f5263h = u2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final String c() {
        s2 s2Var = (s2) this.f5263h.f5268a.get();
        return s2Var == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC0279e.f("tag=[", String.valueOf(s2Var.f5253a), "]");
    }
}

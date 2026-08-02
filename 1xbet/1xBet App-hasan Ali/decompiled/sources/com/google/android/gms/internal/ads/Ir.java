package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.content.Context;

/* loaded from: classes.dex */
public final class Ir implements Ki, Th, Ni {

    /* renamed from: k, reason: collision with root package name */
    public final Mr f9638k;

    /* renamed from: l, reason: collision with root package name */
    public final Jr f9639l;

    public Ir(Context context, Mr mr) {
        this.f9638k = mr;
        this.f9639l = AbstractC1668us.j(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.Ni
    public final void a() {
        if (((Boolean) AbstractC0834c8.f12978d.s()).booleanValue()) {
            Jr jr = this.f9639l;
            jr.g(true);
            this.f9638k.a(jr);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ki
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.Ki
    public final void o() {
        if (((Boolean) AbstractC0834c8.f12978d.s()).booleanValue()) {
            this.f9639l.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.Th
    public final void q(C0387u0 c0387u0) {
        if (((Boolean) AbstractC0834c8.f12978d.s()).booleanValue()) {
            String bVar = c0387u0.a().toString();
            Jr jr = this.f9639l;
            jr.C(bVar);
            jr.g(false);
            this.f9638k.a(jr);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ni
    public final void i() {
    }
}

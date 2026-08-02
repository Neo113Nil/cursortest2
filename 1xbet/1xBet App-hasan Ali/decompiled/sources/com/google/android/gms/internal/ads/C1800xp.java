package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1800xp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final String f16331a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16332b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16333c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16334d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16335e;

    public C1800xp(String str, boolean z3, boolean z5, boolean z6, boolean z7) {
        this.f16331a = str;
        this.f16332b = z3;
        this.f16333c = z5;
        this.f16334d = z6;
        this.f16335e = z7;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void k(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8050b;
        String str = this.f16331a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z3 = this.f16332b;
        bundle.putInt("test_mode", z3 ? 1 : 0);
        boolean z5 = this.f16333c;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z3 || z5) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.T8)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f16335e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        String str = this.f16331a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z3 = this.f16332b;
        bundle.putInt("test_mode", z3 ? 1 : 0);
        boolean z5 = this.f16333c;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z3 || z5) {
            A7 a7 = F7.P8;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                bundle.putInt("risd", !this.f16334d ? 1 : 0);
            }
            if (((Boolean) rVar.f5056c.a(F7.T8)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f16335e);
            }
        }
    }
}

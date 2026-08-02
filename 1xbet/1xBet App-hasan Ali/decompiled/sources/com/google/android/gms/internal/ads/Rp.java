package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Rp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final String f11453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11455c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11456d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11457e;
    public final int f;

    public Rp(String str, int i, int i5, int i6, boolean z3, int i7) {
        this.f11453a = str;
        this.f11454b = i;
        this.f11455c = i5;
        this.f11456d = i6;
        this.f11457e = z3;
        this.f = i7;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        AbstractC1803xs.Z(bundle, "carrier", this.f11453a, !TextUtils.isEmpty(r0));
        int i = this.f11454b;
        AbstractC1803xs.U(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f11455c);
        bundle.putInt("pt", this.f11456d);
        Bundle e3 = AbstractC1803xs.e("device", bundle);
        bundle.putBundle("device", e3);
        Bundle e5 = AbstractC1803xs.e("network", e3);
        e3.putBundle("network", e5);
        e5.putInt("active_network_state", this.f);
        e5.putBoolean("active_network_metered", this.f11457e);
    }
}

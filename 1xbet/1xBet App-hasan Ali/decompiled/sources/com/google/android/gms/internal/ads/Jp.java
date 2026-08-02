package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Jp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10064b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10065c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10066d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10067e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10068g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10069h;

    public Jp(boolean z3, boolean z5, String str, boolean z6, int i, int i5, int i6, String str2) {
        this.f10063a = z3;
        this.f10064b = z5;
        this.f10065c = str;
        this.f10066d = z6;
        this.f10067e = i;
        this.f = i5;
        this.f10068g = i6;
        this.f10069h = str2;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8050b;
        bundle.putString("js", this.f10065c);
        bundle.putInt("target_api", this.f10067e);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        bundle.putString("js", this.f10065c);
        bundle.putBoolean("is_nonagon", true);
        A7 a7 = F7.f8692G3;
        Q2.r rVar = Q2.r.f5053d;
        bundle.putString("extra_caps", (String) rVar.f5056c.a(a7));
        bundle.putInt("target_api", this.f10067e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.f10068g);
        if (((Boolean) rVar.f5056c.a(F7.C5)).booleanValue()) {
            String str = this.f10069h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle e3 = AbstractC1803xs.e("sdk_env", bundle);
        e3.putBoolean("mf", ((Boolean) AbstractC1058h8.f13713c.s()).booleanValue());
        e3.putBoolean("instant_app", this.f10063a);
        e3.putBoolean("lite", this.f10064b);
        e3.putBoolean("is_privileged_process", this.f10066d);
        bundle.putBundle("sdk_env", e3);
        Bundle e5 = AbstractC1803xs.e("build_meta", e3);
        e5.putString("cl", "697668803");
        e5.putString("rapid_rc", "dev");
        e5.putString("rapid_rollup", "HEAD");
        e3.putBundle("build_meta", e5);
    }
}

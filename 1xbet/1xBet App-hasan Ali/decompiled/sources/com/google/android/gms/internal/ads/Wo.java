package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Wo implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a1 f12087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12088b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12089c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12090d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12091e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12092g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12093h;
    public final boolean i;

    public Wo(Q2.a1 a1Var, String str, boolean z3, String str2, float f, int i, int i5, String str3, boolean z5) {
        m3.v.f("the adSize must not be null", a1Var);
        this.f12087a = a1Var;
        this.f12088b = str;
        this.f12089c = z3;
        this.f12090d = str2;
        this.f12091e = f;
        this.f = i;
        this.f12092g = i5;
        this.f12093h = str3;
        this.i = z5;
    }

    public final void a(Bundle bundle) {
        Q2.a1 a1Var = this.f12087a;
        AbstractC1803xs.Z(bundle, "smart_w", "full", a1Var.f4978o == -1);
        int i = a1Var.f4975l;
        AbstractC1803xs.Z(bundle, "smart_h", "auto", i == -2);
        AbstractC1803xs.d0(bundle, "ene", true, a1Var.f4983t);
        AbstractC1803xs.Z(bundle, "rafmt", "102", a1Var.f4986w);
        AbstractC1803xs.Z(bundle, "rafmt", "103", a1Var.f4987x);
        AbstractC1803xs.Z(bundle, "rafmt", "105", a1Var.f4988y);
        AbstractC1803xs.d0(bundle, "inline_adaptive_slot", true, this.i);
        AbstractC1803xs.d0(bundle, "interscroller_slot", true, a1Var.f4988y);
        AbstractC1803xs.D("format", this.f12088b, bundle);
        AbstractC1803xs.Z(bundle, "fluid", "height", this.f12089c);
        AbstractC1803xs.Z(bundle, "sz", this.f12090d, !TextUtils.isEmpty(r1));
        bundle.putFloat("u_sd", this.f12091e);
        bundle.putInt("sw", this.f);
        bundle.putInt("sh", this.f12092g);
        String str = this.f12093h;
        AbstractC1803xs.Z(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Q2.a1[] a1VarArr = a1Var.f4980q;
        if (a1VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i);
            bundle2.putInt("width", a1Var.f4978o);
            bundle2.putBoolean("is_fluid_height", a1Var.f4982s);
            arrayList.add(bundle2);
        } else {
            for (Q2.a1 a1Var2 : a1VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", a1Var2.f4982s);
                bundle3.putInt("height", a1Var2.f4975l);
                bundle3.putInt("width", a1Var2.f4978o);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        a(((C0572Ch) obj).f8050b);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void o(Object obj) {
        a(((C0572Ch) obj).f8049a);
    }
}

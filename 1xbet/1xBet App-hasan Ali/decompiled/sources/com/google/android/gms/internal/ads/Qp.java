package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Qp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11263a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11264b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11265c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11266d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11267e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11268g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11269h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11270j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11271k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11272l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11273m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11274n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11275o;

    public Qp(boolean z3, boolean z5, String str, boolean z6, boolean z7, boolean z8, String str2, ArrayList arrayList, String str3, String str4, boolean z9, long j5, boolean z10, String str5, int i) {
        String str6 = Build.FINGERPRINT;
        String str7 = Build.MODEL;
        this.f11263a = z3;
        this.f11264b = z5;
        this.f11265c = str;
        this.f11266d = z6;
        this.f11267e = z7;
        this.f = z8;
        this.f11268g = str2;
        this.f11269h = arrayList;
        this.i = str3;
        this.f11270j = str4;
        this.f11271k = z9;
        this.f11272l = j5;
        this.f11273m = z10;
        this.f11274n = str5;
        this.f11275o = i;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8050b;
        bundle.putBoolean("simulator", this.f11266d);
        bundle.putInt("build_api_level", this.f11275o);
        ArrayList<String> arrayList = this.f11269h;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        bundle.putBoolean("cog", this.f11263a);
        bundle.putBoolean("coh", this.f11264b);
        bundle.putString("gl", this.f11265c);
        bundle.putBoolean("simulator", this.f11266d);
        bundle.putBoolean("is_latchsky", this.f11267e);
        bundle.putInt("build_api_level", this.f11275o);
        A7 a7 = F7.Ea;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.f11268g);
        ArrayList<String> arrayList = this.f11269h;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", Build.MODEL);
        Bundle e3 = AbstractC1803xs.e("device", bundle);
        bundle.putBundle("device", e3);
        e3.putString("build", Build.FINGERPRINT);
        e3.putLong("remaining_data_partition_space", this.f11272l);
        Bundle e5 = AbstractC1803xs.e("browser", e3);
        e3.putBundle("browser", e5);
        e5.putBoolean("is_browser_custom_tabs_capable", this.f11271k);
        String str = this.f11270j;
        if (!TextUtils.isEmpty(str)) {
            Bundle e6 = AbstractC1803xs.e("play_store", e3);
            e3.putBundle("play_store", e6);
            e6.putString("package_version", str);
        }
        A7 a72 = F7.Ua;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a72)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f11273m);
        }
        String str2 = this.f11274n;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("v_unity", str2);
        }
        if (((Boolean) d7.a(F7.Oa)).booleanValue()) {
            AbstractC1803xs.d0(bundle, "gotmt_l", true, ((Boolean) d7.a(F7.La)).booleanValue());
            AbstractC1803xs.d0(bundle, "gotmt_i", true, ((Boolean) d7.a(F7.Ka)).booleanValue());
        }
    }
}

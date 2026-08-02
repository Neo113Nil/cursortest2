package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Ap implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final String f7725a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7726b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7727c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7728d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7729e;
    public final String f;

    public Ap(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f7725a = str;
        this.f7726b = num;
        this.f7727c = str2;
        this.f7728d = str3;
        this.f7729e = str4;
        this.f = str5;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8050b;
        AbstractC1803xs.D("pn", this.f7725a, bundle);
        AbstractC1803xs.D("dl", this.f7728d, bundle);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        AbstractC1803xs.D("pn", this.f7725a, bundle);
        Integer num = this.f7726b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        AbstractC1803xs.D("vnm", this.f7727c, bundle);
        AbstractC1803xs.D("dl", this.f7728d, bundle);
        AbstractC1803xs.D("ins_pn", this.f7729e, bundle);
        AbstractC1803xs.D("ini_pn", this.f, bundle);
    }
}

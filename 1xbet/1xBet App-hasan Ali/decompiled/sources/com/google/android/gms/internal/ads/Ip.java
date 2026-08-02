package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Ip implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final String f9623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9624b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9625c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9626d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f9627e;

    public Ip(String str, String str2, String str3, String str4, Long l5) {
        this.f9623a = str;
        this.f9624b = str2;
        this.f9625c = str3;
        this.f9626d = str4;
        this.f9627e = l5;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        AbstractC1803xs.D("fbs_aeid", this.f9625c, ((C0572Ch) obj).f8050b);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        AbstractC1803xs.D("gmp_app_id", this.f9623a, bundle);
        AbstractC1803xs.D("fbs_aiid", this.f9624b, bundle);
        AbstractC1803xs.D("fbs_aeid", this.f9625c, bundle);
        AbstractC1803xs.D("apm_id_origin", this.f9626d, bundle);
        Long l5 = this.f9627e;
        if (l5 != null) {
            bundle.putLong("sai_timeout", l5.longValue());
        }
    }
}

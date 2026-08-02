package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614tj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15710a;

    /* renamed from: b, reason: collision with root package name */
    public final C0709Wb f15711b;

    public /* synthetic */ C1614tj(C0709Wb c0709Wb, int i) {
        this.f15710a = i;
        this.f15711b = c0709Wb;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15710a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f15711b.f12040l;
                AbstractC1400ot.D(jSONObject);
                return jSONObject;
            default:
                Kk kk = (Kk) this.f15711b.f12041m;
                AbstractC1400ot.D(kk);
                return kk;
        }
    }
}

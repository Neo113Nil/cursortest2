package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791xg implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16314a;

    /* renamed from: b, reason: collision with root package name */
    public final C1119ih f16315b;

    public /* synthetic */ C1791xg(C1119ih c1119ih, int i) {
        this.f16314a = i;
        this.f16315b = c1119ih;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f16314a) {
            case 0:
                try {
                    return new JSONObject(this.f16315b.a().f10537z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new Ij(this.f16315b.a());
        }
    }
}

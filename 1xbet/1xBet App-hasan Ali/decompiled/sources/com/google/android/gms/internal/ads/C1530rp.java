package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530rp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15383a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15384b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15385c;

    public /* synthetic */ C1530rp(int i, Object obj, Object obj2) {
        this.f15383a = i;
        this.f15384b = obj;
        this.f15385c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        switch (this.f15383a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                JSONObject jSONObject = (JSONObject) this.f15385c;
                if (jSONObject != null) {
                    c0572Ch.f8050b.putString("fwd_common_cld", jSONObject.toString());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f15383a) {
            case 0:
                Bundle bundle = ((C0572Ch) obj).f8049a;
                JSONObject jSONObject = (JSONObject) this.f15384b;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f15385c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((C0572Ch) obj).f8049a;
                bundle2.putString("rtb", (String) this.f15384b);
                Bundle bundle3 = (Bundle) this.f15385c;
                if (!bundle3.isEmpty()) {
                    bundle2.putBundle("adapter_initialization_status", bundle3);
                    break;
                }
                break;
            default:
                try {
                    JSONObject e02 = N4.b.e0("pii", (JSONObject) obj);
                    e02.put("doritos", (String) this.f15384b);
                    e02.put("doritos_v2", (String) this.f15385c);
                    break;
                } catch (JSONException unused) {
                    T2.G.m("Failed putting doritos string.");
                }
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}

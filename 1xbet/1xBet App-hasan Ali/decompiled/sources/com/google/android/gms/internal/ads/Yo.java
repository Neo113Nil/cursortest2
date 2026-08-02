package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Yo implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12368a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f12369b;

    public /* synthetic */ Yo(int i, Bundle bundle) {
        this.f12368a = i;
        this.f12369b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        switch (this.f12368a) {
            case 2:
                C0572Ch c0572Ch = (C0572Ch) obj;
                Bundle bundle = this.f12369b;
                if (bundle != null) {
                    c0572Ch.f8050b.putAll(bundle);
                    break;
                }
                break;
            case 3:
                C0572Ch c0572Ch2 = (C0572Ch) obj;
                Bundle bundle2 = this.f12369b;
                if (!bundle2.isEmpty()) {
                    c0572Ch2.f8050b.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        switch (this.f12368a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                Bundle bundle = this.f12369b;
                if (!bundle.isEmpty()) {
                    c0572Ch.f8049a.putBundle("installed_adapter_data", bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((C0572Ch) obj).f8049a;
                Bundle e3 = AbstractC1803xs.e("device", bundle2);
                e3.putBundle("android_mem_info", this.f12369b);
                bundle2.putBundle("device", e3);
                break;
            case 2:
                C0572Ch c0572Ch2 = (C0572Ch) obj;
                Bundle bundle3 = this.f12369b;
                if (bundle3 != null) {
                    c0572Ch2.f8049a.putAll(bundle3);
                    break;
                }
                break;
            case 3:
                C0572Ch c0572Ch3 = (C0572Ch) obj;
                Bundle bundle4 = this.f12369b;
                if (!bundle4.isEmpty()) {
                    c0572Ch3.f8049a.putBundle("shared_pref", bundle4);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle5 = this.f12369b;
                if (bundle5 != null) {
                    try {
                        N4.b.e0("play_store", N4.b.e0("device", jSONObject)).put("parental_controls", C0379q.f.f5048a.f(bundle5));
                        break;
                    } catch (JSONException unused) {
                        T2.G.m("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}

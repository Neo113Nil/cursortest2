package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class To implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11689a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11690b;

    public /* synthetic */ To(String str, int i) {
        this.f11689a = i;
        this.f11690b = str;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        int i = this.f11689a;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f11689a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                String str = this.f11690b;
                if (str != null) {
                    c0572Ch.f8049a.putString("arek", str);
                    break;
                }
                break;
            case 1:
                ((C0572Ch) obj).f8049a.putString("ms", this.f11690b);
                break;
            case 2:
                AbstractC1803xs.D("key_schema", this.f11690b, ((C0572Ch) obj).f8049a);
                break;
            case 3:
                AbstractC1803xs.D("omid_v", this.f11690b, ((C0572Ch) obj).f8049a);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.f11690b);
                    break;
                } catch (JSONException e3) {
                    T2.G.n("Failed putting Ad ID.", e3);
                    return;
                }
            default:
                String str2 = this.f11690b;
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        N4.b.e0("pii", jSONObject).put("adsid", str2);
                        break;
                    }
                } catch (JSONException e5) {
                    U2.j.j("Failed putting trustless token.", e5);
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

    private final /* synthetic */ void d(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    private final /* synthetic */ void f(Object obj) {
    }
}

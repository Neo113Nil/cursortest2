package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993fp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13504b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13505c;

    public /* synthetic */ C0993fp(int i, int i5, String str) {
        this.f13503a = i5;
        this.f13504b = str;
        this.f13505c = i;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        switch (this.f13503a) {
            case 1:
                ((C0572Ch) obj).f8050b.putString("request_id", this.f13504b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        int i;
        int i5;
        switch (this.f13503a) {
            case 0:
                Bundle bundle = ((C0572Ch) obj).f8049a;
                String str = this.f13504b;
                if (!TextUtils.isEmpty(str) && (i = this.f13505c) != -1) {
                    Bundle e3 = AbstractC1803xs.e("pii", bundle);
                    bundle.putBundle("pii", e3);
                    e3.putString("pvid", str);
                    e3.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((C0572Ch) obj).f8049a;
                bundle2.putString("request_id", this.f13504b);
                if (this.f13505c == 2) {
                    bundle2.putInt("sod", 1);
                    break;
                }
                break;
            case 2:
                C0572Ch c0572Ch = (C0572Ch) obj;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X9)).booleanValue()) {
                    String str2 = this.f13504b;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    Bundle bundle3 = c0572Ch.f8049a;
                    if (!isEmpty) {
                        bundle3.putString("topics", str2);
                    }
                    int i6 = this.f13505c;
                    if (i6 != -1) {
                        bundle3.putInt("atps", i6);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f13504b;
                if (!TextUtils.isEmpty(str3) && (i5 = this.f13505c) != -1) {
                    try {
                        JSONObject e02 = N4.b.e0("pii", jSONObject);
                        e02.put("pvid", str3);
                        e02.put("pvid_s", i5);
                        break;
                    } catch (JSONException e5) {
                        T2.G.n("Failed putting gms core app set ID info.", e5);
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

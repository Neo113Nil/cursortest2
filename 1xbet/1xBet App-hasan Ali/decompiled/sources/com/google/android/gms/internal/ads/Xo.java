package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Xo implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12245a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12246b;

    public /* synthetic */ Xo(int i, ArrayList arrayList) {
        this.f12245a = i;
        this.f12246b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        switch (this.f12245a) {
            case 0:
                ((C0572Ch) obj).f8050b.putStringArrayList("ad_types", this.f12246b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f12245a) {
            case 0:
                ((C0572Ch) obj).f8049a.putStringArrayList("ad_types", this.f12246b);
                break;
            case 1:
                AbstractC1803xs.N(((C0572Ch) obj).f8049a, "android_permissions", this.f12246b);
                break;
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", this.f12246b));
                    break;
                } catch (JSONException unused) {
                    T2.G.m("Failed putting experiment ids.");
                }
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}

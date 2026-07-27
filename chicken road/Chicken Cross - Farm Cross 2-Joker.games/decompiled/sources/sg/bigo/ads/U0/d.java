package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12569a;

    public d(JSONObject jSONObject) {
        this.f12569a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }
}

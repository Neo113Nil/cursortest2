package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0557Ba implements InterfaceC1311mu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7815c;

    public /* synthetic */ C0557Ba(int i, Object obj, Object obj2) {
        this.f7813a = i;
        this.f7814b = obj;
        this.f7815c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
    public final Object apply(Object obj) {
        switch (this.f7813a) {
            case 0:
                InterfaceC1560sa interfaceC1560sa = (InterfaceC1560sa) obj;
                interfaceC1560sa.i((String) this.f7814b, (InterfaceC1821y9) this.f7815c);
                return interfaceC1560sa;
            default:
                List list = (List) obj;
                C1391ok c1391ok = (C1391ok) this.f7814b;
                c1391ok.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) this.f7815c;
                String optString = jSONObject.optString("text");
                Integer d5 = C1391ok.d("bg_color", jSONObject);
                Integer d6 = C1391ok.d("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                return new BinderC1775x8(optString, list, d5, d6, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("animation_ms", 1000) + jSONObject.optInt("presentation_ms", 4000), c1391ok.f14835h.f7774o);
        }
    }
}

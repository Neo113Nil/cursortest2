package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1219 implements InterfaceC0823 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f3422;

    public C1219(C1161 c1161) {
        this.f3422 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0823
    /* renamed from: ﾒ */
    public final void mo5675(String str) {
        C1161 c1161 = this.f3422;
        c1161.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c1161.f3327 = new JSONObject(str);
        } catch (JSONException unused) {
        }
    }
}

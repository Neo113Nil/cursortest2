package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.γ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0475 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0422 f919;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f920;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f921;

    public C0475(C0422 c0422, String str, JSONObject jSONObject) {
        this.f919 = c0422;
        this.f921 = str;
        this.f920 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0422 c0422 = this.f919;
        String str = this.f921;
        JSONObject jSONObject = this.f920;
        c0422.getClass();
        Iterator it = new HashSet(c0422.f563).iterator();
        while (it.hasNext()) {
            JSONObject mo5674 = ((InterfaceC1014) it.next()).mo5674(str, jSONObject);
            if (mo5674 != null) {
                AbstractC0647.m5608(jSONObject, mo5674, false);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = AbstractC0739.f2066;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = AbstractC0739.f2020;
            jSONObject2.put(str3, jSONObject.remove(str3));
        } catch (JSONException unused) {
        }
        c0422.f564.m5832(str, jSONObject, jSONObject2, new C0423(c0422, str));
    }
}

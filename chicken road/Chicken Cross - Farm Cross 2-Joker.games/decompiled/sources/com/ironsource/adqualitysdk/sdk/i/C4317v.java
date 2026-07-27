package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4317v extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C4318w f289;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Object f290;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f291;

    public C4317v(C4318w c4318w, String str, Object obj) {
        this.f289 = c4318w;
        this.f291 = str;
        this.f290 = obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        WeakReference weakReference;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0739.f2049, this.f289.f294);
            jSONObject.put(AbstractC0739.f2048, StringFog.decrypt("9mw/\n", "gRpcx8qCZqk=\n"));
            jSONObject.put(AbstractC0739.f2060, this.f291);
            if (this.f289.f293) {
                jSONObject.put(AbstractC0739.f2059, true);
            }
        } catch (JSONException e) {
            AbstractC0544.m5502(StringFog.decrypt("l1Zbo+vmTxmke1ib5u9dKg==\n", "wDM59YKDOFg=\n"), StringFog.decrypt("diG4vxQPIf5WMr65CEhi7186qbtGRTHjXWnq\n", "M1PK0GYvQow=\n") + e.getLocalizedMessage());
        }
        C4318w c4318w = this.f289;
        AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y = c4318w.f292.f296;
        WebView webView = c4318w.f295;
        K k = abstractViewOnLayoutChangeListenerC4320y.f301;
        abstractViewOnLayoutChangeListenerC4320y.mo5357(jSONObject, webView, (k == null || (weakReference = k.f125.f102) == null) ? null : (C) weakReference.get(), this.f290);
    }
}

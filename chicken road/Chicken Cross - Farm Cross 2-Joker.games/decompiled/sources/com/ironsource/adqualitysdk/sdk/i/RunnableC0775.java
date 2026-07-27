package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class RunnableC0775 implements Runnable {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0770 f2230;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2231;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2232;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2233;

    public RunnableC0775(AbstractC0770 abstractC0770, Object obj, ArrayList arrayList, JSONObject jSONObject) {
        this.f2230 = abstractC0770;
        this.f2233 = obj;
        this.f2232 = arrayList;
        this.f2231 = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2230.m5662(this.f2233, this.f2232);
        AbstractC0770.m5659(this.f2230, this.f2231, (WebView) this.f2232.get(0), this.f2233);
    }
}

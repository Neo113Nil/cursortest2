package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ȉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0377 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f479;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f480;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f481;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f482;

    public C0377(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f482 = interfaceC1005;
        this.f481 = jSONObject;
        this.f480 = view;
        this.f479 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f482.mo5349(this.f481, this.f480, this.f479);
    }
}

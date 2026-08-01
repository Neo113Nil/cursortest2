package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1252 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3543;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3544;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3545;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f3546;

    public C1252(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f3546 = interfaceC1005;
        this.f3545 = jSONObject;
        this.f3544 = view;
        this.f3543 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f3546.mo5359(this.f3545, this.f3544, this.f3543);
    }
}

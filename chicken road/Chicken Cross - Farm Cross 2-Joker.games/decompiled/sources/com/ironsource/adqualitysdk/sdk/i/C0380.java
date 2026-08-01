package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ȋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0380 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f485;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f486;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f487;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f488;

    public C0380(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f488 = interfaceC1005;
        this.f487 = jSONObject;
        this.f486 = view;
        this.f485 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f488.mo5351(this.f487, this.f486, this.f485);
    }
}

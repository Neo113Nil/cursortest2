package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0394 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f506;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f507;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f508;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f509;

    public C0394(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f509 = interfaceC1005;
        this.f508 = jSONObject;
        this.f507 = view;
        this.f506 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f509.mo5354(this.f508, this.f507, this.f506);
    }
}

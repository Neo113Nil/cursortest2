package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1231 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3505;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C4319x f3506;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3507;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3508;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f3509;

    public C1231(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, C4319x c4319x, KeyEvent.Callback callback) {
        this.f3509 = interfaceC1005;
        this.f3508 = jSONObject;
        this.f3507 = view;
        this.f3506 = c4319x;
        this.f3505 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f3509.mo5358(this.f3508, this.f3507, this.f3506, this.f3505);
    }
}

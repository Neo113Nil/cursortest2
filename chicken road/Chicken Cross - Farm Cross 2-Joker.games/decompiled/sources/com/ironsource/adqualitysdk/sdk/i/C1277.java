package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1277 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3657;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3658;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3659;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f3660;

    public C1277(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f3660 = interfaceC1005;
        this.f3659 = jSONObject;
        this.f3658 = view;
        this.f3657 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f3660.mo5347(this.f3659, this.f3658, this.f3657);
    }
}

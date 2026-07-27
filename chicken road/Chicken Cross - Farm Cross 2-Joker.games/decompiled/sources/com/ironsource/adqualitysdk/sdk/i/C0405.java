package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0405 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f521;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C f522;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f523;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f524;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f525;

    public C0405(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, C c, KeyEvent.Callback callback) {
        this.f525 = interfaceC1005;
        this.f524 = jSONObject;
        this.f523 = view;
        this.f522 = c;
        this.f521 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f525.mo5357(this.f524, this.f523, this.f522, this.f521);
    }
}

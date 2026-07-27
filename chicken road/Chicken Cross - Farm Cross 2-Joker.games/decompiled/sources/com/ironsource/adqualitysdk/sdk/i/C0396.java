package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɪ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0396 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f510;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C f511;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f512;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f513;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1005 f514;

    public C0396(InterfaceC1005 interfaceC1005, JSONObject jSONObject, View view, C c, KeyEvent.Callback callback) {
        this.f514 = interfaceC1005;
        this.f513 = jSONObject;
        this.f512 = view;
        this.f511 = c;
        this.f510 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f514.mo5353(this.f513, this.f512, this.f511, this.f510);
    }
}

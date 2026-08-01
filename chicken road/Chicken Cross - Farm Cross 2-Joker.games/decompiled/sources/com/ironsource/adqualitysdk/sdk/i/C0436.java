package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʻ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0436 implements X {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0447 f593;

    public C0436(C0447 c0447) {
        this.f593 = c0447;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.X
    /* renamed from: ﾇ */
    public final void mo5332(View view) {
        view.removeOnLayoutChangeListener(this.f593.f749);
        this.f593.f746.remove(view);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.X
    /* renamed from: ﾒ */
    public final void mo5333(View view) {
        view.addOnLayoutChangeListener(this.f593.f749);
        C0447 c0447 = this.f593;
        c0447.f746.put(view, c0447.f749);
    }
}

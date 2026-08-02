package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class FP implements InterfaceC0866Wv {
    public final /* synthetic */ C01333r A00;

    public FP(C01333r c01333r) {
        this.A00 = c01333r;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0866Wv
    public final void AEQ(String str) {
        Handler handler;
        handler = this.A00.A0G;
        handler.postDelayed(new RunnableC1107ca(this), 2000L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0866Wv
    public final void AER(String str) {
        this.A00.A0I(UZ.A0c);
    }
}

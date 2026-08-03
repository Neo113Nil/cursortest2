package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class CS extends android.content.BroadcastReceiver {
    public final /* synthetic */ com.facebook.ads.redexgen.core.CX A00;

    public CS(com.facebook.ads.redexgen.core.CX cx) {
        this.A00 = cx;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}

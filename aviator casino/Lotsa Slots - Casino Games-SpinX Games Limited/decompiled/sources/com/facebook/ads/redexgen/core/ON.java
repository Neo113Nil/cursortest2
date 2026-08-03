package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ON implements android.content.ServiceConnection {
    public final /* synthetic */ com.facebook.ads.redexgen.core.OO A00;

    public ON(com.facebook.ads.redexgen.core.OO oo) {
        this.A00 = oo;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.os.Handler handler;
        com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc;
        com.facebook.ads.redexgen.core.C1632ge c1632ge;
        android.os.Messenger messenger;
        handler = this.A00.A04;
        abstractRunnableC1123Wc = this.A00.A08;
        handler.removeCallbacks(abstractRunnableC1123Wc);
        this.A00.A00 = new android.os.Messenger(iBinder);
        c1632ge = this.A00.A07;
        if (com.facebook.ads.redexgen.core.AbstractC1089Us.A09(c1632ge)) {
            com.facebook.ads.redexgen.core.OO oo = this.A00;
            messenger = this.A00.A00;
            oo.A07(messenger);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.A00.A09();
    }
}

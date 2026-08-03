package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class G8 implements android.hardware.display.DisplayManager.DisplayListener {
    public final android.hardware.display.DisplayManager A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.GA A01;

    public G8(com.facebook.ads.redexgen.core.GA ga, android.hardware.display.DisplayManager displayManager) {
        this.A01 = ga;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

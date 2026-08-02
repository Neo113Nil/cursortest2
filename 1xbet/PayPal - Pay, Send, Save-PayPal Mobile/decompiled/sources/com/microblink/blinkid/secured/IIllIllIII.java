package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIllIllIII implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.surface.IllIIIllII llIIlIlIIl;

    public IIllIllIII(com.microblink.blinkid.view.surface.IllIIIllII illIIIllII) {
        this.llIIlIlIIl = illIIIllII;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.llIIlIlIIl.requestLayout();
    }
}

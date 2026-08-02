package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llllIIIllI extends java.lang.Exception {
    public llllIIIllI(java.lang.Exception exc) {
        super(exc);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return (java.io.IOException) super.getCause();
    }
}

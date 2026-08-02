package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIllIlIll implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.secured.llIIllllII IlIllIlIIl;
    public final /* synthetic */ android.content.Context llIIlIlIIl;

    public llIllIlIll(com.microblink.blinkid.secured.llIIllllII lliillllii, android.content.Context context) {
        this.IlIllIlIIl = lliillllii;
        this.llIIlIlIIl = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.IlIllIlIIl.llIIlIlIIl(this.llIIlIlIIl, true);
        } catch (java.lang.Exception unused) {
        }
    }
}

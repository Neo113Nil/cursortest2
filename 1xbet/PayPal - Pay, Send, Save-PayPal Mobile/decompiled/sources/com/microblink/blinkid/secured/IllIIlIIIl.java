package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllIIlIIIl implements java.lang.Runnable {
    public final /* synthetic */ java.lang.String IlIllIlIIl;
    public final /* synthetic */ android.content.Context llIIlIlIIl;

    public IllIIlIIIl(com.microblink.blinkid.secured.IlIIllIIII ilIIllIIII, android.content.Context context, java.lang.String str) {
        this.llIIlIlIIl = context;
        this.IlIllIlIIl = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new java.io.File(this.llIIlIlIIl.getFilesDir(), "microblink_intent_data/".concat(java.lang.String.valueOf(this.IlIllIlIIl))).delete();
    }
}

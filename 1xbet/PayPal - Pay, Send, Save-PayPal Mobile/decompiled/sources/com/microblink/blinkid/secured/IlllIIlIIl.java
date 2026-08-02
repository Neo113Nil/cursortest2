package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlllIIlIIl implements java.lang.Runnable {
    public final /* synthetic */ boolean IlIllIlIIl;
    public final /* synthetic */ java.lang.String IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIllIIII llIIIlllll;
    public final /* synthetic */ android.content.Context llIIlIlIIl;

    public IlllIIlIIl(com.microblink.blinkid.secured.IlIIllIIII ilIIllIIII, android.content.Context context, boolean z, java.lang.String str) {
        this.llIIIlllll = ilIIllIIII;
        this.llIIlIlIIl = context;
        this.IlIllIlIIl = z;
        this.IllIIIllII = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File file = new java.io.File(this.llIIlIlIIl.getFilesDir(), "microblink_intent_data");
        if (!this.IlIllIlIIl) {
            java.io.File file2 = new java.io.File(file, this.IllIIIllII);
            if (file2.exists()) {
                file2.delete();
                return;
            }
            return;
        }
        for (java.io.File file3 : file.listFiles()) {
            if (!this.llIIIlllll.IlIllIlIIl.containsKey(file3.getName())) {
                file3.delete();
            }
        }
    }
}

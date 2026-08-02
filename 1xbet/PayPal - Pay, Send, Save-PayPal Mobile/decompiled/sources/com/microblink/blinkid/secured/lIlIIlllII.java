package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIlllII implements java.lang.Runnable {
    public final /* synthetic */ java.lang.String IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.intent.BaseIntentTransferable IllIIIllII;
    public final /* synthetic */ android.content.Context llIIlIlIIl;

    public lIlIIlllII(android.content.Context context, java.lang.String str, com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable) {
        this.llIIlIlIIl = context;
        this.IlIllIlIIl = str;
        this.IllIIIllII = baseIntentTransferable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File file = new java.io.File(this.llIIlIlIIl.getFilesDir(), "microblink_intent_data");
        file.mkdirs();
        try {
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(file, this.IlIllIlIIl)));
            android.os.Parcel obtain = android.os.Parcel.obtain();
            this.IllIIIllII.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            bufferedOutputStream.write(marshall);
            bufferedOutputStream.close();
        } catch (java.io.IOException unused) {
            com.microblink.blinkid.util.Log.w(this, "Error while storing intent transferable data.", new java.lang.Object[0]);
        }
    }
}

package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IIlIlIIlII extends android.os.AsyncTask {
    public java.lang.Exception IlIllIlIIl;
    public final com.microblink.blinkid.secured.IIIlllllll IllIIIIllI;
    public final com.microblink.blinkid.secured.IlIIIIIllI IllIIIllII;
    public final com.microblink.blinkid.secured.IIIIIIlIII llIIIlllll;
    public final com.microblink.blinkid.secured.IIIlIIIllI llIIlIlIIl;

    public IIlIlIIlII(com.microblink.blinkid.secured.lIIIIllllI liiiilllli, com.microblink.blinkid.secured.IlIIIIIllI ilIIIIIllI, com.microblink.blinkid.secured.IIIlIIIllI iIIlIIIllI, com.microblink.blinkid.secured.IIIIIIlIII iIIIIIlIII) {
        this.IllIIIllII = ilIIIIIllI;
        this.llIIlIlIIl = iIIlIIIllI;
        this.llIIIlllll = iIIIIIlIII;
        this.IllIIIIllI = new com.microblink.blinkid.secured.IIIlllllll(iIIIIIlIII, liiiilllli);
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] objArr) {
        if (this.llIIIlllll.IlIllIlIIl.isEmpty()) {
            return java.lang.Boolean.FALSE;
        }
        java.util.Iterator it = this.llIIIlllll.IlIllIlIIl.iterator();
        while (it.hasNext()) {
            if (!llIIlIlIIl((com.microblink.blinkid.secured.lIIIIIlIlI) it.next())) {
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }

    public abstract boolean llIIlIlIIl(com.microblink.blinkid.secured.lIIIIIlIlI liiiiilili);

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.llIIlIlIIl != null) {
            com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IIIlIIIllI.class, "Upload of image failed", this.IlIllIlIIl.getMessage());
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (this.llIIlIlIIl != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Image upload done, successfully uploaded:");
            sb.append(bool.toString());
            com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IIIlIIIllI.class, sb.toString(), new java.lang.Object[0]);
        }
    }
}

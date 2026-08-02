package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIllllIlll implements com.microblink.blinkid.view.OnSizeChangedListener {
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.quadview.llIIlIlIIl llIIlIlIIl;

    public lIllllIlll(com.microblink.blinkid.view.viewfinder.quadview.llIIlIlIIl lliililiil) {
        this.llIIlIlIIl = lliililiil;
    }

    @Override // com.microblink.blinkid.view.OnSizeChangedListener
    public final void onSizeChanged(int i, int i2) {
        if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.llIIlIlIIl.IllIIIIllI)) {
            this.llIIlIlIIl.IlIllIlIIl = i2 / i;
        } else {
            this.llIIlIlIIl.IlIllIlIIl = i / i2;
        }
        com.microblink.blinkid.view.viewfinder.quadview.llIIlIlIIl lliililiil = this.llIIlIlIIl;
        com.microblink.blinkid.util.Log.i(lliililiil, "Card quad view aspect ratio: {}", java.lang.Double.valueOf(lliililiil.IlIllIlIIl));
        double[] dArr = this.llIIlIlIIl.llIIIlllll;
        double d = dArr[0];
        com.microblink.blinkid.view.viewfinder.quadview.llIIlIlIIl lliililiil2 = this.llIIlIlIIl;
        double d2 = lliililiil2.IlIllIlIIl;
        dArr[1] = 1.0d - (((1.0d - d) * 0.63060747663d) / d2);
        double[] dArr2 = lliililiil2.IllIIIllII;
        dArr2[0] = 1.0d - (((1.0d - dArr2[1]) * d2) * 0.63060747663d);
        this.llIIlIlIIl.llIIlIlIIl();
    }
}

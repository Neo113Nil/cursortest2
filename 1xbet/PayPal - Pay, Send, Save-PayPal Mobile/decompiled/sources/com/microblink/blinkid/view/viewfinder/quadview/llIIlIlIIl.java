package com.microblink.blinkid.view.viewfinder.quadview;

/* loaded from: classes10.dex */
public final class llIIlIlIIl extends com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager implements com.microblink.blinkid.hardware.orientation.OrientationChangeListener {
    public final android.content.Context IllIIIIllI;
    public final double[] llIIIlllll;
    public double IlIllIlIIl = 1.0d;
    public final double[] IllIIIllII = {0.4d, 0.4d};

    public llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        double[] dArr = {0.1d, 0.1d};
        this.llIIIlllll = dArr;
        android.content.Context context = recognizerRunnerView.getContext();
        this.IllIIIIllI = context;
        int hostScreenOrientation = recognizerRunnerView.getHostScreenOrientation();
        com.microblink.blinkid.secured.lIIlllIlll liilllilll = new com.microblink.blinkid.secured.lIIlllIlll(context, new com.microblink.blinkid.secured.IlllllIIll(new com.microblink.blinkid.geometry.quadTransform.IdQuadTransformer(0.0f, hostScreenOrientation != 0 ? hostScreenOrientation != 1 ? hostScreenOrientation != 8 ? hostScreenOrientation != 9 ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT), context), dArr[0], dArr[1], hostScreenOrientation);
        this.llIIlIlIIl = liilllilll;
        liilllilll.setMovable(true);
        this.llIIlIlIIl.setOnSizeChangedListener(new com.microblink.blinkid.secured.lIllllIlll(this));
        recognizerRunnerView.addOrientationChangeListener(this);
    }

    public final void llIIlIlIIl() {
        com.microblink.blinkid.hardware.orientation.Orientation currentOrientation = ((com.microblink.blinkid.secured.IlllllIIll) this.llIIlIlIIl.getQuadDrawer()).llIIlIlIIl.getCurrentOrientation();
        if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(this.IllIIIIllI)) {
            if (currentOrientation.isVertical()) {
                com.microblink.blinkid.secured.lIIlllIlll liilllilll = this.llIIlIlIIl;
                double[] dArr = this.llIIIlllll;
                liilllilll.llIIlIlIIl(dArr[0], dArr[1]);
                return;
            } else {
                com.microblink.blinkid.secured.lIIlllIlll liilllilll2 = this.llIIlIlIIl;
                double[] dArr2 = this.IllIIIllII;
                liilllilll2.llIIlIlIIl(dArr2[0], dArr2[1]);
                return;
            }
        }
        if (currentOrientation.isVertical()) {
            com.microblink.blinkid.secured.lIIlllIlll liilllilll3 = this.llIIlIlIIl;
            double[] dArr3 = this.llIIIlllll;
            liilllilll3.llIIlIlIIl(dArr3[1], dArr3[0]);
        } else {
            com.microblink.blinkid.secured.lIIlllIlll liilllilll4 = this.llIIlIlIIl;
            double[] dArr4 = this.IllIIIllII;
            liilllilll4.llIIlIlIIl(dArr4[1], dArr4[0]);
        }
    }

    @Override // com.microblink.blinkid.hardware.orientation.OrientationChangeListener
    public final void onOrientationChange(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        ((com.microblink.blinkid.secured.IlllllIIll) this.llIIlIlIIl.getQuadDrawer()).llIIlIlIIl.setOrientation(orientation);
        llIIlIlIIl();
    }

    @Override // com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager
    public final void setInitialHostActivityOrientation(int i) {
        super.setInitialHostActivityOrientation(i);
        ((com.microblink.blinkid.secured.IlllllIIll) this.llIIlIlIIl.getQuadDrawer()).llIIlIlIIl.setOrientation(i != 0 ? i != 1 ? i != 8 ? i != 9 ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT);
    }
}

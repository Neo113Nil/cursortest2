package com.microblink.blinkid.view.viewfinder.quadview;

/* loaded from: classes10.dex */
public class QuadViewManagerFactory {
    public static com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager createDocumentDetectionQuadViewManager(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, int i) {
        com.microblink.blinkid.secured.lIIlllIlll liilllilll = new com.microblink.blinkid.secured.lIIlllIlll(recognizerRunnerView.getContext(), new com.microblink.blinkid.secured.IIIlIIIIll(), 0.5d, 0.5d, recognizerRunnerView.getHostScreenOrientation());
        liilllilll.setMovable(true);
        liilllilll.setAnimationDuration(200L);
        liilllilll.setDefaultQuadColor(android.graphics.Color.argb(0, android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i)));
        liilllilll.setDetectedQuadColor(i);
        liilllilll.lIIIIIlIlI = true;
        recognizerRunnerView.addChildView(liilllilll, false, 0);
        return new com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager(liilllilll);
    }

    public static com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager createQuadViewFromPreset(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset quadViewPreset) {
        android.content.Context context = recognizerRunnerView.getContext();
        switch (com.microblink.blinkid.secured.lIllIIlllI.llIIlIlIIl[quadViewPreset.ordinal()]) {
            case 1:
                com.microblink.blinkid.secured.lllIIlIIIl llliiliiil = new com.microblink.blinkid.secured.lllIIlIIIl(context);
                llliiliiil.llIIlIlIIl = 0.05f;
                llliiliiil.IlIllIlIIl = 54;
                com.microblink.blinkid.secured.lIIlllIlll liilllilll = new com.microblink.blinkid.secured.lIIlllIlll(context, llliiliiil, 0.25d, 0.25d, recognizerRunnerView.getHostScreenOrientation());
                liilllilll.setMovable(true);
                liilllilll.setAnimationDuration(200L);
                recognizerRunnerView.addChildView(liilllilll, false, 0);
                return new com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager(liilllilll);
            case 2:
                com.microblink.blinkid.secured.lllIIlIIIl llliiliiil2 = new com.microblink.blinkid.secured.lllIIlIIIl(context);
                llliiliiil2.llIIlIlIIl = 0.05f;
                llliiliiil2.IlIllIlIIl = 54;
                com.microblink.blinkid.secured.lIIlllIlll liilllilll2 = new com.microblink.blinkid.secured.lIIlllIlll(context, llliiliiil2, 0.25d, 0.25d, recognizerRunnerView.getHostScreenOrientation());
                liilllilll2.setAnimationDuration(150L);
                recognizerRunnerView.addChildView(liilllilll2, false, 0);
                return new com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager(liilllilll2);
            case 3:
                com.microblink.blinkid.secured.lIIlllIlll liilllilll3 = new com.microblink.blinkid.secured.lIIlllIlll(context, new com.microblink.blinkid.secured.IlIIllIlII(), 0.2d, 0.0d, recognizerRunnerView.getHostScreenOrientation());
                liilllilll3.setMovable(true);
                liilllilll3.setAnimationDuration(200L);
                recognizerRunnerView.addChildView(liilllilll3, false, 0);
                return new com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager(liilllilll3);
            case 4:
                com.microblink.blinkid.secured.lIIlllIlll liilllilll4 = new com.microblink.blinkid.secured.lIIlllIlll(context, new com.microblink.blinkid.secured.IlIIllIlII(), 0.4d, 0.0d, recognizerRunnerView.getHostScreenOrientation());
                liilllilll4.setMovable(true);
                liilllilll4.setAnimationDuration(200L);
                recognizerRunnerView.addChildView(liilllilll4, false, 0);
                return new com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager(liilllilll4);
            case 5:
                com.microblink.blinkid.view.viewfinder.quadview.llIIlIlIIl lliililiil = new com.microblink.blinkid.view.viewfinder.quadview.llIIlIlIIl(recognizerRunnerView);
                lliililiil.llIIlIlIIl.setMovable(false);
                lliililiil.llIIlIlIIl.setAnimationDuration(0L);
                recognizerRunnerView.addChildView(lliililiil.llIIlIlIIl, false, 0);
                return lliililiil;
            case 6:
                return createDocumentDetectionQuadViewManager(recognizerRunnerView, androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_blue));
            default:
                return new com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager();
        }
    }
}

package com.microblink.blinkid.view.viewfinder.quadview;

/* loaded from: classes10.dex */
public class QuadViewManager {
    protected com.microblink.blinkid.secured.lIIlllIlll llIIlIlIIl;

    QuadViewManager(com.microblink.blinkid.secured.lIIlllIlll liilllilll) {
        this.llIIlIlIIl = liilllilll;
    }

    public void animateQuadToDefaultPosition() {
        com.microblink.blinkid.geometry.Quadrilateral quadrilateral;
        com.microblink.blinkid.secured.lIIlllIlll liilllilll = this.llIIlIlIIl;
        com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus = com.microblink.blinkid.view.recognition.DetectionStatus.FAILED;
        if (!liilllilll.lIlllIlIlI || (quadrilateral = liilllilll.IlIllIlllI) == null) {
            return;
        }
        quadrilateral.setMargins(liilllilll.IllIIIIllI, liilllilll.IIlIIIllIl, liilllilll.lIlIIIIlIl, liilllilll.llIIlIIlll, liilllilll.IlIIlllIIl);
        liilllilll.IlIllIlllI.setIsDefaultQuad(true);
        if (liilllilll.llIllIIlll) {
            liilllilll.IlIllIlllI.mirror(liilllilll.IllIIIllII, liilllilll.llIIIlllll, liilllilll.IlIIlllIIl);
        }
        liilllilll.llIIlIlIIl(detectionStatus);
    }

    public void animateQuadToDetectionPosition(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        com.microblink.blinkid.geometry.Quadrilateral quadrilateral;
        if (displayableQuadDetection.getDisplayLocation().isEmpty()) {
            com.microblink.blinkid.secured.lIIlllIlll liilllilll = this.llIIlIlIIl;
            com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus = displayableQuadDetection.getDetectionStatus();
            if (!liilllilll.lIlllIlIlI || (quadrilateral = liilllilll.IlIllIlllI) == null) {
                return;
            }
            quadrilateral.setMargins(liilllilll.IllIIIIllI, liilllilll.IIlIIIllIl, liilllilll.lIlIIIIlIl, liilllilll.llIIlIIlll, liilllilll.IlIIlllIIl);
            liilllilll.IlIllIlllI.setIsDefaultQuad(true);
            if (liilllilll.llIllIIlll) {
                liilllilll.IlIllIlllI.mirror(liilllilll.IllIIIllII, liilllilll.llIIIlllll, liilllilll.IlIIlllIIl);
            }
            liilllilll.llIIlIlIIl(detectionStatus);
            return;
        }
        com.microblink.blinkid.secured.lIIlllIlll liilllilll2 = this.llIIlIlIIl;
        com.microblink.blinkid.geometry.Quadrilateral transformedDisplayLocation = displayableQuadDetection.getTransformedDisplayLocation();
        com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus2 = displayableQuadDetection.getDetectionStatus();
        if (liilllilll2.lIlllIlIlI) {
            com.microblink.blinkid.geometry.Quadrilateral sortedQuad = transformedDisplayLocation.getSortedQuad();
            com.microblink.blinkid.util.Log.i(com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager.class, "Building quad from unit quad {} and view size ({}x{}) in host activity orientation {}.", sortedQuad, java.lang.Integer.valueOf(liilllilll2.IllIIIllII), java.lang.Integer.valueOf(liilllilll2.llIIIlllll), java.lang.Integer.valueOf(liilllilll2.IlIIlllIIl));
            com.microblink.blinkid.geometry.Point upperLeft = sortedQuad.getUpperLeft();
            com.microblink.blinkid.geometry.Point upperRight = sortedQuad.getUpperRight();
            com.microblink.blinkid.geometry.Point lowerLeft = sortedQuad.getLowerLeft();
            com.microblink.blinkid.geometry.Point lowerRight = sortedQuad.getLowerRight();
            int i = liilllilll2.IlIIlllIIl;
            if (i == 9 || i == 8) {
                upperLeft = upperLeft.mirrorXY(1.0f, 1.0f);
                upperRight = upperRight.mirrorXY(1.0f, 1.0f);
                lowerLeft = lowerLeft.mirrorXY(1.0f, 1.0f);
                lowerRight = lowerRight.mirrorXY(1.0f, 1.0f);
            }
            int i2 = liilllilll2.IlIIlllIIl;
            liilllilll2.IlIllIlllI = (i2 == 1 || i2 == 9) ? new com.microblink.blinkid.geometry.Quadrilateral(new com.microblink.blinkid.geometry.Point((1.0f - upperLeft.getY()) * liilllilll2.IllIIIllII, upperLeft.getX() * liilllilll2.llIIIlllll), new com.microblink.blinkid.geometry.Point((1.0f - upperRight.getY()) * liilllilll2.IllIIIllII, upperRight.getX() * liilllilll2.llIIIlllll), new com.microblink.blinkid.geometry.Point((1.0f - lowerLeft.getY()) * liilllilll2.IllIIIllII, lowerLeft.getX() * liilllilll2.llIIIlllll), new com.microblink.blinkid.geometry.Point((1.0f - lowerRight.getY()) * liilllilll2.IllIIIllII, lowerRight.getX() * liilllilll2.llIIIlllll)) : new com.microblink.blinkid.geometry.Quadrilateral(new com.microblink.blinkid.geometry.Point(upperLeft.getX() * liilllilll2.IllIIIllII, upperLeft.getY() * liilllilll2.llIIIlllll), new com.microblink.blinkid.geometry.Point(upperRight.getX() * liilllilll2.IllIIIllII, upperRight.getY() * liilllilll2.llIIIlllll), new com.microblink.blinkid.geometry.Point(lowerLeft.getX() * liilllilll2.IllIIIllII, lowerLeft.getY() * liilllilll2.llIIIlllll), new com.microblink.blinkid.geometry.Point(lowerRight.getX() * liilllilll2.IllIIIllII, lowerRight.getY() * liilllilll2.llIIIlllll));
            liilllilll2.llIIlIlIIl(detectionStatus2);
        }
    }

    public void configurationChanged(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, android.content.res.Configuration configuration) {
        if (recognizerRunnerView.getContext().getResources().getConfiguration().orientation != configuration.orientation) {
            throw new java.lang.IllegalStateException("You must first call changeConfiguration on recognizerView and then on QuadViewManager");
        }
        this.llIIlIlIIl.setHostActivityOrientation(recognizerRunnerView.getHostScreenOrientation());
    }

    public boolean isAnimationInProgress() {
        return this.llIIlIlIIl.llIIlIlIIl();
    }

    public void setAnimationDuration(long j) {
        this.llIIlIlIIl.setAnimationDuration(j);
    }

    public void setAnimationListener(com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener quadViewAnimationListener) {
        this.llIIlIlIIl.setAnimationListener(quadViewAnimationListener);
    }

    public void setInitialHostActivityOrientation(int i) {
        this.llIIlIlIIl.setHostActivityOrientation(i);
    }

    QuadViewManager() {
    }
}

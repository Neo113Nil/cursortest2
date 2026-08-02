package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class DMDSPointParser {
    private static final java.lang.String getHighSpeedVideoSizes = "DMDSPointParser";

    /* renamed from: com.daon.dmds.utils.DMDSPointParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.microblink.blinkid.hardware.orientation.Orientation.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static double calculateDetectionAspectRatio(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        if (dMDSQuadrangle == null) {
            return 0.0d;
        }
        android.graphics.Rect rect = toRect(dMDSQuadrangle);
        int width = rect.width();
        int height = rect.height();
        if (width == 0 && height == 0) {
            return 0.0d;
        }
        return width / height;
    }

    public static boolean documentFillsScanningRegion(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, float f) {
        boolean z = true;
        if (dMDSQuadrangle == null) {
            com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "Detection points are null");
            return true;
        }
        android.graphics.Rect scanningRect = toScanningRect(recognizerRunnerView);
        android.graphics.Rect rect = toRect(dMDSQuadrangle);
        float abs = java.lang.Math.abs(rect.width() / scanningRect.width());
        float abs2 = java.lang.Math.abs(rect.height() / scanningRect.height());
        if (abs < f && abs2 < f) {
            z = false;
        }
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Width: ");
        sb.append(abs);
        sb.append(" > ");
        sb.append(f);
        sb.append(" Height: ");
        sb.append(abs2);
        sb.append(" > ");
        sb.append(f);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(z);
        com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
        return z;
    }

    public static boolean isDetectionValid(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        return !displayableQuadDetection.getDisplayLocation().isEmpty();
    }

    public static com.daon.dmds.models.DMDSQuadrangle parseDetectionPoints(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.geometry.Quadrilateral transformedDisplayLocation = displayableQuadDetection.getTransformedDisplayLocation();
        int width = recognizerRunnerView.getWidth();
        int height = recognizerRunnerView.getHeight();
        float f = width;
        float f2 = height;
        com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = new com.daon.dmds.models.DMDSQuadrangle(new android.graphics.Point((int) (transformedDisplayLocation.getUpperLeft().getX() * f), (int) (transformedDisplayLocation.getUpperLeft().getY() * f2)), new android.graphics.Point((int) (transformedDisplayLocation.getUpperRight().getX() * f), (int) (transformedDisplayLocation.getUpperRight().getY() * f2)), new android.graphics.Point((int) (transformedDisplayLocation.getLowerLeft().getX() * f), (int) (transformedDisplayLocation.getLowerLeft().getY() * f2)), new android.graphics.Point((int) (transformedDisplayLocation.getLowerRight().getX() * f), (int) (transformedDisplayLocation.getLowerRight().getY() * f2)));
        com.microblink.blinkid.hardware.orientation.Orientation mbOrientation = com.daon.dmds.utils.MBUtils.toMbOrientation(com.daon.dmds.utils.DMDSDocumentUtils.getDeviceOrientation(recognizerRunnerView.getContext()));
        if (mbOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT || mbOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
            dMDSQuadrangle = new com.daon.dmds.models.DMDSQuadrangle(new android.graphics.Point((int) (transformedDisplayLocation.getUpperLeft().getX() * f2), (int) (transformedDisplayLocation.getUpperLeft().getY() * f)), new android.graphics.Point((int) (transformedDisplayLocation.getUpperRight().getX() * f2), (int) (transformedDisplayLocation.getUpperRight().getY() * f)), new android.graphics.Point((int) (transformedDisplayLocation.getLowerLeft().getX() * f2), (int) (transformedDisplayLocation.getLowerLeft().getY() * f)), new android.graphics.Point((int) (transformedDisplayLocation.getLowerRight().getX() * f2), (int) (transformedDisplayLocation.getLowerRight().getY() * f)));
            height = width;
            width = height;
        }
        return rotatePoints(mbOrientation, dMDSQuadrangle, width, height);
    }

    public static com.daon.dmds.models.DMDSQuadrangle quadrilateralToDmdsQuadrangle(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        if (displayableQuadDetection == null) {
            return null;
        }
        com.microblink.blinkid.geometry.Quadrilateral transformedDisplayLocation = displayableQuadDetection.getTransformedDisplayLocation();
        com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = new com.daon.dmds.models.DMDSQuadrangle(new com.daon.dmds.models.DMDSPoint(transformedDisplayLocation.getUpperLeft().getX(), transformedDisplayLocation.getUpperLeft().getY()), new com.daon.dmds.models.DMDSPoint(transformedDisplayLocation.getUpperRight().getX(), transformedDisplayLocation.getUpperRight().getY()), new com.daon.dmds.models.DMDSPoint(transformedDisplayLocation.getLowerLeft().getX(), transformedDisplayLocation.getLowerLeft().getY()), new com.daon.dmds.models.DMDSPoint(transformedDisplayLocation.getLowerRight().getX(), transformedDisplayLocation.getLowerRight().getY()));
        com.microblink.blinkid.geometry.Quadrilateral sortedQuad = displayableQuadDetection.getDisplayLocation().getSortedQuad();
        dMDSQuadrangle.setUpperLeft(new android.graphics.Point((int) sortedQuad.getUpperLeft().getX(), (int) sortedQuad.getUpperLeft().getY()));
        dMDSQuadrangle.setUpperRight(new android.graphics.Point((int) sortedQuad.getUpperRight().getX(), (int) sortedQuad.getUpperRight().getY()));
        dMDSQuadrangle.setLowerLeft(new android.graphics.Point((int) sortedQuad.getLowerLeft().getX(), (int) sortedQuad.getLowerLeft().getY()));
        dMDSQuadrangle.setLowerRight(new android.graphics.Point((int) sortedQuad.getLowerRight().getX(), (int) sortedQuad.getLowerRight().getY()));
        return dMDSQuadrangle;
    }

    public static com.daon.dmds.models.DMDSQuadrangle rotatePoints(com.microblink.blinkid.hardware.orientation.Orientation orientation, com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle, int i, int i2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int[] iArr = com.daon.dmds.utils.DMDSPointParser.AnonymousClass1.getHighSpeedVideoFpsRangesFor;
        int i3 = iArr[orientation.ordinal()];
        if (i3 == 1) {
            matrix.setRotate(-90.0f, i, 0.0f);
            matrix.postTranslate(-i, 0.0f);
        } else if (i3 == 2) {
            matrix.setRotate(90.0f, 0.0f, i2);
            matrix.postTranslate(0.0f, -i2);
        } else if (i3 != 3) {
            matrix = null;
        } else {
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, i, i2);
            matrix.setRotate(180.0f, rect.centerX(), rect.centerY());
        }
        if (dMDSQuadrangle != null && matrix != null) {
            float[] fArr = {dMDSQuadrangle.getUpperLeft().x, dMDSQuadrangle.getUpperLeft().y, dMDSQuadrangle.getUpperRight().x, dMDSQuadrangle.getUpperRight().y, dMDSQuadrangle.getLowerRight().x, dMDSQuadrangle.getLowerRight().y, dMDSQuadrangle.getLowerLeft().x, dMDSQuadrangle.getLowerLeft().y};
            matrix.mapPoints(fArr);
            int i4 = iArr[orientation.ordinal()];
            if (i4 != 2 && i4 != 3) {
                dMDSQuadrangle.getUpperLeft().x = (int) fArr[0];
                dMDSQuadrangle.getUpperLeft().y = (int) fArr[1];
                dMDSQuadrangle.getUpperRight().x = (int) fArr[2];
                dMDSQuadrangle.getUpperRight().y = (int) fArr[3];
                dMDSQuadrangle.getLowerRight().x = (int) fArr[4];
                dMDSQuadrangle.getLowerRight().y = (int) fArr[5];
                dMDSQuadrangle.getLowerLeft().x = (int) fArr[6];
                dMDSQuadrangle.getLowerLeft().y = (int) fArr[7];
                return dMDSQuadrangle;
            }
            dMDSQuadrangle.getUpperLeft().x = (int) fArr[4];
            dMDSQuadrangle.getUpperLeft().y = (int) fArr[5];
            dMDSQuadrangle.getUpperRight().x = (int) fArr[6];
            dMDSQuadrangle.getUpperRight().y = (int) fArr[7];
            dMDSQuadrangle.getLowerRight().x = (int) fArr[0];
            dMDSQuadrangle.getLowerRight().y = (int) fArr[1];
            dMDSQuadrangle.getLowerLeft().x = (int) fArr[2];
            dMDSQuadrangle.getLowerLeft().y = (int) fArr[3];
        }
        return dMDSQuadrangle;
    }

    public static void sortPoints(float[] fArr, com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 % 2 == 0) {
                f += fArr[i2];
            } else {
                f2 += fArr[i2];
            }
        }
        float length = f / (fArr.length / 2.0f);
        float length2 = f2 / (fArr.length / 2.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.graphics.Point((int) fArr[0], (int) fArr[1]));
        arrayList.add(new android.graphics.Point((int) fArr[2], (int) fArr[3]));
        arrayList.add(new android.graphics.Point((int) fArr[4], (int) fArr[5]));
        arrayList.add(new android.graphics.Point((int) fArr[6], (int) fArr[7]));
        int size = arrayList.size();
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            android.graphics.Point point = (android.graphics.Point) obj;
            if (point.x >= length) {
                if (point.y >= length2) {
                    dMDSQuadrangle.setLowerRight(point);
                } else {
                    dMDSQuadrangle.setUpperRight(point);
                }
            } else if (point.y >= length2) {
                dMDSQuadrangle.setLowerLeft(point);
            } else {
                dMDSQuadrangle.setUpperLeft(point);
            }
        }
    }

    public static android.graphics.Rect toRect(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = dMDSQuadrangle.getUpperLeft().x;
        rect.top = dMDSQuadrangle.getUpperLeft().y;
        rect.right = dMDSQuadrangle.getLowerRight().x;
        rect.bottom = dMDSQuadrangle.getLowerRight().y;
        return rect;
    }

    public static android.graphics.Rect toScanningRect(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        int width = recognizerRunnerView.getWidth();
        int height = recognizerRunnerView.getHeight();
        try {
            float f = width;
            int round = java.lang.Math.round(recognizerRunnerView.getScanningRegion().getX() * f);
            float f2 = height;
            int round2 = java.lang.Math.round(recognizerRunnerView.getScanningRegion().getY() * f2);
            return new android.graphics.Rect(round, round2, java.lang.Math.round(recognizerRunnerView.getScanningRegion().getWidth() * f) + round, java.lang.Math.round(recognizerRunnerView.getScanningRegion().getHeight() * f2) + round2);
        } catch (java.lang.NullPointerException unused) {
            return new android.graphics.Rect();
        }
    }

    public static com.daon.dmds.models.DMDSQuadrangle rotatePoints(com.microblink.blinkid.hardware.orientation.Orientation orientation, int i, int i2, com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        float f;
        float f2;
        int orientation2Rotation = com.daon.dmds.utils.MBUtils.orientation2Rotation(orientation);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (orientation2Rotation != 0) {
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, i2, i);
            matrix.postRotate(orientation2Rotation, rect.exactCenterX(), rect.exactCenterY());
        }
        if (com.daon.dmds.utils.MBUtils.shouldTranslateImage(orientation)) {
            f = (i2 - i) / 2.0f;
            f2 = (i - i2) / 2.0f;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (f != 0.0f || f2 != 0.0f) {
            float f3 = -i2;
            matrix.postTranslate(f3 / 2.0f, f3 / 4.0f);
        }
        if (dMDSQuadrangle != null) {
            float[] fArr = {dMDSQuadrangle.getUpperLeft().x, dMDSQuadrangle.getUpperLeft().y, dMDSQuadrangle.getUpperRight().x, dMDSQuadrangle.getUpperRight().y, dMDSQuadrangle.getLowerRight().x, dMDSQuadrangle.getLowerRight().y, dMDSQuadrangle.getLowerLeft().x, dMDSQuadrangle.getLowerLeft().y};
            matrix.mapPoints(fArr);
            sortPoints(fArr, dMDSQuadrangle);
        }
        return dMDSQuadrangle;
    }

    public static com.daon.dmds.models.DMDSQuadrangle rotatePoints(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection, com.microblink.blinkid.hardware.orientation.Orientation orientation, int i, int i2) {
        if (displayableQuadDetection == null) {
            android.graphics.Point point = new android.graphics.Point(0, 0);
            return new com.daon.dmds.models.DMDSQuadrangle(point, point, point, point);
        }
        com.microblink.blinkid.geometry.Quadrilateral displayLocation = displayableQuadDetection.getDisplayLocation();
        com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = new com.daon.dmds.models.DMDSQuadrangle(new android.graphics.Point((int) displayLocation.getUpperLeft().getX(), (int) displayLocation.getUpperLeft().getY()), new android.graphics.Point((int) displayLocation.getUpperRight().getX(), (int) displayLocation.getUpperRight().getY()), new android.graphics.Point((int) displayLocation.getLowerLeft().getX(), (int) displayLocation.getLowerLeft().getY()), new android.graphics.Point((int) displayLocation.getLowerRight().getX(), (int) displayLocation.getLowerRight().getY()));
        if (orientation != com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT && orientation != com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
            rotatePoints(orientation, dMDSQuadrangle, i, i2);
        } else {
            rotatePoints(orientation, dMDSQuadrangle, i2, i);
        }
        sortPoints(new float[]{dMDSQuadrangle.getUpperLeft().x, dMDSQuadrangle.getUpperLeft().y, dMDSQuadrangle.getUpperRight().x, dMDSQuadrangle.getUpperRight().y, dMDSQuadrangle.getLowerRight().x, dMDSQuadrangle.getLowerRight().y, dMDSQuadrangle.getLowerLeft().x, dMDSQuadrangle.getLowerLeft().y}, dMDSQuadrangle);
        return dMDSQuadrangle;
    }
}

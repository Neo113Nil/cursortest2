package com.microblink.blinkid.geometry.quadTransform;

/* loaded from: classes10.dex */
public class IdQuadTransformer implements com.microblink.blinkid.geometry.quadTransform.IQuadTransformer {
    final float getHighResolutionOutputSizeshNQ4ISI;
    com.microblink.blinkid.hardware.orientation.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: com.microblink.blinkid.geometry.quadTransform.IdQuadTransformer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.microblink.blinkid.hardware.orientation.Orientation.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public IdQuadTransformer(float f, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = orientation;
    }

    public com.microblink.blinkid.hardware.orientation.Orientation getCurrentOrientation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        if (orientation == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = orientation;
    }

    @Override // com.microblink.blinkid.geometry.quadTransform.IQuadTransformer
    public com.microblink.blinkid.geometry.Quadrilateral transformQuad(com.microblink.blinkid.geometry.Quadrilateral quadrilateral) {
        int i = com.microblink.blinkid.geometry.quadTransform.IdQuadTransformer.AnonymousClass1.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRangesFor.ordinal()];
        if (i == 1) {
            return new com.microblink.blinkid.geometry.Quadrilateral(quadrilateral.getUpperLeft(), quadrilateral.getUpperRight(), quadrilateral.getLowerLeft().operatorPlus(quadrilateral.getUpperLeft().operatorMinus(quadrilateral.getLowerLeft()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)), quadrilateral.getLowerRight().operatorPlus(quadrilateral.getUpperRight().operatorMinus(quadrilateral.getLowerRight()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)));
        }
        if (i == 2) {
            return new com.microblink.blinkid.geometry.Quadrilateral(quadrilateral.getUpperLeft().operatorPlus(quadrilateral.getLowerLeft().operatorMinus(quadrilateral.getUpperLeft()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)), quadrilateral.getUpperRight().operatorPlus(quadrilateral.getLowerRight().operatorMinus(quadrilateral.getUpperRight()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)), quadrilateral.getLowerLeft(), quadrilateral.getLowerRight());
        }
        if (i == 3) {
            return new com.microblink.blinkid.geometry.Quadrilateral(quadrilateral.getUpperLeft().operatorPlus(quadrilateral.getUpperRight().operatorMinus(quadrilateral.getUpperLeft()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)), quadrilateral.getUpperRight(), quadrilateral.getLowerLeft().operatorPlus(quadrilateral.getLowerRight().operatorMinus(quadrilateral.getLowerLeft()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)), quadrilateral.getLowerRight());
        }
        if (i != 4) {
            if (i != 5) {
                return null;
            }
            com.microblink.blinkid.util.Log.e(this, "Illegal orientation set as current orientation!", new java.lang.Object[0]);
            return null;
        }
        return new com.microblink.blinkid.geometry.Quadrilateral(quadrilateral.getUpperLeft(), quadrilateral.getUpperRight().operatorPlus(quadrilateral.getUpperLeft().operatorMinus(quadrilateral.getUpperRight()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)), quadrilateral.getLowerLeft(), quadrilateral.getLowerRight().operatorPlus(quadrilateral.getLowerLeft().operatorMinus(quadrilateral.getLowerRight()).operatorMultiply(this.getHighResolutionOutputSizeshNQ4ISI)));
    }
}

package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Landroid/graphics/ColorSpace;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/ColorSpace;", "getHighSpeedVideoFpsRanges", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ColorSpaceVerificationHelper {
    public static final androidx.compose.ui.graphics.ColorSpaceVerificationHelper INSTANCE = new androidx.compose.ui.graphics.ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.ColorSpace getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        android.graphics.ColorSpace.Rgb rgb;
        android.graphics.ColorSpace highSpeedVideoFpsRangesFor;
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getAces())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getAcescg())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getAdobeRgb())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt2020())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt709())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getCieLab())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getCieXyz())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getDciP3())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getDisplayP3())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getExtendedSrgb())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getLinearExtendedSrgb())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getLinearSrgb())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getNtsc1953())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getProPhotoRgb())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSmpteC())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && (highSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.ColorSpaceVerificationHelperV34.getHighSpeedVideoFpsRangesFor(colorSpace)) != null) {
            return highSpeedVideoFpsRangesFor;
        }
        if (colorSpace instanceof androidx.compose.ui.graphics.colorspace.Rgb) {
            androidx.compose.ui.graphics.colorspace.Rgb rgb2 = (androidx.compose.ui.graphics.colorspace.Rgb) colorSpace;
            float[] xyz$ui_graphics = rgb2.getWhitePoint().toXyz$ui_graphics();
            androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters = rgb2.getTransferParameters();
            android.graphics.ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new android.graphics.ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
            if (transferParameters2 != null) {
                rgb = new android.graphics.ColorSpace.Rgb(colorSpace.getName(), rgb2.getPrimaries(), xyz$ui_graphics, transferParameters2);
            } else {
                java.lang.String name2 = colorSpace.getName();
                float[] primaries = rgb2.getPrimaries();
                final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> oetf = rgb2.getOetf();
                java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, d);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
                final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> eotf = rgb2.getEotf();
                rgb = new android.graphics.ColorSpace.Rgb(name2, primaries, xyz$ui_graphics, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda1
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, d);
                        return highSpeedVideoFpsRanges;
                    }
                }, rgb2.getMinValue(0), rgb2.getMaxValue(0));
            }
            return rgb;
        }
        return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace getHighSpeedVideoFpsRanges(final android.graphics.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.colorspace.Rgb srgb;
        androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint;
        int id = colorSpace.getId();
        if (id == android.graphics.ColorSpace.Named.SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == android.graphics.ColorSpace.Named.ACES.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getAces();
        }
        if (id == android.graphics.ColorSpace.Named.ACESCG.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == android.graphics.ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == android.graphics.ColorSpace.Named.BT2020.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == android.graphics.ColorSpace.Named.BT709.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt709();
        }
        if (id == android.graphics.ColorSpace.Named.CIE_LAB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == android.graphics.ColorSpace.Named.CIE_XYZ.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == android.graphics.ColorSpace.Named.DCI_P3.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == android.graphics.ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == android.graphics.ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == android.graphics.ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == android.graphics.ColorSpace.Named.NTSC_1953.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == android.graphics.ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == android.graphics.ColorSpace.Named.SMPTE_C.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSmpteC();
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.graphics.colorspace.ColorSpace highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.ColorSpaceVerificationHelperV34.getHighResolutionOutputSizeshNQ4ISI(colorSpace.getId());
            if (!kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getUnspecified$ui_graphics())) {
                return highResolutionOutputSizeshNQ4ISI;
            }
        }
        if (colorSpace instanceof android.graphics.ColorSpace.Rgb) {
            android.graphics.ColorSpace.Rgb rgb = (android.graphics.ColorSpace.Rgb) colorSpace;
            android.graphics.ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
            if (rgb.getWhitePoint().length == 3) {
                whitePoint = new androidx.compose.ui.graphics.colorspace.WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]);
            } else {
                whitePoint = new androidx.compose.ui.graphics.colorspace.WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
            }
            srgb = new androidx.compose.ui.graphics.colorspace.Rgb(rgb.getName(), rgb.getPrimaries(), whitePoint, rgb.getTransform(), new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda2
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    double highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.getHighSpeedVideoFpsRangesFor(colorSpace, d);
                    return highSpeedVideoFpsRangesFor;
                }
            }, new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda3
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    double highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.getHighSpeedVideoFpsRanges(colorSpace, d);
                    return highSpeedVideoFpsRanges;
                }
            }, rgb.getMinValue(0), rgb.getMaxValue(0), transferParameters != null ? new androidx.compose.ui.graphics.colorspace.TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgb.getId());
        } else {
            srgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
        }
        return srgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRangesFor(android.graphics.ColorSpace colorSpace, double d) {
        return ((android.graphics.ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighSpeedVideoFpsRanges(android.graphics.ColorSpace colorSpace, double d) {
        return ((android.graphics.ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }
}

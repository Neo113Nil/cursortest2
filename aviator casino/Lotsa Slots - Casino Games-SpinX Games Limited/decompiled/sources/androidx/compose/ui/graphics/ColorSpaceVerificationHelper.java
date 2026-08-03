package androidx.compose.ui.graphics;

/* compiled from: AndroidColorSpace.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelper {
    public static final androidx.compose.ui.graphics.ColorSpaceVerificationHelper INSTANCE = new androidx.compose.ui.graphics.ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        android.graphics.ColorSpace.Rgb rgb;
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
        if (colorSpace instanceof androidx.compose.ui.graphics.colorspace.Rgb) {
            androidx.compose.ui.graphics.colorspace.Rgb rgb2 = (androidx.compose.ui.graphics.colorspace.Rgb) colorSpace;
            float[] xyz$ui_graphics_release = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters = rgb2.getTransferParameters();
            android.graphics.ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new android.graphics.ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
            if (transferParameters2 != null) {
                rgb = new android.graphics.ColorSpace.Rgb(colorSpace.getName(), rgb2.getPrimaries(), xyz$ui_graphics_release, transferParameters2);
            } else {
                java.lang.String name = colorSpace.getName();
                float[] primaries = rgb2.getPrimaries();
                final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> oetf = rgb2.getOetf();
                java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double androidColorSpace$lambda$0;
                        androidColorSpace$lambda$0 = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.androidColorSpace$lambda$0(kotlin.jvm.functions.Function1.this, d);
                        return androidColorSpace$lambda$0;
                    }
                };
                final kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> eotf = rgb2.getEotf();
                rgb = new android.graphics.ColorSpace.Rgb(name, primaries, xyz$ui_graphics_release, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda1
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double androidColorSpace$lambda$1;
                        androidColorSpace$lambda$1 = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.androidColorSpace$lambda$1(kotlin.jvm.functions.Function1.this, d);
                        return androidColorSpace$lambda$1;
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
            }
            return rgb;
        }
        return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(kotlin.jvm.functions.Function1 function1, double d) {
        return ((java.lang.Number) function1.invoke(java.lang.Double.valueOf(d))).doubleValue();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final android.graphics.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.colorspace.Rgb srgb;
        androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint;
        androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint2;
        androidx.compose.ui.graphics.colorspace.TransferParameters transferParameters;
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
        if (colorSpace instanceof android.graphics.ColorSpace.Rgb) {
            android.graphics.ColorSpace.Rgb rgb = (android.graphics.ColorSpace.Rgb) colorSpace;
            android.graphics.ColorSpace.Rgb.TransferParameters transferParameters2 = rgb.getTransferParameters();
            if (rgb.getWhitePoint().length == 3) {
                whitePoint = new androidx.compose.ui.graphics.colorspace.WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]);
            } else {
                whitePoint = new androidx.compose.ui.graphics.colorspace.WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
            }
            androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint3 = whitePoint;
            if (transferParameters2 != null) {
                whitePoint2 = whitePoint3;
                transferParameters = new androidx.compose.ui.graphics.colorspace.TransferParameters(transferParameters2.g, transferParameters2.a, transferParameters2.b, transferParameters2.c, transferParameters2.d, transferParameters2.e, transferParameters2.f);
            } else {
                whitePoint2 = whitePoint3;
                transferParameters = null;
            }
            srgb = new androidx.compose.ui.graphics.colorspace.Rgb(rgb.getName(), rgb.getPrimaries(), whitePoint2, rgb.getTransform(), new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda2
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    double composeColorSpace$lambda$2;
                    composeColorSpace$lambda$2 = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d);
                    return composeColorSpace$lambda$2;
                }
            }, new androidx.compose.ui.graphics.colorspace.DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda3
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    double composeColorSpace$lambda$3;
                    composeColorSpace$lambda$3 = androidx.compose.ui.graphics.ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d);
                    return composeColorSpace$lambda$3;
                }
            }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters, rgb.getId());
        } else {
            srgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
        }
        return srgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(android.graphics.ColorSpace colorSpace, double d) {
        return ((android.graphics.ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(android.graphics.ColorSpace colorSpace, double d) {
        return ((android.graphics.ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }
}

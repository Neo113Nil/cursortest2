package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelperV34;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "p0", "Landroid/graphics/ColorSpace;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/ColorSpace;", "", "getHighResolutionOutputSizeshNQ4ISI", "(I)Landroidx/compose/ui/graphics/colorspace/ColorSpace;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ColorSpaceVerificationHelperV34 {
    public static final androidx.compose.ui.graphics.ColorSpaceVerificationHelperV34 INSTANCE = new androidx.compose.ui.graphics.ColorSpaceVerificationHelperV34();

    private ColorSpaceVerificationHelperV34() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.ColorSpace getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.colorspace.ColorSpace p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt2020Hlg())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020_HLG);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt2020Pq())) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace getHighResolutionOutputSizeshNQ4ISI(int p0) {
        return p0 == android.graphics.ColorSpace.Named.BT2020_HLG.ordinal() ? androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt2020Hlg() : p0 == android.graphics.ColorSpace.Named.BT2020_PQ.ordinal() ? androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getBt2020Pq() : androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getUnspecified$ui_graphics();
    }
}

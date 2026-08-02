package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class Api26Bitmap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @RequiresApi(26)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0000¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap$Companion;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ColorSpace composeColorSpace$ui_graphics_release(Bitmap bitmap) {
            android.graphics.ColorSpace colorSpace;
            Intrinsics.checkNotNullParameter(bitmap, "<this>");
            colorSpace = bitmap.getColorSpace();
            ColorSpace composeColorSpace$ui_graphics_release = colorSpace == null ? null : composeColorSpace$ui_graphics_release(colorSpace);
            return composeColorSpace$ui_graphics_release == null ? ColorSpaces.INSTANCE.getSrgb() : composeColorSpace$ui_graphics_release;
        }

        /* renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
        public final Bitmap m422createBitmapx__hDU$ui_graphics_release(int width, int height, int bitmapConfig, boolean hasAlpha, ColorSpace colorSpace) {
            Bitmap createBitmap;
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.m387toBitmapConfig1JJdX4A(bitmapConfig), hasAlpha, toFrameworkColorSpace$ui_graphics_release(colorSpace));
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …olorSpace()\n            )");
            return createBitmap;
        }

        public final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(ColorSpace colorSpace) {
            android.graphics.ColorSpace colorSpace2;
            Intrinsics.checkNotNullParameter(colorSpace, "<this>");
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            colorSpace2 = android.graphics.ColorSpace.get(Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb()) ? ColorSpace.Named.SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getAces()) ? ColorSpace.Named.ACES : Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg()) ? ColorSpace.Named.ACESCG : Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb()) ? ColorSpace.Named.ADOBE_RGB : Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020()) ? ColorSpace.Named.BT2020 : Intrinsics.areEqual(colorSpace, colorSpaces.getBt709()) ? ColorSpace.Named.BT709 : Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab()) ? ColorSpace.Named.CIE_LAB : Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz()) ? ColorSpace.Named.CIE_XYZ : Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3()) ? ColorSpace.Named.DCI_P3 : Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3()) ? ColorSpace.Named.DISPLAY_P3 : Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb()) ? ColorSpace.Named.EXTENDED_SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb()) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb()) ? ColorSpace.Named.LINEAR_SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953()) ? ColorSpace.Named.NTSC_1953 : Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb()) ? ColorSpace.Named.PRO_PHOTO_RGB : Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(frameworkNamedSpace)");
            return colorSpace2;
        }

        private Companion() {
        }

        public final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics_release(android.graphics.ColorSpace colorSpace) {
            android.graphics.ColorSpace colorSpace2;
            android.graphics.ColorSpace colorSpace3;
            android.graphics.ColorSpace colorSpace4;
            android.graphics.ColorSpace colorSpace5;
            android.graphics.ColorSpace colorSpace6;
            android.graphics.ColorSpace colorSpace7;
            android.graphics.ColorSpace colorSpace8;
            android.graphics.ColorSpace colorSpace9;
            android.graphics.ColorSpace colorSpace10;
            android.graphics.ColorSpace colorSpace11;
            android.graphics.ColorSpace colorSpace12;
            android.graphics.ColorSpace colorSpace13;
            android.graphics.ColorSpace colorSpace14;
            android.graphics.ColorSpace colorSpace15;
            android.graphics.ColorSpace colorSpace16;
            android.graphics.ColorSpace colorSpace17;
            ColorSpace.Named unused;
            ColorSpace.Named unused2;
            ColorSpace.Named unused3;
            ColorSpace.Named unused4;
            ColorSpace.Named unused5;
            ColorSpace.Named unused6;
            ColorSpace.Named unused7;
            ColorSpace.Named unused8;
            ColorSpace.Named unused9;
            ColorSpace.Named unused10;
            ColorSpace.Named unused11;
            ColorSpace.Named unused12;
            ColorSpace.Named unused13;
            ColorSpace.Named unused14;
            ColorSpace.Named unused15;
            ColorSpace.Named unused16;
            Intrinsics.checkNotNullParameter(colorSpace, "<this>");
            unused = ColorSpace.Named.SRGB;
            colorSpace2 = android.graphics.ColorSpace.get(ColorSpace.Named.SRGB);
            if (Intrinsics.areEqual(colorSpace, colorSpace2)) {
                return ColorSpaces.INSTANCE.getSrgb();
            }
            unused2 = ColorSpace.Named.ACES;
            colorSpace3 = android.graphics.ColorSpace.get(ColorSpace.Named.ACES);
            if (Intrinsics.areEqual(colorSpace, colorSpace3)) {
                return ColorSpaces.INSTANCE.getAces();
            }
            unused3 = ColorSpace.Named.ACESCG;
            colorSpace4 = android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG);
            if (Intrinsics.areEqual(colorSpace, colorSpace4)) {
                return ColorSpaces.INSTANCE.getAcescg();
            }
            unused4 = ColorSpace.Named.ADOBE_RGB;
            colorSpace5 = android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
            if (Intrinsics.areEqual(colorSpace, colorSpace5)) {
                return ColorSpaces.INSTANCE.getAdobeRgb();
            }
            unused5 = ColorSpace.Named.BT2020;
            colorSpace6 = android.graphics.ColorSpace.get(ColorSpace.Named.BT2020);
            if (Intrinsics.areEqual(colorSpace, colorSpace6)) {
                return ColorSpaces.INSTANCE.getBt2020();
            }
            unused6 = ColorSpace.Named.BT709;
            colorSpace7 = android.graphics.ColorSpace.get(ColorSpace.Named.BT709);
            if (Intrinsics.areEqual(colorSpace, colorSpace7)) {
                return ColorSpaces.INSTANCE.getBt709();
            }
            unused7 = ColorSpace.Named.CIE_LAB;
            colorSpace8 = android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB);
            if (Intrinsics.areEqual(colorSpace, colorSpace8)) {
                return ColorSpaces.INSTANCE.getCieLab();
            }
            unused8 = ColorSpace.Named.CIE_XYZ;
            colorSpace9 = android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ);
            if (Intrinsics.areEqual(colorSpace, colorSpace9)) {
                return ColorSpaces.INSTANCE.getCieXyz();
            }
            unused9 = ColorSpace.Named.DCI_P3;
            colorSpace10 = android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3);
            if (Intrinsics.areEqual(colorSpace, colorSpace10)) {
                return ColorSpaces.INSTANCE.getDciP3();
            }
            unused10 = ColorSpace.Named.DISPLAY_P3;
            colorSpace11 = android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            if (Intrinsics.areEqual(colorSpace, colorSpace11)) {
                return ColorSpaces.INSTANCE.getDisplayP3();
            }
            unused11 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace12 = android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
            if (Intrinsics.areEqual(colorSpace, colorSpace12)) {
                return ColorSpaces.INSTANCE.getExtendedSrgb();
            }
            unused12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace13 = android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (Intrinsics.areEqual(colorSpace, colorSpace13)) {
                return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
            }
            unused13 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace14 = android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
            if (Intrinsics.areEqual(colorSpace, colorSpace14)) {
                return ColorSpaces.INSTANCE.getLinearSrgb();
            }
            unused14 = ColorSpace.Named.NTSC_1953;
            colorSpace15 = android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953);
            if (Intrinsics.areEqual(colorSpace, colorSpace15)) {
                return ColorSpaces.INSTANCE.getNtsc1953();
            }
            unused15 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace16 = android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
            if (Intrinsics.areEqual(colorSpace, colorSpace16)) {
                return ColorSpaces.INSTANCE.getProPhotoRgb();
            }
            unused16 = ColorSpace.Named.SMPTE_C;
            colorSpace17 = android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C);
            return Intrinsics.areEqual(colorSpace, colorSpace17) ? ColorSpaces.INSTANCE.getSmpteC() : ColorSpaces.INSTANCE.getSrgb();
        }
    }
}

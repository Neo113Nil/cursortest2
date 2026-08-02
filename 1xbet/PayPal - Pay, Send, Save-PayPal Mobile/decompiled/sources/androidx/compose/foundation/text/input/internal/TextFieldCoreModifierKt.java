package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldCoreModifierKt {
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);

    public static final /* synthetic */ androidx.compose.ui.geometry.Rect access$getCursorRectInScroller(androidx.compose.ui.unit.Density density, androidx.compose.ui.geometry.Rect rect, boolean z, int i) {
        float left;
        float left2;
        int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(getHighSpeedVideoFpsRanges);
        if (z) {
            left = i - rect.getRight();
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i - rect.getRight();
        } else {
            left2 = rect.getLeft();
        }
        return androidx.compose.ui.geometry.Rect.copy$default(rect, f, 0.0f, left2 + mo1412roundToPx0680j_4, 0.0f, 10, null);
    }

    public static final /* synthetic */ boolean access$isSpecified(androidx.compose.ui.graphics.Brush brush) {
        return ((brush instanceof androidx.compose.ui.graphics.SolidColor) && ((androidx.compose.ui.graphics.SolidColor) brush).getValue() == 16) ? false : true;
    }

    public static final /* synthetic */ float access$roundToNext(float f) {
        double floor;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            floor = java.lang.Math.ceil(f);
        } else {
            floor = java.lang.Math.floor(f);
        }
        return (float) floor;
    }
}

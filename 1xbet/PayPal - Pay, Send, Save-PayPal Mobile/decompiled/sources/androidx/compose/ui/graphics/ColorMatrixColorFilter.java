package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "nativeColorFilter", "<init>", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "targetColorMatrix", "copyColorMatrix-gBh15pI", "([F)[F", "copyColorMatrix", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getHighResolutionOutputSizeshNQ4ISI", "()[F", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "[F", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ColorMatrixColorFilter extends androidx.compose.ui.graphics.ColorFilter {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private float[] getHighSpeedVideoFpsRanges;

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.getHighSpeedVideoFpsRanges = fArr;
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, androidx.compose.ui.graphics.AndroidColorFilter_androidKt.m5857actualColorMatrixColorFilterjHGOpc(fArr), null);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m6070copyColorMatrixgBh15pI$default(androidx.compose.ui.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fArr = androidx.compose.ui.graphics.ColorMatrix.m6052constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m6071copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m6071copyColorMatrixgBh15pI(float[] targetColorMatrix) {
        kotlin.collections.ArraysKt.copyInto$default(getHighResolutionOutputSizeshNQ4ISI(), targetColorMatrix, 0, 0, 0, 14, (java.lang.Object) null);
        return targetColorMatrix;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.graphics.ColorMatrixColorFilter) && java.util.Arrays.equals(getHighResolutionOutputSizeshNQ4ISI(), ((androidx.compose.ui.graphics.ColorMatrixColorFilter) other).getHighResolutionOutputSizeshNQ4ISI());
    }

    private final float[] getHighResolutionOutputSizeshNQ4ISI() {
        float[] fArr = this.getHighSpeedVideoFpsRanges;
        if (fArr != null) {
            return fArr;
        }
        float[] actualColorMatrixFromFilter = androidx.compose.ui.graphics.AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter());
        this.getHighSpeedVideoFpsRanges = actualColorMatrixFromFilter;
        return actualColorMatrixFromFilter;
    }

    public final int hashCode() {
        float[] fArr = this.getHighSpeedVideoFpsRanges;
        if (fArr != null) {
            return androidx.compose.ui.graphics.ColorMatrix.m6058hashCodeimpl(fArr);
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.getHighSpeedVideoFpsRanges;
        sb.append((java.lang.Object) (fArr == null ? "null" : androidx.compose.ui.graphics.ColorMatrix.m6068toStringimpl(fArr)));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr, colorFilter);
    }
}

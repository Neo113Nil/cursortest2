package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/layout/FixedDpInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FixedDpInsets implements androidx.compose.foundation.layout.WindowInsets {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoSizes;

    private FixedDpInsets(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
        this.getHighSpeedVideoSizes = f3;
        this.Camera2StreamConfigurationMap = f4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return p0.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density p0) {
        return p0.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return p0.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density p0) {
        return p0.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Insets(left=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighSpeedVideoFpsRanges));
        sb.append(", top=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(", right=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighSpeedVideoSizes));
        sb.append(", bottom=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.Camera2StreamConfigurationMap));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.FixedDpInsets)) {
            return false;
        }
        androidx.compose.foundation.layout.FixedDpInsets fixedDpInsets = (androidx.compose.foundation.layout.FixedDpInsets) p0;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, fixedDpInsets.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, fixedDpInsets.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes, fixedDpInsets.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, fixedDpInsets.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        return (((((m8607hashCodeimpl * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoSizes)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public /* synthetic */ FixedDpInsets(float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}

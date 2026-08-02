package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/layout/WindowInsets;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LimitInsets implements androidx.compose.foundation.layout.WindowInsets {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    private LimitInsets(androidx.compose.foundation.layout.WindowInsets windowInsets, int i) {
        this.Camera2StreamConfigurationMap = windowInsets;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        int m1768getAllowLeftInRtlJoeWqyM$foundation_layout;
        if (p1 == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            m1768getAllowLeftInRtlJoeWqyM$foundation_layout = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1767getAllowLeftInLtrJoeWqyM$foundation_layout();
        } else {
            m1768getAllowLeftInRtlJoeWqyM$foundation_layout = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1768getAllowLeftInRtlJoeWqyM$foundation_layout();
        }
        if (androidx.compose.foundation.layout.WindowInsetsSides.m1762hasAnybkgdKaI$foundation_layout(this.getHighResolutionOutputSizeshNQ4ISI, m1768getAllowLeftInRtlJoeWqyM$foundation_layout)) {
            return this.Camera2StreamConfigurationMap.getLeft(p0, p1);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density p0) {
        if (androidx.compose.foundation.layout.WindowInsetsSides.m1762hasAnybkgdKaI$foundation_layout(this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1777getTopJoeWqyM())) {
            return this.Camera2StreamConfigurationMap.getTop(p0);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        int m1770getAllowRightInRtlJoeWqyM$foundation_layout;
        if (p1 == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            m1770getAllowRightInRtlJoeWqyM$foundation_layout = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1769getAllowRightInLtrJoeWqyM$foundation_layout();
        } else {
            m1770getAllowRightInRtlJoeWqyM$foundation_layout = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1770getAllowRightInRtlJoeWqyM$foundation_layout();
        }
        if (androidx.compose.foundation.layout.WindowInsetsSides.m1762hasAnybkgdKaI$foundation_layout(this.getHighResolutionOutputSizeshNQ4ISI, m1770getAllowRightInRtlJoeWqyM$foundation_layout)) {
            return this.Camera2StreamConfigurationMap.getRight(p0, p1);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density p0) {
        if (androidx.compose.foundation.layout.WindowInsetsSides.m1762hasAnybkgdKaI$foundation_layout(this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1771getBottomJoeWqyM())) {
            return this.Camera2StreamConfigurationMap.getBottom(p0);
        }
        return 0;
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.LimitInsets)) {
            return false;
        }
        androidx.compose.foundation.layout.LimitInsets limitInsets = (androidx.compose.foundation.layout.LimitInsets) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, limitInsets.Camera2StreamConfigurationMap) && androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, limitInsets.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + androidx.compose.foundation.layout.WindowInsetsSides.m1763hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" only ");
        sb.append((java.lang.Object) androidx.compose.foundation.layout.WindowInsetsSides.m1765toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ LimitInsets(androidx.compose.foundation.layout.WindowInsets windowInsets, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }
}

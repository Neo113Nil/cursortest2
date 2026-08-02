package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DpLazyLayoutCacheWindow;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "calculateAheadWindow", "(Landroidx/compose/ui/unit/Density;I)I", "calculateBehindWindow", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DpLazyLayoutCacheWindow implements androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoFpsRangesFor;

    private DpLazyLayoutCacheWindow(float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = f2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public final int calculateAheadWindow(androidx.compose.ui.unit.Density density, int i) {
        return density.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public final int calculateBehindWindow(androidx.compose.ui.unit.Density density, int i) {
        return density.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.foundation.lazy.layout.DpLazyLayoutCacheWindow)) {
            return false;
        }
        androidx.compose.foundation.lazy.layout.DpLazyLayoutCacheWindow dpLazyLayoutCacheWindow = (androidx.compose.foundation.lazy.layout.DpLazyLayoutCacheWindow) p0;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(dpLazyLayoutCacheWindow.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(dpLazyLayoutCacheWindow.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
    }

    public /* synthetic */ DpLazyLayoutCacheWindow(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}

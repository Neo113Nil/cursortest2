package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/core/graphics/RegionKt$iterator$1;", "", "Landroid/graphics/Rect;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroid/graphics/Rect;", "Landroid/graphics/RegionIterator;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/RegionIterator;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/Rect;", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegionKt$iterator$1 implements java.util.Iterator<android.graphics.Rect>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.RegionIterator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;

    RegionKt$iterator$1(android.graphics.Region region) {
        android.graphics.RegionIterator regionIterator = new android.graphics.RegionIterator(region);
        this.getHighSpeedVideoSizes = regionIterator;
        android.graphics.Rect rect = new android.graphics.Rect();
        this.getHighResolutionOutputSizeshNQ4ISI = rect;
        this.Camera2StreamConfigurationMap = regionIterator.next(rect);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final android.graphics.Rect next() {
        if (this.Camera2StreamConfigurationMap) {
            android.graphics.Rect rect = new android.graphics.Rect(this.getHighResolutionOutputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.next(this.getHighResolutionOutputSizeshNQ4ISI);
            return rect;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR+\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0014\u0010 \u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0014\u0010\"\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0014\u0010$\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemDrawInfoImpl;", "Landroidx/compose/material3/carousel/CarouselItemDrawInfo;", "<init>", "()V", "", "<set-?>", "sizeState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getSizeState", "()F", "setSizeState", "(F)V", "sizeState", "minSizeState$delegate", "getMinSizeState", "setMinSizeState", "minSizeState", "maxSizeState$delegate", "getMaxSizeState", "setMaxSizeState", "maxSizeState", "Landroidx/compose/ui/geometry/Rect;", "maskRectState$delegate", "Landroidx/compose/runtime/MutableState;", "getMaskRectState", "()Landroidx/compose/ui/geometry/Rect;", "setMaskRectState", "(Landroidx/compose/ui/geometry/Rect;)V", "maskRectState", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "getMinSize", "minSize", "getMaxSize", "maxSize", "getMaskRect", "maskRect"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselItemDrawInfoImpl implements androidx.compose.material3.carousel.CarouselItemDrawInfo {
    public static final int $stable = 0;

    /* renamed from: sizeState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState sizeState = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: minSizeState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState minSizeState = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: maxSizeState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState maxSizeState = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: maskRectState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState maskRectState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Rect.INSTANCE.getZero(), null, 2, null);

    public final float getSizeState() {
        return this.sizeState.getFloatValue();
    }

    public final void setSizeState(float f) {
        this.sizeState.setFloatValue(f);
    }

    public final float getMinSizeState() {
        return this.minSizeState.getFloatValue();
    }

    public final void setMinSizeState(float f) {
        this.minSizeState.setFloatValue(f);
    }

    public final float getMaxSizeState() {
        return this.maxSizeState.getFloatValue();
    }

    public final void setMaxSizeState(float f) {
        this.maxSizeState.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.geometry.Rect getMaskRectState() {
        return (androidx.compose.ui.geometry.Rect) this.maskRectState.getValue();
    }

    public final void setMaskRectState(androidx.compose.ui.geometry.Rect rect) {
        this.maskRectState.setValue(rect);
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public final float getSize() {
        return getSizeState();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public final float getMinSize() {
        return getMinSizeState();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public final float getMaxSize() {
        return getMaxSizeState();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public final androidx.compose.ui.geometry.Rect getMaskRect() {
        return getMaskRectState();
    }
}

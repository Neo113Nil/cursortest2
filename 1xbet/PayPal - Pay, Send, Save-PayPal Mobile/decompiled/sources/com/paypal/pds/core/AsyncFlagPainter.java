package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8C@CX\u0082\u008c\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\f8C@CX\u0082\u008c\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\f8C@CX\u0082\u008c\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/pds/core/AsyncFlagPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/geometry/Size;", "targetSize", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "sprite", "", "index", "sectorSize", "update", "(Landroidx/compose/ui/graphics/ImageBitmap;II)V", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableIntState;", "getHighSpeedVideoFpsRanges", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AsyncFlagPainter extends androidx.compose.ui.graphics.painter.Painter {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    private final androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRanges;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    private AsyncFlagPainter(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return ((androidx.compose.ui.graphics.ImageBitmap) this.getHighSpeedVideoFpsRangesFor.getValue()) != null ? this.getHighResolutionOutputSizeshNQ4ISI : androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = (androidx.compose.ui.graphics.ImageBitmap) this.getHighSpeedVideoFpsRangesFor.getValue();
        if (imageBitmap != null) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6515drawImageAZ2fEMs$default(drawScope, imageBitmap, androidx.compose.ui.unit.IntOffset.m8723constructorimpl((this.getHighSpeedVideoSizes.getIntValue() * this.getHighSpeedVideoFpsRanges.getIntValue()) & 4294967295L), androidx.compose.ui.unit.IntSize.m8767constructorimpl((this.getHighSpeedVideoFpsRanges.getIntValue() << 32) | (this.getHighSpeedVideoFpsRanges.getIntValue() & 4294967295L)), androidx.compose.ui.unit.IntOffset.m8723constructorimpl(0L), androidx.compose.ui.unit.IntSize.m8767constructorimpl((4294967295L & ((int) java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)))) | (((int) java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) << 32)), 0.0f, null, null, 0, 0, 992, null);
        }
    }

    public final void update(androidx.compose.ui.graphics.ImageBitmap sprite, int index, int sectorSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sprite, "");
        this.getHighSpeedVideoFpsRangesFor.setValue(sprite);
        this.getHighSpeedVideoSizes.setIntValue(index);
        this.getHighSpeedVideoFpsRanges.setIntValue(sectorSize);
    }

    public /* synthetic */ AsyncFlagPainter(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}

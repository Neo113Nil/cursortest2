package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "p0", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "p1", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "Landroidx/collection/LongSparseArray;", "getHighSpeedVideoSizes", "PointerInputData"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PointerInputChangeEventProducer {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChangeEventProducer.PointerInputData> getHighSpeedVideoSizes = new androidx.collection.LongSparseArray<>(0, 1, null);

    public final androidx.compose.ui.input.pointer.InternalPointerEvent getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerInputEvent p0, androidx.compose.ui.input.pointer.PositionCalculator p1) {
        long j;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        long mo7309screenToLocalMKHz9U;
        androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray(p0.getPointers().size());
        java.util.List<androidx.compose.ui.input.pointer.PointerInputEventData> pointers = p0.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData = pointers.get(i);
            androidx.compose.ui.input.pointer.PointerInputChangeEventProducer.PointerInputData pointerInputData = this.getHighSpeedVideoSizes.get(pointerInputEventData.m7244getIdJ3iCeTQ());
            if (pointerInputData == null) {
                j = pointerInputEventData.getUptime();
                mo7309screenToLocalMKHz9U = pointerInputEventData.m7246getPositionF1C5BW0();
                getHighResolutionOutputSizeshNQ4ISI = false;
            } else {
                long camera2StreamConfigurationMap = pointerInputData.getCamera2StreamConfigurationMap();
                j = camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = pointerInputData.getGetHighResolutionOutputSizeshNQ4ISI();
                mo7309screenToLocalMKHz9U = p1.mo7309screenToLocalMKHz9U(pointerInputData.getGetHighSpeedVideoFpsRanges());
            }
            longSparseArray.put(pointerInputEventData.m7244getIdJ3iCeTQ(), new androidx.compose.ui.input.pointer.PointerInputChange(pointerInputEventData.m7244getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m7246getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), j, mo7309screenToLocalMKHz9U, getHighResolutionOutputSizeshNQ4ISI, false, pointerInputEventData.m7249getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m7248getScrollDeltaF1C5BW0(), pointerInputEventData.m7245getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.getHighSpeedVideoSizes.put(pointerInputEventData.m7244getIdJ3iCeTQ(), new androidx.compose.ui.input.pointer.PointerInputChangeEventProducer.PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m7247getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                this.getHighSpeedVideoSizes.remove(pointerInputEventData.m7244getIdJ3iCeTQ());
            }
        }
        return new androidx.compose.ui.input.pointer.InternalPointerEvent(longSparseArray, p0);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoSizes.clear();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "", "p0", "Landroidx/compose/ui/geometry/Offset;", "p1", "", "p2", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges", "()J", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PointerInputData {
        private final long getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final long Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        private PointerInputData(long j, long j2, boolean z) {
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRanges = j2;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final long getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final long getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }
    }
}

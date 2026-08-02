package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\f\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "", "Landroidx/compose/runtime/State;", "p0", "p1", "<init>", "(Landroidx/compose/runtime/State;Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/State;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TypefaceDirtyTrackerLinkedList {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList getHighSpeedVideoSizes;

    public TypefaceDirtyTrackerLinkedList(androidx.compose.runtime.State<? extends java.lang.Object> state, androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoSizes = typefaceDirtyTrackerLinkedList;
        this.getHighResolutionOutputSizeshNQ4ISI = state.getValue();
    }

    public final boolean getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoFpsRanges.getValue() != this.getHighResolutionOutputSizeshNQ4ISI) {
            return true;
        }
        androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.getHighSpeedVideoSizes;
        return typefaceDirtyTrackerLinkedList != null && typefaceDirtyTrackerLinkedList.getHighSpeedVideoSizes();
    }
}

package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012(\u0010\t\u001a$\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R6\u0010\u0018\u001a$\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "", "itemCount", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/foundation/layout/FlowLineInfo;", "", "getMeasurables", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/compose/ui/layout/Measurable;", "info", "getNext$foundation_layout", "(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getList", "()Ljava/util/List;", "list"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextualFlowItemIterator implements java.util.Iterator<androidx.compose.ui.layout.Measurable>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.Integer, androidx.compose.foundation.layout.FlowLineInfo, java.util.List<androidx.compose.ui.layout.Measurable>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.layout.Measurable> getHighSpeedVideoSizes = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextualFlowItemIterator(int i, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.compose.foundation.layout.FlowLineInfo, ? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> function2) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    public final java.util.List<androidx.compose.ui.layout.Measurable> getList() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap < getList().size() || this.getHighSpeedVideoFpsRangesFor < this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final androidx.compose.ui.layout.Measurable next() {
        return getNext$foundation_layout$default(this, null, 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.layout.Measurable getNext$foundation_layout$default(androidx.compose.foundation.layout.ContextualFlowItemIterator contextualFlowItemIterator, androidx.compose.foundation.layout.FlowLineInfo flowLineInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            flowLineInfo = new androidx.compose.foundation.layout.FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout(flowLineInfo);
    }

    public final androidx.compose.ui.layout.Measurable getNext$foundation_layout(androidx.compose.foundation.layout.FlowLineInfo info) {
        if (this.Camera2StreamConfigurationMap < getList().size()) {
            androidx.compose.ui.layout.Measurable measurable = getList().get(this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap++;
            return measurable;
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i < this.getHighSpeedVideoFpsRanges) {
            java.util.List<androidx.compose.ui.layout.Measurable> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Integer.valueOf(i), info);
            this.getHighSpeedVideoFpsRangesFor++;
            if (invoke.isEmpty()) {
                return next();
            }
            androidx.compose.ui.layout.Measurable measurable2 = (androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.first((java.util.List) invoke);
            this.getHighSpeedVideoSizes.addAll(invoke);
            this.Camera2StreamConfigurationMap++;
            return measurable2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No item returned at index call. Index: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

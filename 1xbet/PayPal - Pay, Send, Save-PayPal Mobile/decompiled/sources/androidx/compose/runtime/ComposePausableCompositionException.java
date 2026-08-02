package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "Landroidx/collection/ObjectList;", "", "p0", "p1", "Landroidx/collection/IntList;", "p2", "", "p3", "", "p4", "<init>", "(Landroidx/collection/ObjectList;Landroidx/collection/ObjectList;Landroidx/collection/IntList;ILjava/lang/Throwable;)V", "Camera2StreamConfigurationMap", "Landroidx/collection/ObjectList;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/collection/IntList;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposePausableCompositionException extends java.lang.RuntimeException {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.ObjectList<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.ObjectList<java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.IntList getHighResolutionOutputSizeshNQ4ISI;

    public ComposePausableCompositionException(androidx.collection.ObjectList<java.lang.Object> objectList, androidx.collection.ObjectList<java.lang.Object> objectList2, androidx.collection.IntList intList, int i, java.lang.Throwable th) {
        super(th);
        this.getHighSpeedVideoFpsRangesFor = objectList;
        this.getHighSpeedVideoSizes = objectList2;
        this.getHighResolutionOutputSizeshNQ4ISI = intList;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(":\n            |");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.takeLast(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.sequence(new androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1(this, null))), 50), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null));
        sb.append("\n            ");
        return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}

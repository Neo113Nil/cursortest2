package com.datadog.android.sessionreplay.internal.recorder.callback;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/callback/DefaultInteropViewCallback;", "Lcom/datadog/android/sessionreplay/recorder/InteropViewCallback;", "Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;", "treeViewTraversal", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "recordedDataQueueRefs", "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;)V", "Landroid/view/View;", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultInteropViewCallback implements com.datadog.android.sessionreplay.recorder.InteropViewCallback {
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal getHighResolutionOutputSizeshNQ4ISI;

    public DefaultInteropViewCallback(com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal treeViewTraversal, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs recordedDataQueueRefs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(treeViewTraversal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueRefs, "");
        this.getHighResolutionOutputSizeshNQ4ISI = treeViewTraversal;
        this.getHighSpeedVideoFpsRanges = recordedDataQueueRefs;
    }

    @Override // com.datadog.android.sessionreplay.recorder.InteropViewCallback
    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(android.view.View view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.traverse(view, mappingContext, this.getHighSpeedVideoFpsRanges).getMappedWireframes();
    }
}

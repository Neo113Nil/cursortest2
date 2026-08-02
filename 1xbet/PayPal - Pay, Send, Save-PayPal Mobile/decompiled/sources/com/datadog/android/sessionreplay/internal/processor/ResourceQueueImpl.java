package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/ResourceQueueImpl;", "Lcom/datadog/android/sessionreplay/SessionReplayInternalResourceQueue;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "internalHandler", "<init>", "(Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;)V", "", "identifier", "", "resourceData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "addResourceItem", "(Ljava/lang/String;[BLjava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceQueueImpl implements com.datadog.android.sessionreplay.SessionReplayInternalResourceQueue {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getHighSpeedVideoSizes;

    public ResourceQueueImpl(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        this.getHighSpeedVideoSizes = recordedDataQueueHandler;
    }

    @Override // com.datadog.android.sessionreplay.SessionReplayInternalResourceQueue
    public final void addResourceItem(java.lang.String identifier, byte[] resourceData, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceData, "");
        this.getHighSpeedVideoSizes.addResourceItem(identifier, resourceData, mimeType);
    }
}

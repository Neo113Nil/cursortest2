package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/DataQueueHandler;", "", "", "identifier", "", "resourceData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "addResourceItem", "(Ljava/lang/String;[BLjava/lang/String;)Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "systemInformation", "Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "addSnapshotItem", "(Lcom/datadog/android/sessionreplay/recorder/SystemInformation;)Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "pointerInteractions", "Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "addTouchEventItem", "(Ljava/util/List;)Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "", "clearAndStopProcessingQueue", "()V", "tryToConsumeItems"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DataQueueHandler {
    com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem addResourceItem(java.lang.String identifier, byte[] resourceData, java.lang.String mimeType);

    com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem addSnapshotItem(com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation);

    com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem addTouchEventItem(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> pointerInteractions);

    void clearAndStopProcessingQueue();

    void tryToConsumeItems();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem addResourceItem$default(com.datadog.android.sessionreplay.internal.async.DataQueueHandler dataQueueHandler, java.lang.String str, byte[] bArr, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addResourceItem");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return dataQueueHandler.addResourceItem(str, bArr, str2);
        }
    }
}

package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/Processor;", "", "Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "item", "", "processResources", "(Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;)V", "Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "processScreenSnapshots", "(Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;)V", "Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "processTouchEventsRecords", "(Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Processor {
    void processResources(com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem item);

    void processScreenSnapshots(com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem item);

    void processTouchEventsRecords(com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem item);
}

package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "recordedQueuedItemContext", "", "identifier", "", "resourceData", "", "creationTimestampInNs", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;Ljava/lang/String;[BJLjava/lang/String;)V", "", "isReady$dd_sdk_android_session_replay_release", "()Z", "isValid$dd_sdk_android_session_replay_release", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "getMimeType", "[B", "getResourceData", "()[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceRecordedDataQueueItem extends com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem {
    private final java.lang.String identifier;
    private final java.lang.String mimeType;
    private final byte[] resourceData;

    @Override // com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem
    public final boolean isReady$dd_sdk_android_session_replay_release() {
        return true;
    }

    public /* synthetic */ ResourceRecordedDataQueueItem(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, java.lang.String str, byte[] bArr, long j, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(recordedQueuedItemContext, str, bArr, j, (i & 16) != 0 ? null : str2);
    }

    public final java.lang.String getIdentifier() {
        return this.identifier;
    }

    public final byte[] getResourceData() {
        return this.resourceData;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceRecordedDataQueueItem(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, java.lang.String str, byte[] bArr, long j, java.lang.String str2) {
        super(recordedQueuedItemContext, j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedQueuedItemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.identifier = str;
        this.resourceData = bArr;
        this.mimeType = str2;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem
    public final boolean isValid$dd_sdk_android_session_replay_release() {
        return !(this.resourceData.length == 0);
    }
}

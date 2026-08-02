package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/SessionReplayInternalResourceQueue;", "", "", "identifier", "", "resourceData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "addResourceItem", "(Ljava/lang/String;[BLjava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SessionReplayInternalResourceQueue {
    void addResourceItem(java.lang.String identifier, byte[] resourceData, java.lang.String mimeType);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void addResourceItem$default(com.datadog.android.sessionreplay.SessionReplayInternalResourceQueue sessionReplayInternalResourceQueue, java.lang.String str, byte[] bArr, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addResourceItem");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            sessionReplayInternalResourceQueue.addResourceItem(str, bArr, str2);
        }
    }
}

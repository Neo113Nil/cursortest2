package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/sessionreplay/NoOpSessionReplayInternalCallback;", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "<init>", "()V", "", "identifier", "", "resourceData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "addResourceItem", "(Ljava/lang/String;[BLjava/lang/String;)V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "Lcom/datadog/android/sessionreplay/SessionReplayInternalResourceQueue;", "resourceQueue", "setResourceQueue", "(Lcom/datadog/android/sessionreplay/SessionReplayInternalResourceQueue;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoOpSessionReplayInternalCallback implements com.datadog.android.sessionreplay.SessionReplayInternalCallback {
    @Override // com.datadog.android.sessionreplay.SessionReplayInternalCallback
    public final android.app.Activity getCurrentActivity() {
        return null;
    }

    @Override // com.datadog.android.sessionreplay.SessionReplayInternalCallback
    public final void setResourceQueue(com.datadog.android.sessionreplay.SessionReplayInternalResourceQueue resourceQueue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceQueue, "");
    }

    @Override // com.datadog.android.sessionreplay.SessionReplayInternalCallback
    public final void addResourceItem(java.lang.String identifier, byte[] resourceData, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceData, "");
    }
}

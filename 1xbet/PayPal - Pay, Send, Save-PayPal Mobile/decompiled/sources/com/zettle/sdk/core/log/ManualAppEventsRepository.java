package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/core/log/ManualAppEventsRepository;", "", "", "userUuid", "", "defaultValue", "getLastManualEvent", "(Ljava/lang/String;J)J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setLastManualEvent", "(Ljava/lang/String;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ManualAppEventsRepository {
    long getLastManualEvent(java.lang.String userUuid, long defaultValue);

    void setLastManualEvent(java.lang.String userUuid, long value);
}

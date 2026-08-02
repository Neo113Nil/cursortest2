package com.datadog.android.core.configuration;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "", "", "featureName", "", "uploadAttempts", "lastStatusCode", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "getMsDelayUntilNextUpload", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Throwable;)J"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UploadSchedulerStrategy {
    long getMsDelayUntilNextUpload(java.lang.String featureName, int uploadAttempts, java.lang.Integer lastStatusCode, java.lang.Throwable throwable);
}

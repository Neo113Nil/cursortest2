package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/LateCrashReporter;", "", "Landroid/app/ApplicationExitInfo;", "anrExitInfo", "Lcom/google/gson/JsonObject;", "lastRumViewEventJson", "Lcom/datadog/android/api/storage/DataWriter;", "rumWriter", "", "handleAnrCrash", "(Landroid/app/ApplicationExitInfo;Lcom/google/gson/JsonObject;Lcom/datadog/android/api/storage/DataWriter;)V", "", "event", "handleNdkCrashEvent", "(Ljava/util/Map;Lcom/datadog/android/api/storage/DataWriter;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LateCrashReporter {
    void handleAnrCrash(android.app.ApplicationExitInfo anrExitInfo, com.google.gson.JsonObject lastRumViewEventJson, com.datadog.android.api.storage.DataWriter<java.lang.Object> rumWriter);

    void handleNdkCrashEvent(java.util.Map<?, ?> event, com.datadog.android.api.storage.DataWriter<java.lang.Object> rumWriter);
}

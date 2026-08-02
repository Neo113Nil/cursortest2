package com.datadog.android.ndk.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "handleNdkCrash", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "prepareData", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NdkCrashHandler {
    void handleNdkCrash(com.datadog.android.api.feature.FeatureSdkCore sdkCore);

    void prepareData();
}

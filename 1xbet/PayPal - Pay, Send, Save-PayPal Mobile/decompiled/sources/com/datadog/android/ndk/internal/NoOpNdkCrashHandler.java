package com.datadog.android.ndk.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003"}, d2 = {"Lcom/datadog/android/ndk/internal/NoOpNdkCrashHandler;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "<init>", "()V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "handleNdkCrash", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "prepareData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpNdkCrashHandler implements com.datadog.android.ndk.internal.NdkCrashHandler {
    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public final void prepareData() {
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public final void handleNdkCrash(com.datadog.android.api.feature.FeatureSdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
    }
}

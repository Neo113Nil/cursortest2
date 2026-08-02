package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "handleClosableError", "(Ljava/lang/Throwable;Lcom/datadog/android/api/SdkCore;)V", "", "CLOSABLE_ERROR_MESSAGE", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloasableErrorExtKt {
    public static final java.lang.String CLOSABLE_ERROR_MESSAGE = "Error while using the closeable";

    public static final void handleClosableError(java.lang.Throwable th, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        com.datadog.android.rum.RumMonitor.DefaultImpls.addError$default(com.datadog.android.rum.GlobalRumMonitor.get(sdkCore), CLOSABLE_ERROR_MESSAGE, com.datadog.android.rum.RumErrorSource.SOURCE, th, null, 8, null);
    }
}

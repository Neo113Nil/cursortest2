package com.datadog.android.rum.resource;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/InputStream;", "", "url", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "asRumResource", "(Ljava/io/InputStream;Ljava/lang/String;Lcom/datadog/android/api/SdkCore;)Ljava/io/InputStream;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InputStreamExtKt {
    public static /* synthetic */ java.io.InputStream asRumResource$default(java.io.InputStream inputStream, java.lang.String str, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return asRumResource(inputStream, str, sdkCore);
    }

    public static final java.io.InputStream asRumResource(java.io.InputStream inputStream, java.lang.String str, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        return new com.datadog.android.rum.resource.RumResourceInputStream(inputStream, str, sdkCore);
    }
}

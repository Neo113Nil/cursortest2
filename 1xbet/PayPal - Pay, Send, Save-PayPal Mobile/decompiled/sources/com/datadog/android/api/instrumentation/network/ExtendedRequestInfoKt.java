package com.datadog.android.api.instrumentation.network;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "Ljava/lang/Class;", "type", "tag", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Ljava/lang/Class;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtendedRequestInfoKt {
    public static final <T> T tag(com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, java.lang.Class<? extends T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        if (httpRequestInfo instanceof com.datadog.android.api.instrumentation.network.ExtendedRequestInfo) {
            return (T) ((com.datadog.android.api.instrumentation.network.ExtendedRequestInfo) httpRequestInfo).tag(cls);
        }
        return null;
    }
}

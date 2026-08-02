package com.datadog.android.api.instrumentation.network;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\t2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0012"}, d2 = {"Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "", "", "key", "", "values", "addHeader", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "T", "Ljava/lang/Class;", "type", "tag", "addTag", "(Ljava/lang/Class;Ljava/lang/Object;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "build", "()Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "removeHeader", "(Ljava/lang/String;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "replaceHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "method", "Lcom/datadog/android/api/instrumentation/network/HttpRequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "setMethod", "(Ljava/lang/String;Lcom/datadog/android/api/instrumentation/network/HttpRequestBody;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "url", "setUrl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HttpRequestInfoBuilder {
    com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder addHeader(java.lang.String key, java.lang.String... values);

    <T> com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder addTag(java.lang.Class<? super T> type, T tag);

    com.datadog.android.api.instrumentation.network.HttpRequestInfo build();

    com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder removeHeader(java.lang.String key);

    com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder replaceHeader(java.lang.String key, java.lang.String value);

    com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder setMethod(java.lang.String method, com.datadog.android.api.instrumentation.network.HttpRequestBody body);

    com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder setUrl(java.lang.String url);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder replaceHeader(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            httpRequestInfoBuilder.removeHeader(str);
            httpRequestInfoBuilder.addHeader(str, str2);
            return httpRequestInfoBuilder;
        }

        public static /* synthetic */ com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder setMethod$default(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, java.lang.String str, com.datadog.android.api.instrumentation.network.HttpRequestBody httpRequestBody, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMethod");
            }
            if ((i & 2) != 0) {
                httpRequestBody = null;
            }
            return httpRequestInfoBuilder.setMethod(str, httpRequestBody);
        }
    }
}

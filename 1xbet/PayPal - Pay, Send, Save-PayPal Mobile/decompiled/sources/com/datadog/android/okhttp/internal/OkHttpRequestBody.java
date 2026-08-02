package com.datadog.android.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/okhttp/internal/OkHttpRequestBody;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestBody;", "Lokhttp3/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lokhttp3/RequestBody;)V", "component1", "()Lokhttp3/RequestBody;", "copy", "(Lokhttp3/RequestBody;)Lcom/datadog/android/okhttp/internal/OkHttpRequestBody;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lokhttp3/RequestBody;", "getBody"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OkHttpRequestBody implements com.datadog.android.api.instrumentation.network.HttpRequestBody {
    private final okhttp3.RequestBody body;

    public OkHttpRequestBody(okhttp3.RequestBody requestBody) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "");
        this.body = requestBody;
    }

    public final okhttp3.RequestBody getBody() {
        return this.body;
    }

    public final java.lang.String toString() {
        okhttp3.RequestBody requestBody = this.body;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OkHttpRequestBody(body=");
        sb.append(requestBody);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.body.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.okhttp.internal.OkHttpRequestBody) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, ((com.datadog.android.okhttp.internal.OkHttpRequestBody) other).body);
    }

    public final com.datadog.android.okhttp.internal.OkHttpRequestBody copy(okhttp3.RequestBody body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        return new com.datadog.android.okhttp.internal.OkHttpRequestBody(body);
    }

    /* renamed from: component1, reason: from getter */
    public final okhttp3.RequestBody getBody() {
        return this.body;
    }

    public static /* synthetic */ com.datadog.android.okhttp.internal.OkHttpRequestBody copy$default(com.datadog.android.okhttp.internal.OkHttpRequestBody okHttpRequestBody, okhttp3.RequestBody requestBody, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestBody = okHttpRequestBody.body;
        }
        return okHttpRequestBody.copy(requestBody);
    }
}

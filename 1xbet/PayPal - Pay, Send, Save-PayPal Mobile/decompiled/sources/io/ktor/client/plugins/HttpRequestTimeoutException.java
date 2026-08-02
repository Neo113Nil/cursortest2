package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlinx/coroutines/CopyableThrowable;", "", "url", "", "timeoutMillis", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "Lio/ktor/client/request/HttpRequestData;", "(Lio/ktor/client/request/HttpRequestData;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Long;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpRequestTimeoutException extends java.io.IOException implements kotlinx.coroutines.CopyableThrowable<io.ktor.client.plugins.HttpRequestTimeoutException> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ HttpRequestTimeoutException(java.lang.String str, java.lang.Long l, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpRequestTimeoutException(java.lang.String str, java.lang.Long l, java.lang.Throwable th) {
        super(r0.toString(), th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        sb.append(l == null ? "unknown" : l);
        sb.append(" ms]");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpRequestTimeoutException(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        this(r2, r8 != null ? r8.getGetHighSpeedVideoFpsRanges() : null, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        java.lang.String buildString = httpRequestBuilder.getUrl().buildString();
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) httpRequestBuilder.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpRequestTimeoutException(io.ktor.client.request.HttpRequestData httpRequestData) {
        this(r2, r8 != null ? r8.getGetHighSpeedVideoFpsRanges() : null, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "");
        java.lang.String obj = httpRequestData.getUrl().toString();
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.CopyableThrowable
    public final io.ktor.client.plugins.HttpRequestTimeoutException createCopy() {
        return new io.ktor.client.plugins.HttpRequestTimeoutException(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, getCause());
    }
}

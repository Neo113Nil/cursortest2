package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpCallback;", "Lokhttp3/Callback;", "Lio/ktor/client/request/HttpRequestData;", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "Lokhttp3/Response;", "p1", "<init>", "(Lio/ktor/client/request/HttpRequestData;Lkotlinx/coroutines/CancellableContinuation;)V", "Lokhttp3/Call;", "Ljava/io/IOException;", "", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "getHighSpeedVideoFpsRanges", "Lio/ktor/client/request/HttpRequestData;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CancellableContinuation;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class OkHttpCallback implements okhttp3.Callback {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CancellableContinuation<okhttp3.Response> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.client.request.HttpRequestData getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public OkHttpCallback(io.ktor.client.request.HttpRequestData httpRequestData, kotlinx.coroutines.CancellableContinuation<? super okhttp3.Response> cancellableContinuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellableContinuation, "");
        this.getHighSpeedVideoFpsRangesFor = httpRequestData;
        this.getHighSpeedVideoSizes = cancellableContinuation;
    }

    @Override // okhttp3.Callback
    public final void onFailure(okhttp3.Call p0, java.io.IOException p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (this.getHighSpeedVideoSizes.isCancelled()) {
            return;
        }
        kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = this.getHighSpeedVideoSizes;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(io.ktor.client.engine.okhttp.OkUtilsKt.access$mapOkHttpException(this.getHighSpeedVideoFpsRangesFor, p1))));
    }

    @Override // okhttp3.Callback
    public final void onResponse(okhttp3.Call p0, okhttp3.Response p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (p0.getCanceled()) {
            return;
        }
        kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = this.getHighSpeedVideoSizes;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(p1));
    }
}

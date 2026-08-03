package io.ktor.http.cio;

/* compiled from: Multipart.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0, 1, 1, 1, 2, 3}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136}, m = "parsePartBodyImpl", n = {"output", "boundaryPrefixed", "input", "output", "output", "byteCount"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "J$0"})
/* loaded from: classes6.dex */
final class MultipartKt$parsePartBodyImpl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    MultipartKt$parsePartBodyImpl$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object parsePartBodyImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parsePartBodyImpl = io.ktor.http.cio.MultipartKt.parsePartBodyImpl(null, null, null, null, 0L, this);
        return parsePartBodyImpl;
    }
}

package io.ktor.http.cio;

/* compiled from: Multipart.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {113}, m = "parsePartHeadersImpl", n = {"builder"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class MultipartKt$parsePartHeadersImpl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    MultipartKt$parsePartHeadersImpl$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object parsePartHeadersImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parsePartHeadersImpl = io.ktor.http.cio.MultipartKt.parsePartHeadersImpl(null, this);
        return parsePartHeadersImpl;
    }
}

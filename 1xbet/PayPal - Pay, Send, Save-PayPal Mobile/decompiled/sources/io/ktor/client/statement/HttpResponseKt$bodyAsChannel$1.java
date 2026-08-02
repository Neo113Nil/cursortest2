package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {147}, m = "bodyAsChannel", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpResponseKt$bodyAsChannel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.client.statement.HttpResponseKt.bodyAsChannel(null, this);
    }

    HttpResponseKt$bodyAsChannel$1(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1> continuation) {
        super(continuation);
    }
}

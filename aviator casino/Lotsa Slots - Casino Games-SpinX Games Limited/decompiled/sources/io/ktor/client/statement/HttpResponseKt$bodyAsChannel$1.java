package io.ktor.client.statement;

/* compiled from: HttpResponse.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {147}, m = "bodyAsChannel", n = {}, s = {})
/* loaded from: classes6.dex */
final class HttpResponseKt$bodyAsChannel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    HttpResponseKt$bodyAsChannel$1(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.statement.HttpResponseKt.bodyAsChannel(null, this);
    }
}

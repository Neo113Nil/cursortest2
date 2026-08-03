package io.ktor.client.statement;

/* compiled from: HttpResponse.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0}, l = {147}, m = "bodyAsText", n = {"decoder"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class HttpResponseKt$bodyAsText$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    HttpResponseKt$bodyAsText$1(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponseKt$bodyAsText$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.statement.HttpResponseKt.bodyAsText(null, null, this);
    }
}

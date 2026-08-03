package io.ktor.client.plugins;

/* compiled from: HttpCallValidator.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {117, 118}, m = "HttpCallValidator$lambda$2$processException", n = {"cause", "request", "cause", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$processException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    HttpCallValidatorKt$HttpCallValidator$2$processException$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object HttpCallValidator$lambda$2$processException;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HttpCallValidator$lambda$2$processException = io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(null, null, null, this);
        return HttpCallValidator$lambda$2$processException;
    }
}

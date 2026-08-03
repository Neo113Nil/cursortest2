package io.ktor.client.statement;

/* compiled from: HttpStatement.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 1}, l = {54, 57, 59, 59}, m = "execute", n = {"block", com.ironsource.Ve.n}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class HttpStatement$execute$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.statement.HttpStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$execute$1(io.ktor.client.statement.HttpStatement httpStatement, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement$execute$1> continuation) {
        super(continuation);
        this.this$0 = httpStatement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}

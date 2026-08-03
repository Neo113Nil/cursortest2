package coil.fetch;

/* compiled from: HttpUriFetcher.kt */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {224}, m = "executeNetworkRequest", n = {}, s = {})
/* loaded from: classes2.dex */
final class HttpUriFetcher$executeNetworkRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ coil.fetch.HttpUriFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpUriFetcher$executeNetworkRequest$1(coil.fetch.HttpUriFetcher httpUriFetcher, kotlin.coroutines.Continuation<? super coil.fetch.HttpUriFetcher$executeNetworkRequest$1> continuation) {
        super(continuation);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object executeNetworkRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeNetworkRequest = this.this$0.executeNetworkRequest(null, this);
        return executeNetworkRequest;
    }
}

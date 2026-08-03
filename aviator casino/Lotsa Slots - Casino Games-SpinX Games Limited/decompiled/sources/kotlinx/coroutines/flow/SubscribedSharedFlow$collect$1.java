package kotlinx.coroutines.flow;

/* compiled from: Share.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {com.facebook.internal.FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED}, m = "collect", n = {}, s = {})
/* loaded from: classes6.dex */
final class SubscribedSharedFlow$collect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.SubscribedSharedFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribedSharedFlow$collect$1(kotlinx.coroutines.flow.SubscribedSharedFlow<T> subscribedSharedFlow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1> continuation) {
        super(continuation);
        this.this$0 = subscribedSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}

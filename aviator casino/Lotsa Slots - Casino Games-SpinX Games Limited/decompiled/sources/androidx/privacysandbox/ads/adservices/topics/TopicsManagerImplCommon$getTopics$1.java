package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManagerImplCommon.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {40}, m = "getTopics$suspendImpl", n = {}, s = {})
/* loaded from: classes2.dex */
final class TopicsManagerImplCommon$getTopics$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopicsManagerImplCommon$getTopics$1(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon topicsManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1> continuation) {
        super(continuation);
        this.this$0 = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics$suspendImpl(this.this$0, null, this);
    }
}

package io.ktor.network.selector;

/* compiled from: ActorSelectorManager.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {168}, m = "receiveOrNullSuspend", n = {"$this$receiveOrNullSuspend"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class ActorSelectorManager$receiveOrNullSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.network.selector.ActorSelectorManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$receiveOrNullSuspend$1(io.ktor.network.selector.ActorSelectorManager actorSelectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1> continuation) {
        super(continuation);
        this.this$0 = actorSelectorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object receiveOrNullSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        receiveOrNullSuspend = this.this$0.receiveOrNullSuspend(null, this);
        return receiveOrNullSuspend;
    }
}

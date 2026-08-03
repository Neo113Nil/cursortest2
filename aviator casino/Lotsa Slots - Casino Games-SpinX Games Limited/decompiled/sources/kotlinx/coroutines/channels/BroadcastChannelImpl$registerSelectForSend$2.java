package kotlinx.coroutines.channels;

/* compiled from: BroadcastChannel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BroadcastChannelImpl$registerSelectForSend$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.Object $element;
    final /* synthetic */ kotlinx.coroutines.selects.SelectInstance<?> $select;
    int label;
    final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BroadcastChannelImpl$registerSelectForSend$2(kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl, java.lang.Object obj, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2> continuation) {
        super(2, continuation);
        this.this$0 = broadcastChannelImpl;
        this.$element = obj;
        this.$select = selectInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2(this.this$0, this.$element, this.$select, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.send(this.$element, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Throwable th) {
            if (!this.this$0.isClosedForSend() || (!(th instanceof kotlinx.coroutines.channels.ClosedSendChannelException) && this.this$0.getSendException() != th)) {
                throw th;
            }
            z = false;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = ((kotlinx.coroutines.channels.BroadcastChannelImpl) this.this$0).lock;
        kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
        kotlinx.coroutines.selects.SelectInstance<?> selectInstance = this.$select;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                hashMap3 = ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
                if (hashMap3.get(selectInstance) != null) {
                    throw new java.lang.AssertionError();
                }
            }
            hashMap = ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
            hashMap.put(selectInstance, z ? kotlin.Unit.INSTANCE : kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
            kotlin.jvm.internal.Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            if (((kotlinx.coroutines.selects.SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl, kotlin.Unit.INSTANCE) != kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER) {
                hashMap2 = ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
                hashMap2.remove(selectInstance);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock2.unlock();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            reentrantLock2.unlock();
            throw th2;
        }
    }
}

package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BroadcastChannelImpl$registerSelectForSend$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.selects.SelectInstance<?> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.send(this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Throwable th) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isClosedForSend() || (!(th instanceof kotlinx.coroutines.channels.ClosedSendChannelException) && this.getHighResolutionOutputSizeshNQ4ISI.getSendException() != th)) {
                throw th;
            }
            z = false;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = ((kotlinx.coroutines.channels.BroadcastChannelImpl) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.selects.SelectInstance<?> selectInstance = this.getHighSpeedVideoFpsRangesFor;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                hashMap3 = ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl).Camera2StreamConfigurationMap;
                if (hashMap3.get(selectInstance) != null) {
                    throw new java.lang.AssertionError();
                }
            }
            hashMap = ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl).Camera2StreamConfigurationMap;
            hashMap.put(selectInstance, z ? kotlin.Unit.INSTANCE : kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
            kotlin.jvm.internal.Intrinsics.checkNotNull(selectInstance, "");
            if (((kotlinx.coroutines.selects.SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl, kotlin.Unit.INSTANCE) != kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER) {
                hashMap2 = ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl).Camera2StreamConfigurationMap;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BroadcastChannelImpl$registerSelectForSend$2(kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl, java.lang.Object obj, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = broadcastChannelImpl;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor = selectInstance;
    }
}

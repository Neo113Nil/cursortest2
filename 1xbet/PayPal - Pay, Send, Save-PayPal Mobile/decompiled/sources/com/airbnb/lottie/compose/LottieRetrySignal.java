package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "<init>", "()V", "", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRangesFor", "", "<set-?>", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/MutableState;", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieRetrySignal {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.channels.ChannelKt.Channel$default(1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, null, 4, null);

    /* renamed from: isAwaitingRetry$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAwaitingRetry = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    private final void setAwaitingRetry(boolean z) {
        this.isAwaitingRetry.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAwaitingRetry() {
        return ((java.lang.Boolean) this.isAwaitingRetry.getValue()).booleanValue();
    }

    public final void retry() {
        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(this.getHighSpeedVideoFpsRangesFor, kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitRetry(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1 lottieRetrySignal$awaitRetry$1;
        int i;
        com.airbnb.lottie.compose.LottieRetrySignal lottieRetrySignal;
        if (continuation instanceof com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1) {
            lottieRetrySignal$awaitRetry$1 = (com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1) continuation;
            if ((lottieRetrySignal$awaitRetry$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                lottieRetrySignal$awaitRetry$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = lottieRetrySignal$awaitRetry$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lottieRetrySignal$awaitRetry$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        setAwaitingRetry(true);
                        kotlinx.coroutines.channels.Channel<kotlin.Unit> channel = this.getHighSpeedVideoFpsRangesFor;
                        lottieRetrySignal$awaitRetry$1.getHighSpeedVideoSizes = this;
                        lottieRetrySignal$awaitRetry$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (channel.receive(lottieRetrySignal$awaitRetry$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lottieRetrySignal = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        lottieRetrySignal = this;
                        lottieRetrySignal.setAwaitingRetry(false);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lottieRetrySignal = (com.airbnb.lottie.compose.LottieRetrySignal) lottieRetrySignal$awaitRetry$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        lottieRetrySignal.setAwaitingRetry(false);
                        throw th;
                    }
                }
                lottieRetrySignal.setAwaitingRetry(false);
                return kotlin.Unit.INSTANCE;
            }
        }
        lottieRetrySignal$awaitRetry$1 = new com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1(this, continuation);
        java.lang.Object obj2 = lottieRetrySignal$awaitRetry$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lottieRetrySignal$awaitRetry$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        lottieRetrySignal.setAwaitingRetry(false);
        return kotlin.Unit.INSTANCE;
    }
}

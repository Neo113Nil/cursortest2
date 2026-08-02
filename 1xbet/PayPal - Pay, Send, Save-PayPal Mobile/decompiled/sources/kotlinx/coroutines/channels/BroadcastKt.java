package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u009b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0013\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fj\u0004\u0018\u0001`\u00122-\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b\u0007\u0010\u001a"}, d2 = {"E", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "capacity", "Lkotlinx/coroutines/CoroutineStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlinx/coroutines/channels/BroadcastChannel;", "broadcast", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlinx/coroutines/CoroutineStart;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/BroadcastChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastKt {
    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlinx.coroutines.CoroutineStart coroutineStart, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i, coroutineStart);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(final kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, int i, kotlinx.coroutines.CoroutineStart coroutineStart) {
        return broadcast$default(kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getUnconfined()), new kotlinx.coroutines.channels.BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE)), null, i, coroutineStart, new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.channels.BroadcastKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.coroutines.channels.BroadcastKt.$r8$lambda$HZeuuBCWkfg6xjDbd9YApYs80LQ(kotlinx.coroutines.channels.ReceiveChannel.this, (java.lang.Throwable) obj);
            }
        }, new kotlinx.coroutines.channels.BroadcastKt$broadcast$2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.LAZY;
        }
        kotlinx.coroutines.CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return broadcast(coroutineScope, coroutineContext2, i3, coroutineStart2, function1, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.channels.LazyBroadcastCoroutine broadcastCoroutine;
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        kotlinx.coroutines.channels.BroadcastChannel BroadcastChannel = kotlinx.coroutines.channels.BroadcastChannelKt.BroadcastChannel(i);
        if (coroutineStart.isLazy()) {
            broadcastCoroutine = new kotlinx.coroutines.channels.LazyBroadcastCoroutine(newCoroutineContext, BroadcastChannel, function2);
        } else {
            broadcastCoroutine = new kotlinx.coroutines.channels.BroadcastCoroutine(newCoroutineContext, BroadcastChannel, true);
        }
        if (function1 != null) {
            broadcastCoroutine.invokeOnCompletion(function1);
        }
        broadcastCoroutine.start(coroutineStart, broadcastCoroutine, function2);
        return broadcastCoroutine;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HZeuuBCWkfg6xjDbd9YApYs80LQ(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Throwable th) {
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
        return kotlin.Unit.INSTANCE;
    }
}

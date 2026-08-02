package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\n2\u0019\u0010\u0015\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u000e¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\n0\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00108\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040*8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,"}, d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", "T", "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "channel", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;)V", "Lkotlin/Function0;", "", "block", "awaitClose", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "element", "offer", "(Ljava/lang/Object;)Z", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SimpleProducerScopeImpl<T> implements androidx.paging.SimpleProducerScope<T>, kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.channels.SendChannel<T> {
    private final kotlinx.coroutines.channels.SendChannel<T> channel;
    private final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleProducerScopeImpl(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.channels.SendChannel<? super T> sendChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendChannel, "");
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.channel = sendChannel;
    }

    @Override // androidx.paging.SimpleProducerScope
    public final kotlinx.coroutines.channels.SendChannel<T> getChannel() {
        return this.channel;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.paging.SimpleProducerScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitClose(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.SimpleProducerScopeImpl$awaitClose$1 simpleProducerScopeImpl$awaitClose$1;
        int i;
        try {
            if (continuation instanceof androidx.paging.SimpleProducerScopeImpl$awaitClose$1) {
                simpleProducerScopeImpl$awaitClose$1 = (androidx.paging.SimpleProducerScopeImpl$awaitClose$1) continuation;
                if ((simpleProducerScopeImpl$awaitClose$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    simpleProducerScopeImpl$awaitClose$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = simpleProducerScopeImpl$awaitClose$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = simpleProducerScopeImpl$awaitClose$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.coroutines.CoroutineContext.Element element = getLocalContext().get(kotlinx.coroutines.Job.INSTANCE);
                        if (element == null) {
                            throw new java.lang.IllegalStateException("Internal error, context should have a job.".toString());
                        }
                        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) element;
                        simpleProducerScopeImpl$awaitClose$1.getHighResolutionOutputSizeshNQ4ISI = function0;
                        simpleProducerScopeImpl$awaitClose$1.getHighSpeedVideoSizes = job;
                        simpleProducerScopeImpl$awaitClose$1.getHighSpeedVideoFpsRanges = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(simpleProducerScopeImpl$awaitClose$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                                return kotlin.Unit.INSTANCE;
                            }
                        });
                        java.lang.Object result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(simpleProducerScopeImpl$awaitClose$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (kotlin.jvm.functions.Function0) simpleProducerScopeImpl$awaitClose$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    function0.invoke();
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            function0.invoke();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            function0.invoke();
            throw th;
        }
        simpleProducerScopeImpl$awaitClose$1 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$1(this, continuation);
        java.lang.Object obj2 = simpleProducerScopeImpl$awaitClose$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = simpleProducerScopeImpl$awaitClose$1.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo9266trySendJP2dKIU(T element) {
        return this.channel.mo9266trySendJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final java.lang.Object send(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.channel.send(t, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public final boolean offer(T element) {
        return this.channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return this.channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.channel.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final kotlinx.coroutines.selects.SelectClause2<T, kotlinx.coroutines.channels.SendChannel<T>> getOnSend() {
        return this.channel.getOnSend();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final kotlin.coroutines.CoroutineContext getLocalContext() {
        return this.getHighSpeedVideoFpsRanges.getLocalContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(java.lang.Throwable cause) {
        return this.channel.close(cause);
    }
}

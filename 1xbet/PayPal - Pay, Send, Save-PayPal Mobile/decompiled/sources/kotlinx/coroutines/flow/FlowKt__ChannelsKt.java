package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "p0", "", "emitAll", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p1", "getHighSpeedVideoSizes", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "receiveAsFlow", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/flow/Flow;", "consumeAsFlow", "Lkotlinx/coroutines/CoroutineScope;", "produceIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(flowCollector, receiveChannel, true, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:12:0x0037, B:14:0x0061, B:17:0x0075, B:19:0x007d, B:31:0x0053, B:33:0x005d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends T> it;
        kotlinx.coroutines.channels.ChannelIterator<? extends T> channelIterator;
        ?? r2;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) continuation;
                if ((flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = flowKt__ChannelsKt$emitAllImpl$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowKt.ensureActive(flowCollector);
                        it = receiveChannel.iterator();
                        flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRanges = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoSizes = it;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRangesFor = z;
                        flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRangesFor;
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoSizes;
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector3 = flowCollector2;
                        it = channelIterator;
                        flowCollector = flowCollector3;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRanges = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoSizes = it;
                        flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRangesFor = z;
                        flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext != coroutine_suspended) {
                            r2 = flowCollector;
                            channelIterator = it;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                T next = channelIterator.next();
                                flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRanges = r2;
                                flowKt__ChannelsKt$emitAllImpl$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                                flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoSizes = channelIterator;
                                flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRangesFor = z;
                                flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap = 2;
                                java.lang.Object emit = r2.emit(next, flowKt__ChannelsKt$emitAllImpl$1);
                                flowCollector3 = r2;
                            } else {
                                if (z) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                    z = flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRangesFor;
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoSizes;
                    receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) flowKt__ChannelsKt$emitAllImpl$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = flowCollector4;
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        java.lang.Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ChannelsKt$emitAllImpl$1.Camera2StreamConfigurationMap;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel) {
        return new kotlinx.coroutines.flow.ChannelAsFlow(receiveChannel, false);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel) {
        return new kotlinx.coroutines.flow.ChannelAsFlow(receiveChannel, true);
    }

    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return kotlinx.coroutines.flow.internal.ChannelFlowKt.asChannelFlow(flow).produceImpl(coroutineScope);
    }
}

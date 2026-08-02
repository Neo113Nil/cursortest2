package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [V] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID, 499, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$zip$2<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        r1 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2 A[Catch: all -> 0x00e5, TryCatch #2 {all -> 0x00e5, blocks: (B:14:0x0093, B:16:0x009b, B:19:0x00ba, B:21:0x00c2, B:26:0x00e7, B:43:0x0048), top: B:42:0x0048 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.channels.ChannelIterator it2;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlin.jvm.functions.Function2 function22;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                it = this.Camera2StreamConfigurationMap.iterator();
                receiveChannel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                function2 = this.getHighSpeedVideoSizes;
                it2 = receiveChannel2.iterator();
            } else {
                if (i == 1) {
                    it2 = (kotlinx.coroutines.channels.ChannelIterator) this.getOutputMinFrameDuration;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getInputFormats;
                    function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                    it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2 function23 = function2;
                    receiveChannel = receiveChannel2;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        java.lang.Object next = it2.next();
                        this.getOutputFormats = producerScope;
                        this.getHighSpeedVideoFpsRangesFor = it;
                        this.getHighSpeedVideoFpsRanges = function23;
                        this.getInputFormats = receiveChannel;
                        this.getOutputMinFrameDuration = it2;
                        this.getInputSizeshNQ4ISI = next;
                        this.getHighSpeedVideoSizesFor = 2;
                        java.lang.Object hasNext = it.hasNext(this);
                        if (hasNext != coroutine_suspended) {
                            kotlinx.coroutines.channels.ChannelIterator channelIterator3 = it2;
                            obj2 = next;
                            obj = hasNext;
                            producerScope2 = producerScope;
                            channelIterator = it;
                            function22 = function23;
                            channelIterator2 = channelIterator3;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            it2 = channelIterator2;
                            receiveChannel2 = receiveChannel;
                            function2 = function22;
                            it = channelIterator;
                            producerScope = producerScope2;
                        }
                        return coroutine_suspended;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    obj2 = this.getInputSizeshNQ4ISI;
                    channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.getOutputMinFrameDuration;
                    receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.getInputFormats;
                    function22 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
                    producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            java.lang.Object invoke = function22.invoke(obj2, channelIterator.next());
                            this.getOutputFormats = producerScope2;
                            this.getHighSpeedVideoFpsRangesFor = channelIterator;
                            this.getHighSpeedVideoFpsRanges = function22;
                            this.getInputFormats = receiveChannel;
                            this.getOutputMinFrameDuration = channelIterator2;
                            this.getInputSizeshNQ4ISI = null;
                            this.getHighSpeedVideoSizesFor = 3;
                            if (producerScope2.send(invoke, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        it2 = channelIterator2;
                        receiveChannel2 = receiveChannel;
                        function2 = function22;
                        it = channelIterator;
                        producerScope = producerScope2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                            throw th2;
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (kotlinx.coroutines.channels.ChannelIterator) this.getOutputMinFrameDuration;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getInputFormats;
                    function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                    it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            }
            this.getOutputFormats = producerScope;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighSpeedVideoFpsRanges = function2;
            this.getInputFormats = receiveChannel2;
            this.getOutputMinFrameDuration = it2;
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizesFor = 1;
            obj = it2.hasNext(this);
        } catch (java.lang.Throwable th3) {
            th = th3;
            receiveChannel = receiveChannel2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        channelsKt__DeprecatedKt$zip$2.getOutputFormats = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$zip$2(kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = receiveChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel2;
        this.getHighSpeedVideoSizes = function2;
    }
}

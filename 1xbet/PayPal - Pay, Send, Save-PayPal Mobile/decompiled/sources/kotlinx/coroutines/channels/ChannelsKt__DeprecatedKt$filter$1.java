package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$filter$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (r10 != r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        E e;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
            it = this.Camera2StreamConfigurationMap.iterator();
        } else {
            if (i == 1) {
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    E next = it.next();
                    kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getInputSizeshNQ4ISI = producerScope;
                    this.getHighSpeedVideoFpsRanges = it;
                    this.getHighSpeedVideoSizes = next;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    java.lang.Object invoke = function2.invoke(next, this);
                    if (invoke != coroutine_suspended) {
                        kotlinx.coroutines.channels.ProducerScope producerScope3 = producerScope;
                        e = next;
                        obj = invoke;
                        producerScope2 = producerScope3;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        producerScope = producerScope2;
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i == 2) {
                java.lang.Object obj2 = this.getHighSpeedVideoSizes;
                kotlinx.coroutines.channels.ChannelIterator<E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                e = obj2;
                it = channelIterator;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    this.getInputSizeshNQ4ISI = producerScope2;
                    this.getHighSpeedVideoFpsRanges = it;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRangesFor = 3;
                    if (producerScope2.send(e, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
            }
        }
        this.getInputSizeshNQ4ISI = producerScope;
        this.getHighSpeedVideoFpsRanges = it;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = 1;
        obj = it.hasNext(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        channelsKt__DeprecatedKt$filter$1.getInputSizeshNQ4ISI = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$filter$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = receiveChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}

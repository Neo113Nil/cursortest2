package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$map$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
    
        if (r12 != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b4 -> B:9:0x0072). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                receiveChannel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                function2 = this.getHighSpeedVideoFpsRangesFor;
                it = receiveChannel2.iterator();
            } else {
                if (i == 1) {
                    it = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoSizes;
                    function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        java.lang.Object next = it.next();
                        this.getOutputFormats = producerScope;
                        this.getHighSpeedVideoFpsRanges = function2;
                        this.getHighSpeedVideoSizes = receiveChannel2;
                        this.Camera2StreamConfigurationMap = it;
                        this.getInputFormats = producerScope;
                        this.getInputSizeshNQ4ISI = 2;
                        obj = function2.invoke(next, this);
                        if (obj != coroutine_suspended) {
                            producerScope2 = producerScope;
                            this.getOutputFormats = producerScope2;
                            this.getHighSpeedVideoFpsRanges = function2;
                            this.getHighSpeedVideoSizes = receiveChannel2;
                            this.Camera2StreamConfigurationMap = it;
                            this.getInputFormats = null;
                            this.getInputSizeshNQ4ISI = 3;
                            if (producerScope.send(obj, this) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getInputFormats;
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
                    receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                    producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        producerScope = producerScope3;
                        it = channelIterator;
                        receiveChannel2 = receiveChannel;
                        function2 = function22;
                        this.getOutputFormats = producerScope2;
                        this.getHighSpeedVideoFpsRanges = function2;
                        this.getHighSpeedVideoSizes = receiveChannel2;
                        this.Camera2StreamConfigurationMap = it;
                        this.getInputFormats = null;
                        this.getInputSizeshNQ4ISI = 3;
                        if (producerScope.send(obj, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoSizes;
                    function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            }
            this.getOutputFormats = producerScope;
            this.getHighSpeedVideoFpsRanges = function2;
            this.getHighSpeedVideoSizes = receiveChannel2;
            this.Camera2StreamConfigurationMap = it;
            this.getInputSizeshNQ4ISI = 1;
            obj = it.hasNext(this);
        } catch (java.lang.Throwable th3) {
            th = th3;
            receiveChannel = receiveChannel2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        channelsKt__DeprecatedKt$map$1.getOutputFormats = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$map$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}

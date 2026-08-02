package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$mapIndexed$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (r12 != r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a5 -> B:7:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator it;
        int i;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            it = this.getHighSpeedVideoFpsRangesFor.iterator();
            i = 0;
        } else {
            if (i2 == 1) {
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
                    int i3 = i + 1;
                    java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighSpeedVideoFpsRanges = it;
                    this.Camera2StreamConfigurationMap = producerScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = i3;
                    this.getHighSpeedVideoSizesFor = 2;
                    obj = function3.invoke(boxInt, next, this);
                    if (obj != coroutine_suspended) {
                        producerScope2 = producerScope;
                        i = i3;
                        this.getOutputMinFrameDuration = producerScope2;
                        this.getHighSpeedVideoFpsRanges = it;
                        this.Camera2StreamConfigurationMap = null;
                        this.getHighResolutionOutputSizeshNQ4ISI = i;
                        this.getHighSpeedVideoSizesFor = 3;
                        if (producerScope.send(obj, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i2 == 2) {
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
                kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = producerScope3;
                it = channelIterator;
                this.getOutputMinFrameDuration = producerScope2;
                this.getHighSpeedVideoFpsRanges = it;
                this.Camera2StreamConfigurationMap = null;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.getHighSpeedVideoSizesFor = 3;
                if (producerScope.send(obj, this) != coroutine_suspended) {
                    producerScope = producerScope2;
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getOutputMinFrameDuration = producerScope;
        this.getHighSpeedVideoFpsRanges = it;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = 1;
        obj = it.hasNext(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.getOutputMinFrameDuration = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$mapIndexed$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = receiveChannel;
        this.getHighSpeedVideoSizes = function3;
    }
}

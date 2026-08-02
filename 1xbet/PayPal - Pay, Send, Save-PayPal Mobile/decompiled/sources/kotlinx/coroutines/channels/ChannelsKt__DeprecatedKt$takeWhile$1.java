package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$takeWhile$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r10 != r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009d -> B:7:0x0050). Please report as a decompilation issue!!! */
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
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizesFor;
            it = this.getHighSpeedVideoSizes.iterator();
        } else {
            if (i == 1) {
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    E next = it.next();
                    kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoSizesFor = producerScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = it;
                    this.getHighSpeedVideoFpsRanges = next;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    java.lang.Object invoke = function2.invoke(next, this);
                    if (invoke != coroutine_suspended) {
                        kotlinx.coroutines.channels.ProducerScope producerScope3 = producerScope;
                        e = next;
                        obj = invoke;
                        producerScope2 = producerScope3;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i == 2) {
                java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
                kotlinx.coroutines.channels.ChannelIterator<E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                e = obj2;
                it = channelIterator;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getHighSpeedVideoSizesFor = producerScope2;
                this.getHighResolutionOutputSizeshNQ4ISI = it;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoFpsRangesFor = 3;
                if (producerScope2.send(e, this) != coroutine_suspended) {
                    producerScope = producerScope2;
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizesFor = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = it;
        this.getHighSpeedVideoFpsRangesFor = 1;
        obj = it.hasNext(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        channelsKt__DeprecatedKt$takeWhile$1.getHighSpeedVideoSizesFor = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$takeWhile$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = receiveChannel;
        this.Camera2StreamConfigurationMap = function2;
    }
}

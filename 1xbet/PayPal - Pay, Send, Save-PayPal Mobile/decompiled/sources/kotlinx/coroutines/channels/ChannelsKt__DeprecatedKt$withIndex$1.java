package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$withIndex$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        if (r9 != r0) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0077 -> B:6:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
            it = this.getHighSpeedVideoFpsRangesFor.iterator();
            i = 0;
        } else {
            if (i2 == 1) {
                i = this.getHighSpeedVideoSizes;
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    int i3 = i + 1;
                    this.Camera2StreamConfigurationMap = producerScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = it;
                    this.getHighSpeedVideoSizes = i3;
                    this.getHighSpeedVideoFpsRanges = 2;
                    if (producerScope.send(new kotlin.collections.IndexedValue(i, it.next()), this) != coroutine_suspended) {
                        i = i3;
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighSpeedVideoSizes;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.Camera2StreamConfigurationMap = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = it;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = 1;
        obj = it.hasNext(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        channelsKt__DeprecatedKt$withIndex$1.Camera2StreamConfigurationMap = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$withIndex$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = receiveChannel;
    }
}

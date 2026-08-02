package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {26, 27}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class BroadcastKt$broadcast$2<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r4.send(r1.next(), r7) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            it = this.Camera2StreamConfigurationMap.iterator();
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighSpeedVideoSizes = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope2;
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighSpeedVideoSizes = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
                producerScope2 = producerScope;
                obj = hasNext;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = producerScope2;
                this.getHighSpeedVideoFpsRangesFor = it;
                this.getHighSpeedVideoSizes = 2;
            }
            return coroutine_suspended;
        }
        it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.BroadcastKt$broadcast$2) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$2(this.Camera2StreamConfigurationMap, continuation);
        broadcastKt$broadcast$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return broadcastKt$broadcast$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BroadcastKt$broadcast$2(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastKt$broadcast$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = receiveChannel;
    }
}

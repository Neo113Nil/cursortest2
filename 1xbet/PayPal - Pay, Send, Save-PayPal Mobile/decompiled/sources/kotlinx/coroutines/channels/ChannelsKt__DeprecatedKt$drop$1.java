package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 199, 200}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$drop$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a5, code lost:
    
        if (r4.send(r1.next(), r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r1 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a5 -> B:7:0x001c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0063 -> B:23:0x0065). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator<E> it2;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
            i = this.Camera2StreamConfigurationMap;
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested element count ");
                sb.append(i);
                sb.append(" is less than zero.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (i > 0) {
                it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                producerScope2 = producerScope;
                this.getOutputFormats = producerScope2;
                this.getHighSpeedVideoSizes = it;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = it.hasNext(this);
            }
            it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            this.getOutputFormats = producerScope;
            this.getHighSpeedVideoSizes = it2;
            this.getHighSpeedVideoFpsRangesFor = 2;
            hasNext = it2.hasNext(this);
            if (hasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            i = this.getHighSpeedVideoFpsRanges;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                it.next();
                i--;
            }
            producerScope = producerScope2;
            it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            this.getOutputFormats = producerScope;
            this.getHighSpeedVideoSizes = it2;
            this.getHighSpeedVideoFpsRangesFor = 2;
            hasNext = it2.hasNext(this);
            if (hasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
            producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope3;
            this.getOutputFormats = producerScope;
            this.getHighSpeedVideoSizes = it2;
            this.getHighSpeedVideoFpsRangesFor = 2;
            hasNext = it2.hasNext(this);
            if (hasNext != coroutine_suspended) {
                producerScope3 = producerScope;
                obj = hasNext;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getOutputFormats = producerScope3;
                this.getHighSpeedVideoSizes = it2;
                this.getHighSpeedVideoFpsRangesFor = 3;
            }
            return coroutine_suspended;
        }
        it2 = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
        producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        channelsKt__DeprecatedKt$drop$1.getOutputFormats = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$drop$1(int i, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
    }
}

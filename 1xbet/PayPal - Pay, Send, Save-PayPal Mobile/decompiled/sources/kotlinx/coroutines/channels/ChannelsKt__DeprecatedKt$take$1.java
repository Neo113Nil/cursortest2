package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$take$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        if (r5.send(r4.next(), r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0078 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                return kotlin.Unit.INSTANCE;
            }
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested element count ");
                sb.append(i);
                sb.append(" is less than zero.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            it = this.getHighSpeedVideoFpsRangesFor.iterator();
            this.getOutputMinFrameDuration = producerScope;
            this.getHighSpeedVideoSizes = it;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.Camera2StreamConfigurationMap;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope2;
            i--;
            if (i == 0) {
                return kotlin.Unit.INSTANCE;
            }
            this.getOutputMinFrameDuration = producerScope;
            this.getHighSpeedVideoSizes = it;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
                producerScope2 = producerScope;
                obj = hasNext;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getOutputMinFrameDuration = producerScope2;
                this.getHighSpeedVideoSizes = it;
                this.Camera2StreamConfigurationMap = i;
                this.getHighSpeedVideoFpsRanges = 2;
            }
            return coroutine_suspended;
        }
        i = this.Camera2StreamConfigurationMap;
        it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        channelsKt__DeprecatedKt$take$1.getOutputMinFrameDuration = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$take$1(int i, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = receiveChannel;
    }
}

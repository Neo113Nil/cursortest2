package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {211, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$dropWhile$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f7, code lost:
    
        if (r4.send(r1.next(), r11) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r1.send(r9, r11) != r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00f7 -> B:9:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a5 -> B:27:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object hasNext;
        kotlinx.coroutines.channels.ChannelIterator<E> it2;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2;
        java.lang.Object hasNext2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            this.getOutputMinFrameDuration = producerScope;
            this.Camera2StreamConfigurationMap = it;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            channelIterator = channelIterator3;
            producerScope2 = producerScope4;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
            it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            this.getOutputMinFrameDuration = producerScope2;
            this.Camera2StreamConfigurationMap = it2;
            this.getHighSpeedVideoFpsRanges = 4;
            hasNext2 = it2.hasNext(this);
            if (hasNext2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 2) {
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            E e = obj2;
            producerScope2 = producerScope5;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                producerScope = producerScope2;
                it = channelIterator;
                this.getOutputMinFrameDuration = producerScope;
                this.Camera2StreamConfigurationMap = it;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                    kotlinx.coroutines.channels.ChannelIterator<E> channelIterator4 = it;
                    producerScope2 = producerScope;
                    obj = hasNext;
                    channelIterator = channelIterator4;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        E next = channelIterator.next();
                        kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                        this.getOutputMinFrameDuration = producerScope2;
                        this.Camera2StreamConfigurationMap = channelIterator;
                        this.getHighSpeedVideoFpsRangesFor = next;
                        this.getHighSpeedVideoFpsRanges = 2;
                        java.lang.Object invoke = function2.invoke(next, this);
                        if (invoke != coroutine_suspended) {
                            e = next;
                            obj = invoke;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                    this.getOutputMinFrameDuration = producerScope2;
                    this.Camera2StreamConfigurationMap = it2;
                    this.getHighSpeedVideoFpsRanges = 4;
                    hasNext2 = it2.hasNext(this);
                    if (hasNext2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            this.getOutputMinFrameDuration = producerScope2;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = 3;
        } else {
            if (i == 3) {
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                this.getOutputMinFrameDuration = producerScope2;
                this.Camera2StreamConfigurationMap = it2;
                this.getHighSpeedVideoFpsRanges = 4;
                hasNext2 = it2.hasNext(this);
                if (hasNext2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                it2 = channelIterator2;
                producerScope2 = producerScope3;
                this.getOutputMinFrameDuration = producerScope2;
                this.Camera2StreamConfigurationMap = it2;
                this.getHighSpeedVideoFpsRanges = 4;
                hasNext2 = it2.hasNext(this);
                if (hasNext2 != coroutine_suspended) {
                    kotlinx.coroutines.channels.ProducerScope producerScope6 = producerScope2;
                    channelIterator2 = it2;
                    obj = hasNext2;
                    producerScope3 = producerScope6;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.getOutputMinFrameDuration = producerScope3;
                    this.Camera2StreamConfigurationMap = channelIterator2;
                    this.getHighSpeedVideoFpsRanges = 5;
                }
                return coroutine_suspended;
            }
            channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
            producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.getOutputMinFrameDuration = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$dropWhile$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
        this.getHighSpeedVideoSizes = function2;
    }
}

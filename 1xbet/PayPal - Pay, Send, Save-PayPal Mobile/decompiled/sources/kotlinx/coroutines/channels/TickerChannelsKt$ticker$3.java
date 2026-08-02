package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TickerChannelsKt$ticker$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.TickerMode getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r10.Camera2StreamConfigurationMap, r10.getHighSpeedVideoFpsRangesFor, r11.getChannel(), r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r10.Camera2StreamConfigurationMap, r10.getHighSpeedVideoFpsRangesFor, r11.getChannel(), r10) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = kotlinx.coroutines.channels.TickerChannelsKt$ticker$3.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()];
            if (i2 == 1) {
                this.getHighSpeedVideoFpsRanges = 1;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.TickerChannelsKt$ticker$3) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.TickerMode.values().length];
            try {
                iArr[kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.TickerMode.FIXED_DELAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        tickerChannelsKt$ticker$3.getHighResolutionOutputSizeshNQ4ISI = obj;
        return tickerChannelsKt$ticker$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TickerChannelsKt$ticker$3(kotlinx.coroutines.channels.TickerMode tickerMode, long j, long j2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt$ticker$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = tickerMode;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
    }
}

package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/channels/TickerMode;", "mode", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "ticker", "(JJLkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/TickerMode;)Lkotlinx/coroutines/channels/ReceiveChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TickerChannelsKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r8, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007b -> B:12:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fixedDelayTicker(long j, long j2, kotlinx.coroutines.channels.SendChannel sendChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 tickerChannelsKt$fixedDelayTicker$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.channels.SendChannel sendChannel2;
        kotlin.Unit unit;
        if (continuation instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) {
            tickerChannelsKt$fixedDelayTicker$1 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) continuation;
            if ((tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = tickerChannelsKt$fixedDelayTicker$1.getHighResolutionOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges = sendChannel;
                    tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor = j;
                    tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap = 1;
                } else if (i == 1) {
                    j = tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor;
                    sendChannel = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    j = tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor;
                    sendChannel2 = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges = sendChannel2;
                    tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor = j;
                    tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap = 3;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor;
                    sendChannel2 = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    sendChannel = sendChannel2;
                }
                unit = kotlin.Unit.INSTANCE;
                tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges = sendChannel;
                tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor = j;
                tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap = 2;
                if (sendChannel.send(unit, tickerChannelsKt$fixedDelayTicker$1) != coroutine_suspended) {
                    sendChannel2 = sendChannel;
                    tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges = sendChannel2;
                    tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor = j;
                    tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap = 3;
                }
                return coroutine_suspended;
            }
        }
        tickerChannelsKt$fixedDelayTicker$1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1(continuation);
        java.lang.Object obj2 = tickerChannelsKt$fixedDelayTicker$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        unit = kotlin.Unit.INSTANCE;
        tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRanges = sendChannel;
        tickerChannelsKt$fixedDelayTicker$1.getHighSpeedVideoFpsRangesFor = j;
        tickerChannelsKt$fixedDelayTicker$1.Camera2StreamConfigurationMap = 2;
        if (sendChannel.send(unit, tickerChannelsKt$fixedDelayTicker$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r1) != r2) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00fb -> B:15:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0111 -> B:13:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fixedPeriodTicker(long j, long j2, kotlinx.coroutines.channels.SendChannel sendChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.channels.SendChannel sendChannel2;
        long j3;
        long j4;
        long delayToNanos;
        long j5;
        long j6;
        kotlinx.coroutines.channels.SendChannel sendChannel3;
        char c;
        long j7;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource2;
        long coerceAtLeast;
        char c2;
        char c3;
        kotlin.Unit unit;
        if (continuation instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) {
            tickerChannelsKt$fixedPeriodTicker$1 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) continuation;
            if ((tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = tickerChannelsKt$fixedPeriodTicker$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
                    long nanoTime = (abstractTimeSource != null ? abstractTimeSource.nanoTime() : java.lang.System.nanoTime()) + kotlinx.coroutines.EventLoop_commonKt.delayToNanos(j2);
                    sendChannel2 = sendChannel;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel2;
                    j3 = j;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j3;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = nanoTime;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j2, tickerChannelsKt$fixedPeriodTicker$1) != coroutine_suspended) {
                        j4 = nanoTime;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    j4 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges;
                    long j8 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.channels.SendChannel sendChannel4 = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    sendChannel2 = sendChannel4;
                    j3 = j8;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            j6 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges;
                            j5 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor;
                            sendChannel3 = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            c = 3;
                            long j9 = j6;
                            j4 = j5;
                            delayToNanos = j9;
                            sendChannel2 = sendChannel3;
                            long j10 = j4 + delayToNanos;
                            unit = kotlin.Unit.INSTANCE;
                            tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel2;
                            tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j10;
                            tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = delayToNanos;
                            tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 2;
                            if (sendChannel2.send(unit, tickerChannelsKt$fixedPeriodTicker$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges;
                        j7 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor;
                        sendChannel3 = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        c3 = 4;
                        c2 = 3;
                        long j11 = j6;
                        j4 = j7;
                        delayToNanos = j11;
                        sendChannel2 = sendChannel3;
                        long j102 = j4 + delayToNanos;
                        unit = kotlin.Unit.INSTANCE;
                        tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel2;
                        tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j102;
                        tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = delayToNanos;
                        tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 2;
                        if (sendChannel2.send(unit, tickerChannelsKt$fixedPeriodTicker$1) != coroutine_suspended) {
                            sendChannel3 = sendChannel2;
                            j6 = delayToNanos;
                            j7 = j102;
                            abstractTimeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
                            long nanoTime2 = abstractTimeSource2 == null ? abstractTimeSource2.nanoTime() : java.lang.System.nanoTime();
                            coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(j7 - nanoTime2, 0L);
                            if (coerceAtLeast == 0 || j6 == 0) {
                                c2 = 3;
                                long delayNanosToMillis = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(coerceAtLeast);
                                tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel3;
                                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j7;
                                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = j6;
                                c3 = 4;
                                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 4;
                            } else {
                                long j12 = j6 - ((nanoTime2 - j7) % j6);
                                j5 = nanoTime2 + j12;
                                long delayNanosToMillis2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(j12);
                                tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel3;
                                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j5;
                                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = j6;
                                c = 3;
                                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 3;
                            }
                        }
                        return coroutine_suspended;
                    }
                    j6 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges;
                    j7 = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor;
                    sendChannel3 = (kotlinx.coroutines.channels.SendChannel) tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    abstractTimeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
                    if (abstractTimeSource2 == null) {
                    }
                    coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(j7 - nanoTime2, 0L);
                    if (coerceAtLeast == 0) {
                    }
                    c2 = 3;
                    long delayNanosToMillis3 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(coerceAtLeast);
                    tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel3;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j7;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = j6;
                    c3 = 4;
                    tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 4;
                }
                delayToNanos = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(j3);
                long j1022 = j4 + delayToNanos;
                unit = kotlin.Unit.INSTANCE;
                tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel2;
                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j1022;
                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = delayToNanos;
                tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 2;
                if (sendChannel2.send(unit, tickerChannelsKt$fixedPeriodTicker$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        tickerChannelsKt$fixedPeriodTicker$1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1(continuation);
        java.lang.Object obj2 = tickerChannelsKt$fixedPeriodTicker$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        delayToNanos = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(j3);
        long j10222 = j4 + delayToNanos;
        unit = kotlin.Unit.INSTANCE;
        tickerChannelsKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = sendChannel2;
        tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRangesFor = j10222;
        tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoFpsRanges = delayToNanos;
        tickerChannelsKt$fixedPeriodTicker$1.getHighSpeedVideoSizes = 2;
        if (sendChannel2.send(unit, tickerChannelsKt$fixedPeriodTicker$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel ticker$default(long j, long j2, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.TickerMode tickerMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 8) != 0) {
            tickerMode = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD;
        }
        return ticker(j, j2, coroutineContext, tickerMode);
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> ticker(long j, long j2, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.TickerMode tickerMode) {
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected non-negative delay, but has ");
            sb.append(j);
            sb.append(" ms");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (j2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected non-negative initial delay, but has ");
            sb2.append(j2);
            sb2.append(" ms");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        return kotlinx.coroutines.channels.ProduceKt.produce(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getUnconfined().plus(coroutineContext), 0, new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3(tickerMode, j, j2, null));
    }
}

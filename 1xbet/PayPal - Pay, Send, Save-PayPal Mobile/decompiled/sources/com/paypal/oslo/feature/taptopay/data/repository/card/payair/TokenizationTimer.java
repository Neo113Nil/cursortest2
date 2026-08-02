package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010'\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R,\u0010$\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00190\u0019*\f\u0012\b\u0012\u0006*\u00020\u00190\u00190\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010."}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimeProvider;", "timeProvider", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimeProvider;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;", "cardScheme", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;)V", "", "reason", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "(Ljava/lang/String;)V", "resume", "result", "", "stop", "(Ljava/lang/String;)J", "getCurrentElapsedTime", "()J", "reset", "()V", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEvent;", "getEvents", "()Ljava/util/List;", "", "isRunning", "()Z", "hasStarted", "getInputFormats", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimeProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicLong;", "getInputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getOutputFormats", "", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenizationTimer {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TokenizationTimer(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = timeProvider;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong(0L);
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong(0L);
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong(0L);
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getInputSizeshNQ4ISI = java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    public static /* synthetic */ void start$default(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardScheme = null;
        }
        tokenizationTimer.start(cardScheme);
    }

    public final void start(com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme) {
        java.lang.String str;
        long currentTimeMillis = this.getHighResolutionOutputSizeshNQ4ISI.currentTimeMillis();
        this.getHighSpeedVideoSizes.set(currentTimeMillis);
        this.getHighSpeedVideoFpsRanges.set(0L);
        this.Camera2StreamConfigurationMap.set(true);
        this.getOutputFormats.set(true);
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            this.getInputSizeshNQ4ISI.clear();
            java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list2 = this.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType = com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType.START;
            if (cardScheme == null || (str = cardScheme.name()) == null) {
                str = "Unknown Scheme";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tokenization started for ");
            sb.append(str);
            list2.add(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent(timerEventType, sb.toString(), currentTimeMillis, 0L, 0L, 16, null));
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Timer: Started", null, null, 6, null);
    }

    public final void pause(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        if (this.Camera2StreamConfigurationMap.get() && this.getOutputFormats.get()) {
            long currentTimeMillis = this.getHighResolutionOutputSizeshNQ4ISI.currentTimeMillis();
            long addAndGet = this.getHighSpeedVideoFpsRanges.addAndGet(currentTimeMillis - this.getHighSpeedVideoSizes.get());
            this.getHighSpeedVideoFpsRangesFor.set(currentTimeMillis);
            this.Camera2StreamConfigurationMap.set(false);
            this.getHighSpeedVideoSizes.set(0L);
            this.getInputSizeshNQ4ISI.add(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType.PAUSE, reason, currentTimeMillis, addAndGet, 0L, 16, null));
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timer: Paused - ");
            sb.append(reason);
            sb.append(". Accumulated time: ");
            sb.append(addAndGet);
            sb.append("ms");
            com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
        }
    }

    public final void resume(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        if (this.Camera2StreamConfigurationMap.get() || !this.getOutputFormats.get()) {
            return;
        }
        long currentTimeMillis = this.getHighResolutionOutputSizeshNQ4ISI.currentTimeMillis();
        long j = this.getHighSpeedVideoFpsRangesFor.get();
        long j2 = j > 0 ? currentTimeMillis - j : 0L;
        this.getHighSpeedVideoSizes.set(currentTimeMillis);
        this.Camera2StreamConfigurationMap.set(true);
        long j3 = this.getHighSpeedVideoFpsRanges.get();
        this.getInputSizeshNQ4ISI.add(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType.RESUME, reason, currentTimeMillis, j3, j2));
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair pair = kotlin.TuplesKt.to("reason", reason);
        kotlin.Pair pair2 = kotlin.TuplesKt.to("accumulated_time_ms", java.lang.Long.valueOf(j3));
        kotlin.Pair pair3 = kotlin.TuplesKt.to("pause_duration_ms", java.lang.Long.valueOf(j2));
        java.lang.String format = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j2 / 1000.0d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        com.paypal.android.logger.Logger.d$default(logger, "Timer: Resumed", kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, kotlin.TuplesKt.to("pause_duration_sec", format)), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.set(0L);
    }

    public final long stop(java.lang.String result) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (!this.getOutputFormats.get()) {
            return 0L;
        }
        long currentTimeMillis = this.getHighResolutionOutputSizeshNQ4ISI.currentTimeMillis();
        long j2 = this.getHighSpeedVideoFpsRanges.get();
        long j3 = this.getHighSpeedVideoSizes.get();
        if (this.Camera2StreamConfigurationMap.get()) {
            j2 += currentTimeMillis - j3;
        }
        long j4 = j2;
        this.Camera2StreamConfigurationMap.set(false);
        this.getOutputFormats.set(false);
        this.getInputSizeshNQ4ISI.add(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType.STOP, "Tokenization complete: ".concat(java.lang.String.valueOf(result)), currentTimeMillis, j4, 0L, 16, null));
        java.lang.String format = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j4 / 1000.0d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(format);
        sb.append(lib.android.paypal.com.magnessdk.g.n2);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Timer Stopped", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", result), kotlin.TuplesKt.to("Total time", sb.toString())), null, 4, null);
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) obj).getType() == com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType.RESUME) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 += ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) it.next()).getPauseDurationMs();
        }
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list2 = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "");
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent timerEvent = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list2);
        long accumulatedTimeMs = timerEvent != null ? timerEvent.getAccumulatedTimeMs() : 0L;
        if (this.getInputSizeshNQ4ISI.size() >= 2) {
            java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list3 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list3, "");
            long absoluteTimeMs = ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) kotlin.collections.CollectionsKt.last((java.util.List) list3)).getAbsoluteTimeMs();
            java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list4 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list4, "");
            j = absoluteTimeMs - ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) kotlin.collections.CollectionsKt.first((java.util.List) list4)).getAbsoluteTimeMs();
        } else {
            j = 0;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("totalElapsedTimeMs", java.lang.Long.valueOf(j));
        linkedHashMap.put("totalElapsedTimeSec", java.lang.Double.valueOf(j / 1000.0d));
        linkedHashMap.put("totalPauseTimeMs", java.lang.Long.valueOf(j5));
        linkedHashMap.put("totalPauseTimeSec", java.lang.Double.valueOf(j5 / 1000.0d));
        linkedHashMap.put("totalActiveTimeMs", java.lang.Long.valueOf(accumulatedTimeMs));
        linkedHashMap.put("totalActiveSec", java.lang.Double.valueOf(accumulatedTimeMs / 1000.0d));
        linkedHashMap.put("result", result);
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list5 = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list5, "");
        int i = 0;
        for (java.lang.Object obj2 : list5) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent timerEvent2 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) obj2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("event_");
            sb2.append(i);
            sb2.append("_type");
            linkedHashMap.put(sb2.toString(), timerEvent2.getType().name());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("event_");
            sb3.append(i);
            sb3.append("_reason");
            linkedHashMap.put(sb3.toString(), timerEvent2.getReason());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("event_");
            sb4.append(i);
            sb4.append("_timestamp");
            java.lang.String obj3 = sb4.toString();
            java.lang.String format2 = new java.text.SimpleDateFormat("HH:mm:ss.SSS", java.util.Locale.US).format(new java.util.Date(timerEvent2.getAbsoluteTimeMs()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            linkedHashMap.put(obj3, format2);
            i++;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Tokenization timer event", linkedHashMap, null, 4, null);
        return j4;
    }

    public final long getCurrentElapsedTime() {
        if (!this.getOutputFormats.get()) {
            return 0L;
        }
        if (this.Camera2StreamConfigurationMap.get()) {
            return this.getHighSpeedVideoFpsRanges.get() + (this.getHighResolutionOutputSizeshNQ4ISI.currentTimeMillis() - this.getHighSpeedVideoSizes.get());
        }
        return this.getHighSpeedVideoFpsRanges.get();
    }

    public final void reset() {
        this.getHighSpeedVideoSizes.set(0L);
        this.getHighSpeedVideoFpsRanges.set(0L);
        this.Camera2StreamConfigurationMap.set(false);
        this.getOutputFormats.set(false);
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            this.getInputSizeshNQ4ISI.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TokenizationTimer: Reset", null, null, 6, null);
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> getEvents() {
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list;
        java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list2 = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "");
        synchronized (list2) {
            java.util.List<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent> list3 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list3, "");
            list = kotlin.collections.CollectionsKt.toList(list3);
        }
        return list;
    }

    public final boolean isRunning() {
        return this.Camera2StreamConfigurationMap.get();
    }

    public final boolean hasStarted() {
        return this.getOutputFormats.get();
    }
}

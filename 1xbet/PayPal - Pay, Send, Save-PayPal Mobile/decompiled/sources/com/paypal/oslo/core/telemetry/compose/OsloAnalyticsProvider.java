package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0002!\"B5\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/OsloAnalyticsProvider;", "Lcom/paypal/pds/analytics/AnalyticsProvider;", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "getTrackerInstance", "", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleObserver;", "screenObservers", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "event", "", "track", "(Lcom/paypal/pds/analytics/AnalyticsEvent;)V", "", "currentTimestamp", "()J", "", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/pds/analytics/AnalyticsEvent;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/channels/Channel;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "Companion", "ExtractedContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OsloAnalyticsProvider implements com.paypal.pds.analytics.AnalyticsProvider {
    public static final java.lang.String AVAILABLE_CONDITION_KEY = "available";
    public static final int EVENT_CHANNEL_CAPACITY = 4096;
    public static final float VISIBILITY_THRESHOLD = 0.5f;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.channels.Channel<com.paypal.pds.analytics.AnalyticsEvent> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.Companion INSTANCE = new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.Companion(null);
    public static final int $stable = 8;
    private static volatile boolean componentVisibilityTrackingEnabled = true;
    private static volatile boolean moduleVisibilityTrackingEnabled = true;

    /* JADX WARN: Multi-variable type inference failed */
    public OsloAnalyticsProvider(kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> function1, java.util.List<? extends com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver> list, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(4096, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ OsloAnalyticsProvider(kotlin.jvm.functions.Function1 function1, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, coroutineScope);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider$1", f = "OsloAnalyticsProvider.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, nl = {127}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.channels.ChannelIterator it;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                it = com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                this.getHighSpeedVideoFpsRanges = it;
                this.getHighSpeedVideoSizes = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    try {
                    } catch (java.lang.Exception e) {
                        com.paypal.oslo.core.telemetry.LoggerKt.log.e("Failed to process analytics event", e);
                    }
                    com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.access$processEvent(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.this, (com.paypal.pds.analytics.AnalyticsEvent) it.next());
                    this.getHighSpeedVideoFpsRanges = it;
                    this.getHighSpeedVideoSizes = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/OsloAnalyticsProvider$Companion;", "", "<init>", "()V", "", "componentTrackingEnabled", "moduleTrackingEnabled", "", "configureVisibilityTracking", "(ZZ)V", "", "EVENT_CHANNEL_CAPACITY", com.visa.cbp.getEncExpo.warmup, "", "AVAILABLE_CONDITION_KEY", "Ljava/lang/String;", "", "VISIBILITY_THRESHOLD", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "p0", "componentVisibilityTrackingEnabled", "Z", "getComponentVisibilityTrackingEnabled", "()Z", "moduleVisibilityTrackingEnabled", "getModuleVisibilityTrackingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getComponentVisibilityTrackingEnabled() {
            return com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.componentVisibilityTrackingEnabled;
        }

        public final boolean getModuleVisibilityTrackingEnabled() {
            return com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.moduleVisibilityTrackingEnabled;
        }

        public final void configureVisibilityTracking(boolean componentTrackingEnabled, boolean moduleTrackingEnabled) {
            com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.componentVisibilityTrackingEnabled = componentTrackingEnabled;
            com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.moduleVisibilityTrackingEnabled = moduleTrackingEnabled;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.pds.analytics.AnalyticsProvider
    public final void track(com.paypal.pds.analytics.AnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(event);
        if (kotlinx.coroutines.channels.ChannelResult.m24088isFailureimpl(obj)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Telemetry event channel send_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, event.getClass().getSimpleName()), kotlin.TuplesKt.to("channel_is_closed", java.lang.Boolean.valueOf(kotlinx.coroutines.channels.ChannelResult.m24087isClosedimpl(obj)))), null, 4, null);
        }
    }

    @Override // com.paypal.pds.analytics.AnalyticsProvider
    public final long currentTimestamp() {
        return com.paypal.oslo.core.telemetry.util.TimeUtils.INSTANCE.currentTimeMillis();
    }

    private final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker getHighSpeedVideoSizes(com.paypal.pds.analytics.AnalyticsEvent analyticsEvent, java.lang.String str) {
        java.lang.String str2;
        androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) analyticsEvent.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getScreen());
        com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker invoke = navKey != null ? this.Camera2StreamConfigurationMap.invoke(navKey) : null;
        com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker = invoke == null ? com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker : invoke;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.telemetry.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        if (invoke == null || (str2 = invoke.toString()) == null) {
            str2 = "null";
        }
        pairArr[0] = kotlin.TuplesKt.to("moduleTracker", str2);
        pairArr[1] = kotlin.TuplesKt.to("usingFallback", java.lang.String.valueOf(invoke == null));
        pairArr[2] = kotlin.TuplesKt.to("tracker", analyticsTracker.toString());
        com.paypal.android.logger.Logger.d$default(logger, str, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return analyticsTracker;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/OsloAnalyticsProvider$ExtractedContexts;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "p0", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "p1", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "p2", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Ljava/util/List;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    static final /* data */ class ExtractedContexts {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public ExtractedContexts(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
            this.getHighResolutionOutputSizeshNQ4ISI = uIContext;
            this.getHighSpeedVideoFpsRanges = list;
            this.getHighSpeedVideoFpsRangesFor = userIntentContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtractedContexts(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(uIContext);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(list);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(userIntentContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts extractedContexts = (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, extractedContexts.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, extractedContexts.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, extractedContexts.getHighSpeedVideoFpsRangesFor);
        }
    }

    public static final /* synthetic */ void access$processEvent(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider osloAnalyticsProvider, com.paypal.pds.analytics.AnalyticsEvent analyticsEvent) {
        androidx.navigation3.runtime.NavKey access$extractScreenDestination;
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable screenAvailable;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext;
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleDisappeared moduleDisappeared = null;
        if (!(analyticsEvent instanceof com.paypal.pds.analytics.AnalyticsEvent.Click)) {
            if (!(analyticsEvent instanceof com.paypal.pds.analytics.AnalyticsEvent.Show)) {
                if (!(analyticsEvent instanceof com.paypal.pds.analytics.AnalyticsEvent.Hide)) {
                    if (!com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.isLoaded(analyticsEvent)) {
                        if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.isReady(analyticsEvent)) {
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext2 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUIContext(analyticsEvent);
                            if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasComponent(buildUIContext2) || com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasModule(buildUIContext2) || (access$extractScreenDestination = com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$extractScreenDestination(analyticsEvent)) == null) {
                                return;
                            }
                            com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready ready = new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready(access$extractScreenDestination);
                            java.util.Iterator<T> it = osloAnalyticsProvider.getHighSpeedVideoFpsRangesFor.iterator();
                            while (it.hasNext()) {
                                ((com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver) it.next()).onScreenReady(ready);
                            }
                            return;
                        }
                        return;
                    }
                    com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker highSpeedVideoSizes = osloAnalyticsProvider.getHighSpeedVideoSizes(analyticsEvent, "Auto-capture available tracker");
                    com.paypal.pds.analytics.AnalyticsEvent analyticsEvent2 = analyticsEvent;
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext3 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUIContext(analyticsEvent2);
                    java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildDomainContexts = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildDomainContexts(analyticsEvent2);
                    com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts extractedContexts = new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts(buildUIContext3, buildDomainContexts, com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUserIntent(buildDomainContexts));
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = extractedContexts.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = extractedContexts.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = extractedContexts.getHighSpeedVideoFpsRangesFor;
                    if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasComponent(uIContext)) {
                        screenAvailable = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAvailable(uIContext, userIntentContext, list);
                    } else if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasModule(uIContext)) {
                        screenAvailable = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAvailable(uIContext, userIntentContext, list);
                    } else {
                        androidx.navigation3.runtime.NavKey access$extractScreenDestination2 = com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$extractScreenDestination(analyticsEvent);
                        if (access$extractScreenDestination2 != null) {
                            com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready ready2 = new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready(access$extractScreenDestination2);
                            java.util.Iterator<T> it2 = osloAnalyticsProvider.getHighSpeedVideoFpsRangesFor.iterator();
                            while (it2.hasNext()) {
                                ((com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver) it2.next()).onScreenReady(ready2);
                            }
                        }
                        screenAvailable = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(uIContext, userIntentContext, null, null, list, 12, null);
                    }
                    com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$trackWithTime(screenAvailable, analyticsEvent, highSpeedVideoSizes);
                    return;
                }
                com.paypal.pds.analytics.AnalyticsEvent.Hide hide = (com.paypal.pds.analytics.AnalyticsEvent.Hide) analyticsEvent;
                com.paypal.pds.analytics.AnalyticsEvent.Hide hide2 = hide;
                com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker highSpeedVideoSizes2 = osloAnalyticsProvider.getHighSpeedVideoSizes(hide2, "Auto-capture disappear tracker");
                com.paypal.pds.analytics.AnalyticsEvent.Hide hide3 = hide;
                com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext4 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUIContext(hide3);
                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildDomainContexts2 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildDomainContexts(hide3);
                com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts extractedContexts2 = new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts(buildUIContext4, buildDomainContexts2, com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUserIntent(buildDomainContexts2));
                com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext2 = extractedContexts2.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list2 = extractedContexts2.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = extractedContexts2.getHighSpeedVideoFpsRangesFor;
                if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasComponent(uIContext2)) {
                    moduleDisappeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentDisappeared(uIContext2, userIntentContext2, list2);
                } else if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasModule(uIContext2)) {
                    moduleDisappeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleDisappeared(uIContext2, userIntentContext2, list2);
                } else {
                    androidx.navigation3.runtime.NavKey access$extractScreenDestination3 = com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$extractScreenDestination(hide2);
                    if (access$extractScreenDestination3 != null) {
                        com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared disappeared = new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared(access$extractScreenDestination3);
                        java.util.Iterator<T> it3 = osloAnalyticsProvider.getHighSpeedVideoFpsRangesFor.iterator();
                        while (it3.hasNext()) {
                            ((com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver) it3.next()).onScreenDisappeared(disappeared);
                        }
                    }
                }
                if (moduleDisappeared != null) {
                    com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$trackWithTime(moduleDisappeared, hide2, highSpeedVideoSizes2);
                    return;
                }
                return;
            }
            com.paypal.pds.analytics.AnalyticsEvent.Show show = (com.paypal.pds.analytics.AnalyticsEvent.Show) analyticsEvent;
            com.paypal.pds.analytics.AnalyticsEvent.Show show2 = show;
            com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker highSpeedVideoSizes3 = osloAnalyticsProvider.getHighSpeedVideoSizes(show2, "Auto-capture appear tracker");
            com.paypal.pds.analytics.AnalyticsEvent.Show show3 = show;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext5 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUIContext(show3);
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildDomainContexts3 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildDomainContexts(show3);
            com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts extractedContexts3 = new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts(buildUIContext5, buildDomainContexts3, com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUserIntent(buildDomainContexts3));
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext3 = extractedContexts3.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list3 = extractedContexts3.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext3 = extractedContexts3.getHighSpeedVideoFpsRangesFor;
            if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasComponent(uIContext3)) {
                moduleDisappeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(uIContext3, userIntentContext3, list3);
            } else if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasModule(uIContext3)) {
                moduleDisappeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(uIContext3, userIntentContext3, list3);
            } else {
                androidx.navigation3.runtime.NavKey access$extractScreenDestination4 = com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$extractScreenDestination(show2);
                com.paypal.pds.analytics.AnalyticsChainHolder kidChain = show.getKidChain();
                boolean z = false;
                boolean z2 = (kidChain == null || (buildUIContext = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUIContext(kidChain)) == null || !com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$isScreen(buildUIContext)) ? false : true;
                com.paypal.pds.analytics.AnalyticsLeafState kidState = show.getKidState();
                com.paypal.pds.analytics.AnalyticsLeafState.Condition condition = kidState instanceof com.paypal.pds.analytics.AnalyticsLeafState.Condition ? (com.paypal.pds.analytics.AnalyticsLeafState.Condition) kidState : null;
                if (condition != null && condition.getTracked()) {
                    z = true;
                }
                if (access$extractScreenDestination4 != null) {
                    com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared appeared = new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared(access$extractScreenDestination4, z2, z);
                    java.util.Iterator<T> it4 = osloAnalyticsProvider.getHighSpeedVideoFpsRangesFor.iterator();
                    while (it4.hasNext()) {
                        ((com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver) it4.next()).onScreenAppeared(appeared);
                    }
                }
            }
            if (moduleDisappeared != null) {
                com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$trackWithTime(moduleDisappeared, show2, highSpeedVideoSizes3);
                return;
            }
            return;
        }
        com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker highSpeedVideoSizes4 = osloAnalyticsProvider.getHighSpeedVideoSizes(analyticsEvent, "Auto-capture click tracker");
        com.paypal.pds.analytics.AnalyticsEvent analyticsEvent3 = analyticsEvent;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext6 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUIContext(analyticsEvent3);
        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildDomainContexts4 = com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildDomainContexts(analyticsEvent3);
        com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts extractedContexts4 = new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.ExtractedContexts(buildUIContext6, buildDomainContexts4, com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.buildUserIntent(buildDomainContexts4));
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext4 = extractedContexts4.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list4 = extractedContexts4.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext4 = extractedContexts4.getHighSpeedVideoFpsRangesFor;
        if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasItem(uIContext4)) {
            moduleDisappeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(uIContext4, userIntentContext4, list4);
        } else if (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$getHasComponent(uIContext4)) {
            moduleDisappeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(uIContext4, userIntentContext4, list4);
        }
        if (moduleDisappeared != null) {
            com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.access$trackWithTime(moduleDisappeared, analyticsEvent, highSpeedVideoSizes4);
        }
    }
}

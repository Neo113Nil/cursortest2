package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010 *\u00020\u001cH\u0002\u001a\u001c\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0002H\u0002\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0018\u0010\u0018\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0018\u0010\u001a\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015\"\u0018\u0010\u001b\u001a\u00020\u0012*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d\"\u0018\u0010\u001e\u001a\u00020\u0012*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d¨\u0006&²\u0006\n\u0010'\u001a\u00020\nX\u008a\u0084\u0002²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u008a\u0084\u0002"}, d2 = {"LocalAnalyticsTracker", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "getLocalAnalyticsTracker$annotations", "()V", "getLocalAnalyticsTracker", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberOsloAnalyticsProvider", "Lcom/paypal/oslo/core/telemetry/compose/OsloAnalyticsProvider;", "nav3ViewTracker", "Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;", "screenObservers", "", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleObserver;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;Ljava/util/List;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/core/telemetry/compose/OsloAnalyticsProvider;", "hasItem", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getHasItem", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;)Z", "hasComponent", "getHasComponent", "hasModule", "getHasModule", "isScreen", "isLoaded", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "(Lcom/paypal/pds/analytics/AnalyticsEvent;)Z", "isReady", "extractScreenDestination", "Landroidx/navigation3/runtime/NavKey;", "trackWithTime", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/GenericAnalyticsEvent;", "event", "analyticsTracker", "telemetry_release", "currentNav3ViewTracker", "currentScreenObservers"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OsloAnalyticsProviderKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker;
            analyticsTracker = com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker;
            return analyticsTracker;
        }
    });

    @kotlin.Deprecated(message = "Module tracker is now resolved per-event in OsloAnalyticsProvider. Will be removed soon.")
    public static /* synthetic */ void getLocalAnalyticsTracker$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getLocalAnalyticsTracker() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider rememberOsloAnalyticsProvider(com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, java.util.List<? extends com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver> list, final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nav3ViewTracker, "");
        if ((i2 & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i2 & 4) != 0) {
            coroutineDispatcher = kotlinx.coroutines.Dispatchers.getDefault();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-426953460, i, -1, "com.paypal.oslo.core.telemetry.compose.rememberOsloAnalyticsProvider (OsloAnalyticsProvider.kt:510)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(nav3ViewTracker, composer, i & 14);
        androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(list, composer, (i >> 3) & 14);
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.m11694$r8$lambda$dqxgW2lrVhMXu8zgHRFl5MQM(kotlinx.coroutines.CoroutineDispatcher.this);
            }
        };
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope((kotlin.coroutines.CoroutineContext) function0.invoke(), composer);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider osloAnalyticsProvider = new com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.m11695$r8$lambda$7KKe334N6LGNgfB15i3olWP5YY(androidx.compose.runtime.State.this, (androidx.navigation3.runtime.NavKey) obj);
                }
            }, (java.util.List) rememberUpdatedState2.getValue(), coroutineScope);
            composer.updateRememberedValue(osloAnalyticsProvider);
            rememberedValue2 = osloAnalyticsProvider;
        }
        com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider osloAnalyticsProvider2 = (com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return osloAnalyticsProvider2;
    }

    public static final boolean isLoaded(com.paypal.pds.analytics.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        if (!(analyticsEvent instanceof com.paypal.pds.analytics.AnalyticsEvent.Condition)) {
            return false;
        }
        com.paypal.pds.analytics.AnalyticsEvent.Condition condition = (com.paypal.pds.analytics.AnalyticsEvent.Condition) analyticsEvent;
        return kotlin.jvm.internal.Intrinsics.areEqual(condition.getKey(), com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY) && !condition.getInitialValue();
    }

    public static final boolean isReady(com.paypal.pds.analytics.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        if (!(analyticsEvent instanceof com.paypal.pds.analytics.AnalyticsEvent.Condition)) {
            return false;
        }
        com.paypal.pds.analytics.AnalyticsEvent.Condition condition = (com.paypal.pds.analytics.AnalyticsEvent.Condition) analyticsEvent;
        return kotlin.jvm.internal.Intrinsics.areEqual(condition.getKey(), com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY) && condition.getInitialValue();
    }

    /* renamed from: $r8$lambda$-d-qxgW2lrVh-MXu8zgHRFl5MQM, reason: not valid java name */
    public static /* synthetic */ kotlin.coroutines.CoroutineContext m11694$r8$lambda$dqxgW2lrVhMXu8zgHRFl5MQM(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    /* renamed from: $r8$lambda$7KKe334N-6LGNgfB15i3olWP5YY, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker m11695$r8$lambda$7KKe334N6LGNgfB15i3olWP5YY(androidx.compose.runtime.State state, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        return ((com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker) state.getValue()).getTrackerInstance$telemetry_release(navKey);
    }

    public static final /* synthetic */ androidx.navigation3.runtime.NavKey access$extractScreenDestination(com.paypal.pds.analytics.AnalyticsEvent analyticsEvent) {
        return (androidx.navigation3.runtime.NavKey) analyticsEvent.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getScreen());
    }

    public static final /* synthetic */ boolean access$getHasComponent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext) {
        return uIContext.getComponent() != null;
    }

    public static final /* synthetic */ boolean access$getHasItem(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext) {
        return uIContext.getItem() != null;
    }

    public static final /* synthetic */ boolean access$getHasModule(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext) {
        return uIContext.getModule() != null;
    }

    public static final /* synthetic */ boolean access$isScreen(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext) {
        return uIContext.getModule() == null && uIContext.getComponent() == null && uIContext.getItem() == null;
    }

    public static final /* synthetic */ void access$trackWithTime(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent genericAnalyticsEvent, com.paypal.pds.analytics.AnalyticsEvent analyticsEvent, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        genericAnalyticsEvent.attachTime$telemetry_release(analyticsEvent.getTimestamp());
        genericAnalyticsEvent.track(analyticsTracker);
    }
}

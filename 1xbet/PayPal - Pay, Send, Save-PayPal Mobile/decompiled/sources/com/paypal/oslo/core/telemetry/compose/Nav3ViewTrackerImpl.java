package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\"\b\u0007\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0010¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\u001f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTrackerImpl;", "Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;", "", "", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "Lkotlin/jvm/JvmSuppressWildcards;", com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "<init>", "(Ljava/util/Map;)V", "Landroidx/navigation3/runtime/NavKey;", "current", "previous", "", "trackScreenAppeared$telemetry_release", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)V", "trackScreenDisappeared$telemetry_release", "navKey", "getTrackerInstance$telemetry_release", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "p0", "p1", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "p2", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/lang/Class;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Nav3ViewTrackerImpl extends com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Class<?>, java.lang.String> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public Nav3ViewTrackerImpl(java.util.Map<java.lang.String, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    @Override // com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker
    public final void trackScreenAppeared$telemetry_release(androidx.navigation3.runtime.NavKey current, androidx.navigation3.runtime.NavKey previous) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        Camera2StreamConfigurationMap(getTrackerInstance$telemetry_release(current), current, previous, com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared);
    }

    @Override // com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker
    public final void trackScreenDisappeared$telemetry_release(androidx.navigation3.runtime.NavKey current, androidx.navigation3.runtime.NavKey previous) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        Camera2StreamConfigurationMap(getTrackerInstance$telemetry_release(current), current, previous, com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared);
    }

    @Override // com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker getTrackerInstance$telemetry_release(androidx.navigation3.runtime.NavKey navKey) {
        com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        java.lang.Class<?> cls = navKey.getClass();
        java.util.Map<java.lang.Class<?>, java.lang.String> map = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = map.get(cls);
        if (str == null) {
            str = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractModuleName(navKey);
            map.put(cls, str);
        }
        java.lang.String str2 = str;
        if (str2 != null && (analyticsTracker = this.getHighResolutionOutputSizeshNQ4ISI.get(str2)) != null) {
            return analyticsTracker;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Could not retrieve analytics tracker instance by navKey", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("nav_key", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(navKey.getClass()).getQualifiedName())), null, null, 12, null);
        return com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker;
    }

    private static void Camera2StreamConfigurationMap(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
        com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsData analyticsFromDestination = com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsDataKt.analyticsFromDestination(navKey);
        com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsData analyticsFromDestination2 = navKey2 != null ? com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsDataKt.analyticsFromDestination(navKey2) : null;
        java.lang.String id = analyticsFromDestination.getId();
        java.lang.String id2 = analyticsFromDestination2 != null ? analyticsFromDestination2.getId() : null;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext = analyticsFromDestination.getNavigationContext();
        if (navigationContext == null) {
            navigationContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, id2);
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext2 = navigationContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(id), null, null, null, 4, null);
        analyticsTracker.setNextDestination$telemetry_release(com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(navKey));
        int i = com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(uIContext, analyticsFromDestination.getUserIntent(), navigationContext2, analyticsFromDestination.getBusinessFlow(), analyticsFromDestination.getDomainContexts()).track(analyticsTracker);
        } else {
            if (i == 2) {
                new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenDisappeared(uIContext, analyticsFromDestination.getUserIntent(), navigationContext2, analyticsFromDestination.getBusinessFlow(), analyticsFromDestination.getDomainContexts()).track(analyticsTracker);
                return;
            }
            throw new java.lang.IllegalStateException("Unsupported event type: ".concat(java.lang.String.valueOf(eventType)).toString());
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

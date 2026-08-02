package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B;\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/zettle/sdk/core/log/ManualAppEventsImpl;", "Lcom/zettle/sdk/core/log/ManualAppEvents;", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Lcom/zettle/sdk/commons/state/State;", "userConfig", "Lcom/zettle/sdk/core/log/HealthMonitor;", "healthMonitor", "Lcom/zettle/sdk/core/log/ManualAppEventsRepository;", "repository", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lcom/zettle/sdk/meta/PlatformClock;", "platformClock", "<init>", "(Lcom/zettle/sdk/commons/state/State;Lcom/zettle/sdk/core/log/HealthMonitor;Lcom/zettle/sdk/core/log/ManualAppEventsRepository;Lcom/zettle/sdk/commons/thread/EventsLoop;Lcom/zettle/sdk/meta/PlatformClock;)V", "state", "", "onNext", "(Lcom/zettle/sdk/core/user/userconfig/UserConfig;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "Ljava/text/SimpleDateFormat;", "", "p0", "Ljava/util/Date;", "getHighSpeedVideoSizes", "(Ljava/text/SimpleDateFormat;Ljava/lang/String;)Ljava/util/Date;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Ljava/text/SimpleDateFormat;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/log/HealthMonitor;", "Lcom/zettle/sdk/meta/PlatformClock;", "Lcom/zettle/sdk/core/log/ManualAppEventsRepository;", "getInputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/state/State;", "getOutputMinFrameDuration"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ManualAppEventsImpl implements com.zettle.sdk.core.log.ManualAppEvents, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.text.SimpleDateFormat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.thread.EventsLoop getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.core.log.HealthMonitor Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.PlatformClock getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.core.log.ManualAppEventsRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> getOutputMinFrameDuration;

    public ManualAppEventsImpl(com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> state, com.zettle.sdk.core.log.HealthMonitor healthMonitor, com.zettle.sdk.core.log.ManualAppEventsRepository manualAppEventsRepository, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.meta.PlatformClock platformClock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualAppEventsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformClock, "");
        this.getOutputMinFrameDuration = state;
        this.Camera2StreamConfigurationMap = healthMonitor;
        this.getHighResolutionOutputSizeshNQ4ISI = manualAppEventsRepository;
        this.getHighSpeedVideoFpsRanges = eventsLoop;
        this.getHighSpeedVideoSizes = platformClock;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        this.getHighSpeedVideoFpsRangesFor = simpleDateFormat;
    }

    public /* synthetic */ ManualAppEventsImpl(com.zettle.sdk.commons.state.State state, com.zettle.sdk.core.log.HealthMonitor healthMonitor, com.zettle.sdk.core.log.ManualAppEventsRepository manualAppEventsRepository, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.meta.PlatformClock platformClock, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(state, healthMonitor, manualAppEventsRepository, (i & 8) != 0 ? com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.getBackground() : eventsLoop, (i & 16) != 0 ? com.zettle.sdk.meta.Platform.INSTANCE.getClock() : platformClock);
    }

    @Override // com.zettle.sdk.core.log.ManualAppEvents
    public final void start() {
        this.getOutputMinFrameDuration.addObserver(this, this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.zettle.sdk.commons.state.StateObserver
    public final void onNext(com.zettle.sdk.core.user.userconfig.UserConfig state) {
        java.lang.String str;
        java.util.Date highSpeedVideoSizes;
        if (state != null) {
            java.lang.String userUUID = state.getUserUUID();
            java.util.Map<java.lang.String, java.lang.String> manualAppEvents = state.getManualAppEvents();
            if (manualAppEvents == null || (str = manualAppEvents.get("IOS_SEND_DEVICE_LOGS")) == null || (highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, str)) == null) {
                return;
            }
            long time = highSpeedVideoSizes.getTime();
            long lastManualEvent = this.getHighResolutionOutputSizeshNQ4ISI.getLastManualEvent(userUUID, -1L);
            long currentWallTime = this.getHighSpeedVideoSizes.getCurrentWallTime();
            if (time == lastManualEvent || currentWallTime - time > java.util.concurrent.TimeUnit.DAYS.toMillis(7L)) {
                return;
            }
            this.Camera2StreamConfigurationMap.report("ManualAppEvent");
            this.getHighResolutionOutputSizeshNQ4ISI.setLastManualEvent(userUUID, time);
        }
    }

    private static java.util.Date getHighSpeedVideoSizes(java.text.SimpleDateFormat simpleDateFormat, java.lang.String str) {
        try {
            return simpleDateFormat.parse(str);
        } catch (java.text.ParseException e) {
            com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to parse manual app event date", e);
            return null;
        }
    }
}

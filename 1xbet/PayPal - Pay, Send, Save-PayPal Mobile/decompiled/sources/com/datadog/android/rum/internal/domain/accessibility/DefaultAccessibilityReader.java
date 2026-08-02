package com.datadog.android.rum.internal.domain.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001JB_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0018H\u0017¢\u0006\u0004\b(\u0010\u001aR\u0016\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u0010\"\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u0014\u0010)\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00102R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00103\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u00107\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010=R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010?\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010D\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010B\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010I"}, d2 = {"Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader;", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "Landroid/content/ComponentCallbacks;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Landroid/content/Context;", "applicationContext", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroid/app/ActivityManager;", "activityManager", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Lcom/datadog/android/rum/internal/domain/accessibility/SecureWrapper;", "secureWrapper", "Lcom/datadog/android/rum/internal/domain/accessibility/GlobalWrapper;", "globalWrapper", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/datadog/android/api/InternalLogger;Landroid/content/Context;Lcom/datadog/android/internal/time/TimeProvider;Landroid/content/res/Resources;Landroid/app/ActivityManager;Landroid/view/accessibility/AccessibilityManager;Lcom/datadog/android/rum/internal/domain/accessibility/SecureWrapper;Lcom/datadog/android/rum/internal/domain/accessibility/GlobalWrapper;Landroid/os/Handler;)V", "", "cleanup", "()V", "getState", "()Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "", "Camera2StreamConfigurationMap", "()Ljava/lang/Boolean;", "", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Landroid/content/res/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "getHighSpeedVideoFpsRanges", "Landroid/view/accessibility/AccessibilityManager;", "getHighSpeedVideoSizes", "Landroid/app/ActivityManager;", "Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader$animationDurationListener$1;", "Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader$animationDurationListener$1;", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader$captioningListener$1;", "Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader$captioningListener$1;", "getOutputFormats", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "getOutputMinFrameDuration", "Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader$displayInversionListener$1;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilityReader$displayInversionListener$1;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/internal/domain/accessibility/GlobalWrapper;", "getInputFormats", "Landroid/os/Handler;", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/concurrent/atomic/AtomicLong;", "getOutputStallDurationlomOqCM", "Ljava/util/concurrent/atomic/AtomicLong;", "getOutputStallDuration", "getOutputSizeshNQ4ISI", "Landroid/content/res/Resources;", "getOutputMinFrameDurationlomOqCM", "Lcom/datadog/android/rum/internal/domain/accessibility/SecureWrapper;", "getOutputSizes", "Lcom/datadog/android/internal/time/TimeProvider;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAccessibilityReader implements com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>, android.content.ComponentCallbacks {
    public static final java.lang.String CAPTIONING_ENABLED_KEY = "accessibility_captioning_enabled";
    public static final long POLL_THRESHOLD = 30000;
    private final android.app.ActivityManager Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$captioningListener$1 getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.view.accessibility.AccessibilityManager getHighSpeedVideoSizes;
    private final com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$animationDurationListener$1 getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.GlobalWrapper getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final android.os.Handler getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$displayInversionListener$1 getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private volatile com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.SecureWrapper getOutputSizes;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.res.Resources getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener getOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getOutputStallDuration;

    @Override // android.content.ComponentCallbacks
    @kotlin.Deprecated(message = "Deprecated in Java")
    public final void onLowMemory() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$displayInversionListener$1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$captioningListener$1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$animationDurationListener$1] */
    public DefaultAccessibilityReader(com.datadog.android.api.InternalLogger internalLogger, android.content.Context context, com.datadog.android.internal.time.TimeProvider timeProvider, android.content.res.Resources resources, android.app.ActivityManager activityManager, android.view.accessibility.AccessibilityManager accessibilityManager, com.datadog.android.rum.internal.domain.accessibility.SecureWrapper secureWrapper, com.datadog.android.rum.internal.domain.accessibility.GlobalWrapper globalWrapper, final android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getInputFormats = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getOutputMinFrameDurationlomOqCM = timeProvider;
        this.getOutputStallDurationlomOqCM = resources;
        this.Camera2StreamConfigurationMap = activityManager;
        this.getHighSpeedVideoSizes = accessibilityManager;
        this.getOutputSizes = secureWrapper;
        this.getOutputFormats = globalWrapper;
        this.getInputSizeshNQ4ISI = handler;
        ?? r1 = new android.database.ContentObserver(handler) { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$displayInversionListener$1
            @Override // android.database.ContentObserver
            public final void onChange(boolean selfChange, android.net.Uri uri) {
                final java.lang.Boolean highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this.getHighSpeedVideoFpsRangesFor("accessibility_display_inversion_enabled");
                com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.access$updateState(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this, new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$displayInversionListener$1$onChange$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo invoke(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfo, "");
                        return com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo.copy$default(accessibilityInfo, null, null, highSpeedVideoFpsRangesFor, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }
        };
        this.getHighSpeedVideoSizesFor = r1;
        ?? r3 = new android.database.ContentObserver(handler) { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$captioningListener$1
            @Override // android.database.ContentObserver
            public final void onChange(boolean selfChange, android.net.Uri uri) {
                final java.lang.Boolean highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this.getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.CAPTIONING_ENABLED_KEY);
                com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.access$updateState(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this, new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$captioningListener$1$onChange$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo invoke(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfo, "");
                        return com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo.copy$default(accessibilityInfo, null, null, null, highSpeedVideoFpsRangesFor, null, null, null, 119, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }
        };
        this.getHighSpeedVideoFpsRanges = r3;
        ?? r7 = new android.database.ContentObserver(handler) { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$animationDurationListener$1
            @Override // android.database.ContentObserver
            public final void onChange(boolean selfChange, android.net.Uri uri) {
                final java.lang.Boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this.Camera2StreamConfigurationMap();
                com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.access$updateState(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this, new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$animationDurationListener$1$onChange$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo invoke(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfo, "");
                        return com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo.copy$default(accessibilityInfo, null, null, null, null, Camera2StreamConfigurationMap, null, null, 111, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }
        };
        this.getHighSpeedVideoFpsRangesFor = r7;
        android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$$ExternalSyntheticLambda0
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.m10021$r8$lambda$trP128Yyx5OhBNN5lpx4ZJVnBo(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader.this, z);
            }
        };
        this.getOutputSizeshNQ4ISI = touchExplorationStateChangeListener;
        this.getOutputMinFrameDuration = new com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo(null, null, null, null, null, null, null, 127, null);
        this.getOutputStallDuration = new java.util.concurrent.atomic.AtomicLong(0L);
        context.registerComponentCallbacks(this);
        context.getContentResolver().registerContentObserver(android.provider.Settings.Secure.getUriFor("accessibility_display_inversion_enabled"), false, (android.database.ContentObserver) r1);
        context.getContentResolver().registerContentObserver(android.provider.Settings.Secure.getUriFor(CAPTIONING_ENABLED_KEY), false, (android.database.ContentObserver) r3);
        context.getContentResolver().registerContentObserver(android.provider.Settings.Global.getUriFor("animator_duration_scale"), false, (android.database.ContentObserver) r7);
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        java.lang.String valueOf = java.lang.String.valueOf(resources.getConfiguration().fontScale);
        java.lang.Boolean bool = null;
        java.lang.Boolean valueOf2 = accessibilityManager != null ? java.lang.Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : null;
        java.lang.Boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor("accessibility_display_inversion_enabled");
        if (activityManager != null) {
            bool = java.lang.Boolean.valueOf(activityManager.getLockTaskModeState() != 0);
        }
        this.getOutputMinFrameDuration = new com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo(valueOf, valueOf2, highSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(CAPTIONING_ENABLED_KEY), Camera2StreamConfigurationMap(), bool, java.lang.Boolean.valueOf(resources.getConfiguration().getLayoutDirection() == 1));
    }

    public static final /* synthetic */ void access$updateState(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader defaultAccessibilityReader, kotlin.jvm.functions.Function1 function1) {
        synchronized (defaultAccessibilityReader) {
            defaultAccessibilityReader.getOutputMinFrameDuration = (com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo) function1.invoke(defaultAccessibilityReader.getOutputMinFrameDuration);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultAccessibilityReader(com.datadog.android.api.InternalLogger internalLogger, android.content.Context context, com.datadog.android.internal.time.TimeProvider timeProvider, android.content.res.Resources resources, android.app.ActivityManager activityManager, android.view.accessibility.AccessibilityManager accessibilityManager, com.datadog.android.rum.internal.domain.accessibility.SecureWrapper secureWrapper, com.datadog.android.rum.internal.domain.accessibility.GlobalWrapper globalWrapper, android.os.Handler handler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, context, timeProvider, r4, r5, r6, (i & 64) != 0 ? new com.datadog.android.rum.internal.domain.accessibility.SecureWrapper() : secureWrapper, (i & 128) != 0 ? new com.datadog.android.rum.internal.domain.accessibility.GlobalWrapper() : globalWrapper, (i & 256) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler);
        android.content.res.Resources resources2;
        android.app.ActivityManager activityManager2;
        android.view.accessibility.AccessibilityManager accessibilityManager2;
        if ((i & 8) != 0) {
            android.content.res.Resources resources3 = context.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources3, "");
            resources2 = resources3;
        } else {
            resources2 = resources;
        }
        if ((i & 16) != 0) {
            java.lang.Object systemService = context.getSystemService("activity");
            activityManager2 = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        } else {
            activityManager2 = activityManager;
        }
        if ((i & 32) != 0) {
            java.lang.Object systemService2 = context.getSystemService("accessibility");
            accessibilityManager2 = systemService2 instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService2 : null;
        } else {
            accessibilityManager2 = accessibilityManager;
        }
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final void cleanup() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.getHighSpeedVideoSizes;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.getOutputSizeshNQ4ISI);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getContentResolver().unregisterContentObserver(this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI.getContentResolver().unregisterContentObserver(this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI.getContentResolver().unregisterContentObserver(this.getHighSpeedVideoSizesFor);
        this.getHighResolutionOutputSizeshNQ4ISI.unregisterComponentCallbacks(this);
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    /* renamed from: getState, reason: avoid collision after fix types in other method */
    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo getCamera2StreamConfigurationMap() {
        com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo;
        final java.lang.Boolean valueOf;
        synchronized (this) {
            long deviceTimestampMillis = this.getOutputMinFrameDurationlomOqCM.getDeviceTimestampMillis();
            if (deviceTimestampMillis - this.getOutputStallDuration.get() >= 30000) {
                this.getOutputStallDuration.set(deviceTimestampMillis);
                android.app.ActivityManager activityManager = this.Camera2StreamConfigurationMap;
                if (activityManager == null) {
                    valueOf = null;
                } else {
                    valueOf = java.lang.Boolean.valueOf(activityManager.getLockTaskModeState() != 0);
                }
                kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> function1 = new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$pollForAttributesWithoutListeners$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo invoke(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfo2, "");
                        return com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo.copy$default(accessibilityInfo2, null, null, null, null, null, valueOf, null, 95, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                synchronized (this) {
                    this.getOutputMinFrameDuration = function1.invoke(this.getOutputMinFrameDuration);
                }
            }
            accessibilityInfo = this.getOutputMinFrameDuration;
        }
        return accessibilityInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Boolean Camera2StreamConfigurationMap() {
        java.lang.Float float$dd_sdk_android_rum_release = this.getOutputFormats.getFloat$dd_sdk_android_rum_release(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, "animator_duration_scale");
        if (float$dd_sdk_android_rum_release != null) {
            return java.lang.Boolean.valueOf(float$dd_sdk_android_rum_release.floatValue() == 0.0f);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Boolean getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Integer int$dd_sdk_android_rum_release = this.getOutputSizes.getInt$dd_sdk_android_rum_release(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, p0);
        if (int$dd_sdk_android_rum_release != null) {
            return java.lang.Boolean.valueOf(int$dd_sdk_android_rum_release.intValue() == 1);
        }
        return null;
    }

    /* renamed from: $r8$lambda$trP128Yyx5OhB-NN5lpx4ZJVnBo, reason: not valid java name */
    public static /* synthetic */ void m10021$r8$lambda$trP128Yyx5OhBNN5lpx4ZJVnBo(com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader defaultAccessibilityReader, boolean z) {
        android.view.accessibility.AccessibilityManager accessibilityManager = defaultAccessibilityReader.getHighSpeedVideoSizes;
        final java.lang.Boolean valueOf = accessibilityManager != null ? java.lang.Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : null;
        kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> function1 = new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$touchListener$1$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo invoke(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfo, "");
                return com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo.copy$default(accessibilityInfo, null, valueOf, null, null, null, null, null, 125, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        synchronized (defaultAccessibilityReader) {
            defaultAccessibilityReader.getOutputMinFrameDuration = function1.invoke(defaultAccessibilityReader.getOutputMinFrameDuration);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        final boolean z = this.getOutputStallDurationlomOqCM.getConfiguration().getLayoutDirection() == 1;
        final java.lang.String valueOf = java.lang.String.valueOf(this.getOutputStallDurationlomOqCM.getConfiguration().fontScale);
        kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> function1 = new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo, com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo>() { // from class: com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader$onConfigurationChanged$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo invoke(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfo, "");
                return com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo.copy$default(accessibilityInfo, valueOf, null, null, null, null, null, java.lang.Boolean.valueOf(z), 62, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        synchronized (this) {
            this.getOutputMinFrameDuration = function1.invoke(this.getOutputMinFrameDuration);
        }
    }
}

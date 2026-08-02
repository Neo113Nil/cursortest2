package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 õ\u00012\u00020\u00012\u00020\u0002:\u0004õ\u0001ö\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u0010\u0017R(\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010K\u001a\u0004\u0018\u00010J8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010)\u001a\u00020(8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b)\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bV\u0010WR\"\u0010Y\u001a\u00020X8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010`\u001a\b\u0012\u0004\u0012\u00020_018\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\ba\u00106\"\u0004\bb\u00108R\u0014\u0010G\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010e\u001a\u0004\bf\u0010gR\"\u0010i\u001a\u00020h8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010p\u001a\b\u0012\u0004\u0012\u00020,0o8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR(\u0010x\u001a\b\u0012\u0004\u0012\u00020w0v8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R*\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~018\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0004\b\u007f\u00104\u001a\u0005\b\u0080\u0001\u00106\"\u0005\b\u0081\u0001\u00108R&\u0010\u0082\u0001\u001a\u00020h8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010j\u001a\u0005\b\u0083\u0001\u0010l\"\u0005\b\u0084\u0001\u0010nR+\u0010\u0085\u0001\u001a\u0004\u0018\u00010w8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R,\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010&\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0007\n\u0005\bI\u0010¥\u0001R\"\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R*\u0010©\u0001\u001a\u00030¨\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R&\u0010¯\u0001\u001a\u00020h8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010j\u001a\u0005\b°\u0001\u0010l\"\u0005\b±\u0001\u0010nR\u001d\u0010²\u0001\u001a\u00020\u00058\u0017X\u0097D¢\u0006\u000e\n\u0005\b²\u0001\u0010U\u001a\u0005\b³\u0001\u0010WR!\u0010¸\u0001\u001a\u00030´\u00018WX\u0097\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010¥\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001b\u0010¦\u0001\u001a\u0005\u0018\u00010¹\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b&\u0010º\u0001R'\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R*\u0010Â\u0001\u001a\u00030Á\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R\u0017\u0010Ê\u0001\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ì\u0001\u001a\u00030Ë\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R,\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R \u0010Ú\u0001\u001a\u00030Ù\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010Þ\u0001\u001a\u00030Á\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010Ã\u0001\u001a\u0006\bß\u0001\u0010Å\u0001\"\u0006\bà\u0001\u0010Ç\u0001R*\u0010á\u0001\u001a\u00030Á\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010Ã\u0001\u001a\u0006\bâ\u0001\u0010Å\u0001\"\u0006\bã\u0001\u0010Ç\u0001R&\u0010ä\u0001\u001a\u00020X8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\bä\u0001\u0010Z\u001a\u0005\bå\u0001\u0010\\\"\u0005\bæ\u0001\u0010^R*\u0010è\u0001\u001a\u00030ç\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R*\u0010ï\u0001\u001a\u00030î\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/RumFeature;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlin/Function1;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/LateCrashReporter;", "lateCrashReporterFactory", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumFeature$Configuration;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Ljava/util/concurrent/ExecutorService;", "rumEventsExecutorService", "", "consumeLastFatalAnr$dd_sdk_android_rum_release", "(Ljava/util/concurrent/ExecutorService;)V", "disableDebugging$dd_sdk_android_rum_release", "()V", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "advancedRumMonitor", "enableDebugging$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "Landroid/app/Activity;", "activity", "enableJankStatsTracking$dd_sdk_android_rum_release", "(Landroid/app/Activity;)V", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "p0", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "p1", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Lcom/datadog/android/rum/internal/vitals/VitalReader;Lcom/datadog/android/rum/internal/vitals/VitalObserver;J)V", "Landroid/content/Context;", "appContext", "onInitialize", "(Landroid/content/Context;)V", "", "event", "onReceive", "(Ljava/lang/Object;)V", "onStop", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "accessibilityReader", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "getAccessibilityReader$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/InfoProvider;", "setAccessibilityReader$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/InfoProvider;)V", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "getAccessibilitySnapshotManager$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "setAccessibilitySnapshotManager$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;)V", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "actionTrackingStrategy", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "getActionTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "setActionTrackingStrategy$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;)V", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "anrDetectorRunnable", "Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "getAnrDetectorRunnable$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "setAnrDetectorRunnable$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;)V", "Landroid/content/Context;", "getAppContext$dd_sdk_android_rum_release", "()Landroid/content/Context;", "setAppContext$dd_sdk_android_rum_release", "Ljava/lang/String;", "getApplicationId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "", "backgroundEventTracking", "Z", "getBackgroundEventTracking$dd_sdk_android_rum_release", "()Z", "setBackgroundEventTracking$dd_sdk_android_rum_release", "(Z)V", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "getBatteryInfoProvider$dd_sdk_android_rum_release", "setBatteryInfoProvider$dd_sdk_android_rum_release", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "getConfiguration$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getCpuVitalMonitor$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "setCpuVitalMonitor$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/vitals/VitalMonitor;)V", "Lcom/datadog/android/api/storage/DataWriter;", "dataWriter", "Lcom/datadog/android/api/storage/DataWriter;", "getDataWriter$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/storage/DataWriter;", "setDataWriter$dd_sdk_android_rum_release", "(Lcom/datadog/android/api/storage/DataWriter;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "debugActivityLifecycleListener", "Ljava/util/concurrent/atomic/AtomicReference;", "getDebugActivityLifecycleListener$dd_sdk_android_rum_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "setDebugActivityLifecycleListener$dd_sdk_android_rum_release", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "getDisplayInfoProvider$dd_sdk_android_rum_release", "setDisplayInfoProvider$dd_sdk_android_rum_release", "frameRateVitalMonitor", "getFrameRateVitalMonitor$dd_sdk_android_rum_release", "setFrameRateVitalMonitor$dd_sdk_android_rum_release", "frameStatesAggregator", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getFrameStatesAggregator$dd_sdk_android_rum_release", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "setFrameStatesAggregator$dd_sdk_android_rum_release", "(Landroid/app/Application$ActivityLifecycleCallbacks;)V", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "setInitialResourceIdentifier$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_rum_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "getInsightsCollector$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "setInsightsCollector$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "getLastInteractionIdentifier$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "setLastInteractionIdentifier$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "longTaskTrackingStrategy", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "getLongTaskTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/TrackingStrategy;", "setLongTaskTrackingStrategy$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/tracking/TrackingStrategy;)V", "memoryVitalMonitor", "getMemoryVitalMonitor$dd_sdk_android_rum_release", "setMemoryVitalMonitor$dd_sdk_android_rum_release", "name", "getName", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory$delegate", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector;", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector;", "", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "rumContextUpdateReceivers", "Ljava/util/Set;", "getRumContextUpdateReceivers$dd_sdk_android_rum_release", "()Ljava/util/Set;", "", "sampleRate", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_rum_release", "()F", "setSampleRate$dd_sdk_android_rum_release", "(F)V", "getOutputMinFrameDuration", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getOutputFormats", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Lcom/datadog/android/rum/RumSessionListener;", "getSessionListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumSessionListener;", "setSessionListener$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/RumSessionListener;)V", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "getSlowFramesListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "setSlowFramesListener$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;)V", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "telemetryConfigurationSampleRate", "getTelemetryConfigurationSampleRate$dd_sdk_android_rum_release", "setTelemetryConfigurationSampleRate$dd_sdk_android_rum_release", "telemetrySampleRate", "getTelemetrySampleRate$dd_sdk_android_rum_release", "setTelemetrySampleRate$dd_sdk_android_rum_release", "trackFrustrations", "getTrackFrustrations$dd_sdk_android_rum_release", "setTrackFrustrations$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "viewTrackingStrategy", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "getViewTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "setViewTrackingStrategy$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "vitalExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "getVitalExecutorService$dd_sdk_android_rum_release", "()Ljava/util/concurrent/ScheduledExecutorService;", "setVitalExecutorService$dd_sdk_android_rum_release", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "Companion", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RumFeature implements com.datadog.android.api.feature.StorageBackedFeature, com.datadog.android.api.feature.FeatureEventReceiver {
    public static final float ALL_IN_SAMPLE_RATE = 100.0f;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.RumFeature.Companion INSTANCE;
    public static final java.lang.String DD_TELEMETRY_CONFIG_SAMPLE_RATE_TAG = "_dd.telemetry.configuration_sample_rate";
    public static final long DEFAULT_LONG_TASK_THRESHOLD_MS = 100;
    private static final com.datadog.android.rum.internal.RumFeature.Configuration DEFAULT_RUM_CONFIG;
    public static final float DEFAULT_SAMPLE_RATE = 100.0f;
    public static final float DEFAULT_TELEMETRY_CONFIGURATION_SAMPLE_RATE = 20.0f;
    public static final float DEFAULT_TELEMETRY_SAMPLE_RATE = 20.0f;
    public static final java.lang.String DEVELOPER_MODE_SAMPLE_RATE_CHANGED_MESSAGE = "Developer mode enabled, setting RUM sample rate to 100%.";
    public static final java.lang.String EVENT_ATTRIBUTES_PROPERTY = "attributes";
    public static final java.lang.String EVENT_MESSAGE_PROPERTY = "message";
    public static final java.lang.String EVENT_STACKTRACE_PROPERTY = "stacktrace";
    public static final java.lang.String EVENT_THROWABLE_PROPERTY = "throwable";
    public static final java.lang.String FAILED_TO_ENABLE_JANK_STATS_TRACKING_MANUALLY = "Manually enabling JankStats tracking threw an exception.";
    public static final java.lang.String FAILED_TO_GET_HISTORICAL_EXIT_REASONS = "Couldn't get historical exit reasons";
    public static final java.lang.String FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE = "flush_and_stop_monitor";
    public static final java.lang.String LOGGER_ERROR_BUS_MESSAGE_TYPE = "logger_error";
    public static final java.lang.String LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE = "logger_error_with_stacktrace";
    public static final java.lang.String LOG_ERROR_EVENT_MISSING_MANDATORY_FIELDS = "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
    public static final java.lang.String LOG_ERROR_WITH_STACKTRACE_EVENT_MISSING_MANDATORY_FIELDS = "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
    public static final java.lang.String NDK_CRASH_BUS_MESSAGE_TYPE = "ndk_crash";
    public static final java.lang.String NO_LAST_RUM_VIEW_EVENT_AVAILABLE = "No last known RUM view event found, skipping fatal ANR reporting.";
    public static final java.lang.String RUM_FEATURE_NOT_YET_INITIALIZED = "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method.";
    private static final long RUM_TTL_24H;
    public static final java.lang.String SLOW_FRAMES_MONITORING_DISABLED_MESSAGE = "Slow frames monitoring disabled.";
    public static final java.lang.String SLOW_FRAMES_MONITORING_ENABLED_MESSAGE = "Slow frames monitoring enabled.";
    public static final java.lang.String TELEMETRY_SESSION_REPLAY_SKIP_FRAME = "sr_skipped_frame";
    public static final java.lang.String UNKNOWN_EVENT_TYPE_PROPERTY_VALUE = "RUM feature received an event with unknown value of \"type\" property=%s.";
    public static final java.lang.String UNSUPPORTED_EVENT_TYPE = "RUM feature receive an event of unsupported type=%s.";
    public static final java.lang.String WEB_VIEW_INGESTED_NOTIFICATION_MESSAGE_TYPE = "web_view_ingested_notification";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.datadog.android.core.InternalSdkCore, com.datadog.android.rum.internal.LateCrashReporter> getHighResolutionOutputSizeshNQ4ISI;
    private com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> accessibilityReader;
    private com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager;
    private com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy actionTrackingStrategy;
    private com.datadog.android.rum.internal.anr.ANRDetectorRunnable anrDetectorRunnable;
    public android.content.Context appContext;
    private final java.lang.String applicationId;
    private boolean backgroundEventTracking;
    private com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> batteryInfoProvider;
    private final com.datadog.android.rum.internal.RumFeature.Configuration configuration;
    private com.datadog.android.rum.internal.vitals.VitalMonitor cpuVitalMonitor;
    private com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter;
    private java.util.concurrent.atomic.AtomicReference<android.app.Application.ActivityLifecycleCallbacks> debugActivityLifecycleListener;
    private com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> displayInfoProvider;
    private com.datadog.android.rum.internal.vitals.VitalMonitor frameRateVitalMonitor;
    private android.app.Application.ActivityLifecycleCallbacks frameStatesAggregator;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.concurrent.ExecutorService getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.startup.RumAppStartupDetector Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getOutputFormats;
    private com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector;
    private com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier;
    private com.datadog.android.rum.tracking.TrackingStrategy longTaskTrackingStrategy;
    private com.datadog.android.rum.internal.vitals.VitalMonitor memoryVitalMonitor;
    private final java.lang.String name;

    /* renamed from: requestFactory$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy requestFactory;
    private final java.util.Set<com.datadog.android.api.feature.FeatureContextUpdateReceiver> rumContextUpdateReceivers;
    private float sampleRate;
    private com.datadog.android.rum.RumSessionListener sessionListener;
    private com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener;
    private final com.datadog.android.api.storage.FeatureStorageConfiguration storageConfiguration;
    private float telemetryConfigurationSampleRate;
    private float telemetrySampleRate;
    private boolean trackFrustrations;
    private com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy;
    private java.util.concurrent.ScheduledExecutorService vitalExecutorService;

    /* JADX WARN: Multi-variable type inference failed */
    public RumFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, com.datadog.android.rum.internal.RumFeature.Configuration configuration, kotlin.jvm.functions.Function1<? super com.datadog.android.core.InternalSdkCore, ? extends com.datadog.android.rum.internal.LateCrashReporter> function1, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        com.datadog.android.api.storage.FeatureStorageConfiguration copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getOutputFormats = featureSdkCore;
        this.applicationId = str;
        this.configuration = configuration;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = buildSdkVersionProvider;
        this.dataWriter = new com.datadog.android.api.storage.NoOpDataWriter();
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.viewTrackingStrategy = new com.datadog.android.rum.tracking.NoOpViewTrackingStrategy();
        this.actionTrackingStrategy = new com.datadog.android.rum.internal.tracking.NoOpUserActionTrackingStrategy();
        this.longTaskTrackingStrategy = new com.datadog.android.rum.tracking.NoOpTrackingStrategy();
        this.cpuVitalMonitor = new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor();
        this.memoryVitalMonitor = new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor();
        this.frameRateVitalMonitor = new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor();
        this.debugActivityLifecycleListener = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.sessionListener = new com.datadog.android.rum.internal.NoOpRumSessionListener();
        this.vitalExecutorService = new com.datadog.android.rum.internal.thread.NoOpScheduledExecutorService();
        this.initialResourceIdentifier = new com.datadog.android.rum.metric.networksettled.NoOpInitialResourceIdentifier();
        this.lastInteractionIdentifier = new com.datadog.android.rum.metric.interactiontonextview.NoOpLastInteractionIdentifier();
        this.accessibilityReader = new com.datadog.android.rum.internal.domain.accessibility.NoOpAccessibilityReader();
        this.accessibilitySnapshotManager = new com.datadog.android.rum.internal.domain.accessibility.NoOpAccessibilitySnapshotManager();
        this.batteryInfoProvider = new com.datadog.android.rum.internal.domain.battery.NoOpBatteryInfoProvider();
        this.displayInfoProvider = new com.datadog.android.rum.internal.domain.display.NoOpDisplayInfoProvider();
        this.rumContextUpdateReceivers = new java.util.LinkedHashSet();
        this.insightsCollector = new com.datadog.android.rum.internal.instrumentation.insights.NoOpInsightsCollector();
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.LateCrashReporter>() { // from class: com.datadog.android.rum.internal.RumFeature$lateCrashEventHandler$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.LateCrashReporter invoke() {
                kotlin.jvm.functions.Function1 function12;
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2;
                function12 = com.datadog.android.rum.internal.RumFeature.this.getHighResolutionOutputSizeshNQ4ISI;
                featureSdkCore2 = com.datadog.android.rum.internal.RumFeature.this.getOutputFormats;
                kotlin.jvm.internal.Intrinsics.checkNotNull(featureSdkCore2, "");
                return (com.datadog.android.rum.internal.LateCrashReporter) function12.invoke((com.datadog.android.core.InternalSdkCore) featureSdkCore2);
            }

            {
                super(0);
            }
        });
        this.name = "rum";
        this.requestFactory = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.net.RumRequestFactory>() { // from class: com.datadog.android.rum.internal.RumFeature$requestFactory$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.net.RumRequestFactory invoke() {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2;
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore3;
                java.lang.String customEndpointUrl = com.datadog.android.rum.internal.RumFeature.this.getConfiguration().getCustomEndpointUrl();
                featureSdkCore2 = com.datadog.android.rum.internal.RumFeature.this.getOutputFormats;
                com.datadog.android.rum.internal.domain.event.RumViewEventFilter rumViewEventFilter = new com.datadog.android.rum.internal.domain.event.RumViewEventFilter(new com.datadog.android.rum.internal.domain.event.RumEventMetaDeserializer(featureSdkCore2.getInternalLogger()));
                featureSdkCore3 = com.datadog.android.rum.internal.RumFeature.this.getOutputFormats;
                return new com.datadog.android.rum.internal.net.RumRequestFactory(customEndpointUrl, rumViewEventFilter, featureSdkCore3.getInternalLogger());
            }

            {
                super(0);
            }
        });
        copy = r0.copy((r16 & 1) != 0 ? r0.maxItemSize : 0L, (r16 & 2) != 0 ? r0.maxItemsPerBatch : 0, (r16 & 4) != 0 ? r0.maxBatchSize : 0L, (r16 & 8) != 0 ? com.datadog.android.api.storage.FeatureStorageConfiguration.INSTANCE.getDEFAULT().oldBatchThreshold : RUM_TTL_24H);
        this.storageConfiguration = copy;
    }

    /* renamed from: getApplicationId$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: getConfiguration$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.RumFeature.Configuration getConfiguration() {
        return this.configuration;
    }

    public /* synthetic */ RumFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, com.datadog.android.rum.internal.RumFeature.Configuration configuration, com.datadog.android.rum.internal.RumFeature.AnonymousClass1 anonymousClass1, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, str, configuration, (i & 8) != 0 ? new kotlin.jvm.functions.Function1<com.datadog.android.core.InternalSdkCore, com.datadog.android.rum.internal.DatadogLateCrashReporter>() { // from class: com.datadog.android.rum.internal.RumFeature.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.DatadogLateCrashReporter invoke(com.datadog.android.core.InternalSdkCore internalSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
                return new com.datadog.android.rum.internal.DatadogLateCrashReporter(internalSdkCore, null, null, 6, null);
            }
        } : anonymousClass1, (i & 16) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    public final com.datadog.android.api.storage.DataWriter<java.lang.Object> getDataWriter$dd_sdk_android_rum_release() {
        return this.dataWriter;
    }

    public final void setDataWriter$dd_sdk_android_rum_release(com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataWriter, "");
        this.dataWriter = dataWriter;
    }

    /* renamed from: getInitialized$dd_sdk_android_rum_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    public final void setSampleRate$dd_sdk_android_rum_release(float f) {
        this.sampleRate = f;
    }

    /* renamed from: getTelemetrySampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getTelemetrySampleRate() {
        return this.telemetrySampleRate;
    }

    public final void setTelemetrySampleRate$dd_sdk_android_rum_release(float f) {
        this.telemetrySampleRate = f;
    }

    /* renamed from: getTelemetryConfigurationSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getTelemetryConfigurationSampleRate() {
        return this.telemetryConfigurationSampleRate;
    }

    public final void setTelemetryConfigurationSampleRate$dd_sdk_android_rum_release(float f) {
        this.telemetryConfigurationSampleRate = f;
    }

    /* renamed from: getBackgroundEventTracking$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundEventTracking() {
        return this.backgroundEventTracking;
    }

    public final void setBackgroundEventTracking$dd_sdk_android_rum_release(boolean z) {
        this.backgroundEventTracking = z;
    }

    /* renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    public final void setTrackFrustrations$dd_sdk_android_rum_release(boolean z) {
        this.trackFrustrations = z;
    }

    /* renamed from: getViewTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.tracking.ViewTrackingStrategy getViewTrackingStrategy() {
        return this.viewTrackingStrategy;
    }

    public final void setViewTrackingStrategy$dd_sdk_android_rum_release(com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewTrackingStrategy, "");
        this.viewTrackingStrategy = viewTrackingStrategy;
    }

    /* renamed from: getActionTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy getActionTrackingStrategy() {
        return this.actionTrackingStrategy;
    }

    public final void setActionTrackingStrategy$dd_sdk_android_rum_release(com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy userActionTrackingStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActionTrackingStrategy, "");
        this.actionTrackingStrategy = userActionTrackingStrategy;
    }

    /* renamed from: getLongTaskTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.tracking.TrackingStrategy getLongTaskTrackingStrategy() {
        return this.longTaskTrackingStrategy;
    }

    public final void setLongTaskTrackingStrategy$dd_sdk_android_rum_release(com.datadog.android.rum.tracking.TrackingStrategy trackingStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingStrategy, "");
        this.longTaskTrackingStrategy = trackingStrategy;
    }

    /* renamed from: getCpuVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalMonitor getCpuVitalMonitor() {
        return this.cpuVitalMonitor;
    }

    public final void setCpuVitalMonitor$dd_sdk_android_rum_release(com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        this.cpuVitalMonitor = vitalMonitor;
    }

    /* renamed from: getMemoryVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalMonitor getMemoryVitalMonitor() {
        return this.memoryVitalMonitor;
    }

    public final void setMemoryVitalMonitor$dd_sdk_android_rum_release(com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        this.memoryVitalMonitor = vitalMonitor;
    }

    /* renamed from: getFrameRateVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalMonitor getFrameRateVitalMonitor() {
        return this.frameRateVitalMonitor;
    }

    public final void setFrameRateVitalMonitor$dd_sdk_android_rum_release(com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        this.frameRateVitalMonitor = vitalMonitor;
    }

    public final java.util.concurrent.atomic.AtomicReference<android.app.Application.ActivityLifecycleCallbacks> getDebugActivityLifecycleListener$dd_sdk_android_rum_release() {
        return this.debugActivityLifecycleListener;
    }

    public final void setDebugActivityLifecycleListener$dd_sdk_android_rum_release(java.util.concurrent.atomic.AtomicReference<android.app.Application.ActivityLifecycleCallbacks> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        this.debugActivityLifecycleListener = atomicReference;
    }

    /* renamed from: getFrameStatesAggregator$dd_sdk_android_rum_release, reason: from getter */
    public final android.app.Application.ActivityLifecycleCallbacks getFrameStatesAggregator() {
        return this.frameStatesAggregator;
    }

    public final void setFrameStatesAggregator$dd_sdk_android_rum_release(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.frameStatesAggregator = activityLifecycleCallbacks;
    }

    /* renamed from: getSessionListener$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.RumSessionListener getSessionListener() {
        return this.sessionListener;
    }

    public final void setSessionListener$dd_sdk_android_rum_release(com.datadog.android.rum.RumSessionListener rumSessionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionListener, "");
        this.sessionListener = rumSessionListener;
    }

    /* renamed from: getVitalExecutorService$dd_sdk_android_rum_release, reason: from getter */
    public final java.util.concurrent.ScheduledExecutorService getVitalExecutorService() {
        return this.vitalExecutorService;
    }

    public final void setVitalExecutorService$dd_sdk_android_rum_release(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.vitalExecutorService = scheduledExecutorService;
    }

    /* renamed from: getAnrDetectorRunnable$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.anr.ANRDetectorRunnable getAnrDetectorRunnable() {
        return this.anrDetectorRunnable;
    }

    public final void setAnrDetectorRunnable$dd_sdk_android_rum_release(com.datadog.android.rum.internal.anr.ANRDetectorRunnable aNRDetectorRunnable) {
        this.anrDetectorRunnable = aNRDetectorRunnable;
    }

    public final android.content.Context getAppContext$dd_sdk_android_rum_release() {
        android.content.Context context = this.appContext;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setAppContext$dd_sdk_android_rum_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.appContext = context;
    }

    /* renamed from: getInitialResourceIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier getInitialResourceIdentifier() {
        return this.initialResourceIdentifier;
    }

    public final void setInitialResourceIdentifier$dd_sdk_android_rum_release(com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
        this.initialResourceIdentifier = initialResourceIdentifier;
    }

    /* renamed from: getLastInteractionIdentifier$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier getLastInteractionIdentifier() {
        return this.lastInteractionIdentifier;
    }

    public final void setLastInteractionIdentifier$dd_sdk_android_rum_release(com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier) {
        this.lastInteractionIdentifier = lastInteractionIdentifier;
    }

    /* renamed from: getSlowFramesListener$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener getSlowFramesListener() {
        return this.slowFramesListener;
    }

    public final void setSlowFramesListener$dd_sdk_android_rum_release(com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener) {
        this.slowFramesListener = slowFramesListener;
    }

    public final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> getAccessibilityReader$dd_sdk_android_rum_release() {
        return this.accessibilityReader;
    }

    public final void setAccessibilityReader$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> infoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        this.accessibilityReader = infoProvider;
    }

    /* renamed from: getAccessibilitySnapshotManager$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager getAccessibilitySnapshotManager() {
        return this.accessibilitySnapshotManager;
    }

    public final void setAccessibilitySnapshotManager$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
        this.accessibilitySnapshotManager = accessibilitySnapshotManager;
    }

    public final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> getBatteryInfoProvider$dd_sdk_android_rum_release() {
        return this.batteryInfoProvider;
    }

    public final void setBatteryInfoProvider$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        this.batteryInfoProvider = infoProvider;
    }

    public final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> getDisplayInfoProvider$dd_sdk_android_rum_release() {
        return this.displayInfoProvider;
    }

    public final void setDisplayInfoProvider$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        this.displayInfoProvider = infoProvider;
    }

    public final java.util.Set<com.datadog.android.api.feature.FeatureContextUpdateReceiver> getRumContextUpdateReceivers$dd_sdk_android_rum_release() {
        return this.rumContextUpdateReceivers;
    }

    /* renamed from: getInsightsCollector$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInsightsCollector() {
        return this.insightsCollector;
    }

    public final void setInsightsCollector$dd_sdk_android_rum_release(com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.insightsCollector = insightsCollector;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(android.content.Context appContext) {
        float sampleRate;
        com.datadog.android.rum.internal.tracking.NoOpUserActionTrackingStrategy noOpUserActionTrackingStrategy;
        com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener defaultSlowFramesListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        setAppContext$dd_sdk_android_rum_release(appContext);
        if (this.configuration.getCollectAccessibility()) {
            this.accessibilityReader = new com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilityReader(this.getOutputFormats.getInternalLogger(), appContext, this.getOutputFormats.getTimeProvider(), null, null, null, null, null, null, 504, null);
            this.accessibilitySnapshotManager = new com.datadog.android.rum.internal.domain.accessibility.DefaultAccessibilitySnapshotManager(this.accessibilityReader);
        }
        this.initialResourceIdentifier = this.configuration.getInitialResourceIdentifier();
        this.lastInteractionIdentifier = this.configuration.getLastInteractionIdentifier();
        this.insightsCollector = this.configuration.getInsightsCollector();
        com.datadog.android.rum.internal.RumFeature.Configuration configuration = this.configuration;
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getOutputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNull(featureSdkCore, "");
        com.datadog.android.core.InternalSdkCore internalSdkCore = (com.datadog.android.core.InternalSdkCore) featureSdkCore;
        com.datadog.android.rum.internal.vitals.FPSVitalListener fPSVitalListener = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        this.dataWriter = new com.datadog.android.rum.internal.domain.RumDataWriter(new com.datadog.android.event.MapperSerializer(new com.datadog.android.rum.internal.domain.event.RumEventMapper(configuration.getViewEventMapper(), configuration.getErrorEventMapper(), configuration.getResourceEventMapper(), configuration.getActionEventMapper(), configuration.getLongTaskEventMapper(), configuration.getVitalOperationStepEventMapper(), configuration.getVitalAppLaunchEventMapper(), configuration.getTelemetryConfigurationMapper(), internalSdkCore.getInternalLogger()), new com.datadog.android.rum.internal.domain.event.RumEventSerializer(internalSdkCore.getInternalLogger(), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0)), new com.datadog.android.rum.internal.domain.event.RumEventMetaSerializer(), internalSdkCore);
        if (((com.datadog.android.core.InternalSdkCore) this.getOutputFormats).getIsDeveloperModeEnabled()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$onInitialize$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.RumFeature.DEVELOPER_MODE_SAMPLE_RATE_CHANGED_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            sampleRate = 100.0f;
        } else {
            sampleRate = this.configuration.getSampleRate();
        }
        this.sampleRate = sampleRate;
        this.telemetrySampleRate = this.configuration.getTelemetrySampleRate();
        this.telemetryConfigurationSampleRate = this.configuration.getTelemetryConfigurationSampleRate();
        this.backgroundEventTracking = this.configuration.getBackgroundEventTracking();
        this.trackFrustrations = this.configuration.getTrackFrustrations();
        this.batteryInfoProvider = new com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider(appContext, this.getOutputFormats.getTimeProvider(), null, null, 0, 28, null);
        this.displayInfoProvider = new com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider(appContext, this.getOutputFormats.getInternalLogger(), null, null, null, 28, null);
        com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy = this.configuration.getViewTrackingStrategy();
        if (viewTrackingStrategy != null) {
            this.viewTrackingStrategy = viewTrackingStrategy;
        }
        if (this.configuration.getUserActionTracking()) {
            noOpUserActionTrackingStrategy = com.datadog.android.rum.internal.RumFeature.Companion.access$provideUserTrackingStrategy(INSTANCE, (com.datadog.android.rum.tracking.ViewAttributesProvider[]) this.configuration.getTouchTargetExtraAttributesProviders().toArray(new com.datadog.android.rum.tracking.ViewAttributesProvider[0]), this.configuration.getInteractionPredicate(), this.configuration.getComposeActionTrackingStrategy(), this.getHighSpeedVideoFpsRanges, this.getOutputFormats.getInternalLogger());
        } else {
            noOpUserActionTrackingStrategy = new com.datadog.android.rum.internal.tracking.NoOpUserActionTrackingStrategy();
        }
        this.actionTrackingStrategy = noOpUserActionTrackingStrategy;
        com.datadog.android.rum.tracking.TrackingStrategy longTaskTrackingStrategy = this.configuration.getLongTaskTrackingStrategy();
        if (longTaskTrackingStrategy != null) {
            this.longTaskTrackingStrategy = longTaskTrackingStrategy;
        }
        com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsMonitorUpdateFrequency = this.configuration.getVitalsMonitorUpdateFrequency();
        com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration = this.configuration.getSlowFramesConfiguration();
        int i = 1;
        if (vitalsMonitorUpdateFrequency != com.datadog.android.rum.configuration.VitalsUpdateFrequency.NEVER || slowFramesConfiguration != null) {
            if (vitalsMonitorUpdateFrequency != com.datadog.android.rum.configuration.VitalsUpdateFrequency.NEVER) {
                this.vitalExecutorService = this.getOutputFormats.createScheduledExecutorService("rum-vital");
            }
            if (vitalsMonitorUpdateFrequency != com.datadog.android.rum.configuration.VitalsUpdateFrequency.NEVER) {
                this.cpuVitalMonitor = new com.datadog.android.rum.internal.vitals.AggregatingVitalMonitor();
                getHighSpeedVideoFpsRangesFor(new com.datadog.android.rum.internal.vitals.CPUVitalReader(objArr4 == true ? 1 : 0, this.getOutputFormats.getInternalLogger(), i, objArr3 == true ? 1 : 0), this.cpuVitalMonitor, vitalsMonitorUpdateFrequency.getPeriodInMs());
            }
            if (vitalsMonitorUpdateFrequency != com.datadog.android.rum.configuration.VitalsUpdateFrequency.NEVER) {
                this.memoryVitalMonitor = new com.datadog.android.rum.internal.vitals.AggregatingVitalMonitor();
                getHighSpeedVideoFpsRangesFor(new com.datadog.android.rum.internal.vitals.MemoryVitalReader(objArr2 == true ? 1 : 0, this.getOutputFormats.getInternalLogger(), i, objArr == true ? 1 : 0), this.memoryVitalMonitor, vitalsMonitorUpdateFrequency.getPeriodInMs());
            }
            if (!this.configuration.getDisableJankStats()) {
                android.app.Application application = appContext instanceof android.app.Application ? (android.app.Application) appContext : null;
                com.datadog.android.rum.internal.vitals.FrameStateListener[] frameStateListenerArr = new com.datadog.android.rum.internal.vitals.FrameStateListener[2];
                if (slowFramesConfiguration != null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$initializeSlowFrameListener$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.RumFeature.SLOW_FRAMES_MONITORING_ENABLED_MESSAGE;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    defaultSlowFramesListener = new com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener(slowFramesConfiguration, new com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher(slowFramesConfiguration, this.getOutputFormats.getInternalLogger(), 0.0f, 4, null), this.insightsCollector, this.getOutputFormats.getTimeProvider());
                } else {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$initializeSlowFrameListener$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.RumFeature.SLOW_FRAMES_MONITORING_DISABLED_MESSAGE;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    defaultSlowFramesListener = null;
                }
                this.slowFramesListener = defaultSlowFramesListener;
                frameStateListenerArr[0] = defaultSlowFramesListener;
                if (vitalsMonitorUpdateFrequency != com.datadog.android.rum.configuration.VitalsUpdateFrequency.NEVER) {
                    this.frameRateVitalMonitor = new com.datadog.android.rum.internal.vitals.AggregatingVitalMonitor();
                    fPSVitalListener = new com.datadog.android.rum.internal.vitals.FPSVitalListener(this.frameRateVitalMonitor, null, 0.0d, 6, null);
                }
                frameStateListenerArr[1] = fPSVitalListener;
                com.datadog.android.rum.internal.vitals.FrameStatesAggregator frameStatesAggregator = new com.datadog.android.rum.internal.vitals.FrameStatesAggregator(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) frameStateListenerArr), this.getOutputFormats.getInternalLogger(), null, null, 12, null);
                this.frameStatesAggregator = frameStatesAggregator;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(frameStatesAggregator);
                }
            }
        }
        if (this.configuration.getTrackNonFatalAnrs()) {
            com.datadog.android.rum.internal.anr.ANRDetectorRunnable aNRDetectorRunnable = new com.datadog.android.rum.internal.anr.ANRDetectorRunnable(this.getOutputFormats, new android.os.Handler(android.os.Looper.getMainLooper()), 0L, 0L, 12, null);
            java.util.concurrent.ExecutorService createSingleThreadExecutorService = this.getOutputFormats.createSingleThreadExecutorService("rum-anr-detection");
            this.getHighSpeedVideoSizes = createSingleThreadExecutorService;
            if (createSingleThreadExecutorService != null) {
                com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(createSingleThreadExecutorService, "ANR detection", this.getOutputFormats.getInternalLogger(), aNRDetectorRunnable);
            }
            this.anrDetectorRunnable = aNRDetectorRunnable;
        }
        this.actionTrackingStrategy.register(this.getOutputFormats, appContext);
        this.viewTrackingStrategy.register(this.getOutputFormats, appContext);
        this.longTaskTrackingStrategy.register(this.getOutputFormats, appContext);
        this.sessionListener = this.configuration.getSessionListener();
        com.datadog.android.rum.internal.startup.RumAppStartupDetector.Companion companion = com.datadog.android.rum.internal.startup.RumAppStartupDetector.INSTANCE;
        android.content.Context applicationContext = getAppContext$dd_sdk_android_rum_release().getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2 = this.getOutputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNull(featureSdkCore2, "");
        this.Camera2StreamConfigurationMap = companion.create((android.app.Application) applicationContext, (com.datadog.android.core.InternalSdkCore) featureSdkCore2, new com.datadog.android.rum.internal.startup.RumAppStartupDetector.Listener() { // from class: com.datadog.android.rum.internal.RumFeature$initRumAppStartupDetector$1

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter getHighSpeedVideoSizes;

            {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore3;
                com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Companion companion2 = com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.INSTANCE;
                featureSdkCore3 = com.datadog.android.rum.internal.RumFeature.this.getOutputFormats;
                this.getHighSpeedVideoSizes = companion2.create((com.datadog.android.core.InternalSdkCore) featureSdkCore3);
            }

            @Override // com.datadog.android.rum.internal.startup.RumAppStartupDetector.Listener
            public final void onAppStartupDetected(com.datadog.android.rum.internal.startup.RumStartupScenario scenario) {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
                android.app.Activity activity = scenario.getActivity().get();
                if (activity != null) {
                    featureSdkCore3 = com.datadog.android.rum.internal.RumFeature.this.getOutputFormats;
                    com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore3);
                    com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor : null;
                    if (advancedRumMonitor == null) {
                        return;
                    }
                    advancedRumMonitor.sendAppStartEvent(scenario);
                    getHighSpeedVideoSizes(scenario, activity, advancedRumMonitor, false);
                }
            }

            @Override // com.datadog.android.rum.internal.startup.RumAppStartupDetector.Listener
            public final void onNextActivityCreated(com.datadog.android.rum.internal.startup.RumStartupScenario pendingScenario, android.app.Activity activity) {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingScenario, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                featureSdkCore3 = com.datadog.android.rum.internal.RumFeature.this.getOutputFormats;
                com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore3);
                com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor : null;
                if (advancedRumMonitor == null) {
                    return;
                }
                getHighSpeedVideoSizes(pendingScenario, activity, advancedRumMonitor, true);
            }

            private final void getHighSpeedVideoSizes(final com.datadog.android.rum.internal.startup.RumStartupScenario p0, android.app.Activity p1, final com.datadog.android.rum.internal.monitor.AdvancedRumMonitor p2, final boolean p3) {
                final com.datadog.android.rum.internal.RumFeature rumFeature = com.datadog.android.rum.internal.RumFeature.this;
                this.getHighSpeedVideoSizes.subscribeToFirstFrameDrawn(p1, new com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback() { // from class: com.datadog.android.rum.internal.RumFeature$initRumAppStartupDetector$1$subscribeToFirstFrameDrawn$callback$1
                    @Override // com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback
                    public final void onFirstFrameDrawn(long timestampNs) {
                        com.datadog.android.rum.internal.startup.RumAppStartupDetector rumAppStartupDetector;
                        com.datadog.android.rum.internal.startup.RumAppStartupDetector rumAppStartupDetector2;
                        rumAppStartupDetector = com.datadog.android.rum.internal.RumFeature.this.Camera2StreamConfigurationMap;
                        com.datadog.android.rum.internal.startup.RumStartupScenario getHighSpeedVideoSizesFor = rumAppStartupDetector != null ? rumAppStartupDetector.getGetHighSpeedVideoSizesFor() : null;
                        com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario = p0;
                        if (getHighSpeedVideoSizesFor == rumStartupScenario) {
                            p2.sendTTIDEvent(new com.datadog.android.rum.internal.startup.RumTTIDInfo(p0, timestampNs - rumStartupScenario.getInitialTime().getNanoTime(), p3));
                            rumAppStartupDetector2 = com.datadog.android.rum.internal.RumFeature.this.Camera2StreamConfigurationMap;
                            if (rumAppStartupDetector2 != null) {
                                rumAppStartupDetector2.clearPendingScenario();
                            }
                        }
                    }
                });
            }
        }, this.configuration.getAppStartupActivityPredicate());
        this.getOutputFormats.setEventReceiver(getName(), this);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.net.RequestFactory getRequestFactory() {
        return (com.datadog.android.api.net.RequestFactory) this.requestFactory.getValue();
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        this.getOutputFormats.removeEventReceiver(getName());
        java.util.Iterator<T> it = this.rumContextUpdateReceivers.iterator();
        while (it.hasNext()) {
            this.getOutputFormats.removeContextUpdateReceiver((com.datadog.android.api.feature.FeatureContextUpdateReceiver) it.next());
        }
        this.rumContextUpdateReceivers.clear();
        android.content.Context appContext$dd_sdk_android_rum_release = getAppContext$dd_sdk_android_rum_release();
        this.actionTrackingStrategy.unregister(appContext$dd_sdk_android_rum_release);
        this.viewTrackingStrategy.unregister(appContext$dd_sdk_android_rum_release);
        this.longTaskTrackingStrategy.unregister(appContext$dd_sdk_android_rum_release);
        this.dataWriter = new com.datadog.android.api.storage.NoOpDataWriter();
        this.viewTrackingStrategy = new com.datadog.android.rum.tracking.NoOpViewTrackingStrategy();
        this.actionTrackingStrategy = new com.datadog.android.rum.internal.tracking.NoOpUserActionTrackingStrategy();
        this.longTaskTrackingStrategy = new com.datadog.android.rum.tracking.NoOpTrackingStrategy();
        this.cpuVitalMonitor = new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor();
        this.memoryVitalMonitor = new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor();
        this.frameRateVitalMonitor = new com.datadog.android.rum.internal.vitals.NoOpVitalMonitor();
        this.vitalExecutorService.shutdownNow();
        java.util.concurrent.ExecutorService executorService = this.getHighSpeedVideoSizes;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        com.datadog.android.rum.internal.anr.ANRDetectorRunnable aNRDetectorRunnable = this.anrDetectorRunnable;
        if (aNRDetectorRunnable != null) {
            aNRDetectorRunnable.stop();
        }
        this.vitalExecutorService = new com.datadog.android.rum.internal.thread.NoOpScheduledExecutorService();
        this.sessionListener = new com.datadog.android.rum.internal.NoOpRumSessionListener();
        if (this.configuration.getCollectAccessibility()) {
            this.accessibilityReader.cleanup();
            this.accessibilityReader = new com.datadog.android.rum.internal.domain.accessibility.NoOpAccessibilityReader();
            this.accessibilitySnapshotManager = new com.datadog.android.rum.internal.domain.accessibility.NoOpAccessibilitySnapshotManager();
        }
        this.batteryInfoProvider.cleanup();
        this.batteryInfoProvider = new com.datadog.android.rum.internal.domain.battery.NoOpBatteryInfoProvider();
        this.displayInfoProvider.cleanup();
        this.displayInfoProvider = new com.datadog.android.rum.internal.domain.display.NoOpDisplayInfoProvider();
        com.datadog.android.rum.internal.startup.RumAppStartupDetector rumAppStartupDetector = this.Camera2StreamConfigurationMap;
        if (rumAppStartupDetector != null) {
            rumAppStartupDetector.destroy();
        }
        this.Camera2StreamConfigurationMap = null;
        com.datadog.android.rum.GlobalRumMonitor.INSTANCE.unregister$dd_sdk_android_rum_release(this.getOutputFormats);
        this.initialized.set(false);
    }

    @Override // com.datadog.android.api.feature.FeatureEventReceiver
    public final void onReceive(final java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof java.util.Map)) {
            if (!(event instanceof com.datadog.android.core.feature.event.JvmCrash.Rum)) {
                if (!(event instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent)) {
                    if (!(event instanceof com.datadog.android.internal.flags.RumFlagEvaluationMessage)) {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$onReceive$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.RumFeature.UNSUPPORTED_EVENT_TYPE, java.util.Arrays.copyOf(new java.lang.Object[]{event.getClass().getCanonicalName()}, 1));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                return format;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        return;
                    }
                    com.datadog.android.internal.flags.RumFlagEvaluationMessage rumFlagEvaluationMessage = (com.datadog.android.internal.flags.RumFlagEvaluationMessage) event;
                    com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
                    com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor : null;
                    if (advancedRumMonitor != null) {
                        advancedRumMonitor.addFeatureFlagEvaluation(rumFlagEvaluationMessage.getFlagKey(), rumFlagEvaluationMessage.getValue());
                        return;
                    }
                    return;
                }
                com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent = (com.datadog.android.internal.telemetry.InternalTelemetryEvent) event;
                com.datadog.android.rum.RumMonitor rumMonitor2 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
                com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor2 = rumMonitor2 instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor2 : null;
                if (advancedRumMonitor2 != null) {
                    advancedRumMonitor2.sendTelemetryEvent(internalTelemetryEvent);
                    return;
                }
                return;
            }
            com.datadog.android.core.feature.event.JvmCrash.Rum rum = (com.datadog.android.core.feature.event.JvmCrash.Rum) event;
            com.datadog.android.rum.RumMonitor rumMonitor3 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
            com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor3 = rumMonitor3 instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor3 : null;
            if (advancedRumMonitor3 != null) {
                advancedRumMonitor3.addCrash(rum.getMessage(), com.datadog.android.rum.RumErrorSource.SOURCE, rum.getThrowable(), rum.getThreads());
                return;
            }
            return;
        }
        final java.util.Map<?, ?> map = (java.util.Map) event;
        java.lang.Object obj = map.get("type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, NDK_CRASH_BUS_MESSAGE_TYPE)) {
            ((com.datadog.android.rum.internal.LateCrashReporter) this.getHighSpeedVideoFpsRangesFor.getValue()).handleNdkCrashEvent(map, this.dataWriter);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, LOGGER_ERROR_BUS_MESSAGE_TYPE)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, WEB_VIEW_INGESTED_NOTIFICATION_MESSAGE_TYPE)) {
                    com.datadog.android.rum.RumMonitor rumMonitor4 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
                    com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor4 = rumMonitor4 instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor4 : null;
                    if (advancedRumMonitor4 != null) {
                        advancedRumMonitor4.sendWebViewEvent();
                        return;
                    }
                    return;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, TELEMETRY_SESSION_REPLAY_SKIP_FRAME)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj, FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE)) {
                        com.datadog.android.rum.RumMonitor rumMonitor5 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
                        com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor = rumMonitor5 instanceof com.datadog.android.rum.internal.monitor.DatadogRumMonitor ? (com.datadog.android.rum.internal.monitor.DatadogRumMonitor) rumMonitor5 : null;
                        if (datadogRumMonitor != null) {
                            datadogRumMonitor.drainExecutorService$dd_sdk_android_rum_release();
                            return;
                        }
                        return;
                    }
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$handleMapLikeEvent$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.RumFeature.UNKNOWN_EVENT_TYPE_PROPERTY_VALUE, java.util.Arrays.copyOf(new java.lang.Object[]{map.get("type")}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    return;
                }
                com.datadog.android.rum.RumMonitor rumMonitor6 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
                com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor5 = rumMonitor6 instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor6 : null;
                if (advancedRumMonitor5 != null) {
                    advancedRumMonitor5.addSessionReplaySkippedFrame();
                    return;
                }
                return;
            }
            java.lang.Object obj2 = map.get("stacktrace");
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.Object obj3 = map.get("message");
            java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            java.lang.Object obj4 = map.get(EVENT_ATTRIBUTES_PROPERTY);
            java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
            if (str2 == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$addLoggerErrorWithStacktrace$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.RumFeature.LOG_ERROR_WITH_STACKTRACE_EVENT_MISSING_MANDATORY_FIELDS;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return;
            }
            com.datadog.android.rum.RumMonitor rumMonitor7 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
            com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor6 = rumMonitor7 instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor7 : null;
            if (advancedRumMonitor6 != null) {
                com.datadog.android.rum.RumErrorSource rumErrorSource = com.datadog.android.rum.RumErrorSource.LOGGER;
                if (map2 == null) {
                    map2 = kotlin.collections.MapsKt.emptyMap();
                }
                advancedRumMonitor6.addErrorWithStacktrace(str2, rumErrorSource, str, map2);
                return;
            }
            return;
        }
        java.lang.Object obj5 = map.get(EVENT_THROWABLE_PROPERTY);
        java.lang.Throwable th = obj5 instanceof java.lang.Throwable ? (java.lang.Throwable) obj5 : null;
        java.lang.Object obj6 = map.get("message");
        java.lang.String str3 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        java.lang.Object obj7 = map.get(EVENT_ATTRIBUTES_PROPERTY);
        java.util.Map<java.lang.String, ? extends java.lang.Object> map3 = obj7 instanceof java.util.Map ? (java.util.Map) obj7 : null;
        if (str3 == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$addLoggerError$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.RumFeature.LOG_ERROR_EVENT_MISSING_MANDATORY_FIELDS;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        com.datadog.android.rum.RumMonitor rumMonitor8 = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats);
        com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor7 = rumMonitor8 instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor8 : null;
        if (advancedRumMonitor7 != null) {
            com.datadog.android.rum.RumErrorSource rumErrorSource2 = com.datadog.android.rum.RumErrorSource.LOGGER;
            if (map3 == null) {
                map3 = kotlin.collections.MapsKt.emptyMap();
            }
            advancedRumMonitor7.addError(str3, rumErrorSource2, th, map3);
        }
    }

    public final void enableDebugging$dd_sdk_android_rum_release(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
        if (!this.initialized.get()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$enableDebugging$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot enable RUM debugging.";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        android.content.Context appContext$dd_sdk_android_rum_release = getAppContext$dd_sdk_android_rum_release();
        synchronized (this.debugActivityLifecycleListener) {
            if ((appContext$dd_sdk_android_rum_release instanceof android.app.Application) && this.debugActivityLifecycleListener.get() == null) {
                com.datadog.android.rum.internal.debug.UiRumDebugListener uiRumDebugListener = new com.datadog.android.rum.internal.debug.UiRumDebugListener(this.getOutputFormats, advancedRumMonitor);
                this.debugActivityLifecycleListener.set(uiRumDebugListener);
                ((android.app.Application) appContext$dd_sdk_android_rum_release).registerActivityLifecycleCallbacks(uiRumDebugListener);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void disableDebugging$dd_sdk_android_rum_release() {
        android.content.Context appContext$dd_sdk_android_rum_release = getAppContext$dd_sdk_android_rum_release();
        synchronized (this.debugActivityLifecycleListener) {
            if (this.debugActivityLifecycleListener.get() != null && (appContext$dd_sdk_android_rum_release instanceof android.app.Application)) {
                ((android.app.Application) appContext$dd_sdk_android_rum_release).unregisterActivityLifecycleCallbacks(this.debugActivityLifecycleListener.get());
                this.debugActivityLifecycleListener.set(null);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void consumeLastFatalAnr$dd_sdk_android_rum_release(java.util.concurrent.ExecutorService rumEventsExecutorService) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumEventsExecutorService, "");
        java.lang.Object systemService = getAppContext$dd_sdk_android_rum_release().getSystemService("activity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        final android.app.ApplicationExitInfo applicationExitInfo = null;
        try {
            java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = ((android.app.ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "");
            java.util.Iterator<T> it = historicalProcessExitReasons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((android.app.ApplicationExitInfo) obj).getReason() == 6) {
                        break;
                    }
                }
            }
            applicationExitInfo = (android.app.ApplicationExitInfo) obj;
        } catch (java.lang.RuntimeException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$consumeLastFatalAnr$lastKnownAnr$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.RumFeature.FAILED_TO_GET_HISTORICAL_EXIT_REASONS;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
        if (applicationExitInfo == null) {
            return;
        }
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(rumEventsExecutorService, "Send fatal ANR", this.getOutputFormats.getInternalLogger(), new java.lang.Runnable() { // from class: com.datadog.android.rum.internal.RumFeature$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.rum.internal.RumFeature.m10019$r8$lambda$5XEDb7TKdvV6dd2uVO7mrCXU0(com.datadog.android.rum.internal.RumFeature.this, applicationExitInfo);
            }
        });
    }

    public final void enableJankStatsTracking$dd_sdk_android_rum_release(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        try {
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.frameStatesAggregator;
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            }
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$enableJankStatsTracking$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.RumFeature.FAILED_TO_ENABLE_JANK_STATS_TRACKING_MANUALLY;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.vitals.VitalReader p0, com.datadog.android.rum.internal.vitals.VitalObserver p1, long p2) {
        com.datadog.android.rum.internal.vitals.VitalReaderRunnable vitalReaderRunnable = new com.datadog.android.rum.internal.vitals.VitalReaderRunnable(this.getOutputFormats, p0, p1, this.vitalExecutorService, p2);
        vitalReaderRunnable.getSdkCore().setContextUpdateReceiver(vitalReaderRunnable);
        this.rumContextUpdateReceivers.add(vitalReaderRunnable);
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.scheduleSafe(this.vitalExecutorService, "Vitals monitoring", p2, java.util.concurrent.TimeUnit.MILLISECONDS, this.getOutputFormats.getInternalLogger(), vitalReaderRunnable);
    }

    @kotlin.Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b6\b\u0080\b\u0018\u00002\u00020\u0001BÝ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0013\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0013\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00102\u001a\u000201\u0012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000103\u0012\u0006\u00105\u001a\u00020\b\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u00109\u001a\u00020\b\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013HÆ\u0003¢\u0006\u0004\bD\u0010CJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013HÆ\u0003¢\u0006\u0004\bE\u0010CJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013HÆ\u0003¢\u0006\u0004\bF\u0010CJ\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013HÆ\u0003¢\u0006\u0004\bG\u0010CJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013HÆ\u0003¢\u0006\u0004\bH\u0010CJ\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020 0\u0013HÆ\u0003¢\u0006\u0004\bI\u0010CJ\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0\u0013HÆ\u0003¢\u0006\u0004\bJ\u0010CJ\u0010\u0010K\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0010\u0010N\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bP\u0010LJ\u0010\u0010Q\u001a\u00020'HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020)HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020+HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u000201HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u001c\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000103HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b_\u0010LJ\u0012\u0010`\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bb\u0010OJ\u0010\u0010c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bc\u0010LJ\u0010\u0010d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bd\u0010LJ\u0010\u0010e\u001a\u00020:HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020<HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bi\u0010OJ\u0010\u0010j\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bj\u0010LJ\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bq\u0010rJ¨\u0003\u0010s\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\b\b\u0002\u00102\u001a\u0002012\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001032\b\b\u0002\u00105\u001a\u00020\b2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020<HÆ\u0001¢\u0006\u0004\bs\u0010tJ\u001a\u0010v\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bv\u0010wJ\u0010\u0010y\u001a\u00020xHÖ\u0001¢\u0006\u0004\by\u0010zJ\u0010\u0010{\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b{\u0010AR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0007¢\u0006\f\n\u0004\b\u001b\u0010|\u001a\u0004\b}\u0010CR&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010~\u001a\u0004\b\u007f\u0010^R\u001c\u0010=\u001a\u00020<8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b=\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010hR\u001c\u0010$\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010LR\u001c\u00108\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010\u0082\u0001\u001a\u0005\b\u0084\u0001\u0010LR\u001c\u00102\u001a\u0002018\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010\\R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010AR\u001c\u00109\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010\u0082\u0001\u001a\u0005\b\u0089\u0001\u0010LR!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0017\u0010|\u001a\u0005\b\u008a\u0001\u0010CR\u001c\u0010,\u001a\u00020+8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010VR\u001c\u0010;\u001a\u00020:8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010fR\u001c\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010nR\u001e\u0010.\u001a\u0004\u0018\u00010-8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010XR!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001d\u0010|\u001a\u0005\b\u0093\u0001\u0010CR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010rR!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0019\u0010|\u001a\u0005\b\u0096\u0001\u0010CR\u001e\u00107\u001a\u0004\u0018\u0001068\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010aR\u001c\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010OR\u001c\u0010*\u001a\u00020)8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010TR\u001e\u00100\u001a\u0004\u0018\u00010/8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010ZR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b#\u0010|\u001a\u0005\b\u009f\u0001\u0010CR\u001c\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0099\u0001\u001a\u0005\b \u0001\u0010OR\u001c\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u0099\u0001\u001a\u0005\b¡\u0001\u0010OR\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010¢\u0001\u001a\u0005\b£\u0001\u0010lR\u001c\u00105\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010\u0082\u0001\u001a\u0005\b¤\u0001\u0010LR\u001c\u0010%\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0082\u0001\u001a\u0005\b¥\u0001\u0010LR\u001c\u0010&\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0082\u0001\u001a\u0005\b¦\u0001\u0010LR\u001c\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0082\u0001\u001a\u0005\b§\u0001\u0010LR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0015\u0010|\u001a\u0005\b¨\u0001\u0010CR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010©\u0001\u001a\u0005\bª\u0001\u0010pR!\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010|\u001a\u0005\b«\u0001\u0010CR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00138\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001f\u0010|\u001a\u0005\b¬\u0001\u0010CR\u001c\u0010(\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010R"}, d2 = {"Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "", "", "customEndpointUrl", "", "sampleRate", "telemetrySampleRate", "telemetryConfigurationSampleRate", "", "userActionTracking", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "touchTargetExtraAttributesProviders", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "viewTrackingStrategy", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "longTaskTrackingStrategy", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEventMapper", "Lcom/datadog/android/rum/model/ErrorEvent;", "errorEventMapper", "Lcom/datadog/android/rum/model/ResourceEvent;", "resourceEventMapper", "Lcom/datadog/android/rum/model/ActionEvent;", "actionEventMapper", "Lcom/datadog/android/rum/model/LongTaskEvent;", "longTaskEventMapper", "Lcom/datadog/android/rum/model/VitalOperationStepEvent;", "vitalOperationStepEventMapper", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "vitalAppLaunchEventMapper", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "telemetryConfigurationMapper", "backgroundEventTracking", "trackFrustrations", "trackNonFatalAnrs", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "vitalsMonitorUpdateFrequency", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "slowFramesConfiguration", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "composeActionTrackingStrategy", "", "additionalConfig", "trackAnonymousUser", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "collectAccessibility", "disableJankStats", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "appStartupActivityPredicate", "<init>", "(Ljava/lang/String;FFFZLjava/util/List;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;Lcom/datadog/android/rum/tracking/TrackingStrategy;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;ZZZLcom/datadog/android/rum/configuration/VitalsUpdateFrequency;Lcom/datadog/android/rum/RumSessionListener;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;Ljava/util/Map;ZLcom/datadog/android/rum/RumSessionType;ZZLcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;)V", "component1", "()Ljava/lang/String;", "component10", "()Lcom/datadog/android/event/EventMapper;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Z", "component19", "component2", "()F", "component20", "component21", "()Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "component22", "()Lcom/datadog/android/rum/RumSessionListener;", "component23", "()Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "component24", "()Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "component25", "()Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "component26", "()Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "component27", "()Ljava/util/Map;", "component28", "component29", "()Lcom/datadog/android/rum/RumSessionType;", "component3", "component30", "component31", "component32", "()Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "component33", "()Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/datadog/android/rum/tracking/InteractionPredicate;", "component8", "()Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "component9", "()Lcom/datadog/android/rum/tracking/TrackingStrategy;", "copy", "(Ljava/lang/String;FFFZLjava/util/List;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;Lcom/datadog/android/rum/tracking/TrackingStrategy;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;ZZZLcom/datadog/android/rum/configuration/VitalsUpdateFrequency;Lcom/datadog/android/rum/RumSessionListener;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;Ljava/util/Map;ZLcom/datadog/android/rum/RumSessionType;ZZLcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;)Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/event/EventMapper;", "getActionEventMapper", "Ljava/util/Map;", "getAdditionalConfig", "Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "getAppStartupActivityPredicate", "Z", "getBackgroundEventTracking", "getCollectAccessibility", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "getComposeActionTrackingStrategy", "Ljava/lang/String;", "getCustomEndpointUrl", "getDisableJankStats", "getErrorEventMapper", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "getInitialResourceIdentifier", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "getInsightsCollector", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getInteractionPredicate", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "getLastInteractionIdentifier", "getLongTaskEventMapper", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "getLongTaskTrackingStrategy", "getResourceEventMapper", "Lcom/datadog/android/rum/RumSessionType;", "getRumSessionTypeOverride", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate", "Lcom/datadog/android/rum/RumSessionListener;", "getSessionListener", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "getSlowFramesConfiguration", "getTelemetryConfigurationMapper", "getTelemetryConfigurationSampleRate", "getTelemetrySampleRate", "Ljava/util/List;", "getTouchTargetExtraAttributesProviders", "getTrackAnonymousUser", "getTrackFrustrations", "getTrackNonFatalAnrs", "getUserActionTracking", "getViewEventMapper", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "getViewTrackingStrategy", "getVitalAppLaunchEventMapper", "getVitalOperationStepEventMapper", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "getVitalsMonitorUpdateFrequency"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Configuration {
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> actionEventMapper;
        private final java.util.Map<java.lang.String, java.lang.Object> additionalConfig;
        private final com.datadog.android.rum.startup.AppStartupActivityPredicate appStartupActivityPredicate;
        private final boolean backgroundEventTracking;
        private final boolean collectAccessibility;
        private final com.datadog.android.rum.tracking.ActionTrackingStrategy composeActionTrackingStrategy;
        private final java.lang.String customEndpointUrl;
        private final boolean disableJankStats;
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> errorEventMapper;
        private final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier;
        private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector;
        private final com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate;
        private final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier;
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> longTaskEventMapper;
        private final com.datadog.android.rum.tracking.TrackingStrategy longTaskTrackingStrategy;
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> resourceEventMapper;
        private final com.datadog.android.rum.RumSessionType rumSessionTypeOverride;
        private final float sampleRate;
        private final com.datadog.android.rum.RumSessionListener sessionListener;
        private final com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration;
        private final com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> telemetryConfigurationMapper;
        private final float telemetryConfigurationSampleRate;
        private final float telemetrySampleRate;
        private final java.util.List<com.datadog.android.rum.tracking.ViewAttributesProvider> touchTargetExtraAttributesProviders;
        private final boolean trackAnonymousUser;
        private final boolean trackFrustrations;
        private final boolean trackNonFatalAnrs;
        private final boolean userActionTracking;
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> viewEventMapper;
        private final com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy;
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> vitalAppLaunchEventMapper;
        private final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> vitalOperationStepEventMapper;
        private final com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsMonitorUpdateFrequency;

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(java.lang.String str, float f, float f2, float f3, boolean z, java.util.List<? extends com.datadog.android.rum.tracking.ViewAttributesProvider> list, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy, com.datadog.android.rum.tracking.TrackingStrategy trackingStrategy, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> eventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> eventMapper2, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> eventMapper3, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> eventMapper4, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> eventMapper5, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> eventMapper6, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> eventMapper7, com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> eventMapper8, boolean z2, boolean z3, boolean z4, com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsUpdateFrequency, com.datadog.android.rum.RumSessionListener rumSessionListener, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy, java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z5, com.datadog.android.rum.RumSessionType rumSessionType, boolean z6, boolean z7, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector, com.datadog.android.rum.startup.AppStartupActivityPredicate appStartupActivityPredicate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalsUpdateFrequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionListener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionTrackingStrategy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStartupActivityPredicate, "");
            this.customEndpointUrl = str;
            this.sampleRate = f;
            this.telemetrySampleRate = f2;
            this.telemetryConfigurationSampleRate = f3;
            this.userActionTracking = z;
            this.touchTargetExtraAttributesProviders = list;
            this.interactionPredicate = interactionPredicate;
            this.viewTrackingStrategy = viewTrackingStrategy;
            this.longTaskTrackingStrategy = trackingStrategy;
            this.viewEventMapper = eventMapper;
            this.errorEventMapper = eventMapper2;
            this.resourceEventMapper = eventMapper3;
            this.actionEventMapper = eventMapper4;
            this.longTaskEventMapper = eventMapper5;
            this.vitalOperationStepEventMapper = eventMapper6;
            this.vitalAppLaunchEventMapper = eventMapper7;
            this.telemetryConfigurationMapper = eventMapper8;
            this.backgroundEventTracking = z2;
            this.trackFrustrations = z3;
            this.trackNonFatalAnrs = z4;
            this.vitalsMonitorUpdateFrequency = vitalsUpdateFrequency;
            this.sessionListener = rumSessionListener;
            this.initialResourceIdentifier = initialResourceIdentifier;
            this.lastInteractionIdentifier = lastInteractionIdentifier;
            this.slowFramesConfiguration = slowFramesConfiguration;
            this.composeActionTrackingStrategy = actionTrackingStrategy;
            this.additionalConfig = map;
            this.trackAnonymousUser = z5;
            this.rumSessionTypeOverride = rumSessionType;
            this.collectAccessibility = z6;
            this.disableJankStats = z7;
            this.insightsCollector = insightsCollector;
            this.appStartupActivityPredicate = appStartupActivityPredicate;
        }

        public final java.lang.String getCustomEndpointUrl() {
            return this.customEndpointUrl;
        }

        public final float getSampleRate() {
            return this.sampleRate;
        }

        public final float getTelemetrySampleRate() {
            return this.telemetrySampleRate;
        }

        public final float getTelemetryConfigurationSampleRate() {
            return this.telemetryConfigurationSampleRate;
        }

        public final boolean getUserActionTracking() {
            return this.userActionTracking;
        }

        public final java.util.List<com.datadog.android.rum.tracking.ViewAttributesProvider> getTouchTargetExtraAttributesProviders() {
            return this.touchTargetExtraAttributesProviders;
        }

        public final com.datadog.android.rum.tracking.InteractionPredicate getInteractionPredicate() {
            return this.interactionPredicate;
        }

        public final com.datadog.android.rum.tracking.ViewTrackingStrategy getViewTrackingStrategy() {
            return this.viewTrackingStrategy;
        }

        public final com.datadog.android.rum.tracking.TrackingStrategy getLongTaskTrackingStrategy() {
            return this.longTaskTrackingStrategy;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> getViewEventMapper() {
            return this.viewEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> getErrorEventMapper() {
            return this.errorEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> getResourceEventMapper() {
            return this.resourceEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> getActionEventMapper() {
            return this.actionEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> getLongTaskEventMapper() {
            return this.longTaskEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> getVitalOperationStepEventMapper() {
            return this.vitalOperationStepEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> getVitalAppLaunchEventMapper() {
            return this.vitalAppLaunchEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> getTelemetryConfigurationMapper() {
            return this.telemetryConfigurationMapper;
        }

        public final boolean getBackgroundEventTracking() {
            return this.backgroundEventTracking;
        }

        public final boolean getTrackFrustrations() {
            return this.trackFrustrations;
        }

        public final boolean getTrackNonFatalAnrs() {
            return this.trackNonFatalAnrs;
        }

        public final com.datadog.android.rum.configuration.VitalsUpdateFrequency getVitalsMonitorUpdateFrequency() {
            return this.vitalsMonitorUpdateFrequency;
        }

        public final com.datadog.android.rum.RumSessionListener getSessionListener() {
            return this.sessionListener;
        }

        public final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier getInitialResourceIdentifier() {
            return this.initialResourceIdentifier;
        }

        public final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier getLastInteractionIdentifier() {
            return this.lastInteractionIdentifier;
        }

        public final com.datadog.android.rum.configuration.SlowFramesConfiguration getSlowFramesConfiguration() {
            return this.slowFramesConfiguration;
        }

        public final com.datadog.android.rum.tracking.ActionTrackingStrategy getComposeActionTrackingStrategy() {
            return this.composeActionTrackingStrategy;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalConfig() {
            return this.additionalConfig;
        }

        public final boolean getTrackAnonymousUser() {
            return this.trackAnonymousUser;
        }

        public final com.datadog.android.rum.RumSessionType getRumSessionTypeOverride() {
            return this.rumSessionTypeOverride;
        }

        public final boolean getCollectAccessibility() {
            return this.collectAccessibility;
        }

        public final boolean getDisableJankStats() {
            return this.disableJankStats;
        }

        public final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInsightsCollector() {
            return this.insightsCollector;
        }

        public final com.datadog.android.rum.startup.AppStartupActivityPredicate getAppStartupActivityPredicate() {
            return this.appStartupActivityPredicate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.customEndpointUrl;
            float f = this.sampleRate;
            float f2 = this.telemetrySampleRate;
            float f3 = this.telemetryConfigurationSampleRate;
            boolean z = this.userActionTracking;
            java.util.List<com.datadog.android.rum.tracking.ViewAttributesProvider> list = this.touchTargetExtraAttributesProviders;
            com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate = this.interactionPredicate;
            com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            com.datadog.android.rum.tracking.TrackingStrategy trackingStrategy = this.longTaskTrackingStrategy;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> eventMapper = this.viewEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> eventMapper2 = this.errorEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> eventMapper3 = this.resourceEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> eventMapper4 = this.actionEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> eventMapper5 = this.longTaskEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> eventMapper6 = this.vitalOperationStepEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> eventMapper7 = this.vitalAppLaunchEventMapper;
            com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> eventMapper8 = this.telemetryConfigurationMapper;
            boolean z2 = this.backgroundEventTracking;
            boolean z3 = this.trackFrustrations;
            boolean z4 = this.trackNonFatalAnrs;
            com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsUpdateFrequency = this.vitalsMonitorUpdateFrequency;
            com.datadog.android.rum.RumSessionListener rumSessionListener = this.sessionListener;
            com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier = this.initialResourceIdentifier;
            com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier = this.lastInteractionIdentifier;
            com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration = this.slowFramesConfiguration;
            com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy = this.composeActionTrackingStrategy;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalConfig;
            boolean z5 = this.trackAnonymousUser;
            com.datadog.android.rum.RumSessionType rumSessionType = this.rumSessionTypeOverride;
            boolean z6 = this.collectAccessibility;
            boolean z7 = this.disableJankStats;
            com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector = this.insightsCollector;
            com.datadog.android.rum.startup.AppStartupActivityPredicate appStartupActivityPredicate = this.appStartupActivityPredicate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(customEndpointUrl=");
            sb.append(str);
            sb.append(", sampleRate=");
            sb.append(f);
            sb.append(", telemetrySampleRate=");
            sb.append(f2);
            sb.append(", telemetryConfigurationSampleRate=");
            sb.append(f3);
            sb.append(", userActionTracking=");
            sb.append(z);
            sb.append(", touchTargetExtraAttributesProviders=");
            sb.append(list);
            sb.append(", interactionPredicate=");
            sb.append(interactionPredicate);
            sb.append(", viewTrackingStrategy=");
            sb.append(viewTrackingStrategy);
            sb.append(", longTaskTrackingStrategy=");
            sb.append(trackingStrategy);
            sb.append(", viewEventMapper=");
            sb.append(eventMapper);
            sb.append(", errorEventMapper=");
            sb.append(eventMapper2);
            sb.append(", resourceEventMapper=");
            sb.append(eventMapper3);
            sb.append(", actionEventMapper=");
            sb.append(eventMapper4);
            sb.append(", longTaskEventMapper=");
            sb.append(eventMapper5);
            sb.append(", vitalOperationStepEventMapper=");
            sb.append(eventMapper6);
            sb.append(", vitalAppLaunchEventMapper=");
            sb.append(eventMapper7);
            sb.append(", telemetryConfigurationMapper=");
            sb.append(eventMapper8);
            sb.append(", backgroundEventTracking=");
            sb.append(z2);
            sb.append(", trackFrustrations=");
            sb.append(z3);
            sb.append(", trackNonFatalAnrs=");
            sb.append(z4);
            sb.append(", vitalsMonitorUpdateFrequency=");
            sb.append(vitalsUpdateFrequency);
            sb.append(", sessionListener=");
            sb.append(rumSessionListener);
            sb.append(", initialResourceIdentifier=");
            sb.append(initialResourceIdentifier);
            sb.append(", lastInteractionIdentifier=");
            sb.append(lastInteractionIdentifier);
            sb.append(", slowFramesConfiguration=");
            sb.append(slowFramesConfiguration);
            sb.append(", composeActionTrackingStrategy=");
            sb.append(actionTrackingStrategy);
            sb.append(", additionalConfig=");
            sb.append(map);
            sb.append(", trackAnonymousUser=");
            sb.append(z5);
            sb.append(", rumSessionTypeOverride=");
            sb.append(rumSessionType);
            sb.append(", collectAccessibility=");
            sb.append(z6);
            sb.append(", disableJankStats=");
            sb.append(z7);
            sb.append(", insightsCollector=");
            sb.append(insightsCollector);
            sb.append(", appStartupActivityPredicate=");
            sb.append(appStartupActivityPredicate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.customEndpointUrl;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = java.lang.Float.hashCode(this.sampleRate);
            int hashCode3 = java.lang.Float.hashCode(this.telemetrySampleRate);
            int hashCode4 = java.lang.Float.hashCode(this.telemetryConfigurationSampleRate);
            int hashCode5 = java.lang.Boolean.hashCode(this.userActionTracking);
            int hashCode6 = this.touchTargetExtraAttributesProviders.hashCode();
            int hashCode7 = this.interactionPredicate.hashCode();
            com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            int hashCode8 = viewTrackingStrategy == null ? 0 : viewTrackingStrategy.hashCode();
            com.datadog.android.rum.tracking.TrackingStrategy trackingStrategy = this.longTaskTrackingStrategy;
            int hashCode9 = trackingStrategy == null ? 0 : trackingStrategy.hashCode();
            int hashCode10 = this.viewEventMapper.hashCode();
            int hashCode11 = this.errorEventMapper.hashCode();
            int hashCode12 = this.resourceEventMapper.hashCode();
            int hashCode13 = this.actionEventMapper.hashCode();
            int hashCode14 = this.longTaskEventMapper.hashCode();
            int hashCode15 = this.vitalOperationStepEventMapper.hashCode();
            int hashCode16 = this.vitalAppLaunchEventMapper.hashCode();
            int hashCode17 = this.telemetryConfigurationMapper.hashCode();
            int hashCode18 = java.lang.Boolean.hashCode(this.backgroundEventTracking);
            int hashCode19 = java.lang.Boolean.hashCode(this.trackFrustrations);
            int hashCode20 = java.lang.Boolean.hashCode(this.trackNonFatalAnrs);
            int hashCode21 = this.vitalsMonitorUpdateFrequency.hashCode();
            int hashCode22 = this.sessionListener.hashCode();
            int hashCode23 = this.initialResourceIdentifier.hashCode();
            com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier = this.lastInteractionIdentifier;
            int hashCode24 = lastInteractionIdentifier == null ? 0 : lastInteractionIdentifier.hashCode();
            com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration = this.slowFramesConfiguration;
            int hashCode25 = slowFramesConfiguration == null ? 0 : slowFramesConfiguration.hashCode();
            int hashCode26 = this.composeActionTrackingStrategy.hashCode();
            int hashCode27 = this.additionalConfig.hashCode();
            int hashCode28 = java.lang.Boolean.hashCode(this.trackAnonymousUser);
            com.datadog.android.rum.RumSessionType rumSessionType = this.rumSessionTypeOverride;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + (rumSessionType != null ? rumSessionType.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.collectAccessibility)) * 31) + java.lang.Boolean.hashCode(this.disableJankStats)) * 31) + this.insightsCollector.hashCode()) * 31) + this.appStartupActivityPredicate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.RumFeature.Configuration)) {
                return false;
            }
            com.datadog.android.rum.internal.RumFeature.Configuration configuration = (com.datadog.android.rum.internal.RumFeature.Configuration) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.customEndpointUrl, configuration.customEndpointUrl) && java.lang.Float.compare(this.sampleRate, configuration.sampleRate) == 0 && java.lang.Float.compare(this.telemetrySampleRate, configuration.telemetrySampleRate) == 0 && java.lang.Float.compare(this.telemetryConfigurationSampleRate, configuration.telemetryConfigurationSampleRate) == 0 && this.userActionTracking == configuration.userActionTracking && kotlin.jvm.internal.Intrinsics.areEqual(this.touchTargetExtraAttributesProviders, configuration.touchTargetExtraAttributesProviders) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionPredicate, configuration.interactionPredicate) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewTrackingStrategy, configuration.viewTrackingStrategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.longTaskTrackingStrategy, configuration.longTaskTrackingStrategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewEventMapper, configuration.viewEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorEventMapper, configuration.errorEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceEventMapper, configuration.resourceEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionEventMapper, configuration.actionEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.longTaskEventMapper, configuration.longTaskEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.vitalOperationStepEventMapper, configuration.vitalOperationStepEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.vitalAppLaunchEventMapper, configuration.vitalAppLaunchEventMapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.telemetryConfigurationMapper, configuration.telemetryConfigurationMapper) && this.backgroundEventTracking == configuration.backgroundEventTracking && this.trackFrustrations == configuration.trackFrustrations && this.trackNonFatalAnrs == configuration.trackNonFatalAnrs && this.vitalsMonitorUpdateFrequency == configuration.vitalsMonitorUpdateFrequency && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionListener, configuration.sessionListener) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialResourceIdentifier, configuration.initialResourceIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastInteractionIdentifier, configuration.lastInteractionIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.slowFramesConfiguration, configuration.slowFramesConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.composeActionTrackingStrategy, configuration.composeActionTrackingStrategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalConfig, configuration.additionalConfig) && this.trackAnonymousUser == configuration.trackAnonymousUser && this.rumSessionTypeOverride == configuration.rumSessionTypeOverride && this.collectAccessibility == configuration.collectAccessibility && this.disableJankStats == configuration.disableJankStats && kotlin.jvm.internal.Intrinsics.areEqual(this.insightsCollector, configuration.insightsCollector) && kotlin.jvm.internal.Intrinsics.areEqual(this.appStartupActivityPredicate, configuration.appStartupActivityPredicate);
        }

        public final com.datadog.android.rum.internal.RumFeature.Configuration copy(java.lang.String customEndpointUrl, float sampleRate, float telemetrySampleRate, float telemetryConfigurationSampleRate, boolean userActionTracking, java.util.List<? extends com.datadog.android.rum.tracking.ViewAttributesProvider> touchTargetExtraAttributesProviders, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy, com.datadog.android.rum.tracking.TrackingStrategy longTaskTrackingStrategy, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> viewEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> errorEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> resourceEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> actionEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> longTaskEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> vitalOperationStepEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> vitalAppLaunchEventMapper, com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> telemetryConfigurationMapper, boolean backgroundEventTracking, boolean trackFrustrations, boolean trackNonFatalAnrs, com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsMonitorUpdateFrequency, com.datadog.android.rum.RumSessionListener sessionListener, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration, com.datadog.android.rum.tracking.ActionTrackingStrategy composeActionTrackingStrategy, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalConfig, boolean trackAnonymousUser, com.datadog.android.rum.RumSessionType rumSessionTypeOverride, boolean collectAccessibility, boolean disableJankStats, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector, com.datadog.android.rum.startup.AppStartupActivityPredicate appStartupActivityPredicate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchTargetExtraAttributesProviders, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longTaskEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalOperationStepEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalAppLaunchEventMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryConfigurationMapper, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalsMonitorUpdateFrequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionListener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composeActionTrackingStrategy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStartupActivityPredicate, "");
            return new com.datadog.android.rum.internal.RumFeature.Configuration(customEndpointUrl, sampleRate, telemetrySampleRate, telemetryConfigurationSampleRate, userActionTracking, touchTargetExtraAttributesProviders, interactionPredicate, viewTrackingStrategy, longTaskTrackingStrategy, viewEventMapper, errorEventMapper, resourceEventMapper, actionEventMapper, longTaskEventMapper, vitalOperationStepEventMapper, vitalAppLaunchEventMapper, telemetryConfigurationMapper, backgroundEventTracking, trackFrustrations, trackNonFatalAnrs, vitalsMonitorUpdateFrequency, sessionListener, initialResourceIdentifier, lastInteractionIdentifier, slowFramesConfiguration, composeActionTrackingStrategy, additionalConfig, trackAnonymousUser, rumSessionTypeOverride, collectAccessibility, disableJankStats, insightsCollector, appStartupActivityPredicate);
        }

        /* renamed from: component9, reason: from getter */
        public final com.datadog.android.rum.tracking.TrackingStrategy getLongTaskTrackingStrategy() {
            return this.longTaskTrackingStrategy;
        }

        /* renamed from: component8, reason: from getter */
        public final com.datadog.android.rum.tracking.ViewTrackingStrategy getViewTrackingStrategy() {
            return this.viewTrackingStrategy;
        }

        /* renamed from: component7, reason: from getter */
        public final com.datadog.android.rum.tracking.InteractionPredicate getInteractionPredicate() {
            return this.interactionPredicate;
        }

        public final java.util.List<com.datadog.android.rum.tracking.ViewAttributesProvider> component6() {
            return this.touchTargetExtraAttributesProviders;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUserActionTracking() {
            return this.userActionTracking;
        }

        /* renamed from: component4, reason: from getter */
        public final float getTelemetryConfigurationSampleRate() {
            return this.telemetryConfigurationSampleRate;
        }

        /* renamed from: component33, reason: from getter */
        public final com.datadog.android.rum.startup.AppStartupActivityPredicate getAppStartupActivityPredicate() {
            return this.appStartupActivityPredicate;
        }

        /* renamed from: component32, reason: from getter */
        public final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInsightsCollector() {
            return this.insightsCollector;
        }

        /* renamed from: component31, reason: from getter */
        public final boolean getDisableJankStats() {
            return this.disableJankStats;
        }

        /* renamed from: component30, reason: from getter */
        public final boolean getCollectAccessibility() {
            return this.collectAccessibility;
        }

        /* renamed from: component3, reason: from getter */
        public final float getTelemetrySampleRate() {
            return this.telemetrySampleRate;
        }

        /* renamed from: component29, reason: from getter */
        public final com.datadog.android.rum.RumSessionType getRumSessionTypeOverride() {
            return this.rumSessionTypeOverride;
        }

        /* renamed from: component28, reason: from getter */
        public final boolean getTrackAnonymousUser() {
            return this.trackAnonymousUser;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component27() {
            return this.additionalConfig;
        }

        /* renamed from: component26, reason: from getter */
        public final com.datadog.android.rum.tracking.ActionTrackingStrategy getComposeActionTrackingStrategy() {
            return this.composeActionTrackingStrategy;
        }

        /* renamed from: component25, reason: from getter */
        public final com.datadog.android.rum.configuration.SlowFramesConfiguration getSlowFramesConfiguration() {
            return this.slowFramesConfiguration;
        }

        /* renamed from: component24, reason: from getter */
        public final com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier getLastInteractionIdentifier() {
            return this.lastInteractionIdentifier;
        }

        /* renamed from: component23, reason: from getter */
        public final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier getInitialResourceIdentifier() {
            return this.initialResourceIdentifier;
        }

        /* renamed from: component22, reason: from getter */
        public final com.datadog.android.rum.RumSessionListener getSessionListener() {
            return this.sessionListener;
        }

        /* renamed from: component21, reason: from getter */
        public final com.datadog.android.rum.configuration.VitalsUpdateFrequency getVitalsMonitorUpdateFrequency() {
            return this.vitalsMonitorUpdateFrequency;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getTrackNonFatalAnrs() {
            return this.trackNonFatalAnrs;
        }

        /* renamed from: component2, reason: from getter */
        public final float getSampleRate() {
            return this.sampleRate;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getTrackFrustrations() {
            return this.trackFrustrations;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getBackgroundEventTracking() {
            return this.backgroundEventTracking;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.telemetry.model.TelemetryConfigurationEvent> component17() {
            return this.telemetryConfigurationMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalAppLaunchEvent> component16() {
            return this.vitalAppLaunchEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.VitalOperationStepEvent> component15() {
            return this.vitalOperationStepEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.LongTaskEvent> component14() {
            return this.longTaskEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ActionEvent> component13() {
            return this.actionEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ResourceEvent> component12() {
            return this.resourceEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ErrorEvent> component11() {
            return this.errorEventMapper;
        }

        public final com.datadog.android.event.EventMapper<com.datadog.android.rum.model.ViewEvent> component10() {
            return this.viewEventMapper;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCustomEndpointUrl() {
            return this.customEndpointUrl;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u0014\u0010%\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u0014\u0010&\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0014\u0010'\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0014\u0010(\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b,\u0010\u000eR\u0014\u0010-\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b-\u0010\u000eR\u0014\u0010.\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b.\u0010\u000eR\u0014\u0010/\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b/\u0010\u000eR\u0014\u00100\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b0\u0010\u000eR\u0014\u00101\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b1\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/RumFeature$Companion;", "", "<init>", "()V", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "", "isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release", "(Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)Z", "", "ALL_IN_SAMPLE_RATE", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "", "DD_TELEMETRY_CONFIG_SAMPLE_RATE_TAG", "Ljava/lang/String;", "", "DEFAULT_LONG_TASK_THRESHOLD_MS", "J", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "DEFAULT_RUM_CONFIG", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "getDEFAULT_RUM_CONFIG$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "DEFAULT_SAMPLE_RATE", "DEFAULT_TELEMETRY_CONFIGURATION_SAMPLE_RATE", "DEFAULT_TELEMETRY_SAMPLE_RATE", "DEVELOPER_MODE_SAMPLE_RATE_CHANGED_MESSAGE", "EVENT_ATTRIBUTES_PROPERTY", "EVENT_MESSAGE_PROPERTY", "EVENT_STACKTRACE_PROPERTY", "EVENT_THROWABLE_PROPERTY", "FAILED_TO_ENABLE_JANK_STATS_TRACKING_MANUALLY", "FAILED_TO_GET_HISTORICAL_EXIT_REASONS", "FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE", "LOGGER_ERROR_BUS_MESSAGE_TYPE", "LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE", "LOG_ERROR_EVENT_MISSING_MANDATORY_FIELDS", "LOG_ERROR_WITH_STACKTRACE_EVENT_MISSING_MANDATORY_FIELDS", "NDK_CRASH_BUS_MESSAGE_TYPE", "NO_LAST_RUM_VIEW_EVENT_AVAILABLE", "RUM_FEATURE_NOT_YET_INITIALIZED", "RUM_TTL_24H", "getRUM_TTL_24H$dd_sdk_android_rum_release", "()J", "SLOW_FRAMES_MONITORING_DISABLED_MESSAGE", "SLOW_FRAMES_MONITORING_ENABLED_MESSAGE", "TELEMETRY_SESSION_REPLAY_SKIP_FRAME", "UNKNOWN_EVENT_TYPE_PROPERTY_VALUE", "UNSUPPORTED_EVENT_TYPE", "WEB_VIEW_INGESTED_NOTIFICATION_MESSAGE_TYPE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getRUM_TTL_24H$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.RumFeature.RUM_TTL_24H;
        }

        public final com.datadog.android.rum.internal.RumFeature.Configuration getDEFAULT_RUM_CONFIG$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.RumFeature.DEFAULT_RUM_CONFIG;
        }

        public static /* synthetic */ boolean isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release$default(com.datadog.android.rum.internal.RumFeature.Companion companion, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                buildSdkVersionProvider = com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT();
            }
            return companion.isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release(buildSdkVersionProvider);
        }

        public final boolean isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
            return !buildSdkVersionProvider.getIsAtLeastR();
        }

        public static final /* synthetic */ com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy access$provideUserTrackingStrategy(com.datadog.android.rum.internal.RumFeature.Companion companion, com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, com.datadog.android.api.InternalLogger internalLogger) {
            com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker datadogGesturesTracker = new com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker((com.datadog.android.rum.tracking.ViewAttributesProvider[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) viewAttributesProviderArr, (java.lang.Object[]) new com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider[]{new com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider()}), interactionPredicate, actionTrackingStrategy, internalLogger);
            if (buildSdkVersionProvider.getIsAtLeastQ()) {
                return new com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29(datadogGesturesTracker);
            }
            return new com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy(datadogGesturesTracker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.datadog.android.rum.internal.RumFeature.Companion companion = new com.datadog.android.rum.internal.RumFeature.Companion(null);
        INSTANCE = companion;
        RUM_TTL_24H = java.util.concurrent.TimeUnit.HOURS.toMillis(24L);
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate noOpInteractionPredicate = new com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate();
        com.datadog.android.rum.tracking.ActivityViewTrackingStrategy activityViewTrackingStrategy = new com.datadog.android.rum.tracking.ActivityViewTrackingStrategy(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy mainLooperLongTaskStrategy = new com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy(100L);
        com.datadog.android.event.NoOpEventMapper noOpEventMapper = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper2 = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper3 = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper4 = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper5 = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper6 = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper7 = new com.datadog.android.event.NoOpEventMapper();
        com.datadog.android.event.NoOpEventMapper noOpEventMapper8 = new com.datadog.android.event.NoOpEventMapper();
        boolean isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release$default = com.datadog.android.rum.internal.RumFeature.Companion.isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release$default(companion, null, 1, null);
        com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsUpdateFrequency = com.datadog.android.rum.configuration.VitalsUpdateFrequency.AVERAGE;
        com.datadog.android.rum.internal.NoOpRumSessionListener noOpRumSessionListener = new com.datadog.android.rum.internal.NoOpRumSessionListener();
        com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier timeBasedInitialResourceIdentifier = new com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier(0L, 1, null);
        com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier timeBasedInteractionIdentifier = new com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier(0L, 1, null);
        com.datadog.android.rum.tracking.NoOpActionTrackingStrategy noOpActionTrackingStrategy = new com.datadog.android.rum.tracking.NoOpActionTrackingStrategy();
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        DEFAULT_RUM_CONFIG = new com.datadog.android.rum.internal.RumFeature.Configuration(null, 100.0f, 20.0f, 20.0f, true, emptyList, noOpInteractionPredicate, activityViewTrackingStrategy, mainLooperLongTaskStrategy, noOpEventMapper, noOpEventMapper2, noOpEventMapper3, noOpEventMapper4, noOpEventMapper5, noOpEventMapper6, noOpEventMapper7, noOpEventMapper8, false, true, isTrackNonFatalAnrsEnabledByDefault$dd_sdk_android_rum_release$default, vitalsUpdateFrequency, noOpRumSessionListener, timeBasedInitialResourceIdentifier, timeBasedInteractionIdentifier, com.datadog.android.rum.configuration.SlowFramesConfiguration.INSTANCE.getDEFAULT(), noOpActionTrackingStrategy, emptyMap, true, null, false, false, new com.datadog.android.rum.internal.instrumentation.insights.NoOpInsightsCollector(), com.datadog.android.rum.internal.startup.DefaultAppStartupActivityPredicate.INSTANCE);
    }

    /* renamed from: $r8$lambda$5X-EDb7T-KdvV6dd2uVO7mrCXU0, reason: not valid java name */
    public static /* synthetic */ void m10019$r8$lambda$5XEDb7TKdvV6dd2uVO7mrCXU0(com.datadog.android.rum.internal.RumFeature rumFeature, android.app.ApplicationExitInfo applicationExitInfo) {
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = rumFeature.getOutputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNull(featureSdkCore, "");
        com.google.gson.JsonObject lastViewEvent = ((com.datadog.android.core.InternalSdkCore) featureSdkCore).getLastViewEvent();
        if (lastViewEvent != null) {
            ((com.datadog.android.rum.internal.LateCrashReporter) rumFeature.getHighSpeedVideoFpsRangesFor.getValue()).handleAnrCrash(applicationExitInfo, lastViewEvent, rumFeature.dataWriter);
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(rumFeature.getOutputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.RumFeature$consumeLastFatalAnr$1$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.RumFeature.NO_LAST_RUM_VIEW_EVENT_AVAILABLE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }
}

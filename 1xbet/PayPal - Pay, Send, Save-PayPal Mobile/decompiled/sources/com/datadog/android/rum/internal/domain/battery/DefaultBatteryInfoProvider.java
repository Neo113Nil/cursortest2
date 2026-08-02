package com.datadog.android.rum.internal.domain.battery;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*"}, d2 = {"Lcom/datadog/android/rum/internal/domain/battery/DefaultBatteryInfoProvider;", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "Landroid/content/Context;", "applicationContext", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Landroid/os/PowerManager;", "powerManager", "Landroid/os/BatteryManager;", "batteryManager", "", "batteryLevelPollInterval", "<init>", "(Landroid/content/Context;Lcom/datadog/android/internal/time/TimeProvider;Landroid/os/PowerManager;Landroid/os/BatteryManager;I)V", "", "cleanup", "()V", "getState", "()Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRanges", "Ljava/lang/Float;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Landroid/os/BatteryManager;", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "", "getInputSizeshNQ4ISI", "Ljava/lang/Boolean;", "getOutputFormats", "getInputFormats", "Landroid/os/PowerManager;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/internal/domain/battery/DefaultBatteryInfoProvider$powerSaveModeReceiver$1;", "Lcom/datadog/android/rum/internal/domain/battery/DefaultBatteryInfoProvider$powerSaveModeReceiver$1;", "getOutputMinFrameDuration", "Lcom/datadog/android/internal/time/TimeProvider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultBatteryInfoProvider implements com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> {

    @java.lang.Deprecated
    public static final int BATTERY_POLL_INTERVAL_MS = 60000;
    private static final com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider.Companion Companion = new com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider.Companion(null);

    @java.lang.Deprecated
    public static final float FULL_BATTERY_PCT = 100.0f;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.lang.Float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final android.os.BatteryManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider$powerSaveModeReceiver$1 getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final android.os.PowerManager getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile java.lang.Boolean getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getInputSizeshNQ4ISI;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider$powerSaveModeReceiver$1] */
    public DefaultBatteryInfoProvider(android.content.Context context, com.datadog.android.internal.time.TimeProvider timeProvider, android.os.PowerManager powerManager, android.os.BatteryManager batteryManager, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.Camera2StreamConfigurationMap = context;
        this.getInputSizeshNQ4ISI = timeProvider;
        this.getHighSpeedVideoSizesFor = powerManager;
        this.getHighSpeedVideoSizes = batteryManager;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
        ?? r3 = new android.content.BroadcastReceiver() { // from class: com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider$powerSaveModeReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(android.content.Context context2, android.content.Intent intent) {
                android.os.PowerManager powerManager2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                powerManager2 = com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider.this.getHighSpeedVideoSizesFor;
                java.lang.Boolean valueOf = powerManager2 != null ? java.lang.Boolean.valueOf(powerManager2.isPowerSaveMode()) : null;
                if (valueOf != null) {
                    com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider.this.getOutputFormats = java.lang.Boolean.valueOf(valueOf.booleanValue());
                }
            }
        };
        this.getOutputMinFrameDuration = r3;
        context.registerReceiver((android.content.BroadcastReceiver) r3, new android.content.IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultBatteryInfoProvider(android.content.Context context, com.datadog.android.internal.time.TimeProvider timeProvider, android.os.PowerManager powerManager, android.os.BatteryManager batteryManager, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, timeProvider, r4, r5, (i2 & 16) != 0 ? 60000 : i);
        android.os.PowerManager powerManager2;
        android.os.BatteryManager batteryManager2;
        if ((i2 & 4) != 0) {
            java.lang.Object systemService = context.getSystemService("power");
            if (!(systemService instanceof android.os.PowerManager)) {
                powerManager2 = null;
                if ((i2 & 8) != 0) {
                    java.lang.Object systemService2 = context.getSystemService("batterymanager");
                    if (!(systemService2 instanceof android.os.BatteryManager)) {
                        batteryManager2 = null;
                    }
                    batteryManager = (android.os.BatteryManager) systemService2;
                }
                batteryManager2 = batteryManager;
            }
            powerManager = (android.os.PowerManager) systemService;
        }
        powerManager2 = powerManager;
        if ((i2 & 8) != 0) {
        }
        batteryManager2 = batteryManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x0020, B:9:0x002d, B:13:0x0045, B:15:0x0051, B:19:0x005d, B:21:0x0061, B:23:0x0065, B:24:0x006d, B:25:0x006f), top: B:2:0x0001 }] */
    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.datadog.android.rum.internal.domain.battery.BatteryInfo getState() {
        com.datadog.android.rum.internal.domain.battery.BatteryInfo batteryInfo;
        java.lang.Float f;
        synchronized (this) {
            long deviceElapsedRealtimeMillis = this.getInputSizeshNQ4ISI.getDeviceElapsedRealtimeMillis();
            if (deviceElapsedRealtimeMillis - this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoFpsRanges.get()) {
                this.getHighSpeedVideoFpsRanges.set(deviceElapsedRealtimeMillis);
                android.os.BatteryManager batteryManager = this.getHighSpeedVideoSizes;
                java.lang.Integer valueOf = batteryManager != null ? java.lang.Integer.valueOf(batteryManager.getIntProperty(4)) : null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (intValue != (this.Camera2StreamConfigurationMap.getApplicationInfo().targetSdkVersion >= 28 ? Integer.MIN_VALUE : 0)) {
                        f = java.lang.Float.valueOf(intValue / 100.0f);
                        if (f != null) {
                            this.getHighSpeedVideoFpsRangesFor = java.lang.Float.valueOf(f.floatValue());
                        }
                    }
                }
                f = null;
                if (f != null) {
                }
            }
            if (this.getOutputFormats == null) {
                android.os.PowerManager powerManager = this.getHighSpeedVideoSizesFor;
                this.getOutputFormats = powerManager != null ? java.lang.Boolean.valueOf(powerManager.isPowerSaveMode()) : null;
            }
            batteryInfo = new com.datadog.android.rum.internal.domain.battery.BatteryInfo(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats);
        }
        return batteryInfo;
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final void cleanup() {
        try {
            this.Camera2StreamConfigurationMap.unregisterReceiver(this.getOutputMinFrameDuration);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/battery/DefaultBatteryInfoProvider$Companion;", "", "<init>", "()V", "", "BATTERY_POLL_INTERVAL_MS", com.visa.cbp.getEncExpo.warmup, "", "FULL_BATTERY_PCT", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

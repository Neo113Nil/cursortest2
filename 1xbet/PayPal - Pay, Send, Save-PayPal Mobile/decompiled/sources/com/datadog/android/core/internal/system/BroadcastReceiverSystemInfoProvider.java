package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/core/internal/system/BroadcastReceiverSystemInfoProvider;", "Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/core/internal/system/SystemInfo;", "getLatestSystemInfo", "()Lcom/datadog/android/core/internal/system/SystemInfo;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "register", "(Landroid/content/Context;)V", "unregister", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/internal/system/SystemInfo;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BroadcastReceiverSystemInfoProvider extends com.datadog.android.core.internal.receiver.ThreadSafeReceiver implements com.datadog.android.core.internal.system.SystemInfoProvider {
    private static final java.util.Set<com.datadog.android.core.internal.system.SystemInfo.BatteryStatus> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.datadog.android.core.internal.system.SystemInfo.BatteryStatus[]{com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.CHARGING, com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.FULL});
    private static final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{1, 4, 2});

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;
    private com.datadog.android.core.internal.system.SystemInfo getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverSystemInfoProvider(com.datadog.android.api.InternalLogger internalLogger) {
        super(null, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = internalLogger;
        this.getHighSpeedVideoSizes = new com.datadog.android.core.internal.system.SystemInfo(false, 0, false, false, 15, null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        final java.lang.String action;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (java.lang.RuntimeException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider$onReceive$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Error handling system info broadcast intent.";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                return;
            }
        } else {
            action = null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(action, "android.intent.action.BATTERY_CHANGED")) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.DEBUG, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider$onReceive$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String str = action;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received unknown broadcast intent: [");
                        sb.append(str);
                        sb.append("]");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return;
            }
            java.lang.Object systemService = context.getSystemService("power");
            android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
            this.getHighSpeedVideoSizes = com.datadog.android.core.internal.system.SystemInfo.copy$default(this.getHighSpeedVideoSizes, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11, null);
            return;
        }
        int intExtra = intent.getIntExtra("status", 1);
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", 100);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        com.datadog.android.core.internal.system.SystemInfo.BatteryStatus fromAndroidStatus = com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.INSTANCE.fromAndroidStatus(intExtra);
        boolean booleanExtra = intent.getBooleanExtra("present", true);
        int roundToInt = kotlin.math.MathKt.roundToInt((intExtra2 * 100.0f) / intExtra3);
        if (!getHighSpeedVideoFpsRanges.contains(java.lang.Integer.valueOf(intExtra4)) && booleanExtra) {
            z = false;
            this.getHighSpeedVideoSizes = com.datadog.android.core.internal.system.SystemInfo.copy$default(this.getHighSpeedVideoSizes, getHighResolutionOutputSizeshNQ4ISI.contains(fromAndroidStatus), roundToInt, false, z, 4, null);
        }
        z = true;
        this.getHighSpeedVideoSizes = com.datadog.android.core.internal.system.SystemInfo.copy$default(this.getHighSpeedVideoSizes, getHighResolutionOutputSizeshNQ4ISI.contains(fromAndroidStatus), roundToInt, false, z, 4, null);
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public final void unregister(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        unregisterReceiver(context);
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    /* renamed from: getLatestSystemInfo, reason: from getter */
    public final com.datadog.android.core.internal.system.SystemInfo getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public final void register(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        android.content.Intent registerReceiver = registerReceiver(context, intentFilter);
        if (registerReceiver != null) {
            onReceive(context, registerReceiver);
        }
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        android.content.Intent registerReceiver2 = registerReceiver(context, intentFilter2);
        if (registerReceiver2 != null) {
            onReceive(context, registerReceiver2);
        }
    }
}

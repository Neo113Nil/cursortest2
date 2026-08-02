package com.datadog.android.core.internal.net.info;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/core/internal/net/info/BroadcastReceiverNetworkInfoProvider;", "Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Lcom/datadog/android/api/context/NetworkInfo;", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "register", "(Landroid/content/Context;)V", "unregister", "getOutputMinFrameDuration", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighSpeedVideoSizes", "getInputFormats", "Lcom/datadog/android/api/context/NetworkInfo;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BroadcastReceiverNetworkInfoProvider extends com.datadog.android.core.internal.receiver.ThreadSafeReceiver implements com.datadog.android.core.internal.net.info.NetworkInfoProvider {
    public static final int NETWORK_TYPE_LTE_CA = 19;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.datadog.android.api.context.NetworkInfo Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoSizes;
    private static final java.util.Set<java.lang.Integer> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{0, 4, 5, 2, 3});
    private static final java.util.Set<java.lang.Integer> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{1, 2, 4, 7, 11, 16});
    private static final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{3, 5, 6, 8, 9, 10, 12, 14, 15, 17});
    private static final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{13, 18, 19});
    private static final java.util.Set<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf(20);

    public /* synthetic */ BroadcastReceiverNetworkInfoProvider(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverNetworkInfoProvider(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        super(null, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoSizes = buildSdkVersionProvider;
        this.Camera2StreamConfigurationMap = new com.datadog.android.api.context.NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.datadog.android.api.context.NetworkInfo networkInfo;
        com.datadog.android.api.context.NetworkInfo.Connectivity connectivity;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            networkInfo = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, 126, null);
        } else if (activeNetworkInfo.getType() == 1) {
            networkInfo = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_WIFI, null, null, null, null, null, null, 126, null);
        } else if (activeNetworkInfo.getType() == 9) {
            networkInfo = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_ETHERNET, null, null, null, null, null, null, 126, null);
        } else if (getHighSpeedVideoSizes.contains(java.lang.Integer.valueOf(activeNetworkInfo.getType()))) {
            int subtype = activeNetworkInfo.getSubtype();
            if (Camera2StreamConfigurationMap.contains(java.lang.Integer.valueOf(subtype))) {
                connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_2G;
            } else if (getHighSpeedVideoFpsRanges.contains(java.lang.Integer.valueOf(subtype))) {
                connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_3G;
            } else if (getHighSpeedVideoFpsRangesFor.contains(java.lang.Integer.valueOf(subtype))) {
                connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_4G;
            } else {
                connectivity = getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Integer.valueOf(subtype)) ? com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_5G : com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_MOBILE_OTHER;
            }
            com.datadog.android.api.context.NetworkInfo.Connectivity connectivity2 = connectivity;
            switch (subtype) {
                case 1:
                    str = "GPRS";
                    str2 = str;
                    break;
                case 2:
                    str = "Edge";
                    str2 = str;
                    break;
                case 3:
                    str = "UMTS";
                    str2 = str;
                    break;
                case 4:
                    str = "CDMA";
                    str2 = str;
                    break;
                case 5:
                    str = "CDMAEVDORev0";
                    str2 = str;
                    break;
                case 6:
                    str = "CDMAEVDORevA";
                    str2 = str;
                    break;
                case 7:
                    str = "CDMA1x";
                    str2 = str;
                    break;
                case 8:
                    str = "HSDPA";
                    str2 = str;
                    break;
                case 9:
                    str = "HSUPA";
                    str2 = str;
                    break;
                case 10:
                    str = "HSPA";
                    str2 = str;
                    break;
                case 11:
                    str = "iDen";
                    str2 = str;
                    break;
                case 12:
                    str = "CDMAEVDORevB";
                    str2 = str;
                    break;
                case 13:
                    str = "LTE";
                    str2 = str;
                    break;
                case 14:
                    str = "eHRPD";
                    str2 = str;
                    break;
                case 15:
                    str = "HSPA+";
                    str2 = str;
                    break;
                case 16:
                    str = "GSM";
                    str2 = str;
                    break;
                case 17:
                    str = "TD_SCDMA";
                    str2 = str;
                    break;
                case 18:
                    str = "IWLAN";
                    str2 = str;
                    break;
                case 19:
                    str = "LTE_CA";
                    str2 = str;
                    break;
                case 20:
                    str = "New Radio";
                    str2 = str;
                    break;
                default:
                    str2 = null;
                    break;
            }
            if (this.getHighSpeedVideoSizes.getIsAtLeastP()) {
                java.lang.Object systemService2 = context.getSystemService("phone");
                android.telephony.TelephonyManager telephonyManager = systemService2 instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService2 : null;
                if (telephonyManager == null || (str3 = telephonyManager.getSimCarrierIdName()) == null) {
                }
                networkInfo = new com.datadog.android.api.context.NetworkInfo(connectivity2, str3.toString(), telephonyManager != null ? java.lang.Long.valueOf(telephonyManager.getSimCarrierId()) : null, null, null, null, str2, 56, null);
            } else {
                networkInfo = new com.datadog.android.api.context.NetworkInfo(connectivity2, null, null, null, null, null, str2, 62, null);
            }
        } else {
            networkInfo = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
        }
        this.Camera2StreamConfigurationMap = networkInfo;
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void register(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        onReceive(context, registerReceiver(context, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")));
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void unregister(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        unregisterReceiver(context);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    /* renamed from: getLatestNetworkInfo, reason: from getter */
    public final com.datadog.android.api.context.NetworkInfo getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastReceiverNetworkInfoProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

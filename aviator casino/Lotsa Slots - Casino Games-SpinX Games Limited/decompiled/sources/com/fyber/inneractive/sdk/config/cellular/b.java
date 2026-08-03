package com.fyber.inneractive.sdk.config.cellular;

/* loaded from: classes3.dex */
public final class b extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f3589a = java.util.concurrent.Executors.newSingleThreadExecutor();
    public com.fyber.inneractive.sdk.config.cellular.h b;
    public final android.telephony.TelephonyManager c;

    public b(android.telephony.TelephonyManager telephonyManager, com.fyber.inneractive.sdk.config.cellular.h hVar) {
        this.c = telephonyManager;
        this.b = hVar;
    }

    public final void a() {
        this.b = null;
        android.telephony.TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f3589a.shutdownNow();
    }

    public final void b() {
        android.telephony.TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f3589a, this);
        }
    }

    public final void c() {
        android.telephony.TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        com.fyber.inneractive.sdk.util.a1 a1Var;
        int networkType = telephonyDisplayInfo.getNetworkType();
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType == 2 || overrideNetworkType == 3 || overrideNetworkType == 5) {
            a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_5G;
        } else if (networkType != 0) {
            if (networkType != 3) {
                if (networkType == 18) {
                    a1Var = com.fyber.inneractive.sdk.util.a1.WIFI;
                } else if (networkType == 20) {
                    a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_5G;
                } else if (networkType != 5 && networkType != 6) {
                    switch (networkType) {
                        default:
                            switch (networkType) {
                                case 12:
                                case 14:
                                case 15:
                                    break;
                                case 13:
                                    a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_4G;
                                    break;
                                default:
                                    a1Var = com.fyber.inneractive.sdk.util.a1.CELLULAR;
                                    break;
                            }
                        case 8:
                        case 9:
                        case 10:
                            a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_3G;
                            break;
                    }
                }
            }
            a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_3G;
        } else {
            a1Var = com.fyber.inneractive.sdk.util.a1.UNKNOWN;
        }
        com.fyber.inneractive.sdk.config.cellular.h hVar = this.b;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }
}

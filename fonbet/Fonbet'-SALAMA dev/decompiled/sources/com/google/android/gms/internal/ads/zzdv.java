package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
final class zzdv extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzeb zza;

    public zzdv(zzeb zzebVar) {
        this.zza = zzebVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.zza.zzh(true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}

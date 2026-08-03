package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzek extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
    private final com.google.android.gms.internal.ads.zzer zza;

    public zzek(com.google.android.gms.internal.ads.zzer zzerVar) {
        this.zza = zzerVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.zza.zze(true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}

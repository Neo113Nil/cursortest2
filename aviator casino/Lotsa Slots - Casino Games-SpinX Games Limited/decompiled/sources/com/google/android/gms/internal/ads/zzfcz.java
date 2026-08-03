package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfcz implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.content.Context zzb;

    public zzfcz(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zza = zzhcgVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfcy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfcz.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 39;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfcx zzc() {
        int i;
        boolean z;
        int i2;
        android.content.Context context = this.zzb;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        java.lang.String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i3 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new com.google.android.gms.internal.ads.zzfcx(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzf().zzm(context), phoneType, z, i2);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzffc implements java.util.concurrent.Callable {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzffc zza = new com.google.android.gms.internal.ads.zzffc();

    private /* synthetic */ zzffc() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzax);
        if (str != null && !str.isEmpty()) {
            if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzay)).intValue()) {
                for (java.lang.String str2 : str.split(",", -1)) {
                    hashMap.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                }
            }
        }
        return new com.google.android.gms.internal.ads.zzffe(hashMap);
    }
}

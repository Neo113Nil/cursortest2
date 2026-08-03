package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztv {
    public static final com.google.android.gms.internal.ads.zzgww zza;

    static {
        zza = android.os.Build.VERSION.SDK_INT < 32 ? com.google.android.gms.internal.ads.zzgww.zzl(12, 252, 6396, 4) : com.google.android.gms.internal.ads.zzgww.zzn(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    public static int zza(com.google.android.gms.internal.ads.zzqh zzqhVar) {
        int zzb = zzb(zzqhVar.zze());
        if (zzb != 0) {
            return zzb;
        }
        int zzb2 = zzb(zzqhVar.zzd());
        if (zzb2 != 0) {
            return zzb2;
        }
        return 12;
    }

    private static int zzb(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int intValue = num.intValue();
            if (zza.contains(num)) {
                return intValue;
            }
        }
        return 0;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhpv implements com.google.android.gms.internal.ads.zzheg {
    private zzhpv(com.google.android.gms.internal.ads.zzheg zzhegVar, com.google.android.gms.internal.ads.zzhtm zzhtmVar, byte[] bArr) {
    }

    public static com.google.android.gms.internal.ads.zzheg zza(com.google.android.gms.internal.ads.zzhlz zzhlzVar) throws java.security.GeneralSecurityException {
        byte[] zzc;
        com.google.android.gms.internal.ads.zzhnm zzc2 = zzhlzVar.zzc(com.google.android.gms.internal.ads.zzhdo.zza());
        com.google.android.gms.internal.ads.zzheg zzhegVar = (com.google.android.gms.internal.ads.zzheg) com.google.android.gms.internal.ads.zzhlo.zza().zzc(zzc2.zzg(), com.google.android.gms.internal.ads.zzheg.class).zza(zzc2.zzb());
        com.google.android.gms.internal.ads.zzhtm zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = com.google.android.gms.internal.ads.zzhms.zza.zzc();
                } else if (ordinal != 4) {
                    throw new java.security.GeneralSecurityException("unknown output prefix type");
                }
            }
            zzc = com.google.android.gms.internal.ads.zzhms.zza(zzhlzVar.zzb().intValue()).zzc();
        } else {
            zzc = com.google.android.gms.internal.ads.zzhms.zzb(zzhlzVar.zzb().intValue()).zzc();
        }
        return new com.google.android.gms.internal.ads.zzhpv(zzhegVar, zzd, zzc);
    }
}

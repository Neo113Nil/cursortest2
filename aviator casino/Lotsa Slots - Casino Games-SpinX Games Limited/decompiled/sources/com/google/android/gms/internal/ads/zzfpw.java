package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public interface zzfpw {

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    /* renamed from: com.google.android.gms.internal.ads.zzfpw$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static com.google.android.gms.internal.ads.zzfpw zzn(android.content.Context context, int i) {
            boolean booleanValue;
            if (com.google.android.gms.internal.ads.zzfqj.zza()) {
                int i2 = i - 2;
                if (i2 == 20 || i2 == 21) {
                    booleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue();
                } else if (i2 != 110) {
                    switch (i2) {
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                            booleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue();
                            break;
                        case 4:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            booleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue();
                            break;
                        case 5:
                            booleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzb.zze()).booleanValue();
                            break;
                    }
                } else {
                    booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkk)).booleanValue();
                }
                if (booleanValue) {
                    return new com.google.android.gms.internal.ads.zzfpy(context, i);
                }
            }
            return new com.google.android.gms.internal.ads.zzfqz();
        }

        public static com.google.android.gms.internal.ads.zzfpw zzo(android.content.Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
            com.google.android.gms.internal.ads.zzfpw zzn = zzn(context, i);
            if (zzn instanceof com.google.android.gms.internal.ads.zzfpy) {
                zzn.zza();
                zzn.zzp(i2);
                zzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
                java.lang.String str = zzmVar.zzp;
                if (com.google.android.gms.internal.ads.zzfqf.zza(str)) {
                    zzn.zze(str);
                }
            }
            return zzn;
        }
    }

    com.google.android.gms.internal.ads.zzfpw zza();

    boolean zzb();

    com.google.android.gms.internal.ads.zzfpw zzc();

    com.google.android.gms.internal.ads.zzfpw zzd(boolean z);

    com.google.android.gms.internal.ads.zzfpw zze(java.lang.String str);

    com.google.android.gms.internal.ads.zzfpw zzf(com.google.android.gms.internal.ads.zzfql zzfqlVar);

    com.google.android.gms.internal.ads.zzfpw zzg(com.google.android.gms.internal.ads.zzfkp zzfkpVar);

    com.google.android.gms.internal.ads.zzfpw zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    com.google.android.gms.internal.ads.zzfpw zzi(java.lang.String str);

    com.google.android.gms.internal.ads.zzfpw zzj(java.lang.Throwable th);

    com.google.android.gms.internal.ads.zzfpw zzk(java.lang.String str);

    boolean zzl();

    com.google.android.gms.internal.ads.zzfpz zzm();

    com.google.android.gms.internal.ads.zzfpw zzp(int i);
}

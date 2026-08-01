package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzfqw {
    static zzfqw zzn(Context context, int i) {
        boolean booleanValue;
        if (zzfrj.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                booleanValue = ((Boolean) zzbla.zze.zze()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbla.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbla.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbla.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkq)).booleanValue();
            }
            if (booleanValue) {
                return new zzfqy(context, i);
            }
        }
        return new zzfrz();
    }

    static zzfqw zzo(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfqw zzn = zzn(context, i);
        if (zzn instanceof zzfqy) {
            zzn.zza();
            zzn.zzp(i2);
            zzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfrf.zza(str)) {
                zzn.zze(str);
            }
        }
        return zzn;
    }

    zzfqw zza();

    boolean zzb();

    zzfqw zzc();

    zzfqw zzd(boolean z);

    zzfqw zze(String str);

    zzfqw zzf(zzfrl zzfrlVar);

    zzfqw zzg(zzfln zzflnVar);

    zzfqw zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfqw zzi(String str);

    zzfqw zzj(Throwable th);

    zzfqw zzk(String str);

    boolean zzl();

    zzfqz zzm();

    zzfqw zzp(int i);
}

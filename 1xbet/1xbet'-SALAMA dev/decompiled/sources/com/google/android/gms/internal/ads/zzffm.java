package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzffm {
    public static zzffn zza(Context context, int i7) {
        boolean zBooleanValue;
        if (zzfgb.zza()) {
            int i8 = i7 - 2;
            if (i8 != 20 && i8 != 21) {
                switch (i8) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbdr.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbdr.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbdr.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbdr.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzffp(context, i7);
            }
        }
        return new zzfgu();
    }

    public static zzffn zzb(Context context, int i7, int i8, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzffn zzffnVarZza = zza(context, i7);
        if (zzffnVarZza instanceof zzffp) {
            zzffnVarZza.zzi();
            zzffnVarZza.zzn(i8);
            zzffnVarZza.zzf(Q0.a.e0(zzmVar.f10742D));
            String str = zzmVar.f10745G;
            if (zzffx.zze(str)) {
                zzffnVarZza.zze(str);
            }
        }
        return zzffnVarZza;
    }
}

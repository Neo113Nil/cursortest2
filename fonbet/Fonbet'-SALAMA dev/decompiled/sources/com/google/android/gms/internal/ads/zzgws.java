package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgws extends zzgwr {
    @Override // com.google.android.gms.internal.ads.zzgwr
    public final void zza(Object obj) {
        ((zzgxc) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final void zzb(zzhal zzhalVar, Map.Entry entry) {
        zzgxd zzgxdVar = (zzgxd) entry.getKey();
        if (!zzgxdVar.zzc) {
            zzhaj zzhajVar = zzhaj.zza;
            switch (zzgxdVar.zzb.ordinal()) {
                case 0:
                    zzhalVar.zzf(zzgxdVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzhalVar.zzo(zzgxdVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzhalVar.zzt(zzgxdVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzhalVar.zzK(zzgxdVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzhalVar.zzr(zzgxdVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzhalVar.zzm(zzgxdVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzhalVar.zzk(zzgxdVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzhalVar.zzb(zzgxdVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzhalVar.zzG(zzgxdVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzhalVar.zzq(zzgxdVar.zza, entry.getValue(), zzgzb.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzhalVar.zzv(zzgxdVar.zza, entry.getValue(), zzgzb.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzhalVar.zzd(zzgxdVar.zza, (zzgvy) entry.getValue());
                    break;
                case 12:
                    zzhalVar.zzI(zzgxdVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzhalVar.zzr(zzgxdVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzhalVar.zzx(zzgxdVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzhalVar.zzz(zzgxdVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzhalVar.zzB(zzgxdVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzhalVar.zzD(zzgxdVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhaj zzhajVar2 = zzhaj.zza;
        switch (zzgxdVar.zzb.ordinal()) {
            case 0:
                zzgzm.zzt(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 1:
                zzgzm.zzx(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 2:
                zzgzm.zzA(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 3:
                zzgzm.zzI(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 4:
                zzgzm.zzz(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 5:
                zzgzm.zzw(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 6:
                zzgzm.zzv(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 7:
                zzgzm.zzr(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 8:
                zzgzm.zzG(zzgxdVar.zza, (List) entry.getValue(), zzhalVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzgzm.zzy(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgzb.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzgzm.zzB(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgzb.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzgzm.zzs(zzgxdVar.zza, (List) entry.getValue(), zzhalVar);
                break;
            case 12:
                zzgzm.zzH(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 13:
                zzgzm.zzz(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 14:
                zzgzm.zzC(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 15:
                zzgzm.zzD(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 16:
                zzgzm.zzE(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
            case 17:
                zzgzm.zzF(zzgxdVar.zza, (List) entry.getValue(), zzhalVar, zzgxdVar.zzd);
                break;
        }
    }
}

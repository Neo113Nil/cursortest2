package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhl {
    private static zzhu zzqc = new zzhm();
    private final zzht zzqb;

    public zzhl(zzht zzhtVar) {
        this.zzqb = zzhtVar;
    }

    private final zzhk zza(zzhk zzhkVar, zzch zzchVar, zzbv zzbvVar, zzfg zzfgVar, zzja zzjaVar, boolean z, zzhq zzhqVar) {
        if (zzhkVar.zzet().zzd().isEmpty() && !zzhkVar.zzet().zzdo()) {
            return zzhkVar;
        }
        zzbv zzb = zzchVar.isEmpty() ? zzbvVar : zzbv.zzbf().zzb(zzchVar, zzbvVar);
        zzja zzd = zzhkVar.zzet().zzd();
        Map<zzid, zzbv> zzbi = zzb.zzbi();
        zzhk zzhkVar2 = zzhkVar;
        for (Map.Entry<zzid, zzbv> entry : zzbi.entrySet()) {
            zzid key = entry.getKey();
            if (zzd.zzk(key)) {
                zzhkVar2 = zza(zzhkVar2, new zzch(key), entry.getValue().zzb(zzd.zzm(key)), zzfgVar, zzjaVar, z, zzhqVar);
            }
        }
        zzhk zzhkVar3 = zzhkVar2;
        for (Map.Entry<zzid, zzbv> entry2 : zzbi.entrySet()) {
            zzid key2 = entry2.getKey();
            boolean z2 = !zzhkVar.zzet().zzf(key2) && entry2.getValue().zzbg() == null;
            if (!zzd.zzk(key2) && !z2) {
                zzhkVar3 = zza(zzhkVar3, new zzch(key2), entry2.getValue().zzb(zzd.zzm(key2)), zzfgVar, zzjaVar, z, zzhqVar);
            }
        }
        return zzhkVar3;
    }

    private final zzhk zza(zzhk zzhkVar, zzch zzchVar, zzfg zzfgVar, zzhu zzhuVar, zzhq zzhqVar) {
        zzja zza;
        zzit zza2;
        zzja zzc;
        zzgu zzer = zzhkVar.zzer();
        if (zzfgVar.zzu(zzchVar) != null) {
            return zzhkVar;
        }
        if (zzchVar.isEmpty()) {
            if (zzhkVar.zzet().zzdp()) {
                zzja zzeu = zzhkVar.zzeu();
                if (!(zzeu instanceof zzif)) {
                    zzeu = zzir.zzfv();
                }
                zzc = zzfgVar.zzd(zzeu);
            } else {
                zzc = zzfgVar.zzc(zzhkVar.zzeu());
            }
            zza2 = this.zzqb.zza(zzhkVar.zzer().zzdq(), zzit.zza(zzc, this.zzqb.zzeg()), zzhqVar);
        } else {
            zzid zzbw = zzchVar.zzbw();
            if (zzbw.zzfh()) {
                zzja zza3 = zzfgVar.zza(zzchVar, zzer.zzd(), zzhkVar.zzet().zzd());
                if (zza3 != null) {
                    zza2 = this.zzqb.zza(zzer.zzdq(), zza3);
                }
                zza2 = zzer.zzdq();
            } else {
                zzch zzbx = zzchVar.zzbx();
                if (zzer.zzf(zzbw)) {
                    zzja zza4 = zzfgVar.zza(zzchVar, zzer.zzd(), zzhkVar.zzet().zzd());
                    zza = zza4 != null ? zzer.zzd().zzm(zzbw).zzl(zzbx, zza4) : zzer.zzd().zzm(zzbw);
                } else {
                    zza = zzfgVar.zza(zzbw, zzhkVar.zzet());
                }
                zzja zzjaVar = zza;
                if (zzjaVar != null) {
                    zza2 = this.zzqb.zza(zzer.zzdq(), zzbw, zzjaVar, zzbx, zzhuVar, zzhqVar);
                }
                zza2 = zzer.zzdq();
            }
        }
        return zzhkVar.zza(zza2, zzer.zzdo() || zzchVar.isEmpty(), this.zzqb.zzex());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzhk zza(zzhk zzhkVar, zzch zzchVar, zzja zzjaVar, zzfg zzfgVar, zzja zzjaVar2, zzhq zzhqVar) {
        zzja zzjaVar3;
        zzit zza;
        boolean zzdo;
        boolean zzdp;
        zzgu zzer = zzhkVar.zzer();
        zzhp zzhpVar = new zzhp(zzfgVar, zzhkVar, zzjaVar2);
        if (zzchVar.isEmpty()) {
            zza = this.zzqb.zza(zzhkVar.zzer().zzdq(), zzit.zza(zzjaVar, this.zzqb.zzeg()), zzhqVar);
            zzdo = true;
        } else {
            zzid zzbw = zzchVar.zzbw();
            if (zzbw.zzfh()) {
                zza = this.zzqb.zza(zzhkVar.zzer().zzdq(), zzjaVar);
                zzdo = zzer.zzdo();
                zzdp = zzer.zzdp();
                return zzhkVar.zza(zza, zzdo, zzdp);
            }
            zzch zzbx = zzchVar.zzbx();
            zzja zzm = zzer.zzd().zzm(zzbw);
            if (!zzbx.isEmpty()) {
                zzja zzh = zzhpVar.zzh(zzbw);
                if (zzh == null) {
                    zzjaVar = zzir.zzfv();
                } else if (zzbx.zzbz().zzfh() && zzh.zzam(zzbx.zzby()).isEmpty()) {
                    zzjaVar3 = zzh;
                    if (!zzm.equals(zzjaVar3)) {
                        return zzhkVar;
                    }
                    zza = this.zzqb.zza(zzer.zzdq(), zzbw, zzjaVar3, zzbx, zzhpVar, zzhqVar);
                    zzdo = zzer.zzdo();
                } else {
                    zzjaVar = zzh.zzl(zzbx, zzjaVar);
                }
            }
            zzjaVar3 = zzjaVar;
            if (!zzm.equals(zzjaVar3)) {
            }
        }
        zzdp = this.zzqb.zzex();
        return zzhkVar.zza(zza, zzdo, zzdp);
    }

    private final zzhk zza(zzhk zzhkVar, zzch zzchVar, zzja zzjaVar, zzfg zzfgVar, zzja zzjaVar2, boolean z, zzhq zzhqVar) {
        zzit zza;
        zzit zzg;
        zzit zzdq;
        zzgu zzet = zzhkVar.zzet();
        zzht zzew = z ? this.zzqb : this.zzqb.zzew();
        boolean z2 = true;
        if (zzchVar.isEmpty()) {
            zzdq = zzet.zzdq();
            zzg = zzit.zza(zzjaVar, zzew.zzeg());
        } else {
            if (!zzew.zzex() || zzet.zzdp()) {
                zzid zzbw = zzchVar.zzbw();
                if (!zzet.zzak(zzchVar) && zzchVar.size() > 1) {
                    return zzhkVar;
                }
                zzch zzbx = zzchVar.zzbx();
                zzja zzl = zzet.zzd().zzm(zzbw).zzl(zzbx, zzjaVar);
                zza = zzbw.zzfh() ? zzew.zza(zzet.zzdq(), zzl) : zzew.zza(zzet.zzdq(), zzbw, zzl, zzbx, zzqc, null);
                if (!zzet.zzdo() && !zzchVar.isEmpty()) {
                    z2 = false;
                }
                zzhk zzb = zzhkVar.zzb(zza, z2, zzew.zzex());
                return zza(zzb, zzchVar, zzfgVar, new zzhp(zzfgVar, zzb, zzjaVar2), zzhqVar);
            }
            zzid zzbw2 = zzchVar.zzbw();
            zzg = zzet.zzdq().zzg(zzbw2, zzet.zzd().zzm(zzbw2).zzl(zzchVar.zzbx(), zzjaVar));
            zzdq = zzet.zzdq();
        }
        zza = zzew.zza(zzdq, zzg, null);
        if (!zzet.zzdo()) {
            z2 = false;
        }
        zzhk zzb2 = zzhkVar.zzb(zza, z2, zzew.zzex());
        return zza(zzb2, zzchVar, zzfgVar, new zzhp(zzfgVar, zzb2, zzjaVar2), zzhqVar);
    }

    private static boolean zza(zzhk zzhkVar, zzid zzidVar) {
        return zzhkVar.zzer().zzf(zzidVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c8, code lost:
    
        if (r0.zzfk() == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzho zza(zzhk zzhkVar, zzfl zzflVar, zzfg zzfgVar, zzja zzjaVar) {
        boolean z;
        zzch zzg;
        zzja zzdd;
        zzhl zzhlVar;
        zzhk zzhkVar2;
        zzfg zzfgVar2;
        zzja zzjaVar2;
        zzhk zza;
        zzbv zzcx;
        zzhl zzhlVar2;
        zzhk zzhkVar3;
        zzfg zzfgVar3;
        zzja zzjaVar3;
        zzja zzc;
        zzch zzbx;
        zzht zzhtVar;
        zzgu zzer;
        zzhq zzhqVar = new zzhq();
        switch (zzhn.zzqd[zzflVar.zzcz().ordinal()]) {
            case 1:
                zzfp zzfpVar = (zzfp) zzflVar;
                if (zzfpVar.zzcy().zzda()) {
                    zza = zza(zzhkVar, zzfpVar.zzg(), zzfpVar.zzdd(), zzfgVar, zzjaVar, zzhqVar);
                    ArrayList arrayList = new ArrayList(zzhqVar.zzev());
                    zzer = zza.zzer();
                    if (zzer.zzdo()) {
                        boolean z2 = zzer.zzd().zzfk() || zzer.zzd().isEmpty();
                        if (!arrayList.isEmpty() || !zzhkVar.zzer().zzdo() || ((z2 && !zzer.zzd().equals(zzhkVar.zzes())) || !zzer.zzd().zzfl().equals(zzhkVar.zzes().zzfl()))) {
                            arrayList.add(zzgw.zza(zzer.zzdq()));
                        }
                    }
                    return new zzho(zza, arrayList);
                }
                z = zzfpVar.zzcy().zzdb() || (zzhkVar.zzet().zzdp() && !zzfpVar.zzg().isEmpty());
                zzg = zzfpVar.zzg();
                zzdd = zzfpVar.zzdd();
                zzhlVar = this;
                zzhkVar2 = zzhkVar;
                zzfgVar2 = zzfgVar;
                zzjaVar2 = zzjaVar;
                zza = zzhlVar.zza(zzhkVar2, zzg, zzdd, zzfgVar2, zzjaVar2, z, zzhqVar);
                ArrayList arrayList2 = new ArrayList(zzhqVar.zzev());
                zzer = zza.zzer();
                if (zzer.zzdo()) {
                }
                return new zzho(zza, arrayList2);
            case 2:
                zzfk zzfkVar = (zzfk) zzflVar;
                if (!zzfkVar.zzcy().zzda()) {
                    z = zzfkVar.zzcy().zzdb() || zzhkVar.zzet().zzdp();
                    zzg = zzfkVar.zzg();
                    zzcx = zzfkVar.zzcx();
                    zzhlVar2 = this;
                    zzhkVar3 = zzhkVar;
                    zzfgVar3 = zzfgVar;
                    zzjaVar3 = zzjaVar;
                    zza = zzhlVar2.zza(zzhkVar3, zzg, zzcx, zzfgVar3, zzjaVar3, z, zzhqVar);
                    ArrayList arrayList22 = new ArrayList(zzhqVar.zzev());
                    zzer = zza.zzer();
                    if (zzer.zzdo()) {
                    }
                    return new zzho(zza, arrayList22);
                }
                zzch zzg2 = zzfkVar.zzg();
                zzbv zzcx2 = zzfkVar.zzcx();
                Iterator<Map.Entry<zzch, zzja>> it = zzcx2.iterator();
                zzhk zzhkVar4 = zzhkVar;
                while (it.hasNext()) {
                    Map.Entry<zzch, zzja> next = it.next();
                    zzch zzh = zzg2.zzh(next.getKey());
                    if (zza(zzhkVar, zzh.zzbw())) {
                        zzhkVar4 = zza(zzhkVar4, zzh, next.getValue(), zzfgVar, zzjaVar, zzhqVar);
                    }
                }
                Iterator<Map.Entry<zzch, zzja>> it2 = zzcx2.iterator();
                while (it2.hasNext()) {
                    Map.Entry<zzch, zzja> next2 = it2.next();
                    zzch zzh2 = zzg2.zzh(next2.getKey());
                    if (!zza(zzhkVar, zzh2.zzbw())) {
                        zzhkVar4 = zza(zzhkVar4, zzh2, next2.getValue(), zzfgVar, zzjaVar, zzhqVar);
                    }
                }
                zza = zzhkVar4;
                ArrayList arrayList222 = new ArrayList(zzhqVar.zzev());
                zzer = zza.zzer();
                if (zzer.zzdo()) {
                }
                return new zzho(zza, arrayList222);
            case 3:
                zzfi zzfiVar = (zzfi) zzflVar;
                if (zzfiVar.zzcw()) {
                    zzch zzg3 = zzfiVar.zzg();
                    if (zzfgVar.zzu(zzg3) == null) {
                        zzhp zzhpVar = new zzhp(zzfgVar, zzhkVar, zzjaVar);
                        zzit zzdq = zzhkVar.zzer().zzdq();
                        if (!zzg3.isEmpty() && !zzg3.zzbw().zzfh()) {
                            zzid zzbw = zzg3.zzbw();
                            zzja zza2 = zzfgVar.zza(zzbw, zzhkVar.zzet());
                            if (zza2 == null && zzhkVar.zzet().zzf(zzbw)) {
                                zza2 = zzdq.zzd().zzm(zzbw);
                            }
                            if (zza2 == null) {
                                if (zza2 == null && zzhkVar.zzer().zzd().zzk(zzbw)) {
                                    zzht zzhtVar2 = this.zzqb;
                                    zzir zzfv = zzir.zzfv();
                                    zzbx = zzg3.zzbx();
                                    zzhtVar = zzhtVar2;
                                    zza2 = zzfv;
                                }
                                if (zzdq.zzd().isEmpty() && zzhkVar.zzet().zzdo()) {
                                    zzc = zzfgVar.zzc(zzhkVar.zzeu());
                                    break;
                                }
                                zza = zzhkVar.zza(zzdq, (zzhkVar.zzet().zzdo() && zzfgVar.zzu(zzch.zzbt()) == null) ? false : true, this.zzqb.zzex());
                                ArrayList arrayList2222 = new ArrayList(zzhqVar.zzev());
                                zzer = zza.zzer();
                                if (zzer.zzdo()) {
                                }
                                return new zzho(zza, arrayList2222);
                            }
                            zzht zzhtVar3 = this.zzqb;
                            zzbx = zzg3.zzbx();
                            zzhtVar = zzhtVar3;
                            zzdq = zzhtVar.zza(zzdq, zzbw, zza2, zzbx, zzhpVar, zzhqVar);
                            if (zzdq.zzd().isEmpty()) {
                                zzc = zzfgVar.zzc(zzhkVar.zzeu());
                            }
                            zza = zzhkVar.zza(zzdq, (zzhkVar.zzet().zzdo() && zzfgVar.zzu(zzch.zzbt()) == null) ? false : true, this.zzqb.zzex());
                            ArrayList arrayList22222 = new ArrayList(zzhqVar.zzev());
                            zzer = zza.zzer();
                            if (zzer.zzdo()) {
                            }
                            return new zzho(zza, arrayList22222);
                        }
                        zzc = zzhkVar.zzet().zzdo() ? zzfgVar.zzc(zzhkVar.zzeu()) : zzfgVar.zzd(zzhkVar.zzet().zzd());
                        zzdq = this.zzqb.zza(zzdq, zzit.zza(zzc, this.zzqb.zzeg()), zzhqVar);
                        zza = zzhkVar.zza(zzdq, (zzhkVar.zzet().zzdo() && zzfgVar.zzu(zzch.zzbt()) == null) ? false : true, this.zzqb.zzex());
                        ArrayList arrayList222222 = new ArrayList(zzhqVar.zzev());
                        zzer = zza.zzer();
                        if (zzer.zzdo()) {
                        }
                        return new zzho(zza, arrayList222222);
                    }
                } else {
                    zzg = zzfiVar.zzg();
                    zzgj<Boolean> zzcv = zzfiVar.zzcv();
                    if (zzfgVar.zzu(zzg) == null) {
                        z = zzhkVar.zzet().zzdp();
                        zzgu zzet = zzhkVar.zzet();
                        if (zzcv.getValue() == null) {
                            zzcx = zzbv.zzbf();
                            Iterator<Map.Entry<zzch, Boolean>> it3 = zzcv.iterator();
                            while (it3.hasNext()) {
                                zzch key = it3.next().getKey();
                                zzch zzh3 = zzg.zzh(key);
                                if (zzet.zzak(zzh3)) {
                                    zzcx = zzcx.zze(key, zzet.zzd().zzam(zzh3));
                                }
                            }
                        } else {
                            if ((zzg.isEmpty() && zzet.zzdo()) || zzet.zzak(zzg)) {
                                zzdd = zzet.zzd().zzam(zzg);
                                zzhlVar = this;
                                zzhkVar2 = zzhkVar;
                                zzfgVar2 = zzfgVar;
                                zzjaVar2 = zzjaVar;
                                zza = zzhlVar.zza(zzhkVar2, zzg, zzdd, zzfgVar2, zzjaVar2, z, zzhqVar);
                                ArrayList arrayList2222222 = new ArrayList(zzhqVar.zzev());
                                zzer = zza.zzer();
                                if (zzer.zzdo()) {
                                }
                                return new zzho(zza, arrayList2222222);
                            }
                            if (zzg.isEmpty()) {
                                zzbv zzbf = zzbv.zzbf();
                                zzcx = zzbf;
                                for (zziz zzizVar : zzet.zzd()) {
                                    zzcx = zzcx.zza(zzizVar.zzge(), zzizVar.zzd());
                                }
                            }
                        }
                        zzhlVar2 = this;
                        zzhkVar3 = zzhkVar;
                        zzfgVar3 = zzfgVar;
                        zzjaVar3 = zzjaVar;
                        zza = zzhlVar2.zza(zzhkVar3, zzg, zzcx, zzfgVar3, zzjaVar3, z, zzhqVar);
                        ArrayList arrayList22222222 = new ArrayList(zzhqVar.zzev());
                        zzer = zza.zzer();
                        if (zzer.zzdo()) {
                        }
                        return new zzho(zza, arrayList22222222);
                    }
                }
                zza = zzhkVar;
                ArrayList arrayList222222222 = new ArrayList(zzhqVar.zzev());
                zzer = zza.zzer();
                if (zzer.zzdo()) {
                }
                return new zzho(zza, arrayList222222222);
            case 4:
                zzch zzg4 = zzflVar.zzg();
                zzgu zzet2 = zzhkVar.zzet();
                zza = zza(zzhkVar.zzb(zzet2.zzdq(), zzet2.zzdo() || zzg4.isEmpty(), zzet2.zzdp()), zzg4, zzfgVar, zzqc, zzhqVar);
                ArrayList arrayList2222222222 = new ArrayList(zzhqVar.zzev());
                zzer = zza.zzer();
                if (zzer.zzdo()) {
                }
                return new zzho(zza, arrayList2222222222);
            default:
                String valueOf = String.valueOf(zzflVar.zzcz());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Unknown operation: ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
        }
    }
}

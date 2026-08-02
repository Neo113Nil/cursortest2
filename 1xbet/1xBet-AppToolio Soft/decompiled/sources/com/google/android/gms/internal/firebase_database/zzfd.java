package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfd {
    private static final zzgn<zzfa> zzmc = new zzff();
    private zzbv zzlz = zzbv.zzbf();
    private List<zzfa> zzma = new ArrayList();
    private Long zzmb = -1L;

    private static zzbv zza(List<zzfa> list, zzgn<zzfa> zzgnVar, zzch zzchVar) {
        zzch zza;
        zzja zzco;
        zzch zza2;
        zzbv zzbf = zzbv.zzbf();
        for (zzfa zzfaVar : list) {
            if (zzgnVar.zzd(zzfaVar)) {
                zzch zzg = zzfaVar.zzg();
                if (!zzfaVar.zzcq()) {
                    if (zzchVar.zzi(zzg)) {
                        zza2 = zzch.zza(zzchVar, zzg);
                    } else if (zzg.zzi(zzchVar)) {
                        zzch zza3 = zzch.zza(zzg, zzchVar);
                        if (zza3.isEmpty()) {
                            zza2 = zzch.zzbt();
                        } else {
                            zzco = zzfaVar.zzcp().zzf(zza3);
                            if (zzco != null) {
                                zza = zzch.zzbt();
                                zzbf = zzbf.zze(zza, zzco);
                            }
                        }
                    }
                    zzbf = zzbf.zzb(zza2, zzfaVar.zzcp());
                } else if (zzchVar.zzi(zzg)) {
                    zza = zzch.zza(zzchVar, zzg);
                    zzco = zzfaVar.zzco();
                    zzbf = zzbf.zze(zza, zzco);
                } else if (zzg.zzi(zzchVar)) {
                    zzbf = zzbf.zze(zzch.zzbt(), zzfaVar.zzco().zzam(zzch.zza(zzg, zzchVar)));
                }
            }
        }
        return zzbf;
    }

    public final zziz zza(zzch zzchVar, zzja zzjaVar, zziz zzizVar, boolean z, zzis zzisVar) {
        zzbv zzg = this.zzlz.zzg(zzchVar);
        zzja zzf = zzg.zzf(zzch.zzbt());
        zziz zzizVar2 = null;
        if (zzf == null) {
            if (zzjaVar != null) {
                zzf = zzg.zzb(zzjaVar);
            }
            return zzizVar2;
        }
        for (zziz zzizVar3 : zzf) {
            if (zzisVar.zza(zzizVar3, zzizVar, z) > 0 && (zzizVar2 == null || zzisVar.zza(zzizVar3, zzizVar2, z) < 0)) {
                zzizVar2 = zzizVar3;
            }
        }
        return zzizVar2;
    }

    public final zzja zza(zzch zzchVar, zzch zzchVar2, zzja zzjaVar, zzja zzjaVar2) {
        zzch zzh = zzchVar.zzh(zzchVar2);
        if (this.zzlz.zze(zzh)) {
            return null;
        }
        zzbv zzg = this.zzlz.zzg(zzh);
        return zzg.isEmpty() ? zzjaVar2.zzam(zzchVar2) : zzg.zzb(zzjaVar2.zzam(zzchVar2));
    }

    public final zzja zza(zzch zzchVar, zzid zzidVar, zzgu zzguVar) {
        zzch zza = zzchVar.zza(zzidVar);
        zzja zzf = this.zzlz.zzf(zza);
        if (zzf != null) {
            return zzf;
        }
        if (zzguVar.zzf(zzidVar)) {
            return this.zzlz.zzg(zza).zzb(zzguVar.zzd().zzm(zzidVar));
        }
        return null;
    }

    public final zzja zza(zzch zzchVar, zzja zzjaVar, List<Long> list, boolean z) {
        if (list.isEmpty() && !z) {
            zzja zzf = this.zzlz.zzf(zzchVar);
            if (zzf != null) {
                return zzf;
            }
            zzbv zzg = this.zzlz.zzg(zzchVar);
            if (zzg.isEmpty()) {
                return zzjaVar;
            }
            if (zzjaVar == null && !zzg.zze(zzch.zzbt())) {
                return null;
            }
            if (zzjaVar == null) {
                zzjaVar = zzir.zzfv();
            }
            return zzg.zzb(zzjaVar);
        }
        zzbv zzg2 = this.zzlz.zzg(zzchVar);
        if (!z && zzg2.isEmpty()) {
            return zzjaVar;
        }
        if (!z && zzjaVar == null && !zzg2.zze(zzch.zzbt())) {
            return null;
        }
        zzbv zza = zza(this.zzma, new zzfe(this, z, list, zzchVar), zzchVar);
        if (zzjaVar == null) {
            zzjaVar = zzir.zzfv();
        }
        return zza.zzb(zzjaVar);
    }

    public final void zza(zzch zzchVar, zzbv zzbvVar, Long l) {
        this.zzma.add(new zzfa(l.longValue(), zzchVar, zzbvVar));
        this.zzlz = this.zzlz.zzb(zzchVar, zzbvVar);
        this.zzmb = l;
    }

    public final void zza(zzch zzchVar, zzja zzjaVar, Long l, boolean z) {
        this.zzma.add(new zzfa(l.longValue(), zzchVar, zzjaVar, z));
        if (z) {
            this.zzlz = this.zzlz.zze(zzchVar, zzjaVar);
        }
        this.zzmb = l;
    }

    public final List<zzfa> zzct() {
        ArrayList arrayList = new ArrayList(this.zzma);
        this.zzlz = zzbv.zzbf();
        this.zzma = new ArrayList();
        return arrayList;
    }

    public final zzja zzj(zzch zzchVar, zzja zzjaVar) {
        zzja zzfv = zzir.zzfv();
        zzja zzf = this.zzlz.zzf(zzchVar);
        if (zzf != null) {
            if (!zzf.zzfk()) {
                for (zziz zzizVar : zzf) {
                    zzfv = zzfv.zze(zzizVar.zzge(), zzizVar.zzd());
                }
            }
            return zzfv;
        }
        zzbv zzg = this.zzlz.zzg(zzchVar);
        for (zziz zzizVar2 : zzjaVar) {
            zzfv = zzfv.zze(zzizVar2.zzge(), zzg.zzg(new zzch(zzizVar2.zzge())).zzb(zzizVar2.zzd()));
        }
        for (zziz zzizVar3 : zzg.zzbh()) {
            zzfv = zzfv.zze(zzizVar3.zzge(), zzizVar3.zzd());
        }
        return zzfv;
    }

    public final zzfa zzk(long j) {
        for (zzfa zzfaVar : this.zzma) {
            if (zzfaVar.zzcn() == j) {
                return zzfaVar;
            }
        }
        return null;
    }

    public final boolean zzl(long j) {
        zzfa zzfaVar;
        long j2;
        boolean z;
        Iterator<zzfa> it = this.zzma.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                zzfaVar = null;
                break;
            }
            zzfaVar = it.next();
            if (zzfaVar.zzcn() == j) {
                break;
            }
            i++;
        }
        this.zzma.remove(zzfaVar);
        boolean isVisible = zzfaVar.isVisible();
        boolean z2 = false;
        for (int size = this.zzma.size() - 1; isVisible && size >= 0; size--) {
            zzfa zzfaVar2 = this.zzma.get(size);
            if (zzfaVar2.isVisible()) {
                if (size >= i) {
                    zzch zzg = zzfaVar.zzg();
                    if (!zzfaVar2.zzcq()) {
                        Iterator<Map.Entry<zzch, zzja>> it2 = zzfaVar2.zzcp().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            if (zzfaVar2.zzg().zzh(it2.next().getKey()).zzi(zzg)) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = zzfaVar2.zzg().zzi(zzg);
                    }
                    if (z) {
                        isVisible = false;
                    }
                }
                if (zzfaVar.zzg().zzi(zzfaVar2.zzg())) {
                    z2 = true;
                }
            }
        }
        if (!isVisible) {
            return false;
        }
        if (z2) {
            this.zzlz = zza(this.zzma, zzmc, zzch.zzbt());
            if (this.zzma.size() > 0) {
                List<zzfa> list = this.zzma;
                j2 = list.get(list.size() - 1).zzcn();
            } else {
                j2 = -1;
            }
            this.zzmb = Long.valueOf(j2);
            return true;
        }
        if (zzfaVar.zzcq()) {
            this.zzlz = this.zzlz.zzd(zzfaVar.zzg());
        } else {
            Iterator<Map.Entry<zzch, zzja>> it3 = zzfaVar.zzcp().iterator();
            while (it3.hasNext()) {
                this.zzlz = this.zzlz.zzd(zzfaVar.zzg().zzh(it3.next().getKey()));
            }
        }
        return true;
    }

    public final zzfg zzt(zzch zzchVar) {
        return new zzfg(zzchVar, this);
    }

    public final zzja zzu(zzch zzchVar) {
        return this.zzlz.zzf(zzchVar);
    }
}

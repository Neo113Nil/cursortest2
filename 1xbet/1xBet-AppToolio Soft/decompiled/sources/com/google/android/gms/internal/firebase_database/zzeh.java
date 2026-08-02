package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzeh implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzce zzle;

    zzeh(zzee zzeeVar, zzce zzceVar) {
        this.zzlb = zzeeVar;
        this.zzle = zzceVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzgj zzgjVar;
        zzgj zzgjVar2;
        zzfv zzfvVar;
        zzfv zzfvVar2;
        zzgu zzf;
        zzgj zzgjVar3;
        zzja zzr;
        zzfd zzfdVar;
        zzex zzcl;
        Map map;
        Map map2;
        zzfv zzfvVar3;
        zzgj zzgjVar4;
        zzhh zzbe = this.zzle.zzbe();
        zzch zzg = zzbe.zzg();
        zzgjVar = this.zzlb.zzkq;
        zzch zzchVar = zzg;
        zzja zzjaVar = null;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (zzgjVar.isEmpty()) {
                break;
            }
            zzed zzedVar = (zzed) zzgjVar.getValue();
            if (zzedVar != null) {
                if (zzjaVar == null) {
                    zzjaVar = zzedVar.zzr(zzchVar);
                }
                if (!z && !zzedVar.zzci()) {
                    z2 = false;
                }
                z = z2;
            }
            zzgjVar = zzgjVar.zze(zzchVar.isEmpty() ? zzid.zzt("") : zzchVar.zzbw());
            zzchVar = zzchVar.zzbx();
        }
        zzgjVar2 = this.zzlb.zzkq;
        zzed zzedVar2 = (zzed) zzgjVar2.zzai(zzg);
        if (zzedVar2 == null) {
            zzfvVar3 = this.zzlb.zzkp;
            zzedVar2 = new zzed(zzfvVar3);
            zzee zzeeVar = this.zzlb;
            zzgjVar4 = zzeeVar.zzkq;
            zzeeVar.zzkq = zzgjVar4.zzb(zzg, (zzch) zzedVar2);
        } else {
            z = z || zzedVar2.zzci();
            if (zzjaVar == null) {
                zzjaVar = zzedVar2.zzr(zzch.zzbt());
            }
        }
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zzg(zzbe);
        if (zzjaVar != null) {
            zzf = new zzgu(zzit.zza(zzjaVar, zzbe.zzeg()), true, false);
        } else {
            zzfvVar2 = this.zzlb.zzkp;
            zzf = zzfvVar2.zzf(zzbe);
            if (!zzf.zzdo()) {
                zzja zzfv = zzir.zzfv();
                zzgjVar3 = this.zzlb.zzkq;
                Iterator it = zzgjVar3.zzag(zzg).zzdm().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    zzed zzedVar3 = (zzed) ((zzgj) entry.getValue()).getValue();
                    if (zzedVar3 != null && (zzr = zzedVar3.zzr(zzch.zzbt())) != null) {
                        zzfv = zzfv.zze((zzid) entry.getKey(), zzr);
                    }
                }
                for (zziz zzizVar : zzf.zzd()) {
                    if (!zzfv.zzk(zzizVar.zzge())) {
                        zzfv = zzfv.zze(zzizVar.zzge(), zzizVar.zzd());
                    }
                }
                zzf = new zzgu(zzit.zza(zzfv, zzbe.zzeg()), false, false);
            }
        }
        boolean zzc = zzedVar2.zzc(zzbe);
        if (!zzc && !zzbe.zzek()) {
            zzcl = this.zzlb.zzcl();
            map = this.zzlb.zzkt;
            map.put(zzbe, zzcl);
            map2 = this.zzlb.zzks;
            map2.put(zzcl, zzbe);
        }
        zzfdVar = this.zzlb.zzkr;
        List<zzgx> zza = zzedVar2.zza(this.zzle, zzfdVar.zzt(zzg), zzf);
        if (!zzc && !z) {
            this.zzlb.zza(zzbe, zzedVar2.zzb(zzbe));
        }
        return zza;
    }
}

package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzei implements Callable<List<zzgy>> {
    private final /* synthetic */ zzhh zziz;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzce zzle;
    private final /* synthetic */ DatabaseError zzlf;

    zzei(zzee zzeeVar, zzhh zzhhVar, zzce zzceVar, DatabaseError databaseError) {
        this.zzlb = zzeeVar;
        this.zziz = zzhhVar;
        this.zzle = zzceVar;
        this.zzlf = databaseError;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzgy> call() throws Exception {
        zzgj zzgjVar;
        boolean z;
        zzgj zzgjVar2;
        zzex zze;
        zzew zzewVar;
        zzhh zzd;
        zzew zzewVar2;
        zzhh zzd2;
        zzgj zzgjVar3;
        List<zzhi> zza;
        zzew zzewVar3;
        zzhh zzd3;
        zzex zzexVar;
        zzfv zzfvVar;
        zzgj zzgjVar4;
        zzch zzg = this.zziz.zzg();
        zzgjVar = this.zzlb.zzkq;
        zzed zzedVar = (zzed) zzgjVar.zzai(zzg);
        List<zzgy> arrayList = new ArrayList<>();
        if (zzedVar != null && (this.zziz.isDefault() || zzedVar.zzc(this.zziz))) {
            zzkn<List<zzhh>, List<zzgy>> zza2 = zzedVar.zza(this.zziz, this.zzle, this.zzlf);
            if (zzedVar.isEmpty()) {
                zzee zzeeVar = this.zzlb;
                zzgjVar4 = zzeeVar.zzkq;
                zzeeVar.zzkq = zzgjVar4.zzah(zzg);
            }
            List<zzhh> first = zza2.getFirst();
            arrayList = zza2.zzgv();
            loop0: while (true) {
                for (zzhh zzhhVar : first) {
                    zzfvVar = this.zzlb.zzkp;
                    zzfvVar.zzh(this.zziz);
                    z = z || zzhhVar.zzek();
                }
            }
            zzgjVar2 = this.zzlb.zzkq;
            boolean z2 = zzgjVar2.getValue() != null && ((zzed) zzgjVar2.getValue()).zzci();
            Iterator<zzid> it = zzg.iterator();
            while (it.hasNext()) {
                zzgjVar2 = zzgjVar2.zze(it.next());
                z2 = z2 || (zzgjVar2.getValue() != null && ((zzed) zzgjVar2.getValue()).zzci());
                if (z2 || zzgjVar2.isEmpty()) {
                    break;
                }
            }
            if (z && !z2) {
                zzgjVar3 = this.zzlb.zzkq;
                zzgj zzag = zzgjVar3.zzag(zzg);
                if (!zzag.isEmpty()) {
                    zza = this.zzlb.zza((zzgj<zzed>) zzag);
                    for (zzhi zzhiVar : zza) {
                        zzev zzevVar = new zzev(this.zzlb, zzhiVar);
                        zzhh zzeo = zzhiVar.zzeo();
                        zzewVar3 = this.zzlb.zzkv;
                        zzee zzeeVar2 = this.zzlb;
                        zzd3 = zzee.zzd(zzeo);
                        zzexVar = zzevVar.zzlp;
                        zzewVar3.zza(zzd3, zzexVar, zzevVar, zzevVar);
                    }
                }
            }
            if (!z2 && !first.isEmpty() && this.zzlf == null) {
                if (z) {
                    zzewVar2 = this.zzlb.zzkv;
                    zzee zzeeVar3 = this.zzlb;
                    zzd2 = zzee.zzd(this.zziz);
                    zzewVar2.zza(zzd2, null);
                } else {
                    for (zzhh zzhhVar2 : first) {
                        zze = this.zzlb.zze(zzhhVar2);
                        zzewVar = this.zzlb.zzkv;
                        zzee zzeeVar4 = this.zzlb;
                        zzd = zzee.zzd(zzhhVar2);
                        zzewVar.zza(zzd, zze);
                    }
                }
            }
            this.zzlb.zzd((List<zzhh>) first);
        }
        return arrayList;
    }
}

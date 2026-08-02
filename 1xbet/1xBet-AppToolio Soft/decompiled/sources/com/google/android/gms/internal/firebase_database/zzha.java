package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzha {
    private final zzhh zzpc;
    private final zzis zzpd;

    public zzha(zzhh zzhhVar) {
        this.zzpc = zzhhVar;
        this.zzpd = zzhhVar.zzeg();
    }

    private final void zza(List<zzgx> list, zzgz zzgzVar, List<zzgw> list2, List<zzce> list3, zzit zzitVar) {
        ArrayList arrayList = new ArrayList();
        for (zzgw zzgwVar : list2) {
            if (zzgwVar.zzdt().equals(zzgzVar)) {
                arrayList.add(zzgwVar);
            }
        }
        Collections.sort(arrayList, new zzhb(this));
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zzgw zzgwVar2 = (zzgw) obj;
            for (zzce zzceVar : list3) {
                if (zzceVar.zza(zzgzVar)) {
                    list.add(zzceVar.zza((zzgwVar2.zzdt().equals(zzgz.VALUE) || zzgwVar2.zzdt().equals(zzgz.CHILD_REMOVED)) ? zzgwVar2 : zzgwVar2.zzg(zzitVar.zza(zzgwVar2.zzds(), zzgwVar2.zzdq().zzd(), this.zzpd)), this.zzpc));
                }
            }
        }
    }

    public final List<zzgx> zza(List<zzgw> list, zzit zzitVar, List<zzce> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (zzgw zzgwVar : list) {
            if (zzgwVar.zzdt().equals(zzgz.CHILD_CHANGED)) {
                if (this.zzpd.compare(new zziz(zzid.zzfc(), zzgwVar.zzdv().zzd()), new zziz(zzid.zzfc(), zzgwVar.zzdq().zzd())) != 0) {
                    arrayList2.add(zzgw.zzc(zzgwVar.zzds(), zzgwVar.zzdq()));
                }
            }
        }
        zza(arrayList, zzgz.CHILD_REMOVED, list, list2, zzitVar);
        zza(arrayList, zzgz.CHILD_ADDED, list, list2, zzitVar);
        zza(arrayList, zzgz.CHILD_MOVED, arrayList2, list2, zzitVar);
        zza(arrayList, zzgz.CHILD_CHANGED, list, list2, zzitVar);
        zza(arrayList, zzgz.VALUE, list, list2, zzitVar);
        return arrayList;
    }
}

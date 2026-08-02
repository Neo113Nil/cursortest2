package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzcs implements zzbb {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ List zzis;
    private final /* synthetic */ zzck zzit;

    zzcs(zzck zzckVar, zzch zzchVar, List list, zzck zzckVar2) {
        this.zzil = zzckVar;
        this.zzgy = zzchVar;
        this.zzis = list;
        this.zzit = zzckVar2;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        int i;
        zzgp zzgpVar;
        zzee zzeeVar;
        long j;
        zzkm zzkmVar;
        zzja zzjaVar;
        zzch zzchVar;
        ValueEventListener valueEventListener;
        zzch zzchVar2;
        zzc = zzck.zzc(str, str2);
        this.zzil.zza("Transaction", this.zzgy, zzc);
        ArrayList arrayList = new ArrayList();
        if (zzc != null) {
            if (zzc.getCode() == -1) {
                for (zzdl zzdlVar : this.zzis) {
                    i = zzdlVar.zzjl;
                    zzdlVar.zzjl = i == zzdm.zzjx ? zzdm.zzjy : zzdm.zzju;
                }
            } else {
                for (zzdl zzdlVar2 : this.zzis) {
                    zzdlVar2.zzjl = zzdm.zzjy;
                    zzdlVar2.zzjo = zzc;
                }
            }
            this.zzil.zzn(this.zzgy);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (zzdl zzdlVar3 : this.zzis) {
            zzdlVar3.zzjl = zzdm.zzjw;
            zzeeVar = this.zzil.zzih;
            j = zzdlVar3.zzjp;
            zzkmVar = this.zzil.zzhu;
            arrayList.addAll(zzeeVar.zza(j, false, false, (zzkf) zzkmVar));
            zzjaVar = zzdlVar3.zzjs;
            zzck zzckVar = this.zzit;
            zzchVar = zzdlVar3.zzap;
            arrayList2.add(new zzct(this, zzdlVar3, com.google.firebase.database.zzh.zza(com.google.firebase.database.zzh.zza(zzckVar, zzchVar), zzit.zzj(zzjaVar))));
            zzck zzckVar2 = this.zzil;
            valueEventListener = zzdlVar3.zzjk;
            zzchVar2 = zzdlVar3.zzap;
            zzckVar2.zze(new zzfc(zzckVar2, valueEventListener, zzhh.zzal(zzchVar2)));
        }
        zzck zzckVar3 = this.zzil;
        zzgpVar = zzckVar3.zzhx;
        zzckVar3.zzb((zzgp<List<zzdl>>) zzgpVar.zzaj(this.zzgy));
        this.zzil.zzcf();
        this.zzit.zzc((List<? extends zzgy>) arrayList);
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            this.zzil.zza((Runnable) arrayList2.get(i2));
        }
    }
}

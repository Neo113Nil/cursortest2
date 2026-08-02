package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzej implements zzgm<zzed, Void> {
    private final /* synthetic */ zzee zzlb;

    zzej(zzee zzeeVar) {
        this.zzlb = zzeeVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Void zza(zzch zzchVar, zzed zzedVar, Void r5) {
        zzew zzewVar;
        zzhh zzd;
        zzex zze;
        zzew zzewVar2;
        zzhh zzd2;
        zzex zze2;
        zzed zzedVar2 = zzedVar;
        if (!zzchVar.isEmpty() && zzedVar2.zzci()) {
            zzhh zzeo = zzedVar2.zzcj().zzeo();
            zzewVar2 = this.zzlb.zzkv;
            zzee zzeeVar = this.zzlb;
            zzd2 = zzee.zzd(zzeo);
            zze2 = this.zzlb.zze(zzeo);
            zzewVar2.zza(zzd2, zze2);
            return null;
        }
        Iterator<zzhi> it = zzedVar2.zzch().iterator();
        while (it.hasNext()) {
            zzhh zzeo2 = it.next().zzeo();
            zzewVar = this.zzlb.zzkv;
            zzee zzeeVar2 = this.zzlb;
            zzd = zzee.zzd(zzeo2);
            zze = this.zzlb.zze(zzeo2);
            zzewVar.zza(zzd, zze);
        }
        return null;
    }
}

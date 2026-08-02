package com.google.android.gms.internal.firebase_database;

import java.util.List;

/* loaded from: classes.dex */
final class zzco implements zzec {
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ List zzip;

    zzco(zzck zzckVar, List list) {
        this.zzil = zzckVar;
        this.zzip = list;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzec
    public final void zzf(zzch zzchVar, zzja zzjaVar) {
        zzee zzeeVar;
        zzch zzb;
        List list = this.zzip;
        zzeeVar = this.zzil.zzih;
        list.addAll(zzeeVar.zzi(zzchVar, zzjaVar));
        zzb = this.zzil.zzb(zzchVar, -9);
        this.zzil.zzn(zzb);
    }
}

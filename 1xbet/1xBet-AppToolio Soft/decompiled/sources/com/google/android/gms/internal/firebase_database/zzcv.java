package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.ValueEventListener;

/* loaded from: classes.dex */
final class zzcv implements Runnable {
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ zzdl zziv;

    zzcv(zzck zzckVar, zzdl zzdlVar) {
        this.zzil = zzckVar;
        this.zziv = zzdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueEventListener valueEventListener;
        zzch zzchVar;
        zzck zzckVar = this.zzil;
        valueEventListener = this.zziv.zzjk;
        zzchVar = this.zziv.zzap;
        zzckVar.zze(new zzfc(zzckVar, valueEventListener, zzhh.zzal(zzchVar)));
    }
}

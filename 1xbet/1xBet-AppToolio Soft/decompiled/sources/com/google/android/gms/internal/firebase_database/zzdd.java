package com.google.android.gms.internal.firebase_database;

import java.util.List;

/* loaded from: classes.dex */
final class zzdd implements Runnable {
    private final /* synthetic */ zzhh zziz;
    private final /* synthetic */ zzet zzja;
    private final /* synthetic */ zzdc zzjb;

    zzdd(zzdc zzdcVar, zzhh zzhhVar, zzet zzetVar) {
        this.zzjb = zzdcVar;
        this.zziz = zzhhVar;
        this.zzja = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzee zzeeVar;
        zzdxVar = this.zzjb.zzil.zzhv;
        zzja zzp = zzdxVar.zzp(this.zziz.zzg());
        if (zzp.isEmpty()) {
            return;
        }
        zzeeVar = this.zzjb.zzil.zzig;
        this.zzjb.zzil.zzc((List<? extends zzgy>) zzeeVar.zzi(this.zziz.zzg(), zzp));
        this.zzja.zzb(null);
    }
}

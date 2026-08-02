package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzbk implements Runnable {
    private final /* synthetic */ zzbh zzfh;

    zzbk(zzbh zzbhVar) {
        this.zzfh = zzbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar;
        zzhz zzhzVar2;
        zzhzVar = this.zzfh.zzff.zzbs;
        if (zzhzVar.zzfa()) {
            zzhzVar2 = this.zzfh.zzff.zzbs;
            zzhzVar2.zza("closed", null, new Object[0]);
        }
        this.zzfh.zzff.zzat();
    }
}

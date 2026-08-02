package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzbn implements Runnable {
    private final /* synthetic */ Runnable zzgj;
    private final /* synthetic */ zzbm zzgk;

    zzbn(zzbm zzbmVar, Runnable runnable) {
        this.zzgk = zzbmVar;
        this.zzgj = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbm.zza(this.zzgk, null);
        this.zzgj.run();
    }
}

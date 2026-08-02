package com.google.firebase.database;

/* loaded from: classes.dex */
final class zzs implements Runnable {
    private final /* synthetic */ Query zzaw;
    private final /* synthetic */ boolean zzaz;

    zzs(Query query, boolean z) {
        this.zzaw = query;
        this.zzaz = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaw.zzai.zza(this.zzaw.zzh(), this.zzaz);
    }
}

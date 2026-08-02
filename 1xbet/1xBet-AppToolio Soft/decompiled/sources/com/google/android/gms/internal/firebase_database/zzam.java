package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzam implements Runnable {
    private final /* synthetic */ boolean zzdt;
    final /* synthetic */ zzal zzdu;

    zzam(zzal zzalVar, boolean z) {
        this.zzdu = zzalVar;
        this.zzdt = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdu.zzbs.zza("Trying to fetch auth token", null, new Object[0]);
        zzag.zza(this.zzdu.zzdc == zzav.Disconnected, "Not in disconnected state: %s", this.zzdu.zzdc);
        this.zzdu.zzdc = zzav.GettingToken;
        zzal.zzc(this.zzdu);
        this.zzdu.zzcn.zza(this.zzdt, new zzan(this, this.zzdu.zzdo));
    }
}

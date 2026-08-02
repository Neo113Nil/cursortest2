package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zziw implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzka zzapi;
    private final /* synthetic */ zzik zzaqv;
    private final /* synthetic */ boolean zzaqy;

    zziw(zzik zzikVar, boolean z, zzka zzkaVar, zzeb zzebVar) {
        this.zzaqv = zzikVar;
        this.zzaqy = z;
        this.zzapi = zzkaVar;
        this.zzapd = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfa zzfaVar;
        zzfaVar = this.zzaqv.zzaqp;
        if (zzfaVar == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to set user attribute");
        } else {
            this.zzaqv.zza(zzfaVar, this.zzaqy ? null : this.zzapi, this.zzapd);
            this.zzaqv.zzcu();
        }
    }
}

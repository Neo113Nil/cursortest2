package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzij implements Runnable {
    private final /* synthetic */ zzih zzaqm;
    private final /* synthetic */ zzig zzaqn;

    zzij(zzih zzihVar, zzig zzigVar) {
        this.zzaqm = zzihVar;
        this.zzaqn = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaqm.zza(this.zzaqn);
        zzih zzihVar = this.zzaqm;
        zzihVar.zzaqd = null;
        zzihVar.zzga().zzb((zzig) null);
    }
}

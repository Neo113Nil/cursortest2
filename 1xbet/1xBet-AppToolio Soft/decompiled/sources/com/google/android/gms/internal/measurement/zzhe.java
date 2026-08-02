package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzhe implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ zzka zzapi;

    zzhe(zzgp zzgpVar, zzka zzkaVar, zzeb zzebVar) {
        this.zzape = zzgpVar;
        this.zzapi = zzkaVar;
        this.zzapd = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        zzjtVar2.zzb(this.zzapi, this.zzapd);
    }
}

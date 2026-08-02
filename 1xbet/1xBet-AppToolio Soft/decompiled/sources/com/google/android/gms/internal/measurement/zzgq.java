package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzgq implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;

    zzgq(zzgp zzgpVar, zzeb zzebVar) {
        this.zzape = zzgpVar;
        this.zzapd = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        zzjtVar2.zze(this.zzapd);
    }
}

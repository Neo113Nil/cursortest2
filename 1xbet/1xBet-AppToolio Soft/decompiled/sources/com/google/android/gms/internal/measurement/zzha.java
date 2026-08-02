package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzha implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ zzex zzaph;

    zzha(zzgp zzgpVar, zzex zzexVar, zzeb zzebVar) {
        this.zzape = zzgpVar;
        this.zzaph = zzexVar;
        this.zzapd = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        zzjtVar2.zzb(this.zzaph, this.zzapd);
    }
}

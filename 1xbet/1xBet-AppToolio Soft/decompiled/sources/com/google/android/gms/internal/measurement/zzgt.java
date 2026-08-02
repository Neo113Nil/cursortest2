package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzgt implements Runnable {
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ zzef zzapf;

    zzgt(zzgp zzgpVar, zzef zzefVar) {
        this.zzape = zzgpVar;
        this.zzapf = zzefVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        zzjtVar2.zzf(this.zzapf);
    }
}

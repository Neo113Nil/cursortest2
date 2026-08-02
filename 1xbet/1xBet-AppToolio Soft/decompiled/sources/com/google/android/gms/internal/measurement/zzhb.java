package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzhb implements Runnable {
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ zzex zzaph;

    zzhb(zzgp zzgpVar, zzex zzexVar, String str) {
        this.zzape = zzgpVar;
        this.zzaph = zzexVar;
        this.zzapg = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        zzjtVar2.zzc(this.zzaph, this.zzapg);
    }
}

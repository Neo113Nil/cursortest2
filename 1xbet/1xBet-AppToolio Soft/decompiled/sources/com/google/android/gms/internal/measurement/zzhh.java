package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzhh implements Runnable {
    private final /* synthetic */ String zzaem;
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ String zzapj;
    private final /* synthetic */ long zzapk;

    zzhh(zzgp zzgpVar, String str, String str2, String str3, long j) {
        this.zzape = zzgpVar;
        this.zzapj = str;
        this.zzapg = str2;
        this.zzaem = str3;
        this.zzapk = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        String str = this.zzapj;
        if (str == null) {
            zzjtVar2 = this.zzape.zzalo;
            zzjtVar2.zzlm().zzgb().zza(this.zzapg, (zzig) null);
        } else {
            zzig zzigVar = new zzig(this.zzaem, str, this.zzapk);
            zzjtVar = this.zzape.zzalo;
            zzjtVar.zzlm().zzgb().zza(this.zzapg, zzigVar);
        }
    }
}

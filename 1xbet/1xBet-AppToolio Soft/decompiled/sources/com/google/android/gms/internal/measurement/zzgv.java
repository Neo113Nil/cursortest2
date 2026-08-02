package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzgv implements Callable<List<zzkc>> {
    private final /* synthetic */ String zzadn;
    private final /* synthetic */ String zzadu;
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;

    zzgv(zzgp zzgpVar, zzeb zzebVar, String str, String str2) {
        this.zzape = zzgpVar;
        this.zzapd = zzebVar;
        this.zzadn = str;
        this.zzadu = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzkc> call() throws Exception {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        return zzjtVar2.zzjh().zzb(this.zzapd.packageName, this.zzadn, this.zzadu);
    }
}

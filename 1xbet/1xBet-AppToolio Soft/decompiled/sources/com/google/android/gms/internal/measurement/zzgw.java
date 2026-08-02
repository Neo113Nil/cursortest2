package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzgw implements Callable<List<zzkc>> {
    private final /* synthetic */ String zzadn;
    private final /* synthetic */ String zzadu;
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ String zzapg;

    zzgw(zzgp zzgpVar, String str, String str2, String str3) {
        this.zzape = zzgpVar;
        this.zzapg = str;
        this.zzadn = str2;
        this.zzadu = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzkc> call() throws Exception {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        return zzjtVar2.zzjh().zzb(this.zzapg, this.zzadn, this.zzadu);
    }
}

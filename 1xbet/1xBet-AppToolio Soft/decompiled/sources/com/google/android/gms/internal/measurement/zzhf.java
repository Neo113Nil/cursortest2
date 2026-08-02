package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzhf implements Callable<List<zzkc>> {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;

    zzhf(zzgp zzgpVar, zzeb zzebVar) {
        this.zzape = zzgpVar;
        this.zzapd = zzebVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzkc> call() throws Exception {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        return zzjtVar2.zzjh().zzbe(this.zzapd.packageName);
    }
}

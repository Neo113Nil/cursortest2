package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzgx implements Callable<List<zzef>> {
    private final /* synthetic */ String zzadn;
    private final /* synthetic */ String zzadu;
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;

    zzgx(zzgp zzgpVar, zzeb zzebVar, String str, String str2) {
        this.zzape = zzgpVar;
        this.zzapd = zzebVar;
        this.zzadn = str;
        this.zzadu = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzef> call() throws Exception {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        return zzjtVar2.zzjh().zzc(this.zzapd.packageName, this.zzadn, this.zzadu);
    }
}

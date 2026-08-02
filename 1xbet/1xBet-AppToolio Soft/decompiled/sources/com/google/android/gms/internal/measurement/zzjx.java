package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzjx implements Callable<String> {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzjt zzasn;

    zzjx(zzjt zzjtVar, zzeb zzebVar) {
        this.zzasn = zzjtVar;
        this.zzapd = zzebVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzea zzg = this.zzasn.zzgk().zzbc(this.zzapd.packageName) ? this.zzasn.zzg(this.zzapd) : this.zzasn.zzjh().zzbf(this.zzapd.packageName);
        if (zzg != null) {
            return zzg.getAppInstanceId();
        }
        this.zzasn.zzgi().zziy().log("App info was null when attempting to get app instance id");
        return null;
    }
}

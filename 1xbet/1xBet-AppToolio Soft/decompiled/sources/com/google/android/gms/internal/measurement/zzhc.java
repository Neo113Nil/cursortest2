package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzhc implements Callable<byte[]> {
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ zzex zzaph;

    zzhc(zzgp zzgpVar, zzex zzexVar, String str) {
        this.zzape = zzgpVar;
        this.zzaph = zzexVar;
        this.zzapg = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzjtVar = this.zzape.zzalo;
        zzjtVar.zzlj();
        zzjtVar2 = this.zzape.zzalo;
        return zzjtVar2.zza(this.zzaph, this.zzapg);
    }
}

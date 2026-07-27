package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhcm extends zzhca {
    private zzhcl zza;

    zzhcm(zzgxi zzgxiVar, boolean z, Executor executor, Callable callable) {
        super(zzgxiVar, z, false);
        this.zza = new zzhck(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzhcl zzhclVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final void zzi() {
        zzhcl zzhclVar = this.zza;
        if (zzhclVar != null) {
            zzhclVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    final void zzw(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    final void zzx() {
        zzhcl zzhclVar = this.zza;
        if (zzhclVar != null) {
            zzhclVar.zze();
        }
    }
}

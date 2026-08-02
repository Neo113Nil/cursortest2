package com.google.android.gms.internal.ads;

import H2.j;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzddr {
    private final zzdez zza;
    private final zzceb zzb;

    public zzddr(zzdez zzdezVar, zzceb zzcebVar) {
        this.zza = zzdezVar;
        this.zzb = zzcebVar;
    }

    public final View zza() {
        zzceb zzcebVar = this.zzb;
        if (zzcebVar == null) {
            return null;
        }
        return zzcebVar.zzG();
    }

    public final View zzb() {
        zzceb zzcebVar = this.zzb;
        if (zzcebVar != null) {
            return zzcebVar.zzG();
        }
        return null;
    }

    public final zzceb zzc() {
        return this.zzb;
    }

    public final zzdch zzd(Executor executor) {
        final zzceb zzcebVar = this.zzb;
        return new zzdch(new zzczf() { // from class: com.google.android.gms.internal.ads.zzddq
            @Override // com.google.android.gms.internal.ads.zzczf
            public final void zza() {
                j zzL;
                zzceb zzcebVar2 = zzceb.this;
                if (zzcebVar2 == null || (zzL = zzcebVar2.zzL()) == null) {
                    return;
                }
                zzL.zzb();
            }
        }, executor);
    }

    public final zzdez zze() {
        return this.zza;
    }

    public Set zzf(zzctl zzctlVar) {
        return Collections.singleton(new zzdch(zzctlVar, zzbza.zzg));
    }

    public Set zzg(zzctl zzctlVar) {
        return Collections.singleton(new zzdch(zzctlVar, zzbza.zzg));
    }
}

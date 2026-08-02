package com.google.android.gms.internal.ads;

import F2.M;
import F2.S;
import F2.U;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfij extends U {
    private final zzfip zza;

    public zzfij(zzfip zzfipVar) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.zza = zzfipVar;
    }

    @Override // F2.V
    public final zzazq zze(String str) {
        return this.zza.zza(str);
    }

    @Override // F2.V
    public final M zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // F2.V
    public final zzbvt zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // F2.V
    public final void zzh(zzboo zzbooVar) {
        this.zza.zzh(zzbooVar);
        this.zza.zzg();
    }

    @Override // F2.V
    public final void zzi(List list, S s7) {
        this.zza.zzi(list, s7);
    }

    @Override // F2.V
    public final boolean zzj(String str) {
        return this.zza.zzj(str);
    }

    @Override // F2.V
    public final boolean zzk(String str) {
        return this.zza.zzk(str);
    }

    @Override // F2.V
    public final boolean zzl(String str) {
        return this.zza.zzl(str);
    }
}

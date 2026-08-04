package com.google.android.gms.internal.ads;

import E2.e;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzbco extends zzbcp {
    private final e zza;
    private final String zzb;
    private final String zzc;

    public zzbco(e eVar, String str, String str2) {
        this.zza = eVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbcq
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcq
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbcq
    public final void zzd(p105o3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.zza.zza((View) p105o3.b.t0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbcq
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbcq
    public final void zzf() {
        this.zza.zzc();
    }
}

package com.google.android.gms.internal.ads;

import E2.e;
import android.view.View;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
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
    public final void zzd(InterfaceC1506a interfaceC1506a) {
        if (interfaceC1506a == null) {
            return;
        }
        this.zza.zza((View) BinderC1507b.t0(interfaceC1506a));
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

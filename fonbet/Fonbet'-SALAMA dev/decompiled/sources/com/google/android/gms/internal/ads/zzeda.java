package com.google.android.gms.internal.ads;

import android.view.View;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
final class zzeda extends zzbqa {
    final /* synthetic */ zzedc zza;
    private final zzebu zzb;

    public /* synthetic */ zzeda(zzedc zzedcVar, zzebu zzebuVar, zzedb zzedbVar) {
        this.zza = zzedcVar;
        this.zzb = zzebuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zze(String str) {
        ((zzedi) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzedi) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzg(InterfaceC1506a interfaceC1506a) {
        this.zza.zzc = (View) BinderC1507b.t0(interfaceC1506a);
        ((zzedi) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzh(zzbox zzboxVar) {
        this.zza.zzd = zzboxVar;
        ((zzedi) this.zzb.zzc).zzo();
    }
}

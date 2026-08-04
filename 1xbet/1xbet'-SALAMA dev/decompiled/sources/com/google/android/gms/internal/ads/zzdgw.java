package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzdgw implements zzgay {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdgx zzb;

    public zzdgw(zzdgx zzdgxVar, View view) {
        this.zza = view;
        this.zzb = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfs)).booleanValue()) {
            o.f1952C.f1961g.zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzad(this.zza, (zzebm) obj);
    }
}

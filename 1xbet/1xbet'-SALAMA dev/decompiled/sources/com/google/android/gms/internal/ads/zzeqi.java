package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
public final class zzeqi implements zzesg {
    public final zzfae zza;

    public zzeqi(zzfae zzfaeVar) {
        this.zza = zzfaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        if (this.zza != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlU)).booleanValue()) {
                return;
            }
            zzctsVar.zza.putBoolean("render_in_browser", this.zza.zzd());
            zzctsVar.zza.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}

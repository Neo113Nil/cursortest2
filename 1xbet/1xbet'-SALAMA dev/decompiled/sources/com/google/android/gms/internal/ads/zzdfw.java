package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzdfw implements zzbiz {
    private final WeakReference zza;
    private final WeakReference zzb;

    public zzdfw(zzdfy zzdfyVar, View view, zzdfx zzdfxVar) {
        this.zza = new WeakReference(zzdfyVar);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmP)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzdfy zzdfyVar = (zzdfy) this.zza.get();
        if (zzdfyVar == null) {
            return;
        }
        zzdfyVar.zzg.zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmP)).booleanValue()) {
            zzdfyVar.zzD.zza((View) this.zzb.get(), zzdfyVar.zzj);
        }
    }
}

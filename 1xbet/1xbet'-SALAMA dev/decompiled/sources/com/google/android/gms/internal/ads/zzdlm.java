package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzdlm implements zzbex {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdln zzb;

    public zzdlm(zzdln zzdlnVar, String str) {
        this.zzb = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzc() {
        zzdln zzdlnVar = this.zzb;
        if (zzdlnVar.zzd != null) {
            zzdlnVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzd(MotionEvent motionEvent) {
    }
}

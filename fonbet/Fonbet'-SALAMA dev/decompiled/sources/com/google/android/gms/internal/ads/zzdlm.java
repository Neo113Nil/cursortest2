package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes.dex */
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
        zzdgx zzdgxVar;
        zzdgx zzdgxVar2;
        zzdln zzdlnVar = this.zzb;
        zzdgxVar = zzdlnVar.zzd;
        if (zzdgxVar != null) {
            String str = this.zza;
            zzdgxVar2 = zzdlnVar.zzd;
            zzdgxVar2.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzd(MotionEvent motionEvent) {
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdqp implements com.google.android.gms.internal.ads.zzblr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdrq zza;
    final /* synthetic */ android.view.ViewGroup zzb;

    zzdqp(com.google.android.gms.internal.ads.zzdrq zzdrqVar, android.view.ViewGroup viewGroup) {
        this.zza = zzdrqVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zza() {
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = com.google.android.gms.internal.ads.zzdqo.zza;
        com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zza;
        java.util.Map zzj = zzdrqVar.zzj();
        if (zzj == null) {
            return;
        }
        int size = zzgwmVar.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = zzj.get((java.lang.String) zzgwmVar.get(i));
            i++;
            if (obj != null) {
                zzdrqVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzb(android.view.MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final org.json.JSONObject zzc() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final org.json.JSONObject zzd() {
        return this.zza.zzp();
    }
}

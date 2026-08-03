package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzegk implements com.google.android.gms.internal.ads.zzdfx {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcdz zzb;

    zzegk(android.content.Context context, com.google.android.gms.internal.ads.zzcdz zzcdzVar) {
        this.zza = context;
        this.zzb = zzcdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        java.lang.String str = zzfkqVar.zzb.zzb.zze;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzcdz zzcdzVar = this.zzb;
        android.content.Context context = this.zza;
        zzcdzVar.zzc(context, zzfkqVar.zza.zza.zzd);
        zzcdzVar.zzm(context, str);
    }
}

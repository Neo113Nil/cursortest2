package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbos implements com.google.android.gms.internal.ads.zzbpq {
    zzbos() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        try {
            com.google.android.gms.internal.ads.zzgck.zzh(zzckuVar.getContext()).zzk();
            com.google.android.gms.internal.ads.zzgcl.zzh(zzckuVar.getContext()).zzj();
            com.google.android.gms.internal.ads.zzgcm.zza(zzckuVar.getContext()).zzb(null);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}

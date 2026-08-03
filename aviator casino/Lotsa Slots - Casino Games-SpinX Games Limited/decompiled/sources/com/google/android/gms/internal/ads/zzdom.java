package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdom implements com.google.android.gms.internal.ads.zzbpq {
    private final java.lang.ref.WeakReference zza;
    private final com.google.android.gms.internal.ads.zzfsc zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final com.google.android.gms.internal.ads.zzfqg zzd;

    /* synthetic */ zzdom(com.google.android.gms.internal.ads.zzdon zzdonVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, byte[] bArr) {
        this.zza = new java.lang.ref.WeakReference(zzdonVar);
        this.zzb = zzfscVar;
        this.zzc = zzvVar;
        this.zzd = zzfqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzdon zzdonVar = (com.google.android.gms.internal.ads.zzdon) this.zza.get();
        java.lang.String str = (java.lang.String) map.get("u");
        if (zzdonVar == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdonVar.zzF());
    }
}

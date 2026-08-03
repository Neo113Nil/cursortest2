package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdol implements com.google.android.gms.internal.ads.zzbpq {
    private final java.lang.ref.WeakReference zza;
    private final java.lang.ref.WeakReference zzb;

    /* synthetic */ zzdol(com.google.android.gms.internal.ads.zzdon zzdonVar, android.view.View view, byte[] bArr) {
        this.zza = new java.lang.ref.WeakReference(zzdonVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzot)).booleanValue()) {
            this.zzb = new java.lang.ref.WeakReference(view);
        } else {
            this.zzb = new java.lang.ref.WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzdon zzdonVar = (com.google.android.gms.internal.ads.zzdon) this.zza.get();
        if (zzdonVar == null) {
            return;
        }
        zzdonVar.zzC().zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzot)).booleanValue()) {
            zzdonVar.zzB((android.view.View) this.zzb.get());
        }
    }
}

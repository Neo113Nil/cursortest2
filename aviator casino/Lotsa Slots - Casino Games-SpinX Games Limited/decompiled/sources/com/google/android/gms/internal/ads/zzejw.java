package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzejw extends com.google.android.gms.internal.ads.zzeks {
    private android.app.Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;

    zzejw() {
    }

    @Override // com.google.android.gms.internal.ads.zzeks
    public final com.google.android.gms.internal.ads.zzeks zza(android.app.Activity activity) {
        if (activity == null) {
            throw new java.lang.NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeks
    public final com.google.android.gms.internal.ads.zzeks zzb(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeks
    public final com.google.android.gms.internal.ads.zzeks zzc(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeks
    public final com.google.android.gms.internal.ads.zzeks zzd(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeks
    public final com.google.android.gms.internal.ads.zzekt zze() {
        android.app.Activity activity = this.zza;
        if (activity != null) {
            return new com.google.android.gms.internal.ads.zzejx(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: activity");
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqv extends com.google.android.gms.internal.ads.zzgrx {
    private java.lang.String zza;
    private java.lang.String zzb;

    zzgqv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final com.google.android.gms.internal.ads.zzgrx zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final com.google.android.gms.internal.ads.zzgrx zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final com.google.android.gms.internal.ads.zzgry zzc() {
        return new com.google.android.gms.internal.ads.zzgqw(this.zza, this.zzb, null);
    }
}

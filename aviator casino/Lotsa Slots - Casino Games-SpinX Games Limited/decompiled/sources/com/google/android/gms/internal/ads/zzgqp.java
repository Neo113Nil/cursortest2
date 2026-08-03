package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqp extends com.google.android.gms.internal.ads.zzgqx {
    private java.lang.String zza;
    private java.lang.String zzb;

    zzgqp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final com.google.android.gms.internal.ads.zzgqx zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final com.google.android.gms.internal.ads.zzgqx zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final com.google.android.gms.internal.ads.zzgqy zzc() {
        return new com.google.android.gms.internal.ads.zzgqq(this.zza, this.zzb, null);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqt extends com.google.android.gms.internal.ads.zzgru {
    private int zza;
    private java.lang.String zzb;
    private int zzc;
    private byte zzd;

    zzgqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final com.google.android.gms.internal.ads.zzgru zza(int i) {
        this.zza = i;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final com.google.android.gms.internal.ads.zzgru zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final com.google.android.gms.internal.ads.zzgru zzc(int i) {
        this.zzc = i;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final com.google.android.gms.internal.ads.zzgrv zzd() {
        if (this.zzd == 3) {
            return new com.google.android.gms.internal.ads.zzgqu(this.zza, this.zzb, this.zzc, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

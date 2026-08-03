package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfzi extends com.google.android.gms.internal.ads.zzfzo {
    private java.lang.String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfzi() {
    }

    public final com.google.android.gms.internal.ads.zzfzo zza(java.lang.String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final com.google.android.gms.internal.ads.zzfzo zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final com.google.android.gms.internal.ads.zzfzo zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final com.google.android.gms.internal.ads.zzfzo zze(int i) {
        this.zzd = 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final com.google.android.gms.internal.ads.zzfzp zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new com.google.android.gms.internal.ads.zzfzj(this.zza, false, this.zzc, null, this.zzd, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

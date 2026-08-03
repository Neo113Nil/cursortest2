package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcbm extends com.google.android.gms.internal.ads.zzcbo {
    private final java.lang.String zza;
    private final int zzb;

    public zzcbm(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzcbm)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzcbm zzcbmVar = (com.google.android.gms.internal.ads.zzcbm) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzcbmVar.zza)) {
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzcbmVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgrt extends zzgsu {
    private int zza;
    private String zzb;
    private int zzc;
    private Boolean zzd;
    private byte zze;

    zzgrt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zza(int i) {
        this.zza = i;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzc(int i) {
        this.zzc = i;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzd(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsv zze() {
        if (this.zze == 3) {
            return new zzgru(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zze & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

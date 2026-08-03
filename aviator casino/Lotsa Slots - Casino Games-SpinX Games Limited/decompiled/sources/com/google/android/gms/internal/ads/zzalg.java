package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzalg implements com.google.android.gms.internal.ads.zzald {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzet zzc;

    public zzalg(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        com.google.android.gms.internal.ads.zzet zzetVar = zzfyVar.zza;
        this.zzc = zzetVar;
        zzetVar.zzh(12);
        int zzH = zzetVar.zzH();
        if ("audio/raw".equals(zzvVar.zzp)) {
            int zzG = com.google.android.gms.internal.ads.zzfl.zzG(zzvVar.zzJ) * zzvVar.zzH;
            if (zzH % zzG != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzG).length() + 66 + java.lang.String.valueOf(zzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(zzG);
                sb.append(", stsz sample size: ");
                sb.append(zzH);
                com.google.android.gms.internal.ads.zzeg.zzc("BoxParsers", sb.toString());
                zzH = zzG;
            }
        }
        this.zza = zzH == 0 ? -1 : zzH;
        this.zzb = zzetVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}

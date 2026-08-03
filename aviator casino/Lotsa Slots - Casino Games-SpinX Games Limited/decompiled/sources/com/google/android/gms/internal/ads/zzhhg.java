package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhhg extends com.google.android.gms.internal.ads.zzheu {
    private final com.google.android.gms.internal.ads.zzhhf zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzhhe zzc;
    private final com.google.android.gms.internal.ads.zzheu zzd;

    /* synthetic */ zzhhg(com.google.android.gms.internal.ads.zzhhf zzhhfVar, java.lang.String str, com.google.android.gms.internal.ads.zzhhe zzhheVar, com.google.android.gms.internal.ads.zzheu zzheuVar, byte[] bArr) {
        this.zza = zzhhfVar;
        this.zzb = str;
        this.zzc = zzhheVar;
        this.zzd = zzheuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhhg)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhhg zzhhgVar = (com.google.android.gms.internal.ads.zzhhg) obj;
        return zzhhgVar.zzc.equals(this.zzc) && zzhhgVar.zzd.equals(this.zzd) && zzhhgVar.zzb.equals(this.zzb) && zzhhgVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhhg.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzhhf zzhhfVar = this.zza;
        com.google.android.gms.internal.ads.zzheu zzheuVar = this.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzheuVar);
        java.lang.String valueOf3 = java.lang.String.valueOf(zzhhfVar);
        java.lang.String str = this.zzb;
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(valueOf).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 64 + length2 + 27 + java.lang.String.valueOf(valueOf2).length() + 11 + java.lang.String.valueOf(valueOf3).length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(valueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(valueOf2);
        sb.append(", variant: ");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzhhf.zzb;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhhf zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzheu zzd() {
        return this.zzd;
    }
}

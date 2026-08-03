package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzbu extends com.google.android.gms.internal.measurement.zzca {
    private final java.lang.String zzc;
    private final int zzd;
    private final int zze;

    /* synthetic */ zzbu(java.lang.String str, boolean z, int i, com.google.android.gms.internal.measurement.zzbr zzbrVar, com.google.android.gms.internal.measurement.zzbs zzbsVar, int i2, byte[] bArr) {
        this.zzc = str;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzca) {
            com.google.android.gms.internal.measurement.zzca zzcaVar = (com.google.android.gms.internal.measurement.zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i = this.zzd;
                int zze = zzcaVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == zze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i2 = this.zze;
                    int zzf = zzcaVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() ^ 1000003;
        int i = this.zzd;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zze != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final java.lang.String toString() {
        int i = this.zzd;
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        java.lang.String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zze == 1) {
            str = "READ_AND_WRITE";
        }
        java.lang.String str3 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 73 + str2.length() + 91 + str.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str2);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final java.lang.String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final com.google.android.gms.internal.measurement.zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final com.google.android.gms.internal.measurement.zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}

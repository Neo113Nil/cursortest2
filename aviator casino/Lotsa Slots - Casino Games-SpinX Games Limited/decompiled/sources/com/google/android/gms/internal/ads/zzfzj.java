package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfzj extends com.google.android.gms.internal.ads.zzfzp {
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfzj(java.lang.String str, boolean z, int i, com.google.android.gms.internal.ads.zzfzh zzfzhVar, int i2, byte[] bArr) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfzp) {
            com.google.android.gms.internal.ads.zzfzp zzfzpVar = (com.google.android.gms.internal.ads.zzfzp) obj;
            if (this.zzb.equals(zzfzpVar.zza())) {
                zzfzpVar.zzb();
                int i = this.zzc;
                int zzd = zzfzpVar.zzd();
                if (i == 0) {
                    throw null;
                }
                if (i == zzd) {
                    zzfzpVar.zzc();
                    int i2 = this.zzd;
                    int zze = zzfzpVar.zze();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (zze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i2 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final java.lang.String toString() {
        int i = this.zzc;
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        java.lang.String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        java.lang.String str3 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 73 + str2.length() + 52 + str.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str2);
        sb.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final java.lang.String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final com.google.android.gms.internal.ads.zzfzh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final int zze() {
        return this.zzd;
    }
}

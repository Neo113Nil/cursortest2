package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgal extends zzgar {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzgal(String str, boolean z, int i, zzgaj zzgajVar, int i2, byte[] bArr) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgar) {
            zzgar zzgarVar = (zzgar) obj;
            if (this.zzb.equals(zzgarVar.zza())) {
                zzgarVar.zzb();
                int i = this.zzc;
                int zzd = zzgarVar.zzd();
                if (i == 0) {
                    throw null;
                }
                if (i == zzd) {
                    zzgarVar.zzc();
                    int i2 = this.zzd;
                    int zze = zzgarVar.zze();
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

    public final String toString() {
        int i = this.zzc;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 52 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgaj zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zze() {
        return this.zzd;
    }
}

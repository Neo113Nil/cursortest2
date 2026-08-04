package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzfol extends zzfos {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfol(String str, boolean z4, int i7, zzfoh zzfohVar, zzfoi zzfoiVar, int i8, zzfok zzfokVar) {
        this.zzb = str;
        this.zzc = i7;
        this.zzd = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfos) {
            zzfos zzfosVar = (zzfos) obj;
            if (this.zzb.equals(zzfosVar.zzc())) {
                zzfosVar.zzd();
                int i7 = this.zzc;
                int iZze = zzfosVar.zze();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == iZze) {
                    zzfosVar.zza();
                    zzfosVar.zzb();
                    int i8 = this.zzd;
                    int iZzf = zzfosVar.zzf();
                    if (i8 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i7 = this.zzc;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.zzd != 0) {
            return (i8 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i7 = this.zzc;
        if (i7 == 1) {
            str = "ALL_CHECKS";
        } else if (i7 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i7 != 3) {
            str = i7 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        return k.i(k.l("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), this.zzd == 1 ? "READ_AND_WRITE" : "null", "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final zzfoh zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final zzfoi zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final int zzf() {
        return this.zzd;
    }
}

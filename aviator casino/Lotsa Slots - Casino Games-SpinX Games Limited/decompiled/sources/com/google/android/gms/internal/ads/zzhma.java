package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhma extends com.google.android.gms.internal.ads.zzheh {
    private final com.google.android.gms.internal.ads.zzhnn zza;

    public zzhma(com.google.android.gms.internal.ads.zzhnn zzhnnVar) {
        this.zza = zzhnnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhma)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhnn zzhnnVar = ((com.google.android.gms.internal.ads.zzhma) obj).zza;
        com.google.android.gms.internal.ads.zzhnn zzhnnVar2 = this.zza;
        return zzhnnVar2.zzc().zzc().equals(zzhnnVar.zzc().zzc()) && zzhnnVar2.zzc().zza().equals(zzhnnVar.zzc().zza()) && zzhnnVar2.zzc().zzb().equals(zzhnnVar.zzc().zzb());
    }

    public final int hashCode() {
        com.google.android.gms.internal.ads.zzhnn zzhnnVar = this.zza;
        return java.util.Objects.hash(zzhnnVar.zzc(), zzhnnVar.zzf());
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.google.android.gms.internal.ads.zzhnn zzhnnVar = this.zza;
        objArr[0] = zzhnnVar.zzc().zza();
        int ordinal = zzhnnVar.zzc().zzc().ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza.zzc().zzc() != com.google.android.gms.internal.ads.zzhtm.RAW;
    }

    public final com.google.android.gms.internal.ads.zzhnn zzb() {
        return this.zza;
    }
}

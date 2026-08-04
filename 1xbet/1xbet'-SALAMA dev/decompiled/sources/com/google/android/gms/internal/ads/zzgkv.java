package com.google.android.gms.internal.ads;

import java.util.Objects;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzgkv extends zzgdf {
    private final zzgmx zza;

    public zzgkv(zzgmx zzgmxVar) {
        this.zza = zzgmxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkv)) {
            return false;
        }
        zzgmx zzgmxVar = ((zzgkv) obj).zza;
        return this.zza.zzc().zzg().equals(zzgmxVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgmxVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgmxVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgmx zzgmxVar = this.zza;
        return Objects.hash(zzgmxVar.zzc(), zzgmxVar.zzd());
    }

    public final String toString() {
        String str;
        String strZzi = this.zza.zzc().zzi();
        int iOrdinal = this.zza.zzc().zzg().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return L.j("(typeUrl=", strZzi, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgte.RAW;
    }

    public final zzgmx zzb() {
        return this.zza;
    }
}

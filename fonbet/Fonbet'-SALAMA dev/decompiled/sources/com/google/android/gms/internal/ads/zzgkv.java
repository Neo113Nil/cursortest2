package com.google.android.gms.internal.ads;

import java.util.Objects;
import w1.L;

/* loaded from: classes.dex */
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
        String zzi = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        return L.j("(typeUrl=", zzi, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgte.RAW;
    }

    public final zzgmx zzb() {
        return this.zza;
    }
}

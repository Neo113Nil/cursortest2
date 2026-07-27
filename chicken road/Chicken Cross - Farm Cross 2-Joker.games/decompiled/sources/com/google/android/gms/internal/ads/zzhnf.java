package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhnf extends zzhfj {
    private final zzhot zza;

    public zzhnf(zzhot zzhotVar) {
        this.zza = zzhotVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnf)) {
            return false;
        }
        zzhot zzhotVar = ((zzhnf) obj).zza;
        zzhot zzhotVar2 = this.zza;
        return zzhotVar2.zzc().zzk() == zzhotVar.zzc().zzk() && zzhotVar2.zzc().zza().equals(zzhotVar.zzc().zza()) && zzhotVar2.zzc().zzb().equals(zzhotVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhot zzhotVar = this.zza;
        return Objects.hash(zzhotVar.zzc(), zzhotVar.zzf());
    }

    public final String toString() {
        zzhot zzhotVar = this.zza;
        String zza = zzhotVar.zzc().zza();
        int zzk = zzhotVar.zzc().zzk() - 2;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zza, zzk != 1 ? zzk != 2 ? zzk != 3 ? zzk != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza.zzc().zzk() != 5;
    }

    public final zzhot zzb() {
        return this.zza;
    }
}

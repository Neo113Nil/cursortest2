package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzggv extends zzgdx {
    private final zzggt zza;
    private final String zzb;
    private final zzggs zzc;
    private final zzgdx zzd;

    public /* synthetic */ zzggv(zzggt zzggtVar, String str, zzggs zzggsVar, zzgdx zzgdxVar, zzggu zzgguVar) {
        this.zza = zzggtVar;
        this.zzb = str;
        this.zzc = zzggsVar;
        this.zzd = zzgdxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggv)) {
            return false;
        }
        zzggv zzggvVar = (zzggv) obj;
        return zzggvVar.zzc.equals(this.zzc) && zzggvVar.zzd.equals(this.zzd) && zzggvVar.zzb.equals(this.zzb) && zzggvVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzggv.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzggt zzggtVar = this.zza;
        zzgdx zzgdxVar = this.zzd;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(zzgdxVar) + ", variant: " + String.valueOf(zzggtVar) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zza != zzggt.zzb;
    }

    public final zzgdx zzb() {
        return this.zzd;
    }

    public final zzggt zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}

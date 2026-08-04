package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzggk extends zzgdx {
    private final String zza;
    private final zzggj zzb;

    private zzggk(String str, zzggj zzggjVar) {
        this.zza = str;
        this.zzb = zzggjVar;
    }

    public static zzggk zzc(String str, zzggj zzggjVar) {
        return new zzggk(str, zzggjVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggk)) {
            return false;
        }
        zzggk zzggkVar = (zzggk) obj;
        return zzggkVar.zza.equals(this.zza) && zzggkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzggk.class, this.zza, this.zzb);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + this.zzb.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzb != zzggj.zzb;
    }

    public final zzggj zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}

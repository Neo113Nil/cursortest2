package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgnt extends zzgon {
    private final int zza;
    private final int zzb;
    private final zzgnr zzc;

    public /* synthetic */ zzgnt(int i7, int i8, zzgnr zzgnrVar, zzgns zzgnsVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = zzgnrVar;
    }

    public static zzgnq zze() {
        return new zzgnq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnt)) {
            return false;
        }
        zzgnt zzgntVar = (zzgnt) obj;
        return zzgntVar.zza == this.zza && zzgntVar.zzd() == zzd() && zzgntVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgnt.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder k7 = k.k("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        k7.append(this.zzb);
        k7.append("-byte tags, and ");
        return k.g(k7, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzc != zzgnr.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgnr zzgnrVar = this.zzc;
        if (zzgnrVar == zzgnr.zzd) {
            return this.zzb;
        }
        if (zzgnrVar == zzgnr.zza || zzgnrVar == zzgnr.zzb || zzgnrVar == zzgnr.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgnr zzf() {
        return this.zzc;
    }
}

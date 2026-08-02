package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgok extends zzgon {
    private final int zza;
    private final int zzb;
    private final zzgoi zzc;
    private final zzgoh zzd;

    public /* synthetic */ zzgok(int i7, int i8, zzgoi zzgoiVar, zzgoh zzgohVar, zzgoj zzgojVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = zzgoiVar;
        this.zzd = zzgohVar;
    }

    public static zzgog zze() {
        return new zzgog(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgok)) {
            return false;
        }
        zzgok zzgokVar = (zzgok) obj;
        return zzgokVar.zza == this.zza && zzgokVar.zzd() == zzd() && zzgokVar.zzc == this.zzc && zzgokVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgok.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder l7 = k.l("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        l7.append(this.zzb);
        l7.append("-byte tags, and ");
        return k.g(l7, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzc != zzgoi.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgoi zzgoiVar = this.zzc;
        if (zzgoiVar == zzgoi.zzd) {
            return this.zzb;
        }
        if (zzgoiVar == zzgoi.zza || zzgoiVar == zzgoi.zzb || zzgoiVar == zzgoi.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgoh zzf() {
        return this.zzd;
    }

    public final zzgoi zzg() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgga extends zzgdx {
    private final zzgfz zza;

    private zzgga(zzgfz zzgfzVar) {
        this.zza = zzgfzVar;
    }

    public static zzgga zzc(zzgfz zzgfzVar) {
        return new zzgga(zzgfzVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgga) && ((zzgga) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgga.class, this.zza);
    }

    public final String toString() {
        return AbstractC0486a1.h("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zza != zzgfz.zzc;
    }

    public final zzgfz zzb() {
        return this.zza;
    }
}

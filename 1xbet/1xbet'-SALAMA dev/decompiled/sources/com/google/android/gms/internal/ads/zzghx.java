package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzghx extends zzgdx {
    private final zzghw zza;

    private zzghx(zzghw zzghwVar) {
        this.zza = zzghwVar;
    }

    public static zzghx zzc(zzghw zzghwVar) {
        return new zzghx(zzghwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzghx) && ((zzghx) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzghx.class, this.zza);
    }

    public final String toString() {
        return AbstractC0486a1.h("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zza != zzghw.zzc;
    }

    public final zzghw zzb() {
        return this.zza;
    }
}

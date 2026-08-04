package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzghq extends zzgdx {
    private final zzghp zza;
    private final int zzb;

    private zzghq(zzghp zzghpVar, int i7) {
        this.zza = zzghpVar;
        this.zzb = i7;
    }

    public static zzghq zzd(zzghp zzghpVar, int i7) throws GeneralSecurityException {
        if (i7 < 8 || i7 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzghq(zzghpVar, i7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghq)) {
            return false;
        }
        zzghq zzghqVar = (zzghq) obj;
        return zzghqVar.zza == this.zza && zzghqVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzghq.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return k.g(k.k("X-AES-GCM Parameters (variant: ", this.zza.toString(), "salt_size_bytes: "), this.zzb, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zza != zzghp.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzghp zzc() {
        return this.zza;
    }
}

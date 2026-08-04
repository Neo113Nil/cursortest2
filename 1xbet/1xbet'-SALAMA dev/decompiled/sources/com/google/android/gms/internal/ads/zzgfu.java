package com.google.android.gms.internal.ads;

import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgfu extends zzgdx {
    private final int zza;
    private final zzgfs zzb;

    public /* synthetic */ zzgfu(int i7, zzgfs zzgfsVar, zzgft zzgftVar) {
        this.zza = i7;
        this.zzb = zzgfsVar;
    }

    public static zzgfr zzc() {
        return new zzgfr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfu)) {
            return false;
        }
        zzgfu zzgfuVar = (zzgfu) obj;
        return zzgfuVar.zza == this.zza && zzgfuVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgfu.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return k.g(k.k("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzb != zzgfs.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgfs zzd() {
        return this.zzb;
    }
}

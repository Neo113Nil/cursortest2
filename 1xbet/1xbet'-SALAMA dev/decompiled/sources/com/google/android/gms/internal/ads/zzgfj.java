package com.google.android.gms.internal.ads;

import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgfj extends zzgdx {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgfh zzd;

    public /* synthetic */ zzgfj(int i7, int i8, int i9, zzgfh zzgfhVar, zzgfi zzgfiVar) {
        this.zza = i7;
        this.zzd = zzgfhVar;
    }

    public static zzgfg zzc() {
        return new zzgfg(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfj)) {
            return false;
        }
        zzgfj zzgfjVar = (zzgfj) obj;
        return zzgfjVar.zza == this.zza && zzgfjVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgfj.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return k.g(k.k("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzd != zzgfh.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgfh zzd() {
        return this.zzd;
    }
}

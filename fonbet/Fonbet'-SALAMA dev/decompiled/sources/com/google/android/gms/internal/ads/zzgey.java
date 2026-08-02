package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgey extends zzgdx {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgew zzd;

    public /* synthetic */ zzgey(int i7, int i8, int i9, zzgew zzgewVar, zzgex zzgexVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzd = zzgewVar;
    }

    public static zzgev zzd() {
        return new zzgev(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgey)) {
            return false;
        }
        zzgey zzgeyVar = (zzgey) obj;
        return zzgeyVar.zza == this.zza && zzgeyVar.zzb == this.zzb && zzgeyVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgey.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder k7 = k.k("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        k7.append(this.zzb);
        k7.append("-byte IV, 16-byte tag, and ");
        return k.g(k7, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzd != zzgew.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgew zze() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgnc {
    private final Class zza;
    private final zzgvd zzb;

    public /* synthetic */ zzgnc(Class cls, zzgvd zzgvdVar, zzgne zzgneVar) {
        this.zza = cls;
        this.zzb = zzgvdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnc)) {
            return false;
        }
        zzgnc zzgncVar = (zzgnc) obj;
        return zzgncVar.zza.equals(this.zza) && zzgncVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return k.f(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}

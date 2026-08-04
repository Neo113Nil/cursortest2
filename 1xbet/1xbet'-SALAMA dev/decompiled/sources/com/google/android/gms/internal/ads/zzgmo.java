package com.google.android.gms.internal.ads;

import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzgmo {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgmo(Class cls, Class cls2, zzgmp zzgmpVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmo)) {
            return false;
        }
        zzgmo zzgmoVar = (zzgmo) obj;
        return zzgmoVar.zza.equals(this.zza) && zzgmoVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return k.f(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}

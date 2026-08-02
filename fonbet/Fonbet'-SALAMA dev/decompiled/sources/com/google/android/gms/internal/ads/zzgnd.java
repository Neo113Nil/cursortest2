package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgnd {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgnd(Class cls, Class cls2, zzgne zzgneVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnd)) {
            return false;
        }
        zzgnd zzgndVar = (zzgnd) obj;
        return zzgndVar.zza.equals(this.zza) && zzgndVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return k.f(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}

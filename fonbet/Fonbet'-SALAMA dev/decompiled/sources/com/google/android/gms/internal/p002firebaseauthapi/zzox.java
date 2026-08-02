package com.google.android.gms.internal.p002firebaseauthapi;

import e1.k;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzox {
    private final Class<?> zza;
    private final Class<?> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzox)) {
            return false;
        }
        zzox zzoxVar = (zzox) obj;
        return zzoxVar.zza.equals(this.zza) && zzoxVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return k.f(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }

    private zzox(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzei extends zzcw {
    private final zza zza;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzei(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzei zza(zza zzaVar) {
        return new zzei(zzaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzei) && ((zzei) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzei.class, this.zza);
    }

    public final String toString() {
        return AbstractC0486a1.h("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    public final zza zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}

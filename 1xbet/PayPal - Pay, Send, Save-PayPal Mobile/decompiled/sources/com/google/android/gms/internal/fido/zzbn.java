package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzbn extends com.google.android.gms.internal.fido.zzbl {
    private final java.lang.Object zza;

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.fido.zzbn) {
            return this.zza.equals(((com.google.android.gms.internal.fido.zzbn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final java.lang.Object zza() {
        return this.zza;
    }

    zzbn(java.lang.Object obj) {
        this.zza = obj;
    }
}

package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzaz extends com.google.android.gms.internal.fido.zzbl {
    static final com.google.android.gms.internal.fido.zzaz zza = new com.google.android.gms.internal.fido.zzaz();

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final java.lang.Object zza() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return false;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    private zzaz() {
    }
}

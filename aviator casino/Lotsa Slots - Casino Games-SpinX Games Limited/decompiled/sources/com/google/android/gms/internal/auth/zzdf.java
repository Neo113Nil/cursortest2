package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzdf extends com.google.android.gms.internal.auth.zzdh {
    static final com.google.android.gms.internal.auth.zzdf zza = new com.google.android.gms.internal.auth.zzdf();

    private zzdf() {
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final java.lang.Object zza() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return false;
    }
}

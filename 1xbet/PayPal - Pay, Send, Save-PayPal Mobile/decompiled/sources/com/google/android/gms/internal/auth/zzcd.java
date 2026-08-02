package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzcd extends com.google.android.gms.internal.auth.zzda {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.auth.zzdj zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.auth.zzda)) {
            return false;
        }
        com.google.android.gms.internal.auth.zzda zzdaVar = (com.google.android.gms.internal.auth.zzda) obj;
        return this.zza.equals(zzdaVar.zza()) && this.zzb.equals(zzdaVar.zzb());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + this.zzb.toString() + "}";
    }

    @Override // com.google.android.gms.internal.auth.zzda
    @javax.annotation.Nullable
    final com.google.android.gms.internal.auth.zzdj zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final android.content.Context zza() {
        return this.zza;
    }

    zzcd(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.auth.zzdj zzdjVar) {
        this.zza = context;
        this.zzb = zzdjVar;
    }
}

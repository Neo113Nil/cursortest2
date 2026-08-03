package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzcd extends com.google.android.gms.internal.auth.zzda {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.auth.zzdj zzb;

    zzcd(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.auth.zzdj zzdjVar) {
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzda) {
            com.google.android.gms.internal.auth.zzda zzdaVar = (com.google.android.gms.internal.auth.zzda) obj;
            if (this.zza.equals(zzdaVar.zza()) && this.zzb.equals(zzdaVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + this.zzb.toString() + "}";
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final android.content.Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    @javax.annotation.Nullable
    final com.google.android.gms.internal.auth.zzdj zzb() {
        return this.zzb;
    }
}

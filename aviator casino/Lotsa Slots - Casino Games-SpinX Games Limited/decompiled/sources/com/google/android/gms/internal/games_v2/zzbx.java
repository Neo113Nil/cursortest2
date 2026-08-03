package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzbx {
    private final java.lang.String zza;
    private final com.google.android.gms.common.api.Status zzb;

    private zzbx(com.google.android.gms.common.api.Status status, java.lang.String str) {
        this.zzb = status;
        this.zza = str;
    }

    public static com.google.android.gms.internal.games_v2.zzbx zzb(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!status.isSuccess());
        return new com.google.android.gms.internal.games_v2.zzbx(status, null);
    }

    public static com.google.android.gms.internal.games_v2.zzbx zzc(java.lang.String str) {
        return new com.google.android.gms.internal.games_v2.zzbx(com.google.android.gms.common.api.Status.RESULT_SUCCESS, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.games_v2.zzbx)) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzbx zzbxVar = (com.google.android.gms.internal.games_v2.zzbx) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbxVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zza, zzbxVar.zza);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzb).add("gameRunToken", this.zza).toString();
    }

    public final android.app.PendingIntent zza() {
        return this.zzb.getResolution();
    }

    public final java.lang.String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzb.isSuccess();
    }
}

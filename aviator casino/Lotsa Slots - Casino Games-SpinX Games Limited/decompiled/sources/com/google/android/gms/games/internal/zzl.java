package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzl {
    public static final com.google.android.gms.games.internal.zzl zza = new com.google.android.gms.games.internal.zzl(new com.google.android.gms.games.internal.zzj(null));
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    private zzl(com.google.android.gms.games.internal.zzj zzjVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzjVar.zza;
        this.zzb = z;
        z2 = zzjVar.zzb;
        this.zzc = z2;
        z3 = zzjVar.zzc;
        this.zzd = z3;
    }

    public static com.google.android.gms.games.internal.zzj zza() {
        return new com.google.android.gms.games.internal.zzj(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.games.internal.zzl zzlVar = (com.google.android.gms.games.internal.zzl) obj;
            if (this.zzb == zzlVar.zzb && this.zzc == zzlVar.zzc && this.zzd == zzlVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb ? 1 : 0) * 31) + (this.zzc ? 1 : 0)) * 31) + (this.zzd ? 1 : 0);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}

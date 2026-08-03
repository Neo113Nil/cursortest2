package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class RecallAccess {
    private final java.lang.String zza;

    private RecallAccess(java.lang.String str) {
        this.zza = str;
    }

    public static com.google.android.gms.games.RecallAccess zza(com.google.android.gms.internal.games_v2.zzau zzauVar) {
        return new com.google.android.gms.games.RecallAccess(zzauVar.zza());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.games.RecallAccess) {
            return java.util.Objects.equals(this.zza, ((com.google.android.gms.games.RecallAccess) obj).zza);
        }
        return false;
    }

    public java.lang.String getSessionId() {
        return this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza);
    }
}

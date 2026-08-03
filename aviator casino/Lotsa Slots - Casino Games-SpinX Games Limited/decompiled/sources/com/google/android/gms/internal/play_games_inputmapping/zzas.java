package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzas implements com.google.android.gms.internal.play_games_inputmapping.zzag {
    private final com.google.android.gms.internal.play_games_inputmapping.zzag zza;
    private final java.lang.Object zzb;

    private zzas(com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar, java.lang.Object obj) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzagVar, "log site key");
        this.zza = zzagVar;
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzag zza(com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar, java.lang.Object obj) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzas(zzagVar, obj);
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzas)) {
            return false;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzas zzasVar = (com.google.android.gms.internal.play_games_inputmapping.zzas) obj;
        return this.zza.equals(zzasVar.zza) && this.zzb.equals(zzasVar.zzb);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.String obj2 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 50 + obj2.length());
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(obj);
        sb.append("', qualifier='");
        sb.append(obj2);
        sb.append("' }");
        return sb.toString();
    }
}

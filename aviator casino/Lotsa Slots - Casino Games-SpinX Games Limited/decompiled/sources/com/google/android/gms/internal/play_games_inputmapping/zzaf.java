package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzaf implements com.google.android.gms.internal.play_games_inputmapping.zzag {
    public static final com.google.android.gms.internal.play_games_inputmapping.zzaf zza = new com.google.android.gms.internal.play_games_inputmapping.zzad();

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogSite{ class=");
        sb.append(zza());
        sb.append(", method=");
        sb.append(zzb());
        sb.append(", line=");
        sb.append(zzc());
        if (zzd() != null) {
            sb.append(", file=");
            sb.append(zzd());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract java.lang.String zza();

    public abstract java.lang.String zzb();

    public abstract int zzc();

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public abstract java.lang.String zzd();
}

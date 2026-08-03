package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzdf {
    private static final java.util.Comparator zza = new com.google.android.gms.internal.play_games_inputmapping.zzcx();
    private static final java.util.Comparator zzb = new com.google.android.gms.internal.play_games_inputmapping.zzcy();
    private static final com.google.android.gms.internal.play_games_inputmapping.zzdf zzc = new com.google.android.gms.internal.play_games_inputmapping.zzdf(new com.google.android.gms.internal.play_games_inputmapping.zzdd(java.util.Collections.emptyList()));
    private final com.google.android.gms.internal.play_games_inputmapping.zzdd zzd;

    private zzdf(com.google.android.gms.internal.play_games_inputmapping.zzdd zzddVar) {
        this.zzd = zzddVar;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdf zza() {
        return zzc;
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzdf) && ((com.google.android.gms.internal.play_games_inputmapping.zzdf) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        return this.zzd.toString();
    }

    public final java.util.Map zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd.isEmpty();
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzdf zzd(com.google.android.gms.internal.play_games_inputmapping.zzdf zzdfVar) {
        return !zzdfVar.zzd.isEmpty() ? this.zzd.isEmpty() ? zzdfVar : new com.google.android.gms.internal.play_games_inputmapping.zzdf(new com.google.android.gms.internal.play_games_inputmapping.zzdd(this.zzd, zzdfVar.zzd)) : this;
    }
}

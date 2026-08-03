package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzcp implements com.google.android.gms.internal.play_games_inputmapping.zzci {
    private final java.lang.String zza;
    private final java.util.logging.Level zzb;

    public zzcp() {
        this("", true, false, java.util.logging.Level.ALL, false);
    }

    private zzcp(java.lang.String str, boolean z, boolean z2, java.util.logging.Level level, boolean z3) {
        this.zza = "";
        this.zzb = level;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzci
    public final com.google.android.gms.internal.play_games_inputmapping.zzbc zza(java.lang.String str) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzcr(this.zza, str, true, false, this.zzb, null);
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzcp zzb(boolean z) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzcp(this.zza, true, false, java.util.logging.Level.OFF, false);
    }
}

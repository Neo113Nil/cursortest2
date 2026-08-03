package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzcg extends com.google.android.gms.internal.play_games_inputmapping.zzbc {
    private final java.lang.String zza;

    protected zzcg(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public void zzd(java.lang.RuntimeException runtimeException, com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        android.util.Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}

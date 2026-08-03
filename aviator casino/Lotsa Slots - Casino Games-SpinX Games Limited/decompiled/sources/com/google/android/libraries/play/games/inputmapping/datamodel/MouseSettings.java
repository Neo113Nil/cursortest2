package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class MouseSettings {
    public static com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings create(boolean z, boolean z2) {
        return new com.google.android.libraries.play.games.inputmapping.datamodel.AutoValue_MouseSettings(z, z2);
    }

    abstract boolean allowMouseSensitivityAdjustment();

    abstract boolean invertMouseMovement();

    com.google.android.gms.internal.play_games_inputmapping.zzo toProto() {
        com.google.android.gms.internal.play_games_inputmapping.zzn zza = com.google.android.gms.internal.play_games_inputmapping.zzo.zza();
        zza.zza(allowMouseSensitivityAdjustment());
        zza.zzb(invertMouseMovement());
        return (com.google.android.gms.internal.play_games_inputmapping.zzo) zza.zzj();
    }
}

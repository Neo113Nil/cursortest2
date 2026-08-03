package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class InputAction {
    public static com.google.android.libraries.play.games.inputmapping.datamodel.InputAction create(java.lang.String str, int i, com.google.android.libraries.play.games.inputmapping.datamodel.InputControls inputControls) {
        return new com.google.android.libraries.play.games.inputmapping.datamodel.AutoValue_InputAction(str, i, inputControls);
    }

    abstract java.lang.String actionLabel();

    abstract com.google.android.libraries.play.games.inputmapping.datamodel.InputControls inputControls();

    com.google.android.gms.internal.play_games_inputmapping.zzc toProto() {
        com.google.android.gms.internal.play_games_inputmapping.zzb zza = com.google.android.gms.internal.play_games_inputmapping.zzc.zza();
        zza.zza(actionLabel());
        zza.zzb(uniqueId());
        zza.zzc(inputControls().toProto());
        return (com.google.android.gms.internal.play_games_inputmapping.zzc) zza.zzj();
    }

    abstract int uniqueId();
}

package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class InputMap {
    public static com.google.android.libraries.play.games.inputmapping.datamodel.InputMap create(java.util.List<com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup> list, com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings mouseSettings) {
        return new com.google.android.libraries.play.games.inputmapping.datamodel.AutoValue_InputMap(list, mouseSettings);
    }

    abstract java.util.List<com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup> inputGroups();

    abstract com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings mouseSettings();

    public com.google.android.gms.internal.play_games_inputmapping.zzl toProto() {
        com.google.android.gms.internal.play_games_inputmapping.zzk zza = com.google.android.gms.internal.play_games_inputmapping.zzl.zza();
        java.util.Iterator<com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup> it = inputGroups().iterator();
        while (it.hasNext()) {
            zza.zza(it.next().toProto());
        }
        zza.zzb(mouseSettings().toProto());
        return (com.google.android.gms.internal.play_games_inputmapping.zzl) zza.zzj();
    }
}

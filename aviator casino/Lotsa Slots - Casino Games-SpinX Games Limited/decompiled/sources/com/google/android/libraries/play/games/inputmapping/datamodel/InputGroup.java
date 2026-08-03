package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class InputGroup {
    public static com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup create(java.lang.String str, java.util.List<com.google.android.libraries.play.games.inputmapping.datamodel.InputAction> list) {
        return new com.google.android.libraries.play.games.inputmapping.datamodel.AutoValue_InputGroup(str, list);
    }

    abstract java.lang.String groupLabel();

    abstract java.util.List<com.google.android.libraries.play.games.inputmapping.datamodel.InputAction> inputActions();

    com.google.android.gms.internal.play_games_inputmapping.zzi toProto() {
        com.google.android.gms.internal.play_games_inputmapping.zzh zza = com.google.android.gms.internal.play_games_inputmapping.zzi.zza();
        java.util.Iterator<com.google.android.libraries.play.games.inputmapping.datamodel.InputAction> it = inputActions().iterator();
        while (it.hasNext()) {
            zza.zzb(it.next().toProto());
        }
        zza.zza(groupLabel());
        return (com.google.android.gms.internal.play_games_inputmapping.zzi) zza.zzj();
    }
}

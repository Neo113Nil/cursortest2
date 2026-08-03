package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzeu {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzes zza = new com.google.android.gms.internal.play_games_inputmapping.zzet();
    private static final com.google.android.gms.internal.play_games_inputmapping.zzes zzb;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar;
        try {
            zzesVar = (com.google.android.gms.internal.play_games_inputmapping.zzes) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzesVar = null;
        }
        zzb = zzesVar;
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzes zza() {
        return zza;
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzes zzb() {
        com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar = zzb;
        if (zzesVar != null) {
            return zzesVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

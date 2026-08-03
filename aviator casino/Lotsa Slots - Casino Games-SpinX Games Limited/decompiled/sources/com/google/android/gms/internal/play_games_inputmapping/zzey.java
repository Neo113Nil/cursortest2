package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzey implements com.google.android.gms.internal.play_games_inputmapping.zzgc {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzey zza = new com.google.android.gms.internal.play_games_inputmapping.zzey();

    private zzey() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzey zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final boolean zzb(java.lang.Class cls) {
        return com.google.android.gms.internal.play_games_inputmapping.zzfc.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final com.google.android.gms.internal.play_games_inputmapping.zzgb zzc(java.lang.Class cls) {
        if (!com.google.android.gms.internal.play_games_inputmapping.zzfc.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            java.lang.String.valueOf(name);
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(name)));
        }
        try {
            return (com.google.android.gms.internal.play_games_inputmapping.zzgb) com.google.android.gms.internal.play_games_inputmapping.zzfc.zzn(cls.asSubclass(com.google.android.gms.internal.play_games_inputmapping.zzfc.class)).zzf(3, null, null);
        } catch (java.lang.Exception e) {
            java.lang.String name2 = cls.getName();
            java.lang.String.valueOf(name2);
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(name2)), e);
        }
    }
}

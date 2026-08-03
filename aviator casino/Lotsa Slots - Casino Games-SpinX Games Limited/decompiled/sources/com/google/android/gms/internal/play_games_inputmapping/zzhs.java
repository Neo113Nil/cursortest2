package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public enum zzhs {
    DOUBLE(com.google.android.gms.internal.play_games_inputmapping.zzht.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.play_games_inputmapping.zzht.FLOAT, 5),
    INT64(com.google.android.gms.internal.play_games_inputmapping.zzht.LONG, 0),
    UINT64(com.google.android.gms.internal.play_games_inputmapping.zzht.LONG, 0),
    INT32(com.google.android.gms.internal.play_games_inputmapping.zzht.INT, 0),
    FIXED64(com.google.android.gms.internal.play_games_inputmapping.zzht.LONG, 1),
    FIXED32(com.google.android.gms.internal.play_games_inputmapping.zzht.INT, 5),
    BOOL(com.google.android.gms.internal.play_games_inputmapping.zzht.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.play_games_inputmapping.zzht.STRING, 2),
    GROUP(com.google.android.gms.internal.play_games_inputmapping.zzht.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.play_games_inputmapping.zzht.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.play_games_inputmapping.zzht.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.play_games_inputmapping.zzht.INT, 0),
    ENUM(com.google.android.gms.internal.play_games_inputmapping.zzht.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.play_games_inputmapping.zzht.INT, 5),
    SFIXED64(com.google.android.gms.internal.play_games_inputmapping.zzht.LONG, 1),
    SINT32(com.google.android.gms.internal.play_games_inputmapping.zzht.INT, 0),
    SINT64(com.google.android.gms.internal.play_games_inputmapping.zzht.LONG, 0);

    private final com.google.android.gms.internal.play_games_inputmapping.zzht zzs;

    zzhs(com.google.android.gms.internal.play_games_inputmapping.zzht zzhtVar, int i) {
        this.zzs = zzhtVar;
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzht zza() {
        return this.zzs;
    }
}

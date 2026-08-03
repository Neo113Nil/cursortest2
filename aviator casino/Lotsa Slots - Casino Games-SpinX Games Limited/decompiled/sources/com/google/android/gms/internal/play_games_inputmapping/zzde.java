package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
enum zzde {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    static /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzde zza(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return STRING;
        }
        if (obj instanceof java.lang.Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof java.lang.Long) {
            return LONG;
        }
        if (obj instanceof java.lang.Double) {
            return DOUBLE;
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj.getClass());
        java.lang.String.valueOf(valueOf).length();
        throw new java.lang.AssertionError("invalid tag type: ".concat(java.lang.String.valueOf(valueOf)));
    }
}

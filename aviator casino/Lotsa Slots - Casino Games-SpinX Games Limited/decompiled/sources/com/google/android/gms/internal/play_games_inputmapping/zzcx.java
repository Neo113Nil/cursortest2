package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzcx implements java.util.Comparator {
    zzcx() {
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_games_inputmapping.zzde zza = com.google.android.gms.internal.play_games_inputmapping.zzde.zza(obj);
        com.google.android.gms.internal.play_games_inputmapping.zzde zza2 = com.google.android.gms.internal.play_games_inputmapping.zzde.zza(obj2);
        if (zza != zza2) {
            return zza.compareTo(zza2);
        }
        int ordinal = zza.ordinal();
        if (ordinal == 0) {
            return ((java.lang.Boolean) obj).compareTo((java.lang.Boolean) obj2);
        }
        if (ordinal == 1) {
            return ((java.lang.String) obj).compareTo((java.lang.String) obj2);
        }
        if (ordinal == 2) {
            return ((java.lang.Long) obj).compareTo((java.lang.Long) obj2);
        }
        if (ordinal == 3) {
            return ((java.lang.Double) obj).compareTo((java.lang.Double) obj2);
        }
        throw null;
    }
}

package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzo extends com.google.android.gms.internal.play_games_inputmapping.zzfc implements com.google.android.gms.internal.play_games_inputmapping.zzgf {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzo zzf;
    private boolean zzb;
    private boolean zze;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzo zzoVar = new com.google.android.gms.internal.play_games_inputmapping.zzo();
        zzf = zzoVar;
        com.google.android.gms.internal.play_games_inputmapping.zzfc.zzo(com.google.android.gms.internal.play_games_inputmapping.zzo.class, zzoVar);
    }

    private zzo() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzn zza() {
        return (com.google.android.gms.internal.play_games_inputmapping.zzn) zzf.zzj();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfc
    protected final java.lang.Object zzf(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzp(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new java.lang.Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzo();
        }
        com.google.android.gms.internal.play_games_inputmapping.zzm zzmVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzn(zzmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}

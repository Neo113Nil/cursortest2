package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.internal.play_games_inputmapping.zzfc implements com.google.android.gms.internal.play_games_inputmapping.zzgf {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzc zzg;
    private java.lang.String zzb = "";
    private long zze;
    private com.google.android.gms.internal.play_games_inputmapping.zzf zzf;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzc zzcVar = new com.google.android.gms.internal.play_games_inputmapping.zzc();
        zzg = zzcVar;
        com.google.android.gms.internal.play_games_inputmapping.zzfc.zzo(com.google.android.gms.internal.play_games_inputmapping.zzc.class, zzcVar);
    }

    private zzc() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzb zza() {
        return (com.google.android.gms.internal.play_games_inputmapping.zzb) zzg.zzj();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.play_games_inputmapping.zzc zzcVar, java.lang.String str) {
        str.getClass();
        zzcVar.zzb = str;
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.play_games_inputmapping.zzc zzcVar, com.google.android.gms.internal.play_games_inputmapping.zzf zzfVar) {
        zzfVar.getClass();
        zzcVar.zzf = zzfVar;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfc
    protected final java.lang.Object zzf(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzp(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0010\u0003\t", new java.lang.Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzc();
        }
        com.google.android.gms.internal.play_games_inputmapping.zza zzaVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzb(zzaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}

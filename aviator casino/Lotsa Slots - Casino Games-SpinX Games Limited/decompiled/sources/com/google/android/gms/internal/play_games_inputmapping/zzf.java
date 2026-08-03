package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.internal.play_games_inputmapping.zzfc implements com.google.android.gms.internal.play_games_inputmapping.zzgf {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzfg zzf = new com.google.android.gms.internal.play_games_inputmapping.zzd();
    private static final com.google.android.gms.internal.play_games_inputmapping.zzf zzg;
    private com.google.android.gms.internal.play_games_inputmapping.zzff zzb = zzr();
    private com.google.android.gms.internal.play_games_inputmapping.zzff zze = zzr();

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzf zzfVar = new com.google.android.gms.internal.play_games_inputmapping.zzf();
        zzg = zzfVar;
        com.google.android.gms.internal.play_games_inputmapping.zzfc.zzo(com.google.android.gms.internal.play_games_inputmapping.zzf.class, zzfVar);
    }

    private zzf() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zze zza() {
        return (com.google.android.gms.internal.play_games_inputmapping.zze) zzg.zzj();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.play_games_inputmapping.zzf zzfVar, int i) {
        com.google.android.gms.internal.play_games_inputmapping.zzff zzffVar = zzfVar.zzb;
        if (!zzffVar.zza()) {
            zzfVar.zzb = com.google.android.gms.internal.play_games_inputmapping.zzfc.zzs(zzffVar);
        }
        zzfVar.zzb.zzg(i);
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.play_games_inputmapping.zzf zzfVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.play_games_inputmapping.zzff zzffVar = zzfVar.zze;
        if (!zzffVar.zza()) {
            zzfVar.zze = com.google.android.gms.internal.play_games_inputmapping.zzfc.zzs(zzffVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzfVar.zze.zzg(((java.lang.Integer) it.next()).intValue());
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfc
    protected final java.lang.Object zzf(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzp(zzg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001+\u0002,", new java.lang.Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzf();
        }
        com.google.android.gms.internal.play_games_inputmapping.zzd zzdVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_games_inputmapping.zze(zzdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}

package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzfw implements com.google.android.gms.internal.play_games_inputmapping.zzgq {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzgc zzb = new com.google.android.gms.internal.play_games_inputmapping.zzfu();
    private final com.google.android.gms.internal.play_games_inputmapping.zzgc zza;

    public zzfw() {
        com.google.android.gms.internal.play_games_inputmapping.zzgc zzgcVar;
        com.google.android.gms.internal.play_games_inputmapping.zzgc[] zzgcVarArr = new com.google.android.gms.internal.play_games_inputmapping.zzgc[2];
        zzgcVarArr[0] = com.google.android.gms.internal.play_games_inputmapping.zzey.zza();
        try {
            zzgcVar = (com.google.android.gms.internal.play_games_inputmapping.zzgc) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzgcVar = zzb;
        }
        zzgcVarArr[1] = zzgcVar;
        com.google.android.gms.internal.play_games_inputmapping.zzfv zzfvVar = new com.google.android.gms.internal.play_games_inputmapping.zzfv(zzgcVarArr);
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb(zzfvVar, "messageInfoFactory");
        this.zza = zzfvVar;
    }

    private static boolean zzb(com.google.android.gms.internal.play_games_inputmapping.zzgb zzgbVar) {
        return zzgbVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgq
    public final com.google.android.gms.internal.play_games_inputmapping.zzgp zza(java.lang.Class cls) {
        com.google.android.gms.internal.play_games_inputmapping.zzgr.zza(cls);
        com.google.android.gms.internal.play_games_inputmapping.zzgb zzc = this.zza.zzc(cls);
        return zzc.zza() ? com.google.android.gms.internal.play_games_inputmapping.zzfc.class.isAssignableFrom(cls) ? com.google.android.gms.internal.play_games_inputmapping.zzgi.zzh(com.google.android.gms.internal.play_games_inputmapping.zzgr.zzU(), com.google.android.gms.internal.play_games_inputmapping.zzeu.zza(), zzc.zzb()) : com.google.android.gms.internal.play_games_inputmapping.zzgi.zzh(com.google.android.gms.internal.play_games_inputmapping.zzgr.zzS(), com.google.android.gms.internal.play_games_inputmapping.zzeu.zzb(), zzc.zzb()) : com.google.android.gms.internal.play_games_inputmapping.zzfc.class.isAssignableFrom(cls) ? zzb(zzc) ? com.google.android.gms.internal.play_games_inputmapping.zzgh.zzh(cls, zzc, com.google.android.gms.internal.play_games_inputmapping.zzgk.zzb(), com.google.android.gms.internal.play_games_inputmapping.zzfs.zzd(), com.google.android.gms.internal.play_games_inputmapping.zzgr.zzU(), com.google.android.gms.internal.play_games_inputmapping.zzeu.zza(), com.google.android.gms.internal.play_games_inputmapping.zzga.zzb()) : com.google.android.gms.internal.play_games_inputmapping.zzgh.zzh(cls, zzc, com.google.android.gms.internal.play_games_inputmapping.zzgk.zzb(), com.google.android.gms.internal.play_games_inputmapping.zzfs.zzd(), com.google.android.gms.internal.play_games_inputmapping.zzgr.zzU(), null, com.google.android.gms.internal.play_games_inputmapping.zzga.zzb()) : zzb(zzc) ? com.google.android.gms.internal.play_games_inputmapping.zzgh.zzh(cls, zzc, com.google.android.gms.internal.play_games_inputmapping.zzgk.zza(), com.google.android.gms.internal.play_games_inputmapping.zzfs.zzc(), com.google.android.gms.internal.play_games_inputmapping.zzgr.zzS(), com.google.android.gms.internal.play_games_inputmapping.zzeu.zzb(), com.google.android.gms.internal.play_games_inputmapping.zzga.zza()) : com.google.android.gms.internal.play_games_inputmapping.zzgh.zzh(cls, zzc, com.google.android.gms.internal.play_games_inputmapping.zzgk.zza(), com.google.android.gms.internal.play_games_inputmapping.zzfs.zzc(), com.google.android.gms.internal.play_games_inputmapping.zzgr.zzT(), null, com.google.android.gms.internal.play_games_inputmapping.zzga.zza());
    }
}

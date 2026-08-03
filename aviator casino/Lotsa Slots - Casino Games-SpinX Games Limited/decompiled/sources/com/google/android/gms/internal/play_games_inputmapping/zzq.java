package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzq extends com.google.android.gms.internal.play_games_inputmapping.zzac implements com.google.android.gms.internal.play_games_inputmapping.zzao {
    protected zzq(java.util.logging.Level level, boolean z) {
        super(level, false);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzac
    protected final com.google.android.gms.internal.play_games_inputmapping.zzdo zza() {
        return com.google.android.gms.internal.play_games_inputmapping.zzdm.zza();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzac
    protected final boolean zzb(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzbg zzl = zzl();
        int zza = zzl.zza();
        int i = 0;
        while (true) {
            if (i >= zza) {
                break;
            }
            if (zzl.zzb(i).zzd() != "eye3tag") {
                i++;
            } else if (zzl.zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zza) == null && zzl.zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzg) == null) {
                zzm(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzg, com.google.android.gms.internal.play_games_inputmapping.zzat.SMALL);
            }
        }
        return super.zzb(zzagVar);
    }
}

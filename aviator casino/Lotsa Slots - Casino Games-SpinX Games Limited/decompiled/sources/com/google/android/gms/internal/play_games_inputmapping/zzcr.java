package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzcr extends com.google.android.gms.internal.play_games_inputmapping.zzcg {
    private static final java.util.Set zza;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzbo zzb;
    private final java.lang.String zzc;
    private final java.util.logging.Level zzd;

    static {
        java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.gms.internal.play_games_inputmapping.zzaa.zza, com.google.android.gms.internal.play_games_inputmapping.zzau.zza)));
        zza = unmodifiableSet;
        zzb = com.google.android.gms.internal.play_games_inputmapping.zzbr.zza(unmodifiableSet).zzc();
    }

    /* synthetic */ zzcr(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.logging.Level level, byte[] bArr) {
        super(str2);
        this.zzc = com.google.android.gms.internal.play_games_inputmapping.zzck.zza("", str2, true);
        this.zzd = level;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar, java.lang.String str, boolean z, java.util.logging.Level level) {
        java.lang.String sb;
        com.google.android.gms.internal.play_games_inputmapping.zzby zzh = com.google.android.gms.internal.play_games_inputmapping.zzby.zzh(com.google.android.gms.internal.play_games_inputmapping.zzbg.zzg(), zzbaVar.zzl());
        int intValue = zzbaVar.zze().intValue();
        int intValue2 = level.intValue();
        if (intValue < intValue2 || com.google.android.gms.internal.play_games_inputmapping.zzce.zzc(zzbaVar, zzh, zza)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            if (intValue >= intValue2 || zzbaVar.zzh() == null) {
                com.google.android.gms.internal.play_games_inputmapping.zzav.zza(zzbaVar, sb2);
                com.google.android.gms.internal.play_games_inputmapping.zzce.zza(zzh, zzb, sb2);
            } else {
                sb2.append("(REDACTED) ");
                sb2.append(zzbaVar.zzh().zzb());
            }
            sb = sb2.toString();
        } else {
            sb = com.google.android.gms.internal.play_games_inputmapping.zzce.zzb(zzbaVar);
        }
        java.lang.Throwable th = (java.lang.Throwable) zzbaVar.zzl().zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zza);
        int zzb2 = com.google.android.gms.internal.play_games_inputmapping.zzck.zzb(zzbaVar.zze());
        if (zzb2 == 2) {
            android.util.Log.v(str, sb, th);
            return;
        }
        if (zzb2 == 3) {
            android.util.Log.d(str, sb, th);
            return;
        }
        if (zzb2 == 4) {
            android.util.Log.i(str, sb, th);
        } else if (zzb2 != 5) {
            android.util.Log.e(str, sb, th);
        } else {
            android.util.Log.w(str, sb, th);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final boolean zzb(java.util.logging.Level level) {
        int zzb2 = com.google.android.gms.internal.play_games_inputmapping.zzck.zzb(level);
        return android.util.Log.isLoggable(this.zzc, zzb2) || android.util.Log.isLoggable("all", zzb2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzc(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        zzf(zzbaVar, this.zzc, false, this.zzd);
    }
}

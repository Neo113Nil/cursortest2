package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzcq extends com.google.android.gms.internal.play_games_inputmapping.zzcg {
    private final java.lang.String zza;
    private final java.util.logging.Level zzb;

    zzcq(java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str2, boolean z, boolean z2, java.util.logging.Level level, boolean z3) {
        super(str2);
        this.zza = "";
        this.zzb = level;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final boolean zzb(java.util.logging.Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzc(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        java.lang.String str = (java.lang.String) zzbaVar.zzl().zzd(com.google.android.gms.internal.play_games_inputmapping.zzau.zza);
        if (str == null) {
            str = zza();
        }
        if (str == null) {
            str = zzbaVar.zzg().zza();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        com.google.android.gms.internal.play_games_inputmapping.zzcr.zzf(zzbaVar, com.google.android.gms.internal.play_games_inputmapping.zzck.zza(this.zza, str, true), false, this.zzb);
    }
}

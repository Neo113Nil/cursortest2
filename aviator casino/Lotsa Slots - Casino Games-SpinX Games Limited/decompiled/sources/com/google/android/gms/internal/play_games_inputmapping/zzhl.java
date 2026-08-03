package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzhl extends com.google.android.gms.internal.play_games_inputmapping.zzhm {
    zzhl(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zza(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.play_games_inputmapping.zzhn.zzb) {
            com.google.android.gms.internal.play_games_inputmapping.zzhn.zzD(obj, j, b);
        } else {
            com.google.android.gms.internal.play_games_inputmapping.zzhn.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final boolean zzb(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzb ? com.google.android.gms.internal.play_games_inputmapping.zzhn.zzu(obj, j) : com.google.android.gms.internal.play_games_inputmapping.zzhn.zzv(obj, j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.play_games_inputmapping.zzhn.zzb) {
            com.google.android.gms.internal.play_games_inputmapping.zzhn.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.play_games_inputmapping.zzhn.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final float zzd(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zze(java.lang.Object obj, long j, float f) {
        zzl(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final double zzf(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zzg(java.lang.Object obj, long j, double d) {
        zzn(obj, j, java.lang.Double.doubleToLongBits(d));
    }
}

package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbv implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzbw zza;
    private final com.google.android.gms.internal.play_games_inputmapping.zzar zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzbv(com.google.android.gms.internal.play_games_inputmapping.zzbw zzbwVar, com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar, int i, com.google.android.gms.internal.play_games_inputmapping.zzbs zzbsVar) {
        this.zza = zzbwVar;
        this.zzb = zzarVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object zzj;
        com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar = this.zzb;
        zzj = this.zza.zzj(this.zzc);
        java.lang.Object zze = zzarVar.zze(zzj);
        int i = this.zzd;
        if (i != 0) {
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i) + 1;
            this.zzd >>>= numberOfTrailingZeros;
            this.zzc += numberOfTrailingZeros;
        } else {
            this.zzc = -1;
        }
        return zze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

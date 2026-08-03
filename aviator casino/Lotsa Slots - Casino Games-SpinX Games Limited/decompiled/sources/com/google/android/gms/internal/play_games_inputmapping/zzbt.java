package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbt implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzbu zza;
    private int zzb = 0;

    zzbt(com.google.android.gms.internal.play_games_inputmapping.zzbu zzbuVar) {
        this.zza = zzbuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.zzb;
        i = this.zza.zza.zzd;
        return i2 < i;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int[] iArr;
        com.google.android.gms.internal.play_games_inputmapping.zzar zzi;
        com.google.android.gms.internal.play_games_inputmapping.zzbw zzbwVar = this.zza.zza;
        iArr = zzbwVar.zzc;
        int i = this.zzb;
        this.zzb = i + 1;
        zzi = zzbwVar.zzi(iArr[i] & 31);
        return zzi;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

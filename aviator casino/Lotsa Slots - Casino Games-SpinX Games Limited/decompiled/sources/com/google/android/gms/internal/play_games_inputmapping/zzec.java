package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzec extends com.google.android.gms.internal.play_games_inputmapping.zzee {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzek zza;
    private int zzb = 0;
    private final int zzc;

    zzec(com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar) {
        this.zza = zzekVar;
        this.zzc = zzekVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzeg
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}

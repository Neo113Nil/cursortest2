package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbu extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzbw zza;

    zzbu(com.google.android.gms.internal.play_games_inputmapping.zzbw zzbwVar) {
        this.zza = zzbwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_games_inputmapping.zzbt(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i;
        i = this.zza.zzd;
        return i;
    }
}

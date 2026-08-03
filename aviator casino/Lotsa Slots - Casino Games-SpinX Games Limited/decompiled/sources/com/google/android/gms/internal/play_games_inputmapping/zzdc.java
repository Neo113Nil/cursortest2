package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzdc extends java.util.AbstractSet {
    final int zza;
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzdd zzb;

    zzdc(com.google.android.gms.internal.play_games_inputmapping.zzdd zzddVar, int i) {
        this.zzb = zzddVar;
        this.zza = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.lang.Object[] objArr;
        objArr = this.zzb.zzb;
        return java.util.Arrays.binarySearch(objArr, zzb(), zzc(), obj, this.zza == -1 ? com.google.android.gms.internal.play_games_inputmapping.zzdd.zza : com.google.android.gms.internal.play_games_inputmapping.zzdf.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_games_inputmapping.zzdb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    final java.lang.Object zza(int i) {
        java.lang.Object[] objArr;
        objArr = this.zzb.zzb;
        return objArr[zzb() + i];
    }

    final int zzb() {
        int[] iArr;
        int i = this.zza;
        if (i == -1) {
            return 0;
        }
        iArr = this.zzb.zzc;
        return iArr[i];
    }

    final int zzc() {
        int[] iArr;
        iArr = this.zzb.zzc;
        return iArr[this.zza + 1];
    }
}

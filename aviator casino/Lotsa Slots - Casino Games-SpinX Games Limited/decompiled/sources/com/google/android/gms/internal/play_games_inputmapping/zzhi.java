package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzhi extends java.util.AbstractList implements java.util.RandomAccess, com.google.android.gms.internal.play_games_inputmapping.zzfp {
    private final com.google.android.gms.internal.play_games_inputmapping.zzfp zza;

    public zzhi(com.google.android.gms.internal.play_games_inputmapping.zzfp zzfpVar) {
        this.zza = zzfpVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return ((com.google.android.gms.internal.play_games_inputmapping.zzfo) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_games_inputmapping.zzhh(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzhg(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzfp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final java.lang.Object zze(int i) {
        return this.zza.zze(i);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final java.util.List zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final com.google.android.gms.internal.play_games_inputmapping.zzfp zzg() {
        return this;
    }
}

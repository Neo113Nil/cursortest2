package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzhg implements java.util.ListIterator {
    final java.util.ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzhi zzc;

    zzhg(com.google.android.gms.internal.play_games_inputmapping.zzhi zzhiVar, int i) {
        this.zzc = zzhiVar;
        this.zzb = i;
        this.zza = zzhiVar.zza().listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return (java.lang.String) this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
        return (java.lang.String) this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}

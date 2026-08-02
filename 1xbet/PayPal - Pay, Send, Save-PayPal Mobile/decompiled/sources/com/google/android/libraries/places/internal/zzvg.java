package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvg extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.libraries.places.internal.zzvi zza;

    zzvg(com.google.android.libraries.places.internal.zzvi zzviVar) {
        java.util.Objects.requireNonNull(zzviVar);
        this.zza = zzviVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.libraries.places.internal.zzvf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzg();
    }
}

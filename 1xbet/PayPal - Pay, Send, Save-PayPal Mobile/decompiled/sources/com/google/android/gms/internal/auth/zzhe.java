package com.google.android.gms.internal.auth;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zzhe extends java.util.AbstractList implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzff {
    private final com.google.android.gms.internal.auth.zzff zza;

    public zzhe(com.google.android.gms.internal.auth.zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return ((com.google.android.gms.internal.auth.zzfe) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.auth.zzhd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new com.google.android.gms.internal.auth.zzhc(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final com.google.android.gms.internal.auth.zzff zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final java.util.List zzg() {
        return this.zza.zzg();
    }
}

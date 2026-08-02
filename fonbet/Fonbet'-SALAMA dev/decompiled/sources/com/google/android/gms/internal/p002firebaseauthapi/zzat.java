package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzat<E> extends zzal<E> {
    static final zzal<Object> zza = new zzat(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzat(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final E get(int i7) {
        zzy.zza(i7, this.zzc);
        E e7 = (E) this.zzb[i7];
        Objects.requireNonNull(e7);
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, i7, this.zzc);
        return i7 + this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zza() {
        return this.zzc;
    }
}

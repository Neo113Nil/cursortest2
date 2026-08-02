package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvh implements java.util.Iterator {
    final /* synthetic */ com.google.android.libraries.places.internal.zzvi zza;
    private final com.google.android.libraries.places.internal.zztv zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzvh(com.google.android.libraries.places.internal.zzvi zzviVar, com.google.android.libraries.places.internal.zztv zztvVar, int i, byte[] bArr) {
        java.util.Objects.requireNonNull(zzviVar);
        this.zza = zzviVar;
        this.zzb = zztvVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object zze = this.zzb.zze(this.zza.zze(this.zzc));
        int i = this.zzd;
        if (i == 0) {
            this.zzc = -1;
            return zze;
        }
        int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i) + 1;
        this.zzd >>>= numberOfTrailingZeros;
        this.zzc += numberOfTrailingZeros;
        return zze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }
}

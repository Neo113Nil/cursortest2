package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzfe implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.fido.zzff zza;
    private int zzb = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        com.google.android.gms.internal.fido.zzff zzffVar = this.zza;
        return i < zzffVar.zza() - zzffVar.zzb();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object[] objArr;
        int i = this.zzb;
        com.google.android.gms.internal.fido.zzff zzffVar = this.zza;
        if (i >= zzffVar.zza() - zzffVar.zzb()) {
            throw new java.util.NoSuchElementException();
        }
        com.google.android.gms.internal.fido.zzff zzffVar2 = this.zza;
        objArr = zzffVar2.zzb.zzb;
        java.lang.Object obj = objArr[zzffVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    zzfe(com.google.android.gms.internal.fido.zzff zzffVar) {
        this.zza = zzffVar;
    }
}

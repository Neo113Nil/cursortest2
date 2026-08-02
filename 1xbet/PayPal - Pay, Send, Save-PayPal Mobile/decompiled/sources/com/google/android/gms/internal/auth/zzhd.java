package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzhd implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.auth.zzhe zzb;

    zzhd(com.google.android.gms.internal.auth.zzhe zzheVar) {
        com.google.android.gms.internal.auth.zzff zzffVar;
        this.zzb = zzheVar;
        zzffVar = zzheVar.zza;
        this.zza = zzffVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return (java.lang.String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

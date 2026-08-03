package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
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

package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzbd implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbe zzb;

    zzbd(com.google.android.gms.measurement.internal.zzbe zzbeVar) {
        java.util.Objects.requireNonNull(zzbeVar);
        this.zzb = zzbeVar;
        this.zza = zzbeVar.zzg().keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.String next() {
        return (java.lang.String) this.zza.next();
    }
}

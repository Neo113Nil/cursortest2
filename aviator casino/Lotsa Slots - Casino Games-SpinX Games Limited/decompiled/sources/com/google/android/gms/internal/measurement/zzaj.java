package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzaj implements java.util.Iterator {
    final /* synthetic */ java.util.Iterator zza;

    zzaj(java.util.Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new com.google.android.gms.internal.measurement.zzas((java.lang.String) this.zza.next());
    }
}

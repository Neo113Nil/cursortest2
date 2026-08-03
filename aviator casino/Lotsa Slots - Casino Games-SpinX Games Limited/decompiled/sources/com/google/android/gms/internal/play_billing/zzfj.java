package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzfj implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzfk zzb;

    zzfj(com.google.android.gms.internal.play_billing.zzfk zzfkVar) {
        com.google.android.gms.internal.play_billing.zzdk zzdkVar;
        this.zzb = zzfkVar;
        zzdkVar = zzfkVar.zza;
        this.zza = zzdkVar.iterator();
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

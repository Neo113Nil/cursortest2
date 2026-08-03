package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhnb implements java.util.Iterator {
    private final java.util.Iterator zza;
    private final java.util.Iterator zzb;

    /* synthetic */ zzhnb(java.util.Iterator it, java.util.Iterator it2, byte[] bArr) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Iterator it = this.zza;
        return it.hasNext() ? it.next() : this.zzb.next();
    }
}

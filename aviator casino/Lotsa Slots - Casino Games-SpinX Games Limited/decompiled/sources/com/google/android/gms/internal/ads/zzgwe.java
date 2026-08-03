package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgwe extends com.google.android.gms.internal.ads.zzgwb implements java.util.Queue {
    protected zzgwe() {
    }

    @Override // java.util.Queue
    public final java.lang.Object element() {
        return zza().element();
    }

    @Override // java.util.Queue
    public final boolean offer(java.lang.Object obj) {
        return zza().offer(obj);
    }

    @Override // java.util.Queue
    public final java.lang.Object peek() {
        return zza().peek();
    }

    @Override // java.util.Queue
    public final java.lang.Object poll() {
        return zza().poll();
    }

    @Override // java.util.Queue
    public final java.lang.Object remove() {
        return zza().remove();
    }

    protected abstract java.util.Queue zza();

    @Override // com.google.android.gms.internal.ads.zzgwb
    protected /* bridge */ /* synthetic */ java.util.Collection zzc() {
        throw null;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzgxe extends zzgxb implements Queue {
    protected zzgxe() {
    }

    @Override // java.util.Queue
    public final Object element() {
        return zza().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return zza().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zza().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zza().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zza().remove();
    }

    protected abstract Queue zza();

    @Override // com.google.android.gms.internal.ads.zzgxb
    protected /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}

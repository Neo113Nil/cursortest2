package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigf implements java.util.Iterator {
    private final java.util.ArrayDeque zza;
    private com.google.android.gms.internal.ads.zzicx zzb;

    /* synthetic */ zzigf(com.google.android.gms.internal.ads.zzida zzidaVar, byte[] bArr) {
        if (!(zzidaVar instanceof com.google.android.gms.internal.ads.zzigg)) {
            this.zza = null;
            this.zzb = (com.google.android.gms.internal.ads.zzicx) zzidaVar;
            return;
        }
        com.google.android.gms.internal.ads.zzigg zziggVar = (com.google.android.gms.internal.ads.zzigg) zzidaVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(zziggVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zziggVar);
        this.zzb = zzb(zziggVar.zzo());
    }

    private final com.google.android.gms.internal.ads.zzicx zzb(com.google.android.gms.internal.ads.zzida zzidaVar) {
        while (zzidaVar instanceof com.google.android.gms.internal.ads.zzigg) {
            com.google.android.gms.internal.ads.zzigg zziggVar = (com.google.android.gms.internal.ads.zzigg) zzidaVar;
            this.zza.push(zziggVar);
            zzidaVar = zziggVar.zzo();
        }
        return (com.google.android.gms.internal.ads.zzicx) zzidaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzicx next() {
        com.google.android.gms.internal.ads.zzicx zzicxVar;
        com.google.android.gms.internal.ads.zzicx zzicxVar2 = this.zzb;
        if (zzicxVar2 == null) {
            throw new java.util.NoSuchElementException();
        }
        do {
            java.util.ArrayDeque arrayDeque = this.zza;
            zzicxVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzicxVar = zzb(((com.google.android.gms.internal.ads.zzigg) arrayDeque.pop()).zzF());
        } while (zzicxVar.zzs());
        this.zzb = zzicxVar;
        return zzicxVar2;
    }
}

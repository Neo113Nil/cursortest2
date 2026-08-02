package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbze {
    final int zza;
    final int zzb;
    final int zzc;
    final java.util.concurrent.atomic.AtomicInteger zzd;

    zzbze(float f, float f2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.zza = i;
        this.zzb = i / 2;
        atomicInteger.set(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbze)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbze zzbzeVar = (com.google.android.libraries.places.internal.zzbze) obj;
        return this.zza == zzbzeVar.zza && this.zzc == zzbzeVar.zzc;
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzc));
    }

    final boolean zza() {
        return this.zzd.get() > this.zzb;
    }

    final boolean zzb() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.zzd;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, java.lang.Math.max(i2, 0)));
        return i2 > this.zzb;
    }
}

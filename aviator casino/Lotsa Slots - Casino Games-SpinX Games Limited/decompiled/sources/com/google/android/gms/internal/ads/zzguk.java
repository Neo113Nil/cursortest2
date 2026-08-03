package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzguk extends com.google.android.gms.internal.ads.zzgza {
    private java.lang.Object zza;
    private int zzb = 2;

    protected zzguk() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzb != 4);
        int i = this.zzb;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = 2;
        java.lang.Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    protected abstract java.lang.Object zza();

    protected final java.lang.Object zzb() {
        this.zzb = 3;
        return null;
    }
}

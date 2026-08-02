package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfxt extends zzfwh {
    static final zzfwh zza = new zzfxt(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzfxt(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzfth.zza(i7, this.zzc, "index");
        Object obj = this.zzb[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, com.google.android.gms.internal.ads.zzfwc
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, i7, this.zzc);
        return i7 + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final Object[] zzg() {
        return this.zzb;
    }
}

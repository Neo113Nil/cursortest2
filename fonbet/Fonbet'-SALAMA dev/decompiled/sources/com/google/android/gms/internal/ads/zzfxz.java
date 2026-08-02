package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzfxz extends zzfwm {
    static final zzfxz zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfxz(objArr, 0, objArr, 0, 0);
    }

    public zzfxz(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.zzb = objArr;
        this.zze = i7;
        this.zzc = objArr2;
        this.zzf = i8;
        this.zzg = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zzb = zzfvz.zzb(obj);
                while (true) {
                    int i7 = zzb & this.zzf;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zzb = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, i7, this.zzg);
        return i7 + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc
    /* renamed from: zze */
    public final zzfyn iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final zzfwh zzi() {
        return zzfwh.zzj(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final boolean zzu() {
        return true;
    }
}

package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzfyk extends zzfwm {
    final transient Object zza;

    public zzfyk(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfwq(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0486a1.h("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zza(Object[] objArr, int i7) {
        objArr[i7] = this.zza;
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc
    public final zzfwh zzd() {
        return zzfwh.zzo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc
    /* JADX INFO: renamed from: zze */
    public final zzfyn iterator() {
        return new zzfwq(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return false;
    }
}

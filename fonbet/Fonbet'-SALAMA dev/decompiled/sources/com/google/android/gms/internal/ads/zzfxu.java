package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzfxu extends zzfwh {
    final /* synthetic */ zzfxv zza;

    public zzfxu(zzfxv zzfxvVar) {
        this.zza = zzfxvVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i8;
        Object[] objArr;
        Object[] objArr2;
        i8 = this.zza.zzc;
        zzfth.zza(i7, i8, "index");
        objArr = this.zza.zzb;
        int i9 = i7 + i7;
        Object obj = objArr[i9];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.zza.zzc;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return true;
    }
}

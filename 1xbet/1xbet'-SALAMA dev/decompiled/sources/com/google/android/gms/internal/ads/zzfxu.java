package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzfxu extends zzfwh {
    final /* synthetic */ zzfxv zza;

    public zzfxu(zzfxv zzfxvVar) {
        this.zza = zzfxvVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        zzfth.zza(i7, this.zza.zzc, "index");
        int i8 = i7 + i7;
        Object obj = this.zza.zzb[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return true;
    }
}

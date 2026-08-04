package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzfxv extends zzfwm {
    private final transient zzfwk zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzfxv(zzfwk zzfwkVar, Object[] objArr, int i7, int i8) {
        this.zza = zzfwkVar;
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zza(Object[] objArr, int i7) {
        return zzd().zza(objArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc
    /* JADX INFO: renamed from: zze */
    public final zzfyn iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final zzfwh zzi() {
        return new zzfxu(this);
    }
}

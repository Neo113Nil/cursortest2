package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzav<K, V> extends zzau<Map.Entry<K, V>> {
    private final transient zzap<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzav(zzap<K, V> zzapVar, Object[] objArr, int i7, int i8) {
        this.zza = zzapVar;
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau, com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public final zzbc<Map.Entry<K, V>> iterator() {
        return (zzbc) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final zzal<Map.Entry<K, V>> zzg() {
        return new zzay(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zza(Object[] objArr, int i7) {
        return zzc().zza(objArr, i7);
    }
}

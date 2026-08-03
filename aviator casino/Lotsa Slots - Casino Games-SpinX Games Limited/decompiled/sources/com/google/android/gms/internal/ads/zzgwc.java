package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgwc extends com.google.android.gms.internal.ads.zzgwd implements java.util.Map {
    protected zzgwc() {
    }

    @Override // java.util.Map
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return zza().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return zza().containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        return zza().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return obj == this || zza().equals(obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return zza().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zza().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        return zza().keySet();
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return zza().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        zza().putAll(map);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        return zza().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zza().size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return zza().values();
    }

    protected abstract java.util.Map zza();

    @Override // com.google.android.gms.internal.ads.zzgwd
    protected /* bridge */ /* synthetic */ java.lang.Object zzb() {
        throw null;
    }

    protected final boolean zzc(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgxo zzgxoVar = new com.google.android.gms.internal.ads.zzgxo(entrySet().iterator());
        if (obj == null) {
            while (zzgxoVar.hasNext()) {
                if (zzgxoVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzgxoVar.hasNext()) {
                if (obj.equals(zzgxoVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean zzd(java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzgxt.zzb(this, obj);
    }

    protected final int zze() {
        return com.google.android.gms.internal.ads.zzgyw.zzc(entrySet());
    }
}

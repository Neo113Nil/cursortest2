package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzgwf<K, V> implements zzgyu<K, V> {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    zzgwf() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgyu) {
            return zzu().equals(((zzgyu) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public boolean zze(Object obj, Object obj2) {
        throw null;
    }

    abstract Set zzh();

    abstract Collection zzj();

    Iterator zzk() {
        throw null;
    }

    abstract Map zzl();

    public boolean zzr(Object obj) {
        Iterator<V> it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set zzs() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public Collection zzt() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzj = zzj();
        this.zzb = zzj;
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public Map zzu() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzl = zzl();
        this.zzc = zzl;
        return zzl;
    }
}

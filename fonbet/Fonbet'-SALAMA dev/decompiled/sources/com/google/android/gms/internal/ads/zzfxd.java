package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
abstract class zzfxd extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzb = zzb();
        this.zza = zzb;
        return zzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set zze = zze();
        this.zzb = zze;
        return zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzfxc zzfxcVar = new zzfxc(this);
        this.zzc = zzfxcVar;
        return zzfxcVar;
    }

    public abstract Set zzb();

    public Set zze() {
        return new zzfxb(this);
    }
}

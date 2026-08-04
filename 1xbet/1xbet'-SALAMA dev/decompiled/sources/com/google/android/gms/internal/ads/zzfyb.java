package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class zzfyb extends zzfxs implements Serializable {
    final zzfxs zza;

    public zzfyb(zzfxs zzfxsVar) {
        this.zza = zzfxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfyb) {
            return this.zza.equals(((zzfyb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}

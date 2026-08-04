package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
public final class zzadv {
    public static final zzadv zza = new zzadv(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadv(long j, long j3) {
        this.zzb = j;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadv.class == obj.getClass()) {
            zzadv zzadvVar = (zzadv) obj;
            if (this.zzb == zzadvVar.zzb && this.zzc == zzadvVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.zzb);
        sb.append(", position=");
        return AbstractC0486a1.i(sb, this.zzc, "]");
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(zzfwh.zzn());
    private final zzfwh zzb;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
    }

    public zzbv(List list) {
        this.zzb = zzfwh.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbv.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbv) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfwh zza() {
        return this.zzb;
    }

    public final boolean zzb(int i7) {
        for (int i8 = 0; i8 < this.zzb.size(); i8++) {
            zzbu zzbuVar = (zzbu) this.zzb.get(i8);
            if (zzbuVar.zzc() && zzbuVar.zza() == i7) {
                return true;
            }
        }
        return false;
    }
}

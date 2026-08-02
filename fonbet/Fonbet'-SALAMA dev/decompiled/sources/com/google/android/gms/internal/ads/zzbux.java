package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public final class zzbux extends zzbuz {
    private final String zza;
    private final int zzb;

    public zzbux(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbux)) {
            zzbux zzbuxVar = (zzbux) obj;
            if (D.m(this.zza, zzbuxVar.zza)) {
                if (D.m(Integer.valueOf(this.zzb), Integer.valueOf(zzbuxVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final String zzc() {
        return this.zza;
    }
}

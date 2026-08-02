package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzavm extends zzate {
    public Long zza;
    public Long zzb;

    public zzavm() {
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }

    public zzavm(String str) {
        HashMap zza = zzate.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }
}

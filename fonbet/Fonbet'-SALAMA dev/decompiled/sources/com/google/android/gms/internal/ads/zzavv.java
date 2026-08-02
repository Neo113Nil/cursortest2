package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzavv extends zzate {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzavv() {
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        hashMap.put(3, this.zzd);
        hashMap.put(4, this.zze);
        return hashMap;
    }

    public zzavv(String str) {
        HashMap zza = zzate.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
            this.zzd = (Long) zza.get(3);
            this.zze = (Long) zza.get(4);
        }
    }
}

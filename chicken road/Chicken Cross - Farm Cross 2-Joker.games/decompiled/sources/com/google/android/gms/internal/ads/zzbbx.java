package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbbx extends zzazv {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzbbx() {
    }

    public zzbbx(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Boolean) zzb.get(1);
            this.zzc = (Boolean) zzb.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}

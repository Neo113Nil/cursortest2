package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzctg implements zzinw {
    private final zziof zza;

    private zzctg(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzctg zza(zziof zziofVar) {
        return new zzctg(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzctf((DeviceTierManager) this.zza.zzb());
    }
}

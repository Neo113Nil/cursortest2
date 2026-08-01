package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeyw implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzeyw(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzeyw zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzeyw(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object zzb = ((zzeva) this.zza).zzb();
        Object obj = (zzexw) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("2")) {
            zzb = obj;
        }
        zzioe.zzb(zzb);
        return (zzfdi) zzb;
    }
}

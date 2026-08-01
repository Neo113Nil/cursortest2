package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzezg implements zzinw {
    private final zziof zza;

    private zzezg(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzezg zza(zziof zziofVar, zziof zziofVar2) {
        return new zzezg(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxw zzh;
        zzexy zzc = zzeya.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfg)).booleanValue()) {
            zzh = zzgxw.zzi(new zzfbu(zzc, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfh)).intValue(), scheduledExecutorService));
        } else {
            zzh = zzgxw.zzh();
        }
        zzioe.zzb(zzh);
        return zzh;
    }
}

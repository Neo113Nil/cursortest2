package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeuk implements zzesh {
    final ScheduledExecutorService zza;

    public zzeuk(zzbss zzbssVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return zzgbc.zzm(zzgbc.zzo(zzgbc.zzh(new Bundle()), ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzep)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return new zzeul((Bundle) obj);
            }
        }, zzbza.zza);
    }
}

package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzekr implements zzesh {
    private final I3.b zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzekr(I3.b bVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = bVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        I3.b zzn = zzgbc.zzn(this.zza, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(new zzeks((String) obj));
            }
        }, this.zzb);
        if (((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmv)).intValue() > 0) {
            zzn = zzgbc.zzo(zzn, ((Integer) r2.f2726c.zzb(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgbc.zzf(zzn, Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgbc.zzh(new zzeks(Integer.toString(17))) : zzgbc.zzh(new zzeks(null));
            }
        }, this.zzb);
    }
}

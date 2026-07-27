package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcxv implements zzbfg {
    private final zzclm zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcxv(zzclm zzclmVar, Executor executor) {
        this.zza = zzclmVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void zzdj(zzbff zzbffVar) {
        final zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzon)).booleanValue()) {
                if (zzbffVar.zzj) {
                    if (!Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        Executor executor = this.zzb;
                        Objects.requireNonNull(zzclmVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxu
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclm.this.onResume();
                            }
                        });
                    }
                } else {
                    if (!Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        Executor executor2 = this.zzb;
                        Objects.requireNonNull(zzclmVar);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxt
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclm.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}

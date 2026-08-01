package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcny {
    private String zza;
    private zzija zzb;
    private zzims zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    zzcny(zzcnl zzcnlVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String variationsHeader = WebViewFeature.isFeatureSupported("GET_VARIATIONS_HEADER") ? WebViewCompat.getVariationsHeader() : null;
            if (variationsHeader != null && !variationsHeader.isEmpty()) {
                this.zza = variationsHeader;
                byte[] decode = Base64.decode(variationsHeader, 10);
                this.zzb = zzija.zzc(decode, zziew.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzko)).booleanValue()) {
                    this.zzc = zzims.zzc(decode, zziew.zzc());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkm)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnx
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcny.this.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkn)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzige | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzims zzimsVar = this.zzc;
        if (zzimsVar != null) {
            return Base64.encodeToString(zzimsVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzija zzd() {
        return this.zzb;
    }
}

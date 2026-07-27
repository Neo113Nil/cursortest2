package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzefs implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;

    private zzefs(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
    }

    public static zzefs zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        return new zzefs(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (java.lang.Integer.toString(r6).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r2.zzd))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzb() {
        ListenableFuture submit;
        final zzbbd zzbbdVar = (zzbbd) this.zza.zzb();
        final Context zza = ((zzcok) this.zzb).zza();
        zzflw zza2 = ((zzddg) this.zzc).zza();
        long longValue = ((Long) this.zzd.zzb()).longValue();
        zzhdi zzc = zzfoy.zzc();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdF)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - longValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdH)).intValue()) {
            submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzbbd.this.zzb().zzk(zza);
                }
            });
            zzioe.zzb(submit);
            return submit;
        }
        submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzbbd.this.zzb().zzl(zza);
            }
        });
        zzioe.zzb(submit);
        return submit;
    }
}

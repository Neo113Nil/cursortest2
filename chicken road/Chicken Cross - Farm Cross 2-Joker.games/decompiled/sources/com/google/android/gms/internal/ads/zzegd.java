package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzegd {
    private final ScheduledExecutorService zza;
    private final zzhdi zzb;
    private final zzhdi zzc;
    private final zzehc zzd;
    private final zzinq zze;

    public zzegd(ScheduledExecutorService scheduledExecutorService, zzhdi zzhdiVar, zzhdi zzhdiVar2, zzehc zzehcVar, zzinq zzinqVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzhdiVar;
        this.zzc = zzhdiVar2;
        this.zzd = zzehcVar;
        this.zze = zzinqVar;
    }

    public final ListenableFuture zza(final zzcbv zzcbvVar) {
        ListenableFuture submit;
        String str = zzcbvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            submit = zzhcy.zzc(new zzehp(1));
        } else {
            submit = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziD)).booleanValue() || ((Boolean) zzbls.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzega
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzegd.this.zzc(zzcbvVar);
                }
            }) : this.zzd.zza(zzcbvVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzi(zzhcq.zzw(submit), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzegd.this.zzb(zzcbvVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzb(final zzcbv zzcbvVar, int i, Throwable th) {
        Bundle bundle;
        if (zzcbvVar != null && (bundle = zzcbvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhcy.zzj(((zzejg) this.zze.zzb()).zzd(zzcbvVar, i), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegb
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcy.zza(new zzehq((InputStream) obj, zzcbv.this));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzehq zzc(zzcbv zzcbvVar) {
        return (zzehq) this.zzd.zza(zzcbvVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS);
    }
}

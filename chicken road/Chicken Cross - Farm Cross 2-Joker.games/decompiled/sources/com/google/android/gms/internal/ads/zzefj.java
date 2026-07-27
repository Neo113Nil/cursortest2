package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzefj {
    private final zzhdi zza;
    private final zzhdi zzb;
    private final zzegt zzc;
    private final zzinq zzd;

    public zzefj(zzhdi zzhdiVar, zzhdi zzhdiVar2, zzegt zzegtVar, zzinq zzinqVar) {
        this.zza = zzhdiVar;
        this.zzb = zzhdiVar2;
        this.zzc = zzegtVar;
        this.zzd = zzinqVar;
    }

    public final ListenableFuture zza(final zzcbv zzcbvVar) {
        ListenableFuture zzh;
        String str = zzcbvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            zzh = zzhcy.zzc(new zzehp(1));
        } else {
            zzh = zzhcy.zzh(this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefi
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzefj.this.zzb(zzcbvVar);
                }
            }), ExecutionException.class, zzeff.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzhcy.zzh(zzh, zzehp.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzefg
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzefj.this.zzc(zzcbvVar, callingUid, (zzehp) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzehq zzb(zzcbv zzcbvVar) {
        return (zzehq) this.zzc.zza(zzcbvVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzc(final zzcbv zzcbvVar, int i, zzehp zzehpVar) {
        Bundle bundle;
        if (zzcbvVar != null && (bundle = zzcbvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhcy.zzj(((zzejg) this.zzd.zzb()).zza(zzcbvVar, i), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzefh
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcy.zza(new zzehq((InputStream) obj, zzcbv.this));
            }
        }, this.zzb);
    }
}

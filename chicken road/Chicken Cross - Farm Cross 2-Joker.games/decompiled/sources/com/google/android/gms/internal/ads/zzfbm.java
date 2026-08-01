package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfbm implements zzfdi {
    private static String zzc;
    private final zzhdi zza;
    private final Context zzb;

    public zzfbm(zzhdi zzhdiVar, Context context) {
        this.zza = zzhdiVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbm.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 27;
    }

    final /* synthetic */ zzfbn zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue()) {
            return new zzfbn(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgz)).booleanValue()) {
            return new zzfbn(com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb);
        }
        return new zzfbn(zzc);
    }
}

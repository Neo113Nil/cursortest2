package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfhw implements zzfiu {
    private zzdcx zza;
    private final Executor zzb = zzhdp.zza();

    public final zzdcx zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfiv zzfivVar, zzfit zzfitVar, zzdcx zzdcxVar) {
        zzdcw zza = zzfitVar.zza(zzfivVar.zzb);
        zza.zzj(new zzfiy(true));
        zzdcx zzdcxVar2 = (zzdcx) zza.zzh();
        this.zza = zzdcxVar2;
        final zzczp zza2 = zzdcxVar2.zza();
        final zzfnu zzfnuVar = new zzfnu();
        zzhcq zzw = zzhcq.zzw(zza2.zzb());
        zzhcg zzhcgVar = new zzhcg(this) { // from class: com.google.android.gms.internal.ads.zzfhv
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzflo zzfloVar = (zzflo) obj;
                zzfnuVar.zzb = zzfloVar;
                Iterator it = zzfloVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfld) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zza2.zzc(zzhcy.zza(zzfloVar));
                    }
                }
                return zzhcy.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzj(zzw, zzhcgVar, executor), new zzgub() { // from class: com.google.android.gms.internal.ads.zzfhu
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzfnu zzfnuVar2 = zzfnu.this;
                zzfnuVar2.zzc = (zzcyl) obj;
                return zzfnuVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}

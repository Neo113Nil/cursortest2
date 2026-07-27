package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzggi {
    private final zzinq zza;
    private final zzinq zzb;
    private final ExecutorService zzc;
    private final zzinq zzd;
    private ListenableFuture zze = null;

    zzggi(zzinq zzinqVar, zzinq zzinqVar2, ExecutorService executorService, zzinq zzinqVar3) {
        this.zza = zzinqVar;
        this.zzb = zzinqVar2;
        this.zzc = executorService;
        this.zzd = zzinqVar3;
    }

    public final synchronized ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zze;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        Set set = (Set) this.zzb.zzb();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzggg) it.next()).zza());
        }
        zzgrh zzgrhVar = (zzgrh) this.zzd.zzb();
        ListenableFuture zzk = zzhcy.zzk(zzhcy.zzm(arrayList), zzggh.zza, this.zzc);
        zzgrhVar.zze(2, zzk);
        this.zze = zzk;
        Iterator it2 = ((Set) this.zza.zzb()).iterator();
        while (it2.hasNext()) {
            ((zzggg) it2.next()).zza();
        }
        ListenableFuture listenableFuture2 = this.zze;
        if (listenableFuture2 == null) {
            throw null;
        }
        ListenableFuture listenableFuture3 = listenableFuture2;
        return listenableFuture2;
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zze;
        if (listenableFuture == null) {
            throw null;
        }
        ListenableFuture listenableFuture2 = listenableFuture;
        return listenableFuture;
    }
}

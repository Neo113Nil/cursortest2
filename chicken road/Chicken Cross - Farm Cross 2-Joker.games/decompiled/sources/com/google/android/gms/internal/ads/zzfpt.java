package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfpt {
    public static final zzfpz zza(ListenableFuture listenableFuture, Object obj, zzfqa zzfqaVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfqa.zza;
        return new zzfpz(zzfqaVar, obj, null, listenableFuture2, Collections.emptyList(), listenableFuture, null);
    }

    public static final zzfpz zzb(Callable callable, Object obj, zzfqa zzfqaVar) {
        return zzc(callable, zzfqaVar.zze(), obj, zzfqaVar);
    }

    public static final zzfpz zzc(Callable callable, zzhdi zzhdiVar, Object obj, zzfqa zzfqaVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfqa.zza;
        return new zzfpz(zzfqaVar, obj, null, listenableFuture, Collections.emptyList(), zzhdiVar.submit(callable), null);
    }

    public static final zzfpz zzd(final zzfpo zzfpoVar, zzhdi zzhdiVar, Object obj, zzfqa zzfqaVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfps
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfpo.this.zza();
                return null;
            }
        }, zzhdiVar, obj, zzfqaVar);
    }
}

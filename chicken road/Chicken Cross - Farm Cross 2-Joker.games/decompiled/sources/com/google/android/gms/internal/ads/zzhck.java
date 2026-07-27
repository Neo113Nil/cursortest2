package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhck extends zzhcl {
    final /* synthetic */ zzhcm zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhck(zzhcm zzhcmVar, Callable callable, Executor executor) {
        super(zzhcmVar, executor);
        Objects.requireNonNull(zzhcmVar);
        this.zza = zzhcmVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcl
    final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final String zzc() {
        return this.zzc.toString();
    }
}

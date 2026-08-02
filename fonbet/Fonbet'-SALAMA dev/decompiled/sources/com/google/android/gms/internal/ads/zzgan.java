package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzgan extends zzgao {
    final /* synthetic */ zzgap zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgan(zzgap zzgapVar, Callable callable, Executor executor) {
        super(zzgapVar, executor);
        this.zza = zzgapVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgao
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhbi extends com.google.android.gms.internal.ads.zzhbj {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhbk zza;
    private final java.util.concurrent.Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhbi(com.google.android.gms.internal.ads.zzhbk zzhbkVar, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        super(zzhbkVar, executor);
        java.util.Objects.requireNonNull(zzhbkVar);
        this.zza = zzhbkVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final java.lang.Object zza() throws java.lang.Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhbj
    final void zzb(java.lang.Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final java.lang.String zzc() {
        return this.zzc.toString();
    }
}

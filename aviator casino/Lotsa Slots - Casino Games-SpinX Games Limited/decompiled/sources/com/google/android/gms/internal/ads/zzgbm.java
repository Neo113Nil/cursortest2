package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgbm extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object zza;
    /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgce zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbm(com.google.android.gms.internal.ads.zzgce zzgceVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.zzc = zzgceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object zzA;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzA = this.zzc.zzA(this);
        return zzA;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgbr extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    /* synthetic */ java.lang.Object zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgat zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbr(com.google.android.gms.internal.ads.zzgat zzgatVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgatVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbr zzgbrVar = new com.google.android.gms.internal.ads.zzgbr(this.zzb, continuation);
        zzgbrVar.zza = obj;
        return zzgbrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.ads.zzgbr) create((com.google.android.gms.internal.ads.zzgax) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.google.android.gms.internal.ads.zzgaz zza = com.google.android.gms.internal.ads.zzgay.zza((com.google.android.gms.internal.ads.zzgav) ((com.google.android.gms.internal.ads.zzgax) this.zza).zzcc());
        com.google.android.gms.internal.ads.zzihj zzb = zza.zzb();
        com.google.android.gms.internal.ads.zzgat zzgatVar = this.zzb;
        java.lang.String zza2 = zzgatVar.zza();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzgatVar);
        return zza.zza();
    }
}

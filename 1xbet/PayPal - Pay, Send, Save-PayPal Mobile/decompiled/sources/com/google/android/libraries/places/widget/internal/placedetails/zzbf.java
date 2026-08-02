package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzbf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int zza;
    final /* synthetic */ java.util.List zzb;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzbj zzc;
    private /* synthetic */ java.lang.Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.internal.placedetails.zzbf) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.zzd;
            kotlinx.coroutines.flow.Flow asFlow = kotlinx.coroutines.flow.FlowKt.asFlow(this.zzb);
            com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = this.zzc;
            this.zza = 1;
            if (kotlinx.coroutines.flow.FlowKt.collect(com.google.android.libraries.places.internal.zzsr.zza(asFlow, kotlinx.coroutines.flow.FlowKt.getDEFAULT_CONCURRENCY(), new com.google.android.libraries.places.widget.internal.placedetails.zzbe(coroutineScope, zzbjVar, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.widget.internal.placedetails.zzbf zzbfVar = new com.google.android.libraries.places.widget.internal.placedetails.zzbf(this.zzb, this.zzc, continuation);
        zzbfVar.zzd = obj;
        return zzbfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbf(java.util.List list, com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = list;
        this.zzc = zzbjVar;
    }
}

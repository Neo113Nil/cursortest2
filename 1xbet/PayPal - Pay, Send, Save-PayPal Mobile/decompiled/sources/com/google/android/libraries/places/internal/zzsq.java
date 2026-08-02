package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzsq extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int zza;
    final /* synthetic */ kotlinx.coroutines.flow.Flow zzb;
    final /* synthetic */ kotlin.jvm.functions.Function2 zzc;
    private /* synthetic */ java.lang.Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.internal.zzsq) create((kotlinx.coroutines.channels.ProducerScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.zzd;
            this.zza = 1;
            if (this.zzb.collect(new com.google.android.libraries.places.internal.zzsp(producerScope, this.zzc), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.internal.zzsq zzsqVar = new com.google.android.libraries.places.internal.zzsq(this.zzb, this.zzc, continuation);
        zzsqVar.zzd = obj;
        return zzsqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzsq(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = flow;
        this.zzc = function2;
    }
}

package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzso extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int zza;
    final /* synthetic */ kotlin.jvm.functions.Function2 zzb;
    final /* synthetic */ java.lang.Object zzc;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.internal.zzso) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i != 0) {
            return obj;
        }
        kotlin.jvm.functions.Function2 function2 = this.zzb;
        java.lang.Object obj2 = this.zzc;
        this.zza = 1;
        java.lang.Object invoke = function2.invoke(obj2, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.google.android.libraries.places.internal.zzso(this.zzb, this.zzc, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzso(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = function2;
        this.zzc = obj;
    }
}

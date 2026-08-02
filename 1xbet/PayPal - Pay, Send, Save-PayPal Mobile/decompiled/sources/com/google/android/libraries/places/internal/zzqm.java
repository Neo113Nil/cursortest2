package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzqm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzqr zzb;
    final /* synthetic */ com.google.android.libraries.places.api.model.Place zzc;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.internal.zzqm) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object zzo;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i != 0) {
            return obj;
        }
        this.zza = 1;
        zzo = this.zzb.zzo(this.zzc.getPhotoMetadatas(), this);
        return zzo == coroutine_suspended ? coroutine_suspended : zzo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.google.android.libraries.places.internal.zzqm(this.zzb, this.zzc, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzqm(com.google.android.libraries.places.internal.zzqr zzqrVar, com.google.android.libraries.places.api.model.Place place, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = zzqrVar;
        this.zzc = place;
    }
}

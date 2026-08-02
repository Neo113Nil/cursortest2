package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzqn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int zza;
    final /* synthetic */ java.util.List zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzqr zzc;
    private /* synthetic */ java.lang.Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.internal.zzqn) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.MutableLiveData mutableLiveData;
        kotlinx.coroutines.Deferred async$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.zzd;
            java.util.List list = this.zzb;
            com.google.android.libraries.places.internal.zzqr zzqrVar = this.zzc;
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.google.android.libraries.places.internal.zzqm(zzqrVar, (com.google.android.libraries.places.api.model.Place) it.next(), null), 3, null);
                arrayList.add(async$default);
            }
            this.zza = 1;
            obj = kotlinx.coroutines.AwaitKt.awaitAll(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        com.google.android.libraries.places.internal.zzqr zzqrVar2 = this.zzc;
        mutableLiveData = zzqrVar2.zzf;
        mutableLiveData.postValue((java.util.List) obj);
        com.google.android.libraries.places.api.net.PlacesClient zzd = zzqrVar2.zzd();
        if (zzd != null) {
            zzd.zzm();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.internal.zzqn zzqnVar = new com.google.android.libraries.places.internal.zzqn(this.zzb, this.zzc, continuation);
        zzqnVar.zzd = obj;
        return zzqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzqn(java.util.List list, com.google.android.libraries.places.internal.zzqr zzqrVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = list;
        this.zzc = zzqrVar;
    }
}

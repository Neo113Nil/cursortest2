package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzbe extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int zza;
    /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope zzc;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzbj zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.internal.placedetails.zzbe) create((com.google.android.libraries.places.widget.internal.placedetails.zzav) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object zzo;
        com.google.android.libraries.places.widget.internal.placedetails.zzav zzavVar;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzavVar = (com.google.android.libraries.places.widget.internal.placedetails.zzav) this.zzb;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.google.android.libraries.places.widget.internal.placedetails.zzav zzavVar2 = (com.google.android.libraries.places.widget.internal.placedetails.zzav) this.zzb;
            com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = this.zzd;
            com.google.android.libraries.places.api.model.PhotoMetadata zza = zzavVar2.zza();
            int zzb = zzavVar2.zzb();
            this.zzb = zzavVar2;
            this.zza = 1;
            zzo = zzbjVar.zzo(zza, zzb, this);
            if (zzo == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzavVar = zzavVar2;
            obj = zzo;
        }
        zzavVar.zzc().postValue((com.google.android.libraries.places.widget.internal.placedetails.zzbq) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.widget.internal.placedetails.zzbe zzbeVar = new com.google.android.libraries.places.widget.internal.placedetails.zzbe(this.zzc, this.zzd, continuation);
        zzbeVar.zzb = obj;
        return zzbeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbe(kotlinx.coroutines.CoroutineScope coroutineScope, com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzc = coroutineScope;
        this.zzd = zzbjVar;
    }
}

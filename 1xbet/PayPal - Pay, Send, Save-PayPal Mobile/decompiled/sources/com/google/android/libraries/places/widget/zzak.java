package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
final class zzak extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ com.google.android.libraries.places.widget.PlaceDetailsFragment zzb;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzbq zzc;
    final /* synthetic */ android.widget.ImageView zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.zzak) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            final com.google.android.libraries.places.widget.PlaceDetailsFragment placeDetailsFragment = this.zzb;
            zzbjVar = placeDetailsFragment.zzE;
            if (zzbjVar == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zzbjVar = null;
            }
            com.google.android.libraries.places.internal.zzpt zze2 = zzbjVar.zze();
            if (zze2 != null) {
                com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar = this.zzc;
                this.zza = 1;
                if (zze2.zze().zza(((com.google.android.libraries.places.widget.internal.placedetails.zzbm) zzbqVar).zza(), new com.google.android.libraries.places.internal.zzpo(this.zzd, new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.widget.zzaj
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        com.google.android.libraries.places.widget.PlaceDetailsFragment.zze(com.google.android.libraries.places.widget.PlaceDetailsFragment.this, (android.widget.ImageView) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                }), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.google.android.libraries.places.widget.zzak(this.zzb, this.zzc, this.zzd, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzak(com.google.android.libraries.places.widget.PlaceDetailsFragment placeDetailsFragment, com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = placeDetailsFragment;
        this.zzc = zzbqVar;
        this.zzd = imageView;
    }
}

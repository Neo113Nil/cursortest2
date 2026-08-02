package com.google.android.libraries.places.widget.kotlin;

/* loaded from: classes.dex */
final class AutocompleteSupportFragmentKt$placeSelectionEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public static final /* synthetic */ int zzc = 0;
    int zza;
    final /* synthetic */ com.google.android.libraries.places.widget.AutocompleteSupportFragment zzb;
    private /* synthetic */ java.lang.Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1) create((kotlinx.coroutines.channels.ProducerScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.zzd;
            final com.google.android.libraries.places.widget.AutocompleteSupportFragment autocompleteSupportFragment = this.zzb;
            autocompleteSupportFragment.setOnPlaceSelectedListener(new com.google.android.libraries.places.widget.listener.PlaceSelectionListener() { // from class: com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1.1
                @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
                public final void onError(com.google.android.gms.common.api.Status status) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU(new com.google.android.libraries.places.widget.kotlin.PlaceSelectionError(status));
                }

                @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
                public final void onPlaceSelected(com.google.android.libraries.places.api.model.Place place) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU(new com.google.android.libraries.places.widget.kotlin.PlaceSelectionSuccess(place));
                }
            });
            this.zza = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.google.android.libraries.places.widget.kotlin.zza
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ java.lang.Object invoke() {
                    com.google.android.libraries.places.widget.AutocompleteSupportFragment.this.setOnPlaceSelectedListener(null);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1 autocompleteSupportFragmentKt$placeSelectionEvents$1 = new com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1(this.zzb, continuation);
        autocompleteSupportFragmentKt$placeSelectionEvents$1.zzd = obj;
        return autocompleteSupportFragmentKt$placeSelectionEvents$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutocompleteSupportFragmentKt$placeSelectionEvents$1(com.google.android.libraries.places.widget.AutocompleteSupportFragment autocompleteSupportFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = autocompleteSupportFragment;
    }
}

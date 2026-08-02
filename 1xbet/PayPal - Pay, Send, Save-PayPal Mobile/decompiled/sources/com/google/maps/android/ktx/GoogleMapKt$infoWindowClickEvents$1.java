package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/gms/maps/model/Marker;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1", f = "GoogleMap.kt", i = {0}, l = {300}, m = "invokeSuspend", n = {"$this$callbackFlow"}, nl = {303}, s = {"L$0"}, v = 2)
/* loaded from: classes.dex */
final class GoogleMapKt$infoWindowClickEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.google.android.gms.maps.model.Marker>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $this_infoWindowClickEvents;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.$this_infoWindowClickEvents.setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
                public final void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
                    com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1.invokeSuspend$lambda$0(kotlinx.coroutines.channels.ProducerScope.this, marker);
                }
            });
            final com.google.android.gms.maps.GoogleMap googleMap = this.$this_infoWindowClickEvents;
            this.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.label = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1.invokeSuspend$lambda$1(com.google.android.gms.maps.GoogleMap.this);
                    return invokeSuspend$lambda$1;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(kotlinx.coroutines.channels.ProducerScope producerScope, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(marker);
        producerScope.mo9266trySendJP2dKIU(marker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$1(com.google.android.gms.maps.GoogleMap googleMap) {
        googleMap.setOnInfoWindowClickListener(null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.google.android.gms.maps.model.Marker> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1 googleMapKt$infoWindowClickEvents$1 = new com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1(this.$this_infoWindowClickEvents, continuation);
        googleMapKt$infoWindowClickEvents$1.L$0 = obj;
        return googleMapKt$infoWindowClickEvents$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleMapKt$infoWindowClickEvents$1(com.google.android.gms.maps.GoogleMap googleMap, kotlin.coroutines.Continuation<? super com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1> continuation) {
        super(2, continuation);
        this.$this_infoWindowClickEvents = googleMap;
    }
}

package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/gms/maps/model/Marker;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1", f = "GoogleMap.kt", i = {0}, l = {372}, m = "invokeSuspend", n = {"$this$callbackFlow"}, nl = {375}, s = {"L$0"}, v = 2)
/* loaded from: classes.dex */
final class GoogleMapKt$markerClickEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.google.android.gms.maps.model.Marker>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $this_markerClickEvents;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.$this_markerClickEvents.setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
                public final boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
                    boolean invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1.invokeSuspend$lambda$0(kotlinx.coroutines.channels.ProducerScope.this, marker);
                    return invokeSuspend$lambda$0;
                }
            });
            final com.google.android.gms.maps.GoogleMap googleMap = this.$this_markerClickEvents;
            this.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.label = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1.invokeSuspend$lambda$1(com.google.android.gms.maps.GoogleMap.this);
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
    public static final boolean invokeSuspend$lambda$0(kotlinx.coroutines.channels.ProducerScope producerScope, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(marker);
        return kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(producerScope.mo9266trySendJP2dKIU(marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$1(com.google.android.gms.maps.GoogleMap googleMap) {
        googleMap.setOnMarkerClickListener(null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.google.android.gms.maps.model.Marker> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1 googleMapKt$markerClickEvents$1 = new com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1(this.$this_markerClickEvents, continuation);
        googleMapKt$markerClickEvents$1.L$0 = obj;
        return googleMapKt$markerClickEvents$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleMapKt$markerClickEvents$1(com.google.android.gms.maps.GoogleMap googleMap, kotlin.coroutines.Continuation<? super com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1> continuation) {
        super(2, continuation);
        this.$this_markerClickEvents = googleMap;
    }
}

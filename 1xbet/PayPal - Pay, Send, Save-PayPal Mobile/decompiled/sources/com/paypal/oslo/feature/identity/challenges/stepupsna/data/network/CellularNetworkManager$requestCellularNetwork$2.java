package com.paypal.oslo.feature.identity.challenges.stepupsna.data.network;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$NetworkUnavailable;", "Landroid/net/Network;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2", f = "CellularNetworkManager.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, nl = {98}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CellularNetworkManager$requestCellularNetwork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable, ? extends android.net.Network>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ android.net.NetworkRequest getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$NetworkUnavailable;", "Landroid/net/Network;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2$1", f = "CellularNetworkManager.kt", i = {0, 0}, l = {111}, m = "invokeSuspend", n = {"$this$callbackFlow", com.sun.jna.Callback.METHOD_NAME}, nl = {114}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable, ? extends android.net.Network>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ android.net.NetworkRequest getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager getHighSpeedVideoSizes;

        /* JADX WARN: Type inference failed for: r7v1, types: [com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2$1$callback$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final ?? r7 = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2$1$callback$1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(android.net.Network network) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                        producerScope.mo9266trySendJP2dKIU(arrow.core.EitherKt.right(network));
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onUnavailable() {
                        producerScope.mo9266trySendJP2dKIU(arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable.INSTANCE));
                    }
                };
                com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.access$getConnectivityManager(this.getHighSpeedVideoSizes).requestNetwork(this.getHighResolutionOutputSizeshNQ4ISI, (android.net.ConnectivityManager.NetworkCallback) r7);
                final com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7);
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.this, r7);
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

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2$1$callback$1 cellularNetworkManager$requestCellularNetwork$2$1$callback$1) {
            com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.access$getConnectivityManager(cellularNetworkManager).unregisterNetworkCallback(cellularNetworkManager$requestCellularNetwork$2$1$callback$1);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable, ? extends android.net.Network>> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2.AnonymousClass1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, android.net.NetworkRequest networkRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = cellularNetworkManager;
            this.getHighResolutionOutputSizeshNQ4ISI = networkRequest;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null)), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        return either == null ? arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable.INSTANCE) : either;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable, ? extends android.net.Network>> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellularNetworkManager$requestCellularNetwork$2(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, android.net.NetworkRequest networkRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cellularNetworkManager;
        this.getHighSpeedVideoFpsRanges = networkRequest;
    }
}

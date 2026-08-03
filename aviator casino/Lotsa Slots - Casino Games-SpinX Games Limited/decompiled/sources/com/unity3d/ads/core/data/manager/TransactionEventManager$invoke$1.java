package com.unity3d.ads.core.data.manager;

/* compiled from: TransactionEventManager.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class TransactionEventManager$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.manager.TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionEventManager$invoke$1(com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionEventManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.log.Logger logger;
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter;
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter2;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter3;
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (java.lang.Exception e) {
            logger = this.this$0.logger;
            logger.trace(com.unity3d.ads.core.data.manager.TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            billingClientAdapter = this.this$0.billingClientAdapter;
            if (!billingClientAdapter.isInitialized()) {
                final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                billingClientAdapter2 = transactionEventManager.billingClientAdapter;
                billingClientAdapter2.initialize(new com.unity3d.services.store.gpbl.listeners.BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> hasBeenResumed = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);

                    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHasBeenResumed() {
                        return this.hasBeenResumed;
                    }

                    private final void tryResume() {
                        java.lang.Boolean value;
                        java.lang.Boolean bool;
                        if (cancellableContinuationImpl2.isActive()) {
                            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.hasBeenResumed;
                            do {
                                value = mutableStateFlow.getValue();
                                bool = value;
                                bool.booleanValue();
                            } while (!mutableStateFlow.compareAndSet(value, true));
                            if (bool.booleanValue()) {
                                return;
                            }
                            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                        }
                    }

                    private final void tryResumeWithException(java.lang.Exception exception) {
                        java.lang.Boolean value;
                        java.lang.Boolean bool;
                        if (cancellableContinuationImpl2.isActive()) {
                            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.hasBeenResumed;
                            do {
                                value = mutableStateFlow.getValue();
                                bool = value;
                                bool.booleanValue();
                            } while (!mutableStateFlow.compareAndSet(value, true));
                            if (bool.booleanValue()) {
                                return;
                            }
                            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(exception)));
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                    public void onIsAlreadyInitialized() {
                        tryResume();
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        if (billingResult.getResponseCode() != com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
                            tryResumeWithException(new com.unity3d.ads.core.data.model.exception.TransactionException("Billing setup failed"));
                        } else {
                            tryResume();
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new com.unity3d.ads.core.data.model.exception.TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                    public void onPurchaseUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> purchases) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        transactionEventManager.onPurchasesReceived(billingResult, purchases, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                    }
                });
                java.lang.Object result = cancellableContinuationImpl.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        sessionRepository = this.this$0.sessionRepository;
        if (sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
            billingClientAdapter3 = this.this$0.billingClientAdapter;
            final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager2 = this.this$0;
            billingClientAdapter3.queryPurchasesAsync("inapp", new com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$$ExternalSyntheticLambda0
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list) {
                    com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1.invokeSuspend$lambda$1(com.unity3d.ads.core.data.manager.TransactionEventManager.this, billingResultBridge, list);
                }
            });
            billingClientAdapter4 = this.this$0.billingClientAdapter;
            final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager3 = this.this$0;
            billingClientAdapter4.queryPurchasesAsync("subs", new com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$$ExternalSyntheticLambda1
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list) {
                    com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1.invokeSuspend$lambda$2(com.unity3d.ads.core.data.manager.TransactionEventManager.this, billingResultBridge, list);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }
}

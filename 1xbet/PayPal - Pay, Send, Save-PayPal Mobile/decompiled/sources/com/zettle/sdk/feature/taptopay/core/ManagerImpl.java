package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\u00020#8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010%R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/ManagerImpl;", "Lcom/zettle/sdk/feature/taptopay/core/Manager;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/user/UserModule;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "p1", "Landroid/content/Context;", "p2", "Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractor;", "p3", "<init>", "(Lcom/zettle/sdk/core/user/UserModule;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractor;)V", "", "", "hasGrantPermission", "([I)Z", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;I)Z", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getRefund", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "getRetrieveTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "getTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ManagerImpl implements com.zettle.sdk.feature.taptopay.core.Manager, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor getHighSpeedVideoFpsRangesFor;

    public ManagerImpl(com.zettle.sdk.core.user.UserModule userModule, kotlinx.coroutines.CoroutineScope coroutineScope, android.content.Context context, com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor tapToPayEngineInteractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayEngineInteractor, "");
        this.getHighSpeedVideoFpsRangesFor = tapToPayEngineInteractor;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.transaction.Transaction>() { // from class: com.zettle.sdk.feature.taptopay.core.ManagerImpl$transaction$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.transaction.Transaction invoke() {
                return com.zettle.sdk.feature.taptopay.core.ManagerImpl.this.getHighSpeedVideoFpsRangesFor.getTransaction();
            }

            {
                super(0);
            }
        });
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.refunds.Refund>() { // from class: com.zettle.sdk.feature.taptopay.core.ManagerImpl$refund$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.refunds.Refund invoke() {
                return com.zettle.sdk.feature.taptopay.core.ManagerImpl.this.getHighSpeedVideoFpsRangesFor.getRefund();
            }

            {
                super(0);
            }
        });
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction>() { // from class: com.zettle.sdk.feature.taptopay.core.ManagerImpl$retrieveTransaction$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction invoke() {
                return com.zettle.sdk.feature.taptopay.core.ManagerImpl.this.getHighSpeedVideoFpsRangesFor.getRetrieveTransaction();
            }

            {
                super(0);
            }
        });
        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope, new com.zettle.sdk.feature.taptopay.core.ManagerImpl.AnonymousClass1(userModule, this, context, null));
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final com.zettle.sdk.feature.taptopay.core.transaction.Transaction getTransaction() {
        return (com.zettle.sdk.feature.taptopay.core.transaction.Transaction) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final com.zettle.sdk.feature.taptopay.core.refunds.Refund getRefund() {
        return (com.zettle.sdk.feature.taptopay.core.refunds.Refund) this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction getRetrieveTransaction() {
        return (com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction) this.getHighSpeedVideoFpsRanges.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.ManagerImpl$1", f = "Manager.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.zettle.sdk.feature.taptopay.core.ManagerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.zettle.sdk.feature.taptopay.core.ManagerImpl getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.zettle.sdk.core.user.UserModule getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.Merchant> merchant = this.getHighSpeedVideoFpsRanges.getMerchant();
                final com.zettle.sdk.feature.taptopay.core.ManagerImpl managerImpl = this.getHighResolutionOutputSizeshNQ4ISI;
                final android.content.Context context = this.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = 1;
                if (merchant.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.zettle.sdk.feature.taptopay.core.ManagerImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object emit(com.zettle.sdk.core.auth.Merchant merchant2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        if (!(merchant2 instanceof com.zettle.sdk.core.auth.Merchant.Initializing)) {
                            if (merchant2 instanceof com.zettle.sdk.core.auth.Merchant.LoggedOut) {
                                com.zettle.sdk.feature.taptopay.core.ManagerImpl.this.getHighSpeedVideoFpsRangesFor.getAttestation().action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut(context));
                            } else if (merchant2 instanceof com.zettle.sdk.core.auth.Merchant.LoggedIn) {
                                com.zettle.sdk.feature.taptopay.core.ManagerImpl.this.getHighSpeedVideoFpsRangesFor.configure(((com.zettle.sdk.core.auth.Merchant.LoggedIn) merchant2).getOrganizationId());
                            }
                        }
                        return kotlin.Unit.INSTANCE;
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

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.zettle.sdk.feature.taptopay.core.ManagerImpl.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.zettle.sdk.feature.taptopay.core.ManagerImpl.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.zettle.sdk.core.user.UserModule userModule, com.zettle.sdk.feature.taptopay.core.ManagerImpl managerImpl, android.content.Context context, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.ManagerImpl.AnonymousClass1> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRanges = userModule;
            this.getHighResolutionOutputSizeshNQ4ISI = managerImpl;
            this.getHighSpeedVideoSizes = context;
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final boolean requestPermissionIfRequired(android.app.Activity p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.requestPermissionIfRequired(p0, p1);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final boolean requestPermissionIfRequired(androidx.fragment.app.Fragment p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.requestPermissionIfRequired(p0, p1);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final boolean hasRequiredPermission(android.content.Context p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.hasRequiredPermission(p0);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Manager
    public final boolean hasGrantPermission(int[] p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.hasGrantPermission(p0);
    }
}

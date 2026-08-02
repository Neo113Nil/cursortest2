package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1", f = "ThalesInitializer.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesInitializer$init$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.init.ThalesInitializer getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r13 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r13 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        android.content.Context context;
        com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.coroutines.AwaitKt.awaitAll(new kotlinx.coroutines.Deferred[]{async$default, async$default2}, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.taptopay.domain.Result result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                    context = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    com.gemalto.mfs.mwsdk.payment.cdcvm.DeviceCVMPreEntryReceiver deviceCVMPreEntryReceiver = new com.gemalto.mfs.mwsdk.payment.cdcvm.DeviceCVMPreEntryReceiver();
                    deviceCVMPreEntryReceiver.init();
                    context.registerReceiver(deviceCVMPreEntryReceiver, new android.content.IntentFilter("android.intent.action.USER_PRESENT"));
                    cardDataSource = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                    cardDataSource.rehydrate$tap_to_pay_data_thales_release();
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation = this.Camera2StreamConfigurationMap;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation2 = this.Camera2StreamConfigurationMap;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(result));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        com.paypal.android.taptopay.domain.Result result2 = (com.paypal.android.taptopay.domain.Result) list.get(0);
        com.paypal.android.taptopay.domain.Result result3 = (com.paypal.android.taptopay.domain.Result) list.get(1);
        if (result2 instanceof com.paypal.android.taptopay.domain.Result.Failure) {
            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation3 = this.Camera2StreamConfigurationMap;
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            continuation3.resumeWith(kotlin.Result.m23436constructorimpl(result2));
            return kotlin.Unit.INSTANCE;
        }
        if (result3 instanceof com.paypal.android.taptopay.domain.Result.Failure) {
            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation4 = this.Camera2StreamConfigurationMap;
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            continuation4.resumeWith(kotlin.Result.m23436constructorimpl(result3));
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoFpsRanges = 2;
        obj = com.paypal.android.taptopay.data.thales.init.ThalesInitializer.access$wseEnrollment(this.getHighSpeedVideoFpsRangesFor, this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/data/thales/init/InitError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1$1", f = "ThalesInitializer.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>>, java.lang.Object> {
        final /* synthetic */ com.paypal.android.taptopay.data.thales.init.ThalesInitializer Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object access$initCps = com.paypal.android.taptopay.data.thales.init.ThalesInitializer.access$initCps(this.Camera2StreamConfigurationMap, this);
            return access$initCps == coroutine_suspended ? coroutine_suspended : access$initCps;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation) {
            return ((com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = thalesInitializer;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/data/thales/init/InitError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1$2", f = "ThalesInitializer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.android.taptopay.data.thales.init.ThalesInitializer getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.android.taptopay.data.thales.init.ThalesMobileGateway thalesMobileGateway;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            thalesMobileGateway = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            return thalesMobileGateway.init$tap_to_pay_data_thales_release();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation) {
            return ((com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = thalesInitializer;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1 thalesInitializer$init$2$1$1 = new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        thalesInitializer$init$2$1$1.getHighSpeedVideoSizes = obj;
        return thalesInitializer$init$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesInitializer$init$2$1$1(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation, com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1> continuation2) {
        super(2, continuation2);
        this.Camera2StreamConfigurationMap = continuation;
        this.getHighSpeedVideoFpsRangesFor = thalesInitializer;
    }
}

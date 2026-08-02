package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1", f = "TapToPayProgressScreen.kt", i = {0, 0, 1, 1}, l = {116, 117}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "collectingStarted", "$this$LaunchedEffect", "collectingStarted"}, nl = {117, 118}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class TapToPayProgressScreenKt$TapToPayProgressScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r19.getHighSpeedVideoFpsRangesFor.createPurchase$business_pay_and_get_paid_prodRelease(r19) == r8) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, CompletableDeferred$default, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null), 3, null);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(CompletableDeferred$default);
            this.getOutputMinFrameDuration = 1;
            if (CompletableDeferred$default.await(this) != coroutine_suspended) {
                completableDeferred = CompletableDeferred$default;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred);
        this.getOutputMinFrameDuration = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1$1", f = "TapToPayProgressScreen.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"$this$launch"}, nl = {115}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        private /* synthetic */ java.lang.Object getInputFormats;
        final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow onStart = kotlinx.coroutines.flow.FlowKt.onStart(this.getOutputMinFrameDuration.getEffects(), new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.C01191(this.Camera2StreamConfigurationMap, null));
                final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel = this.getOutputMinFrameDuration;
                final android.content.Context context = this.getHighSpeedVideoSizes;
                final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.getHighSpeedVideoFpsRanges;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizesFor = 1;
                if (onStart.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.TapToPayProgressScreen.1.1.1.2

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1$1$2$1", f = "TapToPayProgressScreen.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, nl = {104}, s = {}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    static final class C01201 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
                        final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect getHighResolutionOutputSizeshNQ4ISI;
                        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> getHighSpeedVideoFpsRanges;
                        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
                        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> getHighSpeedVideoSizes;
                        int getHighSpeedVideoSizesFor;
                        final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel getInputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoSizesFor;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect tapToPayProgressUiEffect = this.getHighResolutionOutputSizeshNQ4ISI;
                                if (tapToPayProgressUiEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK) {
                                    arrow.core.Either<java.lang.Throwable, android.content.Intent> createZettleIntent = this.getInputFormats.createZettleIntent(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK) tapToPayProgressUiEffect).getAmount(), ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK) this.getHighResolutionOutputSizeshNQ4ISI).getReferenceID());
                                    androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.getHighSpeedVideoFpsRanges;
                                    if (createZettleIntent.isRight()) {
                                        managedActivityResultLauncher.launch((android.content.Intent) ((arrow.core.Either.Right) createZettleIntent).getValue());
                                    }
                                    com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel = this.getInputFormats;
                                    if (createZettleIntent.isLeft()) {
                                        java.lang.Throwable th = (java.lang.Throwable) ((arrow.core.Either.Left) createZettleIntent).getValue();
                                        com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log.e("Zettle intent creation failed", th);
                                        tapToPayProgressViewModel.setFailure(th instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.InvalidLowAmount ? com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.BELOW_MINIMUM : com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE);
                                    }
                                } else if (tapToPayProgressUiEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure) {
                                    this.getInputFormats.setFailure(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure) tapToPayProgressUiEffect).getType());
                                } else if (tapToPayProgressUiEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment) {
                                    this.getHighSpeedVideoSizesFor = 1;
                                    if (this.getInputFormats.updatePurchase(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment) tapToPayProgressUiEffect).getPaymentPayload(), ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment) this.getHighResolutionOutputSizeshNQ4ISI).getPaymentRequest(), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (tapToPayProgressUiEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess) {
                                    this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess) this.getHighResolutionOutputSizeshNQ4ISI).getPaymentRequest(), ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess) this.getHighResolutionOutputSizeshNQ4ISI).getPaymentPayload()));
                                } else {
                                    if (!(tapToPayProgressUiEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnCancelled)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    this.Camera2StreamConfigurationMap.invoke();
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.AnonymousClass2.C01201) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.AnonymousClass2.C01201(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C01201(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect tapToPayProgressUiEffect, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, android.content.Context context, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> managedActivityResultLauncher, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.AnonymousClass2.C01201> continuation) {
                            super(2, continuation);
                            this.getHighResolutionOutputSizeshNQ4ISI = tapToPayProgressUiEffect;
                            this.getInputFormats = tapToPayProgressViewModel;
                            this.getHighSpeedVideoFpsRangesFor = context;
                            this.getHighSpeedVideoSizes = function1;
                            this.Camera2StreamConfigurationMap = function0;
                            this.getHighSpeedVideoFpsRanges = managedActivityResultLauncher;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.AnonymousClass2.C01201((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect) obj2, tapToPayProgressViewModel, context, function1, function0, managedActivityResultLauncher, null), 3, null);
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

        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1$1$1", f = "TapToPayProgressScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01191 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighSpeedVideoFpsRanges;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.complete(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.C01191) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.C01191(this.getHighSpeedVideoFpsRanges, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01191(kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1.C01191> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = completableDeferred;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred, android.content.Context context, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> managedActivityResultLauncher, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputMinFrameDuration = tapToPayProgressViewModel;
            this.Camera2StreamConfigurationMap = completableDeferred;
            this.getHighSpeedVideoSizes = context;
            this.getHighSpeedVideoFpsRangesFor = function1;
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
            this.getHighSpeedVideoFpsRanges = managedActivityResultLauncher;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1 tapToPayProgressScreenKt$TapToPayProgressScreen$1$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        tapToPayProgressScreenKt$TapToPayProgressScreen$1$1.getOutputFormats = obj;
        return tapToPayProgressScreenKt$TapToPayProgressScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapToPayProgressScreenKt$TapToPayProgressScreen$1$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, android.content.Context context, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> managedActivityResultLauncher, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = tapToPayProgressViewModel;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = managedActivityResultLauncher;
    }
}

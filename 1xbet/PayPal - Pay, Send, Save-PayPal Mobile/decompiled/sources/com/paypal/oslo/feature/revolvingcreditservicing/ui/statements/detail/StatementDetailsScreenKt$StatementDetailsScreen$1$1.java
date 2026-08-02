package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1", f = "StatementDetailsScreen.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, nl = {101}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class StatementDetailsScreenKt$StatementDetailsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.LifecycleOwner Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs, kotlin.Unit> getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1$1", f = "StatementDetailsScreen.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"$this$repeatOnLifecycle"}, nl = {100}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect> uiEffect = this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect();
                final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
                final android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = 1;
                if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.StatementDetailsScreen.1.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return getHighSpeedVideoSizes((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect) obj2);
                    }

                    private java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect statementDetailsUiEffect) {
                        java.lang.Object m23436constructorimpl;
                        if (statementDetailsUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect.OpenLearnMore) {
                            function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect.OpenLearnMore) statementDetailsUiEffect).getUrl(), (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, false, (java.lang.String) null, false, false, false, 250, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(statementDetailsUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect.NavigateBack.INSTANCE)) {
                            function0.invoke();
                        } else {
                            if (!(statementDetailsUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect.OpenPdf)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            android.content.Intent createPdfIntent = com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.utils.PdfIntentHelper.INSTANCE.createPdfIntent(context, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect.OpenPdf) statementDetailsUiEffect).getFilePath());
                            if (createPdfIntent != null) {
                                android.content.Context context2 = context;
                                try {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    context2.startActivity(android.content.Intent.createChooser(createPdfIntent, null));
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                                } catch (java.lang.Throwable th) {
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                }
                                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                                if (kotlin.Result.m23442isSuccessimpl(m23436constructorimpl)) {
                                    function02.invoke();
                                }
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel2 = statementDetailsViewModel;
                                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                if (m23439exceptionOrNullimpl != null && (m23439exceptionOrNullimpl instanceof android.content.ActivityNotFoundException)) {
                                    statementDetailsViewModel2.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnNoPdfReaderError.INSTANCE);
                                }
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getInputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = statementDetailsViewModel;
            this.getHighSpeedVideoFpsRanges = function1;
            this.Camera2StreamConfigurationMap = function0;
            this.getHighSpeedVideoFpsRangesFor = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.Camera2StreamConfigurationMap, androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StatementDetailsScreenKt$StatementDetailsScreen$1$1(androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = lifecycleOwner;
        this.getHighSpeedVideoFpsRangesFor = statementDetailsViewModel;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}

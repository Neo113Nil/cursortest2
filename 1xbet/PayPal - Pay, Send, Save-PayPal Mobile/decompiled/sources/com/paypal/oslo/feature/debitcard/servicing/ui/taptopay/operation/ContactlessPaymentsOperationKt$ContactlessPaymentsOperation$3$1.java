package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1", f = "ContactlessPaymentsOperation.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, nl = {119}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEffect contactlessPaymentsOperationEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEffect) obj;
            if (contactlessPaymentsOperationEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEffect.NavigateToActivateContactless) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.Camera2StreamConfigurationMap;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(contactlessPaymentsOperationEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEffect.NavigateToDeactivateContactless)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.toSetupFlowDestination(debitInstrument));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = function0;
            this.Camera2StreamConfigurationMap = debitInstrument;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = contactlessPaymentsOperationViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = debitInstrument;
    }
}

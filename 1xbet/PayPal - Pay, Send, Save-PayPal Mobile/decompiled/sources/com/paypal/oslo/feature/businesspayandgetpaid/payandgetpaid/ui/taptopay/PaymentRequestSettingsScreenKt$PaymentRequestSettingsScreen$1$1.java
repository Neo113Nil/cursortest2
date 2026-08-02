package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1", f = "PaymentRequestSettingsScreen.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            if (!(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsEffect) obj) instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsEffect.NavigateBack)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getEffects$business_pay_and_get_paid_prodRelease().collect(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel paymentRequestSettingsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = paymentRequestSettingsViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}

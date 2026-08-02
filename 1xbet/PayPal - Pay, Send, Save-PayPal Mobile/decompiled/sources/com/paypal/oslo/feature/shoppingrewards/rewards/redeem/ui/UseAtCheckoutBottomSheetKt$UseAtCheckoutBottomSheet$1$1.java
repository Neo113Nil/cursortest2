package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1", f = "UseAtCheckoutBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public final void getHighSpeedVideoSizes() {
            ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel) this.receiver).onClose();
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoSizes();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(java.lang.Object obj) {
            super(0, obj, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel.class, "onClose", "onClose()V", 0);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = useAtCheckoutViewModel;
    }
}

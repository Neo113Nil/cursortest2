package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$3$1", f = "AddEditPhoneScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneScreenKt$AddEditPhoneScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult confirmationBottomSheetNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$3$1.WhenMappings.$EnumSwitchMapping$0[confirmationBottomSheetNavResult.getAction().ordinal()];
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI.onConfirmPhoneSave();
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onCancelPhoneSave();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult confirmationBottomSheetNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$3$1) create(confirmationBottomSheetNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.values().length];
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.PRIMARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.SECONDARY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$3$1 addEditPhoneScreenKt$AddEditPhoneScreen$3$1 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        addEditPhoneScreenKt$AddEditPhoneScreen$3$1.Camera2StreamConfigurationMap = obj;
        return addEditPhoneScreenKt$AddEditPhoneScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneScreenKt$AddEditPhoneScreen$3$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addEditPhoneViewModel;
    }
}

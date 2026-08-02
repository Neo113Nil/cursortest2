package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$performUpdateWithInstrument$1", f = "UpdateFiViewModel.kt", i = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {282, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UpdateFiViewModel$performUpdateWithInstrument$1$2", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UpdateFiViewModel$performUpdateWithInstrument$1$2", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UpdateFiViewModel$performUpdateWithInstrument$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiViewModel$performUpdateWithInstrument$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel getOutputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.access$handleDetailFiUpdateSuccess(r1, r6, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        if (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.access$handleBulkFiUpdateSuccess(r1, r6, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
    
        if (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.access$handleBulkFiUpdateSuccess(r1, r6, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        if (r13 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase updatePreferredFundingInstrumentUseCase;
        java.util.List<java.lang.String> list;
        com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            updatePreferredFundingInstrumentUseCase = this.getOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            list = this.getOutputSizeshNQ4ISI.getInputFormats;
            this.getInputFormats = 1;
            obj = updatePreferredFundingInstrumentUseCase.invoke(list, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputSizeshNQ4ISI.getAgreementType(), this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel = this.getOutputSizeshNQ4ISI;
        if (either.isLeft()) {
            updateFiViewModel.Camera2StreamConfigurationMap();
        }
        com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel2 = this.getOutputSizeshNQ4ISI;
        if (either.isRight()) {
            com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult bulkUpdateFiResult = (com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult) ((arrow.core.Either.Right) either).getValue();
            updateFiSource = updateFiViewModel2.getOutputMinFrameDuration;
            int i2 = updateFiSource == null ? -1 : com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$performUpdateWithInstrument$1.WhenMappings.$EnumSwitchMapping$0[updateFiSource.ordinal()];
            if (i2 == 1) {
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = either;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bulkUpdateFiResult);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputFormats = 2;
            } else if (i2 == 2) {
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = either;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bulkUpdateFiResult);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputFormats = 3;
            } else {
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = either;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bulkUpdateFiResult);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputFormats = 4;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$performUpdateWithInstrument$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI_POST_UPDATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$performUpdateWithInstrument$1(this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiViewModel$performUpdateWithInstrument$1(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$performUpdateWithInstrument$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = updateFiViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = balancePreference;
    }
}

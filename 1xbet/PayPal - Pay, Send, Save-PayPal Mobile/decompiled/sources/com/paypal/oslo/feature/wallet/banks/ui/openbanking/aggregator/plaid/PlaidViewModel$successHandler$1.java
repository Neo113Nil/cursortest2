package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$successHandler$1", f = "PlaidViewModel.kt", i = {0, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 300}, m = "invokeSuspend", n = {"jsonData", "jsonData", "jsonData"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 300, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PlaidViewModel$successHandler$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.plaid.link.result.LinkSuccessMetadata getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.access$handleConfirmationAction(r6.getHighSpeedVideoSizes, r7, "Bank successfully reconnected.", "Failed to reconnect bank.", r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.access$handleConfirmationAction(r6.getHighSpeedVideoSizes, r7, "Bank successfully Confirmed.", "Failed to confirm bank.", r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.access$handleAddAction(r6.getHighSpeedVideoSizes, r7, r6) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.serialization.json.JsonElement parseToJsonElement = kotlinx.serialization.json.Json.INSTANCE.parseToJsonElement(this.getHighSpeedVideoFpsRanges.getMetadataJson());
            kotlinx.serialization.json.JsonObject jsonObject = parseToJsonElement instanceof kotlinx.serialization.json.JsonObject ? (kotlinx.serialization.json.JsonObject) parseToJsonElement : null;
            int i2 = com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$successHandler$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.getAction().ordinal()];
            if (i2 == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(jsonObject);
                this.Camera2StreamConfigurationMap = 1;
            } else if (i2 == 2) {
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(jsonObject);
                this.Camera2StreamConfigurationMap = 2;
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(jsonObject);
                this.Camera2StreamConfigurationMap = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$successHandler$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.CONFIRM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.RECONSENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$successHandler$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaidViewModel$successHandler$1(com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata, com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$successHandler$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = linkSuccessMetadata;
        this.getHighSpeedVideoSizes = plaidViewModel;
    }
}

package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailSavedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1", f = "AllEmailsScreen.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "invokeSuspend", n = {"result", "message"}, nl = {231}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class AllEmailsScreenKt$EmailSavedNavResultEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult emailSavedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Received EmailSavedNavResult from add/edit", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", emailSavedNavResult.getAction().name())), null, 4, null);
            int i2 = com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1.WhenMappings.$EnumSwitchMapping$0[emailSavedNavResult.getAction().ordinal()];
            if (i2 == 1 || i2 == 2) {
                string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_your_email_is_good_to_go);
            } else {
                string = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            if (string.length() > 0) {
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailSavedNavResult);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(string);
                this.getHighSpeedVideoSizes = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.showToast(string, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult emailSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1) create(emailSavedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.EDIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1 allEmailsScreenKt$EmailSavedNavResultEffect$1$1 = new com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        allEmailsScreenKt$EmailSavedNavResultEffect$1$1.Camera2StreamConfigurationMap = obj;
        return allEmailsScreenKt$EmailSavedNavResultEffect$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllEmailsScreenKt$EmailSavedNavResultEffect$1$1(android.content.Context context, com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailSavedNavResultEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighResolutionOutputSizeshNQ4ISI = commonToastHostState;
    }
}

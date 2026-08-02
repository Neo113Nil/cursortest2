package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailActionNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1", f = "AllEmailsScreen.kt", i = {0, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 186, 193}, m = "invokeSuspend", n = {"result", "result", "result"}, nl = {186, 193, 199}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailActionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighSpeedVideoSizes;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r13.showToast(r4, r12) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (r13.showToast(r3, r12) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        if (r13.showToast(r3, r12) == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.core.userstore.model.ProfileEmail email;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailActionNavResult emailActionNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.EmailActionNavResult) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Received EmailActionNavResult from options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", emailActionNavResult.getAction().name())), null, 4, null);
            int i2 = com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1.WhenMappings.$EnumSwitchMapping$0[emailActionNavResult.getAction().ordinal()];
            if (i2 == 1) {
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState = this.getHighSpeedVideoSizes;
                java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_you_replaced_your_primary_email);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailActionNavResult);
                this.getOutputFormats = 1;
            } else if (i2 == 2) {
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState2 = this.getHighSpeedVideoSizes;
                android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_deleted;
                com.paypal.oslo.core.userstore.model.ProfileEmail email2 = emailActionNavResult.getEmail();
                java.lang.String string2 = context.getString(i3, email2 != null ? email2.getEmailAddress() : null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailActionNavResult);
                this.getOutputFormats = 2;
            } else if (i2 == 3) {
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState3 = this.getHighSpeedVideoSizes;
                java.lang.String string3 = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_you_confirmed_your_email);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailActionNavResult);
                this.getOutputFormats = 3;
            } else if (i2 == 4 && (email = emailActionNavResult.getEmail()) != null) {
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.userstore.model.ProfileEmail.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination editEmailDestination;
        if (profileEmail.getPrimary()) {
            editEmailDestination = new com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination(profileEmail.getId());
        } else {
            editEmailDestination = new com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination(profileEmail.getId());
        }
        navigationScope.push(editEmailDestination);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailActionNavResult emailActionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1) create(emailActionNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.MAKE_PRIMARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.DELETE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.CONFIRM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.EDIT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1 allEmailsScreenKt$EmailOptionsNavResultEffect$1$1 = new com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        allEmailsScreenKt$EmailOptionsNavResultEffect$1$1.Camera2StreamConfigurationMap = obj;
        return allEmailsScreenKt$EmailOptionsNavResultEffect$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1(com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt$EmailOptionsNavResultEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = commonToastHostState;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
    }
}

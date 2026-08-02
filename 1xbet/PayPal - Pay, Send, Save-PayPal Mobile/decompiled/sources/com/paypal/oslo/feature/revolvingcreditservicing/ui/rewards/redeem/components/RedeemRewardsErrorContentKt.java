package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"RedeemRewardsErrorContent", "", "errorContext", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "onAmountChange", "Lkotlin/Function1;", "", "onRedeemClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onRedemptionOptionSelect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RedeemRewardsErrorContentRedeemingPreview", "(Landroidx/compose/runtime/Composer;I)V", "RedeemRewardsErrorContentInsufficientPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsErrorContentKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedeemRewardsErrorContent(final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext, final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function13;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function14;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function15;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy;
        androidx.compose.ui.Modifier modifier5;
        androidx.compose.runtime.Composer composer3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-839009905);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(errorContext.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(redeemRewardsUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function13 = function12;
                i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                i5 = i3;
                if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    androidx.compose.ui.Modifier modifier6 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.m18625$r8$lambda$JmCnDOwaIdCu1TkWUUNIMYwG2o((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function15 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function15 = function13;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-839009905, i5, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContent (RedeemRewardsErrorContent.kt:37)");
                    }
                    int i7 = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.WhenMappings.$EnumSwitchMapping$0[errorContext.ordinal()];
                    if (i7 == 1) {
                        androidx.compose.ui.Modifier modifier7 = modifier6;
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1765982240);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        modifier4 = modifier7;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), stringResOnly, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), function0, composer2, (i5 >> 3) & 896, 0);
                        composer2.endReplaceGroup();
                    } else if (i7 == 2) {
                        androidx.compose.ui.Modifier modifier8 = modifier6;
                        startRestartGroup.startReplaceGroup(1766881147);
                        if (redeemRewardsUiModel != null) {
                            startRestartGroup.startReplaceGroup(1766931336);
                            copy = redeemRewardsUiModel.copy((r26 & 1) != 0 ? redeemRewardsUiModel.availableRewards : null, (r26 & 2) != 0 ? redeemRewardsUiModel.isPayPalPlusEligible : false, (r26 & 4) != 0 ? redeemRewardsUiModel.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? redeemRewardsUiModel.payPalPlusConversionRate : null, (r26 & 16) != 0 ? redeemRewardsUiModel.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? redeemRewardsUiModel.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? redeemRewardsUiModel.rewardsCalculation : null, (r26 & 128) != 0 ? redeemRewardsUiModel.selectedRedemptionOption : null, (r26 & 256) != 0 ? redeemRewardsUiModel.enteredAmount : null, (r26 & 512) != 0 ? redeemRewardsUiModel.validationError : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_enter_amount_greater_than_zero, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r26 & 1024) != 0 ? redeemRewardsUiModel.termsText : null, (r26 & 2048) != 0 ? redeemRewardsUiModel.termsLinkText : null);
                            int i8 = i5 << 3;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsContentKt.RedeemRewardsContent(copy, false, function1, function0, false, modifier8, function15, null, startRestartGroup, (i5 & 7168) | (i5 & 896) | 24624 | (i8 & 458752) | (i8 & 3670016), 128);
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(1767540083);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        modifier4 = modifier8;
                    } else {
                        if (i7 != 3) {
                            startRestartGroup.startReplaceGroup(1165344783);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(1767637237);
                        if (redeemRewardsUiModel != null) {
                            startRestartGroup.startReplaceGroup(1767687426);
                            modifier5 = modifier6;
                            copy2 = redeemRewardsUiModel.copy((r26 & 1) != 0 ? redeemRewardsUiModel.availableRewards : null, (r26 & 2) != 0 ? redeemRewardsUiModel.isPayPalPlusEligible : false, (r26 & 4) != 0 ? redeemRewardsUiModel.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? redeemRewardsUiModel.payPalPlusConversionRate : null, (r26 & 16) != 0 ? redeemRewardsUiModel.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? redeemRewardsUiModel.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? redeemRewardsUiModel.rewardsCalculation : null, (r26 & 128) != 0 ? redeemRewardsUiModel.selectedRedemptionOption : null, (r26 & 256) != 0 ? redeemRewardsUiModel.enteredAmount : null, (r26 & 512) != 0 ? redeemRewardsUiModel.validationError : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_less_equal_balance_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r26 & 1024) != 0 ? redeemRewardsUiModel.termsText : null, (r26 & 2048) != 0 ? redeemRewardsUiModel.termsLinkText : null);
                            int i9 = i5 << 3;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsContentKt.RedeemRewardsContent(copy2, false, function1, function0, false, modifier5, function15, null, startRestartGroup, (i5 & 896) | 24624 | (i5 & 7168) | (i9 & 458752) | (i9 & 3670016), 128);
                            startRestartGroup.endReplaceGroup();
                            composer3 = startRestartGroup;
                        } else {
                            modifier5 = modifier6;
                            composer3 = startRestartGroup;
                            composer3.startReplaceGroup(1768301939);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                        modifier4 = modifier5;
                        composer2 = composer3;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function14 = function15;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    function14 = function13;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.m18626$r8$lambda$ZygcR8rCiEarWEb9sia5zOGniQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.this, redeemRewardsUiModel, function1, function0, modifier3, function14, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function13 = function12;
            i5 = i3;
            if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function13 = function12;
        i5 = i3;
        if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$CvLRS1QiXPkOOHq-EVkAPXTNtoE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18623$r8$lambda$CvLRS1QiXPkOOHqEVkAPXTNtoE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(190087651);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(190087651, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentInsufficientPreview (RedeemRewardsErrorContent.kt:112)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.INSUFFICIENT_REWARDS;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "150.00"), false, null, null, null, null, null, null, "200.00", null, null, null, 3324, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.m18624$r8$lambda$G85W7xgf6EfpXBsfADTSOzuxXI((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RedeemRewardsErrorContent(errorContext, redeemRewardsUiModel, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 3462, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.m18623$r8$lambda$CvLRS1QiXPkOOHqEVkAPXTNtoE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DdHV63NAN_TdYmTR8AgjhRkVeCY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1463582986);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1463582986, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentRedeemingPreview (RedeemRewardsErrorContent.kt:99)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.REDEEMING_REWARDS;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.$r8$lambda$hOYo6iVDXIaTm_UccMKms5vD4yY((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RedeemRewardsErrorContent(errorContext, null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 3510, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.$r8$lambda$DdHV63NAN_TdYmTR8AgjhRkVeCY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G85W7xgf6EfpXBsfADTSO-zuxXI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18624$r8$lambda$G85W7xgf6EfpXBsfADTSOzuxXI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JmCnDOwaIdCu1TkWUUNIMY-wG2o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18625$r8$lambda$JmCnDOwaIdCu1TkWUUNIMYwG2o(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZygcR8rC-iEarWEb9sia5zOGniQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18626$r8$lambda$ZygcR8rCiEarWEb9sia5zOGniQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedeemRewardsErrorContent(errorContext, redeemRewardsUiModel, function1, function0, modifier, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hOYo6iVDXIaTm_UccMKms5vD4yY(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.REDEEMING_REWARDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.INVALID_AMOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.INSUFFICIENT_REWARDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

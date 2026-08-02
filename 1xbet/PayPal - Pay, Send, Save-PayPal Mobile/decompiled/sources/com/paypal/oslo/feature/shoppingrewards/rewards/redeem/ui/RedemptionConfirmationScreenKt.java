package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"RedemptionConfirmationContent", "", "successScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "redeemType", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "formattedAmount", "", "convertedAmount", "charityName", "charityLogoUrl", "onActivityClick", "Lkotlin/Function0;", "onDoneClick", "onCloseClick", "(Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedemptionConfirmationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedemptionConfirmationContent(final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, final java.lang.String str, final java.lang.String str2, java.lang.String str3, java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str5;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str6;
        final java.lang.String str7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        java.lang.String str8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1411678257);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(successScreenComponents) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(redeemType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            str5 = str3;
            i3 |= startRestartGroup.changed(str5) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                str6 = str4;
                str7 = str5;
            } else {
                java.lang.String str9 = i5 != 0 ? null : str5;
                java.lang.String str10 = i4 != 0 ? null : str4;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1411678257, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationContent (RedemptionConfirmationScreen.kt:70)");
                }
                int i6 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt.WhenMappings.$EnumSwitchMapping$0[redeemType.ordinal()];
                if (i6 == 1) {
                    startRestartGroup.startReplaceGroup(-586846853);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_balance_confirmation_footnote, new java.lang.Object[]{str}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i6 == 2) {
                    startRestartGroup.startReplaceGroup(-586842085);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_savings_confirmation_footnote, new java.lang.Object[]{str}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i6 != 3) {
                        startRestartGroup.startReplaceGroup(-586848483);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-586837298);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_charity_confirmation_view_details, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.oslo.feature.shoppingrewards.shared.utils.ExtractedLinks extractLinksFromTags = com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt.extractLinksFromTags(stringResource);
                int i7 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt.WhenMappings.$EnumSwitchMapping$0[redeemType.ordinal()];
                if (i7 == 1) {
                    startRestartGroup.startReplaceGroup(-586829638);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_balance_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i7 == 2) {
                    startRestartGroup.startReplaceGroup(-586826310);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_savings_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i7 != 3) {
                        startRestartGroup.startReplaceGroup(-586831025);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-586822630);
                    startRestartGroup.endReplaceGroup();
                    stringResource2 = str9 == null ? "" : str9;
                }
                int i8 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt.WhenMappings.$EnumSwitchMapping$0[redeemType.ordinal()];
                if (i8 == 1 || i8 == 2) {
                    str8 = "https://www.paypalobjects.com/webstatic/icon/pp64.png";
                } else {
                    if (i8 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str8 = str10;
                }
                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO, null, null, false, false, 247, null), true, true, false, false, false, 64, null);
                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_shared_action_done, startRestartGroup, 0), false, null, false, null, false, false, false, false, null, null, null, null, null, 16382, null), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.SENT, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", str2), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(str8, stringResource2, null), null, null, null, null, 120, null), null, extractLinksFromTags.getPlainText(), extractLinksFromTags.getLinks(), null, null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "0"), 100, null);
                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion companion = com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.INSTANCE;
                com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks invoke$default = com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.INSTANCE, function02, null, null, null, null, null, 62, null);
                boolean z = (3670016 & i3) == 1048576;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt.$r8$lambda$HCUkrNUOJQcb003rIpAoNGhbFnM(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents.ComposeDefaultImpls.Content$default(mMPSuccessScreenConfig, mMPSuccessScreenData, companion.invoke(function03, invoke$default, (kotlin.jvm.functions.Function2) rememberedValue), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), successScreenComponents, composer2, (i3 << 12) & 57344, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str7 = str9;
                str6 = str10;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt.$r8$lambda$ZIghNC9KrfguIVg8lURvc2ZgnIc(com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents.this, redeemType, str, str2, str7, str6, function0, function02, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str5 = str3;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HCUkrNUOJQcb003rIpAoNGhbFnM(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZIghNC9KrfguIVg8lURvc2ZgnIc(com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedemptionConfirmationContent(successScreenComponents, redeemType, str, str2, str3, str4, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

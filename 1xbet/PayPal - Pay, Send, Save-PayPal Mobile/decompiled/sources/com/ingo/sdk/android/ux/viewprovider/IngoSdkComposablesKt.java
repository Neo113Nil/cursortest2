package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "details", "", "getIconId", "(Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;)Ljava/lang/Integer;", "getColorForIcon", "(Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;Landroidx/compose/runtime/Composer;I)I", "", "type", "getAccountIssuerIconResourceId", "(Ljava/lang/String;)I", "getAccountIssuerIconContentDescription", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;", "account", "Lkotlin/Function1;", "", "onSelection", "Landroidx/compose/runtime/MutableState;", "selectedAccount", "FundingDestinationListItem", "(Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "LegalDisclaimer", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoSdkComposablesKt {
    public static final java.lang.Integer getIconId(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetails, "");
        if (transactionDetails.isCompleted()) {
            return java.lang.Integer.valueOf(com.ingo.sdk.android.ux.R.drawable.ic_success_status_icon);
        }
        if (transactionDetails.isLoadFailed()) {
            return java.lang.Integer.valueOf(com.ingo.sdk.android.ux.R.drawable.ic_alert_status_icon);
        }
        if (transactionDetails.isDeclined()) {
            return java.lang.Integer.valueOf(com.ingo.sdk.android.ux.R.drawable.ic_failure_status);
        }
        if (transactionDetails.isCreditPending()) {
            return java.lang.Integer.valueOf(com.ingo.sdk.android.ux.R.drawable.ic_question_status_icon);
        }
        if (transactionDetails.isVoidRequired()) {
            return java.lang.Integer.valueOf(com.ingo.sdk.android.ux.R.drawable.ic_alert_status_icon);
        }
        return null;
    }

    public static final int getColorForIcon(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetails, "");
        composer.startReplaceGroup(-136687075);
        if (!transactionDetails.isCompleted()) {
            if (!transactionDetails.isLoadFailed()) {
                if (!transactionDetails.isDeclined()) {
                    if (!transactionDetails.isCreditPending()) {
                        if (!transactionDetails.isVoidRequired()) {
                            composer.startReplaceGroup(-415136333);
                            composer.endReplaceGroup();
                            i2 = -1;
                        } else {
                            composer.startReplaceGroup(-415202673);
                            i2 = android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer, 0).getAlertColor());
                            composer.endReplaceGroup();
                        }
                    } else {
                        composer.startReplaceGroup(-415293813);
                        i2 = android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer, 0).getSecondaryColor());
                        composer.endReplaceGroup();
                    }
                } else {
                    composer.startReplaceGroup(-415382225);
                    i2 = android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer, 0).getErrorColor());
                    composer.endReplaceGroup();
                }
            } else {
                composer.startReplaceGroup(-415465553);
                i2 = android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer, 0).getAlertColor());
                composer.endReplaceGroup();
            }
        } else {
            composer.startReplaceGroup(-415554709);
            i2 = android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer, 0).getSecondaryColor());
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return i2;
    }

    public static final int getAccountIssuerIconResourceId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case -2038717326:
                if (lowerCase.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_MASTERCARD)) {
                    return com.ingo.sdk.android.ux.R.drawable.mc2;
                }
                break;
            case 2997727:
                if (lowerCase.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX)) {
                    return com.ingo.sdk.android.ux.R.drawable.amex2;
                }
                break;
            case 3619905:
                if (lowerCase.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_VISA)) {
                    return com.ingo.sdk.android.ux.R.drawable.visa2;
                }
                break;
            case 273184745:
                if (lowerCase.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_DISCOVER)) {
                    return com.ingo.sdk.android.ux.R.drawable.dgn2;
                }
                break;
        }
        return com.ingo.sdk.android.ux.R.drawable.ic_question_status_icon;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final java.lang.String getAccountIssuerIconContentDescription(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        composer.startReplaceGroup(-2031943475);
        switch (str.hashCode()) {
            case -2038717326:
                if (str.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_MASTERCARD)) {
                    composer.startReplaceGroup(1512447489);
                    str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_mc_content_description, composer, 0);
                    composer.endReplaceGroup();
                    break;
                }
                composer.startReplaceGroup(-358303407);
                composer.endReplaceGroup();
                break;
            case 2997727:
                if (str.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX)) {
                    composer.startReplaceGroup(1512453187);
                    str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_amex_content_description, composer, 0);
                    composer.endReplaceGroup();
                    break;
                }
                composer.startReplaceGroup(-358303407);
                composer.endReplaceGroup();
                break;
            case 3619905:
                if (str.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_VISA)) {
                    composer.startReplaceGroup(1512444547);
                    str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_visa_content_description, composer, 0);
                    composer.endReplaceGroup();
                    break;
                }
                composer.startReplaceGroup(-358303407);
                composer.endReplaceGroup();
                break;
            case 273184745:
                if (str.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_DISCOVER)) {
                    composer.startReplaceGroup(1512450311);
                    str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_discover_content_description, composer, 0);
                    composer.endReplaceGroup();
                    break;
                }
                composer.startReplaceGroup(-358303407);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-358303407);
                composer.endReplaceGroup();
                break;
        }
        composer.endReplaceGroup();
        return str2;
    }

    public static final void FundingDestinationListItem(final com.ingo.sdk.kotlin.common.features.customer.model.Account account, final kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function1, final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> mutableState, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1395031498);
        int accountIssuerIconResourceId = getAccountIssuerIconResourceId(account.getAccountIssuer());
        java.lang.String accountIssuerIconContentDescription = getAccountIssuerIconContentDescription(account.getAccountIssuer(), startRestartGroup, 0);
        java.lang.String accountNickname = account.getAccountNickname();
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.m10749$r8$lambda$pIdMF0pw4tfHS31nrb52BzHC3I(kotlin.jvm.functions.Function1.this, account);
            }
        };
        java.lang.String accountId = account.getAccountId();
        com.ingo.sdk.kotlin.common.features.customer.model.Account value = mutableState.getValue();
        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.CoreFundingDestinationListItem(accountIssuerIconResourceId, accountIssuerIconContentDescription, accountNickname, function0, kotlin.jvm.internal.Intrinsics.areEqual(accountId, value != null ? value.getAccountId() : null), startRestartGroup, 0);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.m10750$r8$lambda$yi2b9vuxxoApCuXGO2WeXGmzI(com.ingo.sdk.kotlin.common.features.customer.model.Account.this, function1, mutableState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LegalDisclaimer(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(964327869);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj != null) {
                com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
                java.lang.String legalDisclaimer = configurationResponse != null ? configurationResponse.getLegalDisclaimer() : null;
                startRestartGroup.startReplaceGroup(-993851800);
                if (legalDisclaimer == null) {
                    legalDisclaimer = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_default_legal_disclaimer, startRestartGroup, 0);
                }
                startRestartGroup.endReplaceGroup();
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), legalDisclaimer, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, startRestartGroup, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.m10748$r8$lambda$g8nVKp79q7_mxjb280IMu4zcQE(i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$g8nVKp79q7_mxjb280IM-u4zcQE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10748$r8$lambda$g8nVKp79q7_mxjb280IMu4zcQE(int i, androidx.compose.runtime.Composer composer, int i2) {
        LegalDisclaimer(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pIdMF0pw4tfHS31nrb52BzHC-3I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10749$r8$lambda$pIdMF0pw4tfHS31nrb52BzHC3I(kotlin.jvm.functions.Function1 function1, com.ingo.sdk.kotlin.common.features.customer.model.Account account) {
        function1.invoke(account);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yi2b9-vux-xoApCuXGO2WeXGmzI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10750$r8$lambda$yi2b9vuxxoApCuXGO2WeXGmzI(com.ingo.sdk.kotlin.common.features.customer.model.Account account, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, int i, androidx.compose.runtime.Composer composer, int i2) {
        FundingDestinationListItem(account, function1, mutableState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

package com.paypal.oslo.feature.wallet.preferred.ui.common;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "reason", "", "navigateWithCancellation", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;)V", "", "fundingInstrumentId", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingInstrumentType", "displayName", "navigateWithSuccessResult", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "navigateToAddFi-hN0UB1M", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;)V", "navigateToAddFi"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentPreferenceNavigationHelperKt {
    public static final void navigateWithCancellation(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.$r8$lambda$m018YXyFkX7RxTzvv1rh5p_nv18(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void navigateWithSuccessResult(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2) {
        final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance balance;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int i = com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentType.ordinal()];
        if (i == 1) {
            balance = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance(str, str2);
        } else if (i == 2) {
            balance = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card(str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), (java.util.List) (0 == true ? 1 : 0), (java.lang.String) null, (java.lang.String) null, 131070, (kotlin.jvm.internal.DefaultConstructorMarker) null), str2);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            balance = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank(str, str2);
        }
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.$r8$lambda$3_E3CjPgp9mxCsk8r25GWSp6Uv8(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToAddFi-hN0UB1M, reason: not valid java name */
    public static final void m21455navigateToAddFihN0UB1M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.$r8$lambda$ZtC_mDaDwgbxeSK15YN55CN9EHY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3_E3CjPgp9mxCsk8r25GWSp6Uv8(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success(preferredInstrument)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$ZtC_mDaDwgbxeSK15YN55CN9EHY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m018YXyFkX7RxTzvv1rh5p_nv18(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled(reason)));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BANK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

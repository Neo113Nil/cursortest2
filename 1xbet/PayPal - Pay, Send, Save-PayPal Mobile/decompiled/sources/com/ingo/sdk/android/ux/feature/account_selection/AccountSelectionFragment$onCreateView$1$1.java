package com.ingo.sdk.android.ux.feature.account_selection;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class AccountSelectionFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponseFromSession;
        java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> emptyList;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider accountSelectionViewProvider = new com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider();
            customerResponseFromSession = this.getHighSpeedVideoFpsRanges.getCustomerResponseFromSession();
            if (customerResponseFromSession == null || (emptyList = customerResponseFromSession.getAccounts()) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list = emptyList;
            final com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment3 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment.this, (com.ingo.sdk.kotlin.common.features.customer.model.Account) obj);
                }
            };
            final com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment4 = this.getHighSpeedVideoFpsRanges;
            accountSelectionViewProvider.View(list, function0, function02, function1, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment.this, (com.ingo.sdk.kotlin.common.features.customer.model.Account) obj);
                }
            }, composer2, (com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider.$stable << 15) | 8);
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment) {
        accountSelectionFragment.trackMenuPressed();
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(accountSelectionFragment), com.ingo.sdk.android.R.id.action_accountSelectionFragment_to_moreMenuFragment, null, null, null, 14, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment, com.ingo.sdk.kotlin.common.features.customer.model.Account account) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
        com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment.access$trackAccountSelected(accountSelectionFragment, account.getAccountId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment, com.ingo.sdk.kotlin.common.features.customer.model.Account account) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class), account);
        androidx.view.NavController findNavController = androidx.view.fragment.FragmentKt.findNavController(accountSelectionFragment);
        int i = com.ingo.sdk.android.R.id.action_accountSelectionFragment_to_captureCheckImagesFragment;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IS_FROM_ACCOUNT_SELECTION, true);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(findNavController, i, bundle, null, null, 12, null);
        com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment.access$trackAccountConfirmed(accountSelectionFragment, account.getAccountId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment) {
        accountSelectionFragment.trackNavigationPressed();
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(accountSelectionFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.ACCOUNT_SELECTION, null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    AccountSelectionFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.account_selection.AccountSelectionFragment accountSelectionFragment) {
        this.getHighSpeedVideoFpsRanges = accountSelectionFragment;
    }
}

package com.paypal.oslo.feature.balance.di.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationModuleKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$69MZz_WyL_Yy4ukRuRC64FHLk5g(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt.$r8$lambda$x8ueoRWPZUSnGxbwTWJVabIG4Fk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NsJHQY2mxCi0mYHJfZDfQslt3YA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k0VE0UQKtxlsbgCdlnr_X8Rwzdk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination balanceMultipleHoldsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMultipleHoldsDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(balanceMultipleHoldsDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(783848049, i, -1, "com.paypal.oslo.feature.balance.di.navigation.multipleHoldsDestination.<anonymous> (NavigationModule.kt:315)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            com.paypal.oslo.feature.balance.domain.model.Money money = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(java.lang.String.valueOf(balanceMultipleHoldsDestination.getTaxHoldAmount())), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balanceMultipleHoldsDestination.getTaxHoldCurrencyCode()), null);
            java.lang.String taxHoldTaxRate = balanceMultipleHoldsDestination.getTaxHoldTaxRate();
            java.lang.String taxHoldNextWithholdingDate = balanceMultipleHoldsDestination.getTaxHoldNextWithholdingDate();
            com.paypal.oslo.feature.balance.domain.model.Money money2 = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(java.lang.String.valueOf(balanceMultipleHoldsDestination.getTaxHoldAmountTaxIdRequired())), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balanceMultipleHoldsDestination.getTaxHoldCurrencyCode()), null);
            com.paypal.oslo.feature.balance.domain.model.Money money3 = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(java.lang.String.valueOf(balanceMultipleHoldsDestination.getOtherHoldsAmount())), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balanceMultipleHoldsDestination.getOtherHoldsCurrencyCode()), null);
            boolean isTaxIdProvided = balanceMultipleHoldsDestination.isTaxIdProvided();
            boolean changedInstance = composer.changedInstance(onHoldDetailsRouterViewModel);
            com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$multipleHoldsDestination$3$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$multipleHoldsDestination$3$1$1(onHoldDetailsRouterViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.MultipleHoldsBottomSheet(money, taxHoldTaxRate, taxHoldNextWithholdingDate, money2, isTaxIdProvided, money3, (kotlin.jvm.functions.Function3) ((kotlin.reflect.KFunction) rememberedValue), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mqayiBYcvENZCns9AV20rlvOWIo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt.$r8$lambda$NsJHQY2mxCi0mYHJfZDfQslt3YA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x8ueoRWPZUSnGxbwTWJVabIG4Fk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$multipleHoldsDestination(androidx.navigation3.runtime.EntryProviderScope entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context) {
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.balance.R.string.feature_balance_money_hold_title), false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt.$r8$lambda$69MZz_WyL_Yy4ukRuRC64FHLk5g(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt.$r8$lambda$mqayiBYcvENZCns9AV20rlvOWIo(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 18, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(783848049, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt.$r8$lambda$k0VE0UQKtxlsbgCdlnr_X8Rwzdk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$multipleHoldsDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination balanceMultipleHoldsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(balanceMultipleHoldsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt$multipleHoldsDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.navigation.BalanceMultipleHoldsDestination balanceMultipleHoldsDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }
}

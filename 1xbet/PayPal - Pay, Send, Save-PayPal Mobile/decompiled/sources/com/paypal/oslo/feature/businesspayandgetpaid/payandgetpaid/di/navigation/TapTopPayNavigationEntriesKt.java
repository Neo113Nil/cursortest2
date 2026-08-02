package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "tapToPayDestinations", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TapTopPayNavigationEntriesKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$01fbO88cMN4A6LEBuueaMoFxsdc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$hfWanpYV9_QPgyqslSuHWERi0k8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7970MhFkNCF2ueJCSYnDpzuy9sY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$95lnNENlHtuK12tq93iH9Qb-TIg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel m13143$r8$lambda$95lnNENlHtuK12tq93iH9QbTIg(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination businessTapToPaySummaryDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessTapToPaySummaryDestination.getPaymentRequest());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ElUEFVqgY9pai4J51L7rJpzl2Nc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FOS12BTgmE1a3rnGLGYN2SfPqqw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination businessTapToPayActivationSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPayActivationSuccessDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-170622640, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPayActivationSuccessDestination.<anonymous> (TapTopPayNavigationEntries.kt:102)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessState ttpActivationSuccessState = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessState(false, true);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$MiXQcsCMtpNepEQHAfd5dq9Dpy0(com.paypal.oslo.core.navigation.AppNavigator.this, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt.TtpActivationSuccessScreen(ttpActivationSuccessState, null, null, null, null, (kotlin.jvm.functions.Function2) rememberedValue, null, composer, 0, 94);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LdtLOht-0kf3KETTOpHAFQsBw04, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13144$r8$lambda$LdtLOht0kf3KETTOpHAFQsBw04(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination businessTapToPayPermissionRationaleDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPayPermissionRationaleDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(businessTapToPayPermissionRationaleDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1075696762, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPayPermissionRationaleDestination.<anonymous> (TapTopPayNavigationEntries.kt:125)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$rdmVlnypY1CenoxzGsGkFzApet0(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel ttpPermissionsRationaleViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$01fbO88cMN4A6LEBuueaMoFxsdc(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$wHchcUP0A5mhPhRopgauuA1giL8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt.TtpPermissionsRationaleScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, ttpPermissionsRationaleViewModel, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MiXQcsCMtpNepEQHAfd5dq9Dpy0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final boolean z, final boolean z2) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.m13145$r8$lambda$bhZoNjTYByo1HD7c92OyEKWSrI(z, z2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZJdH6tFPoUr4E5U52gXNBFVgX24(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination businessTapToPaySummaryDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPaySummaryDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1947631230, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPaySummaryDestination.<anonymous> (TapTopPayNavigationEntries.kt:83)");
        }
        boolean changedInstance = composer.changedInstance(businessTapToPaySummaryDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.m13143$r8$lambda$95lnNENlHtuK12tq93iH9QbTIg(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryScreenKt.TapToPaySummaryScreen(appNavigator, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZzFd0ypaWbz7Nfm_Twx459TlAJ4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bhZoNjTY-Byo1HD7c92OyEKWSrI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13145$r8$lambda$bhZoNjTYByo1HD7c92OyEKWSrI(boolean z, boolean z2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination(z, z2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eL_v2J4dLO4BkF5KnM6dZfDRCag(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$ElUEFVqgY9pai4J51L7rJpzl2Nc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eZwLTbSf1PtiMkXXfw93juHJC_I(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination businessTapToPaySuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPaySuccessDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(businessTapToPaySuccessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2022702404, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPaySuccessDestination.<anonymous> (TapTopPayNavigationEntries.kt:68)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest = businessTapToPaySuccessDestination.getPaymentRequest();
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload paymentPayload = businessTapToPaySuccessDestination.getPaymentPayload();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$eL_v2J4dLO4BkF5KnM6dZfDRCag(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySuccessScreenKt.TapToPaySuccessScreen(paymentRequest, paymentPayload, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h987YndgmFCfL1w2U5b6CUYqC30(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination businessTapToPaySuccessDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPaySuccessDestination, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$jO6PBoKlKQuaYKLrZOOL0oBjzPw(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hfWanpYV9_QPgyqslSuHWERi0k8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jO6PBoKlKQuaYKLrZOOL0oBjzPw(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination businessTapToPaySuccessDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(businessTapToPaySuccessDestination);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oBR7IqKgeqdcsKQSA_Py-I7eyc0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13147$r8$lambda$oBR7IqKgeqdcsKQSA_PyI7eyc0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination businessTapToPayProgressDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPayProgressDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(businessTapToPayProgressDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1371749464, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPayProgressDestination.<anonymous> (TapTopPayNavigationEntries.kt:46)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.m13149$r8$lambda$zUEndWlRuqBApv4EoQ9iALkINE(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.m13148$r8$lambda$urHfYm2yyXSZNNd5Uj83ifB5Y(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$h987YndgmFCfL1w2U5b6CUYqC30(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.TapToPayProgressScreen(function0, (kotlin.jvm.functions.Function1) rememberedValue3, tapToPayProgressViewModel, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel $r8$lambda$rdmVlnypY1CenoxzGsGkFzApet0(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination businessTapToPayPermissionRationaleDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessTapToPayPermissionRationaleDestination.getShowLocationNotEnabledRationale(), businessTapToPayPermissionRationaleDestination.getShowNfcNotEnabledRationale());
    }

    /* renamed from: $r8$lambda$ur-HfYm-2yyXSZNNd5Uj83ifB5Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13148$r8$lambda$urHfYm2yyXSZNNd5Uj83ifB5Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$7970MhFkNCF2ueJCSYnDpzuy9sY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wHchcUP0A5mhPhRopgauuA1giL8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$ZzFd0ypaWbz7Nfm_Twx459TlAJ4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zUEndWlRuq-BApv4EoQ9iALkINE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel m13149$r8$lambda$zUEndWlRuqBApv4EoQ9iALkINE(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination businessTapToPayProgressDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessTapToPayProgressDestination.getPaymentRequest());
    }

    public static final void tapToPayDestinations(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1371749464, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.m13147$r8$lambda$oBR7IqKgeqdcsKQSA_PyI7eyc0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPayProgressDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination businessTapToPayProgressDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPayProgressDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPayProgressDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayProgressDestination businessTapToPayProgressDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2022702404, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$eZwLTbSf1PtiMkXXfw93juHJC_I(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPaySuccessDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination businessTapToPaySuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPaySuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPaySuccessDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination businessTapToPaySuccessDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1947631230, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$ZJdH6tFPoUr4E5U52gXNBFVgX24(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPaySummaryDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination businessTapToPaySummaryDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPaySummaryDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPaySummaryDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination businessTapToPaySummaryDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-170622640, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.$r8$lambda$FOS12BTgmE1a3rnGLGYN2SfPqqw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPayActivationSuccessDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination businessTapToPayActivationSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPayActivationSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPayActivationSuccessDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayActivationSuccessDestination businessTapToPayActivationSuccessDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1075696762, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt.m13144$r8$lambda$LdtLOht0kf3KETTOpHAFQsBw04(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPayPermissionRationaleDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination businessTapToPayPermissionRationaleDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPayPermissionRationaleDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.TapTopPayNavigationEntriesKt$businessTapToPayPermissionRationaleDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPayPermissionRationaleDestination businessTapToPayPermissionRationaleDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
    }
}

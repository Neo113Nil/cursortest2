package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "mainDestinations", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MainNavigationEntriesKt {
    /* renamed from: $r8$lambda$-6wblV2STp_NixhsZjOt98M3MdM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13118$r8$lambda$6wblV2STp_NixhsZjOt98M3MdM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$ZPkLp6zMXQVaxZyt2gI3NwrdiPs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0npuy8g4lFZHoi0I66x_Re6ZVOA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.ItemCreatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$mzTrbBflnG6lJIqAl1lIKWKYsXo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1MkbUEPk11ueKveRODhX6OwS41w(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination(lineItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1gTbmrJovdvCf6CemX7CqO8AhV8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2jSZEa1RQvov-XQ2i5whjo_GxWM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13119$r8$lambda$2jSZEa1RQvovXQ2i5whjo_GxWM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3MHX5C2Ze-ICnIboVInNZEA5rcM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13120$r8$lambda$3MHX5C2ZeICnIboVInNZEA5rcM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination(true));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$517joWPyCvacxoxKRZKDSr_Cf3w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13123$r8$lambda$CDiMnYvqocRb6NeRnSemWAbDXM(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5XCqWEnQW0yGcgkW6y7nznW-i4A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13121$r8$lambda$5XCqWEnQW0yGcgkW6y7nznWi4A(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13120$r8$lambda$3MHX5C2ZeICnIboVInNZEA5rcM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6wwm-1T_N9ALVqksx205vYo5Qb4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13122$r8$lambda$6wwm1T_N9ALVqksx205vYo5Qb4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination businessTapToPayDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPayDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-823086483, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPayDestination.<anonymous> (MainNavigationEntries.kt:103)");
        }
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel tapToPayMainViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current2 == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel tapToPayCustomAmountViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel.class), current2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, composer, 0), current2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        androidx.view.ViewModelStoreOwner current3 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current3 == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel selectItemsViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel.class), current3, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current3, composer, 0), current3 instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$v5Xq6Z6g9HGFYQxAfBQwQDfBj2w(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$RAbIKyBrL5TrdZrCUQdkpxOQjzo(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        boolean changed4 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changed3 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$0npuy8g4lFZHoi0I66x_Re6ZVOA(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed5 = composer.changed(appNavigator);
        boolean changed6 = composer.changed(rememberNavResultRequestId2);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed5 | changed6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$517joWPyCvacxoxKRZKDSr_Cf3w(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId2, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainScreenKt.m13253TapToPayMainScreenSzfm4Rw(function1, tapToPayMainViewModel, tapToPayCustomAmountViewModel, selectItemsViewModel, rememberNavResultRequestId2, function0, function02, rememberNavResultRequestId, (kotlin.jvm.functions.Function1) rememberedValue4, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6y9CCnBtIRVkRJOGRZafztFji4Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$MSRTcrD3_lL5oPUuHZLwnur0Chs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7URhTTQquxYtEMNrP8d2cb4O6JM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$1MkbUEPk11ueKveRODhX6OwS41w(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CDiMnYvqocRb6NeRnS-emWAbDXM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13123$r8$lambda$CDiMnYvqocRb6NeRnSemWAbDXM(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CTU70JLgcpFbwgx6vaBXPfc8q_Q(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KNYPn1MGHhz6a7NwpN2SYdGaeAo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$YknO3ka1CzE6O79gy0ABdr80R90((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel $r8$lambda$LoOTYa5pPmSYUVwoixedN_767G0(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination businessInvoiceDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessInvoiceDestination.getAction());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MSRTcrD3_lL5oPUuHZLwnur0Chs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RAbIKyBrL5TrdZrCUQdkpxOQjzo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$CTU70JLgcpFbwgx6vaBXPfc8q_Q((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W8knDmQpERkwfKXR8q3F6kpngbo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$1gTbmrJovdvCf6CemX7CqO8AhV8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XwJZZ9AtBOY-GKj8MA7MuWwp-gA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13124$r8$lambda$XwJZZ9AtBOYGKj8MA7MuWwpgA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$qGLzMjISgZ0KZQTlhb0B9WVvivE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y7pw74TBN9IplEHI2Y2OhsFsdtM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination businessPayAndGetPaidDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessPayAndGetPaidDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1567341109, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessPayAndGetPaidDestination.<anonymous> (MainNavigationEntries.kt:83)");
        }
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13128$r8$lambda$kZWf2oPXRKpT64I4gI6Wgy3yCc(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        boolean changed3 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$ukCui7vf9gJM06MdSNoO8iJSJvE(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.m13158PayAndGetPaidScreen5lSOO6k(rememberNavResultRequestId, function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YknO3ka1CzE6O79gy0ABdr80R90(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZPkLp6zMXQVaxZyt2gI3NwrdiPs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cA_uBcNdZ2D6uWdI_s6yyTq6o9s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditCustomerNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13131$r8$lambda$qKzj_2k6fvgeuMOgJ6N1jkviDY(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e-uMvv_MgrfqN89JEafG-norYVc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13125$r8$lambda$euMvv_MgrfqN89JEafGnorYVc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$fZcxkLVYqLF5ulMinxVVKd6gVwA(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fVzwPKPaDJBXPtBz5f1RUD7-9t0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13126$r8$lambda$fVzwPKPaDJBXPtBz5f1RUD79t0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13119$r8$lambda$2jSZEa1RQvovXQ2i5whjo_GxWM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fZcxkLVYqLF5ulMinxVVKd6gVwA(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination(lineItem));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iJGW98tgUkCZILDL-UKhVurjvEU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13127$r8$lambda$iJGW98tgUkCZILDLUKhVurjvEU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination businessTapToPayEopDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTapToPayEopDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1202610723, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessTapToPayEopDestination.<anonymous> (MainNavigationEntries.kt:63)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$6y9CCnBtIRVkRJOGRZafztFji4Y(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13118$r8$lambda$6wblV2STp_NixhsZjOt98M3MdM(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewScreenKt.TtpEopWebViewScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, composer, 0, 28);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kZWf2oPXRKp-T64I4gI6Wgy3yCc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13128$r8$lambda$kZWf2oPXRKpT64I4gI6Wgy3yCc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$mSoh313BtlCia3c1gizwi3LBg9I(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mRPnrzs8dx-Bg3R5JUx0MbgiM6g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13129$r8$lambda$mRPnrzs8dxBg3R5JUx0MbgiM6g(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest tapToPayRequest, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySummaryDestination(tapToPayRequest));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mSoh313BtlCia3c1gizwi3LBg9I(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mzTrbBflnG6lJIqAl1lIKWKYsXo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nS-4jOCrn8m5x72ecVaa7kXtRAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13130$r8$lambda$nS4jOCrn8m5x72ecVaa7kXtRAA(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qGLzMjISgZ0KZQTlhb0B9WVvivE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qKz-j_2k6fvgeuMOgJ6N1jkviDY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13131$r8$lambda$qKzj_2k6fvgeuMOgJ6N1jkviDY(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination(customer));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rYEWs-DeQ4SPlh8fJt5P19D6BYo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13132$r8$lambda$rYEWsDeQ4SPlh8fJt5P19D6BYo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination businessInvoiceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInvoiceDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(809186389, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.invoiceScreenDestination.<anonymous> (MainNavigationEntries.kt:149)");
        }
        boolean changedInstance = composer.changedInstance(businessInvoiceDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$LoOTYa5pPmSYUVwoixedN_767G0(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel invoiceViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        final java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        final java.lang.String rememberNavResultRequestId4 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        final java.lang.String rememberNavResultRequestId5 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        final java.lang.String rememberNavResultRequestId6 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$KNYPn1MGHhz6a7NwpN2SYdGaeAo(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13124$r8$lambda$XwJZZ9AtBOYGKj8MA7MuWwpgA(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        boolean changed4 = composer.changed(rememberNavResultRequestId6);
        boolean changedInstance2 = composer.changedInstance(invoiceViewModel);
        boolean changedInstance3 = composer.changedInstance(businessInvoiceDestination);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed3 | changed4 | changedInstance2 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$xazOjD9d4PjF0dEeqaN5h0gi8RY(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId6, invoiceViewModel, businessInvoiceDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
        boolean changed5 = composer.changed(appNavigator);
        boolean changed6 = composer.changed(rememberNavResultRequestId3);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed5 | changed6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13126$r8$lambda$fVzwPKPaDJBXPtBz5f1RUD79t0(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId3);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
        boolean changed7 = composer.changed(appNavigator);
        boolean changed8 = composer.changed(rememberNavResultRequestId5);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((changed7 | changed8) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13125$r8$lambda$euMvv_MgrfqN89JEafGnorYVc(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId5, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
        boolean changed9 = composer.changed(appNavigator);
        boolean changed10 = composer.changed(rememberNavResultRequestId4);
        java.lang.Object rememberedValue7 = composer.rememberedValue();
        if ((changed9 | changed10) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$7URhTTQquxYtEMNrP8d2cb4O6JM(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId4, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue7;
        boolean changed11 = composer.changed(appNavigator);
        boolean changed12 = composer.changed(rememberNavResultRequestId5);
        java.lang.Object rememberedValue8 = composer.rememberedValue();
        if ((changed11 | changed12) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$W8knDmQpERkwfKXR8q3F6kpngbo(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId5);
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue8;
        boolean changed13 = composer.changed(appNavigator);
        boolean changed14 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue9 = composer.rememberedValue();
        if ((changed13 | changed14) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13121$r8$lambda$5XCqWEnQW0yGcgkW6y7nznWi4A(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue9;
        boolean changed15 = composer.changed(appNavigator);
        boolean changed16 = composer.changed(rememberNavResultRequestId2);
        java.lang.Object rememberedValue10 = composer.rememberedValue();
        if ((changed15 | changed16) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$cA_uBcNdZ2D6uWdI_s6yyTq6o9s(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId2, (com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue10);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceScreenKt.m13197InvoiceScreenCKUphlU(rememberNavResultRequestId, rememberNavResultRequestId2, rememberNavResultRequestId3, rememberNavResultRequestId4, rememberNavResultRequestId5, rememberNavResultRequestId6, function0, function02, function03, function04, function12, function13, function05, function06, (kotlin.jvm.functions.Function1) rememberedValue10, invoiceViewModel, composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ukCui7vf9gJM06MdSNoO8iJSJvE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesshome.api.navigation.result.AccountSetupCompleteNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13130$r8$lambda$nS4jOCrn8m5x72ecVaa7kXtRAA(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v5Xq6Z6g9HGFYQxAfBQwQDfBj2w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest tapToPayRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayRequest, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13129$r8$lambda$mRPnrzs8dxBg3R5JUx0MbgiM6g(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xazOjD9d4PjF0dEeqaN5h0gi8RY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel invoiceViewModel, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination businessInvoiceDestination) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SendInvoiceErrorNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13133$r8$lambda$ym5MEWA_O_PtFMm68rIWv8F2Z8(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.this, businessInvoiceDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ym5MEWA_-O_PtFMm68rIWv8F2Z8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13133$r8$lambda$ym5MEWA_O_PtFMm68rIWv8F2Z8(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel invoiceViewModel, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination businessInvoiceDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination(invoiceViewModel.getCurrentInvoice(), businessInvoiceDestination.getAttemptId()));
        return kotlin.Unit.INSTANCE;
    }

    public static final void mainDestinations(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map<java.lang.String, java.lang.Object> l1PlainMetadata = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1PlainMetadata();
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1567341109, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.$r8$lambda$Y7pw74TBN9IplEHI2Y2OhsFsdtM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessPayAndGetPaidDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination businessPayAndGetPaidDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessPayAndGetPaidDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessPayAndGetPaidDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination businessPayAndGetPaidDestination) {
                return l1PlainMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-823086483, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13122$r8$lambda$6wwm1T_N9ALVqksx205vYo5Qb4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessTapToPayDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination businessTapToPayDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPayDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessTapToPayDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination businessTapToPayDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13105getLambda$120681757$business_pay_and_get_paid_prodRelease = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.ComposableSingletons$MainNavigationEntriesKt.INSTANCE.m13105getLambda$120681757$business_pay_and_get_paid_prodRelease();
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessTransferDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination businessTransferDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTransferDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessTransferDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination businessTransferDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) m13105getLambda$120681757$business_pay_and_get_paid_prodRelease);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(809186389, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13132$r8$lambda$rYEWsDeQ4SPlh8fJt5P19D6BYo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$invoiceScreenDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination businessInvoiceDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInvoiceDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$invoiceScreenDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination businessInvoiceDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1202610723, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt.m13127$r8$lambda$iJGW98tgUkCZILDLUKhVurjvEU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessTapToPayEopDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination businessTapToPayEopDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessTapToPayEopDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.MainNavigationEntriesKt$businessTapToPayEopDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayEopDestination businessTapToPayEopDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
    }
}

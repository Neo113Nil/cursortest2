package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "invoiceDestinations", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceNavigationEntriesKt {
    /* renamed from: $r8$lambda$-uVACbFxcE6TXQCxc2L6kDz4DKs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13106$r8$lambda$uVACbFxcE6TXQCxc2L6kDz4DKs(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination invoiceSentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceSentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-770221173, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessInvoiceSentDestination.<anonymous> (InvoiceNavigationEntries.kt:102)");
        }
        boolean changedInstance = composer.changedInstance(invoiceSentDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13114$r8$lambda$eJOhqmalB2EXNNNDWbMPJK1Q6M(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel invoiceSentViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$NVq26TGuEEfcYhF4GXQwXLI2Ax4(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$gzjXErCObfFJ76djy89b76HxwFc(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentScreenKt.InvoiceSentScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue3, invoiceSentViewModel, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2-0u0xHTr1Id0dLPi4t3zNt7G1s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13107$r8$lambda$20u0xHTr1Id0dLPi4t3zNt7G1s(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$5YOuLg8dHelSpa4cjuH-bsKOLtM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13108$r8$lambda$5YOuLg8dHelSpa4cjuHbsKOLtM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5sZFqlKk_EnZ2IKJbuTkSyXgSRk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.SendInvoiceFlow.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel $r8$lambda$68fhqPlvsMPwBkrvC6Hs_dJ1y1I(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(invoiceQrCodeDestination);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7S_E9d3mQmaIbIxO3WyT7bfMeaA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13107$r8$lambda$20u0xHTr1Id0dLPi4t3zNt7G1s((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$AOQrUy1MypsCRpgJCfKod8Revrk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AWsCQIqXATpLlj9QBMLHx1QUAKI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$5sZFqlKk_EnZ2IKJbuTkSyXgSRk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BJEUCqRPH7YEFTCGFuYHSvZPS7M(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.SendInvoiceFlow.class));
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination(invoice, businessRequestPaymentDestination.getAttemptId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BTCtPUs54w-Wtih-OrQ9bSmCfHA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13109$r8$lambda$BTCtPUs54wWtihOrQ9bSmCfHA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13113$r8$lambda$dNjDC7Vn69EeZHD3N9MjjtyBO8(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice.this, businessRequestPaymentDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LQe3W5Q6nJCTDeY0KTMT2RpBvY8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SendInvoiceErrorNavResult.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MqE5Y_E-mQ2Oie7yX-jOYG-DxFA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13110$r8$lambda$MqE5Y_EmQ2Oie7yXjOYGDxFA(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditCustomerNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditCustomerAction.EDIT, customer));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NVq26TGuEEfcYhF4GXQwXLI2Ax4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13115$r8$lambda$moxuGINSDLaGjvdFpWLfzMc9CA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PDZrF1THh7qiBjCAprDDHVOSXb4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.SendInvoiceFlow.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UHpHPx6z5OmXqfuiQFZwObXSzFI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination editCustomerDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$Z7Iiij_E3Qp3fkpxREsvlQm8tiw(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VMrPRxhfkxodvRYQlQTgIm8qzBs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination(true));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VxQkM5zVDlU79xbq8V67h-GMrQ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13111$r8$lambda$VxQkM5zVDlU79xbq8V67hGMrQ0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination editCustomerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editCustomerDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-737518732, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessInvoiceEditCustomerDestination.<anonymous> (InvoiceNavigationEntries.kt:183)");
        }
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = editCustomerDestination.getCustomer();
        boolean changed = composer.changed(appNavigator);
        boolean changed2 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13112$r8$lambda$aX0CwTlDaCW8qPYUGsPpUYj1sE(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed3 = composer.changed(appNavigator);
        boolean changedInstance = composer.changedInstance(editCustomerDestination);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed3 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$UHpHPx6z5OmXqfuiQFZwObXSzFI(com.paypal.oslo.core.navigation.AppNavigator.this, editCustomerDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed4 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$nrpN7PkuhJcPENCHbhYU2KYKhCg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.editcustomer.EditCustomerScreenKt.m13223EditCustomerScreen5lSOO6k(rememberNavResultRequestId, customer, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y3k8rlCu9dFzXnZNPEIIT2LmTcs(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination invoiceShareLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceShareLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1424691375, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessInvoiceShareLinkDestination.<anonymous> (InvoiceNavigationEntries.kt:155)");
        }
        boolean changedInstance = composer.changedInstance(invoiceShareLinkDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$aRST11o5qkEClFVVrXxCxvh71ZU(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel invoiceShareLinkViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$AWsCQIqXATpLlj9QBMLHx1QUAKI(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$fDk0QmUXOe8eWd2WnXntJD_7egs(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkScreenKt.InvoiceShareLinkScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue3, invoiceShareLinkViewModel, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YQa3bY8GYr4jNORrBW70wOv8QKw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$BJEUCqRPH7YEFTCGFuYHSvZPS7M(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice.this, businessRequestPaymentDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z7Iiij_E3Qp3fkpxREsvlQm8tiw(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination editCustomerDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditCustomerNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditCustomerAction.REMOVE, editCustomerDestination.getCustomer()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel $r8$lambda$ZY_ZDjz_R2i8oJ9SAN5irl0ZFQk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessRequestPaymentDestination.getInvoice());
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel $r8$lambda$aRST11o5qkEClFVVrXxCxvh71ZU(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination invoiceShareLinkDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(invoiceShareLinkDestination);
    }

    /* renamed from: $r8$lambda$aX0CwTlDaCW8qP-YUGsPpUYj1sE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13112$r8$lambda$aX0CwTlDaCW8qPYUGsPpUYj1sE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$zM08YPfWw1C7cV0J6sYoQ16fMMU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c7XenzzCE_mJ8Q_7IiMV8tSd_4M(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceQrCodeDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(921936567, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessInvoiceQrCodeDestination.<anonymous> (InvoiceNavigationEntries.kt:128)");
        }
        boolean changedInstance = composer.changedInstance(invoiceQrCodeDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$68fhqPlvsMPwBkrvC6Hs_dJ1y1I(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel invoiceQrCodeViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$7S_E9d3mQmaIbIxO3WyT7bfMeaA(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13117$r8$lambda$uMdCxxizdiWeHOABCeHHvfTwBQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$i1XM2PRA7jwenRMUL358qlHymFs(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeScreenKt.InvoiceQrCodeScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, invoiceQrCodeViewModel, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cBddQ6UFuCkdrk2_5ArSS6Ikvns(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$VMrPRxhfkxodvRYQlQTgIm8qzBs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dNjDC7Vn69EeZHD-3N9MjjtyBO8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13113$r8$lambda$dNjDC7Vn69EeZHD3N9MjjtyBO8(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.SendInvoiceFlow.class));
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination(invoice, businessRequestPaymentDestination.getAttemptId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eJOhqmalB2EXNNNDWbMPJK-1Q6M, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel m13114$r8$lambda$eJOhqmalB2EXNNNDWbMPJK1Q6M(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination invoiceSentDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(invoiceSentDestination);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fDk0QmUXOe8eWd2WnXntJD_7egs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$opoSovyTO0cL5HsQNXxnAqPQt40((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gzjXErCObfFJ76djy89b76HxwFc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$AOQrUy1MypsCRpgJCfKod8Revrk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i1XM2PRA7jwenRMUL358qlHymFs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13108$r8$lambda$5YOuLg8dHelSpa4cjuHbsKOLtM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$moxuGINSDLaGjvdFp-WLfzMc9CA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13115$r8$lambda$moxuGINSDLaGjvdFpWLfzMc9CA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.SendInvoiceFlow.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nrpN7PkuhJcPENCHbhYU2KYKhCg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13110$r8$lambda$MqE5Y_EmQ2Oie7yXjOYGDxFA(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$opoSovyTO0cL5HsQNXxnAqPQt40(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ta2izw3eAhN828ri-1pdOzDIR5E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13116$r8$lambda$ta2izw3eAhN828ri1pdOzDIR5E(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$LQe3W5Q6nJCTDeY0KTMT2RpBvY8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uMdCxxizdiWeHOABCeHHvfTw-BQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13117$r8$lambda$uMdCxxizdiWeHOABCeHHvfTwBQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$PDZrF1THh7qiBjCAprDDHVOSXb4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w1Dq9eQ97OK_Fwq8kRMYAU_UwII(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessRequestPaymentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-56952909, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessSendInvoiceDestination.<anonymous> (InvoiceNavigationEntries.kt:55)");
        }
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        boolean changedInstance = composer.changedInstance(businessRequestPaymentDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$ZY_ZDjz_R2i8oJ9SAN5irl0ZFQk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel requestPaymentScreenViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        boolean changedInstance2 = composer.changedInstance(businessRequestPaymentDestination);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13109$r8$lambda$BTCtPUs54wWtihOrQ9bSmCfHA(com.paypal.oslo.core.navigation.AppNavigator.this, businessRequestPaymentDestination, (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13116$r8$lambda$ta2izw3eAhN828ri1pdOzDIR5E(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        boolean changedInstance3 = composer.changedInstance(businessRequestPaymentDestination);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed3 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$YQa3bY8GYr4jNORrBW70wOv8QKw(com.paypal.oslo.core.navigation.AppNavigator.this, businessRequestPaymentDestination, (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
        boolean changed4 = composer.changed(appNavigator);
        boolean changed5 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed4 | changed5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$cBddQ6UFuCkdrk2_5ArSS6Ikvns(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenKt.m13217RequestPaymentScreena1bqEr4(rememberNavResultRequestId, function12, function0, function13, (kotlin.jvm.functions.Function0) rememberedValue5, requestPaymentScreenViewModel, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zM08YPfWw1C7cV0J6sYoQ16fMMU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination(true));
        return kotlin.Unit.INSTANCE;
    }

    public static final void invoiceDestinations(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_money_sheet_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-56952909, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$w1Dq9eQ97OK_Fwq8kRMYAU_UwII(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessSendInvoiceDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessRequestPaymentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessSendInvoiceDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-770221173, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13106$r8$lambda$uVACbFxcE6TXQCxc2L6kDz4DKs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceSentDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination invoiceSentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(invoiceSentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceSentDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination invoiceSentDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(921936567, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$c7XenzzCE_mJ8Q_7IiMV8tSd_4M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceQrCodeDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(invoiceQrCodeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceQrCodeDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1424691375, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.$r8$lambda$Y3k8rlCu9dFzXnZNPEIIT2LmTcs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceShareLinkDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination invoiceShareLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(invoiceShareLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceShareLinkDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination invoiceShareLinkDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_edit_customer_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-737518732, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt.m13111$r8$lambda$VxQkM5zVDlU79xbq8V67hGMrQ0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceEditCustomerDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination editCustomerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editCustomerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.InvoiceNavigationEntriesKt$businessInvoiceEditCustomerDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditCustomerDestination editCustomerDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
    }
}

package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "requestManagementDestinations", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RequestManagementNavigationEntriesKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$0Li2HMUfynkyX5LKNd9MOKbTQHM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0ZCP-HlPRAMAIBbibf-wspWKgmY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13299$r8$lambda$0ZCPHlPRAMAIBbibfwspWKgmY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$208mX5dwGhSosi5PwT7mpHYFdGs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$FIfwju4_7VGlhCD1MIHbT6S6AOY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5XDgF0G2DybHcM6H54P60G6Ar1g(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination reminderSentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reminderSentDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(reminderSentDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-170245821, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.reminderSentEntry.<anonymous> (RequestManagementNavigationEntries.kt:117)");
            }
            java.lang.String recipientName = reminderSentDestination.getRecipientName();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13305$r8$lambda$q2NYIgkvmzGAV2UKLF4_bR5HFg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.ReminderSentScreenKt.ReminderSentScreen(recipientName, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8yOjRLk8O5hJMOZe-ry8H1nItGY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13300$r8$lambda$8yOjRLk8O5hJMOZery8H1nItGY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$YF5zgmsWaDTI5bUoyhOQr2W0WqE(str, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$A6RoeeuIbmXKWY8-s2ljf4PmU6E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13301$r8$lambda$A6RoeeuIbmXKWY8s2ljf4PmU6E(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$mHuXjt1Yl_KRpyVwfZl59maqFno(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DwlUZXl1pv6WWcSPhbl_ynDyBU0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination invoiceCancelledDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceCancelledDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(invoiceCancelledDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1205414787, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.invoiceCancelledEntry.<anonymous> (RequestManagementNavigationEntries.kt:103)");
            }
            java.lang.String invoiceNumber = invoiceCancelledDestination.getInvoiceNumber();
            java.lang.String shareUrl = invoiceCancelledDestination.getShareUrl();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$208mX5dwGhSosi5PwT7mpHYFdGs(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceCancelledScreenKt.InvoiceCancelledScreen(invoiceNumber, shareUrl, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FIfwju4_7VGlhCD1MIHbT6S6AOY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Hf_Au3Oe-lgXcHgGUs7WyMHocgo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13302$r8$lambda$Hf_Au3OelgXcHgGUs7WyMHocgo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13303$r8$lambda$OEOwewKqDHz5HvjJG7Do0fUVYs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IoDOkDTS48uGADoKJ8mU59PnMGY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$O275YvE65nUOBnnTmPFJVsmdsXQ(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel $r8$lambda$K3sJrZA98MzA_bPVKZQ6Hd97olc(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination businessPurchaseDetailsDestination, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessPurchaseDetailsDestination.getPurchaseId());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O275YvE65nUOBnnTmPFJVsmdsXQ(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OEOwewKqDH-z5HvjJG7Do0fUVYs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13303$r8$lambda$OEOwewKqDHz5HvjJG7Do0fUVYs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination(true));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PSZhoh3VVF3PSxpvKWwKs77KOpk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$TlSZyXN3AX0mpKlR8AILNhzT3es(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel $r8$lambda$Qh2yXBQx9EnpgwzuRwBQmoCxFUg(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessInvoiceDetailsDestination.getInvoiceId());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Roqlo_jr1i2kRKihDi4FYQJ9dXo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$0Li2HMUfynkyX5LKNd9MOKbTQHM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TlSZyXN3AX0mpKlR8AILNhzT3es(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UWnmXShjYnpdvWUiIwa5fcVF3ME(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wonx5uc1f6CShJOZcQt55DT5Wvo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination businessPurchaseDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessPurchaseDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-695650545, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.purchaseDetailsEntry.<anonymous> (RequestManagementNavigationEntries.kt:132)");
        }
        boolean changedInstance = composer.changedInstance(businessPurchaseDetailsDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$K3sJrZA98MzA_bPVKZQ6Hd97olc(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager = appNavigator.getNavResultManager();
        boolean changedInstance2 = composer.changedInstance(purchaseDetailsViewModel);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$1$1$1(purchaseDetailsViewModel, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
        int i2 = com.paypal.oslo.core.navigation.result.NavResultManager.$stable << 3;
        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, composer, (i2 >> 3) & 14);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$lambda$0$$inlined$NavResultEffect-rtGRyWw$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                    return m13308invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                }

                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13308invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, composer, (i2 & 14) | 3072 | (i2 & 896));
        boolean changed = composer.changed(appNavigator);
        boolean changed2 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13302$r8$lambda$Hf_Au3OelgXcHgGUs7WyMHocgo(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if (changed3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$IoDOkDTS48uGADoKJ8mU59PnMGY(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.PurchaseDetailsScreenKt.PurchaseDetailsScreen(purchaseDetailsViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue5, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YF5zgmsWaDTI5bUoyhOQr2W0WqE(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination(str, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yp5Dud6s1K2IGnyDAx9AZRNvY1M(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$UWnmXShjYnpdvWUiIwa5fcVF3ME((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZVEQ88_DPhh3i0gH7Y6G3R49QLI(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination sendReceiptSuccessDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput(sendReceiptSuccessDestination.getRecipientEmail(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dbL6kfch1uWxK7nAb0EIGhep67Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination sendReceiptSuccessDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$ZVEQ88_DPhh3i0gH7Y6G3R49QLI(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$enECNuIyHt5rLVvJjHCFz7dNrdU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination sendReceiptSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendReceiptSuccessDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(sendReceiptSuccessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-722093533, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.sendReceiptSuccessEntry.<anonymous> (RequestManagementNavigationEntries.kt:167)");
            }
            java.lang.String recipientEmail = sendReceiptSuccessDestination.getRecipientEmail();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$ysSNRzDj4zVaTTWYEkqr_F3_914(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$Roqlo_jr1i2kRKihDi4FYQJ9dXo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            boolean z = (i & 14) == 4;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$dbL6kfch1uWxK7nAb0EIGhep67Y(com.paypal.oslo.core.navigation.AppNavigator.this, sendReceiptSuccessDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReceiptSuccessScreenKt.SendReceiptSuccessScreen(recipientEmail, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fF0lU1Z_uqHQWctpvrTIrW3ADXM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hfCTKxOVMHWOlaqaJTNMbRnnu34(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination invoiceWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(invoiceWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(760997187, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.invoiceWebViewEntry.<anonymous> (RequestManagementNavigationEntries.kt:190)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl url = invoiceWebViewDestination.getUrl();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$tjZHquWSZIunyT8b7_PGNaqmR9Q(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewScreenKt.InvoiceWebViewScreen(url, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kxJrNjxbc6F3lKRXWTbuti-8wUk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13304$r8$lambda$kxJrNjxbc6F3lKRXWTbuti8wUk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mHuXjt1Yl_KRpyVwfZl59maqFno(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.EditInvoiceUrl(businessInvoiceDetailsDestination.getInvoiceId())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q2NYIgkvmz-GAV2UKLF4_bR5HFg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13305$r8$lambda$q2NYIgkvmzGAV2UKLF4_bR5HFg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13304$r8$lambda$kxJrNjxbc6F3lKRXWTbuti8wUk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qAh-QLsgvOobucPV3HsDkdGoTZE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13306$r8$lambda$qAhQLsgvOobucPV3HsDkdGoTZE(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.CopyInvoiceUrl(businessInvoiceDetailsDestination.getInvoiceId())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rljfzEW0VZ4-yBNTGKiACUNP5Ac, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13307$r8$lambda$rljfzEW0VZ4yBNTGKiACUNP5Ac(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.InvoiceDetailsUrl(businessInvoiceDetailsDestination.getInvoiceId())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rpDgTuK2RPwByeuQIGQKj1_GV0s(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInvoiceDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(553687619, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.invoiceDetailsEntry.<anonymous> (RequestManagementNavigationEntries.kt:58)");
        }
        boolean changedInstance = composer.changedInstance(businessInvoiceDetailsDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$Qh2yXBQx9EnpgwzuRwBQmoCxFUg(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel invoiceDetailsViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$Yp5Dud6s1K2IGnyDAx9AZRNvY1M(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13300$r8$lambda$8yOjRLk8O5hJMOZery8H1nItGY(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj, (java.lang.String) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$PSZhoh3VVF3PSxpvKWwKs77KOpk(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
        boolean changed4 = composer.changed(appNavigator);
        boolean changedInstance2 = composer.changedInstance(businessInvoiceDetailsDestination);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed4 | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13301$r8$lambda$A6RoeeuIbmXKWY8s2ljf4PmU6E(com.paypal.oslo.core.navigation.AppNavigator.this, businessInvoiceDetailsDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
        boolean changed5 = composer.changed(appNavigator);
        boolean changedInstance3 = composer.changedInstance(businessInvoiceDetailsDestination);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((changed5 | changedInstance3) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$z2UDC7GdbCtMf50VkAF3A2pnaBQ(com.paypal.oslo.core.navigation.AppNavigator.this, businessInvoiceDetailsDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
        boolean changed6 = composer.changed(appNavigator);
        boolean changedInstance4 = composer.changedInstance(businessInvoiceDetailsDestination);
        java.lang.Object rememberedValue7 = composer.rememberedValue();
        if ((changed6 | changedInstance4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$ztvNDBuQTlNvxdhd50jbEtF8q20(com.paypal.oslo.core.navigation.AppNavigator.this, businessInvoiceDetailsDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceDetailsScreenKt.InvoiceDetailsScreen(invoiceDetailsViewModel, function0, function2, function12, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue7, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tjZHquWSZIunyT8b7_PGNaqmR9Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13299$r8$lambda$0ZCPHlPRAMAIBbibfwspWKgmY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ysSNRzDj4zVaTTWYEkqr_F3_914(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$fF0lU1Z_uqHQWctpvrTIrW3ADXM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z2UDC7GdbCtMf50VkAF3A2pnaBQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13306$r8$lambda$qAhQLsgvOobucPV3HsDkdGoTZE(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ztvNDBuQTlNvxdhd50jbEtF8q20(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.m13307$r8$lambda$rljfzEW0VZ4yBNTGKiACUNP5Ac(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final void requestManagementDestinations(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(553687619, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$rpDgTuK2RPwByeuQIGQKj1_GV0s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$invoiceDetailsEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInvoiceDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$invoiceDetailsEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination businessInvoiceDetailsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1205414787, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$DwlUZXl1pv6WWcSPhbl_ynDyBU0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$invoiceCancelledEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination invoiceCancelledDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(invoiceCancelledDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$invoiceCancelledEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceCancelledDestination invoiceCancelledDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-170245821, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$5XDgF0G2DybHcM6H54P60G6Ar1g(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$reminderSentEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination reminderSentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(reminderSentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$reminderSentEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.ReminderSentDestination reminderSentDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_payment), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-695650545, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$Wonx5uc1f6CShJOZcQt55DT5Wvo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination businessPurchaseDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessPurchaseDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$purchaseDetailsEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination businessPurchaseDetailsDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-722093533, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$enECNuIyHt5rLVvJjHCFz7dNrdU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$sendReceiptSuccessEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination sendReceiptSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sendReceiptSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$sendReceiptSuccessEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.SendReceiptSuccessDestination sendReceiptSuccessDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(760997187, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt.$r8$lambda$hfCTKxOVMHWOlaqaJTNMbRnnu34(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$invoiceWebViewEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination invoiceWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(invoiceWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.RequestManagementNavigationEntriesKt$invoiceWebViewEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.di.navigation.InvoiceWebViewDestination invoiceWebViewDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
    }
}

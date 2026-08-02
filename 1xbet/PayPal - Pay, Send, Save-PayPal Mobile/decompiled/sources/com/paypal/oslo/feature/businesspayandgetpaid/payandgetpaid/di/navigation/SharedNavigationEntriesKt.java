package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "sharedDestinations", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SharedNavigationEntriesKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$15JHrS8e7XqewDAKucZ_kIuoZNc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Fx_JwescnJXLIJfHmqjMVGCWdw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination businessSelectItemsInternalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessSelectItemsInternalDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-111278334, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessSelectItemsDestination.<anonymous> (SharedNavigationEntries.kt:66)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel selectItemsViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            boolean changedInstance = composer.changedInstance(selectItemsViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessSelectItemsDestination$1$1$1(selectItemsViewModel, null);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer, 0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessSelectItemsDestination$lambda$0$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13142invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13142invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, composer, 3072);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13141$r8$lambda$z1vGdcd2aLexiq8HJs5aif5C4(com.paypal.oslo.core.navigation.AppNavigator.this, (java.util.List) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$RLqZs0G5wAIU6eeU1IGByO8FHWo(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.BusinessSelectItemsScreen(function1, (kotlin.jvm.functions.Function0) rememberedValue4, selectItemsViewModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel $r8$lambda$1GZe2gQ2cjjnSLJtK5OgNHrfFDY(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination editLineItemDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(editLineItemDestination.getLineItem());
    }

    /* renamed from: $r8$lambda$1kxdewWRqTHgGrdy7_9EdC-MG8Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13134$r8$lambda$1kxdewWRqTHgGrdy7_9EdCMG8Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13135$r8$lambda$KI7Lb0S4Pv589cpIbM7TjyG74(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3DsxBSRRwb16YObZPIwlM2LULfI(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination editLineItemDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.REMOVE, editLineItemDestination.getLineItem()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7MDmvImbVoKioIVj1qEdKlqg9H8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$SntlKRLPIWwYYFLSzVb6l5aYqU4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A91x90uG_YSdy1vjyBGPqIvyjz0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13139$r8$lambda$krfBfw7Mr8WwWioUjYI6CwrrU4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BPaG9zc9q97N3uufvP0AG6eGkKs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings businessPaymentSettings, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessPaymentSettings, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2032432007, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessPaymentSettings.<anonymous> (SharedNavigationEntries.kt:54)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsScreenKt.PaymentRequestSettingsScreen(appNavigator, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FKESy39oFWXLEdanv17NX8_R56g(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GyOHogq2RotBTX2uv5cKnbjAmis(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountAction.EDIT, lineItem));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KI7L-b0S4Pv589cpIbM7-TjyG74, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13135$r8$lambda$KI7Lb0S4Pv589cpIbM7TjyG74(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LWDVgAi85xKt3W-8bQ3LSaCVgIU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13136$r8$lambda$LWDVgAi85xKt3W8bQ3LSaCVgIU(java.util.List list, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult(list));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nhy6AatX-ozFbn5VGoIgzNmOwgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13137$r8$lambda$Nhy6AatXozFbn5VGoIgzNmOwgs(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem itemToEdit = customAmountViewModel.getItemToEdit();
        if (itemToEdit != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$hm4bAAevqWLA4ROVUiSQH2hsrnQ(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QEk2LOqFV8Cls96dtFD95bjKFZo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RLqZs0G5wAIU6eeU1IGByO8FHWo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.ItemCreatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$QEk2LOqFV8Cls96dtFD95bjKFZo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SntlKRLPIWwYYFLSzVb6l5aYqU4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountAction.ADD, lineItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vxzg2Yb6xA9kqnCf5wokBiUPzqI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination editLineItemDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$3DsxBSRRwb16YObZPIwlM2LULfI(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YjKyyleAWdoolT1MTF6u037MvMw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$GyOHogq2RotBTX2uv5cKnbjAmis(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel $r8$lambda$cWu3JqAaK5C8_2GUdMXpX_BFjlo(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination businessCustomAmountDestination, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessCustomAmountDestination.getItemToEdit());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$emx6SCYcvwaWTl2UI3LkenrPMpo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$15JHrS8e7XqewDAKucZ_kIuoZNc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hTsFyD5Bv7If10H-765hxfkovZ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13138$r8$lambda$hTsFyD5Bv7If10H765hxfkovZ8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination editLineItemDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editLineItemDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(editLineItemDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(745441529, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.editLineItemDestination.<anonymous> (SharedNavigationEntries.kt:158)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$1GZe2gQ2cjjnSLJtK5OgNHrfFDY(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel editLineItemViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$emx6SCYcvwaWTl2UI3LkenrPMpo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$A91x90uG_YSdy1vjyBGPqIvyjz0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed3 = composer.changed(appNavigator);
            boolean z2 = i3 == 4;
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed3 | z2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$Vxzg2Yb6xA9kqnCf5wokBiUPzqI(com.paypal.oslo.core.navigation.AppNavigator.this, editLineItemDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemScreenKt.EditLineItemScreen(editLineItemViewModel, function0, function12, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hm4bAAevqWLA4ROVUiSQH2hsrnQ(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectCustomAmountAction.REMOVE, lineItem));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$krfBfw7Mr8Ww-WioUjYI6CwrrU4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13139$r8$lambda$krfBfw7Mr8WwWioUjYI6CwrrU4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.EDIT, lineItem));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qP9ywaa1ybL1FaB-17P1VJyHNOw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13140$r8$lambda$qP9ywaa1ybL1FaB17P1VJyHNOw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$FKESy39oFWXLEdanv17NX8_R56g((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ydzGdQkcoBriaceNhuNVM3v0uLA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination businessCustomAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessCustomAmountDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(businessCustomAmountDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(662928889, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.businessCustomAmountDestination.<anonymous> (SharedNavigationEntries.kt:98)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$cWu3JqAaK5C8_2GUdMXpX_BFjlo(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel customAmountViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13140$r8$lambda$qP9ywaa1ybL1FaB17P1VJyHNOw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13134$r8$lambda$1kxdewWRqTHgGrdy7_9EdCMG8Y(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$7MDmvImbVoKioIVj1qEdKlqg9H8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changed5 = composer.changed(appNavigator);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$YjKyyleAWdoolT1MTF6u037MvMw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean changedInstance = composer.changedInstance(customAmountViewModel);
            boolean changed6 = composer.changed(appNavigator);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if ((changedInstance | changed6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13137$r8$lambda$Nhy6AatXozFbn5VGoIgzNmOwgs(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountScreenKt.m13168CustomAmountScreeno3ECnlE(customAmountViewModel, rememberNavResultRequestId, function0, function12, function13, function14, (kotlin.jvm.functions.Function0) rememberedValue6, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z1-vGdcd2aLexiq8HJs5aif5-C4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13141$r8$lambda$z1vGdcd2aLexiq8HJs5aif5C4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13136$r8$lambda$LWDVgAi85xKt3W8bQ3LSaCVgIU(list, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final void sharedDestinations(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_settings_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2032432007, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$BPaG9zc9q97N3uufvP0AG6eGkKs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessPaymentSettings$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings businessPaymentSettings) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessPaymentSettings);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessPaymentSettings$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessPaymentSettings businessPaymentSettings) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(745441529, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.m13138$r8$lambda$hTsFyD5Bv7If10H765hxfkovZ8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$editLineItemDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination editLineItemDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editLineItemDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$editLineItemDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.EditLineItemDestination editLineItemDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(662928889, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$ydzGdQkcoBriaceNhuNVM3v0uLA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessCustomAmountDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination businessCustomAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessCustomAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessCustomAmountDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessCustomAmountDestination businessCustomAmountDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_items), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-111278334, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt.$r8$lambda$1Fx_JwescnJXLIJfHmqjMVGCWdw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessSelectItemsDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination businessSelectItemsInternalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessSelectItemsInternalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.SharedNavigationEntriesKt$businessSelectItemsDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessSelectItemsInternalDestination businessSelectItemsInternalDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
    }
}

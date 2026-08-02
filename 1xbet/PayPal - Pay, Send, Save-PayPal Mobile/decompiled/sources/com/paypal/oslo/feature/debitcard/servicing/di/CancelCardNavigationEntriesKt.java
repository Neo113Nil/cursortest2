package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "cancelCardEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "cancelCardReasonSelectionEntry", "cancelCardConfirmationEntry"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardNavigationEntriesKt {
    public static final void cancelCardEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1122465318, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.$r8$lambda$zvaaE7cHDRxughPHWsBuGw57zFs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$cancelCardEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination cancelCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cancelCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$cancelCardEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination cancelCardDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void cancelCardReasonSelectionEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-636139916, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.$r8$lambda$F11a6oc6FvVcB0VFG3coYikF_xg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$cancelCardReasonSelectionEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination cancelCardReasonSelectionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cancelCardReasonSelectionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$cancelCardReasonSelectionEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination cancelCardReasonSelectionDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void cancelCardConfirmationEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1047977734, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.m14291$r8$lambda$u6gJwZ9fNhByqjLcqw7fccD_zM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$cancelCardConfirmationEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination cancelCardConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cancelCardConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$cancelCardConfirmationEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination cancelCardConfirmationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel $r8$lambda$BYvgsucL_v_RT6UMejp0nYmuJrE(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination cancelCardReasonSelectionDestination, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cancelCardReasonSelectionDestination.getCancelCardInfo());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F11a6oc6FvVcB0VFG3coYikF_xg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination cancelCardReasonSelectionDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReasonSelectionDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cancelCardReasonSelectionDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-636139916, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.cancelCardReasonSelectionEntry.<anonymous> (CancelCardNavigationEntries.kt:34)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.$r8$lambda$BYvgsucL_v_RT6UMejp0nYmuJrE(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.CancelCardReasonSelectionScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel $r8$lambda$aGvavCxVN_Z55TbNL6B5IQFjDDk(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination cancelCardConfirmationDestination, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cancelCardConfirmationDestination.getReason(), cancelCardConfirmationDestination.getCancelCardInfo());
    }

    /* renamed from: $r8$lambda$u6gJwZ9fNhByq-jLcqw7fccD_zM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14291$r8$lambda$u6gJwZ9fNhByqjLcqw7fccD_zM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination cancelCardConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardConfirmationDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cancelCardConfirmationDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1047977734, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.cancelCardConfirmationEntry.<anonymous> (CancelCardNavigationEntries.kt:49)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.$r8$lambda$aGvavCxVN_Z55TbNL6B5IQFjDDk(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardConfirmationScreenKt.CancelCardConfirmationScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zvaaE7cHDRxughPHWsBuGw57zFs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination cancelCardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(cancelCardDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1122465318, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.cancelCardEntry.<anonymous> (CancelCardNavigationEntries.kt:25)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt.CancelCardScreen(cancelCardDestination.getCancelCardInfo(), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

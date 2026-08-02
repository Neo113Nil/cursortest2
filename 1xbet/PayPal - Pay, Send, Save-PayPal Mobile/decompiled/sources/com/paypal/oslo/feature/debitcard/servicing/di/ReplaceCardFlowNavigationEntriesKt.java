package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "replaceDigitalCardEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "cardReplacementEntry", "reportCardReasonSelectionEntry"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReplaceCardFlowNavigationEntriesKt {
    public static final void replaceDigitalCardEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1033295692, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.$r8$lambda$hKMkJkrjQdY0An6rVaDGibZCMNM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$replaceDigitalCardEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination replaceDigitalCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(replaceDigitalCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$replaceDigitalCardEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination replaceDigitalCardDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void cardReplacementEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-694388298, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.$r8$lambda$icYsrRI07w8hrqxOpSKEmva0JIA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$cardReplacementEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination cardReplacementDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardReplacementDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$cardReplacementEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination cardReplacementDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void reportCardReasonSelectionEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(653173362, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.$r8$lambda$0iZZtSaXWabKDGKKvb9Kn3zMPO8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$reportCardReasonSelectionEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination reportCardReasonSelectionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(reportCardReasonSelectionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$reportCardReasonSelectionEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination reportCardReasonSelectionDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0iZZtSaXWabKDGKKvb9Kn3zMPO8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination reportCardReasonSelectionDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReasonSelectionDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(reportCardReasonSelectionDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(653173362, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.reportCardReasonSelectionEntry.<anonymous> (ReplaceCardFlowNavigationEntries.kt:54)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.m14300$r8$lambda$d6qFcidLbVS5v5sfkdS4n1LB00(com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.ReportCardReasonSelectionScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel $r8$lambda$2BaTO4gWWAQxpMOElTMsHDBHH7g(com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination cardReplacementDestination, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cardReplacementDestination.getReplacementInfo());
    }

    /* renamed from: $r8$lambda$d6qFcidLbVS5v5-sfkdS4n1LB00, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel m14300$r8$lambda$d6qFcidLbVS5v5sfkdS4n1LB00(com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination reportCardReasonSelectionDestination, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(reportCardReasonSelectionDestination.getReplacementInfo());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hKMkJkrjQdY0An6rVaDGibZCMNM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination replaceDigitalCardDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceDigitalCardDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(replaceDigitalCardDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1033295692, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.replaceDigitalCardEntry.<anonymous> (ReplaceCardFlowNavigationEntries.kt:26)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.m14301$r8$lambda$zicSeCA2yA1yn3Q8MRi7hf2MQA(com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.ReplaceDigitalCardScreenKt.ReplaceDigitalCardScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$icYsrRI07w8hrqxOpSKEmva0JIA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination cardReplacementDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cardReplacementDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-694388298, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.cardReplacementEntry.<anonymous> (ReplaceCardFlowNavigationEntries.kt:40)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.$r8$lambda$2BaTO4gWWAQxpMOElTMsHDBHH7g(com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementScreenKt.CardReplacementScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zicSeCA2yA1yn3-Q8MRi7hf2MQA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel m14301$r8$lambda$zicSeCA2yA1yn3Q8MRi7hf2MQA(com.paypal.oslo.feature.debitcard.servicing.di.ReplaceDigitalCardDestination replaceDigitalCardDestination, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(replaceDigitalCardDestination.getReplacementInfo());
    }
}

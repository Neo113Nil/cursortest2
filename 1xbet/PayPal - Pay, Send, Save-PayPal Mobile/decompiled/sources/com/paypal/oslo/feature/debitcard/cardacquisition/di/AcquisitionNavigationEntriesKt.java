package com.paypal.oslo.feature.debitcard.cardacquisition.di;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a)\u0010\n\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0006\u001a!\u0010\r\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "debitCardAcquisitionIntroEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "debitCardInContextAcquisitionFlowEntry", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "inContextAcquisitionLoadingEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;)V", "debitCardApplyAndCreateEntry", "debitCardCreationSuccessEntry"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AcquisitionNavigationEntriesKt {
    public static final void debitCardAcquisitionIntroEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(145655978, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.$r8$lambda$QYNy15QP2DSnGB_3dDmP_8Po2Ak(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardAcquisitionIntroEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination debitCardAcquisitionIntroDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardAcquisitionIntroDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardAcquisitionIntroEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination debitCardAcquisitionIntroDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardInContextAcquisitionFlowEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1605475066, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.$r8$lambda$QZK2N5k5S3QnhWMua7p0oAd439w(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardInContextAcquisitionFlowEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination debitCardInContextAcquisitionFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardInContextAcquisitionFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardInContextAcquisitionFlowEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination debitCardInContextAcquisitionFlowDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void inContextAcquisitionLoadingEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1387342741, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.m14179$r8$lambda$QD4KXtrfLeVaEYh4QdrX53SElU(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardFundingOptionsCache, (com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$inContextAcquisitionLoadingEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination inContextAcquisitionLoadingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(inContextAcquisitionLoadingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$inContextAcquisitionLoadingEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination inContextAcquisitionLoadingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardApplyAndCreateEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-827189090, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.$r8$lambda$kgvqrjnNRfXe4qr2zmxpJcYehkA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardApplyAndCreateEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination debitCardApplyAndCreateDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardApplyAndCreateDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardApplyAndCreateEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination debitCardApplyAndCreateDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardCreationSuccessEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-193058126, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.$r8$lambda$BzNe4A8jeXTPAvXWMxNyZHZlBPw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardCreationSuccessEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination debitCardCreationSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardCreationSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$debitCardCreationSuccessEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination debitCardCreationSuccessDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel $r8$lambda$2OqTF9sKotDf3aCnq_FCt56uRQg(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination debitCardInContextAcquisitionFlowDestination, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardInContextAcquisitionFlowDestination.getProductName());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BzNe4A8jeXTPAvXWMxNyZHZlBPw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination debitCardCreationSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardCreationSuccessDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(debitCardCreationSuccessDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-193058126, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.di.debitCardCreationSuccessEntry.<anonymous> (AcquisitionNavigationEntries.kt:101)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.$r8$lambda$Q9SRXdMQhkXMkxGuiDg2ljDTVdM(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination.this, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt.DebitCardCreationSuccessScreen(appNavigator, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel $r8$lambda$Q9SRXdMQhkXMkxGuiDg2ljDTVdM(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination debitCardCreationSuccessDestination, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardCreationSuccessDestination.getProductName(), debitCardCreationSuccessDestination.isEligible());
    }

    /* renamed from: $r8$lambda$QD4KXtrfLeVaEYh4Qd-rX53SElU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14179$r8$lambda$QD4KXtrfLeVaEYh4QdrX53SElU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination inContextAcquisitionLoadingDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inContextAcquisitionLoadingDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(inContextAcquisitionLoadingDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1387342741, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.di.inContextAcquisitionLoadingEntry.<anonymous> (AcquisitionNavigationEntries.kt:78)");
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = inContextAcquisitionLoadingDestination.getProductName();
            java.lang.String selectedFundingSourceId = inContextAcquisitionLoadingDestination.getSelectedFundingSourceId();
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.InContextAcquisitionLoadingScreen(appNavigator, productName, debitCardFundingOptionsCache, null, selectedFundingSourceId, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QYNy15QP2DSnGB_3dDmP_8Po2Ak(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination debitCardAcquisitionIntroDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(debitCardAcquisitionIntroDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(145655978, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.di.debitCardAcquisitionIntroEntry.<anonymous> (AcquisitionNavigationEntries.kt:31)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.m14181$r8$lambda$dgsAIqGXiF8Se3UZLPH8E5DRNE(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination.this, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean z2 = i3 == 4;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.m14180$r8$lambda$YtiNP5maLqY9lg5eyMapdVd0vk(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination.this, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current2 == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.DebitCardAcquisitionIntroScreen(debitCardAcquisitionIntroViewModel, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.class), current2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, composer, 0), current2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras(), function12) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function12), composer, 0, 0), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QZK2N5k5S3QnhWMua7p0oAd439w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination debitCardInContextAcquisitionFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardInContextAcquisitionFlowDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(debitCardInContextAcquisitionFlowDestination) : composer.changedInstance(debitCardInContextAcquisitionFlowDestination) ? 4 : 2;
        }
        boolean z = true;
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1605475066, i, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.di.debitCardInContextAcquisitionFlowEntry.<anonymous> (AcquisitionNavigationEntries.kt:58)");
            }
            if ((i & 14) != 4 && ((i & 8) == 0 || !composer.changedInstance(debitCardInContextAcquisitionFlowDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.$r8$lambda$2OqTF9sKotDf3aCnq_FCt56uRQg(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardInContextAcquisitionFlowDestination.this, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.DebitCardInContextAcquisitionScreenKt.DebitCardInContextAcquisitionScreen(appNavigator, debitCardInContextAcquisitionFlowDestination.getProductName(), (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), debitCardInContextAcquisitionFlowDestination.getToolBarConfig(), composer, com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig.$stable << 9, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YtiNP5ma-LqY9lg5eyMapdVd0vk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel m14180$r8$lambda$YtiNP5maLqY9lg5eyMapdVd0vk(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination debitCardAcquisitionIntroDestination, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardAcquisitionIntroDestination.getProductName());
    }

    /* renamed from: $r8$lambda$dgsAIqGXiF-8Se3UZLPH8E5DRNE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel m14181$r8$lambda$dgsAIqGXiF8Se3UZLPH8E5DRNE(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination debitCardAcquisitionIntroDestination, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardAcquisitionIntroDestination.getProductName());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kgvqrjnNRfXe4qr2zmxpJcYehkA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination debitCardApplyAndCreateDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardApplyAndCreateDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(debitCardApplyAndCreateDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-827189090, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.di.debitCardApplyAndCreateEntry.<anonymous> (AcquisitionNavigationEntries.kt:90)");
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = debitCardApplyAndCreateDestination.getProductName();
            boolean shouldIssuePhysical = debitCardApplyAndCreateDestination.getShouldIssuePhysical();
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.DebitCardApplyAndCreateScreen(productName, shouldIssuePhysical, appNavigator, null, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

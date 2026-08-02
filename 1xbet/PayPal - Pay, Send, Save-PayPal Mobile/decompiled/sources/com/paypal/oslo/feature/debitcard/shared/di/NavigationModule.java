package com.paypal.oslo.feature.debitcard.shared.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDeepLinkMapper;", "mapper", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideDebitCardDeepLinkEntryProviderInstaller", "(Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDeepLinkMapper;Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "provideInContextAcquisitionEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.shared.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.debitcard.shared.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDebitCardDeepLinkEntryProviderInstaller(final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper mapper, final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.di.NavigationModule.$r8$lambda$wzPnSN0W0elKPCLunHxn4E4mkIU(com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.di.NavigationModule.$r8$lambda$JMexWtA9Xin6qmjszN0z7edpWQI(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideInContextAcquisitionEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache cache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cache, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.di.NavigationModule.m14571$r8$lambda$kFrC55zBg28U3EkIiVW435X88Q(com.paypal.oslo.core.navigation.AppNavigator.this, cache, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JMexWtA9Xin6qmjszN0z7edpWQI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        com.paypal.oslo.feature.debitcard.shared.di.SharedNavigationEntriesKt.sharedWebViewEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.debitCardDestinationRouterEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.debitCardServicingEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.debitCardActivationRouterEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.debitCardActivationEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.debitCardPinEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.debitCardViewPinEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.manageSecondaryCardHolderEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.secondaryCardManagementEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.requestPhysicalCardEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.requestPhysicalCardDecisionEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.replaceDigitalCardEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.cardReplacementEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ReplaceCardFlowNavigationEntriesKt.reportCardReasonSelectionEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.cancelCardEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.cancelCardReasonSelectionEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.CancelCardNavigationEntriesKt.cancelCardConfirmationEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.shippingAddressEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.debitCardAcquisitionIntroEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.debitCardApplyAndCreateEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.debitCardCreationSuccessEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.manageWalletEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.fundingSourceSelectorEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt.cardConnectEntry(entryProviderScope, appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PLXiO20rJKujVIvUe0MsYFzNI7I(com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper debitCardDeepLinkMapper, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher debitCardDeepLinkLauncher, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardDeepLinkLauncher, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(debitCardDeepLinkLauncher) : composer.changedInstance(debitCardDeepLinkLauncher) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-643846390, i, -1, "com.paypal.oslo.feature.debitcard.shared.di.NavigationModule.provideDebitCardDeepLinkEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:64)");
            }
            com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination mapToDestination = debitCardDeepLinkMapper.mapToDestination(debitCardDeepLinkLauncher);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changed = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(mapToDestination);
            com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$provideDebitCardDeepLinkEntryProviderInstaller$1$1$1$1 rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$provideDebitCardDeepLinkEntryProviderInstaller$1$1$1$1(appNavigator, mapToDestination, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kFrC55zBg28U3E-kIiVW435X88Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14571$r8$lambda$kFrC55zBg28U3EkIiVW435X88Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.debitCardInContextAcquisitionFlowEntry(entryProviderScope, appNavigator);
        com.paypal.oslo.feature.debitcard.cardacquisition.di.AcquisitionNavigationEntriesKt.inContextAcquisitionLoadingEntry(entryProviderScope, appNavigator, debitCardFundingOptionsCache);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wzPnSN0W0elKPCLunHxn4E4mkIU(final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper debitCardDeepLinkMapper, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-643846390, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.shared.di.NavigationModule.$r8$lambda$PLXiO20rJKujVIvUe0MsYFzNI7I(com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper.this, appNavigator, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$provideDebitCardDeepLinkEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher debitCardDeepLinkLauncher) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardDeepLinkLauncher);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.shared.di.NavigationModule$provideDebitCardDeepLinkEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher debitCardDeepLinkLauncher) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}

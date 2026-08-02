package com.paypal.oslo.feature.p2p.di;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0001\u0010\u0004\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007J4\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/p2p/di/NavigationModule;", "", "<init>", "()V", "provideP2PEntryProviderInstaller", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lkotlin/ExtensionFunctionType;", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "contactsApi", "Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "successDestinationMapper", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentTransferResultToSuccessDestinationMapper;", "contactMapper", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/P2PContactItemToUiContactMapper;", "amountScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "transferScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "currencyPickerComponents", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/CurrencyPickerComponents;", "successScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "searchContactsEventHandler", "Lcom/paypal/oslo/feature/p2p/ui/contacts/SearchContactsEventHandler;", "p2pSearchStrategy", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "context", "Landroid/content/Context;", "userStore", "Lcom/paypal/oslo/core/userstore/UserStore;", "p2pFeatureGateManager", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "onEvent", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "currentNavigator", "currentViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "destination", "Lcom/paypal/oslo/feature/contacts/api/navigation/SearchContactsDestination;", "p2p_prodRelease", "editAmountState", "Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;", "contactSectionState", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;", "uiState", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.p2p.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideP2PEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, final com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper successDestinationMapper, final com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper contactMapper, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, @com.paypal.oslo.feature.contacts.api.searchstrategy.P2PSearchStrategy final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy p2pSearchStrategy, @dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, final com.paypal.oslo.core.userstore.UserStore userStore, final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successDestinationMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchContactsEventHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pSearchStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda86
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$4yB4_lUa9HWP3Ym9OLwajYbreiY(context, navigator, amountScreenComponents, transferScreenComponents, contactMapper, successDestinationMapper, userStore, p2pSearchStrategy, contactsApi, searchContactsEventHandler, successScreenComponents, currencyPickerComponents, p2pFeatureGateManager, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-d-x02jpqtbq_ajuWtVqCuM2oTg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17176$r8$lambda$dx02jpqtbq_ajuWtVqCuM2oTg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$WXmresRCvPPsX7AYV6wwMobnMnw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1o1cp79fO4_uEhJeFYNVizNltuc(com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination searchContactsDestination, com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent contactsCallbackEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCallbackEvent, "");
        searchContactsEventHandler.handle$p2p_prodRelease(contactsCallbackEvent, appNavigator, contactSectionViewModel, searchContactsDestination.getContactSearchNetworkType());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1yd5FfMd0rXISeybqM_YMnxmbd0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination claimWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(claimWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2115211432, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:970)");
            }
            java.lang.String url = claimWebViewDestination.getUrl();
            java.lang.String title = claimWebViewDestination.getTitle();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda65
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$EZyCF7dKjivCTTplKCF9ln51izk(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.P2pWebViewScreen(url, title, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewDefaults.CLAIM_MONEY_WEBVIEW_SOURCE, composer, 24576, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3AM7AbkNS45-MhQsJowuIzvyoos, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17177$r8$lambda$3AM7AbkNS45MhQsJowuIzvyoos(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3EGyf09lbc0_BzmMqpvg0j-NXbQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17178$r8$lambda$3EGyf09lbc0_BzmMqpvg0jNXbQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda97
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$TOGSTXzyG80o0G4a5q7JPJCRceQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4-blM2-Nd_1I9l8YSn32vmJaaAs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17179$r8$lambda$4blM2Nd_1I9l8YSn32vmJaaAs(android.content.Context context, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination claimPreviewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimPreviewDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(claimPreviewDestination) : composer.changedInstance(claimPreviewDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1460420687, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:877)");
            }
            java.lang.String string = context.getString(com.paypal.oslo.feature.p2p.R.string.feature_p2p_claim_money_web_view_url, claimPreviewDestination.getPaymentCodeId());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt.DeeplinkFeatureGate(p2pFeatureGateManager, appNavigator, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination.class), string, "Claim Money", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1353729596, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$O53ImwFP89SeIW7HohjwPUU9xYM(com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination.this, appNavigator, successScreenComponents, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 221184);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4BT9wjYd_CHVb3XipNIWH5tfZic(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$8HgQxodyXB7OudN9OlD9eRdScxo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$4sR0l92YwQhamLBlZ57btF8rdBY(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination scamAlertDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        java.lang.String str;
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountCountryCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(scamAlertDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(227194229, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:842)");
            }
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel scamAlertViewModel = (com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (accountCountryCode = user.getAccountCountryCode()) != null) {
                str = accountCountryCode.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
            str = "us";
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.ScamAlertRoute(scamAlertDestination, contactSectionViewModel, scamAlertViewModel, appNavigator, str, composer, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4yB4_lUa9HWP3Ym9OLwajYbreiY(final android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, final com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper p2PContactItemToUiContactMapper, final com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper paymentTransferResultToSuccessDestinationMapper, final com.paypal.oslo.core.userstore.UserStore userStore, final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, final com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata(com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2134346073, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda103
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$U5zt0Cz1UTvd9yZgH8HeFIeyXrY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination sendTransferDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sendTransferDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination sendTransferDestination) {
                return l1TabbedMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata(com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-99623935, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda115
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$focpA5kJi07ap4avTOqI5SfkQbE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination sendOtherDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sendOtherDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination sendOtherDestination) {
                return l1TabbedMetadata2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-592120282, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17195$r8$lambda$ObF4O84YrTD2k5C7RzquuogPk0(com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.this, transferScreenComponents, appNavigator, p2PContactItemToUiContactMapper, paymentTransferResultToSuccessDestinationMapper, (com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(reviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$gxkAd2FppxjwPtS66KlGXZWtMfo(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$QTlIb0H3Uflz10r1cX8yIFlzsiw(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 19, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(774645483, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17209$r8$lambda$bs5hYl1DJ7QKWFsz8eU_PlRjLE(com.paypal.oslo.core.userstore.UserStore.this, context, appNavigator, (com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination feeInfoDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(feeInfoDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination feeInfoDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1283888527, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$70giUJsnRwChmdhB0VLQDfQrXq8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination feeInfoWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(feeInfoWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination feeInfoWebViewDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.p2p.R.string.feature_p2p_add_note_navigation_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-434591800, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$kDZjI5Y_W27ihv6_wVLvsS0YPco(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.AddNoteDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.AddNoteDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.AddNoteDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.AddNoteDestination addNoteDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addNoteDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.AddNoteDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.AddNoteDestination addNoteDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1353364148, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$5lhlxNujSZG00S6GqxJU0x_gGYk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination editAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination editAmountDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1909134365, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$jR8ps0ilm0WNKT96kXMykTg9gBo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination networkErrorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(networkErrorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination networkErrorDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1421579077, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda104
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$FsyrIXYWrnyHKVbEpoIQBbc60zY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination highRiskScamDeclineDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(highRiskScamDeclineDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination highRiskScamDeclineDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1337446334, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda105
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$QQYgEi6Q0iRwQzbGRcquPbojvQc(com.paypal.oslo.core.navigation.AppNavigator.this, contactsSearchStrategy, contactsApi, searchContactsEventHandler, (com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination searchContactsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(searchContactsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination searchContactsDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-979098536, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda106
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17208$r8$lambda$bNdb7UIxX2ICmg9X9WYZfOpI(com.paypal.oslo.core.navigation.AppNavigator.this, successScreenComponents, (com.paypal.oslo.feature.p2p.navigation.SuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.SuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.SuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.SuccessDestination successDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(successDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.SuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.SuccessDestination successDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.p2p.R.string.feature_p2p_currency_picker_navigation_title), false, false, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda107
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17189$r8$lambda$FP3nrtOj9AlM7WfZxwYFyR1qsE(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 82, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1877762661, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda108
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17203$r8$lambda$VbWbgahYb6k_ibwsNFj1rONQ3w(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.this, appNavigator, (com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(currencyPickerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1876748141, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda109
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$sCjDN_nJE9cHQynqezatSX6JIQg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(crossBorderDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        final java.util.Map bottomSheetMetadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-478297544, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda110
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17180$r8$lambda$5_2fD8M4FLSyPs7Z5zpZkvy4cI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination paymentLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(paymentLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$28
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination paymentLinkDestination) {
                return bottomSheetMetadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance14);
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(13537701, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda111
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17200$r8$lambda$S_EsVqul1eqcS54yMY0YElSe5U(com.paypal.oslo.core.userstore.UserStore.this, appNavigator, (com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination paymentLinkTermsWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(paymentLinkTermsWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$30
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination paymentLinkTermsWebViewDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance15);
        final java.util.Map l3Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2007648185, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda113
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17212$r8$lambda$iVmHsZP37ab7SMKLV1PrqkjFYM(com.paypal.oslo.core.userstore.UserStore.this, appNavigator, (com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination paymentLinkWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(paymentLinkWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$32
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination paymentLinkWebViewDestination) {
                return l3Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance16);
        final java.util.Map l2Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(227194229, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda114
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$4sR0l92YwQhamLBlZ57btF8rdBY(com.paypal.oslo.core.userstore.UserStore.this, appNavigator, (com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination scamAlertDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(scamAlertDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$34
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination scamAlertDestination) {
                return l2Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance17);
        final java.util.Map l3Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-878010779, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda116
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$Nek5HKx9fUoD32ExKCi9tKxQkEc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination scamAlertWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(scamAlertWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$36
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination scamAlertWebViewDestination) {
                return l3Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance18);
        final java.util.Map l2Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1460420687, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda117
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17179$r8$lambda$4blM2Nd_1I9l8YSn32vmJaaAs(context, p2pFeatureGateManager, appNavigator, successScreenComponents, (com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination claimPreviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(claimPreviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$38
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination claimPreviewDestination) {
                return l2Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance19);
        final java.util.Map l2Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-389122699, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda118
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$XqFXfuVgnun6rp7Jzi9FaVHSGkA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination claimSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(claimSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$40
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination claimSuccessDestination) {
                return l2Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance20);
        final java.util.Map l2Metadata$default12 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1334281623, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda119
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17191$r8$lambda$Lwr5lMTKl2fjrnqHUN4ESkM24U(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$41
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination claimHardDeclineDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(claimHardDeclineDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$42
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination claimHardDeclineDestination) {
                return l2Metadata$default12;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance21);
        final java.util.Map l2Metadata$default13 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2115211432, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda120
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$1yd5FfMd0rXISeybqM_YMnxmbd0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination claimWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(claimWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$44
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.ClaimWebViewDestination claimWebViewDestination) {
                return l2Metadata$default13;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance22);
        final java.util.Map l3Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-716970328, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda121
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$TjTVZhPYGFyFmqhmAraysjroYnQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination payRequestWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payRequestWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$46
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination payRequestWebViewDestination) {
                return l3Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance23);
        final java.util.Map l2Metadata$default14 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance24 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2093092297, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda122
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$LSpl1tN6plaP2FzQH9jwX66cO10(com.paypal.oslo.core.navigation.AppNavigator.this, successScreenComponents, (com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination payRequestLandingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payRequestLandingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$48
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination payRequestLandingDestination) {
                return l2Metadata$default14;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance24);
        final java.util.Map l2Metadata$default15 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance25 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-181320005, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$EWz7xArjalX4svy8ol35vBqWHNU(com.paypal.oslo.core.navigation.AppNavigator.this, successScreenComponents, (com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$49
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination payRequestDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payRequestDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$lambda$0$$inlined$entry$default$50
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination payRequestDestination) {
                return l2Metadata$default15;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance25);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5_2fD8M4FL-SyPs7Z5zpZkvy4cI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17180$r8$lambda$5_2fD8M4FLSyPs7Z5zpZkvy4cI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination paymentLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-478297544, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:777)");
            }
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(contactSectionViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$UDASbVp6BCgTGVE5abSoGVDGEAg(com.paypal.oslo.core.navigation.AppNavigator.this, contactSectionViewModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$u7niFW6rcReJNvLaUq4dUsQWdFk(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.p2p.ui.components.PaymentLinkInfoBottomSheetKt.PaymentLinkInfoBottomSheetContent(function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5lhlxNujSZG00S6GqxJU0x_gGYk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination editAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editAmountDestination, "");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(editAmountDestination) : composer.changedInstance(editAmountDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1353364148, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:434)");
            }
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(editAmountViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer, 0, 7);
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel = (com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            java.lang.String initialAmount = editAmountDestination.getInitialAmount();
            java.lang.String transferAttemptId = ((com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState) collectAsStateWithLifecycle.getValue()).getTransferAttemptId();
            boolean changed = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(editAmountViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda82
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17198$r8$lambda$QZkNq4vK4Jhqys178_iM1SCGnU(com.paypal.oslo.core.navigation.AppNavigator.this, editAmountViewModel, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(editAmountDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda83
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17182$r8$lambda$8qeTbuBSTm_Fc__GcCLrBF5nCw(com.paypal.oslo.core.navigation.AppNavigator.this, editAmountDestination, (com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt.EditAmountScreen(initialAmount, transferAttemptId, function1, (kotlin.jvm.functions.Function1) rememberedValue2, transferViewModel, null, composer, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6-WUEXv-ajcXpl4tI8RgM_npGqc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17181$r8$lambda$6WUEXvajcXpl4tI8RgM_npGqc(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.copy$default(currencyPickerDestination, null, null, null, null, crossBorderDestination.isEditMode(), crossBorderDestination.getEditModeIntent(), false, 79, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$70giUJsnRwChmdhB0VLQDfQrXq8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination feeInfoWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeInfoWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(feeInfoWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1283888527, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:397)");
            }
            java.lang.String url = feeInfoWebViewDestination.getUrl();
            java.lang.String title = feeInfoWebViewDestination.getTitle();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17196$r8$lambda$OnRD2Z6g88su4P8FiK7QsS3U7s(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.P2pWebViewScreen(url, title, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewDefaults.FEE_INFO_WEBVIEW_SOURCE, composer, 24576, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8HgQxodyXB7OudN9OlD9eRdScxo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8qeTbuB-STm_Fc__GcCLrBF5nCw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17182$r8$lambda$8qeTbuBSTm_Fc__GcCLrBF5nCw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination editAmountDestination, final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17187$r8$lambda$ENC97UJvXIQt86o1prrbmci908(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, editAmountDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9GAAc96wLqxX5jtuMfhA-rVBEyg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17183$r8$lambda$9GAAc96wLqxX5jtuMfhArVBEyg(java.lang.String str, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        java.lang.String string = context.getString(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_fee_info_web_page_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        navigationScope.push(new com.paypal.oslo.feature.p2p.navigation.FeeInfoWebViewDestination(str, string));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9b1PKzI94L3NNXVW7MeCgaBQmjU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda99
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$rJ4SC2cCPxCUgesmWpNwgAkssNk(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, currencyItem, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9klTsy-CjAin87zbGnCxYYE7YOQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17184$r8$lambda$9klTsyCjAin87zbGnCxYYE7YOQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE);
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bvu_y4NdxIfQAv0RQg5OHYjTbVE(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination(com.paypal.oslo.feature.p2p.domain.common.mapper.ContactSearchNetworkTypeMapperKt.toContactSearchNetworkType(paymentTransferIntent)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CMn0U5sAyI70E_EnvnmYy0Uc_OQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$lhNVX9TwU3oXtpD9NIGM5b2YvG0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DLPTnFG7L6gee-3idDbYGHVQ9BI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17186$r8$lambda$DLPTnFG7L6gee3idDbYGHVQ9BI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DwpZewYLWcWrlEdEwCTwgg35cPg(com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel claimPreviewViewModel) {
        claimPreviewViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ENC97UJvXI-Qt86o1prrbmci908, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17187$r8$lambda$ENC97UJvXIQt86o1prrbmci908(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination editAmountDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.copy$default(currencyPickerDestination, null, null, null, null, true, editAmountDestination.getIntent(), true, 15, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EWz7xArjalX4svy8ol35vBqWHNU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination payRequestDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(payRequestDestination) : composer.changedInstance(payRequestDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-181320005, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:1011)");
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(payRequestDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda66
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$SO4GQRRazCVf6uKWUrg5TqPQOhY(com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination.this, (com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.PayRequestScreen(appNavigator, successScreenComponents, (com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EZyCF7dKjivCTTplKCF9ln51izk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$gJLJCAWbJtskPRzL_2sn2xQm0Vg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EhgyApbfMJXCXZAz9jBX5ZlUumo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda98
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17194$r8$lambda$O9J8WtQAJUxN9u1Vkz7FvWx_iE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Eq-PLXEkTfxcmJLxpENlgR_kZyY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17188$r8$lambda$EqPLXEkTfxcmJLxpENlgR_kZyY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination, final androidx.compose.runtime.State state, final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$c_nTOcuappcyxdSW7LATHXPT1Ds(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination.this, str, str2, state, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FHY80wZO9xjOefeBq1UFFCAjdD8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$xKxgGlGB2BN_gRVSp_ia13pO6j0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FP3nrtOj9AlM7WfZx-wYFyR1qsE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17189$r8$lambda$FP3nrtOj9AlM7WfZxwYFyR1qsE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_CANCELLED_CURRENCY_SELECTION, null, null, 6, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17205$r8$lambda$YCgn56W7vTmoOVyICEpXg44kg0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FURwuokwbhliEvAPE2uCxhLvY0c(final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.animation.AnimatedContentScope animatedContentScope, kotlin.Unit unit, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(537772416, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:625)");
        }
        java.lang.String transferAttemptId = currencyPickerDestination.getTransferAttemptId();
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel = (com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        boolean changedInstance = composer.changedInstance(currencyPickerDestination);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda78
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$yUoDQfGamyATM_omDyBTPbJUijo(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, appNavigator, (java.lang.String) obj, (java.lang.String) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        boolean changedInstance2 = composer.changedInstance(currencyPickerDestination);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda80
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$9b1PKzI94L3NNXVW7MeCgaBQmjU(com.paypal.oslo.core.navigation.AppNavigator.this, currencyPickerDestination, (com.paypal.oslo.feature.p2p.domain.model.CurrencyItem) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt.CurrencyPickerScreen(transferAttemptId, currencyPickerComponents, sharedTransitionScope, animatedContentScope, currencyPickerViewModel, function2, (kotlin.jvm.functions.Function1) rememberedValue2, composer, (i << 9) & 7168, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FsyrIXYWrnyHKVbEpoIQBbc60zY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination highRiskScamDeclineDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(highRiskScamDeclineDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1421579077, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:489)");
            }
            com.paypal.pds.core.Icon.Information information = com.paypal.pds.core.Icon.Information.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17218$r8$lambda$x5E_eUL3zRC_He98MvOAImhuBk(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17176$r8$lambda$dx02jpqtbq_ajuWtVqCuM2oTg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenKt.ErrorScreen(new com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenConfig(information, "We can't transfer your money just yet", "This may happen as an added layer of security to protect your account.\n\nTrying again later may help fix the problem.", null, "Done", null, false, false, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, 104, null), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HyEXR__tLZEcos81r80VTuRdde8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I9xoMyaAZchv1VYevG2LXfBncV0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.navigation.AddNoteDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IjF7b8ykQu7GNeloEkF4MP3GTcY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda102
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$Yk6oOnrgnWzAhv18A7IF_nwkUSI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IrLXQRcLhoM-D3906Ntzo7wPjEc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17190$r8$lambda$IrLXQRcLhoMD3906Ntzo7wPjEc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17217$r8$lambda$ox8KsVEy0OaEnxp1Usi0NiuBBs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kl9h1nPj4V1ZRMuNiefrz5vZe2g(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda81
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$iU7BUeWdLZFoe3B5WnhKQXS9cZo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        editAmountViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated(crossBorderDestination.getReceiveCurrencyId()));
        editAmountViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent(str2, str3, str4, str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LSpl1tN6plaP2FzQH9jwX66cO10(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination payRequestLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestLandingDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(payRequestLandingDestination) : composer.changedInstance(payRequestLandingDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2093092297, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:995)");
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(payRequestLandingDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$uFF7g8RxtaD2vl8p_prGPxgE_mA(com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination.this, (com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.PayRequestScreen(appNavigator, successScreenComponents, (com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LX7gts5Ue56g7QFaYCGxx6ePMbo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Lwr5lMTKl2fjrnqHUN4ESk-M24U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17191$r8$lambda$Lwr5lMTKl2fjrnqHUN4ESkM24U(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination claimHardDeclineDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimHardDeclineDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1334281623, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:948)");
            }
            com.paypal.pds.core.Icon.Critical critical = com.paypal.pds.core.Icon.Critical.INSTANCE;
            com.paypal.pds.components.AvatarEmphasis.Custom custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda94
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda95
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$UyPFOyuzCfacBfgoWTmcCEtdsXs(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda96
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17197$r8$lambda$Op4W9C61KIi33Arn2Ue2dUPXM8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenKt.ErrorScreen(new com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenConfig(critical, "This payment is no longer available", null, null, "Done", custom, false, false, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, 12, null), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MYMUoXVm-urDE2Mhk7Hz0OYAQVQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17192$r8$lambda$MYMUoXVmurDE2Mhk7Hz0OYAQVQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda101
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$I9xoMyaAZchv1VYevG2LXfBncV0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MYVItrv4orke8ANsfOJhqk9jh40(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NKgM3YRw5idFFd-7MuCAarqm9sA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17193$r8$lambda$NKgM3YRw5idFFd7MuCAarqm9sA(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination(currencyPickerDestination.getCurrentAmount(), currencyPickerDestination.getEditModeIntent()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nek5HKx9fUoD32ExKCi9tKxQkEc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination scamAlertWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(scamAlertWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-878010779, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:867)");
            }
            java.lang.String url = scamAlertWebViewDestination.getUrl();
            java.lang.String title = scamAlertWebViewDestination.getTitle();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17199$r8$lambda$R7Q7IGTuSAntIlsc6ZjLoV2VPw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertWebViewScreenKt.ScamAlertWebViewScreen(url, title, (kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O53ImwFP89SeIW7HohjwPUU9xYM(com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination claimPreviewDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1353729596, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:890)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            final com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel claimPreviewViewModel = (com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(claimPreviewViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = composer.changedInstance(claimPreviewViewModel);
            boolean changedInstance2 = composer.changedInstance(claimPreviewDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$1$1(claimPreviewViewModel, claimPreviewDestination, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
            boolean changedInstance3 = composer.changedInstance(claimPreviewViewModel);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance3 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1(claimPreviewViewModel, appNavigator, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(claimPreviewViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 0);
            com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState claimPreviewUiState = (com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState) collectAsStateWithLifecycle.getValue();
            if (claimPreviewUiState instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Loading) {
                composer.startReplaceGroup(-440905289);
                com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewScreenKt.ClaimPreviewLoadingScreen(composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(claimPreviewUiState instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content)) {
                    composer.startReplaceGroup(-440907370);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-783068573);
                com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content content = (com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content) claimPreviewUiState;
                com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData data = content.getData();
                boolean isClaimInProgress = content.isClaimInProgress();
                boolean changedInstance4 = composer.changedInstance(claimPreviewViewModel);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda76
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$DwpZewYLWcWrlEdEwCTwgg35cPg(com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean changedInstance5 = composer.changedInstance(claimPreviewViewModel);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda77
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.p2p.di.NavigationModule.m17201$r8$lambda$SuprLYfpMzgrBw5TmEd2LRAhcM(com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewScreenKt.ClaimPreviewScreen(data, successScreenComponents, isClaimInProgress, function0, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$O9J8WtQAJUxN9u-1Vkz7FvWx_iE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17194$r8$lambda$O9J8WtQAJUxN9u1Vkz7FvWx_iE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ObF4O84YrTD2k5C7Rzquuo-gPk0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17195$r8$lambda$ObF4O84YrTD2k5C7RzquuogPk0(com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper p2PContactItemToUiContactMapper, final com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper paymentTransferResultToSuccessDestinationMapper, final com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewDestination, "");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(reviewDestination) : composer.changedInstance(reviewDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-592120282, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:213)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_sendMoney_add_funds_sheet_title, composer, 0);
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(((com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0)).getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer, 0, 7);
            final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
            java.lang.String amountValue = reviewDestination.getAmountValue();
            java.lang.String receiveCurrencyCode = reviewDestination.getReceiveCurrencyCode();
            boolean isPAR = reviewDestination.isPAR();
            boolean changed = composer.changed(appNavigator);
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(reviewDestination));
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$fSp2r9SzR_d5PhuSQ_iJC0UKj5Q(com.paypal.oslo.core.navigation.AppNavigator.this, reviewDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(p2PContactItemToUiContactMapper);
            boolean changed3 = composer.changed(paymentTransferResultToSuccessDestinationMapper);
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$QGPoG8amCOSsuOlxdpgxQ540uAU(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper.this, appNavigator, p2PContactItemToUiContactMapper, (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult) obj, (com.paypal.oslo.feature.p2p.domain.model.Amount) obj2, (com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem) obj3, (java.lang.String) obj4);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function4 function4 = (kotlin.jvm.functions.Function4) rememberedValue2;
            boolean changed5 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17214$r8$lambda$kkPHxJV4RNGSCEgV_Dc7nxfvYM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed6 = composer.changed(appNavigator);
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(reviewDestination));
            boolean changed7 = composer.changed(collectAsStateWithLifecycle);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed6 | z2 | changed7) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17188$r8$lambda$EqPLXEkTfxcmJLxpENlgR_kZyY(com.paypal.oslo.core.navigation.AppNavigator.this, reviewDestination, collectAsStateWithLifecycle, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
            boolean changed8 = composer.changed(appNavigator);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed8 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17216$r8$lambda$ophV7metK0dWoRQr6DnCPKPri8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            boolean changedInstance = composer.changedInstance(uriHandler);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17219$r8$lambda$xu6BC4SqFo65d6LMjK9_YNxlf8(androidx.compose.ui.platform.UriHandler.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
            boolean changed9 = composer.changed(appNavigator);
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if (changed9 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$FHY80wZO9xjOefeBq1UFFCAjdD8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
            boolean changed10 = composer.changed(appNavigator);
            java.lang.Object rememberedValue8 = composer.rememberedValue();
            if (changed10 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17192$r8$lambda$MYMUoXVmurDE2Mhk7Hz0OYAQVQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue8;
            boolean changed11 = composer.changed(stringResource);
            boolean changed12 = composer.changed(appNavigator);
            java.lang.Object rememberedValue9 = composer.rememberedValue();
            if ((changed11 | changed12) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$9$1(stringResource, appNavigator);
                composer.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue9;
            boolean changed13 = composer.changed(appNavigator);
            java.lang.Object rememberedValue10 = composer.rememberedValue();
            if (changed13 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$10$1(appNavigator);
                composer.updateRememberedValue(rememberedValue10);
            }
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue10;
            boolean changed14 = composer.changed(appNavigator);
            java.lang.Object rememberedValue11 = composer.rememberedValue();
            if (changed14 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$_rfGdGtvDpqqweOG2km6oJb7K_c(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue11;
            boolean changed15 = composer.changed(appNavigator);
            java.lang.Object rememberedValue12 = composer.rememberedValue();
            if (changed15 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$4BT9wjYd_CHVb3XipNIWH5tfZic(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue12;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(reviewDestination));
            boolean changed16 = composer.changed(appNavigator);
            java.lang.Object rememberedValue13 = composer.rememberedValue();
            if ((changed16 | z3) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = (kotlin.jvm.functions.Function4) new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$13$1(reviewDestination, appNavigator);
                composer.updateRememberedValue(rememberedValue13);
            }
            kotlin.jvm.functions.Function4 function42 = (kotlin.jvm.functions.Function4) rememberedValue13;
            boolean changed17 = composer.changed(appNavigator);
            java.lang.Object rememberedValue14 = composer.rememberedValue();
            if (changed17 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17215$r8$lambda$obCIuLT4VmLAqi6YVjDvt87hY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue14;
            boolean changed18 = composer.changed(appNavigator);
            java.lang.Object rememberedValue15 = composer.rememberedValue();
            if (changed18 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$CMn0U5sAyI70E_EnvnmYy0Uc_OQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue15);
            }
            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue15;
            boolean changed19 = composer.changed(appNavigator);
            java.lang.Object rememberedValue16 = composer.rememberedValue();
            if (changed19 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17190$r8$lambda$IrLXQRcLhoMD3906Ntzo7wPjEc(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue16);
            }
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.ReviewScreen(amountScreenComponents, transferScreenComponents, amountValue, null, receiveCurrencyCode, isPAR, function0, null, function4, function1, function2, function02, function12, function03, function04, function22, function23, function05, function06, function42, function13, function07, (kotlin.jvm.functions.Function0) rememberedValue16, null, null, composer, 0, 0, 0, 25165960);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U5zt0Cz1UTvd9yZgH8HeFIeyXrY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination sendTransferDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendTransferDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(sendTransferDestination) : composer.changedInstance(sendTransferDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2134346073, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:187)");
            }
            com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.SendTabContent(sendTransferDestination, appNavigator, null, null, null, null, composer, com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.$stable | (i & 14), 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QGPoG8amCOSsuOlxdpgxQ540uAU(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper paymentTransferResultToSuccessDestinationMapper, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper p2PContactItemToUiContactMapper, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferResult, "");
        final com.paypal.oslo.feature.p2p.navigation.SuccessDestination map = paymentTransferResultToSuccessDestinationMapper.map(paymentTransferResult, p2PContactItem != null ? p2PContactItemToUiContactMapper.map(p2PContactItem) : null, str);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda89
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$S6mGsU585iPz8STZXV1K5lpdm70(com.paypal.oslo.feature.p2p.navigation.SuccessDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R5tVSrL079JHbu9hDJgfhpHwZZs(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (reviewDestination.isPAR()) {
            navigationScope.goBack();
            navigationScope.goBack();
        } else {
            navigationScope.goBackWithResult(com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult.INSTANCE.cancelled());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$focpA5kJi07ap4avTOqI5SfkQbE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination sendOtherDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendOtherDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(sendOtherDestination) : composer.changedInstance(sendOtherDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-99623935, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:199)");
            }
            com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.SendTabContent(sendOtherDestination, appNavigator, null, null, null, null, composer, com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination.$stable | (i & 14), 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S6mGsU585iPz8STZXV1K5lpdm70(com.paypal.oslo.feature.p2p.navigation.SuccessDestination successDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(successDestination);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fSp2r9SzR_d5PhuSQ_iJC0UKj5Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$R5tVSrL079JHbu9hDJgfhpHwZZs(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c_nTOcuappcyxdSW7LATHXPT1Ds(com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination reviewDestination, java.lang.String str, java.lang.String str2, androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.di.EditAmountNavHelperKt.buildEditAmountNavDestination(reviewDestination.getReceiveCurrencyCode(), (com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState) state.getValue(), str, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dFTR_CsuzccgX3KEmI8LEoRLiCA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kkPHx-JV4RNGSCEgV_Dc7nxfvYM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17214$r8$lambda$kkPHxJV4RNGSCEgV_Dc7nxfvYM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$Bvu_y4NdxIfQAv0RQg5OHYjTbVE(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ophV7metK0dWoRQr6DnCPK-Pri8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17216$r8$lambda$ophV7metK0dWoRQr6DnCPKPri8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$dFTR_CsuzccgX3KEmI8LEoRLiCA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_rfGdGtvDpqqweOG2km6oJb7K_c(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$MYVItrv4orke8ANsfOJhqk9jh40((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xu6BC4SqFo65d6LMjK9_YN-xlf8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17219$r8$lambda$xu6BC4SqFo65d6LMjK9_YNxlf8(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        uriHandler.openUri(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xKxgGlGB2BN_gRVSp_ia13pO6j0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f_OWDq3lgKRyVlIMPYxD1uAcdHM(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination(scamAlertType));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QTlIb0H3Uflz10r1cX8yIFlzsiw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_DISMISSED_FEE_INFO_SHEET, null, null, 6, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda112
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17210$r8$lambda$cOCG7G5ssPpySeiMh2jSEeDfu0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$obCIuLT4Vm-LAqi6YV-jDvt87hY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17215$r8$lambda$obCIuLT4VmLAqi6YVjDvt87hY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$f_OWDq3lgKRyVlIMPYxD1uAcdHM(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lhNVX9TwU3oXtpD9NIGM5b2YvG0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.navigation.HighRiskScamDeclineDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ox8KsVEy0OaEnxp-1Usi0NiuBBs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17217$r8$lambda$ox8KsVEy0OaEnxp1Usi0NiuBBs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OnRD2Z6-g88su4P8FiK7QsS3U7s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17196$r8$lambda$OnRD2Z6g88su4P8FiK7QsS3U7s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$PqqzLZ1hy49RaKkxexOUzcaWLiQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PqqzLZ1hy49RaKkxexOUzcaWLiQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cOCG7G5ssPp-ySeiMh2jSEeDfu0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17210$r8$lambda$cOCG7G5ssPpySeiMh2jSEeDfu0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bs5hYl1DJ7QK-WFsz8eU_PlRjLE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17209$r8$lambda$bs5hYl1DJ7QKWFsz8eU_PlRjLE(final com.paypal.oslo.core.userstore.UserStore userStore, final android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.FeeInfoDestination feeInfoDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeInfoDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(774645483, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:365)");
            }
            boolean changedInstance = composer.changedInstance(userStore);
            boolean changedInstance2 = composer.changedInstance(context);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$iSa6w9HeZ3V__Q2M_FDJfv71QNM(com.paypal.oslo.core.userstore.UserStore.this, context, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.review.composables.FeeInfoBottomSheetKt.FeeInfoBottomSheetContent((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gxkAd2FppxjwPtS66KlGXZWtMfo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_DISMISSED_FEE_INFO_SHEET, null, null, 6, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$HyEXR__tLZEcos81r80VTuRdde8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PTNb8G8Q_7ai6EqCdE5KOmqFTcM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r6 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$iSa6w9HeZ3V__Q2M_FDJfv71QNM(com.paypal.oslo.core.userstore.UserStore userStore, final android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        java.lang.String str;
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountCountryCode;
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_FEE_INFO_LEARN_MORE, null, null, 6, null);
        com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (accountCountryCode = user.getAccountCountryCode()) != null) {
            str = accountCountryCode.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        str = "us";
        final java.lang.String string = context.getString(com.paypal.oslo.feature.p2p.R.string.feature_p2p_fee_info_web_view_url, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda88
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17183$r8$lambda$9GAAc96wLqxX5jtuMfhArVBEyg(string, context, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZUBbCMKf5kC8yMzsr1EUo0isq8U(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        noteViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled.INSTANCE);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$PTNb8G8Q_7ai6EqCdE5KOmqFTcM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QZkNq4vK4Jhqys178_iM-1SCGnU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17198$r8$lambda$QZkNq4vK4Jhqys178_iM1SCGnU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda123
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$ZmxwJWfQknw8zTlZH06ldLxretE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        editAmountViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent(str, null, null, null, 14, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kDZjI5Y_W27ihv6_wVLvsS0YPco(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.AddNoteDestination addNoteDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNoteDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-434591800, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:412)");
            }
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            boolean changedInstance = composer.changedInstance(noteViewModel);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$ZUBbCMKf5kC8yMzsr1EUo0isq8U(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda79
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$zSP2Id8pwOSRrOUV1E0bhD1HViY(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteScreenKt.AddNoteScreen(null, noteViewModel, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZmxwJWfQknw8zTlZH06ldLxretE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TOGSTXzyG80o0G4a5q7JPJCRceQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zSP2Id8pwOSRrOUV1E0bhD1HViY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$zzOnUwSoa61dCm1_zQ8LtEoAeUU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zzOnUwSoa61dCm1_zQ8LtEoAeUU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QQYgEi6Q0iRwQzbGRcquPbojvQc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, final com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, final com.paypal.oslo.feature.contacts.api.navigation.SearchContactsDestination searchContactsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchContactsDestination, "");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(searchContactsDestination) : composer.changedInstance(searchContactsDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1337446334, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:512)");
            }
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = composer.changedInstance(contactSectionViewModel);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$12$1$1(contactSectionViewModel, appNavigator, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(contactSectionViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer, 0, 7);
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(appNavigator, composer, 0);
            androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(contactSectionViewModel, composer, 0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = (com.paypal.oslo.core.navigation.AppNavigator) rememberUpdatedState.getValue();
                final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel2 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel) rememberUpdatedState2.getValue();
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$1o1cp79fO4_uEhJeFYNVizNltuc(com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.this, appNavigator2, contactSectionViewModel2, searchContactsDestination, (com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            if (((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle.getValue()).isContactSyncEnabled()) {
                createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE);
            }
            if (((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle.getValue()).isPpLinkEnabled()) {
                createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE);
            }
            if (((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle.getValue()).isQrcFlowEnabled()) {
                createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE);
            }
            createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.UNILATERAL.INSTANCE);
            com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.ContactSearchScreen$default(function1, contactsSearchStrategy, new com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig(kotlin.collections.CollectionsKt.build(createListBuilder), new com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig(false, false, ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle.getValue()).isPublicProfileEnabled(), 3, null)), new com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig(searchContactsDestination.getContactSearchNetworkType()), null, contactsApi, composer, 6, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WXmresRCvPPsX7AYV6wwMobnMnw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jR8ps0ilm0WNKT96kXMykTg9gBo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination networkErrorDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkErrorDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1909134365, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:474)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17178$r8$lambda$3EGyf09lbc0_BzmMqpvg0jNXbQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorScreenKt.NetworkErrorScreen((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ikYTEc6DPkzRr9wMT19FNy24ako(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x5E_eUL3zRC_He98MvOAImhu-Bk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17218$r8$lambda$x5E_eUL3zRC_He98MvOAImhuBk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$ikYTEc6DPkzRr9wMT19FNy24ako((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q5LVKfMwRhbiMHvXPwy65qmipFk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_ACTIVITY_BUTTON, null, null, 6, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda87
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17184$r8$lambda$9klTsyCjAin87zbGnCxYYE7YOQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bNdb7UIxX2IC-mg9X9WY-Zf-OpI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17208$r8$lambda$bNdb7UIxX2ICmg9X9WYZfOpI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.p2p.navigation.SuccessDestination successDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(successDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-979098536, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:584)");
            }
            com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success success = new com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success(new com.paypal.oslo.feature.p2p.ui.success.state.SuccessState(successDestination.getFlowType(), successDestination.getAmount(), successDestination.getCurrencyCode(), successDestination.getMediaState(), successDestination.getReceiver(), successDestination.getPayer(), successDestination.getNote(), successDestination.getPaymentLink(), false, false, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null));
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda90
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$Q5LVKfMwRhbiMHvXPwy65qmipFk(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.success.views.SuccessScreenKt.SuccessScreen(success, appNavigator, successScreenComponents, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VbWbgahYb6k_ibwsNFj1-rONQ3w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17203$r8$lambda$VbWbgahYb6k_ibwsNFj1rONQ3w(final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(currencyPickerDestination) : composer.changedInstance(currencyPickerDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1877762661, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:620)");
            }
            androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionLayout(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1169582755, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.m17207$r8$lambda$_sXRKf2L7BA5xReAXC3xsLfcxM(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, currencyPickerComponents, appNavigator, (androidx.compose.animation.SharedTransitionScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YCgn56-W7vTmoOVyICEpXg44kg0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17205$r8$lambda$YCgn56W7vTmoOVyICEpXg44kg0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_sXRK-f2L7BA5xReAXC3xsLfcxM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17207$r8$lambda$_sXRKf2L7BA5xReAXC3xsLfcxM(final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedTransitionScope, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(sharedTransitionScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1169582755, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:621)");
            }
            androidx.compose.animation.AnimatedContentKt.AnimatedContent(kotlin.Unit.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(537772416, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda70
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$FURwuokwbhliEvAPE2uCxhLvY0c(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, currencyPickerComponents, sharedTransitionScope, appNavigator, (androidx.compose.animation.AnimatedContentScope) obj, (kotlin.Unit) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, composer, 54), composer, 1572870, 62);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WYjY_aUw36WIvC5vcSMJzOTj9lg(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (currencyPickerDestination.getPopCurrentOnCurrencySelect()) {
            navigationScope.goBack();
        }
        navigationScope.replaceTop(new com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination(currencyPickerDestination.getTransferAttemptId(), currencyPickerDestination.getCurrentAmount(), currencyPickerDestination.getSendCurrencyCode(), str, str2, currencyPickerDestination.getSupportedIntents(), currencyPickerDestination.isEditMode(), currencyPickerDestination.getEditModeIntent(), (java.lang.String) null, currencyPickerDestination.getPopCurrentOnCurrencySelect(), 256, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a8A3v2A3zOBPKHyR3NiweYqOSWQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yUoDQfGamyATM_omDyBTPbJUijo(final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, currencyPickerDestination.getSendCurrencyCode())) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$WYjY_aUw36WIvC5vcSMJzOTj9lg(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, str2, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (currencyPickerDestination.isEditMode()) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.m17193$r8$lambda$NKgM3YRw5idFFd7MuCAarqm9sA(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$a8A3v2A3zOBPKHyR3NiweYqOSWQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yk6oOnrgnWzAhv18A7IF_nwkUSI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rJ4SC2cCPxCUgesmWpNwgAkssNk(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String sendCurrencyCode = currencyPickerDestination.getSendCurrencyCode();
        java.lang.String currencyCode = currencyItem.getCurrencyCode();
        java.lang.String countryCode = currencyItem.getCountryCode();
        navigationScope.push(new com.paypal.oslo.feature.xoom.api.navigation.SendMoneyAmountDestination(sendCurrencyCode, currencyCode, countryCode == null ? "" : countryCode, currencyPickerDestination.getCurrentAmount(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.UiConstants.XOOM_REF_TAG));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eXm24AKIt_nZnoTRkAZOJXKMLqs(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String str4, final java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        final java.lang.String generate = com.paypal.oslo.feature.p2p.ui.utils.TransferFlowSessionIdGenerator.INSTANCE.generate();
        editAmountViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored(str));
        editAmountViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated(crossBorderDestination.getReceiveCurrencyId()));
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$qfeuUypNdhcOhv5eFe6ux1lwJ9o(str2, generate, str3, str5, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sCjDN_nJE9cHQynqezatSX6JIQg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderDestination, "");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(crossBorderDestination) : composer.changedInstance(crossBorderDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1876748141, i2, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:699)");
            }
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
            final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            java.lang.String transferAttemptId = crossBorderDestination.getTransferAttemptId();
            java.lang.String initialAmount = crossBorderDestination.getInitialAmount();
            java.lang.String sendCurrencyCode = crossBorderDestination.getSendCurrencyCode();
            java.lang.String receiveCurrencyCode = crossBorderDestination.getReceiveCurrencyCode();
            java.lang.String receiveCurrencyId = crossBorderDestination.getReceiveCurrencyId();
            java.util.List<java.lang.String> supportedIntents = crossBorderDestination.getSupportedIntents();
            boolean isEditMode = crossBorderDestination.isEditMode();
            java.lang.String editModeIntent = crossBorderDestination.getEditModeIntent();
            java.lang.String initialReceiveAmount = crossBorderDestination.getInitialReceiveAmount();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$IjF7b8ykQu7GNeloEkF4MP3GTcY(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance = composer.changedInstance(editAmountViewModel);
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(crossBorderDestination));
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((z | changedInstance | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function5
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$eXm24AKIt_nZnoTRkAZOJXKMLqs(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.this, crossBorderDestination, appNavigator, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj4, (java.lang.String) obj5);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function5 function5 = (kotlin.jvm.functions.Function5) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(crossBorderDestination));
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17204$r8$lambda$W3rPkvFlS94d9TPKaacOWmc0kY(com.paypal.oslo.core.navigation.AppNavigator.this, crossBorderDestination, (com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            boolean changedInstance2 = composer.changedInstance(editAmountViewModel);
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(crossBorderDestination));
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed4 | changedInstance2 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$Kl9h1nPj4V1ZRMuNiefrz5vZe2g(com.paypal.oslo.core.navigation.AppNavigator.this, editAmountViewModel, crossBorderDestination, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj4);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.CrossBorderScreen(transferAttemptId, initialAmount, sendCurrencyCode, receiveCurrencyCode, receiveCurrencyId, supportedIntents, function0, function5, function1, isEditMode, editModeIntent, initialReceiveAmount, (kotlin.jvm.functions.Function4) rememberedValue4, null, null, composer, 0, 0, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W3rP-kvFlS94d9TPKaacOWmc0kY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17204$r8$lambda$W3rPkvFlS94d9TPKaacOWmc0kY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination crossBorderDestination, final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda100
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17181$r8$lambda$6WUEXvajcXpl4tI8RgM_npGqc(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, crossBorderDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qfeuUypNdhcOhv5eFe6ux1lwJ9o(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination(str, str2, str3, str4, false, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UDASbVp6BCgTGVE5abSoGVDGEAg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17220$r8$lambda$yX3L7H1qI07b568cV_NDtCCSvY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        contactSectionViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iU7BUeWdLZFoe3B5WnhKQXS9cZo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r11 == null) goto L22;
     */
    /* renamed from: $r8$lambda$S-_EsVqul1eqcS54yMY0YElSe5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit m17200$r8$lambda$S_EsVqul1eqcS54yMY0YElSe5U(com.paypal.oslo.core.userstore.UserStore userStore, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.PaymentLinkTermsWebViewDestination paymentLinkTermsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountCountryCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkTermsWebViewDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(13537701, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:802)");
            }
            com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (accountCountryCode = user.getAccountCountryCode()) != null) {
                str = accountCountryCode.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
            str = "us";
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_payment_link_terms_web_view_url, new java.lang.Object[]{str}, composer, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda84
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.m17213$r8$lambda$j8UyMObxw1LCkZmPSo7Odb_pY(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.P2pWebViewScreen(stringResource, "PayPal Link Terms", (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewDefaults.PAYMENT_LINK_TERMS_WEBVIEW_SOURCE, composer, 24624, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QW_JlQ2mJZQjnVVlOEII0sE4U38(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u7niFW6rcReJNvLaUq4dUsQWdFk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17177$r8$lambda$3AM7AbkNS45MhQsJowuIzvyoos((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yX3L7H1qI07b568cV_N-DtCCSvY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17220$r8$lambda$yX3L7H1qI07b568cV_NDtCCSvY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j8UyMObxw1LC-kZmPSo7Odb_-pY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17213$r8$lambda$j8UyMObxw1LCkZmPSo7Odb_pY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$QW_JlQ2mJZQjnVVlOEII0sE4U38((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r11 == null) goto L22;
     */
    /* renamed from: $r8$lambda$iV-mHsZP37ab7SMKLV1PrqkjFYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit m17212$r8$lambda$iVmHsZP37ab7SMKLV1PrqkjFYM(com.paypal.oslo.core.userstore.UserStore userStore, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkWebViewDestination paymentLinkWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountCountryCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkWebViewDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2007648185, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:820)");
            }
            com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (accountCountryCode = user.getAccountCountryCode()) != null) {
                str = accountCountryCode.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
            str = "us";
            java.lang.String languageTag = com.paypal.oslo.feature.p2p.ui.common.util.LocaleUtilsKt.getLocale(composer, 0).toLanguageTag();
            int i2 = com.paypal.oslo.feature.p2p.R.string.feature_p2p_payment_link_web_view_url;
            kotlin.jvm.internal.Intrinsics.checkNotNull(languageTag);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i2, new java.lang.Object[]{str, languageTag}, composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_payment_link_info_sheet_web_view_title, composer, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda92
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$glVihQhflFNPKw5IgcS_gFOgOKQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.P2pWebViewScreen(stringResource, stringResource2, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewDefaults.PAYMENT_LINK_WEBVIEW_SOURCE, composer, 24576, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$glVihQhflFNPKw5IgcS_gFOgOKQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17211$r8$lambda$hfgwj54z2WUgqO_HRg4Sp67uLA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hfgwj54z2WUgqO_HRg4Sp-67uLA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17211$r8$lambda$hfgwj54z2WUgqO_HRg4Sp67uLA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R7Q7IGTuSAnt-Ilsc6ZjLoV2VPw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17199$r8$lambda$R7Q7IGTuSAntIlsc6ZjLoV2VPw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda85
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17186$r8$lambda$DLPTnFG7L6gee3idDbYGHVQ9BI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P4M4PFrwWteo9uyU3APlG5NsREI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17206$r8$lambda$ZxagZ9nGMA5Yc6Wve_YqTMYbAA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SuprLYfpMzgrBw5TmEd2L-RAhcM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17201$r8$lambda$SuprLYfpMzgrBw5TmEd2LRAhcM(com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel claimPreviewViewModel) {
        claimPreviewViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.CloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Op4W9C61KIi33Arn2Ue2-dUPXM8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17197$r8$lambda$Op4W9C61KIi33Arn2Ue2dUPXM8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda91
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.m17202$r8$lambda$SykluJOHgWKUk376ap52mf8IX8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XqFXfuVgnun6rp7Jzi9FaVHSGkA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination claimSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimSuccessDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-389122699, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:932)");
            }
            com.paypal.pds.core.Icon.Information information = com.paypal.pds.core.Icon.Information.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$EhgyApbfMJXCXZAz9jBX5ZlUumo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$P4M4PFrwWteo9uyU3APlG5NsREI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenKt.ErrorScreen(new com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenConfig(information, "This payment has already been accepted", null, null, "Done", null, false, false, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, 108, null), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZxagZ9nGMA5Yc6Wve_-YqTMYbAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17206$r8$lambda$ZxagZ9nGMA5Yc6Wve_YqTMYbAA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Syklu-JOHgWKUk376ap52mf8IX8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17202$r8$lambda$SykluJOHgWKUk376ap52mf8IX8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UyPFOyuzCfacBfgoWTmcCEtdsXs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$gw0Adu1LJ2BM7e9ujCCQHTnvNts((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TjTVZhPYGFyFmqhmAraysjroYnQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination payRequestWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(payRequestWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-716970328, i, -1, "com.paypal.oslo.feature.p2p.di.NavigationModule.provideP2PEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:982)");
            }
            java.lang.String url = payRequestWebViewDestination.getUrl();
            java.lang.String title = payRequestWebViewDestination.getTitle();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$jzUUTNHeCr8Xl7r_mRC9S9e1oD0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.P2pWebViewScreen(url, title, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewDefaults.PAY_REQUEST_WEBVIEW_SOURCE, composer, 24576, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gw0Adu1LJ2BM7e9ujCCQHTnvNts(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gJLJCAWbJtskPRzL_2sn2xQm0Vg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel $r8$lambda$SO4GQRRazCVf6uKWUrg5TqPQOhY(com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination payRequestDestination, com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(payRequestDestination.getRequestId(), null, true);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jzUUTNHeCr8Xl7r_mRC9S9e1oD0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$$ExternalSyntheticLambda93
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule.$r8$lambda$LX7gts5Ue56g7QFaYCGxx6ePMbo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel $r8$lambda$uFF7g8RxtaD2vl8p_prGPxgE_mA(com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination payRequestLandingDestination, com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(payRequestLandingDestination.getRequestId(), payRequestLandingDestination.getRequestIdType(), false);
    }
}

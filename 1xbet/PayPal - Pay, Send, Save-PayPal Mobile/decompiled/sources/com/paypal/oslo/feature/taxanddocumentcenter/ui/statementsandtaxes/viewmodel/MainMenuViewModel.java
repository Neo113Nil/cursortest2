package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/viewmodel/MainMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetMenuItemsUseCase;", "getMenuItemsUseCase", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuGroupMapper;", "menuGroupMapper", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetMenuItemsUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuGroupMapper;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/intent/MainMenuIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/intent/MainMenuIntent;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MainMenuState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainMenuViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState> state;

    @javax.inject.Inject
    public MainMenuViewModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase getMenuItemsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuGroupMapper menuGroupMapper, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMenuItemsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuGroupMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain> invoke = getMenuItemsUseCase.invoke();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(invoke, 10));
        java.util.Iterator<T> it = invoke.iterator();
        while (it.hasNext()) {
            arrayList.add(menuGroupMapper.map((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain) it.next()));
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState(arrayList));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.state = MutableStateFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState> getState() {
        return this.state;
    }

    public final void processIntent(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.intent.MainMenuIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!(intent instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.intent.MainMenuIntent.MenuItemClicked)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType cardType = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.intent.MainMenuIntent.MenuItemClicked) intent).getCardType();
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.$r8$lambda$nLL3u5TVpKmPTAZXojXyXsFdPqs(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nLL3u5TVpKmPTAZXojXyXsFdPqs(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        int i = com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.WhenMappings.$EnumSwitchMapping$0[menuCardType.ordinal()];
        if (i == 1) {
            navigationScope.push(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination(com.paypal.oslo.feature.taxanddocumentcenter.ui.AnalyticsSource.MAIN_MENU));
        } else if (i == 2) {
            navigationScope.push(new com.paypal.oslo.feature.taxfiling.api.navigation.TaxFilingDestination(com.paypal.oslo.feature.taxanddocumentcenter.ui.AnalyticsSource.TDC));
        } else if (i == 3) {
            navigationScope.push(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination(com.paypal.oslo.feature.taxanddocumentcenter.ui.AnalyticsSource.MAIN_MENU));
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            navigationScope.push(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination(com.paypal.oslo.feature.taxanddocumentcenter.ui.AnalyticsSource.MAIN_MENU));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.TAX_DOCUMENTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.FILE_TAXES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.ALL_TRANSACTIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.CUSTOM_STATEMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

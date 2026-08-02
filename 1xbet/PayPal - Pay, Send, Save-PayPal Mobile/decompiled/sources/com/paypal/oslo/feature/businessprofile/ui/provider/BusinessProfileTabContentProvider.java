package com.paypal.oslo.feature.businessprofile.ui.provider;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R4\u0010\u0019\u001a\u001c\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\u00160\u0013j\u0002`\u0017¢\u0006\u0002\b\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/ui/provider/BusinessProfileTabContentProvider;", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;", "businessProfileFeatureGatesManager", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "businessInventoryFeatureGateManager", "<init>", "(Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;)V", "Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;", "getBusinessProfileFeatureGatesManager", "()Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "getBusinessInventoryFeatureGateManager", "()Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "Lcom/paypal/oslo/feature/businessprofile/api/navigation/BusinessProfileSalesToolsDestination;", "tabDestination", "Lcom/paypal/oslo/feature/businessprofile/api/navigation/BusinessProfileSalesToolsDestination;", "getTabDestination", "()Lcom/paypal/oslo/feature/businessprofile/api/navigation/BusinessProfileSalesToolsDestination;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlin/ParameterName;", "", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContent;", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessProfileTabContentProvider implements com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager;
    private final com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager;
    private final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination tabDestination;

    @javax.inject.Inject
    public BusinessProfileTabContentProvider(com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessProfileFeatureGatesManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryFeatureGateManager, "");
        this.businessProfileFeatureGatesManager = businessProfileFeatureGatesManager;
        this.businessInventoryFeatureGateManager = businessInventoryFeatureGateManager;
        this.tabDestination = com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination.INSTANCE;
        this.content = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(993978164, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$I7F_rIYyyz_FNH7uOR2KIPTWl0s(com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.this, (com.paypal.oslo.core.navigation.AppNavigator) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
    }

    public final com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager getBusinessProfileFeatureGatesManager() {
        return this.businessProfileFeatureGatesManager;
    }

    public final com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager getBusinessInventoryFeatureGateManager() {
        return this.businessInventoryFeatureGateManager;
    }

    @Override // com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    public final com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination getTabDestination() {
        return this.tabDestination;
    }

    @Override // com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9HkiLwzh1S00X32MoWSNHPDQ9BQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$HdfeofAFSdgARUJUnFkRS1giFkU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ex-T8rX8vVYkWilT_s1HyLdkEXo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13375$r8$lambda$ExT8rX8vVYkWilT_s1HyLdkEXo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$cFwi_4Lof0s9Iqdu9IkeXT2Z4TI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HdfeofAFSdgARUJUnFkRS1giFkU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I7F_rIYyyz_FNH7uOR2KIPTWl0s(com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider businessProfileTabContentProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(993978164, i2, -1, "com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.content.<anonymous> (BusinessProfileTabContentProvider.kt:36)");
            }
            com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider salesToolsUiFeatureGatesProvider = new com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider(businessProfileTabContentProvider.businessProfileFeatureGatesManager.isBusinessProfileAvailable(), businessProfileTabContentProvider.businessProfileFeatureGatesManager.isInquiriesAvailable(), businessProfileTabContentProvider.businessInventoryFeatureGateManager.isFeatureAvailable());
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$9HkiLwzh1S00X32MoWSNHPDQ9BQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z2 = i3 == 4;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$Y0SJYbdgcoEzq07ALqhB2PEUHr8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean z3 = i3 == 4;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$NJCMWjMaljKuBHpWoi8jr2Aryys(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean z4 = i3 == 4;
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.m13375$r8$lambda$ExT8rX8vVYkWilT_s1HyLdkEXo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean z5 = i3 == 4;
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (z5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.m13376$r8$lambda$Kt1pg_mr8dvOTvdYdDhPcf_ilI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt.SalesToolsScreen(salesToolsUiFeatureGatesProvider, null, function0, function02, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue5, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kt1pg_mr8dvOTvdYdDhPcf_i-lI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13376$r8$lambda$Kt1pg_mr8dvOTvdYdDhPcf_ilI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$yNOM6Nz_1xZUbHzFTdaTroapPp8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MYDCEBM_ojerTWUj2nKgQIQRedA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NJCMWjMaljKuBHpWoi8jr2Aryys(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.$r8$lambda$MYDCEBM_ojerTWUj2nKgQIQRedA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q5FKbGEPa3pHjFhIfIxO-lo1XsA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13377$r8$lambda$Q5FKbGEPa3pHjFhIfIxOlo1XsA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y0SJYbdgcoEzq07ALqhB2PEUHr8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider.m13377$r8$lambda$Q5FKbGEPa3pHjFhIfIxOlo1XsA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cFwi_4Lof0s9Iqdu9IkeXT2Z4TI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yNOM6Nz_1xZUbHzFTdaTroapPp8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}

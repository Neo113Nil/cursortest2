package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"DebitCardActivationRouter", "", "debitCardActivationInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationRouterViewModel;", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationRouterViewModel;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease", "navigationState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/NavigationState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationRouterKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardActivationRouter(final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        java.lang.String rememberNavResultRequestId;
        boolean changed;
        boolean changedInstance;
        int i5;
        int i6;
        int i7;
        boolean changed2;
        java.lang.Object rememberedValue;
        java.lang.String str;
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel4;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-60248351);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardActivationInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                debitCardActivationRouterViewModel2 = debitCardActivationRouterViewModel;
                if (startRestartGroup.changedInstance(debitCardActivationRouterViewModel2)) {
                    i10 = 256;
                    i3 |= i10;
                }
            } else {
                debitCardActivationRouterViewModel2 = debitCardActivationRouterViewModel;
            }
            i10 = 128;
            i3 |= i10;
        } else {
            debitCardActivationRouterViewModel2 = debitCardActivationRouterViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                i4 = 0;
                debitCardActivationRouterViewModel2 = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -897;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-60248351, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouter (DebitCardActivationRouter.kt:64)");
                }
                rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardActivationRouterViewModel2.getNavigationState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                changedInstance = startRestartGroup.changedInstance(debitCardActivationRouterViewModel2);
                int i11 = i3 & 14;
                i5 = i11 != 4 ? 1 : i4;
                i6 = i3 & 112;
                i7 = i6 != 32 ? 1 : i4;
                changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                rememberedValue = startRestartGroup.rememberedValue();
                if ((i7 | (changed ? 1 : 0) | (changedInstance ? 1 : 0) | i5 | (changed2 ? 1 : 0)) == 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    str = rememberNavResultRequestId;
                    debitCardActivationRouterViewModel4 = debitCardActivationRouterViewModel2;
                    i8 = i6;
                    i9 = 4;
                    composer2 = startRestartGroup;
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1(debitCardActivationRouterViewModel2, debitCardActivationInfo, appNavigator, str, collectAsStateWithLifecycle, null);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    str = rememberNavResultRequestId;
                    i8 = i6;
                    debitCardActivationRouterViewModel4 = debitCardActivationRouterViewModel2;
                    i9 = 4;
                    composer2 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                z = i8 != 32;
                z2 = i11 == i9;
                rememberedValue2 = composer2.rememberedValue();
                if (!(z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1(debitCardActivationInfo, appNavigator, null);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m14326invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14326invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, composer2, 3072);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                debitCardActivationRouterViewModel3 = debitCardActivationRouterViewModel4;
            }
            i4 = 0;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardActivationRouterViewModel2.getNavigationState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
            changedInstance = startRestartGroup.changedInstance(debitCardActivationRouterViewModel2);
            int i112 = i3 & 14;
            if (i112 != 4) {
            }
            i6 = i3 & 112;
            if (i6 != 32) {
            }
            changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            rememberedValue = startRestartGroup.rememberedValue();
            if ((i7 | (changed ? 1 : 0) | (changedInstance ? 1 : 0) | i5 | (changed2 ? 1 : 0)) == 0) {
            }
            str = rememberNavResultRequestId;
            debitCardActivationRouterViewModel4 = debitCardActivationRouterViewModel2;
            i8 = i6;
            i9 = 4;
            composer2 = startRestartGroup;
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1(debitCardActivationRouterViewModel2, debitCardActivationInfo, appNavigator, str, collectAsStateWithLifecycle2, null);
            composer2.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
            if (i8 != 32) {
            }
            if (i112 == i9) {
            }
            rememberedValue2 = composer2.rememberedValue();
            if (!(z | z2)) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1(debitCardActivationInfo, appNavigator, null);
            composer2.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
            rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue3, composer2, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            debitCardActivationRouterViewModel3 = debitCardActivationRouterViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            debitCardActivationRouterViewModel3 = debitCardActivationRouterViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt.$r8$lambda$aLrt3QMstCqYy8plN245mQ9S74I(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.this, appNavigator, debitCardActivationRouterViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$V2wI0HpvenJWj--65qrBVPwsbK8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14325$r8$lambda$V2wI0HpvenJWj65qrBVPwsbK8(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination(debitCardActivationInfo));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aLrt3QMstCqYy8plN245mQ9S74I(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardActivationRouter(debitCardActivationInfo, appNavigator, debitCardActivationRouterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState access$DebitCardActivationRouter$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState) state.getValue();
    }
}

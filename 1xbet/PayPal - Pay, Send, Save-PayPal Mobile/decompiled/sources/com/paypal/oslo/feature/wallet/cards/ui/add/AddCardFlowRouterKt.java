package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"AddCardFlowRouter", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "addCardFormConfig", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "flowOptions", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "routerViewModel", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowRouterViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowRouterViewModel;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardFlowRouterKt {
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0216, code lost:
    
        if (r10.changedInstance(r28) != false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddCardFlowRouter(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel4;
        java.lang.String rememberNavResultRequestId;
        java.lang.String rememberNavResultRequestId2;
        kotlin.Unit unit;
        boolean changedInstance;
        boolean z;
        boolean changed;
        boolean changed2;
        boolean z2;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1 rememberedValue;
        java.lang.String str;
        java.lang.String str2;
        kotlin.Unit unit2;
        boolean changedInstance2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        boolean z6;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$2$1 rememberedValue2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean changedInstance3;
        boolean z7;
        int i11;
        boolean z8;
        int i12;
        int i13;
        boolean z9;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1 rememberedValue3;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$$inlined$NavResultEffectrtGRyWw$1 rememberedValue4;
        boolean changedInstance4;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1 rememberedValue5;
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$$inlined$NavResultEffectrtGRyWw$2 rememberedValue6;
        int i14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAnalyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1691554792);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(addFIAnalyticsContext) : startRestartGroup.changedInstance(addFIAnalyticsContext) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(header) : startRestartGroup.changedInstance(header) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(config) : startRestartGroup.changedInstance(config) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (i & 32768) == 0 ? startRestartGroup.changed(options) : startRestartGroup.changedInstance(options) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                addCardFlowRouterViewModel2 = addCardFlowRouterViewModel;
                if (startRestartGroup.changedInstance(addCardFlowRouterViewModel2)) {
                    i14 = 131072;
                    i3 |= i14;
                }
            } else {
                addCardFlowRouterViewModel2 = addCardFlowRouterViewModel;
            }
            i14 = 65536;
            i3 |= i14;
        } else {
            addCardFlowRouterViewModel2 = addCardFlowRouterViewModel;
        }
        boolean z10 = true;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    addCardFlowRouterViewModel4 = addCardFlowRouterViewModel2;
                    i4 = i3 & (-458753);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                    rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                    unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(addCardFlowRouterViewModel4);
                    if ((i4 & 14) == 4) {
                    }
                    changed = startRestartGroup.changed(rememberNavResultRequestId);
                    changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
                    int i15 = i4 & 57344;
                    if (i15 != 16384) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z | changed | changed2 | z2)) {
                    }
                    str = rememberNavResultRequestId2;
                    str2 = rememberNavResultRequestId;
                    unit2 = unit;
                    composer2 = startRestartGroup;
                    rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1(addCardFlowRouterViewModel4, appNavigator, rememberNavResultRequestId, str, options, null);
                    composer2.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    changedInstance2 = composer2.changedInstance(addCardFlowRouterViewModel4);
                    i5 = i4 & 112;
                    if (i5 != 32) {
                    }
                    if (i15 != 16384) {
                    }
                    int i16 = i4 & 896;
                    if (i16 != 256) {
                    }
                    i6 = i4 & 7168;
                    if (i6 != 2048) {
                    }
                    z6 = true;
                    rememberedValue2 = composer2.rememberedValue();
                    if (!(changedInstance2 | z3 | z4 | z5 | z6)) {
                    }
                    i7 = i16;
                    i8 = i6;
                    i9 = i15;
                    i10 = 6;
                    rememberedValue2 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$2$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, options, header, config, null);
                    composer2.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i10);
                    changedInstance3 = composer2.changedInstance(addCardFlowRouterViewModel4);
                    if (i5 != 32) {
                    }
                    z7 = true;
                    i11 = 256;
                    if (i7 != i11) {
                    }
                    z8 = true;
                    i12 = i8;
                    if (i12 != 2048) {
                    }
                    i13 = i9;
                    z9 = true;
                    if (i13 != 16384) {
                    }
                    rememberedValue3 = composer2.rememberedValue();
                    if (!(changedInstance3 | z7 | z8 | z9 | z10)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, header, config, options, null);
                    composer2.updateRememberedValue(rememberedValue3);
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                    changedInstance4 = composer2.changedInstance(addCardFlowRouterViewModel4);
                    rememberedValue5 = composer2.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue5 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(addCardFlowRouterViewModel4, null);
                    composer2.updateRememberedValue(rememberedValue5);
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue5;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    addCardFlowRouterViewModel3 = addCardFlowRouterViewModel4;
                }
            } else if ((i2 & 32) != 0) {
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
                i3 &= -458753;
                addCardFlowRouterViewModel2 = (com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i3;
                addCardFlowRouterViewModel4 = addCardFlowRouterViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1691554792, i4, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouter (AddCardFlowRouter.kt:47)");
                }
                rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(addCardFlowRouterViewModel4);
                z = (i4 & 14) == 4;
                changed = startRestartGroup.changed(rememberNavResultRequestId);
                changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
                int i152 = i4 & 57344;
                z2 = i152 != 16384 || ((i4 & 32768) != 0 && startRestartGroup.changedInstance(options));
                rememberedValue = startRestartGroup.rememberedValue();
                if ((!(changedInstance | z | changed | changed2) && !z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    str = rememberNavResultRequestId2;
                    str2 = rememberNavResultRequestId;
                    unit2 = unit;
                    composer2 = startRestartGroup;
                    rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1(addCardFlowRouterViewModel4, appNavigator, rememberNavResultRequestId, str, options, null);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    unit2 = unit;
                    str = rememberNavResultRequestId2;
                    str2 = rememberNavResultRequestId;
                    composer2 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                changedInstance2 = composer2.changedInstance(addCardFlowRouterViewModel4);
                i5 = i4 & 112;
                z3 = i5 != 32 || ((i4 & 64) != 0 && composer2.changedInstance(addFIAnalyticsContext));
                z4 = i152 != 16384 || ((i4 & 32768) != 0 && composer2.changedInstance(options));
                int i162 = i4 & 896;
                z5 = i162 != 256 || ((i4 & 512) != 0 && composer2.changedInstance(header));
                i6 = i4 & 7168;
                if (i6 != 2048) {
                    if ((i4 & 4096) != 0) {
                    }
                    z6 = false;
                    rememberedValue2 = composer2.rememberedValue();
                    if ((!(changedInstance2 | z3 | z4 | z5) && !z6) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i7 = i162;
                        i8 = i6;
                        i9 = i152;
                        i10 = 6;
                        rememberedValue2 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$2$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, options, header, config, null);
                        composer2.updateRememberedValue(rememberedValue2);
                    } else {
                        i7 = i162;
                        i8 = i6;
                        i9 = i152;
                        i10 = 6;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i10);
                    changedInstance3 = composer2.changedInstance(addCardFlowRouterViewModel4);
                    if (i5 != 32 || ((i4 & 64) != 0 && composer2.changedInstance(addFIAnalyticsContext))) {
                        z7 = true;
                        i11 = 256;
                    } else {
                        i11 = 256;
                        z7 = false;
                    }
                    if (i7 != i11 || ((i4 & 512) != 0 && composer2.changedInstance(header))) {
                        z8 = true;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        z8 = false;
                    }
                    if (i12 != 2048 && ((i4 & 4096) == 0 || !composer2.changedInstance(config))) {
                        i13 = i9;
                        z9 = false;
                        if (i13 != 16384 && ((i4 & 32768) == 0 || !composer2.changedInstance(options))) {
                            z10 = false;
                        }
                        rememberedValue3 = composer2.rememberedValue();
                        if (!(changedInstance3 | z7 | z8 | z9 | z10) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, header, config, options, null);
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue3;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                        rememberedValue4 = composer2.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m21003invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21003invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                        changedInstance4 = composer2.changedInstance(addCardFlowRouterViewModel4);
                        rememberedValue5 = composer2.rememberedValue();
                        if (!changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(addCardFlowRouterViewModel4, null);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue5;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                        rememberedValue6 = composer2.rememberedValue();
                        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$$inlined$NavResultEffect-rtGRyWw$2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m21004invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21004invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        addCardFlowRouterViewModel3 = addCardFlowRouterViewModel4;
                    }
                    i13 = i9;
                    z9 = true;
                    if (i13 != 16384) {
                        z10 = false;
                    }
                    rememberedValue3 = composer2.rememberedValue();
                    if (!(changedInstance3 | z7 | z8 | z9 | z10)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, header, config, options, null);
                    composer2.updateRememberedValue(rememberedValue3);
                    kotlin.jvm.functions.Function2 function232 = (kotlin.jvm.functions.Function2) rememberedValue3;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager32 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager32, function232, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                    changedInstance4 = composer2.changedInstance(addCardFlowRouterViewModel4);
                    rememberedValue5 = composer2.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue5 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(addCardFlowRouterViewModel4, null);
                    composer2.updateRememberedValue(rememberedValue5);
                    kotlin.jvm.functions.Function2 function2222 = (kotlin.jvm.functions.Function2) rememberedValue5;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager222, function2222, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    addCardFlowRouterViewModel3 = addCardFlowRouterViewModel4;
                }
                z6 = true;
                rememberedValue2 = composer2.rememberedValue();
                if (!(changedInstance2 | z3 | z4 | z5 | z6)) {
                }
                i7 = i162;
                i8 = i6;
                i9 = i152;
                i10 = 6;
                rememberedValue2 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$2$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, options, header, config, null);
                composer2.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i10);
                changedInstance3 = composer2.changedInstance(addCardFlowRouterViewModel4);
                if (i5 != 32) {
                }
                z7 = true;
                i11 = 256;
                if (i7 != i11) {
                }
                z8 = true;
                i12 = i8;
                if (i12 != 2048) {
                    i13 = i9;
                    z9 = false;
                    if (i13 != 16384) {
                    }
                    rememberedValue3 = composer2.rememberedValue();
                    if (!(changedInstance3 | z7 | z8 | z9 | z10)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, header, config, options, null);
                    composer2.updateRememberedValue(rememberedValue3);
                    kotlin.jvm.functions.Function2 function2322 = (kotlin.jvm.functions.Function2) rememberedValue3;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager322 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager322, function2322, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                    changedInstance4 = composer2.changedInstance(addCardFlowRouterViewModel4);
                    rememberedValue5 = composer2.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue5 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(addCardFlowRouterViewModel4, null);
                    composer2.updateRememberedValue(rememberedValue5);
                    kotlin.jvm.functions.Function2 function22222 = (kotlin.jvm.functions.Function2) rememberedValue5;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                    rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager2222, function22222, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    addCardFlowRouterViewModel3 = addCardFlowRouterViewModel4;
                }
                i13 = i9;
                z9 = true;
                if (i13 != 16384) {
                }
                rememberedValue3 = composer2.rememberedValue();
                if (!(changedInstance3 | z7 | z8 | z9 | z10)) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, header, config, options, null);
                composer2.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function2 function23222 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                rememberedValue4 = composer2.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager3222, function23222, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                changedInstance4 = composer2.changedInstance(addCardFlowRouterViewModel4);
                rememberedValue5 = composer2.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue5 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(addCardFlowRouterViewModel4, null);
                composer2.updateRememberedValue(rememberedValue5);
                kotlin.jvm.functions.Function2 function222222 = (kotlin.jvm.functions.Function2) rememberedValue5;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
                rememberedValue6 = composer2.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager22222, function222222, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                addCardFlowRouterViewModel3 = addCardFlowRouterViewModel4;
            }
            i4 = i3;
            addCardFlowRouterViewModel4 = addCardFlowRouterViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            unit = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(addCardFlowRouterViewModel4);
            if ((i4 & 14) == 4) {
            }
            changed = startRestartGroup.changed(rememberNavResultRequestId);
            changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
            int i1522 = i4 & 57344;
            if (i1522 != 16384) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z | changed | changed2 | z2)) {
            }
            str = rememberNavResultRequestId2;
            str2 = rememberNavResultRequestId;
            unit2 = unit;
            composer2 = startRestartGroup;
            rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1(addCardFlowRouterViewModel4, appNavigator, rememberNavResultRequestId, str, options, null);
            composer2.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
            kotlin.Unit unit322 = kotlin.Unit.INSTANCE;
            changedInstance2 = composer2.changedInstance(addCardFlowRouterViewModel4);
            i5 = i4 & 112;
            if (i5 != 32) {
            }
            if (i1522 != 16384) {
            }
            int i1622 = i4 & 896;
            if (i1622 != 256) {
            }
            i6 = i4 & 7168;
            if (i6 != 2048) {
            }
            z6 = true;
            rememberedValue2 = composer2.rememberedValue();
            if (!(changedInstance2 | z3 | z4 | z5 | z6)) {
            }
            i7 = i1622;
            i8 = i6;
            i9 = i1522;
            i10 = 6;
            rememberedValue2 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$2$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, options, header, config, null);
            composer2.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit322, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i10);
            changedInstance3 = composer2.changedInstance(addCardFlowRouterViewModel4);
            if (i5 != 32) {
            }
            z7 = true;
            i11 = 256;
            if (i7 != i11) {
            }
            z8 = true;
            i12 = i8;
            if (i12 != 2048) {
            }
            i13 = i9;
            z9 = true;
            if (i13 != 16384) {
            }
            rememberedValue3 = composer2.rememberedValue();
            if (!(changedInstance3 | z7 | z8 | z9 | z10)) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(addCardFlowRouterViewModel4, addFIAnalyticsContext, header, config, options, null);
            composer2.updateRememberedValue(rememberedValue3);
            kotlin.jvm.functions.Function2 function232222 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager32222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
            rememberedValue4 = composer2.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str2, resolveNavResultManager32222, function232222, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
            changedInstance4 = composer2.changedInstance(addCardFlowRouterViewModel4);
            rememberedValue5 = composer2.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue5 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(addCardFlowRouterViewModel4, null);
            composer2.updateRememberedValue(rememberedValue5);
            kotlin.jvm.functions.Function2 function2222222 = (kotlin.jvm.functions.Function2) rememberedValue5;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager222222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, 0);
            rememberedValue6 = composer2.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager222222, function2222222, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            addCardFlowRouterViewModel3 = addCardFlowRouterViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            addCardFlowRouterViewModel3 = addCardFlowRouterViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt.$r8$lambda$cY5gIR875EJsRYB6nn5PhXJGdA0(com.paypal.oslo.core.navigation.AppNavigator.this, addFIAnalyticsContext, header, config, options, addCardFlowRouterViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cY5gIR875EJsRYB6nn5PhXJGdA0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddCardFlowRouter(appNavigator, addFIAnalyticsContext, header, config, options, addCardFlowRouterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

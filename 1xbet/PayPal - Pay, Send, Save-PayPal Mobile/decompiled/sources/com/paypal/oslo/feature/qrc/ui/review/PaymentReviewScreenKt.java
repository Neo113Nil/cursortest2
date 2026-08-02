package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0018\u001aD\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001d\u001a<\u0010\u001e\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"PaymentReviewScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "commonComponents", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewViewModel;Landroidx/compose/runtime/Composer;II)V", "PaymentReviewUiEffect", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewViewModel;Landroidx/compose/runtime/Composer;I)V", "PaymentReviewContent", "uiState", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lkotlin/ParameterName;", "name", "event", "(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContentState", "Landroidx/compose/foundation/layout/ColumnScope;", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Landroidx/compose/runtime/Composer;I)V", "ErrorState", "canRetryPayment", "", "(Landroidx/compose/foundation/layout/ColumnScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentReviewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentReviewScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel4;
        boolean changedInstance;
        boolean changedInstance2;
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewScreen$1$1 rememberedValue;
        boolean changedInstance3;
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewScreen$2$1 rememberedValue2;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(169075271);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(qrcSessionNavArgs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(commonComponents) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    paymentReviewViewModel2 = paymentReviewViewModel;
                    if (startRestartGroup.changedInstance(paymentReviewViewModel2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    paymentReviewViewModel2 = paymentReviewViewModel;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                paymentReviewViewModel2 = paymentReviewViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
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
                        i4 = i3 & (-57345);
                        modifier4 = companion;
                        paymentReviewViewModel4 = (com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(169075271, i4, -1, "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreen (PaymentReviewScreen.kt:86)");
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(paymentReviewViewModel4);
                        changedInstance2 = startRestartGroup.changedInstance(qrcSessionNavArgs);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewScreen$1$1(paymentReviewViewModel4, qrcSessionNavArgs, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        PaymentReviewUiEffect(appNavigator, paymentReviewViewModel4, startRestartGroup, (i4 & 14) | ((i4 >> 9) & 112));
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState paymentReviewUiState = (com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentReviewViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                        changedInstance3 = composer2.changedInstance(paymentReviewViewModel4);
                        rememberedValue2 = composer2.rememberedValue();
                        if (!changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewScreen$2$1(paymentReviewViewModel4);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        PaymentReviewContent(paymentReviewUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), commonComponents, modifier4, composer2, i4 & 8064, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        paymentReviewViewModel3 = paymentReviewViewModel4;
                    } else {
                        i4 = i3;
                        modifier4 = companion;
                    }
                }
                paymentReviewViewModel4 = paymentReviewViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(paymentReviewViewModel4);
                changedInstance2 = startRestartGroup.changedInstance(qrcSessionNavArgs);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2)) {
                }
                rememberedValue = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewScreen$1$1(paymentReviewViewModel4, qrcSessionNavArgs, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                PaymentReviewUiEffect(appNavigator, paymentReviewViewModel4, startRestartGroup, (i4 & 14) | ((i4 >> 9) & 112));
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState paymentReviewUiState2 = (com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentReviewViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                changedInstance3 = composer2.changedInstance(paymentReviewViewModel4);
                rememberedValue2 = composer2.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewScreen$2$1(paymentReviewViewModel4);
                composer2.updateRememberedValue(rememberedValue2);
                PaymentReviewContent(paymentReviewUiState2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), commonComponents, modifier4, composer2, i4 & 8064, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                paymentReviewViewModel3 = paymentReviewViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                paymentReviewViewModel3 = paymentReviewViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$jZ5VFwdCX7azovsfcCYS3AQ6mKE(com.paypal.oslo.core.navigation.AppNavigator.this, qrcSessionNavArgs, commonComponents, modifier3, paymentReviewViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PaymentReviewUiEffect(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1423013208);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(paymentReviewViewModel) ? 32 : 16;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1423013208, i4, -1, "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect (PaymentReviewScreen.kt:111)");
            }
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(paymentReviewViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$1$1(paymentReviewViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m17816invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m17816invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            boolean changedInstance2 = startRestartGroup.changedInstance(paymentReviewViewModel);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$2$1(paymentReviewViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m17817invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m17817invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            boolean changedInstance3 = startRestartGroup.changedInstance(paymentReviewViewModel);
            boolean z = (i4 & 14) == 4;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (((changedInstance3 | z | changed) || changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$3$1(paymentReviewViewModel, appNavigator, rememberNavResultRequestId, rememberNavResultRequestId2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                i3 = i4;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(paymentReviewViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, (i3 >> 3) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$BuSPQl3NJ2zXNtmAYH_Dk7bKxQQ(com.paypal.oslo.core.navigation.AppNavigator.this, paymentReviewViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentReviewContent(final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState paymentReviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2027256576);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentReviewUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(commonComponents) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2027256576, i4, -1, "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewContent (PaymentReviewScreen.kt:182)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (paymentReviewUiState instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Initial) {
                    startRestartGroup.startReplaceGroup(2025872072);
                } else if (paymentReviewUiState instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading) {
                    startRestartGroup.startReplaceGroup(-1622416275);
                    com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewTopBarsKt.PaymentReviewTopBar(function1, startRestartGroup, (i4 >> 3) & 14);
                    com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewLoadingStateKt.LoadingState(columnScopeInstance, startRestartGroup, 6);
                } else if (!(paymentReviewUiState instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error)) {
                    if (!(paymentReviewUiState instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content)) {
                        startRestartGroup.startReplaceGroup(2025871264);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1621902946);
                    com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel uiModel = ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) paymentReviewUiState).getUiModel();
                    if (!uiModel.getHasError()) {
                        startRestartGroup.startReplaceGroup(-1621510455);
                        com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewTopBarsKt.PaymentReviewTopBar(function1, startRestartGroup, (i4 >> 3) & 14);
                        int i7 = i4 << 3;
                        Camera2StreamConfigurationMap(columnScopeInstance, uiModel, function1, commonComponents, startRestartGroup, (i7 & 7168) | 6 | (i7 & 896));
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1621822935);
                        boolean z = (i4 & 112) == 32;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.m17812$r8$lambda$ETGKNRPpcgd0ZXjIpDqHXthyzY(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                        com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewTopBarsKt.ErrorTopBar(function1, startRestartGroup, (i4 >> 3) & 14);
                        Camera2StreamConfigurationMap(columnScopeInstance, uiModel.getCanRetryPayment(), function1, startRestartGroup, 6 | ((i4 << 3) & 896));
                        startRestartGroup.endReplaceGroup();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(-1622249309);
                    boolean z2 = (i4 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$4MXkgbJitZvxWi6oAi9rfma2dt8(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 1);
                    com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewTopBarsKt.ErrorTopBar(function1, startRestartGroup, (i4 >> 3) & 14);
                    Camera2StreamConfigurationMap(columnScopeInstance, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error) paymentReviewUiState).isRecoverable(), function1, startRestartGroup, 6 | ((i4 << 3) & 896));
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (paymentReviewUiState.getShouldShowScrim()) {
                    startRestartGroup.startReplaceGroup(1618598459);
                    i5 = 0;
                    com.paypal.oslo.feature.qrc.ui.review.components.FullPageLoaderScrimKt.FullPageLoaderScrim(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i5 = 0;
                    startRestartGroup.startReplaceGroup(1618641704);
                    startRestartGroup.endReplaceGroup();
                }
                if (paymentReviewUiState.getShouldShowScrimLoader()) {
                    startRestartGroup.startReplaceGroup(1618730705);
                    com.paypal.oslo.feature.qrc.ui.review.components.FullPageLoaderScrimKt.FullPageLoaderScrimWithLoader(startRestartGroup, i5);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1618783560);
                    startRestartGroup.endReplaceGroup();
                }
                int i8 = i4 & 112;
                com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.LowBalanceBottomSheet(paymentReviewUiState.getShouldShowLowBalanceBottomSheet(), function1, startRestartGroup, i8);
                com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.NoFIBottomSheet(paymentReviewUiState.getShouldShowNoFIBottomSheet(), function1, startRestartGroup, i8);
                com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData conversionData = paymentReviewUiState.getConversionData();
                if (conversionData != null) {
                    startRestartGroup.startReplaceGroup(1619234362);
                    boolean showConversionOptionsSheet = paymentReviewUiState.getShowConversionOptionsSheet();
                    int i9 = i8 == 32 ? 1 : i5;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (i9 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$XG3RcmtuRLHWILxsN03I1_ZaOp8(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    int i10 = i8 == 32 ? 1 : i5;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (i10 != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$OLoxDRJqP8DeN4e6NqDtXp9QoIE(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    int i11 = i8 != 32 ? i5 : 1;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (i11 != 0 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$GXvnnOHpKAr5hoLlfPlb8Fk8YcU(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.ConversionOptionsBottomSheet(showConversionOptionsSheet, conversionData, function12, function13, (kotlin.jvm.functions.Function0) rememberedValue5, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1619678344);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.m17813$r8$lambda$L6BOq35tRVsDPrMHFH_aaa7o4(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.this, function1, commonComponents, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final androidx.compose.foundation.layout.ColumnScope columnScope, final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        float f;
        java.lang.String str;
        int i5;
        java.lang.String str2;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer3;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-791895030);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(paymentReviewUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(commonComponents) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-791895030, i2, -1, "com.paypal.oslo.feature.qrc.ui.review.ContentState (PaymentReviewScreen.kt:263)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScope, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            int i9 = i2 >> 3;
            com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt.Header(paymentReviewUiModel, commonComponents, null, startRestartGroup, (i9 & 14) | ((i2 >> 6) & 112), 4);
            if (paymentReviewUiModel.getHasFIs()) {
                startRestartGroup.startReplaceGroup(-1256785257);
                i3 = 1;
                i4 = i2;
                f = 0.0f;
                str = null;
                i5 = 0;
                com.paypal.oslo.feature.qrc.ui.review.components.PaymentOptionsKt.PaymentOptions(paymentReviewUiModel, function1, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), startRestartGroup, i9 & 126, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = 1;
                i4 = i2;
                f = 0.0f;
                str = null;
                i5 = 0;
                startRestartGroup.startReplaceGroup(-1256580564);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.feature.qrc.ui.review.model.TipConfigData tip = paymentReviewUiModel.getTip();
            if (paymentReviewUiModel.getShouldShowTip() && tip != null) {
                startRestartGroup.startReplaceGroup(-1256417132);
                if (tip.getState() == com.paypal.oslo.feature.qrc.ui.review.model.TipState.COLLAPSED) {
                    startRestartGroup.startReplaceGroup(-1256364308);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i3, str);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_tip_title_add_tip, startRestartGroup, i5);
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    int i10 = (i4 & 896) == 256 ? i3 : i5;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (i10 != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$SzcBYfXJu0tXoQZe9i9pEUJkp1M(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ButtonSize.Large large2 = large;
                    str2 = str;
                    i8 = 256;
                    i6 = i4;
                    i7 = i3;
                    composer3 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, fillMaxWidth$default, null, null, secondary, large2, false, false, composer3, 1769856, 408);
                    composer3.endReplaceGroup();
                } else {
                    str2 = str;
                    i6 = i4;
                    i7 = i3;
                    composer3 = startRestartGroup;
                    i8 = 256;
                    composer3.startReplaceGroup(-1255863627);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i7, str2);
                    int i11 = i6 & 896;
                    int i12 = i11 == 256 ? i7 : 0;
                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                    if (i12 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$p_YpidiPneCxvWzw5rc38vHMjdM(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    int i13 = i11 == 256 ? i7 : 0;
                    java.lang.Object rememberedValue3 = composer3.rememberedValue();
                    if (i13 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$1UJLx4yrjAPMoKauTxSxWi2eBxs(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    int i14 = i11 == 256 ? i7 : 0;
                    java.lang.Object rememberedValue4 = composer3.rememberedValue();
                    if (i14 != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.m17811$r8$lambda$AtisNRu67WJ1E0LiUhFLVJ8CI(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    int i15 = i11 == 256 ? i7 : 0;
                    java.lang.Object rememberedValue5 = composer3.rememberedValue();
                    if (i15 != 0 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.m17814$r8$lambda$m1j7nC6Paz8FXEEC2iusvTiEdc(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.feature.qrc.ui.review.components.TipOptionsKt.TipOptions(tip, function0, function12, function02, (kotlin.jvm.functions.Function1) rememberedValue5, fillMaxWidth$default2, composer3, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                    composer3.endReplaceGroup();
                }
                composer3.endReplaceGroup();
            } else {
                str2 = str;
                i6 = i4;
                i7 = i3;
                composer3 = startRestartGroup;
                i8 = 256;
                composer3.startReplaceGroup(-1255071732);
                composer3.endReplaceGroup();
            }
            if (paymentReviewUiModel.getShowPaymentInfo()) {
                composer3.startReplaceGroup(-1254962364);
                com.paypal.oslo.feature.qrc.ui.review.components.PaymentAmountDetailsKt.PaymentAmountDetails(paymentReviewUiModel.getSubtotal(), paymentReviewUiModel.getTotalAmount(), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), paymentReviewUiModel.getTipAmount(), paymentReviewUiModel.isPayPalWorld() ? paymentReviewUiModel.getFeeAmount() : str2, composer3, 0, 0);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-1254602516);
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            androidx.compose.runtime.Composer composer4 = composer3;
            int i16 = i8;
            int i17 = i6;
            int i18 = i7;
            com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.PaymentReviewFooter(paymentReviewUiModel, function1, null, composer4, i9 & 126, 4);
            composer4.endNode();
            if (paymentReviewUiModel.getShowPaymentCancellationDialog()) {
                composer4.startReplaceGroup(913624338);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_title, composer4, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_desc, composer4, 0);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_button, composer4, 0);
                java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_go_back, composer4, 0);
                boolean isCancellationInProgress = paymentReviewUiModel.isCancellationInProgress();
                int i19 = i17 & 896;
                int i20 = i19 == i16 ? i18 : 0;
                java.lang.Object rememberedValue6 = composer4.rememberedValue();
                if (i20 != 0 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$gnEujHbBDdhb8bNPrypCp3K1cXo(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
                int i21 = i19 == i16 ? i18 : 0;
                java.lang.Object rememberedValue7 = composer4.rememberedValue();
                if (i21 != 0 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$Vg_Wxsf0U7VEat7nP5ijJS2tMOg(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue7;
                int i22 = i19 == i16 ? i18 : 0;
                java.lang.Object rememberedValue8 = composer4.rememberedValue();
                if (i22 != 0 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.m17815$r8$lambda$p882_9FJxrO07DCDLx6WSe397I(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue8);
                }
                composer2 = composer4;
                com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.QrcCommonDialog(stringResource2, stringResource4, function03, stringResource3, stringResource5, function04, (kotlin.jvm.functions.Function0) rememberedValue8, isCancellationInProgress, composer2, 0, 0);
                composer2.endReplaceGroup();
            } else {
                composer2 = composer4;
                composer2.startReplaceGroup(914374104);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$wslQ_tQVxlfz2YFHeXj1UOYQNIA(androidx.compose.foundation.layout.ColumnScope.this, paymentReviewUiModel, function1, commonComponents, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final androidx.compose.foundation.layout.ColumnScope columnScope, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(155221485);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(155221485, i3, -1, "com.paypal.oslo.feature.qrc.ui.review.ErrorState (PaymentReviewScreen.kt:365)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScope, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_title_error, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_desc_error, startRestartGroup, 0);
            if (z) {
                startRestartGroup.startReplaceGroup(-1476114008);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_try_again, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1476031114);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_button_non_recoverable_error, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            boolean z2 = (i3 & 112) == 32;
            boolean z3 = (i3 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$B6C02JHkO91RvD3xl50a2QjFifc(z, function1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.qrc.ui.error.CommonErrorScreenKt.CommonErrorScreen(stringResource2, stringResource3, stringResource, (kotlin.jvm.functions.Function0) rememberedValue, fillMaxSize$default, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.$r8$lambda$RMkSYYnq6QHfXvYyvHinxQD5xYo(androidx.compose.foundation.layout.ColumnScope.this, z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1UJLx4yrjAPMoKauTxSxWi2eBxs(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4MXkgbJitZvxWi6oAi9rfma2dt8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackToScanner.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AtisNR-u67WJ1E0LiUhFLV-J8CI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17811$r8$lambda$AtisNRu67WJ1E0LiUhFLVJ8CI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.OpenCustomTipInput.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B6C02JHkO91RvD3xl50a2QjFifc(boolean z, kotlin.jvm.functions.Function1 function1) {
        if (z) {
            function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.RetryPayment.INSTANCE);
        } else {
            function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackToScanner.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BuSPQl3NJ2zXNtmAYH_Dk7bKxQQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentReviewUiEffect(appNavigator, paymentReviewViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$E-TGKNRPpcgd0ZXjIpDqHXthyzY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17812$r8$lambda$ETGKNRPpcgd0ZXjIpDqHXthyzY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackToScanner.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GXvnnOHpKAr5hoLlfPlb8Fk8YcU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissConversionOptions.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L6BOq3-5tRVsD-PrMHFH_aaa7o4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17813$r8$lambda$L6BOq35tRVsDPrMHFH_aaa7o4(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState paymentReviewUiState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentReviewContent(paymentReviewUiState, function1, commonComponents, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OLoxDRJqP8DeN4e6NqDtXp9QoIE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed(conversionOptionTab));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RMkSYYnq6QHfXvYyvHinxQD5xYo(androidx.compose.foundation.layout.ColumnScope columnScope, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(columnScope, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SzcBYfXJu0tXoQZe9i9pEUJkp1M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded(true));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vg_Wxsf0U7VEat7nP5ijJS2tMOg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissDialog.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XG3RcmtuRLHWILxsN03I1_ZaOp8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab(conversionOptionTab));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gnEujHbBDdhb8bNPrypCp3K1cXo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConfirmCancelPayment.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jZ5VFwdCX7azovsfcCYS3AQ6mKE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentReviewScreen(appNavigator, qrcSessionNavArgs, commonComponents, modifier, paymentReviewViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m1j7nC6Pa-z8FXEEC2iusvTiEdc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17814$r8$lambda$m1j7nC6Paz8FXEEC2iusvTiEdc(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p882_9FJxrO07DCDLx6-WSe397I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17815$r8$lambda$p882_9FJxrO07DCDLx6WSe397I(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissDialog.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p_YpidiPneCxvWzw5rc38vHMjdM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded(false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wslQ_tQVxlfz2YFHeXj1UOYQNIA(androidx.compose.foundation.layout.ColumnScope columnScope, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(columnScope, paymentReviewUiModel, function1, commonComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

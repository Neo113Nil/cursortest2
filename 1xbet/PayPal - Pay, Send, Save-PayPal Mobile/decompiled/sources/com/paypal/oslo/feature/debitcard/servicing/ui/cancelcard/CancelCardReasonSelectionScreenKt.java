package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a9\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"CancelCardReasonSelectionScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/viewmodel/CancelCardReasonSelectionViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/viewmodel/CancelCardReasonSelectionViewModel;Landroidx/compose/runtime/Composer;II)V", "CancelCardReasonSelectionContent", "cardLastFourDigits", "", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionEvent;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;I)V", "CancelCardReasonSelectionScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardReasonSelectionScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CancelCardReasonSelectionScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel3;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        boolean changedInstance2;
        int i5;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(825142465);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel;
                if (startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
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
                    i4 = 1;
                    i7 &= -113;
                    cancelCardReasonSelectionViewModel3 = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(825142465, i7, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreen (CancelCardReasonSelectionScreen.kt:73)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(cancelCardReasonSelectionViewModel3.getUiState(), null, startRestartGroup, 0, i4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics.INSTANCE.getUserIntent(cancelCardReasonSelectionViewModel3.getCancelCardInfo().getProductName());
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(userIntentContext);
                    changedInstance2 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                    i5 = (i7 & 14) == 4 ? i4 : 0;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i5) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1(userIntentContext, cancelCardReasonSelectionViewModel3, appNavigator, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    java.lang.String cardLastFourDigits = cancelCardReasonSelectionViewModel3.getCancelCardInfo().getCardLastFourDigits();
                    com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState cancelCardReasonSelectionState = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState) collectAsState.getValue();
                    changedInstance3 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$2$1(cancelCardReasonSelectionViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    getHighSpeedVideoFpsRanges(cardLastFourDigits, cancelCardReasonSelectionState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), userIntentContext, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel3;
                }
                i4 = 1;
                cancelCardReasonSelectionViewModel3 = cancelCardReasonSelectionViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(cancelCardReasonSelectionViewModel3.getUiState(), null, startRestartGroup, 0, i4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(userIntentContext2);
                changedInstance2 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                if ((i7 & 14) == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i5) == 0) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1(userIntentContext2, cancelCardReasonSelectionViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                java.lang.String cardLastFourDigits2 = cancelCardReasonSelectionViewModel3.getCancelCardInfo().getCardLastFourDigits();
                com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState cancelCardReasonSelectionState2 = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState) collectAsState2.getValue();
                changedInstance3 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$2$1(cancelCardReasonSelectionViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                getHighSpeedVideoFpsRanges(cardLastFourDigits2, cancelCardReasonSelectionState2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), userIntentContext2, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    cancelCardReasonSelectionViewModel3 = cancelCardReasonSelectionViewModel2;
                    i4 = 1;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(cancelCardReasonSelectionViewModel3.getUiState(), null, startRestartGroup, 0, i4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext22 = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(userIntentContext22);
                    changedInstance2 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                    if ((i7 & 14) == 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i5) == 0) {
                    }
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1(userIntentContext22, cancelCardReasonSelectionViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    java.lang.String cardLastFourDigits22 = cancelCardReasonSelectionViewModel3.getCancelCardInfo().getCardLastFourDigits();
                    com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState cancelCardReasonSelectionState22 = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState) collectAsState22.getValue();
                    changedInstance3 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$2$1(cancelCardReasonSelectionViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    getHighSpeedVideoFpsRanges(cardLastFourDigits22, cancelCardReasonSelectionState22, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), userIntentContext22, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel3;
                }
                i4 = 1;
                cancelCardReasonSelectionViewModel3 = cancelCardReasonSelectionViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState222 = androidx.compose.runtime.SnapshotStateKt.collectAsState(cancelCardReasonSelectionViewModel3.getUiState(), null, startRestartGroup, 0, i4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext222 = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
                kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(userIntentContext222);
                changedInstance2 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                if ((i7 & 14) == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | i5) == 0) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1(userIntentContext222, cancelCardReasonSelectionViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                java.lang.String cardLastFourDigits222 = cancelCardReasonSelectionViewModel3.getCancelCardInfo().getCardLastFourDigits();
                com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState cancelCardReasonSelectionState222 = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState) collectAsState222.getValue();
                changedInstance3 = startRestartGroup.changedInstance(cancelCardReasonSelectionViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$2$1(cancelCardReasonSelectionViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                getHighSpeedVideoFpsRanges(cardLastFourDigits222, cancelCardReasonSelectionState222, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), userIntentContext222, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                cancelCardReasonSelectionViewModel2 = cancelCardReasonSelectionViewModel3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.$r8$lambda$DNlUhvBuLP985L8jL0GF0vD90IM(com.paypal.oslo.core.navigation.AppNavigator.this, cancelCardReasonSelectionViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState cancelCardReasonSelectionState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent, kotlin.Unit> function1, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        com.paypal.pds.components.SelectionCardModel create;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1828551641);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(cancelCardReasonSelectionState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            androidx.compose.runtime.Composer composer3 = startRestartGroup;
            composer3.skipToGroupEnd();
            composer2 = composer3;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1828551641, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionContent (CancelCardReasonSelectionScreen.kt:124)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason[]{com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.NO_MONEY, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.TRANSACTIONS_DECLINED, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.OTHER});
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final java.util.List list = (java.util.List) rememberedValue;
            com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason selectedReason = cancelCardReasonSelectionState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success ? ((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success) cancelCardReasonSelectionState).getSelectedReason() : null;
            startRestartGroup.startReplaceGroup(596521689);
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason : list2) {
                com.paypal.pds.components.SelectionCardModel.Companion companion = com.paypal.pds.components.SelectionCardModel.INSTANCE;
                java.lang.String name2 = cancelCardReason.name();
                java.lang.String label = com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReasonKt.label(cancelCardReason, startRestartGroup, 0);
                if (label == null) {
                    label = "";
                }
                create = companion.create(name2, (r18 & 2) != 0 ? null : label, (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : selectedReason == cancelCardReason, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                arrayList.add(create);
            }
            java.util.ArrayList arrayList2 = arrayList;
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), kotlin.collections.CollectionsKt.listOf(userIntentContext));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.m14346$r8$lambda$m5KZv9OWqGwP17vwOJKl5dnTwY(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.Composer composer4 = startRestartGroup;
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(null, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 384, 107);
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer4, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, m1708paddingVpY3zN4$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor2);
            } else {
                composer4.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_reason_title, new java.lang.Object[]{str}, composer4, 0);
            final java.lang.String replaceCardDigitsForAccessibility = com.paypal.oslo.feature.debitcard.shared.ui.utils.AccessibilityUtilsKt.replaceCardDigitsForAccessibility(stringResource, str);
            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer4.changed(replaceCardDigitsForAccessibility);
            java.lang.Object rememberedValue3 = composer4.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.$r8$lambda$9MBUYrqZ7GkjXY9YaCm__UPa8xo(replaceCardDigitsForAccessibility, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer4.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), contentBase, null, null, null, false, 0, 0, null, headingMedium, composer4, 384, 6, 1016);
            com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
            androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics.INSTANCE.getCANCEL_REASON_SELECTION_CARD());
            com.paypal.pds.components.SelectionCardConfig.Vertical vertical2 = vertical;
            boolean changedInstance = composer4.changedInstance(list);
            boolean z2 = (i3 & 7168) == 2048 || ((i3 & 4096) != 0 && composer4.changedInstance(userIntentContext));
            boolean z3 = i4 == 256;
            java.lang.Object rememberedValue4 = composer4.rememberedValue();
            if ((changedInstance | z2 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.m14345$r8$lambda$9PHq0A5dfDX0UTmfksVIJmeZuk(list, userIntentContext, function1, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                composer4.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical2, arrayList2, (kotlin.jvm.functions.Function2) rememberedValue4, component, null, false, null, composer4, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable, 112);
            composer4.endNode();
            composer4.endNode();
            composer2 = composer4;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                composer2 = composer4;
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.$r8$lambda$LVjmr6WfP4t0zbnWay_E4VDJ7jQ(str, cancelCardReasonSelectionState, function1, userIntentContext, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9MBUYrqZ7GkjXY9YaCm__UPa8xo(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9PHq0A5dfDX0UTmfksVIJmeZu-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14345$r8$lambda$9PHq0A5dfDX0UTmfksVIJmeZuk(java.util.List list, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason = (com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason) list.get(i);
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics.INSTANCE.getCANCEL_REASON_SELECTION_ITEM(), userIntentContext, null, 8, null);
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected(cancelCardReason));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9a03eo2Y1uTHyNLC8Z_XNkRz8_g(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent cancelCardReasonSelectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReasonSelectionEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9nqJiZybX4xcDpid7MNN14WIbj4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1077728853);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1077728853, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenPreview (CancelCardReasonSelectionScreen.kt:204)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Initial initial = com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Initial.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.$r8$lambda$9a03eo2Y1uTHyNLC8Z_XNkRz8_g((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges("8458", initial, (kotlin.jvm.functions.Function1) rememberedValue, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("CONSUMER_DEBIT_CARD", com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CANCEL_CARD_FEATURE, "select"), startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 438);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt.$r8$lambda$9nqJiZybX4xcDpid7MNN14WIbj4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DNlUhvBuLP985L8jL0GF0vD90IM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CancelCardReasonSelectionScreen(appNavigator, cancelCardReasonSelectionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LVjmr6WfP4t0zbnWay_E4VDJ7jQ(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState cancelCardReasonSelectionState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, cancelCardReasonSelectionState, function1, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m5KZv9OWqGwP17vwOJKl5dnTw-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14346$r8$lambda$m5KZv9OWqGwP17vwOJKl5dnTwY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.BackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}

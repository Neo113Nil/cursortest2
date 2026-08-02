package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;", "state", "Lkotlin/Function1;", "", "", "onYearHeaderClick", "onDownloadYearClick", "Lkotlin/Function2;", "", "onDownloadMonthClick", "AllTransactionsStateHost", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsStateHostKt {
    public static final void AllTransactionsStateHost(final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState allTransactionsUiState, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allTransactionsUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-227126899);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(allTransactionsUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-227126899, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsStateHost (AllTransactionsStateHost.kt:25)");
            }
            if (allTransactionsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading) {
                startRestartGroup.startReplaceGroup(774391062);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.LoadingScreenComponentKt.LoadingScreenComponent(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_loading_state_description, startRestartGroup, 0), startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(allTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.NoStatementsYet.INSTANCE)) {
                startRestartGroup.startReplaceGroup(774403505);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(allTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.AccountCreationUnavailable.INSTANCE)) {
                startRestartGroup.startReplaceGroup(774405617);
                startRestartGroup.endReplaceGroup();
            } else if (allTransactionsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Error) {
                startRestartGroup.startReplaceGroup(774407153);
                startRestartGroup.endReplaceGroup();
            } else if (allTransactionsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) {
                startRestartGroup.startReplaceGroup(774409413);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt.AllTransactionsContent(((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) allTransactionsUiState).getYears(), function1, function12, function2, null, startRestartGroup, i2 & 8176, 16);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(774389455);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsStateHostKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsStateHostKt.$r8$lambda$l2Ugh66ILJXbmesjL9F865QsJw4(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.this, function1, function12, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l2Ugh66ILJXbmesjL9F865QsJw4(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState allTransactionsUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsStateHost(allTransactionsUiState, function1, function12, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

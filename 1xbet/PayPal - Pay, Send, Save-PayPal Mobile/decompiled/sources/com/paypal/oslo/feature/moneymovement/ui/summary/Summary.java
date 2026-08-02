package com.paypal.oslo.feature.moneymovement.ui.summary;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u0010\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/summary/Summary;", "", "dateTimeFormatUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;)V", "formatterFactory", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "Landroidx/compose/runtime/Composable;", "getFormatterFactory$money_movement_prodRelease$annotations", "()V", "getFormatterFactory$money_movement_prodRelease", "()Lkotlin/jvm/functions/Function2;", "setFormatterFactory$money_movement_prodRelease", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "Content", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Summary {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase Camera2StreamConfigurationMap;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getFormatterFactory$money_movement_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public Summary(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        this.Camera2StreamConfigurationMap = dateTimeFormatUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.Summary$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.summary.Summary.$r8$lambda$M0vKvXK9Rzl9luqQWJEamx_dz54((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        };
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getFormatterFactory$money_movement_prodRelease() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setFormatterFactory$money_movement_prodRelease(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData summaryData, final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks summaryCallbacks, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summaryData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summaryCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-616025454);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(summaryData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(summaryCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-616025454, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.Summary.Content (Summary.kt:85)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.getLocalMoneyAmountFormatter().provides(this.getHighResolutionOutputSizeshNQ4ISI.invoke(startRestartGroup, 0)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-8935598, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.Summary$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.summary.Summary.m15695$r8$lambda$oqE5TuEDCTdIe0vjf7KlIgdr0M(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.this, summaryCallbacks, modifier, this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.Summary$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.summary.Summary.m15696$r8$lambda$uLjnXGFXHht8mZLn3NRhJG574(com.paypal.oslo.feature.moneymovement.ui.summary.Summary.this, summaryData, summaryCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter $r8$lambda$M0vKvXK9Rzl9luqQWJEamx_dz54(androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        composer.startReplaceGroup(956893282);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(956893282, i, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.Summary.formatterFactory.<anonymous> (Summary.kt:76)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter formatter = ((com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0)).getFormatter();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return formatter;
    }

    /* renamed from: $r8$lambda$oqE-5TuEDCTdIe0vjf7KlIgdr0M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15695$r8$lambda$oqE5TuEDCTdIe0vjf7KlIgdr0M(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData summaryData, com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks summaryCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.ui.summary.Summary summary, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-8935598, i, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.Summary.Content.<anonymous> (Summary.kt:88)");
            }
            com.paypal.oslo.feature.moneymovement.ui.summary.SummaryKt.Summary(summaryData, summaryCallbacks, modifier, summary.Camera2StreamConfigurationMap, false, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uLjnXGFXH-ht8mZLn3NRhJG5-74, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15696$r8$lambda$uLjnXGFXHht8mZLn3NRhJG574(com.paypal.oslo.feature.moneymovement.ui.summary.Summary summary, com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData summaryData, com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks summaryCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        summary.Content(summaryData, summaryCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

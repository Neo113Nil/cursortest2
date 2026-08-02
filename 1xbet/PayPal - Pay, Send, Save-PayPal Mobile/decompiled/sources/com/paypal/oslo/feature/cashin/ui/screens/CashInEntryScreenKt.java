package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CashInEntryScreen", "", "source", "", "viewModel", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInEntryViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInEntryViewModel;Landroidx/compose/runtime/Composer;II)V", "cash-in_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInEntryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInEntryScreen(final java.lang.String str, com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel cashInEntryViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel cashInEntryViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1858238611);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cashInEntryViewModel2 = cashInEntryViewModel;
                if (startRestartGroup.changedInstance(cashInEntryViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                cashInEntryViewModel2 = cashInEntryViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            cashInEntryViewModel2 = cashInEntryViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                cashInEntryViewModel2 = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1858238611, i7, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInEntryScreen (CashInEntryScreen.kt:37)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                i5 = (i7 & 14) != 4 ? i4 : 0;
                changedInstance = startRestartGroup.changedInstance(cashInEntryViewModel2);
                changedInstance2 = startRestartGroup.changedInstance(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if ((i5 | (changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0)) == 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInEntryScreenKt$CashInEntryScreen$1$1(str, cashInEntryViewModel2, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), "cash_in_entry_screen"), startRestartGroup, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 1;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            if ((i7 & 14) != 4) {
            }
            changedInstance = startRestartGroup.changedInstance(cashInEntryViewModel2);
            changedInstance2 = startRestartGroup.changedInstance(context2);
            rememberedValue = startRestartGroup.rememberedValue();
            if ((i5 | (changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0)) == 0) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInEntryScreenKt$CashInEntryScreen$1$1(str, cashInEntryViewModel2, context2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null), "cash_in_entry_screen"), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInEntryScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInEntryScreenKt.$r8$lambda$IhGQ_jdp1IXwNlQ2XdW_adWYpd0(str, cashInEntryViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IhGQ_jdp1IXwNlQ2XdW_adWYpd0(java.lang.String str, com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel cashInEntryViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CashInEntryScreen(str, cashInEntryViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

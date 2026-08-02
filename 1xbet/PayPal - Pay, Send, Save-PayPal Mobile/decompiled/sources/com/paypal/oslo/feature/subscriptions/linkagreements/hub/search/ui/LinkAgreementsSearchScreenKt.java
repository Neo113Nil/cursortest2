package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"LinkAgreementsSearchScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsSearchScreenKt {
    public static final void LinkAgreementsSearchScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsSearchViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1933016447);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(linkAgreementsSearchViewModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1933016447, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreen (LinkAgreementsSearchScreen.kt:26)");
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState) androidx.compose.runtime.SnapshotStateKt.collectAsState(linkAgreementsSearchViewModel.getUiState(), null, startRestartGroup, 0, 1).getValue();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(linkAgreementsSearchViewModel);
            boolean z = (i3 & 14) == 4;
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt$LinkAgreementsSearchScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt$LinkAgreementsSearchScreen$1$1(linkAgreementsSearchViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(linkAgreementsSearchViewModel);
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt$LinkAgreementsSearchScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt$LinkAgreementsSearchScreen$2$1(linkAgreementsSearchViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.LinkAgreementsSearchScreenContent((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), linkAgreementsSearchViewModel.getAgreementType(), linkAgreementsSearchScreenState, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt.$r8$lambda$73TUwaVhgqB7w6_hDZlTdJKcBaM(com.paypal.oslo.core.navigation.AppNavigator.this, linkAgreementsSearchViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$73TUwaVhgqB7w6_hDZlTdJKcBaM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementsSearchScreen(appNavigator, linkAgreementsSearchViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ConfirmTransactionDetailsViewProvider$View$2$2$1$4 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        com.ingo.sdk.kotlin.common.core.exception.Failure value;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if ((intValue & 81) != 16 || !composer2.getSkipping()) {
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            final com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider confirmTransactionDetailsViewProvider = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState4 = this.getHighSpeedVideoSizes;
            final androidx.compose.ui.focus.FocusManager focusManager = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_promotion_code, composer2, 0);
            java.lang.String str = (!com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.access$isInvalidPromoCodeErrorResponse(confirmTransactionDetailsViewProvider) || (value = confirmTransactionDetailsViewProvider.getFailure().getValue()) == null || (getHighSpeedVideoFpsRangesFor = value.getGetHighSpeedVideoFpsRangesFor()) == null) ? "" : getHighSpeedVideoFpsRangesFor;
            mutableState = confirmTransactionDetailsViewProvider.getOutputSizes;
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoTextInput(stringResource, mutableState4, str, null, null, null, !((java.lang.Boolean) mutableState.getValue()).booleanValue(), new kotlin.jvm.functions.Function3() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    boolean access$isInvalidPromoCodeErrorResponse;
                    access$isInvalidPromoCodeErrorResponse = com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.access$isInvalidPromoCodeErrorResponse(com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.this);
                    return java.lang.Boolean.valueOf(access$isInvalidPromoCodeErrorResponse);
                }
            }, false, 0, androidx.compose.foundation.text.KeyboardOptions.m2058copyINvB4aQ$default(androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault(), 0, (java.lang.Boolean) null, 0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 119, (java.lang.Object) null), null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, confirmTransactionDetailsViewProvider, (java.lang.String) obj);
                }
            }, null, new androidx.compose.foundation.text.KeyboardActions(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusManager.this, softwareKeyboardController, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                }
            }, null, null, null, null, null, 62, null), false, null, null, null, null, composer2, 48, 0, 1026872);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), composer2, 6);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer2, 54);
            boolean z = false;
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_apply_code, composer2, 0);
            if (!kotlin.text.StringsKt.isBlank(mutableState4.getValue())) {
                mutableState3 = confirmTransactionDetailsViewProvider.getOutputSizes;
                if (!((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                    z = true;
                }
            }
            mutableState2 = confirmTransactionDetailsViewProvider.getOutputSizes;
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(stringResource2, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$2$2$1$4.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.this, mutableState4);
                }
            }, z, false, ((java.lang.Boolean) mutableState2.getValue()).booleanValue(), 0, composer2, 3072, 32);
            composer2.endNode();
            composer2.endNode();
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Trying to close keyboard", null, 2, null);
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider confirmTransactionDetailsViewProvider, androidx.compose.runtime.MutableState mutableState) {
        kotlin.jvm.functions.Function1 function1;
        function1 = confirmTransactionDetailsViewProvider.getHighSpeedVideoFpsRangesFor;
        function1.invoke(mutableState.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider confirmTransactionDetailsViewProvider, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        if (com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.access$isInvalidPromoCodeErrorResponse(confirmTransactionDetailsViewProvider)) {
            confirmTransactionDetailsViewProvider.getFailure().setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    ConfirmTransactionDetailsViewProvider$View$2$2$1$4(com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider confirmTransactionDetailsViewProvider, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
        this.getHighSpeedVideoFpsRangesFor = confirmTransactionDetailsViewProvider;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = focusManager;
        this.Camera2StreamConfigurationMap = softwareKeyboardController;
    }
}

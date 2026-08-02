package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class AcceptLegalDocumentsViewProvider$View$1$2$1$1$1$2$1 implements kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.Composer composer2 = composer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        composer2.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = composer2.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
            composer2.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
        composer2.endReplaceGroup();
        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        currentTheme = this.Camera2StreamConfigurationMap.currentTheme(composer2, 8);
        androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(fillMaxSize$default, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor())), null, 2, null);
        composer2.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue2 = composer2.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$1$1$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer2.endReplaceGroup();
        androidx.compose.ui.Modifier m1318clickableO2vRcR0$default = androidx.compose.foundation.ClickableKt.m1318clickableO2vRcR0$default(m1286backgroundbw27NRU$default, mutableInteractionSource, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, 28, null);
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
        androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
        com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider = this.Camera2StreamConfigurationMap;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1318clickableO2vRcR0$default);
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
        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoCircularProgressIndicator(null, composer2, 0, 1);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer2, 6);
        androidx.compose.ui.Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, 0.6f);
        mutableState = acceptLegalDocumentsViewProvider.getHighSpeedVideoFpsRanges;
        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(fillMaxWidth, (java.lang.String) mutableState.getValue(), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
        composer2.endNode();
        return kotlin.Unit.INSTANCE;
    }

    AcceptLegalDocumentsViewProvider$View$1$2$1$1$1$2$1(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
        this.Camera2StreamConfigurationMap = acceptLegalDocumentsViewProvider;
    }
}

package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CaptureCheckImagesViewProvider$View$3 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.SheetState getHighSpeedVideoSizes;
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:119:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x093a  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
        kotlin.jvm.functions.Function0 function0;
        androidx.compose.runtime.MutableState mutableState;
        kotlin.jvm.functions.Function0 function02;
        androidx.compose.runtime.MutableState mutableState2;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme2;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme3;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme4;
        androidx.compose.runtime.MutableState mutableState3;
        boolean z;
        boolean booleanValue;
        androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4;
        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider;
        androidx.compose.runtime.Composer composer2;
        boolean z2;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.MutableState mutableState5;
        final com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider2;
        androidx.compose.runtime.MutableState mutableState6;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState7;
        java.lang.String str;
        int i;
        androidx.compose.runtime.MutableState mutableState8;
        java.lang.String str2;
        java.lang.String str3;
        androidx.compose.runtime.MutableState mutableState9;
        androidx.compose.runtime.MutableState mutableState10;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme5;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState11;
        androidx.compose.runtime.MutableState mutableState12;
        androidx.compose.runtime.MutableState mutableState13;
        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
        androidx.compose.runtime.Composer composer3 = composer;
        int intValue = num.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
        if ((intValue & 14) == 0) {
            intValue |= composer3.changed(paddingValues2) ? 4 : 2;
        }
        if ((intValue & 91) != 18 || !composer3.getSkipping()) {
            androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, paddingValues2.mo1672calculateLeftPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection.Ltr), paddingValues2.getTop(), paddingValues2.mo1673calculateRightPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection.Ltr), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
            final com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider3 = this.getOutputFormats;
            final androidx.compose.material3.SheetState sheetState = this.getHighSpeedVideoSizes;
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState14 = this.getHighSpeedVideoFpsRanges;
            androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> mutableState15 = this.Camera2StreamConfigurationMap;
            androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> mutableState16 = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState17 = this.getOutputMinFrameDuration;
            final kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR0);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, verticalScroll$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1709paddingqDBjuR02 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR02);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.capture_check_images_header, composer3, 0), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getHeadlineSmall(), 0, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
            composer3.startReplaceGroup(651140834);
            androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
            builder.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.capture_check_images_subheader_1, composer3, 0));
            androidx.compose.foundation.text.InlineTextContentKt.appendInlineContent$default(builder, "imageId", null, 2, null);
            androidx.compose.ui.text.AnnotatedString annotatedString = builder.toAnnotatedString();
            composer3.endReplaceGroup();
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("imageId", new androidx.compose.foundation.text.InlineTextContent(new androidx.compose.ui.text.Placeholder(androidx.compose.ui.unit.TextUnitKt.getSp(20), androidx.compose.ui.unit.TextUnitKt.getSp(20), androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7943getTextCenterJ6kI3mc(), null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(227807444, true, new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$1$inlineContentMap$1(mutableState14, captureCheckImagesViewProvider3), composer3, 54))));
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10645PrimaryTextDpqVIHw(null, annotatedString, mapOf, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodyLarge(), 0, null, composer3, 0, 49);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.capture_check_images_subheader_2, composer3, 0), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodyMedium(), 0, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
            composer3.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer3, 6);
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoLinearProgressIndicator(com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.access$getProgressValue(captureCheckImagesViewProvider3), null, composer3, 0, 2);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            currentTheme = captureCheckImagesViewProvider3.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(fillMaxWidth$default, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getSecondaryBackgroundColor())), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
            int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1286backgroundbw27NRU$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor4);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                m5299constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1709paddingqDBjuR03 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
            int currentCompositeKeyHash5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR03);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash5))) {
                m5299constructorimpl5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash5));
                m5299constructorimpl5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.check_images_label, composer3, 0), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceAround(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 6);
            int currentCompositeKeyHash6 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor6);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash6))) {
                m5299constructorimpl6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash6));
                m5299constructorimpl6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.5f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash7 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor7);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash7))) {
                m5299constructorimpl7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash7));
                m5299constructorimpl7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.front_check_image_caption, composer3, 0);
            function0 = captureCheckImagesViewProvider3.Camera2StreamConfigurationMap;
            mutableState = captureCheckImagesViewProvider3.getOutputStallDurationlomOqCM;
            boolean booleanValue2 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
            if (obj != null) {
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.DocumentImageView(stringResource, mutableState15, function0, null, !booleanValue2, ((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj).getIconTintEnabled(), composer3, 48, 8);
                composer3.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer3, 6);
                androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.5f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash8 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, weight$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor8);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl8 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, currentCompositionLocalMap8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash8))) {
                    m5299constructorimpl8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash8));
                    m5299constructorimpl8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, materializeModifier8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.back_check_image_caption, composer3, 0);
                function02 = captureCheckImagesViewProvider3.getHighResolutionOutputSizeshNQ4ISI;
                mutableState2 = captureCheckImagesViewProvider3.getOutputStallDurationlomOqCM;
                boolean booleanValue3 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                if (obj2 != null) {
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.DocumentImageView(stringResource2, mutableState16, function02, null, !booleanValue3, ((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj2).getIconTintEnabled(), composer3, 48, 8);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endNode();
                    androidx.compose.ui.Modifier weight$default3 = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    currentTheme2 = captureCheckImagesViewProvider3.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(weight$default3, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme2.getSecondaryBackgroundColor())), null, 2, null), composer3, 0);
                    androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
                    currentTheme3 = captureCheckImagesViewProvider3.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(m1726height3ABfNKs, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme3.getSecondaryBackgroundColor())), null, 2, null), composer3, 0);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    currentTheme4 = captureCheckImagesViewProvider3.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                    androidx.compose.ui.Modifier m1286backgroundbw27NRU$default2 = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(companion, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme4.getSecondaryBackgroundColor())), null, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy5 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash9 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1286backgroundbw27NRU$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor9);
                    } else {
                        composer3.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl9 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, columnMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, currentCompositionLocalMap9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl9.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl9.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash9))) {
                        m5299constructorimpl9.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash9));
                        m5299constructorimpl9.apply(java.lang.Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, materializeModifier9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance5 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_next, composer3, 0);
                    mutableState3 = captureCheckImagesViewProvider3.getOutputFormats;
                    if (mutableState3.getValue() != null) {
                        mutableState12 = captureCheckImagesViewProvider3.getHighSpeedVideoSizes;
                        if (mutableState12.getValue() != null) {
                            mutableState13 = captureCheckImagesViewProvider3.getOutputStallDurationlomOqCM;
                            if (!((java.lang.Boolean) mutableState13.getValue()).booleanValue()) {
                                z = true;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(stringResource3, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, captureCheckImagesViewProvider3);
                                    }
                                }, z, false, false, 0, composer3, 0, 56);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
                                com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer3, 0);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.NavigationBarSpacer(null, composer3, 0, 1);
                                composer3.endNode();
                                composer3.startReplaceGroup(55416284);
                                booleanValue = ((java.lang.Boolean) mutableState14.getValue()).booleanValue();
                                if (booleanValue) {
                                    mutableState4 = mutableState17;
                                    captureCheckImagesViewProvider = captureCheckImagesViewProvider3;
                                    composer2 = composer3;
                                    z2 = true;
                                } else {
                                    androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE);
                                    currentTheme5 = captureCheckImagesViewProvider3.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                                    long Color = androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme5.getBackgroundColor()));
                                    composer3.startReplaceGroup(5004770);
                                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        mutableState11 = mutableState14;
                                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue2);
                                    } else {
                                        mutableState11 = mutableState14;
                                    }
                                    composer3.endReplaceGroup();
                                    z2 = true;
                                    mutableState4 = mutableState17;
                                    captureCheckImagesViewProvider = captureCheckImagesViewProvider3;
                                    composer2 = composer3;
                                    androidx.compose.material3.ModalBottomSheetKt.m3470ModalBottomSheetdYc4hso((kotlin.jvm.functions.Function0) rememberedValue2, statusBarsPadding, sheetState, 0.0f, null, Color, 0L, 0.0f, 0L, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(739641010, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                            androidx.compose.runtime.Composer composer5 = composer4;
                                            if ((num2.intValue() & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                            } else {
                                                androidx.compose.material3.AppBarKt.m2908CenterAlignedTopAppBarGHTll3U(com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$CaptureCheckImagesViewProviderKt.INSTANCE.getLambda$2041686893$androidSdkUx_release(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-529982302, true, new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5.AnonymousClass1(kotlinx.coroutines.CoroutineScope.this, sheetState, mutableState11, captureCheckImagesViewProvider3), composer5, 54), 0.0f, androidx.compose.foundation.layout.WindowInsetsKt.m1751WindowInsetsa9UjIt4$default(0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), 5, null), androidx.compose.material3.TopAppBarDefaults.INSTANCE.m4203topAppBarColorszjMxDiM(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, composer5, (androidx.compose.material3.TopAppBarDefaults.$stable << 15) | 6, 30), null, composer5, 3078, 150);
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                        /* renamed from: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1, reason: invalid class name */
                                        static final class AnonymousClass1 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                                            final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
                                            final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
                                            final /* synthetic */ androidx.compose.material3.SheetState getHighSpeedVideoFpsRangesFor;
                                            final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider getHighSpeedVideoSizes;

                                            @Override // kotlin.jvm.functions.Function3
                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                                                androidx.compose.runtime.Composer composer2 = composer;
                                                int intValue = num.intValue();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
                                                if ((intValue & 81) != 16 || !composer2.getSkipping()) {
                                                    final kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoFpsRanges;
                                                    final androidx.compose.material3.SheetState sheetState = this.getHighSpeedVideoFpsRangesFor;
                                                    final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.Camera2StreamConfigurationMap;
                                                    kotlin.jvm.functions.Function0 function0 = 
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: CONSTRUCTOR (r0v0 'function0' kotlin.jvm.functions.Function0) = 
                                                          (r10v3 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                                          (r11v3 'sheetState' androidx.compose.material3.SheetState A[DONT_INLINE])
                                                          (r12v3 'mutableState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE])
                                                         A[DECLARE_VAR, MD:(kotlinx.coroutines.CoroutineScope, androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState):void (m)] call: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda1.<init>(kotlinx.coroutines.CoroutineScope, androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5.1.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda1, state: NOT_LOADED
                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                        	... 21 more
                                                        */
                                                    /*
                                                        this = this;
                                                        androidx.compose.foundation.layout.RowScope r10 = (androidx.compose.foundation.layout.RowScope) r10
                                                        r6 = r11
                                                        androidx.compose.runtime.Composer r6 = (androidx.compose.runtime.Composer) r6
                                                        java.lang.Number r12 = (java.lang.Number) r12
                                                        int r11 = r12.intValue()
                                                        java.lang.String r12 = ""
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r12)
                                                        r10 = r11 & 81
                                                        r11 = 16
                                                        if (r10 != r11) goto L20
                                                        boolean r10 = r6.getSkipping()
                                                        if (r10 == 0) goto L20
                                                        r6.skipToGroupEnd()
                                                        goto L4a
                                                    L20:
                                                        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda1 r0 = new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda1
                                                        kotlinx.coroutines.CoroutineScope r10 = r9.getHighSpeedVideoFpsRanges
                                                        androidx.compose.material3.SheetState r11 = r9.getHighSpeedVideoFpsRangesFor
                                                        androidx.compose.runtime.MutableState<java.lang.Boolean> r12 = r9.Camera2StreamConfigurationMap
                                                        r0.<init>(r10, r11, r12)
                                                        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$2 r10 = new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$2
                                                        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider r11 = r9.getHighSpeedVideoSizes
                                                        r10.<init>()
                                                        r11 = 54
                                                        r12 = 937418239(0x37dfddff, float:2.6687047E-5)
                                                        r1 = 1
                                                        androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r12, r1, r10, r6, r11)
                                                        r5 = r10
                                                        kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                                                        r1 = 0
                                                        r2 = 0
                                                        r3 = 0
                                                        r4 = 0
                                                        r7 = 196608(0x30000, float:2.75506E-40)
                                                        r8 = 30
                                                        androidx.compose.material3.IconButtonKt.IconButton(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                                                    L4a:
                                                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                                                        return r10
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5.AnonymousClass1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                                }

                                                public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material3.SheetState sheetState, androidx.compose.runtime.MutableState mutableState) {
                                                    if (!sheetState.isVisible()) {
                                                        mutableState.setValue(java.lang.Boolean.valueOf(false));
                                                    }
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.material3.SheetState sheetState, final androidx.compose.runtime.MutableState mutableState) {
                                                    kotlinx.coroutines.Job launch$default;
                                                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$1$1(sheetState, null), 3, null);
                                                    launch$default.invokeOnCompletion(
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: INVOKE 
                                                          (r6v1 'launch$default' kotlinx.coroutines.Job)
                                                          (wrap:kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>:0x0014: CONSTRUCTOR 
                                                          (r7v0 'sheetState' androidx.compose.material3.SheetState A[DONT_INLINE])
                                                          (r8v0 'mutableState' androidx.compose.runtime.MutableState A[DONT_INLINE])
                                                         A[MD:(androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState):void (m), WRAPPED] (LINE:2317) call: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda0.<init>(androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR)
                                                         INTERFACE call: kotlinx.coroutines.Job.invokeOnCompletion(kotlin.jvm.functions.Function1):kotlinx.coroutines.DisposableHandle A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>):kotlinx.coroutines.DisposableHandle (m)] (LINE:2317) in method: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5.1.getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope, androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState):kotlin.Unit, file: classes9.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                        	... 15 more
                                                        */
                                                    /*
                                                        r1 = 0
                                                        r2 = 0
                                                        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$1$1 r0 = new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$1$1
                                                        r3 = 0
                                                        r0.<init>(r7, r3)
                                                        r3 = r0
                                                        kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                                                        r4 = 3
                                                        r5 = 0
                                                        r0 = r6
                                                        kotlinx.coroutines.Job r6 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                                                        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda0 r0 = new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5$1$$ExternalSyntheticLambda0
                                                        r0.<init>(r7, r8)
                                                        r6.invokeOnCompletion(r0)
                                                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                                        return r6
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$5.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope, androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState):kotlin.Unit");
                                                }

                                                AnonymousClass1(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.SheetState sheetState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
                                                    this.getHighSpeedVideoFpsRanges = coroutineScope;
                                                    this.getHighSpeedVideoFpsRangesFor = sheetState;
                                                    this.Camera2StreamConfigurationMap = mutableState;
                                                    this.getHighSpeedVideoSizes = captureCheckImagesViewProvider;
                                                }
                                            }
                                        }, composer3, 54), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(899312626, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$6
                                            @Override // kotlin.jvm.functions.Function3
                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                                java.lang.String loadAmountDisclaimer;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration allOtherChecks;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration allOtherChecks2;
                                                java.lang.String feeDescription;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration allOtherChecks3;
                                                java.lang.String feeName;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration printedPayrollAndGovernmentChecks;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration printedPayrollAndGovernmentChecks2;
                                                java.lang.String feeDescription2;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.CheckFeeConfiguration printedPayrollAndGovernmentChecks3;
                                                java.lang.String feeName2;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFee;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFee2;
                                                java.lang.String minFeeDescription;
                                                com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFee3;
                                                java.lang.String minFeeTitle;
                                                java.lang.String feeDisclaimer;
                                                androidx.compose.runtime.Composer composer5 = composer4;
                                                int intValue2 = num2.intValue();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
                                                if ((intValue2 & 81) != 16 || !composer5.getSkipping()) {
                                                    java.lang.Object obj3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                                                    if (obj3 != null) {
                                                        com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj3).configurationResponse();
                                                        com.ingo.sdk.kotlin.common.features.configuration.model.FeesConfigurations feesConfiguration = configurationResponse != null ? configurationResponse.getFeesConfiguration() : null;
                                                        androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                                        com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider4 = com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.this;
                                                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                                        int currentCompositeKeyHash10 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap10 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier10 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default3);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor10);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl10 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, maybeCachedBoxMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, currentCompositionLocalMap10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl10.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl10.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash10))) {
                                                            m5299constructorimpl10.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash10));
                                                            m5299constructorimpl10.apply(java.lang.Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, materializeModifier10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                        androidx.compose.ui.Modifier verticalScroll$default2 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null);
                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy6 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer5, 0);
                                                        int currentCompositeKeyHash11 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap11 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier11 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, verticalScroll$default2);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor11 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor11);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl11 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl11, columnMeasurePolicy6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl11, currentCompositionLocalMap11, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash11 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl11.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl11.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash11))) {
                                                            m5299constructorimpl11.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash11));
                                                            m5299constructorimpl11.apply(java.lang.Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl11, materializeModifier11, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance6 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                        androidx.compose.ui.Modifier fillMaxWidth$default4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer5, 0);
                                                        int currentCompositeKeyHash12 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap12 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier12 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default4);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor12 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor12);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl12 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl12, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl12, currentCompositionLocalMap12, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash12 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl12.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl12.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash12))) {
                                                            m5299constructorimpl12.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash12));
                                                            m5299constructorimpl12.apply(java.lang.Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl12, materializeModifier12, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (feesConfiguration == null || (feeDisclaimer = feesConfiguration.getFeeDisclaimer()) == null) ? "" : feeDisclaimer, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodyLarge(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), null, 0, 0L, 0, composer5, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        androidx.compose.ui.Modifier fillMaxWidth$default5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer5, 0);
                                                        int currentCompositeKeyHash13 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap13 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default5);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor13 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor13);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl13 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl13, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl13, currentCompositionLocalMap13, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash13 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl13.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl13.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash13))) {
                                                            m5299constructorimpl13.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash13));
                                                            m5299constructorimpl13.apply(java.lang.Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl13, materializeModifier13, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                        androidx.compose.ui.Modifier weight$default4 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance3, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy7 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer5, 0);
                                                        int currentCompositeKeyHash14 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap14 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier14 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, weight$default4);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor14 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor14);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl14 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl14, columnMeasurePolicy7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl14, currentCompositionLocalMap14, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash14 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl14.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl14.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash14))) {
                                                            m5299constructorimpl14.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash14));
                                                            m5299constructorimpl14.apply(java.lang.Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl14, materializeModifier14, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance7 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, (feesConfiguration == null || (minimumInMinutesFee3 = feesConfiguration.getMinimumInMinutesFee()) == null || (minFeeTitle = minimumInMinutesFee3.getMinFeeTitle()) == null) ? "" : minFeeTitle, null, 0, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer5, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
                                                        java.lang.String str4 = (feesConfiguration == null || (minimumInMinutesFee2 = feesConfiguration.getMinimumInMinutesFee()) == null || (minFeeDescription = minimumInMinutesFee2.getMinFeeDescription()) == null) ? "" : minFeeDescription;
                                                        composer5.startReplaceGroup(327281912);
                                                        if (!kotlin.text.StringsKt.isBlank(str4)) {
                                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str4, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer5, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
                                                        }
                                                        composer5.endReplaceGroup();
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance3, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf((feesConfiguration == null || (minimumInMinutesFee = feesConfiguration.getMinimumInMinutesFee()) == null) ? null : java.lang.Long.valueOf(minimumInMinutesFee.getMinFeeInCents()))).getFormattedTextString(), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer5, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        androidx.compose.ui.Modifier fillMaxWidth$default6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer5, 0);
                                                        int currentCompositeKeyHash15 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap15 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default6);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor15 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor15);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl15 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl15, rowMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl15, currentCompositionLocalMap15, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash15 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl15.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl15.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash15))) {
                                                            m5299constructorimpl15.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash15));
                                                            m5299constructorimpl15.apply(java.lang.Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl15, materializeModifier15, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance4 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                        androidx.compose.ui.Modifier weight$default5 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy8 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer5, 0);
                                                        int currentCompositeKeyHash16 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap16 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier16 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, weight$default5);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor16 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor16);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl16 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl16, columnMeasurePolicy8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl16, currentCompositionLocalMap16, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash16 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl16.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl16.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash16))) {
                                                            m5299constructorimpl16.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash16));
                                                            m5299constructorimpl16.apply(java.lang.Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl16, materializeModifier16, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance8 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, (feesConfiguration == null || (printedPayrollAndGovernmentChecks3 = feesConfiguration.getPrintedPayrollAndGovernmentChecks()) == null || (feeName2 = printedPayrollAndGovernmentChecks3.getFeeName()) == null) ? "" : feeName2, null, 0, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer5, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
                                                        java.lang.String str5 = (feesConfiguration == null || (printedPayrollAndGovernmentChecks2 = feesConfiguration.getPrintedPayrollAndGovernmentChecks()) == null || (feeDescription2 = printedPayrollAndGovernmentChecks2.getFeeDescription()) == null) ? "" : feeDescription2;
                                                        composer5.startReplaceGroup(1562962521);
                                                        if (!kotlin.text.StringsKt.isBlank(str5)) {
                                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str5, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer5, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
                                                        }
                                                        composer5.endReplaceGroup();
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        double d = -1.0d;
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.access$formatPercentDescription(captureCheckImagesViewProvider4, (feesConfiguration == null || (printedPayrollAndGovernmentChecks = feesConfiguration.getPrintedPayrollAndGovernmentChecks()) == null) ? -1.0d : printedPayrollAndGovernmentChecks.getFeeRateInPercent(), composer5, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable << 3), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer5, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        androidx.compose.ui.Modifier fillMaxWidth$default7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer5, 0);
                                                        int currentCompositeKeyHash17 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap17 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier17 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default7);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor17 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor17);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl17 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl17, rowMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl17, currentCompositionLocalMap17, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash17 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl17.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl17.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash17))) {
                                                            m5299constructorimpl17.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash17));
                                                            m5299constructorimpl17.apply(java.lang.Integer.valueOf(currentCompositeKeyHash17), setCompositeKeyHash17);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl17, materializeModifier17, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance5 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                        androidx.compose.ui.Modifier weight$default6 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance5, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy9 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer5, 0);
                                                        int currentCompositeKeyHash18 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap18 = composer5.getCurrentCompositionLocalMap();
                                                        androidx.compose.ui.Modifier materializeModifier18 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, weight$default6);
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor18 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor18);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m5299constructorimpl18 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl18, columnMeasurePolicy9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl18, currentCompositionLocalMap18, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash18 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5299constructorimpl18.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl18.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash18))) {
                                                            m5299constructorimpl18.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash18));
                                                            m5299constructorimpl18.apply(java.lang.Integer.valueOf(currentCompositeKeyHash18), setCompositeKeyHash18);
                                                        }
                                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl18, materializeModifier18, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance9 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, (feesConfiguration == null || (allOtherChecks3 = feesConfiguration.getAllOtherChecks()) == null || (feeName = allOtherChecks3.getFeeName()) == null) ? "" : feeName, null, 0, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer5, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
                                                        java.lang.String str6 = (feesConfiguration == null || (allOtherChecks2 = feesConfiguration.getAllOtherChecks()) == null || (feeDescription = allOtherChecks2.getFeeDescription()) == null) ? "" : feeDescription;
                                                        composer5.startReplaceGroup(-1496326054);
                                                        if (!kotlin.text.StringsKt.isBlank(str6)) {
                                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str6, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer5, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
                                                        }
                                                        composer5.endReplaceGroup();
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        if (feesConfiguration != null && (allOtherChecks = feesConfiguration.getAllOtherChecks()) != null) {
                                                            d = allOtherChecks.getFeeRateInPercent();
                                                        }
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance5, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.access$formatPercentDescription(captureCheckImagesViewProvider4, d, composer5, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable << 3), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer5, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                                        composer5.endNode();
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer5, 6);
                                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, (feesConfiguration == null || (loadAmountDisclaimer = feesConfiguration.getLoadAmountDisclaimer()) == null) ? "" : loadAmountDisclaimer, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer5, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), composer5, 6);
                                                        com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer5, 0);
                                                        composer5.endNode();
                                                        composer5.endNode();
                                                    } else {
                                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                                                    }
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer2, 805306374, 384, 3544);
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    androidx.compose.runtime.Composer composer4 = composer2;
                                    composer4.startReplaceGroup(1849434622);
                                    rememberedValue = composer4.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        composer4.updateRememberedValue(rememberedValue);
                                    }
                                    composer4.endReplaceGroup();
                                    mutableState5 = captureCheckImagesViewProvider.getOutputStallDurationlomOqCM;
                                    captureCheckImagesViewProvider2 = captureCheckImagesViewProvider;
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(((java.lang.Boolean) mutableState5.getValue()).booleanValue(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1915791944, z2, new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$2(captureCheckImagesViewProvider2, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue), composer4, 54), composer4, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                    composer4.startReplaceGroup(-29498744);
                                    mutableState6 = captureCheckImagesViewProvider2.isOutputSupportedForhNQ4ISI;
                                    if (((java.lang.Boolean) mutableState6.getValue()).booleanValue()) {
                                        mutableState7 = mutableState4;
                                        str = null;
                                        i = 0;
                                    } else {
                                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                                        mutableState10 = captureCheckImagesViewProvider2.isOutputSupportedForhNQ4ISI;
                                        str = null;
                                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, "showLocationDeniedDialog ".concat(java.lang.String.valueOf(mutableState10.getValue())), null, 2, null);
                                        mutableState7 = mutableState4;
                                        i = 0;
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.LocationDeniedDialog(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.this);
                                            }
                                        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, captureCheckImagesViewProvider2);
                                            }
                                        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, captureCheckImagesViewProvider2);
                                            }
                                        }, composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-29475225);
                                    mutableState8 = captureCheckImagesViewProvider2.toString;
                                    if (((java.lang.Boolean) mutableState8.getValue()).booleanValue()) {
                                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                                        mutableState9 = captureCheckImagesViewProvider2.toString;
                                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging2, "showLocationRationaleDialog ".concat(java.lang.String.valueOf(mutableState9.getValue())), str, 2, str);
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.LocationRationaleDialog(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.this);
                                            }
                                        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, captureCheckImagesViewProvider2);
                                            }
                                        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, captureCheckImagesViewProvider2);
                                            }
                                        }, composer4, i);
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-29447017);
                                    if (captureCheckImagesViewProvider2.getFailure().getValue() != null) {
                                        com.ingo.sdk.kotlin.common.core.exception.Failure value = captureCheckImagesViewProvider2.getFailure().getValue();
                                        if (value == null || (str2 = value.getCamera2StreamConfigurationMap()) == null) {
                                            str2 = "Error";
                                        }
                                        java.lang.String str4 = str2;
                                        com.ingo.sdk.kotlin.common.core.exception.Failure value2 = captureCheckImagesViewProvider2.getFailure().getValue();
                                        if (value2 == null || (str3 = value2.getGetHighSpeedVideoFpsRangesFor()) == null) {
                                            str3 = "There was an unknown error.";
                                        }
                                        java.lang.String str5 = str3;
                                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_retry, composer4, i);
                                        kotlin.jvm.functions.Function0<kotlin.Unit> value3 = captureCheckImagesViewProvider2.getRetryAction().getValue();
                                        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_dismiss, composer4, i);
                                        kotlin.jvm.functions.Function0<kotlin.Unit> value4 = captureCheckImagesViewProvider2.getFailureAction().getValue();
                                        composer4.startReplaceGroup(-29431288);
                                        if (value4 == null) {
                                            composer4.startReplaceGroup(1849434622);
                                            java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Object invoke() {
                                                        return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighResolutionOutputSizeshNQ4ISI();
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue3);
                                            }
                                            value4 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                            composer4.endReplaceGroup();
                                        }
                                        composer4.endReplaceGroup();
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoAlertDialog(null, str4, str5, stringResource5, value4, stringResource4, value3, composer4, 0, 1);
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endNode();
                                }
                            }
                        }
                        z = false;
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(stringResource3, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, captureCheckImagesViewProvider3);
                            }
                        }, z, false, false, 0, composer3, 0, 56);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
                        com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer3, 0);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.NavigationBarSpacer(null, composer3, 0, 1);
                        composer3.endNode();
                        composer3.startReplaceGroup(55416284);
                        booleanValue = ((java.lang.Boolean) mutableState14.getValue()).booleanValue();
                        if (booleanValue) {
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        androidx.compose.runtime.Composer composer42 = composer2;
                        composer42.startReplaceGroup(1849434622);
                        rememberedValue = composer42.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        composer42.endReplaceGroup();
                        mutableState5 = captureCheckImagesViewProvider.getOutputStallDurationlomOqCM;
                        captureCheckImagesViewProvider2 = captureCheckImagesViewProvider;
                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(((java.lang.Boolean) mutableState5.getValue()).booleanValue(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1915791944, z2, new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$2(captureCheckImagesViewProvider2, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue), composer42, 54), composer42, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        composer42.startReplaceGroup(-29498744);
                        mutableState6 = captureCheckImagesViewProvider2.isOutputSupportedForhNQ4ISI;
                        if (((java.lang.Boolean) mutableState6.getValue()).booleanValue()) {
                        }
                        composer42.endReplaceGroup();
                        composer42.startReplaceGroup(-29475225);
                        mutableState8 = captureCheckImagesViewProvider2.toString;
                        if (((java.lang.Boolean) mutableState8.getValue()).booleanValue()) {
                        }
                        composer42.endReplaceGroup();
                        composer42.startReplaceGroup(-29447017);
                        if (captureCheckImagesViewProvider2.getFailure().getValue() != null) {
                        }
                        composer42.endReplaceGroup();
                        composer42.endNode();
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                    }
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                }
            } else {
                composer3.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            androidx.compose.runtime.MutableState mutableState2;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mutableState.setValue(bool);
            mutableState2 = captureCheckImagesViewProvider.isOutputSupportedForhNQ4ISI;
            mutableState2.setValue(bool);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            androidx.compose.runtime.MutableState mutableState2;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mutableState.setValue(bool);
            mutableState2 = captureCheckImagesViewProvider.toString;
            mutableState2.setValue(bool);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            androidx.compose.runtime.MutableState mutableState2;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mutableState.setValue(bool);
            mutableState2 = captureCheckImagesViewProvider.isOutputSupportedForhNQ4ISI;
            mutableState2.setValue(bool);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState) {
            mutableState.setValue(java.lang.Boolean.valueOf(false));
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "DISMISS REQUEST", null, 2, null);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            kotlin.jvm.functions.Function0 function0;
            mutableState.setValue(java.lang.Boolean.TRUE);
            function0 = captureCheckImagesViewProvider.getOutputSizes;
            function0.invoke();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            androidx.compose.runtime.MutableState mutableState;
            kotlin.jvm.functions.Function0 function0;
            mutableState = captureCheckImagesViewProvider.isOutputSupportedForhNQ4ISI;
            mutableState.setValue(java.lang.Boolean.FALSE);
            function0 = captureCheckImagesViewProvider.getOutputSizeshNQ4ISI;
            function0.invoke();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            androidx.compose.runtime.MutableState mutableState2;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mutableState.setValue(bool);
            mutableState2 = captureCheckImagesViewProvider.toString;
            mutableState2.setValue(bool);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
            androidx.compose.runtime.MutableState mutableState;
            kotlin.jvm.functions.Function0 function0;
            mutableState = captureCheckImagesViewProvider.toString;
            mutableState.setValue(java.lang.Boolean.FALSE);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "LAUNCHING PERMISSION REQUEST", null, 2, null);
            function0 = captureCheckImagesViewProvider.getOutputMinFrameDuration;
            function0.invoke();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Dismiss Action Clicked But Empty", null, 2, null);
            return kotlin.Unit.INSTANCE;
        }

        CaptureCheckImagesViewProvider$View$3(com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider, androidx.compose.material3.SheetState sheetState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> mutableState2, androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> mutableState3, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4, kotlinx.coroutines.CoroutineScope coroutineScope) {
            this.getOutputFormats = captureCheckImagesViewProvider;
            this.getHighSpeedVideoSizes = sheetState;
            this.getHighSpeedVideoFpsRanges = mutableState;
            this.Camera2StreamConfigurationMap = mutableState2;
            this.getHighSpeedVideoFpsRangesFor = mutableState3;
            this.getOutputMinFrameDuration = mutableState4;
            this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        }
    }

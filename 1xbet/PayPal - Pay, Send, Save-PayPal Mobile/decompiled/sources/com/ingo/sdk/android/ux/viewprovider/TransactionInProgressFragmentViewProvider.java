package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/TransactionInProgressFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse;", "transactionInProgressResponse", "Lkotlin/Function0;", "", "navigateToVoidCheckUpload", "navigationClicked", "Landroidx/compose/runtime/MutableState;", "", "imageBytes", "<init>", "(Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoSizes", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionInProgressFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<byte[]> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionInProgressFragmentViewProvider(com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.MutableState<byte[]> mutableState) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionValidationErrorResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        this.getHighSpeedVideoFpsRanges = transactionValidationErrorResponse;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = function02;
        this.getHighSpeedVideoSizes = mutableState;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1382593859);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Transaction Details ".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges)), null, 2, null);
        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(30539271, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider$View$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                kotlin.jvm.functions.Function0 function0;
                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                androidx.compose.runtime.Composer composer3 = composer2;
                if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_transaction_details, composer3, 0);
                    function0 = com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider.this.Camera2StreamConfigurationMap;
                    currentTheme = com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider.this.currentTheme(composer3, 8);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(stringResource, function0, com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24, null, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor())), false, null, false, false, 0, composer3, 100859904, 712);
                }
                return kotlin.Unit.INSTANCE;
            }
        }, startRestartGroup, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, 8).getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1030745042, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider$View$2
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.MutableState mutableState;
                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse;
                androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse2;
                java.lang.String str;
                int i2;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse3;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse4;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse5;
                java.lang.String str2;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse6;
                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme2;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse7;
                kotlin.jvm.functions.Function0 function0;
                com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse transactionValidationErrorResponse8;
                androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                if ((intValue & 14) == 0) {
                    intValue |= composer3.changed(paddingValues2) ? 4 : 2;
                }
                if ((intValue & 91) != 18 || !composer3.getSkipping()) {
                    androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), paddingValues2);
                    com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider transactionInProgressFragmentViewProvider = com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider.this;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, padding);
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
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer3, 48);
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
                    androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR0);
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
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 6);
                    int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                        m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                        m5299constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    mutableState = transactionInProgressFragmentViewProvider.getHighSpeedVideoSizes;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.TransactionDetailsCheckImageView(mutableState, composer3, 0);
                    composer3.endNode();
                    int i3 = com.ingo.sdk.android.ux.R.drawable.ic_alert_status_icon;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), composer3, 6);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 6);
                    int currentCompositeKeyHash5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash5))) {
                        m5299constructorimpl5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash5));
                        m5299constructorimpl5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(i3, composer3, 0);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_status_icon_content_description, composer3, 0);
                    currentTheme = transactionInProgressFragmentViewProvider.currentTheme(composer3, 8);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(painterResource, stringResource, 55, android.graphics.Color.parseColor(currentTheme.getAlertColor()), null, false, null, composer3, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 112);
                    composer3.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), composer3, 6);
                    transactionValidationErrorResponse = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    java.lang.String title = transactionValidationErrorResponse.getTitle();
                    androidx.compose.ui.text.TextStyle titleLarge = com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getTitleLarge();
                    long m8070getFontSizeXSAIIZE = com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getTitleLarge().m8070getFontSizeXSAIIZE();
                    androidx.compose.ui.unit.TextUnitKt.m8808checkArithmeticR2X_6o(m8070getFontSizeXSAIIZE);
                    m8065copyp1EtxEg = titleLarge.m8065copyp1EtxEg((r48 & 1) != 0 ? titleLarge.spanStyle.m7982getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? titleLarge.spanStyle.getFontSize() : androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(m8070getFontSizeXSAIIZE), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(m8070getFontSizeXSAIIZE) * 0.95f), (r48 & 4) != 0 ? titleLarge.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? titleLarge.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? titleLarge.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? titleLarge.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? titleLarge.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? titleLarge.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? titleLarge.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? titleLarge.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? titleLarge.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? titleLarge.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? titleLarge.platformStyle : null, (r48 & 1048576) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? titleLarge.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? titleLarge.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), title, m8065copyp1EtxEg, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24582, 224);
                    composer3.startReplaceGroup(82984543);
                    transactionValidationErrorResponse2 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    if (kotlin.text.StringsKt.isBlank(transactionValidationErrorResponse2.getDetail())) {
                        str = "";
                        i2 = 1;
                    } else {
                        transactionValidationErrorResponse8 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                        str = "";
                        i2 = 1;
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), transactionValidationErrorResponse8.getDetail(), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer3, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    }
                    composer3.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), composer3, 6);
                    androidx.compose.ui.Modifier m1709paddingqDBjuR02 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                    int currentCompositeKeyHash6 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR02);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash6))) {
                        m5299constructorimpl6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash6));
                        m5299constructorimpl6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance3, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_transaction_id, composer3, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance3, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    int m8447getRighte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                    transactionValidationErrorResponse3 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    java.lang.String transactionReferenceNumber = transactionValidationErrorResponse3.getTransaction().getTransactionReferenceNumber();
                    transactionValidationErrorResponse4 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    java.lang.String substring = transactionReferenceNumber.substring(kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) transactionValidationErrorResponse4.getTransaction().getTransactionReferenceNumber(), "-", 0, false, 6, (java.lang.Object) null));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, str);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default, kotlin.text.StringsKt.replace$default(substring, "-", "", false, 4, (java.lang.Object) null), null, m8447getRighte0LSkKk, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    androidx.compose.ui.Modifier m1709paddingqDBjuR03 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                    int currentCompositeKeyHash7 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR03);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, rowMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash7))) {
                        m5299constructorimpl7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash7));
                        m5299constructorimpl7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance4 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_submitted, composer3, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                    transactionValidationErrorResponse5 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    java.lang.String checkSubmissionDateUTC = transactionValidationErrorResponse5.getTransaction().getCheckSubmissionDateUTC();
                    androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    int m8447getRighte0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                    java.util.Date date$default = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt.toDate$default(checkSubmissionDateUTC, null, null, 3, null);
                    if (date$default == null || (str2 = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt.formatTo$default(date$default, "MM/dd/yyyy", null, 2, null)) == null) {
                        str2 = checkSubmissionDateUTC;
                    }
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default2, str2, null, m8447getRighte0LSkKk2, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    androidx.compose.ui.Modifier m1709paddingqDBjuR04 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                    int currentCompositeKeyHash8 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR04);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, rowMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, currentCompositionLocalMap8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash8))) {
                        m5299constructorimpl8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash8));
                        m5299constructorimpl8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, materializeModifier8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance5 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance5, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_speed, composer3, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                    androidx.compose.ui.Modifier weight$default3 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance5, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    int m8447getRighte0LSkKk3 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                    transactionValidationErrorResponse6 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default3, transactionValidationErrorResponse6.getTransaction().getFundsTimingDescription(), null, m8447getRighte0LSkKk3, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)), composer3, 6);
                    androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f));
                    currentTheme2 = transactionInProgressFragmentViewProvider.currentTheme(composer3, 8);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(m1726height3ABfNKs, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme2.getSecondaryBackgroundColor())), null, 2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f)), composer3, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)), composer3, 6);
                    androidx.compose.ui.Modifier m1709paddingqDBjuR05 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy6 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                    int currentCompositeKeyHash9 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR05);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, rowMeasurePolicy6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, currentCompositionLocalMap9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl9.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl9.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash9))) {
                        m5299constructorimpl9.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash9));
                        m5299constructorimpl9.apply(java.lang.Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, materializeModifier9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance6 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance6, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_check_amount, composer3, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                    androidx.compose.ui.Modifier weight$default4 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance6, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    int m8447getRighte0LSkKk4 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                    transactionValidationErrorResponse7 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRanges;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default4, new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf(transactionValidationErrorResponse7.getTransaction().getCheckAmountInCents())).getFormattedTextString(), null, m8447getRighte0LSkKk4, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    composer3.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_void_check, composer3, 0);
                    function0 = transactionInProgressFragmentViewProvider.getHighSpeedVideoFpsRangesFor;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(stringResource2, function0, false, true, false, 0, composer3, 3072, 52);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
                    com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer3, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer3, 6);
                    composer3.endNode();
                    composer3.endNode();
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
        }, startRestartGroup, 54), startRestartGroup, 805306416, 444);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider.$r8$lambda$mxtpjW_oukEQX9CPehYlbGXvXBw(com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mxtpjW_oukEQX9CPehYlbGXvXBw(com.ingo.sdk.android.ux.viewprovider.TransactionInProgressFragmentViewProvider transactionInProgressFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        transactionInProgressFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

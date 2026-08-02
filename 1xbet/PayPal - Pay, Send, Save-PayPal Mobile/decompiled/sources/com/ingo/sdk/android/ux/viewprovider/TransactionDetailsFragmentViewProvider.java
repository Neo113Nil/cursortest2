package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/TransactionDetailsFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "details", "Lkotlin/Function0;", "", "navigateToCustomerService", "navigationClicked", "Landroidx/compose/runtime/MutableState;", "", "imageBytes", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionDetailsFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails getHighSpeedVideoSizes;
    private final androidx.compose.runtime.MutableState<byte[]> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDetailsFragmentViewProvider(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.MutableState<byte[]> mutableState) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        this.getHighSpeedVideoSizes = transactionDetails;
        this.getHighSpeedVideoFpsRanges = function0;
        this.Camera2StreamConfigurationMap = function02;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-928754089);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Transaction Details ".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes)), null, 2, null);
        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1876197915, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider$View$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                kotlin.jvm.functions.Function0 function0;
                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                androidx.compose.runtime.Composer composer3 = composer2;
                if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_transaction_details, composer3, 0);
                    function0 = com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider.this.Camera2StreamConfigurationMap;
                    currentTheme = com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider.this.currentTheme(composer3, 8);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(stringResource, function0, com.ingo.sdk.android.ux.R.drawable.ic_baseline_arrow_back_24, null, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor())), false, null, false, false, 0, composer3, 100859904, 712);
                }
                return kotlin.Unit.INSTANCE;
            }
        }, startRestartGroup, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, 8).getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-54565850, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider$View$2
            /* JADX WARN: Removed duplicated region for block: B:194:0x0f85  */
            /* JADX WARN: Type inference failed for: r15v10 */
            /* JADX WARN: Type inference failed for: r15v6 */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.lang.String, java.util.TimeZone] */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.MutableState mutableState;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails;
                com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider transactionDetailsFragmentViewProvider;
                ?? r15;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails2;
                androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails3;
                java.lang.String str;
                int i2;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails4;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails5;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails6;
                java.lang.String str2;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails7;
                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails8;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails9;
                com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider transactionDetailsFragmentViewProvider2;
                int i3;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails10;
                kotlin.jvm.functions.Function0 function0;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails11;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails12;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails13;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails14;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails15;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails16;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails17;
                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme2;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails18;
                int i4;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails19;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails20;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails21;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails22;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails23;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails24;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails25;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails26;
                com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails27;
                androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                if ((intValue & 14) == 0) {
                    intValue |= composer3.changed(paddingValues2) ? 4 : 2;
                }
                if ((intValue & 91) != 18 || !composer3.getSkipping()) {
                    androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), paddingValues2);
                    com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider transactionDetailsFragmentViewProvider3 = com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider.this;
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
                    androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer3, 48);
                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR0);
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
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, verticalScroll$default);
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
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
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
                    mutableState = transactionDetailsFragmentViewProvider3.getHighResolutionOutputSizeshNQ4ISI;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.TransactionDetailsCheckImageView(mutableState, composer3, 0);
                    composer3.endNode();
                    transactionDetails = transactionDetailsFragmentViewProvider3.getHighSpeedVideoSizes;
                    java.lang.Integer iconId = com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.getIconId(transactionDetails);
                    composer3.startReplaceGroup(-1561071467);
                    if (iconId != null) {
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
                        androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(iconId.intValue(), composer3, 0);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_status_icon_content_description, composer3, 0);
                        transactionDetails27 = transactionDetailsFragmentViewProvider3.getHighSpeedVideoSizes;
                        transactionDetailsFragmentViewProvider = transactionDetailsFragmentViewProvider3;
                        r15 = 0;
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(painterResource, stringResource, 55, com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.getColorForIcon(transactionDetails27, composer3, 8), null, false, null, composer3, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 112);
                        composer3.endNode();
                    } else {
                        transactionDetailsFragmentViewProvider = transactionDetailsFragmentViewProvider3;
                        r15 = 0;
                    }
                    composer3.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), composer3, 6);
                    transactionDetails2 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                    java.lang.String transactionStatusTitle = transactionDetails2.getTransactionStatusTitle();
                    androidx.compose.ui.text.TextStyle titleLarge = com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getTitleLarge();
                    long m8070getFontSizeXSAIIZE = com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getTitleLarge().m8070getFontSizeXSAIIZE();
                    androidx.compose.ui.unit.TextUnitKt.m8808checkArithmeticR2X_6o(m8070getFontSizeXSAIIZE);
                    m8065copyp1EtxEg = titleLarge.m8065copyp1EtxEg((r48 & 1) != 0 ? titleLarge.spanStyle.m7982getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? titleLarge.spanStyle.getFontSize() : androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(m8070getFontSizeXSAIIZE), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(m8070getFontSizeXSAIIZE) * 0.95f), (r48 & 4) != 0 ? titleLarge.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? titleLarge.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? titleLarge.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? titleLarge.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? titleLarge.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? titleLarge.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? titleLarge.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? titleLarge.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? titleLarge.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? titleLarge.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? titleLarge.platformStyle : null, (r48 & 1048576) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? titleLarge.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? titleLarge.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, r15), transactionStatusTitle, m8065copyp1EtxEg, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24582, 224);
                    composer3.startReplaceGroup(-1561013709);
                    transactionDetails3 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                    if (kotlin.text.StringsKt.isBlank(transactionDetails3.getTransactionStatusDescription())) {
                        str = "";
                        i2 = 1;
                    } else {
                        transactionDetails26 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                        str = "";
                        i2 = 1;
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, r15), transactionDetails26.getTransactionStatusDescription(), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer3, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    }
                    composer3.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), composer3, 6);
                    androidx.compose.ui.Modifier m1709paddingqDBjuR02 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
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
                    transactionDetails4 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                    java.lang.String transactionReferenceNumber = transactionDetails4.getTransactionReferenceNumber();
                    transactionDetails5 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                    java.lang.String substring = transactionReferenceNumber.substring(kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) transactionDetails5.getTransactionReferenceNumber(), "-", 0, false, 6, (java.lang.Object) null));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, str);
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default, kotlin.text.StringsKt.replace$default(substring, "-", "", false, 4, (java.lang.Object) null), null, m8447getRighte0LSkKk, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    androidx.compose.ui.Modifier m1709paddingqDBjuR03 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
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
                    transactionDetails6 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                    java.lang.String checkSubmissionDateUTC = transactionDetails6.getCheckDetails().getCheckSubmissionDateUTC();
                    androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    int m8447getRighte0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                    java.util.Date date$default = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt.toDate$default(checkSubmissionDateUTC, r15, r15, 3, r15);
                    if (date$default == null || (str2 = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt.formatTo$default(date$default, "MM/dd/yyyy", r15, 2, r15)) == null) {
                        str2 = checkSubmissionDateUTC;
                    }
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default2, str2, null, m8447getRighte0LSkKk2, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    androidx.compose.ui.Modifier m1709paddingqDBjuR04 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
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
                    transactionDetails7 = transactionDetailsFragmentViewProvider.getHighSpeedVideoSizes;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default3, transactionDetails7.getFundsTimingDescription(), null, m8447getRighte0LSkKk3, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)), composer3, 6);
                    androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f));
                    com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider transactionDetailsFragmentViewProvider4 = transactionDetailsFragmentViewProvider;
                    currentTheme = transactionDetailsFragmentViewProvider4.currentTheme(composer3, 8);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(m1726height3ABfNKs, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getSecondaryBackgroundColor())), null, 2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f)), composer3, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)), composer3, 6);
                    androidx.compose.ui.Modifier m1709paddingqDBjuR05 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
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
                    transactionDetails8 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default4, new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf(transactionDetails8.getCheckDetails().getCheckAmountInCents())).getFormattedTextString(), null, m8447getRighte0LSkKk4, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                    composer3.endNode();
                    composer3.startReplaceGroup(-1560819625);
                    transactionDetails9 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                    if (!transactionDetails9.getFundingDestinations().isEmpty()) {
                        transactionDetails11 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                        if (!transactionDetails11.isDeclined()) {
                            transactionDetails12 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                            if (!transactionDetails12.isVoidRequired()) {
                                androidx.compose.ui.Modifier m1709paddingqDBjuR06 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                int currentCompositeKeyHash10 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier10 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR06);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor10);
                                } else {
                                    composer3.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl10 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, rowMeasurePolicy7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, currentCompositionLocalMap10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl10.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl10.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash10))) {
                                    m5299constructorimpl10.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash10));
                                    m5299constructorimpl10.apply(java.lang.Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, materializeModifier10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance7 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                i3 = 0;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance7, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_fee, composer3, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                androidx.compose.ui.Modifier weight$default5 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance7, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                int m8447getRighte0LSkKk5 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_minus, composer3, 0);
                                transactionDetails13 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                java.lang.String formattedTextString = new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf(transactionDetails13.getCheckDetails().getCheckFeeAmountInCents())).getFormattedTextString();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(stringResource2);
                                sb.append(" ");
                                sb.append(formattedTextString);
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default5, sb.toString(), null, m8447getRighte0LSkKk5, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                                composer3.endNode();
                                composer3.startReplaceGroup(-1560776578);
                                transactionDetails14 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                if (!transactionDetails14.getFundingDestinations().isEmpty()) {
                                    transactionDetails23 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                    if (((com.ingo.sdk.kotlin.common.features.history.model.FundingDestination) kotlin.collections.CollectionsKt.first((java.util.List) transactionDetails23.getFundingDestinations())).getPromotionAmountInCents() > 0) {
                                        transactionDetails24 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                        if (!transactionDetails24.isVoidRequired()) {
                                            androidx.compose.ui.Modifier m1709paddingqDBjuR07 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy8 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                            int currentCompositeKeyHash11 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                                            androidx.compose.ui.Modifier materializeModifier11 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR07);
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor11 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor11);
                                            } else {
                                                composer3.useNode();
                                            }
                                            androidx.compose.runtime.Composer m5299constructorimpl11 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl11, rowMeasurePolicy8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl11, currentCompositionLocalMap11, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash11 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m5299constructorimpl11.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl11.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash11))) {
                                                m5299constructorimpl11.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash11));
                                                m5299constructorimpl11.apply(java.lang.Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                            }
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl11, materializeModifier11, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance8 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance8, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_promo_code_details, composer3, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                            androidx.compose.ui.Modifier weight$default6 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance8, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                            int m8447getRighte0LSkKk6 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_plus, composer3, 0);
                                            transactionDetails25 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                            java.lang.String formattedTextString2 = new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf(((com.ingo.sdk.kotlin.common.features.history.model.FundingDestination) kotlin.collections.CollectionsKt.first((java.util.List) transactionDetails25.getFundingDestinations())).getPromotionAmountInCents())).getFormattedTextString();
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            sb2.append(stringResource3);
                                            sb2.append(" ");
                                            sb2.append(formattedTextString2);
                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default6, sb2.toString(), null, m8447getRighte0LSkKk6, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                                            composer3.endNode();
                                        }
                                    }
                                }
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(-1560718021);
                                transactionDetails15 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                if (!transactionDetails15.isDeclined()) {
                                    transactionDetails20 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                    if (!transactionDetails20.isVoidRequired()) {
                                        transactionDetails21 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                        if (!transactionDetails21.isLoadFailed()) {
                                            androidx.compose.ui.Modifier m1709paddingqDBjuR08 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy9 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                            int currentCompositeKeyHash12 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                                            androidx.compose.ui.Modifier materializeModifier12 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR08);
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor12 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor12);
                                            } else {
                                                composer3.useNode();
                                            }
                                            androidx.compose.runtime.Composer m5299constructorimpl12 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl12, rowMeasurePolicy9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl12, currentCompositionLocalMap12, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash12 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m5299constructorimpl12.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl12.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash12))) {
                                                m5299constructorimpl12.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash12));
                                                m5299constructorimpl12.apply(java.lang.Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                                            }
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl12, materializeModifier12, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance9 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10647SecondaryText6ERogkM(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_total_funds, composer3, 0), null, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance9, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), composer3, 3072, 2);
                                            androidx.compose.ui.Modifier weight$default7 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance9, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                            int m8447getRighte0LSkKk7 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                                            transactionDetails22 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10647SecondaryText6ERogkM(new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf(((com.ingo.sdk.kotlin.common.features.history.model.FundingDestination) kotlin.collections.CollectionsKt.first((java.util.List) transactionDetails22.getFundingDestinations())).getAmountInCents())).getFormattedTextString(), null, weight$default7, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), m8447getRighte0LSkKk7, composer3, 3072, 2);
                                            composer3.endNode();
                                        }
                                    }
                                }
                                composer3.endReplaceGroup();
                                transactionDetails16 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                if (!transactionDetails16.isVoidRequired()) {
                                    transactionDetails17 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                    if (!transactionDetails17.isDeclined()) {
                                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                                        if (obj != null) {
                                            if (((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj).getIsFundingDestinationNameDisplayed()) {
                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)), composer3, 6);
                                                androidx.compose.ui.Modifier m1726height3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f));
                                                currentTheme2 = transactionDetailsFragmentViewProvider4.currentTheme(composer3, 8);
                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(m1726height3ABfNKs2, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme2.getSecondaryBackgroundColor())), null, 2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f)), composer3, 0);
                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)), composer3, 6);
                                                androidx.compose.ui.Modifier m1709paddingqDBjuR09 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i2, r15), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f));
                                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy10 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                                int currentCompositeKeyHash13 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                                                androidx.compose.ui.Modifier materializeModifier13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1709paddingqDBjuR09);
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor13 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor13);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                androidx.compose.runtime.Composer m5299constructorimpl13 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl13, rowMeasurePolicy10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl13, currentCompositionLocalMap13, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash13 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5299constructorimpl13.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl13.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash13))) {
                                                    m5299constructorimpl13.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash13));
                                                    m5299constructorimpl13.apply(java.lang.Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                                                }
                                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl13, materializeModifier13, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance10 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                androidx.compose.ui.Modifier weight$default8 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance10, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                                int m8446getLefte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk();
                                                transactionDetails18 = transactionDetailsFragmentViewProvider4.getHighSpeedVideoSizes;
                                                if (transactionDetails18.isCompleted()) {
                                                    composer3.startReplaceGroup(-888039050);
                                                    i4 = com.ingo.sdk.android.ux.R.string.ingo_money_added_to;
                                                } else {
                                                    composer3.startReplaceGroup(-888037358);
                                                    i4 = com.ingo.sdk.android.ux.R.string.ingo_add_money_to;
                                                }
                                                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, composer3, 0);
                                                composer3.endReplaceGroup();
                                                transactionDetailsFragmentViewProvider2 = transactionDetailsFragmentViewProvider4;
                                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default8, stringResource4, null, m8446getLefte0LSkKk, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer3, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                                androidx.compose.ui.Modifier weight$default9 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance10, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                                int m8447getRighte0LSkKk8 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk();
                                                transactionDetails19 = transactionDetailsFragmentViewProvider2.getHighSpeedVideoSizes;
                                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(weight$default9, ((com.ingo.sdk.kotlin.common.features.history.model.FundingDestination) kotlin.collections.CollectionsKt.first((java.util.List) transactionDetails19.getFundingDestinations())).getAccountNickname(), null, m8447getRighte0LSkKk8, null, 0, 0L, 0, composer3, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                                                composer3.endNode();
                                                composer3.endReplaceGroup();
                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer3, i3);
                                                composer3.startReplaceGroup(-1560568931);
                                                transactionDetails10 = transactionDetailsFragmentViewProvider2.getHighSpeedVideoSizes;
                                                if (transactionDetails10.isLoadFailed()) {
                                                    java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_customer_support, composer3, i3);
                                                    function0 = transactionDetailsFragmentViewProvider2.getHighSpeedVideoFpsRanges;
                                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.TertiaryButton(stringResource5, function0, false, true, 0, 0, composer3, 3072, 52);
                                                }
                                                composer3.endReplaceGroup();
                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer3, 6);
                                                com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer3, i3);
                                                composer3.endNode();
                                                composer3.endNode();
                                                composer3.endNode();
                                            }
                                        } else {
                                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                                        }
                                    }
                                }
                                transactionDetailsFragmentViewProvider2 = transactionDetailsFragmentViewProvider4;
                                composer3.endReplaceGroup();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer3, i3);
                                composer3.startReplaceGroup(-1560568931);
                                transactionDetails10 = transactionDetailsFragmentViewProvider2.getHighSpeedVideoSizes;
                                if (transactionDetails10.isLoadFailed()) {
                                }
                                composer3.endReplaceGroup();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer3, 6);
                                com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer3, i3);
                                composer3.endNode();
                                composer3.endNode();
                                composer3.endNode();
                            }
                        }
                    }
                    transactionDetailsFragmentViewProvider2 = transactionDetailsFragmentViewProvider4;
                    i3 = 0;
                    composer3.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer3, i3);
                    composer3.startReplaceGroup(-1560568931);
                    transactionDetails10 = transactionDetailsFragmentViewProvider2.getHighSpeedVideoSizes;
                    if (transactionDetails10.isLoadFailed()) {
                    }
                    composer3.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer3, 6);
                    com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer3, i3);
                    composer3.endNode();
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider.m10758$r8$lambda$3Zmat38I1ohZchxq4OeHr7Dcu0(com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3Zmat38I1ohZchxq4OeHr7Dcu-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10758$r8$lambda$3Zmat38I1ohZchxq4OeHr7Dcu0(com.ingo.sdk.android.ux.viewprovider.TransactionDetailsFragmentViewProvider transactionDetailsFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        transactionDetailsFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

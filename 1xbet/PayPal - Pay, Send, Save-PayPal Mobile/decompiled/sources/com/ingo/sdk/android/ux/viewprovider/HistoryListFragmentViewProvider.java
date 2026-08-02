package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u001b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R)\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006!"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/HistoryListFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "initializingList", "Landroidx/compose/runtime/MutableState;", "", "mutableListState", "", "Lcom/ingo/sdk/android/ux/viewprovider/DateHeaderCell;", "", "Lcom/ingo/sdk/android/ux/viewprovider/HistoryCell;", "onNavigationClick", "Lkotlin/Function0;", "", "onTransactionCellClicked", "Lkotlin/Function1;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "onListScrolledToEnd", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getInitializingList", "()Landroidx/compose/runtime/MutableState;", "getMutableListState", "getOnNavigationClick", "()Lkotlin/jvm/functions/Function0;", "getOnTransactionCellClicked", "()Lkotlin/jvm/functions/Function1;", "getOnListScrolledToEnd", "View", "(Landroidx/compose/runtime/Composer;I)V", "divider", "width", "", "(Lcom/ingo/sdk/android/ux/viewprovider/HistoryListFragmentViewProvider;FLandroidx/compose/runtime/Composer;II)V", "androidSdkUx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HistoryListFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;
    private final androidx.compose.runtime.MutableState<java.util.Map<com.ingo.sdk.android.ux.viewprovider.DateHeaderCell, java.util.List<com.ingo.sdk.android.ux.viewprovider.HistoryCell>>> Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getInitializingList() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.compose.runtime.MutableState<java.util.Map<com.ingo.sdk.android.ux.viewprovider.DateHeaderCell, java.util.List<com.ingo.sdk.android.ux.viewprovider.HistoryCell>>> getMutableListState() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNavigationClick() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails, kotlin.Unit> getOnTransactionCellClicked() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnListScrolledToEnd() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HistoryListFragmentViewProvider(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.util.Map<com.ingo.sdk.android.ux.viewprovider.DateHeaderCell, java.util.List<com.ingo.sdk.android.ux.viewprovider.HistoryCell>>> mutableState2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.Camera2StreamConfigurationMap = mutableState2;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = function02;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(441298687);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
            if (obj != null) {
                com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1864060733, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                        androidx.compose.runtime.Composer composer3 = composer2;
                        if ((num.intValue() & 11) != 2 || !composer3.getSkipping()) {
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "RECOMPOSE ".concat(java.lang.String.valueOf(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this.getMutableListState())), null, 2, null);
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "RECOMPOSE ".concat(java.lang.String.valueOf(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this.getMutableListState().getValue())), null, 2, null);
                            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE);
                            currentTheme = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                            long Color = androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor()));
                            final com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this;
                            androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(imePadding, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-638662521, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                    androidx.compose.runtime.Composer composer5 = composer4;
                                    if ((num2.intValue() & 11) != 2 || !composer5.getSkipping()) {
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_history_list_check_status, composer5, 0), com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this.getOnNavigationClick(), 0, null, 0L, false, null, false, false, 0, composer5, 100859904, 732);
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }, composer3, 54), null, null, null, 0, Color, 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(632390546, true, new com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1.AnonymousClass2(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this), composer3, 54), composer3, 805306416, 444);
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                        final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider getHighSpeedVideoFpsRanges;

                        /* JADX WARN: Type inference failed for: r7v2 */
                        /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r7v6 */
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                            com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider;
                            ?? r7;
                            androidx.compose.ui.Modifier modifier;
                            androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                            androidx.compose.runtime.Composer composer2 = composer;
                            int intValue = num.intValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                            if ((intValue & 14) == 0) {
                                intValue |= composer2.changed(paddingValues2) ? 4 : 2;
                            }
                            if ((intValue & 91) != 18 || !composer2.getSkipping()) {
                                androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), paddingValues2);
                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                final com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider2 = this.getHighSpeedVideoFpsRanges;
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, padding);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                    m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                    m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                                if (!historyListFragmentViewProvider2.getInitializingList().getValue().booleanValue() && historyListFragmentViewProvider2.getMutableListState().getValue().isEmpty()) {
                                    composer2.startReplaceGroup(-1211410992);
                                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                        m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                        m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "No Activity", null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 54, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                    historyListFragmentViewProvider = historyListFragmentViewProvider2;
                                    modifier = null;
                                    r7 = 0;
                                } else {
                                    composer2.startReplaceGroup(-1210625762);
                                    historyListFragmentViewProvider = historyListFragmentViewProvider2;
                                    androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), rememberLazyListState, null, false, null, null, null, false, null, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0274: INVOKE 
                                          (wrap:androidx.compose.ui.Modifier:0x0258: INVOKE 
                                          (r3v7 'columnScopeInstance' androidx.compose.foundation.layout.ColumnScopeInstance)
                                          (wrap:androidx.compose.ui.Modifier$Companion:0x024e: SGET  A[WRAPPED] (LINE:2103) androidx.compose.ui.Modifier.Companion androidx.compose.ui.Modifier$Companion)
                                          (1.0f float)
                                          false
                                          (2 int)
                                          (null java.lang.Object)
                                         STATIC call: androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScope, androidx.compose.ui.Modifier, float, boolean, int, java.lang.Object):androidx.compose.ui.Modifier A[MD:(androidx.compose.foundation.layout.ColumnScope, androidx.compose.ui.Modifier, float, boolean, int, java.lang.Object):androidx.compose.ui.Modifier (m), WRAPPED] (LINE:2103))
                                          (r0v12 'rememberLazyListState' androidx.compose.foundation.lazy.LazyListState)
                                          (null androidx.compose.foundation.layout.PaddingValues)
                                          false
                                          (null androidx.compose.foundation.layout.Arrangement$Vertical)
                                          (null androidx.compose.ui.Alignment$Horizontal)
                                          (null androidx.compose.foundation.gestures.FlingBehavior)
                                          false
                                          (null androidx.compose.foundation.OverscrollEffect)
                                          (wrap:kotlin.jvm.functions.Function1:0x0265: CONSTRUCTOR 
                                          (r10v0 'historyListFragmentViewProvider2' com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider A[DONT_INLINE])
                                         A[MD:(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider):void (m), WRAPPED] (LINE:2102) call: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider):void type: CONSTRUCTOR)
                                          (r14v1 'composer2' androidx.compose.runtime.Composer)
                                          (0 int)
                                          (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT int)
                                         STATIC call: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void A[MD:(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>, androidx.compose.runtime.Composer, int, int):void (m)] (LINE:2102) in method: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1.2.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                                        	... 27 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 891
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1.AnonymousClass2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                }

                                public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(final com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
                                    for (java.util.Map.Entry<com.ingo.sdk.android.ux.viewprovider.DateHeaderCell, java.util.List<com.ingo.sdk.android.ux.viewprovider.HistoryCell>> entry : historyListFragmentViewProvider.getMutableListState().getValue().entrySet()) {
                                        final com.ingo.sdk.android.ux.viewprovider.DateHeaderCell key = entry.getKey();
                                        final java.util.List<com.ingo.sdk.android.ux.viewprovider.HistoryCell> value = entry.getValue();
                                        androidx.compose.foundation.lazy.LazyListScope.stickyHeader$default(lazyListScope, (java.lang.Object) null, (java.lang.Object) null, (kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-71220746, true, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: INVOKE 
                                              (r11v0 'lazyListScope' androidx.compose.foundation.lazy.LazyListScope)
                                              (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
                                              (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
                                              (wrap:kotlin.jvm.functions.Function4:?: CAST (kotlin.jvm.functions.Function4) (wrap:androidx.compose.runtime.internal.ComposableLambda:0x003a: INVOKE 
                                              (-71220746 int)
                                              true
                                              (wrap:kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0033: CONSTRUCTOR 
                                              (r10v0 'historyListFragmentViewProvider' com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider A[DONT_INLINE])
                                              (r2v1 'key' com.ingo.sdk.android.ux.viewprovider.DateHeaderCell A[DONT_INLINE])
                                             A[MD:(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider, com.ingo.sdk.android.ux.viewprovider.DateHeaderCell):void (m), WRAPPED] (LINE:1107) call: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$1$1$2$1$1.<init>(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider, com.ingo.sdk.android.ux.viewprovider.DateHeaderCell):void type: CONSTRUCTOR)
                                             STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:1107)))
                                              (3 int)
                                              (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
                                             STATIC call: androidx.compose.foundation.lazy.LazyListScope.stickyHeader$default(androidx.compose.foundation.lazy.LazyListScope, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function4, int, java.lang.Object):void A[MD:(androidx.compose.foundation.lazy.LazyListScope, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function4, int, java.lang.Object):void (m)] (LINE:1107) in method: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1.2.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider, androidx.compose.foundation.lazy.LazyListScope):kotlin.Unit, file: classes9.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$1$1$2$1$1, state: NOT_LOADED
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
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 21 more
                                            */
                                        /*
                                            java.lang.String r0 = ""
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                                            androidx.compose.runtime.MutableState r0 = r10.getMutableListState()
                                            java.lang.Object r0 = r0.getValue()
                                            java.util.Map r0 = (java.util.Map) r0
                                            java.util.Set r0 = r0.entrySet()
                                            java.util.Iterator r0 = r0.iterator()
                                        L17:
                                            boolean r1 = r0.hasNext()
                                            if (r1 == 0) goto L69
                                            java.lang.Object r1 = r0.next()
                                            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                                            java.lang.Object r2 = r1.getKey()
                                            com.ingo.sdk.android.ux.viewprovider.DateHeaderCell r2 = (com.ingo.sdk.android.ux.viewprovider.DateHeaderCell) r2
                                            java.lang.Object r1 = r1.getValue()
                                            java.util.List r1 = (java.util.List) r1
                                            r4 = 0
                                            r5 = 0
                                            com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$1$1$2$1$1 r3 = new com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$1$1$2$1$1
                                            r3.<init>(r10, r2)
                                            r2 = -71220746(0xfffffffffbc141f6, float:-2.0069023E36)
                                            r9 = 1
                                            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r2, r9, r3)
                                            r6 = r2
                                            kotlin.jvm.functions.Function4 r6 = (kotlin.jvm.functions.Function4) r6
                                            r7 = 3
                                            r8 = 0
                                            r3 = r11
                                            androidx.compose.foundation.lazy.LazyListScope.stickyHeader$default(r3, r4, r5, r6, r7, r8)
                                            com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$1 r2 = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$1.INSTANCE
                                            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                                            int r3 = r1.size()
                                            com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$3 r4 = new com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$3
                                            r4.<init>(r2, r1)
                                            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                                            com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$4 r2 = new com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$4
                                            r2.<init>(r1, r10)
                                            r1 = -632812321(0xffffffffda480cdf, float:-1.4077287E16)
                                            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r9, r2)
                                            kotlin.jvm.functions.Function4 r1 = (kotlin.jvm.functions.Function4) r1
                                            r2 = 0
                                            r11.items(r3, r2, r4, r1)
                                            goto L17
                                        L69:
                                            kotlin.Unit r10 = kotlin.Unit.INSTANCE
                                            return r10
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$View$1.AnonymousClass2.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider, androidx.compose.foundation.lazy.LazyListScope):kotlin.Unit");
                                    }

                                    AnonymousClass2(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider) {
                                        this.getHighSpeedVideoFpsRanges = historyListFragmentViewProvider;
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.m10746$r8$lambda$KFqACIYDErrwgCTUwGnTlFVdik(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void getHighResolutionOutputSizeshNQ4ISI(final com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
                    int i3;
                    androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-69267085);
                    if ((Integer.MIN_VALUE & i2) != 0) {
                        i3 = i | 6;
                    } else if ((i & 14) == 0) {
                        i3 = (startRestartGroup.changed(historyListFragmentViewProvider) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    int i4 = i2 & 1;
                    if (i4 != 0) {
                        i3 |= 48;
                    } else if ((i & 112) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 32 : 16;
                    }
                    if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            f = 1.0f;
                        }
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, f), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f)), androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(historyListFragmentViewProvider.currentTheme(startRestartGroup, (i3 & 14) | com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable).getSecondaryBackgroundColor())), null, 2, null), startRestartGroup, 0);
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    final float f2 = f;
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.$r8$lambda$2Q9ZHz5DyKn4CNm88nSeOr2AsKw(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.this, historyListFragmentViewProvider, f2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                    }
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$2Q9ZHz5DyKn4CNm88nSeOr2AsKw(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider, com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider2, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
                    historyListFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI(historyListFragmentViewProvider2, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$KFqACIYDErrwgCTUw-GnTlFVdik, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m10746$r8$lambda$KFqACIYDErrwgCTUwGnTlFVdik(com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider historyListFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
                    historyListFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }
            }

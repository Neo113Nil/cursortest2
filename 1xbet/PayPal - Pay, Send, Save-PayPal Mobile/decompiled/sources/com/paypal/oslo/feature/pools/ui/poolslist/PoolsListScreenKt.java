package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a§\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2K\u0010\n\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001ao\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u000728\b\u0002\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0001¢\u0006\u0002\u0010!\u001aR\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0002\b'H\u0001¢\u0006\u0002\u0010(\u001a]\u0010)\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u000726\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u001fH\u0001¢\u0006\u0002\u0010*\u001a\"\u0010+\u001a\u00020\u0003*\u00020,2\u0006\u0010-\u001a\u00020$2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0000\u001a\r\u0010/\u001a\u00020\u0003H\u0001¢\u0006\u0002\u00100\u001a\u001b\u00101\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0001¢\u0006\u0002\u00102\u001a#\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0001¢\u0006\u0002\u00105\u001a-\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010<\u001a(\u0010=\u001a\u00020>2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0001H\u0000\u001a\r\u0010?\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u0010@\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006A²\u0006\n\u0010B\u001a\u00020CX\u008a\u0084\u0002"}, d2 = {"PoolProgressMaxValue", "", "PoolsListScreen", "", "navResultManager", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListViewModel;", "onPoolClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "poolId", "poolCreatorAccountId", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "onError", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "errorNavArgs", "onDismiss", "Lkotlin/Function0;", "(Lcom/paypal/oslo/core/navigation/result/NavResultManager;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListViewModel;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PoolsListContent", "poolsPagingItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "onCardClick", "Lkotlin/Function2;", "onLoadError", "(Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PoolsListRefreshStateHandler", "refreshLoadState", "Landroidx/paging/LoadState;", "onListDisplay", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/paging/LoadState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PoolsList", "(Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "poolsListAppendStateHandler", "Landroidx/compose/foundation/lazy/LazyListScope;", "appendLoadState", "onRetry", "PoolsListAppendLoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "PoolsListAppendErrorContent", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PoolCardDetails", "pool", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PoolCardContributionProgress", "totalContributionAmount", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "targetAmount", "currencySymbol", "progressPercentage", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "getPoolCardFooter", "Lcom/paypal/pds/components/FooterConfig;", "PoolsListPreview", "LoadMoreErrorPreview", "pools_prodRelease", "uiState", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsListScreenKt {
    public static final float PoolProgressMaxValue = 100.0f;

    /* JADX WARN: Removed duplicated region for block: B:140:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PoolsListScreen(final com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super com.paypal.oslo.feature.pools.domain.models.PoolUserRole, kotlin.Unit> function3, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.ui.Modifier modifier5;
        final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel5;
        androidx.compose.ui.Modifier modifier6;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1108312256);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(navResultManager) : startRestartGroup.changedInstance(navResultManager) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    poolsListViewModel2 = poolsListViewModel;
                    if (startRestartGroup.changedInstance(poolsListViewModel2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    poolsListViewModel2 = poolsListViewModel;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                poolsListViewModel2 = poolsListViewModel;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    poolsListViewModel4 = poolsListViewModel2;
                    i5 = 2048;
                    modifier4 = modifier2;
                    i4 = 16384;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
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
                        androidx.view.viewmodel.CreationExtras creationExtras = empty;
                        i4 = 16384;
                        i5 = 2048;
                        poolsListViewModel2 = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, creationExtras, startRestartGroup, 0, 0);
                        i3 &= -897;
                    } else {
                        i4 = 16384;
                        i5 = 2048;
                    }
                    com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel6 = poolsListViewModel2;
                    modifier4 = companion;
                    poolsListViewModel4 = poolsListViewModel6;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1108312256, i3, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreen (PoolsListScreen.kt:101)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(poolsListViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.String errorResultRequestId = poolsListViewModel4.getErrorResultRequestId();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(poolsListViewModel4);
                boolean z = (i3 & 7168) == i5;
                boolean z2 = (57344 & i3) == i4;
                boolean changed = startRestartGroup.changed(errorResultRequestId);
                int i8 = i3;
                com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (((z | changedInstance | z2) || changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    modifier5 = modifier4;
                    poolsListViewModel5 = poolsListViewModel4;
                    composer2 = startRestartGroup;
                    rememberedValue = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$1$1(poolsListViewModel4, function3, function1, errorResultRequestId, null);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    poolsListViewModel5 = poolsListViewModel4;
                    modifier5 = modifier4;
                    composer2 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                boolean changedInstance2 = composer2.changedInstance(poolsListViewModel5);
                boolean z3 = (i8 & 458752) == 131072;
                com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1 rememberedValue2 = composer2.rememberedValue();
                if ((changedInstance2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$2$1(poolsListViewModel5, function0, null);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                int i9 = (com.paypal.oslo.core.navigation.result.NavResultManager.$stable << 3) | ((i8 << 3) & 112);
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, composer2, (i9 >> 3) & 14);
                com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m17696invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m17696invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(errorResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, composer2, (i9 & 14) | 3072 | (i9 & 896));
                com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState poolsListState = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState) collectAsStateWithLifecycle.getValue();
                if (poolsListState instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Initial) {
                    composer2.startReplaceGroup(1979408034);
                    androidx.compose.ui.Modifier modifier7 = modifier5;
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, background);
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
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.pools.ui.poolslist.PoolsListShimmerScreenKt.PoolsListShimmerScreen(null, composer2, 0, 1);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    modifier6 = modifier7;
                } else {
                    androidx.compose.ui.Modifier modifier8 = modifier5;
                    if (poolsListState instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Success) {
                        composer2.startReplaceGroup(1979678230);
                        final androidx.paging.compose.LazyPagingItems collectAsLazyPagingItems = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(poolsListViewModel5.getPoolsPagingData(), null, composer2, 0, 1);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        boolean changedInstance3 = composer2.changedInstance(poolsListViewModel5);
                        boolean changedInstance4 = composer2.changedInstance(collectAsLazyPagingItems);
                        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$4$1 rememberedValue4 = composer2.rememberedValue();
                        if ((changedInstance3 | changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$4$1(poolsListViewModel5, collectAsLazyPagingItems, null);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 6);
                        boolean changedInstance5 = composer2.changedInstance(poolsListViewModel5);
                        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$5$1 rememberedValue5 = composer2.rememberedValue();
                        if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListScreen$5$1(poolsListViewModel5);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue5);
                        boolean changedInstance6 = composer2.changedInstance(poolsListViewModel5);
                        boolean changedInstance7 = composer2.changedInstance(collectAsLazyPagingItems);
                        java.lang.Object rememberedValue6 = composer2.rememberedValue();
                        if ((changedInstance6 | changedInstance7) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$UX2HGmyAdfuQD1fT3mQ6t8zOdAs(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel.this, collectAsLazyPagingItems);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        modifier6 = modifier8;
                        PoolsListContent(collectAsLazyPagingItems, modifier8, function22, (kotlin.jvm.functions.Function0) rememberedValue6, composer2, androidx.paging.compose.LazyPagingItems.$stable | (i8 & 112), 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(63850767);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                poolsListViewModel3 = poolsListViewModel5;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                poolsListViewModel3 = poolsListViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$8Gfu1LL0h648vI9C0UtydGsDoTc(com.paypal.oslo.core.navigation.result.NavResultManager.this, modifier3, poolsListViewModel3, function3, function1, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PoolsListContent(final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.pools.domain.models.Pool> lazyPagingItems, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-951866255);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function23 = function22;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda21
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$P1OilvaXtutkp77V4na6DZpAQ_g((java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                        } else {
                            function24 = function22;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda22
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function03 = function02;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-951866255, i3, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListContent (PoolsListScreen.kt:162)");
                        }
                        androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.paging.LoadState refresh = lazyPagingItems.getLoadState().getRefresh();
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.m17694$r8$lambda$_pd8gcslNOLMmpQuVUw33UrC_c();
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        PoolsListRefreshStateHandler(refresh, weight$default, (kotlin.jvm.functions.Function0) rememberedValue3, function03, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(975585181, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$3PrkUTPGNKOyqc6PCkO4mCJUDfY(androidx.paging.compose.LazyPagingItems.this, function24, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 7168) | 24960, 0);
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function23 = function24;
                        function02 = function03;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function02;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda25
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$ZqMbvV87BP__v4p86BGlpcJjseQ(androidx.paging.compose.LazyPagingItems.this, modifier3, function23, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PoolsListRefreshStateHandler(final androidx.paging.LoadState loadState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-469003224);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(loadState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-469003224, i3, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListRefreshStateHandler (PoolsListScreen.kt:207)");
                        }
                        if (loadState instanceof androidx.paging.LoadState.Loading) {
                            startRestartGroup.startReplaceGroup(-546156766);
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListShimmerScreenKt.PoolsListShimmerScreen(null, startRestartGroup, 0, 1);
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceGroup();
                        } else if (!(loadState instanceof androidx.paging.LoadState.Error)) {
                            startRestartGroup.startReplaceGroup(-545884865);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            boolean z = (i3 & 896) == 256;
                            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListRefreshStateHandler$5$1 rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListRefreshStateHandler$5$1(function03, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 12) & 14));
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-546006540);
                            boolean z2 = (i3 & 7168) == 2048;
                            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListRefreshStateHandler$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$PoolsListRefreshStateHandler$4$1(function04, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(loadState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, i3 & 14);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function03;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function04;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$IiDdObfEPqZBsj7i2TXVSGjEYDo(androidx.paging.LoadState.this, modifier3, function05, function06, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function04 = function02;
                if ((i & 24576) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                final kotlin.jvm.functions.Function0 function052 = function03;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function04 = function02;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            final kotlin.jvm.functions.Function0 function0522 = function03;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function04 = function02;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        final kotlin.jvm.functions.Function0 function05222 = function03;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PoolsList(final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.pools.domain.models.Pool> lazyPagingItems, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(728387632);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(728387632, i3, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsList (PoolsListScreen.kt:238)");
                }
                boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(lazyPagingItems));
                boolean z2 = (i3 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.m17693$r8$lambda$W8GmJzKNRsP5a9f_fcn5vc9pIg(androidx.paging.compose.LazyPagingItems.this, function2, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i3 >> 3) & 14, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$_ddwI372FyR33bdyUMjmfcSFF8s(androidx.paging.compose.LazyPagingItems.this, modifier4, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void poolsListAppendStateHandler(androidx.compose.foundation.lazy.LazyListScope lazyListScope, androidx.paging.LoadState loadState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (loadState instanceof androidx.paging.LoadState.Loading) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, com.paypal.oslo.feature.pools.constants.PoolsConstants.UI.LOADING_MORE_KEY, null, com.paypal.oslo.feature.pools.ui.poolslist.ComposableSingletons$PoolsListScreenKt.INSTANCE.m17681getLambda$365696716$pools_prodRelease(), 2, null);
        } else if (loadState instanceof androidx.paging.LoadState.Error) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, com.paypal.oslo.feature.pools.constants.PoolsConstants.UI.ERROR_MORE_KEY, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-160473891, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.m17690$r8$lambda$9oOyxCtvOCpmluo0wdph1aQ(kotlin.jvm.functions.Function0.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 2, null);
        }
    }

    public static final void PoolsListAppendLoadingContent(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1400987960);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1400987960, i, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListAppendLoadingContent (PoolsListScreen.kt:292)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.m17691$r8$lambda$Dd0njxma1jcR0XQ3RPd00Ekwlk(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PoolsListAppendErrorContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2140090016);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2140090016, i2, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListAppendErrorContent (PoolsListScreen.kt:311)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_error_load_more_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_error_load_more_refresh_button, startRestartGroup, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, startRestartGroup, (i2 & 14) | 1769472, 412);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$Um06YmwrzmG7zLYjyuqUy5tfVH0(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PoolCardDetails(final com.paypal.oslo.feature.pools.domain.models.Pool pool, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1332331526);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1332331526, i2, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolCardDetails (PoolsListScreen.kt:340)");
            }
            boolean changed = startRestartGroup.changed(pool.getTotalContributionAmount().getCurrencyCode());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = com.paypal.oslo.feature.pools.ui.common.PoolsUtils.INSTANCE.getCurrencySymbol(pool.getTotalContributionAmount().getCurrencyCode());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final java.lang.String str = (java.lang.String) rememberedValue;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            com.paypal.pds.core.Color.BackgroundContainerOutlined backgroundContainerOutlined = com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE;
            com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
            com.paypal.pds.components.FooterConfig poolCardFooter = (pool.getTargetAmount() == null || pool.isClosed()) ? null : getPoolCardFooter(pool.getTotalContributionAmount(), pool.getTargetAmount(), str, pool.getProgressPercentage());
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$WhqyrX9ztMW4CRaNn_zikPOfMGs(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(m1710paddingqDBjuR0$default, backgroundContainerOutlined, (androidx.compose.ui.graphics.painter.Painter) null, outlined, (com.paypal.pds.components.HeaderConfig) null, poolCardFooter, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue2, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-761518, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$lDw_PjHVb7Y5KJzbvBiw8cVNakc(com.paypal.oslo.feature.pools.domain.models.Pool.this, str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 48 | (com.paypal.pds.components.FooterConfig.$stable << 15), 6, 916);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$dCS_Qegr7AX6XWIFX353cPaf8gE(com.paypal.oslo.feature.pools.domain.models.Pool.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PoolCardContributionProgress(final com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, final com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, final java.lang.String str, final float f, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(731961936);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(poolAmount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(poolAmount2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(731961936, i2, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolCardContributionProgress (PoolsListScreen.kt:434)");
            }
            java.lang.String currencyFormatOptionalDecimals = com.paypal.oslo.feature.pools.ui.common.PoolsUtils.INSTANCE.toCurrencyFormatOptionalDecimals(poolAmount.getValue());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(currencyFormatOptionalDecimals);
            java.lang.String obj = sb.toString();
            java.lang.String currencyFormatOptionalDecimals2 = com.paypal.oslo.feature.pools.ui.common.PoolsUtils.INSTANCE.toCurrencyFormatOptionalDecimals(poolAmount2.getValue());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(currencyFormatOptionalDecimals2);
            java.lang.String obj2 = sb2.toString();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ProgressBarKt.ProgressBar(100.0f, f, null, com.paypal.pds.components.ProgressBarStyle.Info.INSTANCE, 0, 0, 0L, null, startRestartGroup, ((i2 >> 6) & 112) | 3078, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_contributed_amount, new java.lang.Object[]{obj, obj2}, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1018);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$Afa_gySy4ogV8cdM0xfDugPOwgc(com.paypal.oslo.feature.pools.domain.models.PoolAmount.this, poolAmount2, str, f, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final com.paypal.pds.components.FooterConfig getPoolCardFooter(final com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, final com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, final java.lang.String str, final float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.pds.components.FooterConfig(null, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-539928803, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$IXRoGbEI5mspjbhfh5_qN5sJCfM(com.paypal.oslo.feature.pools.domain.models.PoolAmount.this, poolAmount2, str, f, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), null, 95, null);
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$1mq7lVd_OSjU7NmHnfoXNd0EakI(androidx.paging.compose.LazyPagingItems lazyPagingItems, int i) {
        java.lang.String id;
        com.paypal.oslo.feature.pools.domain.models.Pool pool = (com.paypal.oslo.feature.pools.domain.models.Pool) lazyPagingItems.peek(i);
        return (pool == null || (id = pool.getId()) == null) ? java.lang.Integer.valueOf(i) : id;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3PrkUTPGNKOyqc6PCkO4mCJUDfY(androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(975585181, i, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListContent.<anonymous>.<anonymous>.<anonymous> (PoolsListScreen.kt:180)");
            }
            PoolsList(lazyPagingItems, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), function2, composer, androidx.paging.compose.LazyPagingItems.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3e5uEgH_tJMZZnpSGifAbkhn_sQ(androidx.paging.compose.LazyPagingItems lazyPagingItems, final kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-417978798, i2, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsList.<anonymous>.<anonymous>.<anonymous> (PoolsListScreen.kt:244)");
            }
            final com.paypal.oslo.feature.pools.domain.models.Pool pool = (com.paypal.oslo.feature.pools.domain.models.Pool) lazyPagingItems.get(i);
            if (pool == null) {
                composer.startReplaceGroup(-896129180);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-896129179);
                boolean changed = composer.changed(function2);
                boolean changed2 = composer.changed(pool);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.m17692$r8$lambda$W5cQM8222XG8UqZwk50wo_lQa4(kotlin.jvm.functions.Function2.this, pool);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                PoolCardDetails(pool, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8Gfu1LL0h648vI9C0UtydGsDoTc(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PoolsListScreen(navResultManager, modifier, poolsListViewModel, function3, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9-o-OyxCt-vOCpml-uo0wdph1aQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17690$r8$lambda$9oOyxCtvOCpmluo0wdph1aQ(kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-160473891, i, -1, "com.paypal.oslo.feature.pools.ui.poolslist.poolsListAppendStateHandler.<anonymous> (PoolsListScreen.kt:278)");
            }
            PoolsListAppendErrorContent(function0, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Afa_gySy4ogV8cdM0xfDugPOwgc(com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, java.lang.String str, float f, int i, androidx.compose.runtime.Composer composer, int i2) {
        PoolCardContributionProgress(poolAmount, poolAmount2, str, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Dd0n-jxma1jcR0XQ3RPd00Ekwlk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17691$r8$lambda$Dd0njxma1jcR0XQ3RPd00Ekwlk(int i, androidx.compose.runtime.Composer composer, int i2) {
        PoolsListAppendLoadingContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IXRoGbEI5mspjbhfh5_qN5sJCfM(com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, java.lang.String str, float f, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-539928803, i, -1, "com.paypal.oslo.feature.pools.ui.poolslist.getPoolCardFooter.<anonymous> (PoolsListScreen.kt:465)");
            }
            PoolCardContributionProgress(poolAmount, poolAmount2, str, f, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IiDdObfEPqZBsj7i2TXVSGjEYDo(androidx.paging.LoadState loadState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PoolsListRefreshStateHandler(loadState, modifier, function0, function02, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P1OilvaXtutkp77V4na6DZpAQ_g(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UX2HGmyAdfuQD1fT3mQ6t8zOdAs(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel, androidx.paging.compose.LazyPagingItems lazyPagingItems) {
        poolsListViewModel.onLoadStateChanged(lazyPagingItems.getLoadState().getRefresh());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Um06YmwrzmG7zLYjyuqUy5tfVH0(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PoolsListAppendErrorContent(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W5cQM8222XG8UqZwk-50wo_lQa4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17692$r8$lambda$W5cQM8222XG8UqZwk50wo_lQa4(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.pools.domain.models.Pool pool) {
        function2.invoke(pool.getId(), pool.getCreator().getId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W8GmJzKNRsP5-a9f_fcn5vc9pIg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17693$r8$lambda$W8GmJzKNRsP5a9f_fcn5vc9pIg(final androidx.paging.compose.LazyPagingItems lazyPagingItems, final kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, lazyPagingItems.getItemCount(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$1mq7lVd_OSjU7NmHnfoXNd0EakI(androidx.paging.compose.LazyPagingItems.this, ((java.lang.Integer) obj).intValue());
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-417978798, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$3e5uEgH_tJMZZnpSGifAbkhn_sQ(androidx.paging.compose.LazyPagingItems.this, function2, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        poolsListAppendStateHandler(lazyListScope, lazyPagingItems.getLoadState().getAppend(), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$W_tVQsseg1T9dGRHKUxGiAr9t0s(androidx.paging.compose.LazyPagingItems.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W_tVQsseg1T9dGRHKUxGiAr9t0s(androidx.paging.compose.LazyPagingItems lazyPagingItems) {
        lazyPagingItems.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WhqyrX9ztMW4CRaNn_zikPOfMGs(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZqMbvV87BP__v4p86BGlpcJjseQ(androidx.paging.compose.LazyPagingItems lazyPagingItems, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PoolsListContent(lazyPagingItems, modifier, function2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_ddwI372FyR33bdyUMjmfcSFF8s(androidx.paging.compose.LazyPagingItems lazyPagingItems, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PoolsList(lazyPagingItems, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_pd8gcslNOLMmpQuVUw33UrC_-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17694$r8$lambda$_pd8gcslNOLMmpQuVUw33UrC_c() {
        com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.pools.LoggerKt.log, com.paypal.android.logger.categories.UI.ScreenDisplayed.INSTANCE, com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents.LIST_POOLS_SCREEN_CREATED_LIST_DISPLAYED, null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dCS_Qegr7AX6XWIFX353cPaf8gE(com.paypal.oslo.feature.pools.domain.models.Pool pool, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PoolCardDetails(pool, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m8jUTdiEaW5gUG8H0bLvQC1l64I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1596488323);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1596488323, updateChangedFlags, -1, "com.paypal.oslo.feature.pools.ui.poolslist.LoadMoreErrorPreview (PoolsListScreen.kt:592)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_error_load_more_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1002);
            startRestartGroup = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_error_load_more_refresh_button, startRestartGroup, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, null, null, null, secondary, medium, false, false, startRestartGroup, 1769478, 412);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$m8jUTdiEaW5gUG8H0bLvQC1l64I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lDw_PjHVb7Y5KJzbvBiw8cVNakc(com.paypal.oslo.feature.pools.domain.models.Pool pool, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-761518, i, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolCardDetails.<anonymous> (PoolsListScreen.kt:361)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).data(pool.getBackgroundUrl()).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null), com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderMuted.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), composer, 390, 0), com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 56);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 12, null), 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(pool.getTitle(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            java.lang.String formatShortMonthDay = com.paypal.oslo.feature.pools.ui.common.PoolsUtils.INSTANCE.formatShortMonthDay(pool.getTargetDate());
            if (formatShortMonthDay.length() > 0) {
                composer.startReplaceGroup(-1965591026);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(pool.isClosed() ? com.paypal.oslo.feature.pools.R.string.feature_pools_ended_on : com.paypal.oslo.feature.pools.R.string.feature_pools_ends_on, new java.lang.Object[]{formatShortMonthDay}, composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1965204704);
                composer.endReplaceGroup();
            }
            composer.endNode();
            androidx.compose.ui.Modifier align = rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getEnd(), composer, 48);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, align);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String currencyFormat = com.paypal.oslo.feature.pools.ui.common.PoolsUtils.INSTANCE.toCurrencyFormat(pool.getAvailableBalance().getValue());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(currencyFormat);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            if (pool.isClosed()) {
                composer.startReplaceGroup(955058944);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_closed, composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(955304681);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rJjpLW3KHtwU5Rqi_W8AERZNHGU(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uz2NnqG6VHiEo-qAWe6SjZ8udQ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17695$r8$lambda$uz2NnqG6VHiEoqAWe6SjZ8udQ0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-349039067);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-349039067, updateChangedFlags, -1, "com.paypal.oslo.feature.pools.ui.poolslist.PoolsListPreview (PoolsListScreen.kt:478)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.pools.domain.models.Pool[]{new com.paypal.oslo.feature.pools.domain.models.Pool("1", "Adam's Birthday Trip to Cabo", "", "", null, com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("0", null, null, null), null, "2026-01-01T2:38Z", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 180.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 180.0f), 60.0f, "", false, true, false, ""), new com.paypal.oslo.feature.pools.domain.models.Pool(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "August Rent", "", "", "Jodie Myers", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("0", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Jodie", "Myers", null, null, "Jodie Myers"), null, null), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 0.1f), "", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 600.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 0.1f), 100.0f, "", false, false, false, ""), new com.paypal.oslo.feature.pools.domain.models.Pool(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Test", "", "", "John Doe", com.paypal.oslo.feature.pools.domain.models.PoolStatus.CLOSED, new com.paypal.oslo.feature.pools.domain.models.User("0", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "John", "Doe", null, null, "John Doe"), null, null), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 600.0f), "2026-01-01T2:38Z", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 600.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 600.0f), 100.0f, "", false, false, false, "")});
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.paging.compose.LazyPagingItems collectAsLazyPagingItems = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(kotlinx.coroutines.flow.FlowKt.flowOf(androidx.paging.PagingData.Companion.from$default(androidx.paging.PagingData.INSTANCE, listOf, 0, 0, 6, null)), null, startRestartGroup, 0, 1);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.$r8$lambda$rJjpLW3KHtwU5Rqi_W8AERZNHGU((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PoolsList(collectAsLazyPagingItems, m1707paddingVpY3zN4, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, androidx.paging.compose.LazyPagingItems.$stable | 384, 0);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.m17695$r8$lambda$uz2NnqG6VHiEoqAWe6SjZ8udQ0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}

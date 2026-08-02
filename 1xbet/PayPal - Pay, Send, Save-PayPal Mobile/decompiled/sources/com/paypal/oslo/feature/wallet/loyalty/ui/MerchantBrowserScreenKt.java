package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\u0010\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u008a\u0084\u0002²\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u008a\u0084\u0002"}, d2 = {"MaxLazyGridHeight", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MaxColumnSize", "", "TestTagMerchantBrowserScreenSearch", "", "TestTagMerchantBrowserScreenRecommendedHeader", "TestTagMerchantBrowserScreenRecommendedSection", "TestTagMerchantBrowserScreenAllSection", "TestTagMerchantBrowserScreenAllHeader", "TestTagMerchantBrowserScreenScrollableSection", "MerchantBrowserScreen", "", "viewModel", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/MerchantBrowserScreenViewModel;", "(Lcom/paypal/oslo/feature/wallet/loyalty/ui/MerchantBrowserScreenViewModel;Landroidx/compose/runtime/Composer;I)V", "onPreScroll", "Landroidx/compose/ui/geometry/Offset;", "outState", "Landroidx/compose/foundation/ScrollState;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "onPreScroll-Uv8p0NA", "(Landroidx/compose/foundation/ScrollState;J)J", "MerchantBrowserScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "recommendedMerchants", "", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;", "allMerchants"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MerchantBrowserScreenKt {
    public static final java.lang.String TestTagMerchantBrowserScreenAllHeader = "merchant_browser_screen_all_header";
    public static final java.lang.String TestTagMerchantBrowserScreenAllSection = "merchant_browser_screen_all_section";
    public static final java.lang.String TestTagMerchantBrowserScreenRecommendedHeader = "merchant_browser_screen_recommended_header";
    public static final java.lang.String TestTagMerchantBrowserScreenRecommendedSection = "merchant_browser_screen_recommended_section";
    public static final java.lang.String TestTagMerchantBrowserScreenScrollableSection = "merchant_browser_screen_scrollable_section";
    public static final java.lang.String TestTagMerchantBrowserScreenSearch = "merchant_browser_screen_search";
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(2000.0f);

    public static final void MerchantBrowserScreen(final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel merchantBrowserScreenViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantBrowserScreenViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1779486536);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(merchantBrowserScreenViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            androidx.compose.runtime.Composer composer3 = startRestartGroup;
            composer3.skipToGroupEnd();
            composer2 = composer3;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1779486536, i2, -1, "com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreen (MerchantBrowserScreen.kt:60)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Composer composer4 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_choose_merchant_title, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), null, null, null, null, false, 1, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 12582912, 6, 892);
            com.paypal.pds.components.SearchKt.Search(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing32()), TestTagMerchantBrowserScreenSearch), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_search, composer4, 0), null, null, null, null, null, composer4, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer4, 0, 1);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, rememberScrollState, false, null, false, 14, null), TestTagMerchantBrowserScreenScrollableSection);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer4, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor2);
            } else {
                composer4.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 2, null), TestTagMerchantBrowserScreenRecommendedHeader), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_choose_merchant_favorite_title, composer4, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_choose_merchant_favorite_subtitle, composer4, 0), null, composer4, 0, 8);
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(merchantBrowserScreenViewModel.getRecommendedMerchants(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer4, 0, 7);
            androidx.compose.foundation.lazy.grid.GridCells.Fixed fixed = new androidx.compose.foundation.lazy.grid.GridCells.Fixed(3);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            float f = getHighSpeedVideoSizes;
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(companion, 0.0f, f, 1, null), TestTagMerchantBrowserScreenRecommendedSection);
            boolean changed = composer4.changed(collectAsStateWithLifecycle);
            boolean changedInstance = composer4.changedInstance(merchantBrowserScreenViewModel);
            java.lang.Object rememberedValue = composer4.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt.$r8$lambda$eHFQSXQGSQy_6DZXA4cVwi4pszY(androidx.compose.runtime.State.this, merchantBrowserScreenViewModel, (androidx.compose.foundation.lazy.grid.LazyGridScope) obj);
                    }
                };
                composer4.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(fixed, testTag2, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer4, 48, 0, 1020);
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing32(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), TestTagMerchantBrowserScreenAllHeader), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_choose_merchant_all_cards_title, composer4, 0), null, null, composer4, 0, 12);
            final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(merchantBrowserScreenViewModel.getAllMerchants(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer4, 0, 7);
            androidx.compose.foundation.lazy.grid.GridCells.Fixed fixed2 = new androidx.compose.foundation.lazy.grid.GridCells.Fixed(3);
            androidx.compose.ui.Modifier nestedScroll$default = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, f, 1, null), TestTagMerchantBrowserScreenAllSection), new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$1$1$2
                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                /* renamed from: onPostFling-RZ2iAVY */
                public final /* bridge */ java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                    return super.mo1528onPostFlingRZ2iAVY(j, j2, continuation);
                }

                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                /* renamed from: onPostScroll-DzOQY0M */
                public final /* bridge */ long mo1529onPostScrollDzOQY0M(long j, long j2, int i3) {
                    return super.mo1529onPostScrollDzOQY0M(j, j2, i3);
                }

                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                /* renamed from: onPreFling-QWom1Mo */
                public final /* bridge */ java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                    return super.mo1753onPreFlingQWom1Mo(j, continuation);
                }

                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                /* renamed from: onPreScroll-OzD1aCk */
                public final long mo1754onPreScrollOzD1aCk(long available, int source) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt.m21376onPreScrollUv8p0NA(androidx.compose.foundation.ScrollState.this, available);
                }
            }, null, 2, null);
            boolean changed2 = composer4.changed(collectAsStateWithLifecycle2);
            boolean changedInstance2 = composer4.changedInstance(merchantBrowserScreenViewModel);
            java.lang.Object rememberedValue2 = composer4.rememberedValue();
            if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt.m21375$r8$lambda$o9W26PR2q6ITRIj7n0dqwD7JH8(androidx.compose.runtime.State.this, merchantBrowserScreenViewModel, (androidx.compose.foundation.lazy.grid.LazyGridScope) obj);
                    }
                };
                composer4.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(fixed2, nestedScroll$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, composer4, 0, 0, 1020);
            composer4.endNode();
            composer4.endNode();
            composer2 = composer4;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                composer2 = composer4;
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt.m21374$r8$lambda$ZwVsY338ykCyMOpkVADdpu0_Y(com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: onPreScroll-Uv8p0NA, reason: not valid java name */
    public static final long m21376onPreScrollUv8p0NA(androidx.compose.foundation.ScrollState scrollState, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollState, "");
        if (scrollState.getCanScrollForward()) {
            int i = (int) (j & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i) < 0.0f) {
                float f = -scrollState.dispatchRawDelta(-java.lang.Float.intBitsToFloat(i));
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(f)));
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: $r8$lambda$Q4YGwc-rAw5APaoHiMGLVBAzMLQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21373$r8$lambda$Q4YGwcrAw5APaoHiMGLVBAzMLQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1937187796);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1937187796, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenPreview (MerchantBrowserScreen.kt:162)");
            }
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
            MerchantBrowserScreen((com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt.m21373$r8$lambda$Q4YGwcrAw5APaoHiMGLVBAzMLQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZwVsY338-ykC-yMOpkVADdpu0_Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21374$r8$lambda$ZwVsY338ykCyMOpkVADdpu0_Y(com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel merchantBrowserScreenViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        MerchantBrowserScreen(merchantBrowserScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eHFQSXQGSQy_6DZXA4cVwi4pszY(androidx.compose.runtime.State state, final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel merchantBrowserScreenViewModel, androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyGridScope, "");
        final java.util.List list = (java.util.List) state.getValue();
        final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$1$0$$inlined$items$default$1 merchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$1$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.wallet.loyalty.ui.Merchant) obj);
            }
        };
        lazyGridScope.items(list.size(), null, null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$1$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1117249557, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                }
                final com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant = (com.paypal.oslo.feature.wallet.loyalty.ui.Merchant) list.get(i);
                composer.startReplaceGroup(556240138);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                boolean changedInstance = composer.changedInstance(merchantBrowserScreenViewModel);
                boolean changed = composer.changed(merchant);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel merchantBrowserScreenViewModel2 = merchantBrowserScreenViewModel;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$1$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel.this.navigateToScanner$wallet_prodRelease(merchant);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.loyalty.ui.MerchantDisplayKt.MerchantDisplay(merchant, m1710paddingqDBjuR0$default, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o9W26PR2q6ITRIj7n0dqwD7JH-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21375$r8$lambda$o9W26PR2q6ITRIj7n0dqwD7JH8(androidx.compose.runtime.State state, final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel merchantBrowserScreenViewModel, androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyGridScope, "");
        final java.util.List list = (java.util.List) state.getValue();
        final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$1 merchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.wallet.loyalty.ui.Merchant) obj);
            }
        };
        lazyGridScope.items(list.size(), null, null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1117249557, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                }
                final com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant = (com.paypal.oslo.feature.wallet.loyalty.ui.Merchant) list.get(i);
                composer.startReplaceGroup(545326067);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                boolean changedInstance = composer.changedInstance(merchantBrowserScreenViewModel);
                boolean changed = composer.changed(merchant);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel merchantBrowserScreenViewModel2 = merchantBrowserScreenViewModel;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenKt$MerchantBrowserScreen$1$1$3$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel.this.navigateToScanner$wallet_prodRelease(merchant);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.loyalty.ui.MerchantDisplayKt.MerchantDisplay(merchant, m1710paddingqDBjuR0$default, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }
}

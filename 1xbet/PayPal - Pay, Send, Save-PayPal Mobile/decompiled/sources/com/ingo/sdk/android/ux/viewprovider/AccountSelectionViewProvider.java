package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u000e\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/AccountSelectionViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "<init>", "()V", "", "Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;", "accounts", "Lkotlin/Function0;", "", "navigationBackClicked", "moreClicked", "Lkotlin/Function1;", "nextClicked", "onAccountSelected", "View", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AccountSelectionViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;

    public AccountSelectionViewProvider() {
        super(null, null, null, 7, null);
    }

    public final void View(final java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1242286311);
        startRestartGroup.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
        if (obj != null) {
            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-48801877, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE);
                        currentTheme = com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider.this.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                        long Color = androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor()));
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function0;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function02;
                        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(imePadding, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(697662575, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                androidx.compose.runtime.Composer composer5 = composer4;
                                if ((num2.intValue() & 11) != 2 || !composer5.getSkipping()) {
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(null, function03, com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24, null, 0L, false, function04, false, false, 0, composer5, 0, 953);
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }, composer3, 54), null, null, null, 0, Color, 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-344025286, true, new com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1.AnonymousClass2(mutableState, function1, list, function12), composer3, 54), composer3, 805306416, 444);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                    final /* synthetic */ kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> getHighSpeedVideoFpsRanges;
                    final /* synthetic */ androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> getHighSpeedVideoFpsRangesFor;
                    final /* synthetic */ kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> mutableState;
                        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                        androidx.compose.runtime.Composer composer2 = composer;
                        int intValue = num.intValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                        if ((intValue & 14) == 0) {
                            intValue |= composer2.changed(paddingValues2) ? 4 : 2;
                        }
                        if ((intValue & 91) != 18 || !composer2.getSkipping()) {
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues2), 0.0f, 1, null);
                            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> mutableState2 = this.getHighSpeedVideoFpsRangesFor;
                            final kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                            java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list = this.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function12 = this.getHighSpeedVideoSizes;
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function13 = function12;
                            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> mutableState3 = mutableState2;
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_select_account_header, composer2, 0), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getHeadlineSmall(), 0, null, 0, 0L, 0, composer2, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(1688323986);
                            int i = 0;
                            for (java.lang.Object obj : list) {
                                if (i < 0) {
                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                }
                                com.ingo.sdk.kotlin.common.features.customer.model.Account account = (com.ingo.sdk.kotlin.common.features.customer.model.Account) obj;
                                composer2.startReplaceGroup(-1633490746);
                                final kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function14 = function13;
                                boolean changed = composer2.changed(function14);
                                java.lang.Object rememberedValue = composer2.rememberedValue();
                                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    mutableState = mutableState3;
                                    rememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02bc: CONSTRUCTOR (r6v15 'rememberedValue' java.lang.Object) = 
                                          (r7v14 'mutableState' androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> A[DONT_INLINE])
                                          (r5v14 'function14' kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> A[DONT_INLINE])
                                         A[MD:(androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1):void (m)] (LINE:3080) call: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1$2$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1.2.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 33 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 882
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$View$1.AnonymousClass2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                }

                                public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1) {
                                    com.ingo.sdk.kotlin.common.features.customer.model.Account account = (com.ingo.sdk.kotlin.common.features.customer.model.Account) mutableState.getValue();
                                    if (account != null) {
                                        function1.invoke(account);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, com.ingo.sdk.kotlin.common.features.customer.model.Account account) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), account)) {
                                        mutableState.setValue(null);
                                    } else {
                                        mutableState.setValue(account);
                                        function1.invoke(account);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass2(androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.features.customer.model.Account> mutableState, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function1, java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.features.customer.model.Account, kotlin.Unit> function12) {
                                    this.getHighSpeedVideoFpsRangesFor = mutableState;
                                    this.getHighResolutionOutputSizeshNQ4ISI = function1;
                                    this.getHighSpeedVideoFpsRanges = list;
                                    this.getHighSpeedVideoSizes = function12;
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider.m10709$r8$lambda$359QUzOaU0fKRzAzI3Avw63YHc(com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider.this, list, function0, function02, function1, function12, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                }

                /* renamed from: $r8$lambda$359QUzOaU0fKRzAzI3-Avw63YHc, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m10709$r8$lambda$359QUzOaU0fKRzAzI3Avw63YHc(com.ingo.sdk.android.ux.viewprovider.AccountSelectionViewProvider accountSelectionViewProvider, java.util.List list, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
                    accountSelectionViewProvider.View(list, function0, function02, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }
            }

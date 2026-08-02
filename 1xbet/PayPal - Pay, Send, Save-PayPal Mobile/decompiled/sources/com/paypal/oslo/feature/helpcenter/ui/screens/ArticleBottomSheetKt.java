package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ArticleBottomSheetContent", "", "articleId", "", "onVideoClick", "Lkotlin/Function1;", "onRecommendedArticleClick", "Lcom/paypal/oslo/feature/helpcenter/ui/models/RecommendedArticleUiData;", "onContentReady", "Lkotlin/Function0;", "viewModelKey", "viewModel", "Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/ArticleBottomSheetViewModel;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/ArticleBottomSheetViewModel;Landroidx/compose/runtime/Composer;II)V", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArticleBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:166:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArticleBottomSheetContent(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2, com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i3;
        java.lang.String str3;
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel2;
        int i4;
        final java.lang.String str4;
        final com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        java.lang.String str5;
        int i5;
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel4;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.String articleTitle;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1953758805);
        int i8 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i8 |= 3072;
        } else if ((i & 3072) == 0) {
            function02 = function0;
            i8 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i8 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str2;
                i8 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        articleBottomSheetViewModel2 = articleBottomSheetViewModel;
                        if (startRestartGroup.changedInstance(articleBottomSheetViewModel2)) {
                            i7 = 131072;
                            i8 |= i7;
                        }
                    } else {
                        articleBottomSheetViewModel2 = articleBottomSheetViewModel;
                    }
                    i7 = 65536;
                    i8 |= i7;
                } else {
                    articleBottomSheetViewModel2 = articleBottomSheetViewModel;
                }
                i4 = i8;
                if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt$$ExternalSyntheticLambda0
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
                        } else {
                            function03 = function02;
                        }
                        str5 = i3 != 0 ? null : str3;
                        if ((i2 & 32) != 0) {
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
                            int i10 = (((i4 >> 9) & 112) << 3) & 896;
                            i5 = 2048;
                            i4 &= -458753;
                            articleBottomSheetViewModel4 = (com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel.class), current, str5, createHiltViewModelFactory, empty, startRestartGroup, i10, 0);
                        } else {
                            i5 = 2048;
                            articleBottomSheetViewModel4 = articleBottomSheetViewModel2;
                        }
                        i6 = i4;
                        function04 = function03;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        str5 = str3;
                        articleBottomSheetViewModel4 = articleBottomSheetViewModel2;
                        i5 = 2048;
                        i6 = i4;
                        function04 = function02;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1953758805, i6, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetContent (ArticleBottomSheet.kt:59)");
                    }
                    boolean changedInstance = startRestartGroup.changedInstance(articleBottomSheetViewModel4);
                    int i11 = i6 & 14;
                    boolean z = i11 == 4;
                    com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt$ArticleBottomSheetContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt$ArticleBottomSheetContent$2$1(articleBottomSheetViewModel4, str, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i11);
                    int i12 = i6;
                    com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel5 = articleBottomSheetViewModel4;
                    com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(articleBottomSheetViewModel4.getScreenState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                    boolean changed = startRestartGroup.changed(screenState);
                    boolean z2 = (i12 & 7168) == i5;
                    com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt$ArticleBottomSheetContent$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changed | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt$ArticleBottomSheetContent$3$1(screenState, function04, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(screenState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                    if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading) {
                        startRestartGroup.startReplaceGroup(968903813);
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                        com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                        startRestartGroup.endNode();
                    } else if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) {
                        startRestartGroup.startReplaceGroup(969160307);
                        int i13 = com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) screenState).getErrorType().ordinal()];
                        if (i13 == 1) {
                            startRestartGroup.startReplaceGroup(-661471355);
                            com.paypal.oslo.feature.helpcenter.ui.components.ErrorComponentsKt.ContentNotFoundComponent(null, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        } else if (i13 == 2 || i13 == 3) {
                            startRestartGroup.startReplaceGroup(-661468510);
                            com.paypal.oslo.feature.helpcenter.ui.components.ErrorComponentsKt.NetworkErrorComponent(null, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        } else {
                            startRestartGroup.startReplaceGroup(-661473425);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) {
                        startRestartGroup.startReplaceGroup(969431774);
                        com.paypal.oslo.feature.helpcenter.domain.models.Article article = (com.paypal.oslo.feature.helpcenter.domain.models.Article) ((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) screenState).getData();
                        boolean changed2 = startRestartGroup.changed(article);
                        java.util.ArrayList rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.Article> relatedArticle = article.getRelatedArticle();
                            if (relatedArticle == null) {
                                rememberedValue4 = kotlin.collections.CollectionsKt.emptyList();
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (com.paypal.oslo.feature.helpcenter.domain.models.Article article2 : relatedArticle) {
                                    java.lang.String articleId = article2.getArticleId();
                                    com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData = (articleId == null || (articleTitle = article2.getArticleTitle()) == null) ? null : new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData(articleId, articleTitle);
                                    if (recommendedArticleUiData != null) {
                                        arrayList.add(recommendedArticleUiData);
                                    }
                                }
                                rememberedValue4 = arrayList;
                            }
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        java.util.List list = (java.util.List) rememberedValue4;
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                        function05 = function04;
                        com.paypal.oslo.feature.helpcenter.ui.components.ArticleSectionKt.ArticleSection(article, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, function1, null, startRestartGroup, ((i12 << 6) & 7168) | 48, 20);
                        if (!list.isEmpty()) {
                            startRestartGroup.startReplaceGroup(-1819869927);
                            com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.RecommendedArticlesSection(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(list), function12, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0, startRestartGroup, ((i12 >> 3) & 112) | 384, 8);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1819585471);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        articleBottomSheetViewModel3 = articleBottomSheetViewModel5;
                        function02 = function05;
                        str4 = str5;
                    } else {
                        startRestartGroup.startReplaceGroup(-661481867);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.endReplaceGroup();
                    function05 = function04;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    articleBottomSheetViewModel3 = articleBottomSheetViewModel5;
                    function02 = function05;
                    str4 = str5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    str4 = str3;
                    articleBottomSheetViewModel3 = articleBottomSheetViewModel2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleBottomSheetKt.$r8$lambda$iRuQlXzM3ddjTUyj8fyMMNuceg8(str, function1, function12, function02, str4, articleBottomSheetViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str3 = str2;
            if ((196608 & i) == 0) {
            }
            i4 = i8;
            if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function02 = function0;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        str3 = str2;
        if ((196608 & i) == 0) {
        }
        i4 = i8;
        if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iRuQlXzM3ddjTUyj8fyMMNuceg8(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, java.lang.String str2, com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ArticleBottomSheetContent(str, function1, function12, function0, str2, articleBottomSheetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NOT_FOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.GENERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

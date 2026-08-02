package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a~\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2G\u0010\t\u001aC\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Gallery", "", "T", "items", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function2;", "Lkotlin/Pair;", "", "Lkotlin/ParameterName;", "name", "itemPosition", "item", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "GalleryPreviewWithCardsPreview", "(Landroidx/compose/runtime/Composer;I)V", "GallerySingleItemPreview", "common-ui_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GalleryKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Gallery(final java.util.List<? extends T> list, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function4<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(353659980);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    paddingValues2 = paddingValues;
                    if (startRestartGroup.changed(paddingValues2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    paddingValues2 = paddingValues;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                paddingValues2 = paddingValues;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i4 = i3 & (-897);
                        m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        modifier4 = companion;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(353659980, i4, -1, "com.paypal.oslo.core.commonui.components.containers.Gallery (Gallery.kt:67)");
                        }
                        changedInstance = startRestartGroup.changedInstance(list);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    int size;
                                    size = list.size();
                                    return java.lang.Integer.valueOf(size);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.foundation.pager.PagerState rememberPagerState = androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(0, 0.0f, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 2);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
                        final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_previous_item, startRestartGroup, 0);
                        final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_next_item, startRestartGroup, 0);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        float spacing16 = com.paypal.pds.core.ConstantsKt.getSpacing16();
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    java.lang.Object valueOf;
                                    valueOf = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue());
                                    return valueOf;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.foundation.pager.PagerKt.m1922HorizontalPager8jOkeI(rememberPagerState, null, m1701PaddingValuesYgX7TsA$default, null, 1, spacing16, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue3, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1234258443, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function4
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.core.commonui.components.containers.GalleryKt.$r8$lambda$crMoeKbQ85xYKPpPoRh1OOTOxpY(stringResource, coroutineScope, rememberPagerState, list, stringResource2, function4, (androidx.compose.foundation.pager.PagerScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i4 & 896) | 24576, 24582, 15306);
                        if (list.size() <= 1) {
                            startRestartGroup.startReplaceGroup(-92658977);
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.PaginationKt.Pagination(null, list.size(), rememberPagerState.getCurrentPage(), startRestartGroup, 0, 1);
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(-92523476);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        paddingValues3 = m1701PaddingValuesYgX7TsA$default;
                    } else {
                        i4 = i3;
                        modifier4 = companion;
                    }
                }
                m1701PaddingValuesYgX7TsA$default = paddingValues2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                changedInstance = startRestartGroup.changedInstance(list);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        int size;
                        size = list.size();
                        return java.lang.Integer.valueOf(size);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                final androidx.compose.foundation.pager.PagerState rememberPagerState2 = androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(0, 0.0f, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
                final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_previous_item, startRestartGroup, 0);
                final java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_next_item, startRestartGroup, 0);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                float spacing162 = com.paypal.pds.core.ConstantsKt.getSpacing16();
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                androidx.compose.ui.Modifier modifier52 = modifier4;
                androidx.compose.foundation.pager.PagerKt.m1922HorizontalPager8jOkeI(rememberPagerState2, null, m1701PaddingValuesYgX7TsA$default, null, 1, spacing162, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue3, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1234258443, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.core.commonui.components.containers.GalleryKt.$r8$lambda$crMoeKbQ85xYKPpPoRh1OOTOxpY(stringResource3, coroutineScope2, rememberPagerState2, list, stringResource22, function4, (androidx.compose.foundation.pager.PagerScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i4 & 896) | 24576, 24582, 15306);
                if (list.size() <= 1) {
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                paddingValues3 = m1701PaddingValuesYgX7TsA$default;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                paddingValues3 = paddingValues2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.commonui.components.containers.GalleryKt.m11232$r8$lambda$s1AykUnJXcG2kHPNnJOjuC7nqc(list, modifier3, paddingValues3, function4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1oheWOxxHoFNya3IzpnTJYQQ96E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(830004060);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(830004060, updateChangedFlags, -1, "com.paypal.oslo.core.commonui.components.containers.GalleryPreviewWithCardsPreview (Gallery.kt:144)");
            }
            Gallery(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Card content 1", "Card content 2", "Card content 3"}), com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, com.paypal.oslo.core.commonui.components.containers.ComposableSingletons$GalleryKt.INSTANCE.m11223getLambda$1054190193$common_ui_release(), startRestartGroup, 3078, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.commonui.components.containers.GalleryKt.$r8$lambda$1oheWOxxHoFNya3IzpnTJYQQ96E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$McP24UPVTQB_gtTL_t7bIzzENpM(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.pager.PagerState pagerState, int i) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.GalleryKt$Gallery$1$2$1$1$1$1$1(pagerState, i, null), 3, null);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$c5AjjJScMeMvn01Oy9JLcAFeCiY(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.pager.PagerState pagerState, int i) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.GalleryKt$Gallery$1$2$1$1$1$2$1(pagerState, i, null), 3, null);
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$crMoeKbQ85xYKPpPoRh1OOTOxpY(final java.lang.String str, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.pager.PagerState pagerState, final java.util.List list, final java.lang.String str2, kotlin.jvm.functions.Function4 function4, androidx.compose.foundation.pager.PagerScope pagerScope, final int i, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.Object obj;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagerScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1234258443, i2, -1, "com.paypal.oslo.core.commonui.components.containers.Gallery.<anonymous>.<anonymous> (Gallery.kt:85)");
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(i)) && (i2 & 48) != 32) {
            obj = str;
            z = false;
        } else {
            z = true;
            obj = str;
        }
        boolean changed = composer.changed(obj);
        boolean changedInstance = composer.changedInstance(coroutineScope);
        boolean changed2 = composer.changed(pagerState);
        boolean changedInstance2 = composer.changedInstance(list);
        boolean changed3 = composer.changed(str2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed | changedInstance | changed2 | changedInstance2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.commonui.components.containers.GalleryKt.m11233$r8$lambda$tmSX_ASJ0DesHmbfg40COQnCZQ(i, str, list, str2, coroutineScope, pagerState, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics$default);
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
        function4.invoke(kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())), list.get(i), composer, 0);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eEXbJ9Y2FRMvpoH9K7yMEAPXfo4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1646244874);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1646244874, updateChangedFlags, -1, "com.paypal.oslo.core.commonui.components.containers.GallerySingleItemPreview (Gallery.kt:182)");
            }
            Gallery(kotlin.collections.CollectionsKt.listOf("Single card content"), com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, com.paypal.oslo.core.commonui.components.containers.ComposableSingletons$GalleryKt.INSTANCE.m11224getLambda$973461399$common_ui_release(), startRestartGroup, 3078, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.commonui.components.containers.GalleryKt.$r8$lambda$eEXbJ9Y2FRMvpoH9K7yMEAPXfo4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s1AykUnJXcG2kH-PNnJOjuC7nqc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11232$r8$lambda$s1AykUnJXcG2kHPNnJOjuC7nqc(java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Gallery(list, modifier, paddingValues, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tmSX_ASJ0Des-Hmbfg40COQnCZQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11233$r8$lambda$tmSX_ASJ0DesHmbfg40COQnCZQ(final int i, java.lang.String str, java.util.List list, java.lang.String str2, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (i > 0) {
            createListBuilder.add(new androidx.compose.ui.semantics.CustomAccessibilityAction(str, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.core.commonui.components.containers.GalleryKt.$r8$lambda$McP24UPVTQB_gtTL_t7bIzzENpM(kotlinx.coroutines.CoroutineScope.this, pagerState, i));
                }
            }));
        }
        if (i < list.size() - 1) {
            createListBuilder.add(new androidx.compose.ui.semantics.CustomAccessibilityAction(str2, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.containers.GalleryKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.core.commonui.components.containers.GalleryKt.$r8$lambda$c5AjjJScMeMvn01Oy9JLcAFeCiY(kotlinx.coroutines.CoroutineScope.this, pagerState, i));
                }
            }));
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, kotlin.collections.CollectionsKt.build(createListBuilder));
        return kotlin.Unit.INSTANCE;
    }
}

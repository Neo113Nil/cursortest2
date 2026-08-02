package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"DefaultInitialVisibleCount", "", "RecommendedArticlesSection", "", "screenState", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/RecommendedArticleUiData;", "onArticleClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "initialVisibleCount", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "RecommendedArticlesList", "articles", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "RecommendedArticleListItem", "article", "showDivider", "", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/RecommendedArticleUiData;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RecommendedArticlesSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecommendedArticlesListPreview", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecommendedArticlesSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecommendedArticlesSection(final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<? extends java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData>> screenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(166172731);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(screenState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    i7 = i6;
                } else {
                    if (i8 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    int i9 = i5 != 0 ? 3 : i6;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(166172731, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSection (RecommendedArticlesSection.kt:53)");
                    }
                    if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading) {
                        startRestartGroup.startReplaceGroup(-1645157219);
                        startRestartGroup.endReplaceGroup();
                    } else if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) {
                        startRestartGroup.startReplaceGroup(-1645047634);
                        startRestartGroup.endReplaceGroup();
                    } else if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) {
                        startRestartGroup.startReplaceGroup(-1644867958);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Recommended Articles", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 438, 6, 1016);
                        modifier4 = modifier2;
                        composer2 = startRestartGroup;
                        RecommendedArticlesList((java.util.List) ((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) screenState).getData(), function1, null, java.lang.Integer.valueOf(i9), startRestartGroup, i4 & 7280, 4);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        i7 = i9;
                    } else {
                        startRestartGroup.startReplaceGroup(778213822);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    modifier4 = modifier2;
                    composer2 = startRestartGroup;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    i7 = i9;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.m14802$r8$lambda$iGFdvJ5_fl37Or78Vy54R6xuqo(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.this, function1, modifier3, i7, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void RecommendedArticlesList(final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.lang.Integer num, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(968655393);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(num) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                num = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(968655393, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesList (RecommendedArticlesSection.kt:106)");
            }
            int i6 = i3 >> 3;
            com.paypal.oslo.feature.helpcenter.ui.components.ExpandableListKt.ExpandableList(list, modifier, num, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-929503849, true, new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function5
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.$r8$lambda$CFlr5kKOQQRqsw6NUG_ivmHLxuk(list, function1, (com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Boolean) obj3).booleanValue(), (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | (i6 & 112) | (i6 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final java.lang.Integer num2 = num;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.$r8$lambda$8JRtd7puvc7zGxu8e6UB68zPmhw(list, function1, modifier2, num2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RecommendedArticleListItem(final com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedArticleUiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1967201651);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(recommendedArticleUiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1967201651, i2, -1, "com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticleListItem (RecommendedArticlesSection.kt:134)");
            }
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, function0, startRestartGroup, ((i2 << 12) & 3670016) | 6, 31);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(recommendedArticleUiData.getTitle(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, 384, 6, 1016);
            if (z) {
                composer2.startReplaceGroup(1197699178);
                com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1197730891);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.m14803$r8$lambda$toQ6qGnONeAsx4dUw2F8EKYoww(com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData.this, z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8JRtd7puvc7zGxu8e6UB68zPmhw(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.lang.Integer num, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RecommendedArticlesList(list, function1, modifier, num, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BvWLxVaW7GmqG79ZMg-C8MpXKZY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14798$r8$lambda$BvWLxVaW7GmqG79ZMgC8MpXKZY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData) {
        function1.invoke(recommendedArticleUiData);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CFlr5kKOQQRqsw6NUG_ivmHLxuk(java.util.List list, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData, int i, boolean z, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedArticleUiData, "");
        if ((i2 & 6) == 0) {
            i3 = (composer.changed(recommendedArticleUiData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composer.changed(z) ? 256 : 128;
        }
        if (composer.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-929503849, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesList.<anonymous> (RecommendedArticlesSection.kt:112)");
            }
            boolean z2 = !z || (list.size() - 1 == i);
            boolean changed = composer.changed(function1);
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.m14798$r8$lambda$BvWLxVaW7GmqG79ZMgC8MpXKZY(kotlin.jvm.functions.Function1.this, recommendedArticleUiData);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            RecommendedArticleListItem(recommendedArticleUiData, z2, (kotlin.jvm.functions.Function0) rememberedValue, composer, i4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JEHqZRh66Nk9litFy99yTHHA-fs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14799$r8$lambda$JEHqZRh66Nk9litFy99yTHHAfs(com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedArticleUiData, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_swcYGNISqxDi-Vn4g2G6XQPyGA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14800$r8$lambda$_swcYGNISqxDiVn4g2G6XQPyGA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1207377524);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1207377524, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesListPreview (RecommendedArticlesSection.kt:182)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData[]{new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData("1", "How do I change my password and security questions?"), new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Confirm my identity")});
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.$r8$lambda$xdJK1LVoyN2Db1caZ3AeRkyriCw((com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RecommendedArticlesList(listOf, (kotlin.jvm.functions.Function1) rememberedValue, m1708paddingVpY3zN4$default, null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.m14800$r8$lambda$_swcYGNISqxDiVn4g2G6XQPyGA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aRb-0KunKArwQ45C2ZwmgH4cnDk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14801$r8$lambda$aRb0KunKArwQ45C2ZwmgH4cnDk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-805938399);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-805938399, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionPreview (RecommendedArticlesSection.kt:156)");
            }
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData[]{new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData("1", "I just got a decline. What do I do next?"), new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "How do I activate my PayPal Debit Card 5% monthly cash back?"), new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "What should I do if my PayPal Debit Card is lost, stolen, or damaged?")}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.m14799$r8$lambda$JEHqZRh66Nk9litFy99yTHHAfs((com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RecommendedArticlesSection(success, (kotlin.jvm.functions.Function1) rememberedValue, null, 0, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.m14801$r8$lambda$aRb0KunKArwQ45C2ZwmgH4cnDk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iGFdvJ5_fl37Or78Vy54R-6xuqo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14802$r8$lambda$iGFdvJ5_fl37Or78Vy54R6xuqo(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        RecommendedArticlesSection(screenState, function1, modifier, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$toQ6qGnONeAsx4-dUw2F8EKYoww, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14803$r8$lambda$toQ6qGnONeAsx4dUw2F8EKYoww(com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData, boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        RecommendedArticleListItem(recommendedArticleUiData, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xdJK1LVoyN2Db1caZ3AeRkyriCw(com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedArticleUiData, "");
        return kotlin.Unit.INSTANCE;
    }
}

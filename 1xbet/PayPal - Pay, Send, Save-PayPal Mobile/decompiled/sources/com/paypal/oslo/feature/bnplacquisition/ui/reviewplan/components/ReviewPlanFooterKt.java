package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterTestTag.CONTAINER, "", "content", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/ReviewPlanFooterContent;", "onApplyClick", "Lkotlin/Function0;", "onLinkClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/ReviewPlanFooterContent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReviewPlanFooterPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanFooterKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewPlanFooter(final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanFooterContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1712522264);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(reviewPlanFooterContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1712522264, i4, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooter (ReviewPlanFooter.kt:58)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterTestTag.CONTAINER);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanFooterContent.getLegalText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                startRestartGroup.startReplaceGroup(1590459200);
                java.util.List<kotlin.Pair<com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> links = reviewPlanFooterContent.getLinks();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(links, 10));
                java.util.Iterator<T> it = links.iterator();
                while (it.hasNext()) {
                    kotlin.Pair pair = (kotlin.Pair) it.next();
                    arrayList.add(kotlin.TuplesKt.to(com.paypal.oslo.core.commonui.utils.RefTextKt.value((com.paypal.oslo.core.commonui.utils.RefText) pair.component1(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), (java.lang.String) pair.component2()));
                }
                startRestartGroup.endReplaceGroup();
                com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(value, arrayList);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterTestTag.LEGAL_TEXT);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, richText, (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null));
                boolean z = (i4 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt.m12463$r8$lambda$v3popudjjQYXigQmN219E2J_w(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, testTag2, null, (kotlin.jvm.functions.Function3) rememberedValue, null, startRestartGroup, com.paypal.pds.components.LegalConsentItem.$stable, 20);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.core.commonui.utils.RefTextKt.value(reviewPlanFooterContent.getApplyButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), false, null, 3, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterTestTag.APPLY_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i4 >> 3) & 14) | 1769472, 408);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt.m12465$r8$lambda$pr1gYDcTj3d8p0eYfhJaoZTNkg(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent.this, function0, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-v3popudjjQY-XigQmN219E2J_w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12463$r8$lambda$v3popudjjQYXigQmN219E2J_w(kotlin.jvm.functions.Function1 function1, int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2Zb1wVlTm8OLEpL3sVh2hPE8Sv4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lO0eVBMlIajlzX9aXUFQMt3Mt-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12464$r8$lambda$lO0eVBMlIajlzX9aXUFQMt3Mtg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(551073545);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(551073545, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterPreview (ReviewPlanFooter.kt:124)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider reviewPlanContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider();
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent(reviewPlanContentProvider.getAgreementText(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(reviewPlanContentProvider.getAgreementLink(), "https://paypal.com")), reviewPlanContentProvider.getApplyButtonText());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt.$r8$lambda$2Zb1wVlTm8OLEpL3sVh2hPE8Sv4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ReviewPlanFooter(reviewPlanFooterContent, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt.m12464$r8$lambda$lO0eVBMlIajlzX9aXUFQMt3Mtg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pr1-gYDcTj3d8p0eYfhJaoZTNkg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12465$r8$lambda$pr1gYDcTj3d8p0eYfhJaoZTNkg(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReviewPlanFooter(reviewPlanFooterContent, function0, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

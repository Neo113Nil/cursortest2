package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"AllTransactionsContent", "", "years", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/YearAccordionItem;", "onYearHeaderClick", "Lkotlin/Function1;", "", "onDownloadYearClick", "onDownloadMonthClick", "Lkotlin/Function2;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsContentKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllTransactionsContent(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem> list, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(414592269);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(414592269, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContent (AllTransactionsContent.kt:41)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                boolean z = false;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "all_transactions_content");
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z2 = (i4 & 112) == 32;
                boolean z3 = (i4 & 896) == 256;
                if ((i4 & 7168) == 2048) {
                    z = true;
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt.m20297$r8$lambda$I5Pu4twwmdhj1z9G7elyBcuCI(list, function1, function12, function2, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6, 510);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt.m20296$r8$lambda$9EkY0WZwOwwhv2L_Nt6sOKiK3w(list, function1, function12, function2, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$9EkY0WZwOw-whv2L_Nt6sOKiK3w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20296$r8$lambda$9EkY0WZwOwwhv2L_Nt6sOKiK3w(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AllTransactionsContent(list, function1, function12, function2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I5Pu4twwmdh-j1z9G7elyBcu-CI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20297$r8$lambda$I5Pu4twwmdhj1z9G7elyBcuCI(final java.util.List list, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$AllTransactionsContentKt.INSTANCE.getLambda$1126062674$tax_and_document_center_prodRelease(), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$AllTransactionsContentKt.INSTANCE.getLambda$1154809659$tax_and_document_center_prodRelease(), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2087120870, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContentKt.m20298$r8$lambda$TA0A_W7itNSpNnAb3F9Fg6K164(list, function1, function12, function2, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$AllTransactionsContentKt.INSTANCE.m20300getLambda$1034084103$tax_and_document_center_prodRelease(), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TA0A_W7itNSpNnAb3F9F-g6K164, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20298$r8$lambda$TA0A_W7itNSpNnAb3F9Fg6K164(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2087120870, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.AllTransactionsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AllTransactionsContent.kt:71)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.YearAccordionSection(list, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "all_transactions_year_accordion_section"), function1, function12, function2, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

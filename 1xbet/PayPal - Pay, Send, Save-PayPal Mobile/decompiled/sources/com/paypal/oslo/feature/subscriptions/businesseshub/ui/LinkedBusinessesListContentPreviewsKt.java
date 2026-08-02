package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkedBusinessesListContentPreviewsKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$6kTuv7vyxkJNtmD2Ar07_xYRSr4(final com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListPreviewData linkedBusinessesListPreviewData, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1532392027);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(linkedBusinessesListPreviewData) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1532392027, i3, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListPreview (LinkedBusinessesListContentPreviews.kt:38)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(linkedBusinessesListPreviewData.getName(), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
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
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changedInstance = composer2.changedInstance(linkedBusinessesListPreviewData);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt.$r8$lambda$r_VEL2YZEkLG3fKIDGvgik7g91c(com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListPreviewData.this, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxWidth$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 6, 510);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt.$r8$lambda$6kTuv7vyxkJNtmD2Ar07_xYRSr4(com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListPreviewData.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r_VEL2YZEkLG3fKIDGvgik7g91c(com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListPreviewData linkedBusinessesListPreviewData, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> items = linkedBusinessesListPreviewData.getItems();
        lazyListScope.items(items.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt$LinkedBusinessesListPreview$lambda$0$0$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                items.get(i);
                return null;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt$LinkedBusinessesListPreview$lambda$0$0$0$0$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel linkedBusinessAgreementItemUiModel = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel) items.get(i);
                composer.startReplaceGroup(-1973696187);
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt$LinkedBusinessesListPreview$1$1$1$1$1$1$1 rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent, kotlin.Unit>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentPreviewsKt$LinkedBusinessesListPreview$1$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent businessesHubUiEvent) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessesHubUiEvent, "");
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.LinkedBusinessListItem(linkedBusinessAgreementItemUiModel, false, (kotlin.jvm.functions.Function1) rememberedValue, i, null, composer, (((i3 & 126) << 6) & 7168) | 432, 16);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel access$createItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel(str, str2, fundingInstrumentUiModel, balancePreference, fundingInstrumentUiModel2, null, null, 96, null);
    }
}

package com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"\u0010\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"\u0010\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"\u0010\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"CategoryCardComponent", "", "categoryCard", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryCardBaseWidth", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "CategoryCardBaseHeight", "CategoryCardMaxWidth", "CategoryCardMaxHeight", "CategoryCardComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CategoryCardComponentKt {
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(140.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(192.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(270.0f);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(390.0f);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategoryCardComponent(final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-784386099);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(categoryCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-784386099, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponent (CategoryCardComponent.kt:57)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(modifier4, com.paypal.oslo.feature.searchandintelligence.ui.accessibility.FontScaleBasedSizeKt.m19175fontScaleBasedSizei1RSzL4(getHighResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap, startRestartGroup, 54)), com.paypal.oslo.feature.searchandintelligence.ui.accessibility.FontScaleBasedSizeKt.m19175fontScaleBasedSizei1RSzL4(getHighSpeedVideoSizes, getHighSpeedVideoFpsRangesFor, startRestartGroup, 54)), "categoryCard_".concat(java.lang.String.valueOf(categoryCard.getName())));
                com.paypal.pds.core.Color.BackgroundContainerFilled backgroundContainerFilled = com.paypal.pds.core.Color.BackgroundContainerFilled.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(testTag, backgroundContainerFilled, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, function0, com.paypal.pds.components.CardPadding.Padding0, com.paypal.pds.components.CardCornerRadius.Radius24, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2090824999, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt.$r8$lambda$nB78Yf2SfNshCEPC8YFc79LzBYo(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 807075888 | ((i3 << 9) & 57344), 388);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt.$r8$lambda$VknsofaMfXDMo4jBYHjakJkeBD8(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard.this, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VknsofaMfXDMo4jBYHjakJkeBD8(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CategoryCardComponent(categoryCard, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hAW9QalLl1PpRw9AXHkgyKvEVVI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(676726862);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(676726862, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentPreview (CategoryCardComponent.kt:103)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardComponentKt.INSTANCE.getLambda$2019065127$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt.$r8$lambda$hAW9QalLl1PpRw9AXHkgyKvEVVI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nB78Yf2SfNshCEPC8YFc79LzBYo(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2090824999, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponent.<anonymous> (CategoryCardComponent.kt:69)");
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
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(categoryCard.getImageUrl(), null, null, null, null, composer, 0, 30);
            com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter = rememberAsyncImagePainter;
            com.paypal.pds.components.ImageKt.Image(asyncImagePainter, "", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "categoryCardImage"), androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), com.paypal.pds.components.ImageCornerRadius.None, com.paypal.pds.components.ImageAspectRatio.Square, null, composer, 224688, 64);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(categoryCard.getName(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), "categoryCardName"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 196992, 6, 984);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

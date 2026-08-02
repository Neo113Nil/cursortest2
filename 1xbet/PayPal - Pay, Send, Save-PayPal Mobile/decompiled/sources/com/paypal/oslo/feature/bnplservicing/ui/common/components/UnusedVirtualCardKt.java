package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.UNUSED_VIRTUAL_CARD, "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/UnusedVirtualCardModel;", "backgroundImageUrl", "", "onButtonClick", "Lkotlin/Function0;", "buttonText", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "modifier", "Landroidx/compose/ui/Modifier;", "defaultBackgroundColor", "Lcom/paypal/pds/core/Color;", "cardImageContentDescription", "(Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/UnusedVirtualCardModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/commonui/utils/RefText;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Color;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "UnusedVirtualCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "CardAspectRatio", "", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UnusedVirtualCardKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnusedVirtualCard(final com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel unusedVirtualCardModel, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        com.paypal.pds.core.Color color2;
        int i5;
        java.lang.String str3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.pds.core.Color color3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg2;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unusedVirtualCardModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1922089142);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(unusedVirtualCardModel) : startRestartGroup.changedInstance(unusedVirtualCardModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(refText) : startRestartGroup.changedInstance(refText) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                color2 = color;
                i3 |= startRestartGroup.changed(color2) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    str3 = str2;
                } else {
                    str3 = str2;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(str3) ? 1048576 : 524288;
                    }
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    color3 = color2;
                    str4 = str3;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    com.paypal.pds.core.Color color4 = i4 != 0 ? com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE : color2;
                    java.lang.String str5 = i5 != 0 ? null : str3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1922089142, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCard (UnusedVirtualCard.kt:102)");
                    }
                    int i7 = i3;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 1.59f, false, 2, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24())), null, null, true, null, null, function0, startRestartGroup, ((i3 << 12) & 3670016) | 3072, 27), color4, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, (i7 >> 12) & 112, 2), com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.UNUSED_VIRTUAL_CARD);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                    com.paypal.oslo.core.commonui.components.ConstraintsSizeResolver rememberConstraintsSizeResolver = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberConstraintsSizeResolver(startRestartGroup, 0);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean z = (i7 & 112) == 32;
                    boolean changed = startRestartGroup.changed(rememberConstraintsSizeResolver);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.core.commonui.components.ImageRequest.Builder(context).data(str).size(rememberConstraintsSizeResolver).build();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.core.commonui.components.ImageRequest imageRequest = (com.paypal.oslo.core.commonui.components.ImageRequest) rememberedValue;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt.m12582$r8$lambda$QDjl4LziaaRS4N8SNOzHzDt1qI((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(imageRequest, null, null, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable | 3072, 22), str5 == null ? "" : str5, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null).then(rememberConstraintsSizeResolver), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), null, null, null, startRestartGroup, 3072, 112);
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                    m8065copyp1EtxEg = r33.m8065copyp1EtxEg((r48 & 1) != 0 ? r33.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE.getValue(startRestartGroup, 6), (r48 & 2) != 0 ? r33.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r33.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r33.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r33.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r33.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r33.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r33.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r33.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r33.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r33.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r33.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r33.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r33.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r33.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r33.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r33.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r33.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r33.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r33.platformStyle : null, (r48 & 1048576) != 0 ? r33.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r33.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r33.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? com.paypal.pds.core.Typography.BodySmall.INSTANCE.getTextStyle(startRestartGroup, 6).paragraphStyle.getTextMotion() : null);
                    m8065copyp1EtxEg2 = r33.m8065copyp1EtxEg((r48 & 1) != 0 ? r33.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE.getValue(startRestartGroup, 6), (r48 & 2) != 0 ? r33.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r33.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r33.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r33.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r33.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r33.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r33.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r33.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r33.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r33.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r33.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r33.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r33.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r33.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r33.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r33.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r33.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r33.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r33.platformStyle : null, (r48 & 1048576) != 0 ? r33.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r33.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r33.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? com.paypal.pds.core.Typography.HeadingSmall.INSTANCE.getTextStyle(startRestartGroup, 6).paragraphStyle.getTextMotion() : null);
                    m8065copyp1EtxEg3 = r33.m8065copyp1EtxEg((r48 & 1) != 0 ? r33.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE.getValue(startRestartGroup, 6), (r48 & 2) != 0 ? r33.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r33.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r33.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r33.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r33.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r33.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r33.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r33.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r33.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r33.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r33.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r33.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r33.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r33.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r33.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r33.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r33.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r33.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r33.platformStyle : null, (r48 & 1048576) != 0 ? r33.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r33.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r33.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? com.paypal.pds.core.Typography.BodySmall.INSTANCE.getTextStyle(startRestartGroup, 6).paragraphStyle.getTextMotion() : null);
                    androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw(com.paypal.oslo.core.commonui.utils.RefTextKt.value(unusedVirtualCardModel.getCardType(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize40(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.CARD_TYPE), m8065copyp1EtxEg, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, startRestartGroup, 0, 1016);
                    androidx.compose.ui.Modifier align = boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomStart());
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw(unusedVirtualCardModel.getAmount(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.AMOUNT), m8065copyp1EtxEg2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, startRestartGroup, 48, 1016);
                    androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw(com.paypal.oslo.core.commonui.utils.RefTextKt.value(unusedVirtualCardModel.getExpiration(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.EXPIRATION), m8065copyp1EtxEg3, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, startRestartGroup, 48, 1016);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.core.commonui.utils.RefTextKt.value(refText, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | ((i7 >> 9) & 14)), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.MANAGE_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, ((i7 >> 6) & 14) | 1769856, 408);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    color3 = color4;
                    str4 = str5;
                    modifier2 = modifier4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt.$r8$lambda$pdOLdPbEuzmY8YxPnzhZ4nMnvnY(com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel.this, str, function0, refText, modifier2, color3, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            color2 = color;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        color2 = color;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O6tYeoT7MLPbBqGnAY3J9pGj4DA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(818890818);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(818890818, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardPreview (UnusedVirtualCard.kt:206)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel unusedVirtualCardModel = new com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel("$400", com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Expires in 23 hours"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Single-use"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            UnusedVirtualCard(unusedVirtualCardModel, "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Manage or Use Card"), null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 432 | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 9), 112);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardKt.$r8$lambda$O6tYeoT7MLPbBqGnAY3J9pGj4DA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QDj-l4LziaaRS4N8SNOzHzDt1qI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12582$r8$lambda$QDjl4LziaaRS4N8SNOzHzDt1qI(com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
        java.lang.Throwable throwable = error.getResult().getThrowable();
        com.paypal.android.logger.Logger.w$default(logger, "UnusedVirtualCard: failed to load background image. ".concat(java.lang.String.valueOf(throwable != null ? throwable.getMessage() : null)), null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pdOLdPbEuzmY8YxPnzhZ4nMnvnY(com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel unusedVirtualCardModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UnusedVirtualCard(unusedVirtualCardModel, str, function0, refText, modifier, color, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

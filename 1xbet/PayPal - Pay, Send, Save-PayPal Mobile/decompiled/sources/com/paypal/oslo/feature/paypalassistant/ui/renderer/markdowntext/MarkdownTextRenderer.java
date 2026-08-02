package com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownTextRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/MarkdownText;", "Lcom/paypal/oslo/feature/paypalassistant/api/linkhandler/LinkManager;", "linkHandler", "<init>", "(Lcom/paypal/oslo/feature/paypalassistant/api/linkhandler/LinkManager;)V", "content", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "provideAnalyticsConfig", "(Lcom/paypal/oslo/feature/searchandintelligence/api/component/MarkdownText;)Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Render", "(Lcom/paypal/oslo/feature/searchandintelligence/api/component/MarkdownText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/paypalassistant/api/linkhandler/LinkManager;", "Camera2StreamConfigurationMap", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarkdownTextRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager Camera2StreamConfigurationMap;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText> type;

    @javax.inject.Inject
    public MarkdownTextRenderer(com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager linkManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkManager, "");
        this.Camera2StreamConfigurationMap = linkManager;
        this.type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText.class);
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText> getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.AgentMarkdownTextResponseAnalyticsConfig.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText markdownText, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        int i2;
        java.lang.String str;
        androidx.compose.ui.text.AnnotatedString content;
        java.lang.String str2;
        boolean z;
        boolean z2;
        androidx.compose.ui.text.TextStyle textStyle;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg2;
        java.lang.String str3 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markdownText, "");
        composer.startReplaceGroup(388120318);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(388120318, i, -1, "com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer.Render (MarkdownTextRenderer.kt:55)");
        }
        int i3 = 6;
        long value = com.paypal.pds.core.Color.ContentLink.INSTANCE.getValue(composer, 6);
        long value2 = com.paypal.pds.core.Color.ContentMuted.INSTANCE.getValue(composer, 6);
        m8065copyp1EtxEg = r16.m8065copyp1EtxEg((r48 & 1) != 0 ? r16.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(composer, 6), (r48 & 2) != 0 ? r16.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r16.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r16.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r16.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r16.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r16.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r16.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? com.paypal.pds.core.Typography.BodyMedium.INSTANCE.getTextStyle(composer, 6).paragraphStyle.getTextMotion() : null);
        boolean changed = composer.changed(markdownText.getText());
        boolean changed2 = composer.changed(value);
        boolean changed3 = composer.changed(value2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownParser.INSTANCE.m17633parseIbeAmgk(markdownText.getText(), value, value2, new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownTextRenderer$Render$blocks$1$1(this.Camera2StreamConfigurationMap));
            composer.updateRememberedValue(rememberedValue);
        }
        java.util.List<com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock> list = (java.util.List) rememberedValue;
        boolean z3 = false;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, modifier);
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
        composer.startReplaceGroup(-1334296289);
        for (com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock markdownBlock : list) {
            boolean z4 = markdownBlock instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph;
            if (z4 || (markdownBlock instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code)) {
                i2 = i3;
                java.lang.String str4 = str3;
                boolean z5 = z3;
                composer.startReplaceGroup(1586585839);
                if (z4) {
                    content = ((com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph) markdownBlock).getContent();
                    str = str4;
                } else {
                    str = str4;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(markdownBlock, str);
                    content = ((com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code) markdownBlock).getContent();
                }
                str2 = str;
                z = z5;
                androidx.compose.foundation.text.BasicTextKt.m2004BasicTextCL7eQgs(content, null, m8065copyp1EtxEg, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 2042);
                composer.endReplaceGroup();
            } else if (markdownBlock instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading) {
                composer.startReplaceGroup(1586877239);
                com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading heading = (com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading) markdownBlock;
                int level = heading.getLevel();
                if (level == 1) {
                    composer.startReplaceGroup(-1334280303);
                    textStyle = com.paypal.pds.core.Typography.HeadingLarge.INSTANCE.getTextStyle(composer, i3);
                    composer.endReplaceGroup();
                } else if (level == 2) {
                    composer.startReplaceGroup(-1334278127);
                    textStyle = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE.getTextStyle(composer, i3);
                    composer.endReplaceGroup();
                } else if (level == 3) {
                    composer.startReplaceGroup(-1334275471);
                    textStyle = com.paypal.pds.core.Typography.HeadingSmall.INSTANCE.getTextStyle(composer, i3);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1334273295);
                    textStyle = com.paypal.pds.core.Typography.BodyMedium.INSTANCE.getTextStyle(composer, i3);
                    composer.endReplaceGroup();
                }
                m8065copyp1EtxEg2 = r18.m8065copyp1EtxEg((r48 & 1) != 0 ? r18.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(composer, i3), (r48 & 2) != 0 ? r18.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r18.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r18.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r18.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r18.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r18.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r18.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r18.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r18.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r18.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r18.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r18.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r18.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r18.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r18.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r18.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r18.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r18.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r18.platformStyle : null, (r48 & 1048576) != 0 ? r18.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r18.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r18.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
                i2 = i3;
                androidx.compose.foundation.text.BasicTextKt.m2004BasicTextCL7eQgs(heading.getContent(), null, m8065copyp1EtxEg2, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 2042);
                composer.endReplaceGroup();
                str2 = str3;
                z = false;
            } else {
                i2 = i3;
                java.lang.String str5 = str3;
                if (markdownBlock instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem) {
                    composer.startReplaceGroup(1587442679);
                    com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem listItem = (com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem) markdownBlock;
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl((listItem.getDepth() * 16) + 8), 0.0f, 0.0f, 0.0f, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw(listItem.getPrefix(), androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)), m8065copyp1EtxEg, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, composer, 48, 1016);
                    androidx.compose.foundation.text.BasicTextKt.m2004BasicTextCL7eQgs(listItem.getContent(), null, m8065copyp1EtxEg, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 2042);
                    composer.endNode();
                    composer.endReplaceGroup();
                    z2 = false;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(markdownBlock, com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.BlankLine.INSTANCE)) {
                        composer.startReplaceGroup(-1334295063);
                        composer.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1588112062);
                    z2 = false;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
                    composer.endReplaceGroup();
                }
                z = z2;
                str2 = str5;
            }
            i3 = i2;
            z3 = z;
            str3 = str2;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}

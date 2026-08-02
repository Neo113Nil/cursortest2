package com.paypal.oslo.feature.mosaic.ui.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"MosaicTextWithLinks", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;", "onLinkClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildAnnotatedStringWithLinks", "Landroidx/compose/ui/text/AnnotatedString;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "mosaic_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicTextWithLinksKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicTextWithLinks(final com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(242246988);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mosaicTypographyTextDisplayModel) ? 4 : 2) | i;
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
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(242246988, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinks (MosaicTextWithLinks.kt:38)");
                }
                int i5 = i3 & 14;
                final androidx.compose.ui.text.AnnotatedString buildAnnotatedStringWithLinks = buildAnnotatedStringWithLinks(mosaicTypographyTextDisplayModel, startRestartGroup, i5);
                m8065copyp1EtxEg = r16.m8065copyp1EtxEg((r48 & 1) != 0 ? r16.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(startRestartGroup, 6), (r48 & 2) != 0 ? r16.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r16.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r16.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.getTextAlign() : com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.getTextAlignment(mosaicTypographyTextDisplayModel), (r48 & 65536) != 0 ? r16.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r16.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r16.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r16.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.getTextStyle(mosaicTypographyTextDisplayModel, startRestartGroup, i5).paragraphStyle.getTextMotion() : null);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(mosaicTypographyTextDisplayModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt.m15780$r8$lambda$aH8j5H13sxAgYvgJaD9JQtSU4(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                boolean changed = startRestartGroup.changed(buildAnnotatedStringWithLinks);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt.$r8$lambda$2xtWFK9_9dm21AqxTaO84eiurjQ(androidx.compose.ui.text.AnnotatedString.this, function1, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.foundation.text.ClickableTextKt.m2012ClickableText4YKlhWE(buildAnnotatedStringWithLinks, semantics$default, m8065copyp1EtxEg, false, 0, 0, null, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 120);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt.$r8$lambda$N0PQlFY_8_NgYRqaxIRH4Zff4jo(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final androidx.compose.ui.text.AnnotatedString buildAnnotatedStringWithLinks(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        composer.startReplaceGroup(640006879);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(640006879, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.buildAnnotatedStringWithLinks (MosaicTextWithLinks.kt:76)");
        }
        java.util.Map<java.lang.String, com.paypal.oslo.feature.mosaic.domain.model.EmbeddedLink> embeddedLinks = mosaicTypographyTextDisplayModel.getEmbeddedLinks();
        if (embeddedLinks != null) {
            java.lang.String interpolateContent = com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.interpolateContent(mosaicTypographyTextDisplayModel);
            java.util.ArrayList<com.paypal.oslo.feature.mosaic.domain.model.LinkData> arrayList = new java.util.ArrayList();
            java.lang.String str = interpolateContent;
            for (java.util.Map.Entry<java.lang.String, com.paypal.oslo.feature.mosaic.domain.model.EmbeddedLink> entry : embeddedLinks.entrySet()) {
                java.lang.String key = entry.getKey();
                com.paypal.oslo.feature.mosaic.domain.model.EmbeddedLink value = entry.getValue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
                sb.append(key);
                sb.append("}");
                str = kotlin.text.StringsKt.replace$default(str, sb.toString(), key, false, 4, (java.lang.Object) null);
                arrayList.add(new com.paypal.oslo.feature.mosaic.domain.model.LinkData(key, value.getLink()));
            }
            androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
            builder.append(str);
            composer.startReplaceGroup(866307447);
            for (com.paypal.oslo.feature.mosaic.domain.model.LinkData linkData : arrayList) {
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, linkData.getText(), 0, false, 6, (java.lang.Object) null);
                if (indexOf$default >= 0) {
                    composer.startReplaceGroup(972272273);
                    int length = linkData.getText().length() + indexOf$default;
                    builder.addStringAnnotation("URL", linkData.getUrl(), indexOf$default, length);
                    builder.addStyle(new androidx.compose.ui.text.SpanStyle(com.paypal.pds.core.Color.ContentLink.INSTANCE.getValue(composer, 6), 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61438, (kotlin.jvm.internal.DefaultConstructorMarker) null), indexOf$default, length);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(972943051);
                    composer.endReplaceGroup();
                }
            }
            composer.endReplaceGroup();
            androidx.compose.ui.text.AnnotatedString annotatedString = builder.toAnnotatedString();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedString;
        }
        androidx.compose.ui.text.AnnotatedString annotatedString2 = new androidx.compose.ui.text.AnnotatedString(com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.interpolateContent(mosaicTypographyTextDisplayModel), null, 2, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2xtWFK9_9dm21AqxTaO84eiurjQ(androidx.compose.ui.text.AnnotatedString annotatedString, kotlin.jvm.functions.Function1 function1, int i) {
        androidx.compose.ui.text.AnnotatedString.Range range = (androidx.compose.ui.text.AnnotatedString.Range) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) annotatedString.getStringAnnotations("URL", i, i));
        if (range != null) {
            function1.invoke(range.getItem());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N0PQlFY_8_NgYRqaxIRH4Zff4jo(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicTextWithLinks(mosaicTypographyTextDisplayModel, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aH8j5H13sx-AgYv-gJaD9JQtSU4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15780$r8$lambda$aH8j5H13sxAgYvgJaD9JQtSU4(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(mosaicTypographyTextDisplayModel.getType(), "HEADING")) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        }
        return kotlin.Unit.INSTANCE;
    }
}

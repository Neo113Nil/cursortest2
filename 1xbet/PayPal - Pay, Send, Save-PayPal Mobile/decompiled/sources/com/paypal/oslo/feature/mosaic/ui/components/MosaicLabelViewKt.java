package com.paypal.oslo.feature.mosaic.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"MosaicLabelView", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicLabelViewKt {
    public static final void MosaicLabelView(final com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1602267303);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mosaicTypographyTextDisplayModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1602267303, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.MosaicLabelView (MosaicLabelView.kt:29)");
            }
            final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
            java.util.Map<java.lang.String, com.paypal.oslo.feature.mosaic.domain.model.EmbeddedLink> embeddedLinks = mosaicTypographyTextDisplayModel.getEmbeddedLinks();
            if (embeddedLinks != null && !embeddedLinks.isEmpty()) {
                startRestartGroup.startReplaceGroup(1121510099);
                boolean changedInstance = startRestartGroup.changedInstance(uriHandler);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicLabelViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = com.paypal.oslo.feature.mosaic.ui.components.MosaicLabelViewKt.getHighSpeedVideoSizes(androidx.compose.ui.platform.UriHandler.this, (java.lang.String) obj);
                            return highSpeedVideoSizes;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.mosaic.ui.components.MosaicTextWithLinksKt.MosaicTextWithLinks(mosaicTypographyTextDisplayModel, (kotlin.jvm.functions.Function1) rememberedValue, modifier, startRestartGroup, (i3 & 14) | ((i3 << 3) & 896), 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1121878596);
                com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt.MosaicTextLabel(mosaicTypographyTextDisplayModel, modifier, startRestartGroup, i3 & 126, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicLabelViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.MosaicLabelViewKt.$r8$lambda$O3ZN1gUtsG3HDr6aKBfyEjm2QbU(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            uriHandler.openUri(str);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.mosaic.LoggerKt.log.e("No activity found to handle URI: ".concat(java.lang.String.valueOf(str)), e);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O3ZN1gUtsG3HDr6aKBfyEjm2QbU(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicLabelView(mosaicTypographyTextDisplayModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

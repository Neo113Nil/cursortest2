package com.paypal.oslo.feature.mosaic.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"MosaicTextLabel", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicTextLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicTextLabel(final com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(496009881);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mosaicTypographyTextDisplayModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(496009881, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabel (MosaicTextLabel.kt:30)");
                }
                java.lang.String interpolateContent = com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.interpolateContent(mosaicTypographyTextDisplayModel);
                com.paypal.pds.core.Typography typography = com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.getTypography(mosaicTypographyTextDisplayModel);
                int textAlignment = com.paypal.oslo.feature.mosaic.ui.components.MosaicComponentExtensionsKt.getTextAlignment(mosaicTypographyTextDisplayModel);
                com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(mosaicTypographyTextDisplayModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt.m15779$r8$lambda$zLc3cOfTWaVHFeFeLiSq3Mzo(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(interpolateContent, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(textAlignment), null, false, 0, 0, null, typography, startRestartGroup, 384, 0, 1000);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt.m15778$r8$lambda$rWdBhJIe2iPfmA7nRRZieKeo0s(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$rW-dBhJIe2iPfmA7nRRZieKeo0s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15778$r8$lambda$rWdBhJIe2iPfmA7nRRZieKeo0s(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicTextLabel(mosaicTypographyTextDisplayModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zLc-3cOf-TWaVHFeFeL-iSq3Mzo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15779$r8$lambda$zLc3cOfTWaVHFeFeLiSq3Mzo(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(mosaicTypographyTextDisplayModel.getType(), "HEADING")) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        }
        return kotlin.Unit.INSTANCE;
    }
}

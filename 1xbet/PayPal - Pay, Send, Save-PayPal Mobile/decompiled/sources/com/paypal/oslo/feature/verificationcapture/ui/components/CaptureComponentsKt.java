package com.paypal.oslo.feature.verificationcapture.ui.components;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0002\u0010\r\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0018\u001aM\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010 \u001a1\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0002\u0010&\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"ID_CARD_WIDTH_RATIO", "", "ID_CARD_HEIGHT_RATIO", "ID_CARD_CORNER_RADIUS_DP", "", "TopActionBar", "", "showFlashButton", "", "isFlashEnabled", "onToggleFlash", "Lkotlin/Function0;", "onBack", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GuidanceContent", "titleRichText", "Lcom/paypal/pds/core/RichText;", "contentText", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/pds/core/RichText;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SuccessCheckmark", "visible", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ScanRegionOverlay", "showError", "showSuccess", "showCheckmark", "capturedImage", "Landroid/graphics/Bitmap;", "hintText", "(Landroidx/compose/ui/Modifier;ZZZLandroid/graphics/Bitmap;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalTestTag.ERROR_BANNER, "error", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;", "onDismiss", "onRetry", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "verification-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CaptureComponentsKt {
    public static final void TopActionBar(final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2004539476);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2004539476, i2, -1, "com.paypal.oslo.feature.verificationcapture.ui.components.TopActionBar (CaptureComponents.kt:83)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f), 0.0f, 8, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_back_button_accessibility, startRestartGroup, 0), androidx.compose.foundation.ClickableKt.m1322clickableoSLSa3U$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null)), false, null, null, null, function02, 15, null), null, com.paypal.pds.core.Color.ContentBrandSecondary.INSTANCE, startRestartGroup, 24582, 8);
            if (z) {
                startRestartGroup.startReplaceGroup(396921532);
                com.paypal.pds.core.Icon icon = z2 ? com.paypal.pds.core.Icon.Lightning.INSTANCE : com.paypal.pds.core.Icon.LightningSlash.INSTANCE;
                if (z2) {
                    i3 = com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_camera_flash_on_accessibility;
                } else {
                    i3 = com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_camera_flash_off_accessibility;
                }
                com.paypal.pds.components.IconKt.Icon(icon, androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, startRestartGroup, 0), androidx.compose.foundation.ClickableKt.m1322clickableoSLSa3U$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("flash_button", 0, 2, null)), false, null, null, null, function0, 15, null), null, com.paypal.pds.core.Color.ContentBrandSecondary.INSTANCE, startRestartGroup, 24576, 8);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(397598386);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt.$r8$lambda$LsXvnZkSIMjWhVwpWJtHDIndqXc(z, z2, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GuidanceContent(final com.paypal.pds.core.RichText richText, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1796985202);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(richText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1796985202, i4, -1, "com.paypal.oslo.feature.verificationcapture.ui.components.GuidanceContent (CaptureComponents.kt:133)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(70.0f), 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, 2, null), com.paypal.pds.core.Color.ContentBrandSecondary.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, null, composer2, (i4 & 14) | 432, 48, 6120);
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentInverse contentInverse = com.paypal.pds.core.Color.ContentInverse.INSTANCE;
                int m8443getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, 8, null), contentInverse, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk), null, false, 0, 0, null, bodyMedium, composer2, ((i4 >> 3) & 14) | 384, 6, 1000);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt.m20626$r8$lambda$r5FpSe_uvPnX1bZSNEz0T0U_WQ(com.paypal.pds.core.RichText.this, str, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SuccessCheckmark(final boolean z, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-484445197);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-484445197, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.components.SuccessCheckmark (CaptureComponents.kt:169)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1016631496);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_scan_front_success_accessibility, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier, androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f)), null, com.paypal.pds.core.Color.BorderRoleBasePositive.INSTANCE, startRestartGroup, 24582, 8);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1016326673);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt.$r8$lambda$xf2tgZds7wZVzoTEqPYIkvPCADM(z, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScanRegionOverlay(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, boolean z3, android.graphics.Bitmap bitmap, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        int i7;
        final android.graphics.Bitmap bitmap2;
        final java.lang.String str2;
        final boolean z7;
        final boolean z8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        long m6031getTransparent0d7_KjU;
        long m6033getWhite0d7_KjU;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-199660014);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z;
            i3 |= startRestartGroup.changed(z4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z5 = z2;
                i3 |= startRestartGroup.changed(z5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z6 = z3;
                    i3 |= startRestartGroup.changed(z6) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(bitmap) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            bitmap2 = bitmap;
                            str2 = str;
                            z7 = z4;
                            z8 = z5;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            z7 = i9 != 0 ? false : z4;
                            z8 = i4 != 0 ? false : z5;
                            boolean z9 = i5 != 0 ? false : z6;
                            android.graphics.Bitmap bitmap3 = i6 != 0 ? null : bitmap;
                            java.lang.String str3 = i7 != 0 ? null : str;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-199660014, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.components.ScanRegionOverlay (CaptureComponents.kt:195)");
                            }
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(140.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, 8, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                            androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.3664596f, false, 2, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)));
                            if (z7) {
                                m6031getTransparent0d7_KjU = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6030getRed0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                m6031getTransparent0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
                            }
                            androidx.compose.ui.Modifier m1285backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(clip, m6031getTransparent0d7_KjU, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)));
                            float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.5f);
                            if (z7) {
                                m6033getWhite0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m6030getRed0d7_KjU();
                            } else if (z8) {
                                m6033getWhite0d7_KjU = androidx.compose.ui.graphics.ColorKt.Color(4280916342L);
                            } else {
                                m6033getWhite0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU();
                            }
                            androidx.compose.ui.Modifier m1297borderxT4_qwU = androidx.compose.foundation.BorderKt.m1297borderxT4_qwU(m1285backgroundbw27NRU, m8601constructorimpl, m6033getWhite0d7_KjU, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)));
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1297borderxT4_qwU);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            if (bitmap3 != null) {
                                startRestartGroup.startReplaceGroup(1675078501);
                                androidx.compose.foundation.ImageKt.m1335Image5hnEew(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap3), null, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, startRestartGroup, 25008, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1675338932);
                                startRestartGroup.endReplaceGroup();
                            }
                            java.lang.String str4 = str3;
                            if (str4 != null && str4.length() != 0) {
                                startRestartGroup.startReplaceGroup(1675476386);
                                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f))), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                java.lang.String str5 = str3;
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str5, null, com.paypal.pds.core.Color.ContentBrandSecondary.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, ((i3 >> 15) & 14) | 384, 6, 1002);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1676077972);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (z9) {
                                startRestartGroup.startReplaceGroup(-195123975);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), startRestartGroup, 6);
                                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_scan_front_success_accessibility, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f)), null, com.paypal.pds.core.Color.BorderRoleBasePositive.INSTANCE, startRestartGroup, 24966, 8);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-194723238);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z6 = z9;
                            bitmap2 = bitmap3;
                            str2 = str3;
                            modifier2 = companion;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final boolean z10 = z6;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt.m20625$r8$lambda$zKfMtJ2fRGeshaO1WpG4GvgIbA(androidx.compose.ui.Modifier.this, z7, z8, z10, bitmap2, str2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z6 = z3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z5 = z2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z6 = z3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z4 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z6 = z3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ErrorBanner(final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1418445236);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(uiError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1418445236, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBanner (CaptureComponents.kt:287)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions errorBannerDimensions = com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.INSTANCE;
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(fillMaxWidth$default, com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.Camera2StreamConfigurationMap());
            com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions errorBannerDimensions2 = com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.INSTANCE;
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(m1706padding3ABfNKs, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.getHighResolutionOutputSizeshNQ4ISI())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions errorBannerDimensions3 = com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.INSTANCE;
            androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(companion, com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.Camera2StreamConfigurationMap());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs2);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(uiError.getMessage(), null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            if (uiError.isRecoverable()) {
                startRestartGroup.startReplaceGroup(-2109950675);
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions errorBannerDimensions4 = com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.INSTANCE;
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(fillMaxWidth$default2, 0.0f, com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.getHighSpeedVideoFpsRanges(), 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, ((i3 >> 3) & 14) | 1769520, 412);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions errorBannerDimensions5 = com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.INSTANCE;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(companion2, com.paypal.oslo.feature.verificationcapture.ui.components.ErrorBannerDimensions.getHighSpeedVideoFpsRanges()), composer2, 6);
                com.paypal.pds.components.ButtonKt.Button(function02, "Retry", null, null, null, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer2, ((i3 >> 6) & 14) | 1572912, 444);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-2109177070);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.components.CaptureComponentsKt.$r8$lambda$CfYeFuoH5mMaSLjqHfcVz68Fp0A(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-zKfMtJ2fRGeshaO1WpG4GvgIbA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20625$r8$lambda$zKfMtJ2fRGeshaO1WpG4GvgIbA(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, boolean z3, android.graphics.Bitmap bitmap, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ScanRegionOverlay(modifier, z, z2, z3, bitmap, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CfYeFuoH5mMaSLjqHfcVz68Fp0A(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ErrorBanner(uiError, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LsXvnZkSIMjWhVwpWJtHDIndqXc(boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        TopActionBar(z, z2, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r5FpSe_u-vPnX1bZSNEz0T0U_WQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20626$r8$lambda$r5FpSe_uvPnX1bZSNEz0T0U_WQ(com.paypal.pds.core.RichText richText, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GuidanceContent(richText, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xf2tgZds7wZVzoTEqPYIkvPCADM(boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SuccessCheckmark(z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

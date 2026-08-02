package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;", "bugReportError", "Lkotlin/Function0;", "", "onDismiss", "ResultErrorModal", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "bugReportSuccess", "ResultSuccessModal", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NotAuthenticatedModal", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ResultModalsKt {
    public static final void ResultErrorModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.shaketoreport.domain.BugReportError bugReportError, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-969598677);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(bugReportError) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-969598677, i2, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultErrorModal (ResultModals.kt:52)");
            }
            final boolean z = (bugReportError != null ? bugReportError.getType() : null) == com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.AUTHENTICATION;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, null, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-28026702, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.$r8$lambda$7Omh9Vq7ReXerxk9t46MMw7g5Rs(z, bugReportError, bottomSheetController, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i2 & 14) | ((i2 >> 3) & 112), androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.$r8$lambda$Jt2fS3Vt0_lYq0V34FKGaO5n0q0(com.paypal.pds.components.BottomSheetController.this, bugReportError, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ResultSuccessModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1290331317);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(bugReportSuccess) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1290331317, i2, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultSuccessModal (ResultModals.kt:149)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, null, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-591460164, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.$r8$lambda$bfMPhsmUKuh9zwtkwyHJthh6FY8(com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess.this, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i2 & 14) | ((i2 >> 3) & 112), androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.m19364$r8$lambda$DSGHIVB_ffMhG5ywH45Ek6w8Cs(com.paypal.pds.components.BottomSheetController.this, bugReportSuccess, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NotAuthenticatedModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1329785420);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1329785420, i2, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.NotAuthenticatedModal (ResultModals.kt:229)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, null, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1398129147, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.m19366$r8$lambda$KY_9NsYPr6S6vAZoLoWylXbgA(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i2 & 14) | (i2 & 112), androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.m19367$r8$lambda$h2oTPi2OzgQNKiMu5hd8ipRI0E(com.paypal.pds.components.BottomSheetController.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7Omh9Vq7ReXerxk9t46MMw7g5Rs(boolean z, com.paypal.oslo.feature.shaketoreport.domain.BugReportError bugReportError, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String message;
        kotlin.Unit unit;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-28026702, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultErrorModal.<anonymous> (ResultModals.kt:59)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(z ? com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_authentication_title : com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_title, composer, 0), null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 1, null), composer, 6);
            if (bugReportError == null) {
                composer.startReplaceGroup(-1481865059);
                composer.endReplaceGroup();
                unit = null;
            } else {
                composer.startReplaceGroup(-1481865058);
                if (z) {
                    composer.startReplaceGroup(517634553);
                    message = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_authentication_message, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(517770457);
                    composer.endReplaceGroup();
                    message = bugReportError.getMessage();
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(message, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                if (z) {
                    composer.startReplaceGroup(519604510);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(518018860);
                    java.lang.Integer code = bugReportError.getCode();
                    if (code == null) {
                        composer.startReplaceGroup(518016379);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(518016380);
                        int intValue = code.intValue();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_http_code, new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        composer.endReplaceGroup();
                    }
                    java.lang.String details = bugReportError.getDetails();
                    if (details == null || details.length() <= 0) {
                        composer.startReplaceGroup(518778174);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(518433175);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_details, new java.lang.Object[]{bugReportError.getDetails()}, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        composer.endReplaceGroup();
                    }
                    java.lang.String correlationId = bugReportError.getCorrelationId();
                    if (correlationId == null) {
                        composer.startReplaceGroup(518834934);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(518834935);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_correlation_id, new java.lang.Object[]{correlationId}, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        composer.endReplaceGroup();
                    }
                    java.lang.String paypalDebugId = bugReportError.getPaypalDebugId();
                    if (paypalDebugId == null) {
                        composer.startReplaceGroup(519236725);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(519236726);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_paypal_debug_id, new java.lang.Object[]{paypalDebugId}, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                unit = kotlin.Unit.INSTANCE;
            }
            if (unit == null) {
                composer.startReplaceGroup(-1433209773);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_unknown, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1433275741);
                composer.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 1, null), composer, 6);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_button_ok, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.$r8$lambda$ChtRGt2TOqvllLQcZp0uvSNWiHE(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, navigationBarsPadding, null, null, primary, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9cGnAHKSzyh-DNhvTMTeXuimj_M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19363$r8$lambda$9cGnAHKSzyhDNhvTMTeXuimj_M(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-692531050);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-692531050, updateChangedFlags, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportModalErrorPreview (ResultModals.kt:320)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.shaketoreport.domain.BugReportError bugReportError = new com.paypal.oslo.feature.shaketoreport.domain.BugReportError(com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.API, 400, null, "Something went wrong", null, "123456789", "123456789", 20, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$BugReportModalErrorPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$BugReportModalErrorPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ResultErrorModal(bottomSheetController, bugReportError, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.m19363$r8$lambda$9cGnAHKSzyhDNhvTMTeXuimj_M(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ChtRGt2TOqvllLQcZp0uvSNWiHE(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DSG-HIVB_ffMhG5ywH45Ek6w8Cs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19364$r8$lambda$DSGHIVB_ffMhG5ywH45Ek6w8Cs(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ResultSuccessModal(bottomSheetController, bugReportSuccess, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IITdevfugO0khe8kLlukDs-zwgo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19365$r8$lambda$IITdevfugO0khe8kLlukDszwgo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-699281938);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-699281938, updateChangedFlags, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportModalAuthenticationErrorPreview (ResultModals.kt:348)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.shaketoreport.domain.BugReportError bugReportError = new com.paypal.oslo.feature.shaketoreport.domain.BugReportError(com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.AUTHENTICATION, 401, null, "Unauthorized", null, null, null, 116, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$BugReportModalAuthenticationErrorPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$BugReportModalAuthenticationErrorPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ResultErrorModal(bottomSheetController, bugReportError, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.m19365$r8$lambda$IITdevfugO0khe8kLlukDszwgo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jt2fS3Vt0_lYq0V34FKGaO5n0q0(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.shaketoreport.domain.BugReportError bugReportError, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ResultErrorModal(bottomSheetController, bugReportError, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KY_9NsYPr6S6vAZoLo-WylXbg-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19366$r8$lambda$KY_9NsYPr6S6vAZoLoWylXbgA(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1398129147, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.NotAuthenticatedModal.<anonymous> (ResultModals.kt:234)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_not_authenticated_title, composer, 0), null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 1, null), composer, 6);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_not_authenticated_message, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 1, null), composer, 6);
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_button_close, composer, 0), androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bfMPhsmUKuh9zwtkwyHJthh6FY8(com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object obj;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-591460164, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultSuccessModal.<anonymous> (ResultModals.kt:154)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_success_title, composer, 0), null, com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 1, null), composer, 6);
            if (bugReportSuccess == null) {
                composer.startReplaceGroup(878114556);
                obj = null;
            } else {
                composer.startReplaceGroup(878114557);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(bugReportSuccess.getMessage(), null, com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(bugReportSuccess.getMediaAttached() ? com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_success_screenshot_attached : com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_success_screenshot_not_attached, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                java.lang.String correlationId = bugReportSuccess.getCorrelationId();
                if (correlationId == null) {
                    composer.startReplaceGroup(-213862604);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-213862603);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_correlation_id, new java.lang.Object[]{correlationId}, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    composer.endReplaceGroup();
                }
                java.lang.String paypalDebugId = bugReportSuccess.getPaypalDebugId();
                if (paypalDebugId == null) {
                    composer.startReplaceGroup(-213485613);
                    composer.endReplaceGroup();
                    obj = null;
                } else {
                    composer.startReplaceGroup(-213485612);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f), 1, null), composer, 6);
                    obj = null;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_error_paypal_debug_id, new java.lang.Object[]{paypalDebugId}, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    composer.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            composer.endReplaceGroup();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 1, obj), composer, 6);
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_button_ok, composer, 0), androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h2oTPi2OzgQNK-iMu5hd8ipRI0E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19367$r8$lambda$h2oTPi2OzgQNKiMu5hd8ipRI0E(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        NotAuthenticatedModal(bottomSheetController, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j6IIS0o6DcCmETcLpLmnODeGZEw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-84604504);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-84604504, updateChangedFlags, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.NotAuthenticatedModalPreview (ResultModals.kt:273)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$NotAuthenticatedModalPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$NotAuthenticatedModalPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            NotAuthenticatedModal(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.$r8$lambda$j6IIS0o6DcCmETcLpLmnODeGZEw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$t_GheCEJeA7x815Fg-5FYr5cdMI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19369$r8$lambda$t_GheCEJeA7x815Fg5FYr5cdMI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(411378299);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(411378299, updateChangedFlags, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportModalSuccessPreview (ResultModals.kt:293)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess = new com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess("Ticket created successfully!", true, "corr-123456789", "debug-987654321");
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$BugReportModalSuccessPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$BugReportModalSuccessPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ResultSuccessModal(bottomSheetController, bugReportSuccess, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.m19369$r8$lambda$t_GheCEJeA7x815Fg5FYr5cdMI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}

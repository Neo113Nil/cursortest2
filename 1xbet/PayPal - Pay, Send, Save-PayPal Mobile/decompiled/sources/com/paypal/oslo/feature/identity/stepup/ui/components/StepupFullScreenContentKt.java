package com.paypal.oslo.feature.identity.stepup.ui.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"StepupFullScreenContent", "", "challengeDataList", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "onChallengeSelect", "Lkotlin/Function1;", "exhaustedChallengeType", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "validationError", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;Landroidx/compose/runtime/Composer;II)V", "getErrorHeader", "", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "StepupFullScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "StepupFullScreenContentSecurityQuestionFailedPreview", "StepupFullScreenContentVerificationLimitPreview", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepupFullScreenContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StepupFullScreenContent(final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData, kotlin.Unit> function1, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError2;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2;
        final com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        ?? r0;
        ?? r5;
        com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError4;
        com.paypal.pds.components.SelectionCardModel create;
        int i3;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2018959760);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(challengeType == null ? -1 : challengeType.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            stepupValidationError2 = stepupValidationError;
            i4 |= startRestartGroup.changed(stepupValidationError2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                challengeType2 = challengeType;
                stepupValidationError3 = stepupValidationError2;
            } else {
                challengeType2 = i5 != 0 ? null : challengeType;
                com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError5 = i6 != 0 ? null : stepupValidationError2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2018959760, i4, -1, "com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContent (StepupFullScreenContent.kt:61)");
                }
                boolean z = (challengeType2 == null && stepupValidationError5 == null) ? false : true;
                com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError6 = stepupValidationError5;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, null, startRestartGroup, 6, 126);
                androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing32(), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing24());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1604spacedByD5KLDUw(com.paypal.pds.core.ConstantsKt.getSpacing32(), androidx.compose.ui.Alignment.INSTANCE.getTop()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1709paddingqDBjuR0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (z) {
                    startRestartGroup.startReplaceGroup(1176474477);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1740size3ABfNKs);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    r0 = 0;
                    r5 = 1;
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Info.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_info_icon, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 28038, 0);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    int i7 = (i4 >> 6) & 126;
                    startRestartGroup.startReplaceGroup(1130952310);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        i3 = -1;
                        androidx.compose.runtime.ComposerKt.traceEventStart(1130952310, i7, -1, "com.paypal.oslo.feature.identity.stepup.ui.components.getErrorHeader (StepupFullScreenContent.kt:155)");
                    } else {
                        i3 = -1;
                    }
                    boolean z2 = stepupValidationError6 instanceof com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded;
                    if (z2) {
                        startRestartGroup.startReplaceGroup(-1817880430);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_choose_another_way, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(-1817793940);
                        startRestartGroup.endReplaceGroup();
                        if (challengeType2 != null) {
                            i3 = com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.WhenMappings.$EnumSwitchMapping$0[challengeType2.ordinal()];
                        }
                        switch (i3) {
                            case 1:
                                startRestartGroup.startReplaceGroup(218461951);
                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_security_question_failed, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case 2:
                                startRestartGroup.startReplaceGroup(218465497);
                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_credit_card_failed, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                startRestartGroup.startReplaceGroup(218474897);
                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_otp_failed, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                break;
                            default:
                                startRestartGroup.startReplaceGroup(218477338);
                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_max_attempts_header, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                break;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    startRestartGroup.endReplaceGroup();
                    stepupValidationError4 = stepupValidationError6;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 2, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 12583344, 6, 872);
                    if (z2) {
                        startRestartGroup.startReplaceGroup(-966848797);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_verification_limit_subtitle, new java.lang.Object[]{((com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded) stepupValidationError4).getMaskedTarget()}, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1000);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-966247211);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    r0 = 0;
                    r5 = 1;
                    stepupValidationError4 = stepupValidationError6;
                    startRestartGroup.startReplaceGroup(1178286582);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_choose_how_to_continue, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 2, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 12583344, 6, 872);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(r0, r5, null);
                startRestartGroup.startReplaceGroup(-516163733);
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData : list2) {
                    create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(challengeData.getSelectedChallenge().getId(), (r18 & 2) != 0 ? null : com.paypal.oslo.feature.identity.stepup.ui.ChallengeDisplayUtilsKt.getChallengeTitle(challengeData, startRestartGroup, r0), (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? com.paypal.oslo.feature.identity.stepup.ui.ChallengeDisplayUtilsKt.getChallengeIcon(challengeData) : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : com.paypal.pds.components.IconSize.Medium.INSTANCE, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                    arrayList.add(create);
                }
                java.util.ArrayList arrayList2 = arrayList;
                startRestartGroup.endReplaceGroup();
                boolean z3 = (i4 & 112) == 32 ? r5 : r0;
                boolean changedInstance = startRestartGroup.changedInstance(list);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$7VpgfqViBU4dmv9esVlTK5BnvY8(kotlin.jvm.functions.Function1.this, list, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical, arrayList2, (kotlin.jvm.functions.Function2) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, r5, null), null, false, null, startRestartGroup, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable | 3072, 112);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                stepupValidationError3 = stepupValidationError4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = challengeType2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$wn8ktOcGhjKgo5sDnrxzjYjHW6o(list, function1, challengeType3, stepupValidationError3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        stepupValidationError2 = stepupValidationError;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$0u0sTZF33n-SVH4uiO1K6ZEa988, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15372$r8$lambda$0u0sTZF33nSVH4uiO1K6ZEa988(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7QGvsEqprYCEj4CHAUz7E0I2lsQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(12803344);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(12803344, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentVerificationLimitPreview (StepupFullScreenContent.kt:285)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("email_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL, true, kotlin.collections.CollectionsKt.emptyList(), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.m15372$r8$lambda$0u0sTZF33nSVH4uiO1K6ZEa988((com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StepupFullScreenContent(listOf, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS, new com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.VerificationLimitExceeded("1(2••) ••••-0418"), startRestartGroup, 432, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$7QGvsEqprYCEj4CHAUz7E0I2lsQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7VpgfqViBU4dmv9esVlTK5BnvY8(kotlin.jvm.functions.Function1 function1, java.util.List list, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        function1.invoke(list.get(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B_jB06hjvnMsebhiNorvCxDsYNg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(746253883);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(746253883, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentSecurityQuestionFailedPreview (StepupFullScreenContent.kt:245)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData[]{new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("whatsapp_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP, true, kotlin.collections.CollectionsKt.emptyList(), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("email_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL, true, kotlin.collections.CollectionsKt.emptyList(), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$wPL941LaT0AFgAZpssY5ZpaKQ38((com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StepupFullScreenContent(listOf, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached.INSTANCE, startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$B_jB06hjvnMsebhiNorvCxDsYNg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$abmLLYu57JDS7EEmt8X_6xpjFFA(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dP2zPAFnLflAibe2vXdc79i6lVM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-936497634);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-936497634, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentPreview (StepupFullScreenContent.kt:180)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData[]{new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("sms_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS, true, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber("phone_1", com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.SampleMaskedPhoneNumber, false, false, false, (java.lang.String) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null)), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("email_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL, true, kotlin.collections.CollectionsKt.emptyList(), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("whatsapp_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP, true, kotlin.collections.CollectionsKt.emptyList(), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge("ivr_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR, true, kotlin.collections.CollectionsKt.emptyList(), "sample_nonce", "sample_partial_token"), false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$abmLLYu57JDS7EEmt8X_6xpjFFA((com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StepupFullScreenContent(listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.$r8$lambda$dP2zPAFnLflAibe2vXdc79i6lVM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wPL941LaT0AFgAZpssY5ZpaKQ38(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wn8ktOcGhjKgo5sDnrxzjYjHW6o(java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StepupFullScreenContent(list, function1, challengeType, stepupValidationError, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

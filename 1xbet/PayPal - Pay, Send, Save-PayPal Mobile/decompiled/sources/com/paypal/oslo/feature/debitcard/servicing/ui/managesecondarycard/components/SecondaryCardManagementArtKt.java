package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001aK\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"ManageSecondaryCardArt", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "modifier", "Landroidx/compose/ui/Modifier;", "onActivateClick", "Lkotlin/Function0;", "onDidNotGetCardClick", "isActivateButtonEnabled", "", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "SecondaryCardStatusSection", "cardStatus", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "isCardNotReceived", "showDidNotGetCardLink", "onDescriptionClick", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ManageSecondaryCardArtPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SecondaryCardManagementArtKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageSecondaryCardArt(final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i6;
        boolean z2;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitSecondaryCardArt, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1689814562);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitSecondaryCardArt) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            function05 = function03;
                            z3 = z2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function06 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function06 = function03;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function07 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function07 = function04;
                            }
                            final boolean z4 = i6 != 0 ? false : z2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1689814562, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.ManageSecondaryCardArt (SecondaryCardManagementArt.kt:67)");
                            }
                            com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1496102076, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.m14447$r8$lambda$fVPk7Uvuq4dDhGnLViEMQR9S4Q(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt.this, function06, function07, z4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54);
                            int i8 = (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | ((i3 >> 3) & 14) | 805306368;
                            boolean z5 = z4;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function07;
                            com.paypal.pds.components.CardKt.Card(companion, null, null, outlined, null, null, null, null, null, rememberComposableLambda, startRestartGroup, i8, 502);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function04 = function08;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function06;
                            z3 = z5;
                            function05 = function09;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function010 = function04;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.$r8$lambda$dEUxl95VcECvTjH_9vaQuIuWjjo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt.this, modifier3, function05, function010, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function04 = function02;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z2 = z;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function04 = function02;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function04 = function02;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final boolean z3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1227520597);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(debitCardStatus) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1227520597, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardStatusSection (SecondaryCardManagementArt.kt:128)");
            }
            if (!z || debitCardStatus == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.$r8$lambda$YB2FyxJvAepfkZXIkzndEbUdCpI(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus.this, z, z2, function0, function02, z3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScope.updateScope(function2);
                }
                return;
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            java.lang.String cardStatusDescription = debitCardStatus.getCardStatusDescription();
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(cardStatusDescription, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
            if (z3) {
                startRestartGroup.startReplaceGroup(1749017810);
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate, startRestartGroup, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, startRestartGroup, ((i2 >> 9) & 14) | 1769472, 412);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1749276753);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (z2) {
                startRestartGroup.startReplaceGroup(-486391102);
                com.paypal.pds.components.LinkKt.Link(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_did_not_get_your_card, startRestartGroup, 0), null, function02, com.paypal.pds.components.LinkSize.Medium.INSTANCE, startRestartGroup, ((i2 >> 6) & 896) | (com.paypal.pds.components.LinkSize.Medium.$stable << 9), 2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-486134515);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScope = startRestartGroup.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.$r8$lambda$b2EqLgeh03j8FIbD1XZuT65cyLw(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus.this, z, z2, function0, function02, z3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TCoJsDFWHmdGNGyhsV5ka24uxRU(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1296686142, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.ManageSecondaryCardArt.<anonymous>.<anonymous>.<anonymous> (SecondaryCardManagementArt.kt:81)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(debitSecondaryCardArt.getCardImageUrl(), null, androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize32()), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape8()), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), composer, 196656, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XFUS7AxPGQ8nGFDZMLobxTKw-wY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14446$r8$lambda$XFUS7AxPGQ8nGFDZMLobxTKwwY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1334305234);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1334305234, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.ManageSecondaryCardArtPreview (SecondaryCardManagementArt.kt:168)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            ManageSecondaryCardArt(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", "1234", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(com.paypal.pds.components.BadgeStyle.Warning.INSTANCE, "Locked", null, 4, null), false, false, 24, null), null, null, null, false, startRestartGroup, 0, 30);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", "5678", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(com.paypal.pds.components.BadgeStyle.Info.INSTANCE, "Ordered", "We'll email you when it ships. You can use your digital card to shop now."), true, false);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ManageSecondaryCardArt(debitSecondaryCardArt, null, (kotlin.jvm.functions.Function0) rememberedValue, null, true, startRestartGroup, 24960, 10);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", "9012", new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(com.paypal.pds.components.BadgeStyle.Info.INSTANCE, "Shipped", "Scheduled to arrive around \n01/18/25."), true, true);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ManageSecondaryCardArt(debitSecondaryCardArt2, null, (kotlin.jvm.functions.Function0) rememberedValue2, null, false, startRestartGroup, 24960, 10);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.m14446$r8$lambda$XFUS7AxPGQ8nGFDZMLobxTKwwY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YB2FyxJvAepfkZXIkzndEbUdCpI(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z3, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(debitCardStatus, z, z2, function0, function02, z3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b2EqLgeh03j8FIbD1XZuT65cyLw(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z3, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(debitCardStatus, z, z2, function0, function02, z3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dEUxl95VcECvTjH_9vaQuIuWjjo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageSecondaryCardArt(debitSecondaryCardArt, modifier, function0, function02, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fVPk7Uvuq4dDh-GnLViEMQR9S4Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14447$r8$lambda$fVPk7Uvuq4dDhGnLViEMQR9S4Q(final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1496102076, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.ManageSecondaryCardArt.<anonymous> (SecondaryCardManagementArt.kt:72)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_product_name, composer, 0), "•• ".concat(java.lang.String.valueOf(debitSecondaryCardArt.getLastFourDigits())), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(510335485, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.m14448$r8$lambda$kMKFheBgW63lS_UYz1Y49Mwlqc(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1296686142, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.SecondaryCardManagementArtKt.$r8$lambda$TCoJsDFWHmdGNGyhsV5ka24uxRU(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), null, null, null, null, null, 7996, null), null, false, null, null, null, false, composer, com.paypal.pds.components.ListItem.$stable, 126);
            getHighResolutionOutputSizeshNQ4ISI(debitSecondaryCardArt.getDebitCardStatus(), debitSecondaryCardArt.isCardNotReceived(), debitSecondaryCardArt.getShowDidNotGetCardLink(), function0, function02, z, composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kMKFheBgW63lS_UYz1Y49M-wlqc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14448$r8$lambda$kMKFheBgW63lS_UYz1Y49Mwlqc(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(510335485, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.components.ManageSecondaryCardArt.<anonymous>.<anonymous>.<anonymous> (SecondaryCardManagementArt.kt:91)");
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus = debitSecondaryCardArt.getDebitCardStatus();
            if (debitCardStatus == null) {
                composer.startReplaceGroup(-779737908);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-779737907);
                com.paypal.pds.components.BadgeKt.Badge(debitCardStatus.getStatusText(), null, debitCardStatus.getBadgeStyle(), null, com.paypal.pds.components.BadgeSize.Medium.INSTANCE, null, null, composer, 24576, 106);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

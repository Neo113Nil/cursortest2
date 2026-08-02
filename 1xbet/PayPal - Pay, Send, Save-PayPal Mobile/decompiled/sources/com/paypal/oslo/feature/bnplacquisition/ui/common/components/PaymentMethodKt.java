package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0002\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0011\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"PaymentMethod", "", "title", "", "config", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PaymentMethodConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "changeFiConfig", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ChangeFiConfig;", "alertConfig", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PaymentMethodConfig;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ChangeFiConfig;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;Landroidx/compose/runtime/Composer;II)V", "PaymentMethodDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PaymentMethodConfig;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;Landroidx/compose/runtime/Composer;II)V", "PaymentMethodNoFiDetails", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;Landroidx/compose/runtime/Composer;II)V", "PaymentMethodAlert", "includeTopSpacer", "", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentMethodWithFiPreview", "(Landroidx/compose/runtime/Composer;I)V", "PaymentMethodWithAlertPreview", "PaymentMethodUpdateRequiredPreview", "PreviewPaymentMethodTitle", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentMethodKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethod(final java.lang.String str, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String details;
        boolean z;
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-634940069);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(paymentMethodConfig) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                changeFiConfig2 = changeFiConfig;
                i3 |= startRestartGroup.changed(changeFiConfig2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? startRestartGroup.changed(alertConfig) : startRestartGroup.changedInstance(alertConfig) ? 16384 : 8192;
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    alertConfig2 = alertConfig;
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        changeFiConfig2 = null;
                    }
                    final com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig3 = i5 != 0 ? null : alertConfig;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-634940069, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethod (PaymentMethod.kt:84)");
                    }
                    java.lang.String name2 = paymentMethodConfig.getName();
                    boolean z2 = (name2 != null && (kotlin.text.StringsKt.isBlank(name2) ^ true)) || ((details = paymentMethodConfig.getDetails()) != null && (kotlin.text.StringsKt.isBlank(details) ^ true));
                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodTestTags.PAYMENT_METHOD_CARD), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    if (!kotlin.text.StringsKt.isBlank(str)) {
                        startRestartGroup.startReplaceGroup(-569824450);
                        z = z2;
                        changeFiConfig3 = changeFiConfig2;
                        com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.Modifier.INSTANCE, str, null, null, startRestartGroup, ((i3 << 3) & 112) | 6, 12);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        z = z2;
                        changeFiConfig3 = changeFiConfig2;
                        startRestartGroup.startReplaceGroup(-569723235);
                        startRestartGroup.endReplaceGroup();
                    }
                    final boolean z3 = z;
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig4 = alertConfig3;
                    changeFiConfig2 = changeFiConfig3;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1830726785, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.$r8$lambda$gTt42IkRZJ8oiG62_3zzWyQScmk(z3, paymentMethodConfig, alertConfig3, changeFiConfig3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306422, 500);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    alertConfig2 = alertConfig4;
                }
                final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig4 = changeFiConfig2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.m12346$r8$lambda$p_mm6wg5JJREo1UDFyJJeD_fdc(str, paymentMethodConfig, modifier3, changeFiConfig4, alertConfig2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            changeFiConfig2 = changeFiConfig;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig42 = changeFiConfig2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        changeFiConfig2 = changeFiConfig;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig422 = changeFiConfig2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a3, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        androidx.compose.ui.Modifier modifier3;
        ?? r3;
        int i6;
        int i7;
        androidx.compose.ui.Modifier semantics$default;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig3 = alertConfig;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(395099257);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentMethodConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? startRestartGroup.changed(alertConfig3) : startRestartGroup.changedInstance(alertConfig3) ? 256 : 128;
            }
            i5 = i3;
            if (startRestartGroup.shouldExecute((i5 & 147) == 146, i5 & 1)) {
                startRestartGroup.skipToGroupEnd();
                alertConfig2 = alertConfig3;
            } else {
                androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    alertConfig3 = null;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(395099257, i5, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodDetails (PaymentMethod.kt:144)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                java.lang.String name2 = paymentMethodConfig.getName();
                if (name2 != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(name2);
                    sb.append(" logo");
                    str = sb.toString();
                }
                str = "Financial institution logo";
                if (paymentMethodConfig.getImageUrl() != null && (!kotlin.text.StringsKt.isBlank(r5))) {
                    startRestartGroup.startReplaceGroup(968309040);
                    modifier3 = modifier4;
                    r3 = 1;
                    com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(paymentMethodConfig.getImageUrl(), null, null, null, null, startRestartGroup, 0, 30), str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodTestTags.PAYMENT_METHOD_IMAGE), androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), com.paypal.pds.components.ImageCornerRadius.Radius4, com.paypal.pds.components.ImageAspectRatio.Landscape4x3, null, startRestartGroup, 224256, 64);
                    startRestartGroup.endReplaceGroup();
                    i6 = 0;
                } else {
                    modifier3 = modifier4;
                    r3 = 1;
                    i6 = 0;
                    startRestartGroup.startReplaceGroup(968856872);
                    androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12(), startRestartGroup, 48, 0), com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodTestTags.PAYMENT_METHOD_IMAGE);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.IconKt.Icon(paymentMethodConfig.getDefaultIcon(), str, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, null, startRestartGroup, 3072, 20);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.m12343$r8$lambda$KlrGIPCAyntPweLuW_HcOgWN4((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(weight$default, r3, (kotlin.jvm.functions.Function1) rememberedValue);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i6);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i6));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
                java.lang.String name3 = paymentMethodConfig.getName();
                if (name3 == null || kotlin.text.StringsKt.isBlank(name3)) {
                    name3 = null;
                }
                if (name3 != null) {
                    startRestartGroup.startReplaceGroup(75335381);
                    i7 = i5;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(paymentMethodConfig.getName(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodTestTags.PAYMENT_METHOD_BANK_NAME), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(75335380);
                    startRestartGroup.endReplaceGroup();
                    i7 = i5;
                }
                java.lang.String details = paymentMethodConfig.getDetails();
                if (details == null || kotlin.text.StringsKt.isBlank(details)) {
                    details = null;
                }
                if (details != null) {
                    startRestartGroup.startReplaceGroup(75751215);
                    java.lang.String details2 = paymentMethodConfig.getDetails();
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                    final java.lang.String accountDetailsContentDescription = paymentMethodConfig.getAccountDetailsContentDescription();
                    if (accountDetailsContentDescription != null) {
                        startRestartGroup.startReplaceGroup(834239062);
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed = startRestartGroup.changed(accountDetailsContentDescription);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.$r8$lambda$e3aMhuy_QCfwKiiyTuWPzS_A_2I(accountDetailsContentDescription, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue2, r3, null);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(834239061);
                        startRestartGroup.endReplaceGroup();
                        semantics$default = null;
                    }
                    if (semantics$default == null) {
                        semantics$default = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(details2, semantics$default, contentMuted, null, null, null, false, 0, 0, null, bodyMedium, startRestartGroup, 384, 6, 1016);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(75751214);
                    startRestartGroup.endReplaceGroup();
                }
                getHighSpeedVideoFpsRangesFor(alertConfig3, true, (androidx.compose.ui.Modifier) null, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.$stable | 48 | ((i7 >> 6) & 14), 4);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                alertConfig2 = alertConfig3;
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.m12341$r8$lambda$1FeRcrISw2AZFHcK9kM7OOXUa0(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig.this, modifier5, alertConfig2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 147) == 146, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1355640518);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(alertConfig) : startRestartGroup.changedInstance(alertConfig) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                alertConfig = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1355640518, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodNoFiDetails (PaymentMethod.kt:223)");
            }
            getHighSpeedVideoFpsRangesFor(alertConfig, false, modifier, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.$stable | 48 | ((i3 >> 3) & 14) | ((i3 << 6) & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.$r8$lambda$V3Jl2VMxeRyhtkySN3A9NCZzF4k(androidx.compose.ui.Modifier.this, alertConfig, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1430779748);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(alertConfig) : startRestartGroup.changedInstance(alertConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1430779748, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodAlert (PaymentMethod.kt:243)");
            }
            java.lang.String alertMessage = alertConfig != null ? alertConfig.getAlertMessage() : null;
            java.lang.String str = alertMessage;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                startRestartGroup.startReplaceGroup(-1103817323);
                if (z) {
                    startRestartGroup.startReplaceGroup(-1103792926);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1103727578);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(alertMessage, androidx.compose.ui.platform.TestTagKt.testTag(modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodTestTags.PAYMENT_METHOD_ALERT_MESSAGE), alertConfig.getAlertStyle(), startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.$stable << 6, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1103524218);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.m12345$r8$lambda$iJzTUa8fRjmCGS6iXp58l1KXjY(com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig.this, z, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-1FeRcrISw2AZFHcK9kM7OOXUa0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12341$r8$lambda$1FeRcrISw2AZFHcK9kM7OOXUa0(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(paymentMethodConfig, modifier, alertConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0RiUrJ-NMX5rt4npPfjeC1lmYBY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12342$r8$lambda$0RiUrJNMX5rt4npPfjeC1lmYBY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-278138897);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-278138897, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodUpdateRequiredPreview (PaymentMethod.kt:354)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig(com.paypal.pds.core.Icon.Bank.INSTANCE, null, null, null, null, 24, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentMethod("Payment method", paymentMethodConfig, null, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig("Update", (kotlin.jvm.functions.Function0) rememberedValue, false, 4, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig("Update required", com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE), startRestartGroup, (com.paypal.pds.components.ContextualAlertStyle.$stable << 12) | 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.m12342$r8$lambda$0RiUrJNMX5rt4npPfjeC1lmYBY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8B4slItiaBeE33jLAAPw1TLsBvc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-331810549);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-331810549, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodWithAlertPreview (PaymentMethod.kt:333)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig(com.paypal.pds.core.Icon.Bank.INSTANCE, "Chase", "Credit ••••7849", null, null, 24, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentMethod("Payment method", paymentMethodConfig, null, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig("Update", (kotlin.jvm.functions.Function0) rememberedValue, false, 4, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig("Card expiring soon", null, 2, null), startRestartGroup, (com.paypal.pds.components.ContextualAlertStyle.$stable << 12) | 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.$r8$lambda$8B4slItiaBeE33jLAAPw1TLsBvc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kl-rGI-PCAyntPweLuW_HcOgWN4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12343$r8$lambda$KlrGIPCAyntPweLuW_HcOgWN4(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V3Jl2VMxeRyhtkySN3A9NCZzF4k(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(modifier, alertConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aKbXeyaJ42CIdr2l8hkn-BqCfOc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12344$r8$lambda$aKbXeyaJ42CIdr2l8hknBqCfOc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1373592304);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1373592304, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodWithFiPreview (PaymentMethod.kt:313)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig(com.paypal.pds.core.Icon.Bank.INSTANCE, "Chase Freedom", "Debit ••••8607", null, null, 24, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentMethod("Payment method", paymentMethodConfig, null, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig("Change", (kotlin.jvm.functions.Function0) rememberedValue, false, 4, null), null, startRestartGroup, 6, 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodKt.m12344$r8$lambda$aKbXeyaJ42CIdr2l8hknBqCfOc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3aMhuy_QCfwKiiyTuWPzS_A_2I(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gTt42IkRZJ8oiG62_3zzWyQScmk(boolean z, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1830726785, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethod.<anonymous>.<anonymous> (PaymentMethod.kt:104)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (z) {
                composer.startReplaceGroup(-2131484703);
                getHighSpeedVideoFpsRangesFor(paymentMethodConfig, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), alertConfig, composer, com.paypal.pds.components.ContextualAlertStyle.$stable << 6, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2131251738);
                Camera2StreamConfigurationMap(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), alertConfig, composer, com.paypal.pds.components.ContextualAlertStyle.$stable << 3, 0);
                composer.endReplaceGroup();
            }
            if (changeFiConfig != null) {
                composer.startReplaceGroup(-2130986502);
                com.paypal.pds.components.ButtonKt.Button(changeFiConfig.getOnChangeClick(), changeFiConfig.getChangeFiText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "PaymentMethodChangeButton"), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, changeFiConfig.getEnabled(), false, composer, 1769856, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2130587129);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iJzTUa8fRjm-CGS6iXp58l1KXjY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12345$r8$lambda$iJzTUa8fRjmCGS6iXp58l1KXjY(com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(alertConfig, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p_mm6wg5JJRE-o1UDFyJJeD_fdc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12346$r8$lambda$p_mm6wg5JJREo1UDFyJJeD_fdc(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PaymentMethodConfig paymentMethodConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentMethod(str, paymentMethodConfig, modifier, changeFiConfig, alertConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

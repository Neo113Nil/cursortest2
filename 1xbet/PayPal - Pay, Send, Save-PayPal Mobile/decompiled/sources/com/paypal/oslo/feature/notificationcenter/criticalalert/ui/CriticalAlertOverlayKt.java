package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"CriticalAlertOverlay", "", "alertData", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedCriticalAlertOverlay", "state", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/ui/CriticalAlertState;", "onAlertClick", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/notificationcenter/criticalalert/ui/CriticalAlertState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "floatingOverlayShadow", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "buildContentDescription", "", "CriticalAlertOverlayPreview", "(Landroidx/compose/runtime/Composer;I)V", "notification-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CriticalAlertOverlayKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CriticalAlertOverlay(final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(criticalAlertData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-550165126);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(criticalAlertData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-550165126, i4, -1, "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlay (CriticalAlertOverlay.kt:77)");
                }
                final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = (androidx.compose.ui.hapticfeedback.HapticFeedback) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback());
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier4, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.foundation.shape.RoundedCornerShape m1971RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24());
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1352753610, 0, -1, "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.floatingOverlayShadow (CriticalAlertOverlay.kt:190)");
                }
                modifier3 = modifier4;
                androidx.compose.ui.Modifier m22103shadowQ2ewo60 = com.paypal.pds.core.ModifierExtensionsKt.m22103shadowQ2ewo60(com.paypal.pds.core.ModifierExtensionsKt.m22103shadowQ2ewo60(com.paypal.pds.core.ModifierExtensionsKt.m22103shadowQ2ewo60(m1708paddingVpY3zN4$default, com.paypal.pds.core.ConstantsKt.getSize20(), com.paypal.pds.core.Color.ShadowEmphasis.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), m1971RoundedCornerShape0680j_4, startRestartGroup, 384, 4), com.paypal.pds.core.ConstantsKt.getSize4(), null, 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), m1971RoundedCornerShape0680j_4, startRestartGroup, 0, 6), com.paypal.pds.core.ConstantsKt.getSize8(), null, 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), m1971RoundedCornerShape0680j_4, startRestartGroup, 0, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(m22103shadowQ2ewo60, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
                java.lang.String concat = "Navigate to ".concat(java.lang.String.valueOf(criticalAlertData.getTitle()));
                boolean changedInstance = startRestartGroup.changedInstance(hapticFeedback);
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$sAKOV2KPycr4XO95I9QqTziKdQg(androidx.compose.ui.hapticfeedback.HapticFeedback.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background, null, null, false, m7792boximpl, concat, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 7), com.paypal.pds.core.ConstantsKt.getSpacing16());
                boolean z2 = (i4 & 14) == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$6Wn9R4Sbaafeb7dSGRQgVlkMBNo(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1706padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                androidx.compose.ui.Alignment.Vertical top = androidx.compose.ui.Alignment.INSTANCE.getTop();
                androidx.compose.foundation.layout.Arrangement.Horizontal m1603spacedByD5KLDUw = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1603spacedByD5KLDUw(com.paypal.pds.core.ConstantsKt.getSpacing8(), androidx.compose.ui.Alignment.INSTANCE.getStart());
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1603spacedByD5KLDUw, top, startRestartGroup, 48);
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
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Alert.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, startRestartGroup, 27702, 4);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(criticalAlertData.getTitle(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 12779904, 6, 858);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(criticalAlertData.getBody(), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 12779904, 6, 858);
                startRestartGroup.endNode();
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 0);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$VBfZN6MzGpJQiRBSuxtvCOftNR0(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData.this, function0, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedCriticalAlertOverlay(final com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState criticalAlertState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(criticalAlertState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-896160255);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(criticalAlertState) : startRestartGroup.changedInstance(criticalAlertState) ? 4 : 2) | i;
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
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-896160255, i3, -1, "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.AnimatedCriticalAlertOverlay (CriticalAlertOverlay.kt:154)");
                }
                boolean z = criticalAlertState instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.Visible;
                androidx.compose.animation.EnterTransition fadeIn$default = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                androidx.compose.animation.core.SpringSpec spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.7f, 0.0f, null, 6, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Integer.valueOf(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$lMH0BTSS7qnjXQ40s3bJKox1sPY(((java.lang.Integer) obj).intValue()));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.animation.EnterTransition plus = fadeIn$default.plus(androidx.compose.animation.EnterExitTransitionKt.slideInVertically(spring$default, (kotlin.jvm.functions.Function1) rememberedValue));
                androidx.compose.animation.ExitTransition fadeOut$default = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Integer.valueOf(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.m15824$r8$lambda$_Tmi7Htig0yPDksYhGClOm_JM(((java.lang.Integer) obj).intValue()));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier3, plus, fadeOut$default.plus(androidx.compose.animation.EnterExitTransitionKt.slideOutVertically$default(null, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null)), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-761575895, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$QoN95WgwEwvez7qvNIc0Sy6UHXk(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.this, function1, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 112) | 200064, 16);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$49sBZFKDte9Zpi7O7If2c5owmpE(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.this, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$49sBZFKDte9Zpi7O7If2c5owmpE(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState criticalAlertState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AnimatedCriticalAlertOverlay(criticalAlertState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6Wn9R4Sbaafeb7dSGRQgVlkMBNo(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        java.lang.String title = criticalAlertData.getTitle();
        java.lang.String body = criticalAlertData.getBody();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Critical alert: ");
        sb.append(title);
        sb.append(". ");
        sb.append(body);
        sb.append(". Tap to take action.");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QoN95WgwEwvez7qvNIc0Sy6UHXk(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState criticalAlertState, final kotlin.jvm.functions.Function1 function1, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-761575895, i, -1, "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.AnimatedCriticalAlertOverlay.<anonymous> (CriticalAlertOverlay.kt:166)");
        }
        com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.Visible visible = criticalAlertState instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.Visible ? (com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.Visible) criticalAlertState : null;
        final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData data = visible != null ? visible.getData() : null;
        if (data == null) {
            composer.startReplaceGroup(-2090169681);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2090169680);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(data);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$y02iiQjSNrlR26iHDmALlMMMWD4(kotlin.jvm.functions.Function1.this, data);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            CriticalAlertOverlay(data, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 4);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VBfZN6MzGpJQiRBSuxtvCOftNR0(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CriticalAlertOverlay(criticalAlertData, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_T-mi7Htig0yPD-ksYhGClOm_JM, reason: not valid java name */
    public static /* synthetic */ int m15824$r8$lambda$_Tmi7Htig0yPDksYhGClOm_JM(int i) {
        return i / 2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dq_wU7gxbETk705i88drxyWvqVc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(515824804);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(515824804, updateChangedFlags, -1, "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayPreview (CriticalAlertOverlay.kt:202)");
            }
            com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData = new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData("1", null, null, "Verify your identity", "We need some additional information to keep your account secure.", "/myaccount/security", null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CriticalAlertOverlay(criticalAlertData, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertOverlayKt.$r8$lambda$dq_wU7gxbETk705i88drxyWvqVc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ int $r8$lambda$lMH0BTSS7qnjXQ40s3bJKox1sPY(int i) {
        return i / 2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sAKOV2KPycr4XO95I9QqTziKdQg(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, kotlin.jvm.functions.Function0 function0) {
        hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6717getLongPress5zf0vsI());
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y02iiQjSNrlR26iHDmALlMMMWD4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData) {
        function1.invoke(criticalAlertData);
        return kotlin.Unit.INSTANCE;
    }
}

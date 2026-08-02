package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0013\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"TopBarLeftSectionTestTag", "", "getTopBarLeftSectionTestTag$annotations", "()V", "MaxBadgeCount", "", "TopBar", "", "config", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TopBarLeftSection", "TopBarLightPreview", "(Landroidx/compose/runtime/Composer;I)V", "TopBarDarkPreview", "TopBarDarkCloseButtonPreview", "TopBarCustomIconColorPreview", "TopBarWithAccountSwitchPreview", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TopBarKt {
    public static final java.lang.String TopBarLeftSectionTestTag = "TopBar_LeftSection";

    public static /* synthetic */ void getTopBarLeftSectionTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBar(final com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1674586997);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(topBarConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1674586997, i4, -1, "com.paypal.oslo.core.navigation.ui.TopBar (TopBar.kt:94)");
                }
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null)), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                if (topBarConfig.getShowLeftSection()) {
                    startRestartGroup.startReplaceGroup(-1203620465);
                    getHighSpeedVideoFpsRanges(topBarConfig, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i4 & 14, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1203526101);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                if (topBarConfig.getShowNotificationIcon()) {
                    startRestartGroup.startReplaceGroup(-870831179);
                    androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing24());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1740size3ABfNKs);
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
                    com.paypal.pds.core.Icon.Bell bell = com.paypal.pds.core.Icon.Bell.INSTANCE;
                    com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                    modifier3 = modifier4;
                    androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, "accessed"), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Flow.NOTIFICATION_CENTER_SESSION, null)})), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("notification_center_icon", 0, null, null, 14, null));
                    com.paypal.pds.core.Icon.Bell bell2 = bell;
                    boolean z3 = (i4 & 14) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$XxpSlEerPmBNecrYKfUer5aH7YA(com.paypal.oslo.core.navigation.ui.TopBarConfig.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    z = false;
                    z2 = true;
                    i5 = i4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.IconButtonKt.IconButton(bell2, (kotlin.jvm.functions.Function0) rememberedValue, component, tertiary, medium, "Notifications", null, false, false, startRestartGroup, 224262, 448);
                    if (topBarConfig.getNotificationCount() > 0) {
                        composer2.startReplaceGroup(-1816368395);
                        com.paypal.pds.components.BadgeKt.BadgeNumeric(topBarConfig.getNotificationCount() > 9 ? "9+" : java.lang.String.valueOf(topBarConfig.getNotificationCount()), androidx.compose.foundation.layout.OffsetKt.m1678offsetVpY3zN4(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), com.paypal.pds.core.ConstantsKt.getSpacing8(), androidx.compose.ui.unit.Dp.m8601constructorimpl(-com.paypal.pds.core.ConstantsKt.getSpacing8())), com.paypal.pds.components.BadgeStyle.Negative.INSTANCE, com.paypal.pds.components.BadgeSize.Small.INSTANCE, composer2, 3456, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1815901628);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    z = false;
                    i5 = i4;
                    composer2 = startRestartGroup;
                    z2 = true;
                    composer2.startReplaceGroup(-868878427);
                    composer2.endReplaceGroup();
                }
                if (topBarConfig.getAccountSwitchAvatarSource() != null) {
                    composer2.startReplaceGroup(-868747886);
                    com.paypal.pds.components.AvatarSource accountSwitchAvatarSource = topBarConfig.getAccountSwitchAvatarSource();
                    i6 = 4;
                    boolean z4 = (i5 & 14) == 4 ? z2 : z;
                    java.lang.Object rememberedValue2 = composer2.rememberedValue();
                    if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$TnWw9qpXEY1COklFiArBqLyb8y0(com.paypal.oslo.core.navigation.ui.TopBarConfig.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt.AccountSwitchButton(accountSwitchAvatarSource, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer2, 0, 4);
                    composer2.endReplaceGroup();
                } else {
                    i6 = 4;
                    composer2.startReplaceGroup(-868545115);
                    composer2.endReplaceGroup();
                }
                if (topBarConfig.getShowCloseButton()) {
                    composer2.startReplaceGroup(-868461012);
                    com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Medium medium2 = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                    androidx.compose.ui.Modifier component2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.NAVIGATION, "close_l0", "exit_l0"))), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("close_button", 0, null, null, 14, null));
                    com.paypal.pds.core.Icon.XMark xMark2 = xMark;
                    boolean z5 = (i5 & 14) == i6 ? z2 : z;
                    java.lang.Object rememberedValue3 = composer2.rememberedValue();
                    if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$9JcuQcYwnGef9RHoJff_XPuZIWA(com.paypal.oslo.core.navigation.ui.TopBarConfig.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.IconButtonKt.IconButton(xMark2, (kotlin.jvm.functions.Function0) rememberedValue3, component2, secondary, medium2, com.knotapi.knot.utilities.Constants.META_CLOSE, null, false, false, composer2, 224262, 448);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-867685051);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$5maKsSy9We6ufZr8Ni3QejBw0e4(com.paypal.oslo.core.navigation.ui.TopBarConfig.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier.Companion companion2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1586467919);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(topBarConfig) ? 4 : 2) | i;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1586467919, i3, -1, "com.paypal.oslo.core.navigation.ui.TopBarLeftSection (TopBar.kt:192)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, TopBarLeftSectionTestTag);
                if (topBarConfig.getOnLeftSectionClick() != null) {
                    startRestartGroup.startReplaceGroup(645967497);
                    java.lang.String leftSectionContentDescription = topBarConfig.getLeftSectionContentDescription();
                    if (leftSectionContentDescription != null) {
                        if (kotlin.text.StringsKt.isBlank(leftSectionContentDescription)) {
                            leftSectionContentDescription = null;
                        }
                    }
                    leftSectionContentDescription = topBarConfig.getLeftIconContentDescription();
                    java.lang.String str = leftSectionContentDescription;
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                    com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
                    androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
                    boolean z = (i3 & 14) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$hpVbXb3_BivAvmFiesE6m35Gh8I(com.paypal.oslo.core.navigation.ui.TopBarConfig.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    modifier3 = modifier4;
                    companion = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion3, null, none, false, m7792boximpl, str, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 390, 5);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(646507331);
                    startRestartGroup.endReplaceGroup();
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.ui.Modifier then = testTag.then(companion);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                if (topBarConfig.getLeftIcon() != null) {
                    startRestartGroup.startReplaceGroup(-2094943516);
                    if (topBarConfig.getOnLeftSectionClick() != null && topBarConfig.getTitle() == null) {
                        companion2 = androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 0.0f, 12, null);
                    } else {
                        companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                    com.paypal.pds.core.Icon leftIcon = topBarConfig.getLeftIcon();
                    java.lang.String leftIconContentDescription = topBarConfig.getOnLeftSectionClick() != null ? null : topBarConfig.getLeftIconContentDescription();
                    com.paypal.pds.core.Color.ContentBase leftIconColor = topBarConfig.getLeftIconColor();
                    if (leftIconColor == null) {
                        leftIconColor = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    }
                    com.paypal.pds.components.IconKt.Icon(leftIcon, leftIconContentDescription, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, leftIconColor, startRestartGroup, 3072, 4);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2093879689);
                    startRestartGroup.endReplaceGroup();
                }
                if (topBarConfig.getTitle() != null) {
                    startRestartGroup.startReplaceGroup(-2093822959);
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(topBarConfig.getTitle(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 12779904, 6, 858);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-2093592009);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.ui.TopBarKt.m11650$r8$lambda$f2cUBBLD7HnLEkvppGiIk_VEKs(com.paypal.oslo.core.navigation.ui.TopBarConfig.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void TopBarLightPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-653379982);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-653379982, i, -1, "com.paypal.oslo.core.navigation.ui.TopBarLightPreview (TopBar.kt:321)");
            }
            TopBar(new com.paypal.oslo.core.navigation.ui.TopBarConfig(com.paypal.pds.core.Icon.AiMarkFill.INSTANCE, null, "AI Assistant", null, "Hi Theo, how can I help you?", false, null, true, 3, true, null, null, null, null, 15466, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$SPKxAXgx5IpCIPho4YAN8W3IFG8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TopBarDarkPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-891174662);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-891174662, i, -1, "com.paypal.oslo.core.navigation.ui.TopBarDarkPreview (TopBar.kt:336)");
            }
            TopBar(new com.paypal.oslo.core.navigation.ui.TopBarConfig(com.paypal.pds.core.Icon.CheckboxEmpty.INSTANCE, null, com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu, null, "Hi Theo, how can I help you?", false, null, true, 3, false, null, null, null, null, 15978, null), com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.TopBarKt.m11648$r8$lambda$LD72SKkVqf6gnBR9fP6ivfzmlk(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TopBarDarkCloseButtonPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-60191276);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-60191276, i, -1, "com.paypal.oslo.core.navigation.ui.TopBarDarkCloseButtonPreview (TopBar.kt:351)");
            }
            TopBar(new com.paypal.oslo.core.navigation.ui.TopBarConfig(com.paypal.pds.core.Icon.CheckboxEmpty.INSTANCE, null, com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu, null, null, false, null, false, 0, true, null, null, null, null, 15482, null), com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.TopBarKt.m11649$r8$lambda$_Unsd4PL012_699GWzXEEBs124(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TopBarCustomIconColorPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1090266193);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1090266193, i, -1, "com.paypal.oslo.core.navigation.ui.TopBarCustomIconColorPreview (TopBar.kt:366)");
            }
            TopBar(new com.paypal.oslo.core.navigation.ui.TopBarConfig(com.paypal.pds.core.Icon.AiMarkFill.INSTANCE, com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, "AI Assistant", null, "Custom Color Icon", false, null, true, 0, false, null, null, null, null, 15976, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.TopBarKt.m11647$r8$lambda$F2ozXFnwcs8ZlK3UkDP5ta2o(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TopBarWithAccountSwitchPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1309036237);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1309036237, i, -1, "com.paypal.oslo.core.navigation.ui.TopBarWithAccountSwitchPreview (TopBar.kt:381)");
            }
            TopBar(new com.paypal.oslo.core.navigation.ui.TopBarConfig(com.paypal.pds.core.Icon.AiMarkFill.INSTANCE, com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE, null, null, "Find products or ask a question", false, new com.paypal.pds.components.AvatarSource.Initials("Theo Kim"), true, 3, false, null, null, null, null, 15916, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.TopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.TopBarKt.$r8$lambda$o1O8iNnuyq85iJeIGU0V0XfBRlw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5maKsSy9We6ufZr8Ni3QejBw0e4(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TopBar(topBarConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9JcuQcYwnGef9RHoJff_XPuZIWA(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig) {
        kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick = topBarConfig.getOnCloseClick();
        if (onCloseClick != null) {
            onCloseClick.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$F2o-zX-Fnwcs-8ZlK3UkDP5ta2o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11647$r8$lambda$F2ozXFnwcs8ZlK3UkDP5ta2o(int i, androidx.compose.runtime.Composer composer, int i2) {
        TopBarCustomIconColorPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LD72SKk-Vqf6gnBR9fP6ivfzmlk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11648$r8$lambda$LD72SKkVqf6gnBR9fP6ivfzmlk(int i, androidx.compose.runtime.Composer composer, int i2) {
        TopBarDarkPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SPKxAXgx5IpCIPho4YAN8W3IFG8(int i, androidx.compose.runtime.Composer composer, int i2) {
        TopBarLightPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TnWw9qpXEY1COklFiArBqLyb8y0(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig) {
        kotlin.jvm.functions.Function0<kotlin.Unit> onAccountSwitchClick = topBarConfig.getOnAccountSwitchClick();
        if (onAccountSwitchClick != null) {
            onAccountSwitchClick.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XxpSlEerPmBNecrYKfUer5aH7YA(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig) {
        kotlin.jvm.functions.Function0<kotlin.Unit> onNotificationClick = topBarConfig.getOnNotificationClick();
        if (onNotificationClick != null) {
            onNotificationClick.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_Unsd4P-L012_699GWzXEEBs124, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11649$r8$lambda$_Unsd4PL012_699GWzXEEBs124(int i, androidx.compose.runtime.Composer composer, int i2) {
        TopBarDarkCloseButtonPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$f2cUBBLD7HnLEkvppGiIk_VEK-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11650$r8$lambda$f2cUBBLD7HnLEkvppGiIk_VEKs(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(topBarConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hpVbXb3_BivAvmFiesE6m35Gh8I(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig) {
        topBarConfig.getOnLeftSectionClick().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o1O8iNnuyq85iJeIGU0V0XfBRlw(int i, androidx.compose.runtime.Composer composer, int i2) {
        TopBarWithAccountSwitchPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

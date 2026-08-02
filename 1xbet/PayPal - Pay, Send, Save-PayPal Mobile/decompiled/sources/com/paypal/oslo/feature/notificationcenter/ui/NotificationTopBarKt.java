package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"NotificationTopBar", "", "notificationSections", "", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Section;", "modifier", "Landroidx/compose/ui/Modifier;", "selectedSectionTag", "", "onTopBarCloseClick", "Lkotlin/Function0;", "onNotificationFilterSelect", "Lkotlin/Function1;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "NotificationCenterItemDarkPreview", "(Landroidx/compose/runtime/Composer;I)V", "notification-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationTopBarKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationTopBar(final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> list, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(913803712);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        function02 = function0;
                        modifier3 = modifier2;
                        str3 = str2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            str2 = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.ALL.getValue();
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function03 = function0;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(913803712, i6, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBar (NotificationTopBar.kt:63)");
                        }
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        final java.lang.String str5 = str2;
                        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f));
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
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.notificationGenericContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.SECTION_VIEWED)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Module.NOTIFICATION_FILTER_BAR, 0, null, null, 14, null));
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module);
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
                        androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.notificationGenericContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.FILTER_CHANGED));
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str5, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.URGENT.getValue())) {
                            str4 = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT;
                        } else {
                            str4 = "ALL";
                        }
                        androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(context, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str4, 0, 2, null));
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.$r8$lambda$n7OJTgri2PbLASCPlp4vGG1tGSM((com.paypal.oslo.feature.notificationcenter.domain.model.Section) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        boolean z = (57344 & i6) == 16384;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.m15852$r8$lambda$BikYDfQunTB2GUrzmfl2AVdkGM(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.notificationcenter.domain.model.Section) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        boolean z2 = (i6 & 896) == 256;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.m15853$r8$lambda$dw7rpn7kxxrLixHakAhibtFGzM(str5, (com.paypal.oslo.feature.notificationcenter.domain.model.Section) obj));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ChipsKt.Chips(list, function12, function13, item, (kotlin.jvm.functions.Function1) rememberedValue4, null, null, null, false, null, startRestartGroup, (i6 & 14) | 48, 992);
                        composer2.endNode();
                        composer2.endNode();
                        com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                        com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Close.INSTANCE, function03, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.notificationGenericContext(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null)), secondary, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, com.knotapi.knot.utilities.Constants.META_CLOSE, null, false, false, composer2, ((i6 >> 6) & 112) | 224262, 448);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function02 = function03;
                        modifier3 = modifier5;
                        str3 = str5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.m15855$r8$lambda$z7LKn4cGiLiKx0kAd83Lm_2AQQ(list, modifier3, str3, function02, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & 24576) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$64Wo8s7SZzVBRsFW4rxBitlPkQk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BikYDfQunTB2GUrzmfl2A-VdkGM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15852$r8$lambda$BikYDfQunTB2GUrzmfl2AVdkGM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.notificationcenter.domain.model.Section section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        function1.invoke(section.getTag());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dw7rpn7kxxrLixHakAhi-btFGzM, reason: not valid java name */
    public static /* synthetic */ boolean m15853$r8$lambda$dw7rpn7kxxrLixHakAhibtFGzM(java.lang.String str, com.paypal.oslo.feature.notificationcenter.domain.model.Section section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(section.getTag(), str);
    }

    /* renamed from: $r8$lambda$mp0Qgez0sTtRU-Gs2mq3NTmGSj0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15854$r8$lambda$mp0Qgez0sTtRUGs2mq3NTmGSj0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-644324523);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-644324523, updateChangedFlags, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemDarkPreview (NotificationTopBar.kt:135)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.notificationcenter.domain.model.Section[]{new com.paypal.oslo.feature.notificationcenter.domain.model.Section("ALL", "All"), new com.paypal.oslo.feature.notificationcenter.domain.model.Section(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT, "Urgent")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.$r8$lambda$64Wo8s7SZzVBRsFW4rxBitlPkQk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            NotificationTopBar(listOf, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 24576, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.m15854$r8$lambda$mp0Qgez0sTtRUGs2mq3NTmGSj0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$n7OJTgri2PbLASCPlp4vGG1tGSM(com.paypal.oslo.feature.notificationcenter.domain.model.Section section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        return section.getTitle();
    }

    /* renamed from: $r8$lambda$z7LKn4cGiLi-Kx0kAd83Lm_2AQQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15855$r8$lambda$z7LKn4cGiLiKx0kAd83Lm_2AQQ(java.util.List list, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NotificationTopBar(list, modifier, str, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

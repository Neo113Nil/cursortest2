package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\f\u001aC\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010\u0018\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, d2 = {"AlertStyleKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "getAlertStyleKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContextualAlert", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ContextualAlertStyle;Landroidx/compose/runtime/Composer;II)V", "accessibilityLabel", "liveRegionMode", "Landroidx/compose/ui/semantics/LiveRegionMode;", "ContextualAlert-ldB2Ogo", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ContextualAlertStyle;Ljava/lang/String;Landroidx/compose/ui/semantics/LiveRegionMode;Landroidx/compose/runtime/Composer;II)V", "ContextualAlerts", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlertData;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ContextualAlertStylePreview", "(Lcom/paypal/pds/components/ContextualAlertStyle;Landroidx/compose/runtime/Composer;I)V", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContextualAlertKt {
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.ContextualAlertStyle> getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("AlertStyle", (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.ContextualAlertStyle> getAlertStyleKey() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final void ContextualAlert(final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-813166253);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(contextualAlertStyle) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                contextualAlertStyle = com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-813166253, i3, -1, "com.paypal.pds.components.ContextualAlert (ContextualAlert.kt:57)");
            }
            m21846ContextualAlertldB2Ogo(str, modifier, contextualAlertStyle, null, null, startRestartGroup, (i3 & 14) | 27648 | (i3 & 112) | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle2 = contextualAlertStyle;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ContextualAlertKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ContextualAlertKt.$r8$lambda$NIPssaOQes0EfOfbijYoOkE6OSM(str, modifier2, contextualAlertStyle2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0061  */
    /* renamed from: ContextualAlert-ldB2Ogo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21846ContextualAlertldB2Ogo(final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, java.lang.String str2, androidx.compose.ui.semantics.LiveRegionMode liveRegionMode, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle2;
        int i5;
        final java.lang.String str3;
        int i6;
        androidx.compose.ui.semantics.LiveRegionMode liveRegionMode2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.semantics.LiveRegionMode liveRegionMode3;
        final com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str5;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1120169663);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
                contextualAlertStyle2 = contextualAlertStyle;
                i3 |= startRestartGroup.changed(contextualAlertStyle2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str3 = str2;
                    i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        liveRegionMode2 = liveRegionMode;
                        i3 |= startRestartGroup.changed(liveRegionMode2) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            liveRegionMode3 = liveRegionMode2;
                            contextualAlertStyle3 = contextualAlertStyle2;
                            str4 = str3;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            final com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle4 = i4 != 0 ? com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE : contextualAlertStyle2;
                            if (i5 != 0) {
                                str3 = null;
                            }
                            final androidx.compose.ui.semantics.LiveRegionMode liveRegionMode4 = i6 != 0 ? null : liveRegionMode2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1120169663, i3, -1, "com.paypal.pds.components.ContextualAlert (ContextualAlert.kt:83)");
                            }
                            androidx.compose.ui.Modifier m1725defaultMinSizeVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier4), 0.0f, contextualAlertStyle4.getIconSize().getValue(), 1, null);
                            boolean z = (i3 & 7168) == 2048;
                            int i9 = i3 & 14;
                            boolean z2 = i9 == 4;
                            boolean z3 = (57344 & i3) == 16384;
                            boolean z4 = (i3 & 896) == 256;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if ((z | z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ContextualAlertKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.pds.components.ContextualAlertKt.$r8$lambda$bP5OKvJ9YArLEPlfFPU6daX0efE(str3, str, liveRegionMode4, contextualAlertStyle4, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1725defaultMinSizeVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
                            com.paypal.pds.core.Icon icon = contextualAlertStyle4.getIcon();
                            if (icon != null) {
                                startRestartGroup.startReplaceGroup(1254233244);
                                str5 = str3;
                                i7 = i9;
                                com.paypal.pds.components.IconKt.Icon(icon, null, rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTop()), contextualAlertStyle4.getIconSize(), contextualAlertStyle4.getIconTintColor(), startRestartGroup, 48, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1254233243);
                                startRestartGroup.endReplaceGroup();
                                str5 = str3;
                                i7 = i9;
                            }
                            androidx.compose.ui.semantics.LiveRegionMode liveRegionMode5 = liveRegionMode4;
                            com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle5 = contextualAlertStyle4;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, i7 | 384, 6, 1000);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str4 = str5;
                            liveRegionMode3 = liveRegionMode5;
                            contextualAlertStyle3 = contextualAlertStyle5;
                            modifier3 = modifier4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ContextualAlertKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.ContextualAlertKt.$r8$lambda$dwTZdujt7PhXIGD3FjXSDKa9fHM(str, modifier3, contextualAlertStyle3, str4, liveRegionMode3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    liveRegionMode2 = liveRegionMode;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str3 = str2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                liveRegionMode2 = liveRegionMode;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            contextualAlertStyle2 = contextualAlertStyle;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str3 = str2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            liveRegionMode2 = liveRegionMode;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        contextualAlertStyle2 = contextualAlertStyle;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str3 = str2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        liveRegionMode2 = liveRegionMode;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ContextualAlerts(final java.util.List<com.paypal.pds.components.textinput.ValidationAlertData> list, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2112578290);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2112578290, i2, -1, "com.paypal.pds.components.ContextualAlerts (ContextualAlert.kt:165)");
            }
            if (!list.isEmpty()) {
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.pds.utils.TestTagKt.TestTag_ContextualAlert_Spacer), startRestartGroup, 6);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                startRestartGroup.startReplaceGroup(1083141767);
                for (com.paypal.pds.components.textinput.ValidationAlertData validationAlertData : list) {
                    ContextualAlert(validationAlertData.getText(), null, validationAlertData.getStyle(), startRestartGroup, 0, 2);
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ContextualAlertKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.pds.components.ContextualAlertKt.$r8$lambda$3MdXmYLHMA6GTVPDekw6W1W6gEE(list, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ContextualAlertKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ContextualAlertKt.$r8$lambda$exLKaq_wFN_C44dFuWr9HIecP14(list, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3MdXmYLHMA6GTVPDekw6W1W6gEE(java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        ContextualAlerts(list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NIPssaOQes0EfOfbijYoOkE6OSM(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContextualAlert(str, modifier, contextualAlertStyle, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UNv7xs0QG-uxslklxD8jFtOnVIA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21845$r8$lambda$UNv7xs0QGuxslklxD8jFtOnVIA(final com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-866548124);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(contextualAlertStyle) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-866548124, i3, -1, "com.paypal.pds.components.ContextualAlertStylePreview (ContextualAlert.kt:198)");
            }
            java.lang.String simpleName = contextualAlertStyle.getClass().getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
            ContextualAlert(simpleName, null, contextualAlertStyle, startRestartGroup, (i3 << 6) & 896, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ContextualAlertKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ContextualAlertKt.m21845$r8$lambda$UNv7xs0QGuxslklxD8jFtOnVIA(com.paypal.pds.components.ContextualAlertStyle.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bP5OKvJ9YArLEPlfFPU6daX0efE(java.lang.String str, java.lang.String str2, androidx.compose.ui.semantics.LiveRegionMode liveRegionMode, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        if (str == null) {
            str = str2;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (liveRegionMode != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, liveRegionMode.getCamera2StreamConfigurationMap());
        }
        semanticsPropertyReceiver.set(getHighSpeedVideoFpsRangesFor, contextualAlertStyle);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dwTZdujt7PhXIGD3FjXSDKa9fHM(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, java.lang.String str2, androidx.compose.ui.semantics.LiveRegionMode liveRegionMode, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m21846ContextualAlertldB2Ogo(str, modifier, contextualAlertStyle, str2, liveRegionMode, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$exLKaq_wFN_C44dFuWr9HIecP14(java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        ContextualAlerts(list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

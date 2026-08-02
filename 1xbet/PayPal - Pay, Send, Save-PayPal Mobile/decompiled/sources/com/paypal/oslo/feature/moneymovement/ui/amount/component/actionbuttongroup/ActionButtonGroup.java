package com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/amount/component/actionbuttongroup/ActionButtonGroup;", "", "<init>", "()V", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "footerSlots", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease", "currentCallbacks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionButtonGroup {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActionButtonGroup() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        float f;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(174713340);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(actionButtonGroupConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupCallbacks) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function23 = function22;
                    modifier3 = modifier2;
                } else {
                    if (i6 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function22 = com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ComposableSingletons$ActionButtonGroupKt.INSTANCE.getLambda$633631470$money_movement_prodRelease();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(174713340, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup.Content (ActionButtonGroup.kt:72)");
                    }
                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(actionButtonGroupCallbacks, startRestartGroup, (i3 >> 6) & 14);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
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
                    if (actionButtonGroupConfig.getShowDisclaimer()) {
                        startRestartGroup.startReplaceGroup(658819961);
                        java.lang.String disclaimerText = actionButtonGroupData.getDisclaimerText();
                        if (disclaimerText != null) {
                            startRestartGroup.startReplaceGroup(-1051417687);
                            com.paypal.pds.core.RichText parseRichTextWithLinkTags = com.paypal.oslo.feature.moneymovement.ui.utils.StringExtensionsKt.parseRichTextWithLinkTags(disclaimerText);
                            com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                            com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                            int m8443getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
                            modifier4 = modifier2;
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            com.paypal.pds.core.Color.ContentMuted contentMuted2 = contentMuted;
                            androidx.compose.ui.text.style.TextAlign m8436boximpl = androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk);
                            boolean changed = startRestartGroup.changed(rememberUpdatedState);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup.$r8$lambda$0yHqeT4bh7JbJnSGEoSujty8Bjg(androidx.compose.runtime.State.this, (java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            com.paypal.pds.core.Typography.BodySmall bodySmall2 = bodySmall;
                            f = 0.0f;
                            i5 = 1;
                            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(parseRichTextWithLinkTags, fillMaxWidth$default, contentMuted2, null, m8436boximpl, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodySmall2, null, startRestartGroup, 432, 48, 5096);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1051417688);
                            startRestartGroup.endReplaceGroup();
                            modifier4 = modifier2;
                            f = 0.0f;
                            i5 = 1;
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        modifier4 = modifier2;
                        f = 0.0f;
                        i5 = 1;
                        startRestartGroup.startReplaceGroup(-1050893508);
                        startRestartGroup.endReplaceGroup();
                    }
                    int i7 = i5;
                    int i8 = i3;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    float f2 = f;
                    kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = function22;
                    com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt.MMPActionButtonGroup(actionButtonGroupConfig, actionButtonGroupData, (com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks) rememberUpdatedState.getValue(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i5, null), startRestartGroup, (i3 & 14) | 3072 | (i3 & 112), 0);
                    if (actionButtonGroupConfig.getShowFooterNote()) {
                        startRestartGroup.startReplaceGroup(658850489);
                        java.lang.String footerNoteText = actionButtonGroupData.getFooterNoteText();
                        if (footerNoteText != null) {
                            startRestartGroup.startReplaceGroup(-1050471319);
                            com.paypal.pds.core.RichText parseRichTextWithLinkTags2 = com.paypal.oslo.feature.moneymovement.ui.utils.StringExtensionsKt.parseRichTextWithLinkTags(footerNoteText);
                            com.paypal.pds.core.Typography.BodySmall bodySmall3 = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                            com.paypal.pds.core.Color.ContentMuted contentMuted3 = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                            int m8443getCentere0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
                            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, i7, null);
                            com.paypal.pds.core.Color.ContentMuted contentMuted4 = contentMuted3;
                            androidx.compose.ui.text.style.TextAlign m8436boximpl2 = androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk2);
                            boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup.$r8$lambda$hqx8J3KdOMo8N4wml1wGV5DFSiU(androidx.compose.runtime.State.this, (java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(parseRichTextWithLinkTags2, fillMaxWidth$default2, contentMuted4, null, m8436boximpl2, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall3, null, composer2, 432, 48, 5096);
                            composer2.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1050471320);
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                        }
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1049947140);
                        composer2.endReplaceGroup();
                    }
                    function24.invoke(composer2, java.lang.Integer.valueOf((i8 >> 12) & 14));
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function23 = function24;
                    modifier3 = modifier5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup.$r8$lambda$HOOfTNwfSB2jAiOlQYQNHJRGSZI(com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup.this, actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier3, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0yHqeT4bh7JbJnSGEoSujty8Bjg(androidx.compose.runtime.State state, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onDisclaimerLinkClick = ((com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks) state.getValue()).getOnDisclaimerLinkClick();
        if (onDisclaimerLinkClick != null) {
            onDisclaimerLinkClick.invoke(str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HOOfTNwfSB2jAiOlQYQNHJRGSZI(com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup actionButtonGroup, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        actionButtonGroup.Content(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hqx8J3KdOMo8N4wml1wGV5DFSiU(androidx.compose.runtime.State state, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onFooterNoteLinkClick = ((com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks) state.getValue()).getOnFooterNoteLinkClick();
        if (onFooterNoteLinkClick != null) {
            onFooterNoteLinkClick.invoke(str2);
        }
        return kotlin.Unit.INSTANCE;
    }
}

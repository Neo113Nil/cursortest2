package com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000e"}, d2 = {"PurposeFieldExpanded", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PurposeFieldExpandedWithValuePreview", "(Landroidx/compose/runtime/Composer;I)V", "PurposeFieldExpandedEmptyPreview", "PurposeFieldExpandedErrorPreview", "PurposeFieldExpandedSuccessPreview", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PurposeFieldExpandedKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurposeFieldExpanded(final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready, final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeFieldCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(801951256);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ready) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(purposeFieldCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(801951256, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpanded (PurposeFieldExpanded.kt:44)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
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
                java.lang.String value = ready.getValue();
                java.lang.String placeholder = ready.getPlaceholder();
                if (placeholder.length() == 0) {
                    placeholder = ready.getLabel();
                }
                java.lang.String str = placeholder;
                boolean enabled = ready.getEnabled();
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.$r8$lambda$kSyznMXCFMAwVcmZ07g8AagLpLI(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier3 = modifier2;
                com.paypal.pds.components.TextInputKt.TextInput(value, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue, fillMaxWidth$default2, str, (java.lang.String) null, (java.lang.String) null, enabled, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 384, 0, 130992);
                com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validation = ready.getValidation();
                if (validation instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error) {
                    startRestartGroup.startReplaceGroup(-2078960872);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.ContextualAlertKt.ContextualAlert(((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error) validation).getMessage(), null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 2);
                    startRestartGroup.endReplaceGroup();
                } else if (validation instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success) {
                    startRestartGroup.startReplaceGroup(-2078662280);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.ContextualAlertKt.ContextualAlert(((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success) validation).getMessage(), null, com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Positive.$stable << 6, 2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(validation instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.None)) {
                        startRestartGroup.startReplaceGroup(-67066189);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-2078371779);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.m15752$r8$lambda$x5vFVs5qmDkQCnTyGhTdFUlS4(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.this, purposeFieldCallbacks, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$-C9BMw6XXKgAdogHu1X8KWL63tM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15750$r8$lambda$C9BMw6XXKgAdogHu1X8KWL63tM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1492040242);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1492040242, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedErrorPreview (PurposeFieldExpanded.kt:120)");
            }
            PurposeFieldExpanded(new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready(com.paypal.pds.core.Icon.Send.INSTANCE, com.google.common.net.HttpHeaders.PURPOSE, "", "Enter purpose", true, new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error("Purpose is required"), false, 64, null), com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.INSTANCE, null, null, null, 7, null), null, startRestartGroup, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.m15750$r8$lambda$C9BMw6XXKgAdogHu1X8KWL63tM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ep-L8gddC_7COpNvrppDW2aNpTw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15751$r8$lambda$EpL8gddC_7COpNvrppDW2aNpTw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-820860649);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-820860649, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedSuccessPreview (PurposeFieldExpanded.kt:138)");
            }
            PurposeFieldExpanded(new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready(com.paypal.pds.core.Icon.Send.INSTANCE, com.google.common.net.HttpHeaders.PURPOSE, "Transportation", null, true, new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success("Purpose accepted"), false, 72, null), com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.INSTANCE, null, null, null, 7, null), null, startRestartGroup, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.m15751$r8$lambda$EpL8gddC_7COpNvrppDW2aNpTw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T83koawR55caBKBZPSNwtiV8dqU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1216240307);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1216240307, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedEmptyPreview (PurposeFieldExpanded.kt:103)");
            }
            PurposeFieldExpanded(new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready(com.paypal.pds.core.Icon.Send.INSTANCE, com.google.common.net.HttpHeaders.PURPOSE, "", "Enter purpose", true, null, false, 96, null), com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.INSTANCE, null, null, null, 7, null), null, startRestartGroup, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.$r8$lambda$T83koawR55caBKBZPSNwtiV8dqU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kSyznMXCFMAwVcmZ07g8AagLpLI(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        purposeFieldCallbacks.getOnValueChanged().invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$td4Q_ZsoCg8mpqBe54cM9qsLcVo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(760614671);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(760614671, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedWithValuePreview (PurposeFieldExpanded.kt:87)");
            }
            PurposeFieldExpanded(new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready(com.paypal.pds.core.Icon.Send.INSTANCE, com.google.common.net.HttpHeaders.PURPOSE, "Transportation", null, true, null, false, 104, null), com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks.INSTANCE, null, null, null, 7, null), null, startRestartGroup, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.$r8$lambda$td4Q_ZsoCg8mpqBe54cM9qsLcVo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x5vFVs5qmDkQC-nTyGhTdF-UlS4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15752$r8$lambda$x5vFVs5qmDkQCnTyGhTdFUlS4(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PurposeFieldExpanded(ready, purposeFieldCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

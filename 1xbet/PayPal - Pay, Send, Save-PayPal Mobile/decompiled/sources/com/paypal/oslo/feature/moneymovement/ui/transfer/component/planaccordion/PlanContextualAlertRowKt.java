package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\u0011"}, d2 = {"PlanContextualAlertRow", "", "alert", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/UIContextualAlert;", "onLinkClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "linkUrl", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/UIContextualAlert;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildRichTextWithLink", "Lcom/paypal/pds/core/RichText;", "content", "linkText", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanContextualAlertRowKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanContextualAlertRow(final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIContextualAlert uIContextualAlert, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.Pair pair;
        final java.lang.String stringResource;
        com.paypal.pds.core.RichText invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContextualAlert, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(727889868);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(uIContextualAlert) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(727889868, i4, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRow (PlanContextualAlertRow.kt:69)");
                }
                int i6 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt.WhenMappings.$EnumSwitchMapping$0[uIContextualAlert.getType().ordinal()];
                if (i6 == 1) {
                    pair = kotlin.TuplesKt.to(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE);
                } else if (i6 == 2) {
                    pair = kotlin.TuplesKt.to(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE);
                } else {
                    if (i6 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    pair = kotlin.TuplesKt.to(com.paypal.pds.core.Icon.Info.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE);
                }
                com.paypal.pds.core.Icon icon = (com.paypal.pds.core.Icon) pair.component1();
                com.paypal.pds.core.Color color = (com.paypal.pds.core.Color) pair.component2();
                int i7 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt.WhenMappings.$EnumSwitchMapping$1[uIContextualAlert.getDisclosureType().ordinal()];
                if (i7 == 1) {
                    startRestartGroup.startReplaceGroup(-577489273);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_disclosure_quasi_cash, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i7 == 2) {
                    startRestartGroup.startReplaceGroup(-577484720);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_disclosure_bank_account_echeck, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i7 != 3) {
                        startRestartGroup.startReplaceGroup(-577491233);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-623410837);
                    startRestartGroup.endReplaceGroup();
                    stringResource = "Additional terms may apply to this payment.";
                }
                if (uIContextualAlert.getLinkText() == null || uIContextualAlert.getLinkUrl() == null) {
                    startRestartGroup.startReplaceGroup(-721738262);
                    com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
                    boolean changed = startRestartGroup.changed(stringResource);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt.m15731$r8$lambda$TMLOAbGNzZn0LBIrzZ0nr_6fU(stringResource, (com.paypal.pds.core.Builder) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-721893572);
                    startRestartGroup.endReplaceGroup();
                    final java.lang.String linkText = uIContextualAlert.getLinkText();
                    final java.lang.String linkUrl = uIContextualAlert.getLinkUrl();
                    invoke = com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt.m15733$r8$lambda$uqWMEJRy5PLYAOENs7UML_vjBU(stringResource, linkText, linkUrl, (com.paypal.pds.core.Builder) obj);
                        }
                    });
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                modifier3 = modifier4;
                com.paypal.pds.components.IconKt.Icon(icon, null, rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTop()), com.paypal.pds.components.IconSize.XSmall.INSTANCE, color, startRestartGroup, 3120, 0);
                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                androidx.compose.ui.Modifier align = rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically());
                com.paypal.pds.core.Color.ContentMuted contentMuted2 = contentMuted;
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt.$r8$lambda$mnsquKz7dFXDbohD41HL5_midSc(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(invoke, align, contentMuted2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall, null, startRestartGroup, 384, 48, 5112);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanContextualAlertRowKt.m15732$r8$lambda$5NkyP_eJqir_UNuH2SPNIiMjNU(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIContextualAlert.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$-TMLOAbGNzZn0LBIr-zZ0nr_6fU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15731$r8$lambda$TMLOAbGNzZn0LBIrzZ0nr_6fU(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5N-kyP_eJqir_UNuH2SPNIiMjNU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15732$r8$lambda$5NkyP_eJqir_UNuH2SPNIiMjNU(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIContextualAlert uIContextualAlert, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanContextualAlertRow(uIContextualAlert, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mnsquKz7dFXDbohD41HL5_midSc(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uqWMEJRy5P-LYAOENs7UML_vjBU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15733$r8$lambda$uqWMEJRy5PLYAOENs7UML_vjBU(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default < 0) {
            com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
            com.paypal.pds.core.Builder.append$default(builder, " ", null, false, 6, null);
            builder.appendLink(str2, str3);
        } else {
            if (indexOf$default > 0) {
                java.lang.String substring = str.substring(0, indexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            builder.appendLink(str2, str3);
            int length = indexOf$default + str2.length();
            if (length < str.length()) {
                java.lang.String substring2 = str.substring(length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.QUASI_CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.BANK_ACCOUNT_ECHECK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}

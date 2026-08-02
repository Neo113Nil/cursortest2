package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"PersistentDebt", "", "persistentDebt", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/PersistentDebtUiModel;", "onDetailsPageClick", "Lkotlin/Function1;", "", "onPhoneNumberClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/PersistentDebtUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PersistentDebtPreview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PersistentDebtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0076  */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersistentDebt(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel persistentDebtUiModel, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        ?? r13;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentDebtUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2082806495);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(persistentDebtUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2082806495, i4, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebt (PersistentDebt.kt:38)");
                }
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
                com.paypal.pds.core.Icon.Info info2 = info;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.IconKt.Icon(info2, null, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing2(), com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 9, null), com.paypal.pds.components.IconSize.XSmall.INSTANCE, null, startRestartGroup, 3126, 16);
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(persistentDebtUiModel.getText().asString(startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText detailsPage = persistentDebtUiModel.getDetailsPage();
                if (detailsPage != null) {
                    startRestartGroup.startReplaceGroup(-962620358);
                    r13 = 0;
                    java.lang.String asString = detailsPage.getText().asString(startRestartGroup, 0);
                    i5 = i4;
                    boolean z = (i5 & 112) == 32;
                    boolean changed = startRestartGroup.changed(detailsPage);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.m18235$r8$lambda$Jw59e3L1XZuCep4fm5NbQOlR0c(kotlin.jvm.functions.Function1.this, detailsPage);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.LinkKt.Link(asString, null, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 0, 10);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-962620359);
                    startRestartGroup.endReplaceGroup();
                    i5 = i4;
                    r13 = 0;
                }
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText phoneNumber = persistentDebtUiModel.getPhoneNumber();
                if (phoneNumber != null) {
                    startRestartGroup.startReplaceGroup(-962407078);
                    java.lang.String asString2 = phoneNumber.getText().asString(startRestartGroup, r13);
                    boolean z2 = (i5 & 896) != 256 ? r13 : true;
                    boolean changed2 = startRestartGroup.changed(phoneNumber);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.$r8$lambda$sEg7ebFtd6_NlC9xfP6kkLF5xyI(kotlin.jvm.functions.Function1.this, phoneNumber);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.LinkKt.Link(asString2, null, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 0, 10);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-962407079);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.m18234$r8$lambda$040sWjglx0sozrMMEau1MF5Pns(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel.this, function1, function12, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$040sWjglx-0sozrMMEau1MF5Pns, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18234$r8$lambda$040sWjglx0sozrMMEau1MF5Pns(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel persistentDebtUiModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersistentDebt(persistentDebtUiModel, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4hsoJF8o_T6wohv2NCUWwLRe720(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Jw59e3L1XZuCep4-fm5NbQOlR0c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18235$r8$lambda$Jw59e3L1XZuCep4fm5NbQOlR0c(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText linkedText) {
        function1.invoke(linkedText.getLink());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_lhxIPT2S9aBYXM8pEPYFqCgW6A(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q0x9cimvnuZWXJ0h1FfdLzn4gbg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-322692437);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-322692437, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtPreview (PersistentDebt.kt:75)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel persistentDebtUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Your account is approaching persistent debt because you’ve made only low or minimum payments for the past {12 months} or more. We call this stage {1} of persistent debt."), new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText("https://..", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("How to avoid persistent debt")), new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText("0800 368 7155", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Please call us on 0800 368 7155")));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.$r8$lambda$_lhxIPT2S9aBYXM8pEPYFqCgW6A((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.$r8$lambda$4hsoJF8o_T6wohv2NCUWwLRe720((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PersistentDebt(persistentDebtUiModel, function1, (kotlin.jvm.functions.Function1) rememberedValue2, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 432, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.$r8$lambda$q0x9cimvnuZWXJ0h1FfdLzn4gbg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sEg7ebFtd6_NlC9xfP6kkLF5xyI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText linkedText) {
        function1.invoke(linkedText.getLink());
        return kotlin.Unit.INSTANCE;
    }
}

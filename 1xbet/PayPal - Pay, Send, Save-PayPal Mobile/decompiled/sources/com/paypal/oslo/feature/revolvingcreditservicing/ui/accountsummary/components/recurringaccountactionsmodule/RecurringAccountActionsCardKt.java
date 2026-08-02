package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0012"}, d2 = {"RecurringAccountActionsCard", "", "actionItems", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountActionItemUiModel;", "onItemClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringAccountActionItem", "actionItem", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountActionItemUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RecurringAccountActionsCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecurringAccountActionsCardSmallPreview", "RecurringAccountActionsCardLargeTextPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RecurringAccountActionsCardKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringAccountActionsCard(final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2128232582);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2128232582, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCard (RecurringAccountActionsCard.kt:48)");
                }
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardTestArgs.MODULE_ARG), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-456614944, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$6v5iB9rFG7d93Cogk5TOkSDU0QA(list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, 500);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$24ngq92fNpHInyetgm90AmYBH58(list, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1085538558);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(recurringAccountActionItemUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1085538558, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionItem (RecurringAccountActionsCard.kt:72)");
            }
            androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing96());
            com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$5ZKZGCyCxMGwTcuZMdgfI3V0xH0(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1745width3ABfNKs, null, none, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 384, 29), recurringAccountActionItemUiModel.getText().asString(startRestartGroup, 0));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(recurringAccountActionItemUiModel.getIcon()), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            java.lang.String asString = recurringAccountActionItemUiModel.getText().asString(startRestartGroup, 0);
            int m8501getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(asString, null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8501getEllipsisgIe3tQ8), false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 6, 974);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.m18251$r8$lambda$kbH_i9xvbvMWVUC1lTLsbItDs(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0CSFurCcp0ZxIGcFGei5XNof9ZQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(486677389);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(486677389, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardSmallPreview (RecurringAccountActionsCard.kt:119)");
            }
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> create = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionsFactory.INSTANCE.create();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$S14yVl2Ke00V2N2bQHnlDW7wr_E((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RecurringAccountActionsCard(create, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$0CSFurCcp0ZxIGcFGei5XNof9ZQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$24ngq92fNpHInyetgm90AmYBH58(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RecurringAccountActionsCard(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$56QG3adgyLwXbGQku2adAZTKqfQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringAccountActionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ZKZGCyCxMGwTcuZMdgfI3V0xH0(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6v5iB9rFG7d93Cogk5TOkSDU0QA(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-456614944, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCard.<anonymous> (RecurringAccountActionsCard.kt:54)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceEvenly(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 6);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-25079030);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel) it.next();
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(recurringAccountActionItemUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$z0wOR4847gV3t3XFDpyQC4UxSyQ(kotlin.jvm.functions.Function1.this, recurringAccountActionItemUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Camera2StreamConfigurationMap(recurringAccountActionItemUiModel, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A8HnwP6yB_VV7GJPQtRPV_f1N74(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(882880918);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(882880918, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardPreview (RecurringAccountActionsCard.kt:107)");
            }
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> create = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionsFactory.INSTANCE.create();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$NRjnEDLNB2UYVujLnQHIuVDVc9o((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RecurringAccountActionsCard(create, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$A8HnwP6yB_VV7GJPQtRPV_f1N74(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NRjnEDLNB2UYVujLnQHIuVDVc9o(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringAccountActionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S14yVl2Ke00V2N2bQHnlDW7wr_E(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringAccountActionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YSrHqnx_kTVye3PuXIfWgbf5Lew(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1360882132);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1360882132, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardLargeTextPreview (RecurringAccountActionsCard.kt:131)");
            }
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> create = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionsFactory.INSTANCE.create();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$56QG3adgyLwXbGQku2adAZTKqfQ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RecurringAccountActionsCard(create, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.recurringaccountactionsmodule.RecurringAccountActionsCardKt.$r8$lambda$YSrHqnx_kTVye3PuXIfWgbf5Lew(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kb-H_i9xvbvMWVUC1lT-LsbItDs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18251$r8$lambda$kbH_i9xvbvMWVUC1lTLsbItDs(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(recurringAccountActionItemUiModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z0wOR4847gV3t3XFDpyQC4UxSyQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel recurringAccountActionItemUiModel) {
        function1.invoke(recurringAccountActionItemUiModel);
        return kotlin.Unit.INSTANCE;
    }
}

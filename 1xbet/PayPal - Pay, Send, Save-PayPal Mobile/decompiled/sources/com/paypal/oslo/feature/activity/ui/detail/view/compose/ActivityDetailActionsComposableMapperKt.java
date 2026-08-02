package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u008a\u0084\u0002"}, d2 = {"ActivityDetailActionsCompose", "", "activityDetailActionsViewModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;", "onActionClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DisplayActionButton", "actionsList", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ActionButtonChip", "action", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity_prodRelease", "expanded", "", "firstAction"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailActionsComposableMapperKt {
    public static final void ActivityDetailActionsCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailActionsModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailActionsModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(68584711);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activityDetailActionsModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$8BVyo4oCjF_psOP9vINTlC1io08((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(68584711, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsCompose (ActivityDetailActionsComposableMapper.kt:77)");
            }
            java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> actions = activityDetailActionsModel.getActions();
            if (actions != null && !actions.isEmpty()) {
                startRestartGroup.startReplaceGroup(-1197079054);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE)), "activity_detail_actions_overlay");
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                DisplayActionButton(activityDetailActionsModel.getActions(), null, function1, startRestartGroup, (i3 << 3) & 896, 2);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1196793637);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$XtudrW8EKslIudYtC5bN0LV2Ims(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel.this, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisplayActionButton(final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function12;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function14;
        androidx.compose.runtime.MutableState mutableState;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1360449121);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i5 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                boolean z = false;
                if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i3 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$YxXJrTUe838fPWje8NyFyVK50iQ((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1360449121, i5, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.DisplayActionButton (ActivityDetailActionsComposableMapper.kt:95)");
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (com.paypal.oslo.feature.activity.domain.common.models.ActionsMapper.INSTANCE.getActionDisplayValue$activity_prodRelease(((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj).getType()) != -1) {
                            arrayList.add(obj);
                        }
                    }
                    final java.util.ArrayList<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> arrayList2 = arrayList;
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableState mutableStateOf$default;
                                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                return mutableStateOf$default;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
                    boolean changed = startRestartGroup.changed(arrayList2);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$mb515XUcyKCRYvpLPM5ZCgxjfh8(arrayList2);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    if (((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) ((androidx.compose.runtime.State) rememberedValue3).getValue()) != null) {
                        startRestartGroup.startReplaceGroup(-1827825484);
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(modifier4, com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getEnd(), startRestartGroup, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                        androidx.compose.runtime.MutableState mutableState3 = mutableState2;
                        if (((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(-318519165);
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getEnd(), startRestartGroup, 48);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(1809069562);
                            for (final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel : arrayList2) {
                                boolean z2 = (i5 & 896) == 256 ? true : z;
                                boolean changed2 = startRestartGroup.changed(activityActionModel);
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if ((z2 | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.m11815$r8$lambda$MXuXjoP7AtKbyk2RKfxm3F4esc(kotlin.jvm.functions.Function1.this, activityActionModel);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                getHighSpeedVideoFpsRangesFor(activityActionModel, null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0, 2);
                                mutableState2 = mutableState2;
                                z = false;
                            }
                            mutableState = mutableState2;
                            i4 = 48;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceGroup();
                        } else {
                            mutableState = mutableState2;
                            i4 = 48;
                            startRestartGroup.startReplaceGroup(-318089164);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, i4);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        if (!((java.lang.Boolean) mutableState3.getValue()).booleanValue() && arrayList2.size() > 1) {
                            startRestartGroup.startReplaceGroup(862763215);
                            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel2 = (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2);
                            androidx.compose.ui.Modifier weight = rowScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false);
                            boolean z3 = (i5 & 896) == 256;
                            boolean changedInstance = startRestartGroup.changedInstance(arrayList2);
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((changedInstance | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.m11814$r8$lambda$IOEol2IGBJFfkDK_toIAZOz2Ik(kotlin.jvm.functions.Function1.this, arrayList2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            getHighSpeedVideoFpsRangesFor(activityActionModel2, weight, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 0, 0);
                            startRestartGroup.endReplaceGroup();
                        } else if (!((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(863011587);
                            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel3 = (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2);
                            boolean z4 = (i5 & 896) == 256;
                            boolean changedInstance2 = startRestartGroup.changedInstance(arrayList2);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if ((changedInstance2 | z4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.m11817$r8$lambda$uQQvd1Fi1TftzhUtdmyE4C2E0M(kotlin.jvm.functions.Function1.this, arrayList2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            getHighSpeedVideoFpsRangesFor(activityActionModel3, null, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0, 2);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(863124024);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (arrayList2.size() > 1) {
                            startRestartGroup.startReplaceGroup(863173469);
                            com.paypal.pds.core.Icon.DotsVertical dotsVertical = com.paypal.pds.core.Icon.DotsVertical.INSTANCE;
                            final androidx.compose.runtime.MutableState mutableState4 = mutableState;
                            boolean changed3 = startRestartGroup.changed(mutableState4);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$VO3X_df4Q8KI6vMG6OcjaaXtFyI(androidx.compose.runtime.MutableState.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            function13 = function14;
                            modifier3 = modifier4;
                            com.paypal.pds.components.IconButtonKt.IconButton(dotsVertical, (kotlin.jvm.functions.Function0) rememberedValue7, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "activity_detail_actions_menu_expand").then(modifier4), null, null, null, null, false, false, startRestartGroup, 6, 504);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            function13 = function14;
                            modifier3 = modifier4;
                            startRestartGroup.startReplaceGroup(863506936);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        function13 = function14;
                        modifier3 = modifier4;
                        startRestartGroup.startReplaceGroup(-1826206013);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$bxW_gNygnuLIYuCeMjkUDuAvl0E(list, modifier5, function13, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            boolean z5 = false;
            if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function12 = function1;
        boolean z52 = false;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(266402740);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityActionModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(266402740, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActionButtonChip (ActivityDetailActionsComposableMapper.kt:152)");
                }
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.domain.common.models.ActionsMapper.INSTANCE.getActionDisplayValue$activity_prodRelease(activityActionModel.getType()), startRestartGroup, 0), modifier3, null, null, null, null, false, false, startRestartGroup, ((i3 >> 6) & 14) | ((i3 << 3) & 896), 504);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapperKt.$r8$lambda$pP_vYCffpUCEfAYKKPHx6MfoU9Q(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel.this, modifier4, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8BVyo4oCjF_psOP9vINTlC1io08(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IOEol2IGBJFfkDK_toI-AZOz2Ik, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11814$r8$lambda$IOEol2IGBJFfkDK_toIAZOz2Ik(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        function1.invoke(kotlin.collections.CollectionsKt.first(list));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MXuXjoP7AtKbyk-2RKfxm3F4esc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11815$r8$lambda$MXuXjoP7AtKbyk2RKfxm3F4esc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        function1.invoke(activityActionModel);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$VO3X_df4Q8KI6vMG6OcjaaXtFyI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XtudrW8EKslIudYtC5bN0LV2Ims(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailActionsModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityDetailActionsCompose(activityDetailActionsModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YxXJrTUe838fPWje8NyFyVK50iQ(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bxW_gNygnuLIYuCeMjkUDuAvl0E(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DisplayActionButton(list, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel $r8$lambda$mb515XUcyKCRYvpLPM5ZCgxjfh8(java.util.List list) {
        return (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.firstOrNull(list);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pP_vYCffpUCEfAYKKPHx6MfoU9Q(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(activityActionModel, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uQQv-d1Fi1TftzhUtdmyE4C2E0M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11817$r8$lambda$uQQvd1Fi1TftzhUtdmyE4C2E0M(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        function1.invoke(kotlin.collections.CollectionsKt.first(list));
        return kotlin.Unit.INSTANCE;
    }
}

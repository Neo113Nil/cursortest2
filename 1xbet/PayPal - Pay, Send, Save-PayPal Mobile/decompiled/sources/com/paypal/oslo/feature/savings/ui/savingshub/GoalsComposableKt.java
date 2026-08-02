package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001aM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rH\u0001¢\u0006\u0002\u0010\u000f\u001aM\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001f\u001a1\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010#\u001a\u0012\u0010$\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u00010\"H\u0000\u001a\u001a\u0010&\u001a\u00020\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\u0006\u0010'\u001a\u00020\"H\u0000\u001a)\u0010(\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"PercentageToDecimal", "", "GoalList", "", "goalZone", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "onCreateGoalClick", "Lkotlin/Function0;", "onGoalClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "GoalCard", "goalSummary", "isGeneralSavings", "cardIndex", "", "onClick", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Landroidx/compose/ui/Modifier;ZIZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "GoalIcon", "icon", "Lcom/paypal/pds/core/Icon;", "(Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "calculateCurrentAmount", "targetAmount", "progressPercentage", "", "(Ljava/lang/Float;D)F", "GoalProgressBar", "testTag", "", "(FDLandroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "parseFormattedAmount", "formattedAmount", "formatTargetDisplay", "unknownText", "GoalProgress", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;IZLandroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GoalsComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoalList(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, androidx.compose.ui.Modifier modifier, boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function12;
        androidx.compose.ui.Modifier.Companion companion;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalZoneDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1516333480);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(goalZoneDTO) ? 4 : 2) | i : i;
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
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i5 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 != 0) {
                    i5 |= 24576;
                } else if ((i & 24576) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    int i7 = 1;
                    if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        z3 = z2;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z4 = i3 != 0 ? false : z2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$nvKlUxB_f1oiKvYKOPpZmGDUeI0((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function13 = function12;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1516333480, i5, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalList (GoalsComposable.kt:78)");
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(companion, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getGOALS_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.SECTION);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        int i8 = (i5 & 896) | 3120;
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function15 = function13;
                        com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, z4, com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$GoalsComposableKt.INSTANCE.getLambda$625954091$savings_prodRelease(), startRestartGroup, i8, 1);
                        com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z4, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1186663828, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$pSld22gWadTryfXyVt7bo70_Oz0(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, i8, 1);
                        startRestartGroup.endNode();
                        float f = 0.0f;
                        java.lang.Object obj = null;
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.LIST);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(1543282297);
                        int i9 = 0;
                        for (java.lang.Object obj2 : goalZoneDTO.getGoals()) {
                            if (i9 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj2;
                            boolean isGeneralSavingsTile = goalSummaryDTO.isGeneralSavingsTile();
                            androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i7, obj), com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.copy$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getGOAL_CARD(), null, 0, null, java.lang.Integer.valueOf(i9), 7, null)), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getGOAL_CARD_TAP()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCard(i9));
                            int i10 = (i5 & 57344) == 16384 ? i7 : 0;
                            boolean changed = startRestartGroup.changed(goalSummaryDTO);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if ((i10 | (changed ? 1 : 0)) != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function14 = function15;
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$skqX1kDUEjhdfqG2kXM8kls5xB8(kotlin.jvm.functions.Function1.this, goalSummaryDTO);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            } else {
                                function14 = function15;
                            }
                            GoalCard(goalSummaryDTO, testTag3, isGeneralSavingsTile, i9, z4, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, (i5 << 6) & 57344, 0);
                            i9++;
                            function15 = function14;
                            obj = null;
                            f = 0.0f;
                            i7 = i7;
                        }
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function16 = function15;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z3 = z4;
                        function12 = function16;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function17 = function12;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.m18950$r8$lambda$Lp0MAr3R1hnJ_hPy1BTCLjqJxE(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO.this, modifier3, z3, function0, function17, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                int i72 = 1;
                if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            function12 = function1;
            int i722 = 1;
            if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function12 = function1;
        int i7222 = 1;
        if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoalCard(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, androidx.compose.ui.Modifier modifier, boolean z, int i, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier2;
        final int i10;
        final boolean z5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-190059726);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(goalSummaryDTO) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 2048 : 1024;
                    i8 = i3 & 16;
                    if (i8 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                        i9 = i3 & 32;
                        if (i9 != 0) {
                            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i2) == 0) {
                            function02 = function0;
                            i4 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                i10 = i7;
                                z5 = z4;
                                function03 = function02;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                final boolean z6 = i5 != 0 ? false : z3;
                                final int i12 = i6 != 0 ? 0 : i7;
                                final boolean z7 = i8 != 0 ? false : z4;
                                if (i9 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                                } else {
                                    function04 = function02;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-190059726, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard (GoalsComposable.kt:166)");
                                }
                                com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1274751768, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.m18951$r8$lambda$OxDBYNXChYu442sUgHZUPVSpAU(z6, goalSummaryDTO, i12, z7, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54);
                                int i13 = i4 >> 3;
                                int i14 = (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | (i13 & 14) | 805306416 | (i13 & 57344);
                                boolean z8 = z7;
                                com.paypal.pds.components.CardKt.Card(companion, com.paypal.pds.core.Color.BackgroundCardOutlined.INSTANCE, null, outlined, function04, null, null, null, null, rememberComposableLambda, startRestartGroup, i14, 484);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                z5 = z8;
                                z3 = z6;
                                i10 = i12;
                                function03 = function04;
                                modifier2 = companion;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final boolean z9 = z3;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.m18949$r8$lambda$8Mu3EPvxohC9XYj5o604sjgibw(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, modifier3, z9, i10, z5, function03, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function02 = function0;
                        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z4 = z2;
                    i9 = i3 & 32;
                    if (i9 != 0) {
                    }
                    function02 = function0;
                    if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i;
                i8 = i3 & 16;
                if (i8 == 0) {
                }
                z4 = z2;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            z4 = z2;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        z4 = z2;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.pds.core.Icon icon, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(429853277);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(429853277, i5, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalIcon (GoalsComposable.kt:284)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier, com.paypal.pds.core.ConstantsKt.getSpacing48()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i5 & 14) | 27696, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$qtkaLt2DW5c8pgyRg5KiKUGzIXU(com.paypal.pds.core.Icon.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float calculateCurrentAmount(java.lang.Float f, double d) {
        float floatValue = f != null ? f.floatValue() : 0.0f;
        if (floatValue > 0.0f) {
            return (((float) d) / 100.0f) * floatValue;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoalProgressBar(final float f, final double d, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1967116389);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(d) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    str3 = str2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str4 = i4 != 0 ? "" : str2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1967116389, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalProgressBar (GoalsComposable.kt:337)");
                    }
                    java.lang.String str5 = str4;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.ProgressBarKt.ProgressBar(f, calculateCurrentAmount(java.lang.Float.valueOf(f), d), androidx.compose.ui.platform.TestTagKt.testTag(modifier3, str4), com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, 0, 0, 0L, null, startRestartGroup, (i3 & 14) | 3072, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str5;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$2CIuVl6Cw0UwHTSbhrylgdOqvdM(f, d, modifier5, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float parseFormattedAmount(java.lang.String str) {
        java.lang.Float floatOrNull;
        if (str == null || (floatOrNull = kotlin.text.StringsKt.toFloatOrNull(kotlin.text.StringsKt.trim(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_EUR, "", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP, "", false, 4, (java.lang.Object) null), "¥", "", false, 4, (java.lang.Object) null), "₹", "", false, 4, (java.lang.Object) null), ",", "", false, 4, (java.lang.Object) null), " ", "", false, 4, (java.lang.Object) null)).toString())) == null) {
            return 0.0f;
        }
        return floatOrNull.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, boolean z, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        final int i7;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2127572652);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(goalSummaryDTO) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    i7 = i5;
                    z3 = z2;
                } else {
                    i7 = i8 != 0 ? 0 : i5;
                    boolean z4 = i6 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-2127572652, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalProgress (GoalsComposable.kt:399)");
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardProgress(i7));
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
                    int i9 = (i4 & 896) | 3120;
                    com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z4, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(636580795, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$hECk4ynRUqu6_i51xCq2Bj2JkG4(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, i7, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, i9, 1);
                    startRestartGroup.endNode();
                    final java.lang.String formatTargetDisplay = formatTargetDisplay(goalSummaryDTO.getTargetAmountFormatted(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_progress_unknown, startRestartGroup, 0));
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, z4, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1298851804, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$3TSBvZQBE9bVvtfNfy3MLBplALc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, formatTargetDisplay, i7, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, i9, 1);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i10 = i7;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$GByIxtNKcS81X8h3pp2rakphwLs(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, i10, z3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2CIuVl6Cw0UwHTSbhrylgdOqvdM(float f, double d, androidx.compose.ui.Modifier modifier, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GoalProgressBar(f, d, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3TSBvZQBE9bVvtfNfy3MLBplALc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1298851804, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalProgress.<anonymous>.<anonymous> (GoalsComposable.kt:436)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_progress_format, new java.lang.Object[]{goalSummaryDTO.getCurrentAmountFormatted(), str}, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardProgressText(i)), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8M-u3EPvxohC9XYj5o604sjgibw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18949$r8$lambda$8Mu3EPvxohC9XYj5o604sjgibw(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, androidx.compose.ui.Modifier modifier, boolean z, int i, boolean z2, kotlin.jvm.functions.Function0 function0, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        GoalCard(goalSummaryDTO, modifier, z, i, z2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8u7mwJ2eSufP3didcVf8ayYM7YU(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(208108799, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoalsComposable.kt:201)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(goalSummaryDTO.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardTitle(i)), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BaTgjXhds39r5VJ3Xe8mCpGuKW0(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1306887259, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoalsComposable.kt:240)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(goalSummaryDTO.getCurrentAmountFormatted(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardAmount(i)), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D8rt3sjQcNbOfkwEvunJnmp4jHE(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1304197130, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoalsComposable.kt:255)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_label, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardGoalLabel(i)), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GByIxtNKcS81X8h3pp2rakphwLs(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, boolean z, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        Camera2StreamConfigurationMap(goalSummaryDTO, i, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Lp-0MAr3R1hnJ_hPy1BTCLjqJxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18950$r8$lambda$Lp0MAr3R1hnJ_hPy1BTCLjqJxE(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GoalList(goalZoneDTO, modifier, z, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OxDBYNXChY-u442sUgHZUPVSpAU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18951$r8$lambda$OxDBYNXChYu442sUgHZUPVSpAU(boolean z, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, final int i, boolean z2, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1274751768, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard.<anonymous> (GoalsComposable.kt:173)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-78281335, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$Xii7CrALyaWNS1ZOT3uVbcSlWGU(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3120, 1);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer, 0);
            androidx.compose.ui.Alignment.Horizontal start = androidx.compose.ui.Alignment.INSTANCE.getStart();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, start, composer, 54);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ShimmerStyle.Text text = com.paypal.pds.components.ShimmerStyle.Text.INSTANCE;
            com.paypal.pds.components.ShimmerKt.Shimmer(z2 ? androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 1, null) : androidx.compose.ui.Modifier.INSTANCE, text, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(208108799, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$8u7mwJ2eSufP3didcVf8ayYM7YU(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3120, 0);
            com.paypal.pds.components.ShimmerStyle.Text text2 = com.paypal.pds.components.ShimmerStyle.Text.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            if (z2) {
                companion2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(companion2, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 1, null);
            }
            com.paypal.pds.components.ShimmerKt.Shimmer(companion2, text2, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(150011702, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$jvdeWUb6cjfPrs6g81Yy9N2zAXc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3120, 0);
            composer.endNode();
            composer.endNode();
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getEnd(), composer, 48);
            int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion3);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ShimmerStyle.Text text3 = com.paypal.pds.components.ShimmerStyle.Text.INSTANCE;
            com.paypal.pds.components.ShimmerKt.Shimmer(z2 ? androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 1, null) : androidx.compose.ui.Modifier.INSTANCE, text3, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1306887259, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$BaTgjXhds39r5VJ3Xe8mCpGuKW0(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3120, 0);
            if (z || parseFormattedAmount(goalSummaryDTO.getTargetAmountFormatted()) <= 0.0f) {
                composer.startReplaceGroup(-1261912710);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1262584170);
                com.paypal.pds.components.ShimmerStyle.Text text4 = com.paypal.pds.components.ShimmerStyle.Text.INSTANCE;
                com.paypal.pds.components.ShimmerKt.Shimmer(z2 ? androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 1, null) : androidx.compose.ui.Modifier.INSTANCE, text4, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1304197130, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.GoalsComposableKt.$r8$lambda$D8rt3sjQcNbOfkwEvunJnmp4jHE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 3120, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (z || parseFormattedAmount(goalSummaryDTO.getTargetAmountFormatted()) <= 0.0f) {
                composer.startReplaceGroup(339968052);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(339780657);
                Camera2StreamConfigurationMap(goalSummaryDTO, i, z2, composer, 0, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xii7CrALyaWNS1ZOT3uVbcSlWGU(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-78281335, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoalsComposable.kt:188)");
            }
            Camera2StreamConfigurationMap(goalSummaryDTO.getIcon(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardIcon(i)), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$hECk4ynRUqu6_i51xCq2Bj2JkG4(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, androidx.compose.runtime.Composer composer, int i2) {
        float f;
        java.lang.String value;
        java.lang.Float floatOrNull;
        float floatValue;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(636580795, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalProgress.<anonymous>.<anonymous> (GoalsComposable.kt:412)");
            }
            if (goalSummaryDTO.getTargetAmountFormatted() != null) {
                floatValue = parseFormattedAmount(goalSummaryDTO.getTargetAmountFormatted());
            } else {
                com.paypal.oslo.feature.savings.domain.model.transfers.Money targetAmount = goalSummaryDTO.getTargetAmount();
                if (targetAmount == null || (value = targetAmount.getValue()) == null || (floatOrNull = kotlin.text.StringsKt.toFloatOrNull(value)) == null) {
                    f = 0.0f;
                    GoalProgressBar(f, goalSummaryDTO.getProgress(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardProgressBar(i), composer, 384, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    floatValue = floatOrNull.floatValue();
                }
            }
            f = floatValue;
            GoalProgressBar(f, goalSummaryDTO.getProgress(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardProgressBar(i), composer, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jvdeWUb6cjfPrs6g81Yy9N2zAXc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.String stringResource;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(150011702, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoalsComposable.kt:215)");
            }
            if (goalSummaryDTO.isAutoSaveEnabled()) {
                composer.startReplaceGroup(-2062226555);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_auto_save_on, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2062086714);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_manual_save, composer, 0);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.INSTANCE.goalCardAutoSave(i)), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nvKlUxB_f1oiKvYKOPpZmGDUeI0(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pSld22gWadTryfXyVt7bo70_Oz0(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1186663828, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.GoalList.<anonymous>.<anonymous>.<anonymous> (GoalsComposable.kt:109)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_create_goal, composer, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.Goals.CREATE_BUTTON), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getCREATE_GOAL_BUTTON()), null, com.paypal.pds.core.Icon.Plus.INSTANCE, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer, 1794048, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qtkaLt2DW5c8pgyRg5KiKUGzIXU(com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(icon, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$skqX1kDUEjhdfqG2kXM8kls5xB8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        function1.invoke(goalSummaryDTO);
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.String formatTargetDisplay(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return str == null ? str2 : str;
    }
}

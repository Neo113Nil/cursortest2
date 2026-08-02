package com.paypal.oslo.feature.bnplservicing.ui.paymentschedule;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00060\fj\u0002`\r*\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"PaymentScheduleHalfSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "onClose", "Lkotlin/Function0;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PaymentScheduleHalfSheetContent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;Landroidx/compose/runtime/Composer;I)V", "toTimeLineItem", "Lcom/paypal/pds/components/TimelineVerticalItem;", "Lcom/paypal/pds/components/TimelineItem;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/ScheduleItemUiModel;", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/ScheduleItemUiModel;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/TimelineVerticalItem;", "PaymentScheduleHalfSheetContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleHalfSheetKt {
    public static final void PaymentScheduleHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentScheduleUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-921878144);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(paymentScheduleUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-921878144, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheet (PaymentScheduleHalfSheet.kt:44)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$PaymentScheduleHalfSheet$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$PaymentScheduleHalfSheet$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetTag.HALF_SHEET);
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
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(com.paypal.oslo.core.commonui.utils.RefTextKt.value(paymentScheduleUiModel.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), false, null, 4, null);
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            boolean z3 = (i2 & 896) == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.m12621$r8$lambda$mYAsWkFjkagVqC3_HJA98J0wic(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1709319425, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.$r8$lambda$ndjXYd0XFAW7yR7OWC8lnd1b34U(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i3 | ((i2 >> 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.$r8$lambda$BG3Oa5rnJ0zbkXzytyC5_VFwhCs(com.paypal.pds.components.BottomSheetController.this, paymentScheduleUiModel, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PaymentScheduleHalfSheetContent(final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentScheduleUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2085817575);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(paymentScheduleUiModel) ? 4 : 2) | i : i;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2085817575, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetContent (PaymentScheduleHalfSheet.kt:74)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize0());
            startRestartGroup.startReplaceGroup(-2046629844);
            java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> scheduleItems = paymentScheduleUiModel.getScheduleItems();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(scheduleItems, 10));
            for (com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel scheduleItemUiModel : scheduleItems) {
                int i3 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
                arrayList.add(toTimeLineItem(scheduleItemUiModel, startRestartGroup, i3 | i3));
            }
            startRestartGroup.endReplaceGroup();
            com.paypal.pds.components.TimelineKt.Timeline(arrayList, m1707paddingVpY3zN4, null, startRestartGroup, 0, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.$r8$lambda$_zO7ICtXZIp7z0wdVto9LPAtzZ4(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.pds.components.TimelineVerticalItem toTimeLineItem(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel scheduleItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.components.TimelineState.Success success;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduleItemUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-105299959, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.toTimeLineItem (PaymentScheduleHalfSheet.kt:90)");
        }
        switch (com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.WhenMappings.$EnumSwitchMapping$0[scheduleItemUiModel.getDerivedStatus().ordinal()]) {
            case 1:
                success = com.paypal.pds.components.TimelineState.Success.INSTANCE;
                break;
            case 2:
            case 3:
            case 4:
                success = com.paypal.pds.components.TimelineState.Alert.INSTANCE.invoke();
                break;
            case 5:
            case 6:
                success = com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.pds.components.TimelineState timelineState = success;
        com.paypal.pds.components.TimelineVerticalItem invoke$default = com.paypal.pds.components.TimelineVerticalItem.Companion.invoke$default(com.paypal.pds.components.TimelineVerticalItem.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.value(timelineState instanceof com.paypal.pds.components.TimelineState.Alert ? scheduleItemUiModel.getDueNowText() : scheduleItemUiModel.getPaymentDateText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), timelineState, null, null, 12, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return invoke$default;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BG3Oa5rnJ0zbkXzytyC5_VFwhCs(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentScheduleHalfSheet(bottomSheetController, paymentScheduleUiModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NmoFa0EkWQJYQyQcrCXuJ9CPnXU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1491335697);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1491335697, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetContentPreview (PaymentScheduleHalfSheet.kt:113)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel = new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_schedule_title, new java.lang.Object[0]), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel[]{new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel("$38.87", "Jan 02, 2025", com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.PAID, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$38.87 due now"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$38.87 on Jan 02, 2025")), new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel("$81.92", "Jan 16, 2025", com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.PAST_DUE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$81.92 due now"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$81.92 on Jan 16, 2025")), new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel("$36.13", "Jan 30, 2025", com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.DUE_TODAY, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$36.13 due now"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$36.13 on Jan 30, 2025")), new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel("$54.93", "Feb 13, 2025", com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.SCHEDULED, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$54.93 due now"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$54.93 on Feb 13, 2025"))}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            java.lang.Object obj = rememberedValue;
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
                bottomSheetController.showSheet();
                startRestartGroup.updateRememberedValue(bottomSheetController);
                obj = bottomSheetController;
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) obj;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController2);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.$r8$lambda$xs1ZwKU7mUb_LhfXsnFDSkHypj0(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentScheduleHalfSheet(bottomSheetController2, paymentScheduleUiModel, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheetKt.$r8$lambda$NmoFa0EkWQJYQyQcrCXuJ9CPnXU(updateChangedFlags, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_zO7ICtXZIp7z0wdVto9LPAtzZ4(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentScheduleHalfSheetContent(paymentScheduleUiModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mYAs-WkFjkagVqC3_HJA98J0wic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12621$r8$lambda$mYAsWkFjkagVqC3_HJA98J0wic(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ndjXYd0XFAW7yR7OWC8lnd1b34U(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1709319425, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleHalfSheet.<anonymous>.<anonymous> (PaymentScheduleHalfSheet.kt:64)");
            }
            PaymentScheduleHalfSheetContent(paymentScheduleUiModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xs1ZwKU7mUb_LhfXsnFDSkHypj0(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.PAID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.DUE_TODAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.DELINQUENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.PAST_DUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.SCHEDULED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.UNKNOWN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

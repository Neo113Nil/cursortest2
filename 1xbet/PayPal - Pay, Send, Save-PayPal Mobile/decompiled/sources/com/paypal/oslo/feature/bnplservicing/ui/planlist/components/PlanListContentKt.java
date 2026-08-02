package com.paypal.oslo.feature.bnplservicing.ui.planlist.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/PlanModel;", "plans", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "", "onEvent", "PlanListItems", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanListContentKt {
    public static final void PlanListItems(final java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2117265034);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2117265034, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListItems (PlanListContent.kt:27)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListItemsTestTags.LAZY_COLUMN);
            androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt.$r8$lambda$gUobd7zdY5_9rijEMpD1kC9c8ks(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, null, m1699PaddingValues0680j_4, false, m1602spacedBy0680j_4, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6, 490);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt.$r8$lambda$yf4iN2XnG1ASNIifWtRWYJ0yuGw(list, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gUobd7zdY5_9rijEMpD1kC9c8ks(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$PlanListItems$lambda$0$0$$inlined$items$default$1 planListContentKt$PlanListItems$lambda$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$PlanListItems$lambda$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel planModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel) obj);
            }
        };
        lazyListScope.items(list.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$PlanListItems$lambda$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$PlanListItems$lambda$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel planModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel) list.get(i);
                composer.startReplaceGroup(-1094125764);
                if (planModel instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel) {
                    composer.startReplaceGroup(-1094088565);
                    com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel readyToUsePlanModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel) planModel;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "ready_to_use_plan_item_".concat(java.lang.String.valueOf(readyToUsePlanModel.getCreditAccountId())));
                    boolean changed = composer.changed(function1);
                    boolean changedInstance = composer.changedInstance(planModel);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final kotlin.jvm.functions.Function1 function12 = function1;
                        rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$PlanListItems$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                function12.invoke(new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview(((com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel) planModel).getCreditAccountId()));
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanKt.ReadyToUsePlan(readyToUsePlanModel, testTag, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 0);
                    composer.endReplaceGroup();
                } else if (planModel instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel) {
                    composer.startReplaceGroup(-1093569780);
                    com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel afterPurchasePlanModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel) planModel;
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "after_purchase_plan_item_".concat(java.lang.String.valueOf(afterPurchasePlanModel.getCreditAccountId())));
                    boolean changed2 = composer.changed(function1);
                    boolean changedInstance2 = composer.changedInstance(planModel);
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final kotlin.jvm.functions.Function1 function13 = function1;
                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanListContentKt$PlanListItems$1$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                function13.invoke(new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail(((com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel) planModel).getCreditAccountId()));
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanKt.AfterPurchasePlan(afterPurchasePlanModel, testTag2, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1093099417);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yf4iN2XnG1ASNIifWtRWYJ0yuGw(java.util.List list, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        PlanListItems(list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

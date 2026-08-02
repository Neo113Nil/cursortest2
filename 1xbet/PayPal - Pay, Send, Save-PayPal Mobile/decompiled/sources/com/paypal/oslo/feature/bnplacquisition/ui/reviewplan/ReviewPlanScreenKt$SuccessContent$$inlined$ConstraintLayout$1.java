package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1 $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.Channel $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.node.Ref $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState $getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel $getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintLayoutScope $getOutputFormats;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$getHighSpeedVideoFpsRanges.setValue(kotlin.Unit.INSTANCE);
            if (this.$getHighSpeedVideoFpsRangesFor.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
                this.$getHighSpeedVideoFpsRangesFor.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
            }
            this.$getOutputFormats.reset();
            androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = this.$getOutputFormats;
            composer.startReplaceGroup(1924611539);
            androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component3 = createRefs.component3();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$1$1.Camera2StreamConfigurationMap;
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion, component1, (kotlin.jvm.functions.Function1) rememberedValue), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.TOOLBAR);
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputSizeshNQ4ISI.getToolBarContent().getBackButtonLabel(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputSizeshNQ4ISI.getToolBarContent().getCloseButtonLabel(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            boolean changed = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$2$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(value, value2, testTag, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, false, composer, 0, 88);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed2 = composer.changed(component1);
            boolean changed3 = composer.changed(component3);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$3$1(component1, component3);
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(constraintLayoutScope.constrainAs(companion2, component2, (kotlin.jvm.functions.Function1) rememberedValue3), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.HeaderKt.Header(com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputSizeshNQ4ISI.getPlanOptionReviewContent().getTitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.HEADER), null, com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputSizeshNQ4ISI.getPlanOptionReviewContent().getSubtitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, composer, 48, 20);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), composer, 0);
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.getHighSpeedVideoFpsRangesFor(this.$getInputSizeshNQ4ISI, null, composer, 0, 2);
            composer.endNode();
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent = this.$getInputSizeshNQ4ISI.getReviewPlanFooterContent();
            boolean changed4 = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$5$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changed5 = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$6$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue5;
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$1$7$1.getHighSpeedVideoFpsRangesFor;
                composer.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterKt.ReviewPlanFooter(reviewPlanFooterContent, function0, function1, androidx.compose.ui.platform.TestTagKt.testTag(constraintLayoutScope.constrainAs(companion3, component3, (kotlin.jvm.functions.Function1) rememberedValue6), com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenTestTag.FOOTER), composer, 0, 0);
            composer.endReplaceGroup();
            boolean changedInstance = composer.changedInstance(this.$getOutputFormats);
            boolean changedInstance2 = composer.changedInstance(this.$getHighResolutionOutputSizeshNQ4ISI);
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2 = this.$getOutputFormats;
            final androidx.compose.runtime.MutableState mutableState = this.$getInputFormats;
            final androidx.compose.runtime.MutableState mutableState2 = this.$getHighSpeedVideoSizes;
            final kotlinx.coroutines.channels.Channel channel = this.$getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$1.1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.constraintlayout.compose.RawConstraintSet rawConstraintSet = new androidx.constraintlayout.compose.RawConstraintSet(androidx.constraintlayout.compose.ConstraintLayoutScope.this.getContainerObject().mo9053clone());
                        if (mutableState.getValue() == null || mutableState2.getValue() == null) {
                            mutableState.setValue(rawConstraintSet);
                            mutableState2.setValue(mutableState.getValue());
                        } else {
                            channel.mo9266trySendJP2dKIU(rawConstraintSet);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue7, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPlanScreenKt$SuccessContent$$inlined$ConstraintLayout$1(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.node.Ref ref, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlinx.coroutines.channels.Channel channel, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel, kotlin.jvm.functions.Function1 function1) {
        super(2);
        this.$getHighSpeedVideoFpsRanges = mutableState;
        this.$getHighSpeedVideoFpsRangesFor = ref;
        this.$getOutputFormats = constraintLayoutScope;
        this.$getHighResolutionOutputSizeshNQ4ISI = channel;
        this.$getInputFormats = mutableState2;
        this.$getHighSpeedVideoSizes = mutableState3;
        this.$getInputSizeshNQ4ISI = reviewPlanUiModel;
        this.$Camera2StreamConfigurationMap = function1;
    }
}

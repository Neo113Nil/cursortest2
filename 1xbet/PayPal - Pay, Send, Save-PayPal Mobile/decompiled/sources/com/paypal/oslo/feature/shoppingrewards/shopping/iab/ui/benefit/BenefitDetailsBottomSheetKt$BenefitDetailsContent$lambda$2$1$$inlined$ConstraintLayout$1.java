package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BenefitDetailsBottomSheetKt$BenefitDetailsContent$lambda$2$1$$inlined$ConstraintLayout$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.MutableState $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.Channel $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.node.Ref $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintLayoutScope $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData $getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState $getOutputMinFrameDuration;

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
            this.$getHighSpeedVideoSizes.setValue(kotlin.Unit.INSTANCE);
            if (this.$getHighSpeedVideoFpsRanges.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
                this.$getHighSpeedVideoFpsRanges.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
            }
            this.$getHighSpeedVideoFpsRangesFor.reset();
            androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = this.$getHighSpeedVideoFpsRangesFor;
            composer.startReplaceGroup(177768851);
            androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsBottomSheetKt$BenefitDetailsContent$3$2$1$1$1.getHighSpeedVideoSizes;
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(this.$getInputSizeshNQ4ISI.getMerchantLogo(), null, androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(constraintLayoutScope.constrainAs(companion, component1, (kotlin.jvm.functions.Function1) rememberedValue), androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), composer, 196656, 24);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(component1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsBottomSheetKt$BenefitDetailsContent$3$2$1$2$1(component1);
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(this.$getInputSizeshNQ4ISI.getIconUrl(), null, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(constraintLayoutScope.constrainAs(companion2, component2, (kotlin.jvm.functions.Function1) rememberedValue2), androidx.compose.ui.unit.Dp.m8601constructorimpl(160.0f)), null, false, 3, null), null, null, null, composer, 48, 56);
            composer.endReplaceGroup();
            boolean changedInstance = composer.changedInstance(this.$getHighSpeedVideoFpsRangesFor);
            boolean changedInstance2 = composer.changedInstance(this.$getHighResolutionOutputSizeshNQ4ISI);
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2 = this.$getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.MutableState mutableState = this.$getOutputMinFrameDuration;
            final androidx.compose.runtime.MutableState mutableState2 = this.$Camera2StreamConfigurationMap;
            final kotlinx.coroutines.channels.Channel channel = this.$getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsBottomSheetKt$BenefitDetailsContent$lambda$2$1$$inlined$ConstraintLayout$1.1
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
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsBottomSheetKt$BenefitDetailsContent$lambda$2$1$$inlined$ConstraintLayout$1(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.node.Ref ref, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlinx.coroutines.channels.Channel channel, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData benefitDetailsUiData) {
        super(2);
        this.$getHighSpeedVideoSizes = mutableState;
        this.$getHighSpeedVideoFpsRanges = ref;
        this.$getHighSpeedVideoFpsRangesFor = constraintLayoutScope;
        this.$getHighResolutionOutputSizeshNQ4ISI = channel;
        this.$getOutputMinFrameDuration = mutableState2;
        this.$Camera2StreamConfigurationMap = mutableState3;
        this.$getInputSizeshNQ4ISI = benefitDetailsUiData;
    }
}

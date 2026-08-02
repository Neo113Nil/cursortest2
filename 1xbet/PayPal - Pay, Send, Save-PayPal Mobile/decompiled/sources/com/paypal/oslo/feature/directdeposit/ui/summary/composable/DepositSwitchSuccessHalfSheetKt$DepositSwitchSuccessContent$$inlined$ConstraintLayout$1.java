package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$$inlined$ConstraintLayout$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.MutableState $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0 $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.Channel $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.node.Ref $getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoSizesFor;
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
            if (this.$getHighSpeedVideoSizes.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
                this.$getHighSpeedVideoSizes.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
            }
            this.$getOutputFormats.reset();
            androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = this.$getOutputFormats;
            composer.startReplaceGroup(605697002);
            androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component3 = createRefs.component3();
            androidx.constraintlayout.compose.ConstrainedLayoutReference createRef = constraintLayoutScope.createRef();
            com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(component1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$1$1$1(component1);
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(xMark, this.$getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion, createRef, (kotlin.jvm.functions.Function1) rememberedValue), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), "DepositSwitchSuccessCloseButton"), tertiary, medium, null, null, false, false, composer, 224262, 448);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_deposit_switch_success_title, composer, 0);
            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed2 = composer.changed(createRef);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$1$2$1(createRef);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier constrainAs = constraintLayoutScope.constrainAs(companion2, component1, (kotlin.jvm.functions.Function1) rememberedValue2);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$1$3$1.getHighResolutionOutputSizeshNQ4ISI;
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(constrainAs, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), "DepositSwitchSuccessTitle"), contentBase, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk), null, false, 0, 0, null, headingMedium, composer, 384, 6, 1000);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_deposit_switch_success_caption, composer, 0);
            com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase2 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            int m8448getStarte0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed3 = composer.changed(component1);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$1$4$1(component1);
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource2, androidx.compose.ui.platform.TestTagKt.testTag(constraintLayoutScope.constrainAs(companion3, component2, (kotlin.jvm.functions.Function1) rememberedValue4), "DepositSwitchSuccessDescription"), contentBase2, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk2), null, false, 0, 0, null, bodyMedium, composer, 384, 6, 1000);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_deposit_switch_success_cta_button, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed4 = composer.changed(component2);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$1$5$1(component2);
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.pds.components.ButtonKt.Button(this.$getHighResolutionOutputSizeshNQ4ISI, stringResource3, androidx.compose.ui.platform.TestTagKt.testTag(constraintLayoutScope.constrainAs(companion4, component3, (kotlin.jvm.functions.Function1) rememberedValue5), "DepositSwitchSuccessDoneButton"), null, null, primary, large, false, false, composer, 1769472, 408);
            composer.endReplaceGroup();
            boolean changedInstance = composer.changedInstance(this.$getOutputFormats);
            boolean changedInstance2 = composer.changedInstance(this.$getHighSpeedVideoFpsRangesFor);
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2 = this.$getOutputFormats;
            final androidx.compose.runtime.MutableState mutableState = this.$getHighSpeedVideoSizesFor;
            final androidx.compose.runtime.MutableState mutableState2 = this.$Camera2StreamConfigurationMap;
            final kotlinx.coroutines.channels.Channel channel = this.$getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$$inlined$ConstraintLayout$1.1
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
                composer.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue6, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositSwitchSuccessHalfSheetKt$DepositSwitchSuccessContent$$inlined$ConstraintLayout$1(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.node.Ref ref, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlinx.coroutines.channels.Channel channel, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, kotlin.jvm.functions.Function0 function0) {
        super(2);
        this.$getHighSpeedVideoFpsRanges = mutableState;
        this.$getHighSpeedVideoSizes = ref;
        this.$getOutputFormats = constraintLayoutScope;
        this.$getHighSpeedVideoFpsRangesFor = channel;
        this.$getHighSpeedVideoSizesFor = mutableState2;
        this.$Camera2StreamConfigurationMap = mutableState3;
        this.$getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}

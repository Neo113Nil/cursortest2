package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormFieldsComponentsKt$ReadOnlyFieldBase$lambda$5$$inlined$ConstraintLayout$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.MutableState $Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldConfig.ReadOnly $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.node.Ref $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2 $getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintLayoutScope $getInputFormats;
    final /* synthetic */ java.lang.String $getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState $getOutputFormats;
    final /* synthetic */ boolean $getOutputMinFrameDuration;
    final /* synthetic */ java.lang.String $getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
        androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference;
        androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference2;
        androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference3;
        androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope;
        androidx.compose.runtime.Composer composer2;
        androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2;
        com.paypal.pds.core.Typography.BodyLarge bodyLarge;
        androidx.compose.runtime.Composer composer3 = composer;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$Camera2StreamConfigurationMap.setValue(kotlin.Unit.INSTANCE);
            if (this.$getHighSpeedVideoFpsRangesFor.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
                this.$getHighSpeedVideoFpsRangesFor.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
            }
            this.$getInputFormats.reset();
            androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope3 = this.$getInputFormats;
            composer3.startReplaceGroup(305177904);
            androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope3.createRefs();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component3 = createRefs.component3();
            if (this.$getInputSizeshNQ4ISI != null) {
                composer3.startReplaceGroup(305227038);
                if (this.$getOutputMinFrameDuration) {
                    bodyLarge = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                } else {
                    bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
                }
                com.paypal.pds.core.Typography typography = bodyLarge;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                boolean changed = composer3.changed(component3);
                boolean changed2 = composer3.changed(this.$getHighSpeedVideoSizesFor);
                boolean changed3 = composer3.changed(this.$getOutputMinFrameDuration);
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$1$1 rememberedValue = composer.rememberedValue();
                if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$1$1(component3, this.$getHighSpeedVideoSizesFor, this.$getOutputMinFrameDuration);
                    composer3.updateRememberedValue(rememberedValue);
                }
                constrainedLayoutReference = component3;
                constrainedLayoutReference2 = component2;
                constrainedLayoutReference3 = component1;
                constraintLayoutScope = constraintLayoutScope3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(this.$getInputSizeshNQ4ISI, constraintLayoutScope3.constrainAs(companion, component1, (kotlin.jvm.functions.Function1) rememberedValue), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, typography, composer, 384, 0, 1016);
                composer.endReplaceGroup();
                composer3 = composer3;
            } else {
                constrainedLayoutReference = component3;
                constrainedLayoutReference2 = component2;
                constrainedLayoutReference3 = component1;
                constraintLayoutScope = constraintLayoutScope3;
                composer3.startReplaceGroup(306128456);
                composer.endReplaceGroup();
            }
            if (this.$getOutputMinFrameDuration && !kotlin.text.StringsKt.isBlank(this.$getOutputMinFrameDurationlomOqCM)) {
                composer3.startReplaceGroup(306295887);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReference3;
                boolean changed4 = composer3.changed(constrainedLayoutReference4);
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$2$1 rememberedValue2 = composer.rememberedValue();
                if (changed4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$2$1(constrainedLayoutReference4);
                    composer3.updateRememberedValue(rememberedValue2);
                }
                androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                androidx.compose.ui.Modifier constrainAs = constraintLayoutScope4.constrainAs(companion2, constrainedLayoutReference2, (kotlin.jvm.functions.Function1) rememberedValue2);
                com.paypal.pds.core.Typography.BodyLarge bodyLarge2 = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
                constraintLayoutScope2 = constraintLayoutScope4;
                composer2 = composer3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(this.$getOutputMinFrameDurationlomOqCM, constrainAs, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, this.$getHighResolutionOutputSizeshNQ4ISI.isMultiline() ? Integer.MAX_VALUE : 1, 0, null, bodyLarge2, composer, 384, 6, 888);
                composer.endReplaceGroup();
            } else {
                composer2 = composer3;
                constraintLayoutScope2 = constraintLayoutScope;
                composer2.startReplaceGroup(306887336);
                composer.endReplaceGroup();
            }
            androidx.compose.runtime.Composer composer4 = composer2;
            if (this.$getHighSpeedVideoSizesFor != null) {
                composer4.startReplaceGroup(306995154);
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$3$1 rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$3$1.getHighSpeedVideoSizes;
                    composer4.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier constrainAs2 = constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReference, (kotlin.jvm.functions.Function1) rememberedValue3);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, constrainAs2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer4.createNode(constructor);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                this.$getHighSpeedVideoSizesFor.invoke(composer4, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(307323816);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            boolean changedInstance = composer4.changedInstance(this.$getInputFormats);
            boolean changedInstance2 = composer4.changedInstance(this.$getHighSpeedVideoFpsRanges);
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope5 = this.$getInputFormats;
            final androidx.compose.runtime.MutableState mutableState = this.$getOutputFormats;
            final androidx.compose.runtime.MutableState mutableState2 = this.$getHighSpeedVideoSizes;
            final kotlinx.coroutines.channels.Channel channel = this.$getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsComponentsKt$ReadOnlyFieldBase$lambda$5$$inlined$ConstraintLayout$1.1
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
                composer4.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue4, composer4, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormFieldsComponentsKt$ReadOnlyFieldBase$lambda$5$$inlined$ConstraintLayout$1(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.node.Ref ref, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlinx.coroutines.channels.Channel channel, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, java.lang.String str, boolean z, kotlin.jvm.functions.Function2 function2, java.lang.String str2, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldConfig.ReadOnly readOnly) {
        super(2);
        this.$Camera2StreamConfigurationMap = mutableState;
        this.$getHighSpeedVideoFpsRangesFor = ref;
        this.$getInputFormats = constraintLayoutScope;
        this.$getHighSpeedVideoFpsRanges = channel;
        this.$getOutputFormats = mutableState2;
        this.$getHighSpeedVideoSizes = mutableState3;
        this.$getInputSizeshNQ4ISI = str;
        this.$getOutputMinFrameDuration = z;
        this.$getHighSpeedVideoSizesFor = function2;
        this.$getOutputMinFrameDurationlomOqCM = str2;
        this.$getHighResolutionOutputSizeshNQ4ISI = readOnly;
    }
}

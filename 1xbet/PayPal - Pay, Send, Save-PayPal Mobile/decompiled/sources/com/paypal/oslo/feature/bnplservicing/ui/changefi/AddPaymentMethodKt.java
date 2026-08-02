package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/AddFundingInstrumentUiModel;", "model", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "", "onClick", "AddFundingInstrument", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/AddFundingInstrumentUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddFundingInstrumentPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddPaymentMethodKt {
    public static final void AddFundingInstrument(final com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentUiModel addFundingInstrumentUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1141692286);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(addFundingInstrumentUiModel) : startRestartGroup.changedInstance(addFundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1141692286, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrument (AddPaymentMethod.kt:57)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !startRestartGroup.changedInstance(addFundingInstrumentUiModel))) {
                z = false;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt.m12525$r8$lambda$1Rv5Iwk4kWr4lrFmqpXhmnhrqo(kotlin.jvm.functions.Function1.this, addFundingInstrumentUiModel);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 31), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), com.paypal.pds.core.ConstantsKt.getSpacing32()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize4()), startRestartGroup, 48, 0), com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs2);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.bnplservicing.R.drawable.feature_bnpl_servicing_add, startRestartGroup, 0), "", androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 3120, 112);
            startRestartGroup.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(addFundingInstrumentUiModel.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt.m12527$r8$lambda$r8xo10zancsKbvYF_iu5Q4jMc(com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentUiModel.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AddFundingInstrumentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2083815125);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2083815125, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentPreview (AddPaymentMethod.kt:90)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentUiModel addFundingInstrumentUiModel = new com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentUiModel(new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider().getFundingInstrumentContent().getLinkABankAccount(), com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.BANK);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt.$r8$lambda$GXDtzlfWJZv1dAEyHG1TAeojT4k((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AddFundingInstrument(addFundingInstrumentUiModel, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.AddPaymentMethodKt.m12526$r8$lambda$ATe3eu1tZ1hM6Tz6IxGQltgt0(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-1Rv5Iwk4kWr4lrFmqpXhmnhrqo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12525$r8$lambda$1Rv5Iwk4kWr4lrFmqpXhmnhrqo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentUiModel addFundingInstrumentUiModel) {
        function1.invoke(addFundingInstrumentUiModel.getType());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ATe3eu-1tZ1hM6Tz6IxGQ-ltgt0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12526$r8$lambda$ATe3eu1tZ1hM6Tz6IxGQltgt0(int i, androidx.compose.runtime.Composer composer, int i2) {
        AddFundingInstrumentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GXDtzlfWJZv1dAEyHG1TAeojT4k(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r8xo10zancsKbvYF-_iu5Q4j-Mc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12527$r8$lambda$r8xo10zancsKbvYF_iu5Q4jMc(com.paypal.oslo.feature.bnplservicing.ui.changefi.AddFundingInstrumentUiModel addFundingInstrumentUiModel, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        AddFundingInstrument(addFundingInstrumentUiModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

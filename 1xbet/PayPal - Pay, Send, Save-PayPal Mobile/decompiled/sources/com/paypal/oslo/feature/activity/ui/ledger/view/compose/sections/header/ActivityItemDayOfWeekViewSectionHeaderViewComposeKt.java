package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;", "activityItemViewModel", "", "ActivityItemDayOfWeekView", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityItemDayOfWeekViewSectionHeaderViewComposeKt {
    public static final void ActivityItemDayOfWeekView(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel activityDayOfWeekHeaderModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDayOfWeekHeaderModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(121252322);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityDayOfWeekHeaderModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(121252322, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekView (ActivityItemDayOfWeekViewSectionHeaderViewCompose.kt:37)");
            }
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 4, null));
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(activityDayOfWeekHeaderModel.getHeaderText(), androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleLarge.INSTANCE, startRestartGroup, 48, 6, 1004);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekViewSectionHeaderViewComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekViewSectionHeaderViewComposeKt.$r8$lambda$rKdxiV22tXFO2n54x6XyCSzkLB8(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rKdxiV22tXFO2n54x6XyCSzkLB8(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel activityDayOfWeekHeaderModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityItemDayOfWeekView(activityDayOfWeekHeaderModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v3RlJJjVAua968o76uRNHX1g4VM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-108457578);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-108457578, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekViewPreview (ActivityItemDayOfWeekViewSectionHeaderViewCompose.kt:61)");
            }
            ActivityItemDayOfWeekView(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel("Monday"), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekViewSectionHeaderViewComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekViewSectionHeaderViewComposeKt.$r8$lambda$v3RlJJjVAua968o76uRNHX1g4VM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}

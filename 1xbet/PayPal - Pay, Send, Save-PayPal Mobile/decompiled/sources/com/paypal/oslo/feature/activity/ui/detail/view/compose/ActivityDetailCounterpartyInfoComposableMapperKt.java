package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;", "counterpartyInfoModel", "", "ActivityDetailCounterpartyInfoCompose", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;Landroidx/compose/runtime/Composer;I)V", "", "headerResId", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "CounterpartyInfoSectionCompose", "(ILjava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailCounterpartyInfoComposableMapperKt {
    public static final void ActivityDetailCounterpartyInfoCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String description;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailCounterpartyInfoSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(367284112);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetailCounterpartyInfoSectionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(367284112, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoCompose (ActivityDetailCounterpartyInfoComposableMapper.kt:52)");
            }
            if (activityDetailCounterpartyInfoSectionModel.getHeaderResId() != null && (description = activityDetailCounterpartyInfoSectionModel.getDescription()) != null && description.length() != 0) {
                startRestartGroup.startReplaceGroup(-1815460555);
                com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(true, false, false, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-860945119, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapperKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapperKt.m11825$r8$lambda$LdK4kvR0yUEMsLzPInCffYVbM0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 12582918, 126);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1815186670);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapperKt.$r8$lambda$nSMfuU_qKg86I4S87ogjlF5rArw(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CounterpartyInfoSectionCompose(final int i, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1935959237);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1935959237, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.CounterpartyInfoSectionCompose (ActivityDetailCounterpartyInfoComposableMapper.kt:70)");
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(i), new java.lang.Object[0], startRestartGroup, i3 & 14), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing2(), 7, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), null, null, null, null, false, 0, 0, null, null, startRestartGroup, (i3 >> 3) & 14, 0, 2044);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapperKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapperKt.$r8$lambda$VzLNrK5tRYzm_avYcUMVqjejVMo(i, str, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$LdK4kvR0y-UEMsLzPInCffYVbM0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11825$r8$lambda$LdK4kvR0yUEMsLzPInCffYVbM0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-860945119, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoCompose.<anonymous> (ActivityDetailCounterpartyInfoComposableMapper.kt:57)");
            }
            CounterpartyInfoSectionCompose(activityDetailCounterpartyInfoSectionModel.getHeaderResId().intValue(), activityDetailCounterpartyInfoSectionModel.getDescription(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VzLNrK5tRYzm_avYcUMVqjejVMo(int i, java.lang.String str, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CounterpartyInfoSectionCompose(i, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nSMfuU_qKg86I4S87ogjlF5rArw(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityDetailCounterpartyInfoCompose(activityDetailCounterpartyInfoSectionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

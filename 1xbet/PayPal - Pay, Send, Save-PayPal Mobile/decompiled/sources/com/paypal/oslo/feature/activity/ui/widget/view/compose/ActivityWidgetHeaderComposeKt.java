package com.paypal.oslo.feature.activity.ui.widget.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"RenderActivityWidgetHeaderUi", "", "widgetContentConfig", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;", "showSeeAllButton", "", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;ZLandroidx/compose/runtime/Composer;II)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetHeaderComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderActivityWidgetHeaderUi(final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig activityWidgetContentConfig, final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetContentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(436800498);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(activityWidgetContentConfig) : startRestartGroup.changedInstance(activityWidgetContentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(activityWidgetViewModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
            } else {
                z3 = i4 != 0 ? true : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(436800498, i3, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderActivityWidgetHeaderUi (ActivityWidgetHeaderCompose.kt:36)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                java.lang.String headerText = activityWidgetContentConfig.getHeaderText();
                if (headerText == null) {
                    startRestartGroup.startReplaceGroup(46664369);
                    headerText = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_title_text, startRestartGroup, 0);
                } else {
                    startRestartGroup.startReplaceGroup(46663315);
                }
                startRestartGroup.endReplaceGroup();
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(headerText, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                if (z3) {
                    startRestartGroup.startReplaceGroup(1446838884);
                    java.lang.String headerCTAText = activityWidgetContentConfig.getHeaderCTAText();
                    if (headerCTAText == null) {
                        startRestartGroup.startReplaceGroup(46674039);
                        headerCTAText = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_see_all_cta_text, startRestartGroup, 0);
                    } else {
                        startRestartGroup.startReplaceGroup(46672892);
                    }
                    java.lang.String str = headerCTAText;
                    startRestartGroup.endReplaceGroup();
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "see_all_button");
                    boolean changedInstance = startRestartGroup.changedInstance(activityWidgetViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetHeaderComposeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetHeaderComposeKt.m11965$r8$lambda$QL7VfhfkqmQ6Mr2KUvChGR4P14(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, str, testTag, null, null, secondary, small, false, false, startRestartGroup, 1769856, 408);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1447246348);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z4 = z3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetHeaderComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetHeaderComposeKt.m11966$r8$lambda$kFwSowEuC4M6rnFgaBqu9p7HCs(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig.this, activityWidgetViewModel, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$QL7VfhfkqmQ6Mr2KUvCh-GR4P14, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11965$r8$lambda$QL7VfhfkqmQ6Mr2KUvChGR4P14(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel) {
        activityWidgetViewModel.handleSeeMoreClick$activity_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kFwSowEuC4M6rnFgaBqu9p7HC-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11966$r8$lambda$kFwSowEuC4M6rnFgaBqu9p7HCs(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig activityWidgetContentConfig, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityWidgetHeaderUi(activityWidgetContentConfig, activityWidgetViewModel, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

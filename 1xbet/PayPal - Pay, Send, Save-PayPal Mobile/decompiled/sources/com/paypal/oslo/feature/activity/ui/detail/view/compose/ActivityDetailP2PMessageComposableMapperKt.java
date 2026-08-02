package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;", "activityDetailP2PMessageViewModel", "", "ActivityTransactionDetailP2PMessageCompose", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;Landroidx/compose/runtime/Composer;I)V", "P2PMessageImageComposable"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailP2PMessageComposableMapperKt {
    public static final void ActivityTransactionDetailP2PMessageCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailP2PMessageModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1129513062);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetailP2PMessageModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1129513062, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailP2PMessageCompose (ActivityDetailP2PMessageComposableMapper.kt:64)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
            P2PMessageImageComposable(activityDetailP2PMessageModel, startRestartGroup, i2 & 14);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(activityDetailP2PMessageModel.getMessage(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailP2PMessageComposableMapperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailP2PMessageComposableMapperKt.$r8$lambda$ETBgtxVnkbeQYDcjKL9GaZkbkI4(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void P2PMessageImageComposable(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailP2PMessageModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-320172512);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetailP2PMessageModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-320172512, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.P2PMessageImageComposable (ActivityDetailP2PMessageComposableMapper.kt:78)");
            }
            java.lang.String imageUrl = activityDetailP2PMessageModel.getImageUrl();
            if (imageUrl != null && imageUrl.length() != 0) {
                startRestartGroup.startReplaceGroup(863240218);
                com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(activityDetailP2PMessageModel.getImageUrl()).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), "P2P message image", androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(91.0f)), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 11, null), null, com.paypal.pds.components.ImageCornerRadius.Radius8, null, null, startRestartGroup, 24624, 104);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(863709186);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailP2PMessageComposableMapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailP2PMessageComposableMapperKt.m11843$r8$lambda$3SgaEXYPINAVamnTGTZol7Z6U(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3SgaEX-YPINAVam-nTGTZol7Z6U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11843$r8$lambda$3SgaEXYPINAVamnTGTZol7Z6U(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        P2PMessageImageComposable(activityDetailP2PMessageModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ETBgtxVnkbeQYDcjKL9GaZkbkI4(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityTransactionDetailP2PMessageCompose(activityDetailP2PMessageModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

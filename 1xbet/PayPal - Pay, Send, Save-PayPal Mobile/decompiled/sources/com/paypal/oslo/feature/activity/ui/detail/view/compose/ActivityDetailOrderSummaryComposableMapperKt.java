package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000328\b\u0002\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aO\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000328\b\u0002\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\u0012"}, d2 = {"ActivityTransactionDetailOrderSummaryCompose", "", "activityDetailOrderSummaryViewModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;", "onTrackOrderClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "trackingNumber", "carrierId", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SKUItemImage", "skuItem", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailSKUItemSection;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailSKUItemSection;Landroidx/compose/runtime/Composer;I)V", "ActivityDetailPackageTrackingCompose", "orderSummaryViewModel", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailOrderSummaryComposableMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityTransactionDetailOrderSummaryCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailOrderSummarySectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(598300162);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailOrderSummarySectionModel) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            function22 = function2;
            i4 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
            i3 = i4;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.$r8$lambda$DjZD5FNGLKq6EoL93B7FGWOFYIQ((java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function23 = (kotlin.jvm.functions.Function2) rememberedValue;
                } else {
                    function23 = function22;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(598300162, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailOrderSummaryCompose (ActivityDetailOrderSummaryComposableMapper.kt:104)");
                }
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> orderItems = activityDetailOrderSummarySectionModel.getOrderItems();
                if (orderItems == null) {
                    startRestartGroup.startReplaceGroup(-438837696);
                } else {
                    startRestartGroup.startReplaceGroup(-438837695);
                    int i6 = 0;
                    for (java.lang.Object obj : orderItems) {
                        if (i6 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection activityDetailSKUItemSection = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection) obj;
                        androidx.compose.runtime.Composer composer3 = startRestartGroup;
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(activityDetailSKUItemSection.getOrderItemName(), null, activityDetailSKUItemSection.getOrderItemSpecs(), activityDetailSKUItemSection.getOrderItemCount(), null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-249456180, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.$r8$lambda$DXpP3BwpSJOh9ZWqqlRgJPVZv2Q(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(i6 == 0 ? com.paypal.pds.core.ConstantsKt.getSpacing8() : com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, null, false, composer3, 100663296, 0, 507634);
                        i6++;
                        startRestartGroup = composer3;
                        function23 = function23;
                        z = z;
                        i3 = i3;
                    }
                }
                kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24 = function23;
                int i7 = i3;
                androidx.compose.runtime.Composer composer4 = startRestartGroup;
                composer4.endReplaceGroup();
                composer2 = composer4;
                function22 = function24;
                ActivityDetailPackageTrackingCompose(activityDetailOrderSummarySectionModel, function22, composer2, i7 & 126, 0);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.$r8$lambda$qxV8O7iQG3f7uHxz_6ZGg321Bd0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel.this, function22, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function22 = function2;
        i3 = i4;
        boolean z2 = true;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SKUItemImage(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection activityDetailSKUItemSection, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSKUItemSection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(178540316);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityDetailSKUItemSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(178540316, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.SKUItemImage (ActivityDetailOrderSummaryComposableMapper.kt:126)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(activityDetailSKUItemSection.getOrderImageUrl()).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
            if (androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, startRestartGroup, 0, 1).getValue() instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) {
                startRestartGroup.startReplaceGroup(1725394259);
                com.paypal.pds.components.ImageKt.Image(rememberAsyncImagePainter, com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderRoleBaseNeutral.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 384, 0), null, com.paypal.pds.components.ImageCornerRadius.Radius8, null, null, startRestartGroup, 24624, 104);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1725817099);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Package.INSTANCE, "Placeholder image", com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderRoleBaseNeutral.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 384, 0), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.$r8$lambda$W3Sl1mpzwAq9yTHAl2m3o73Vh0s(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004c  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityDetailPackageTrackingCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailOrderSummarySectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2076600103);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailOrderSummarySectionModel) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        int i6 = 32;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            function22 = function2;
            i4 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
            i3 = i4;
            boolean z = true;
            boolean z2 = 0;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.$r8$lambda$3xd48H84isZkZsExAcyaNOe4WRA((java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function23 = (kotlin.jvm.functions.Function2) rememberedValue;
                } else {
                    function23 = function22;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2076600103, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailPackageTrackingCompose (ActivityDetailOrderSummaryComposableMapper.kt:167)");
                }
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> packageTrackingItems = activityDetailOrderSummarySectionModel.getPackageTrackingItems();
                if (packageTrackingItems != null) {
                    startRestartGroup.startReplaceGroup(1233289797);
                    for (final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem activityDetailPackageTrackingItem : packageTrackingItems) {
                        boolean z3 = (i3 & 112) == i6 ? z : z2;
                        boolean changed = startRestartGroup.changed(activityDetailPackageTrackingItem);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((z3 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.m11840$r8$lambda$HiS6g8CVj1SbRxmvlEBPqsOkSo(kotlin.jvm.functions.Function2.this, activityDetailPackageTrackingItem);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        androidx.compose.runtime.Composer composer3 = startRestartGroup;
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_tracking_number_label, startRestartGroup, z2), null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(361632353, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.m11842$r8$lambda$Z2RQy_DNQqVa4ln0N3n9IOUgl8(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(242221745, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.$r8$lambda$HDWYjCul5O7mx2fht5pW14LfoJA(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), null, false, null, null, null, null, null, false, composer3, 12582912, 6, 523134);
                        function23 = function23;
                        z2 = z2;
                        z = z;
                        i3 = i3;
                        i6 = i6;
                        startRestartGroup = composer3;
                    }
                    function24 = function23;
                    composer2 = startRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1233289796);
                    startRestartGroup.endReplaceGroup();
                    function24 = function23;
                    composer2 = startRestartGroup;
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function22 = function24;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.m11841$r8$lambda$Qy1f2Vm0TEoqaFXlMj7tI19c(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel.this, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function22 = function2;
        i3 = i4;
        boolean z4 = true;
        boolean z22 = 0;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3xd48H84isZkZsExAcyaNOe4WRA(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DXpP3BwpSJOh9ZWqqlRgJPVZv2Q(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection activityDetailSKUItemSection, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-249456180, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailOrderSummaryCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivityDetailOrderSummaryComposableMapper.kt:114)");
            }
            SKUItemImage(activityDetailSKUItemSection, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DjZD5FNGLKq6EoL93B7FGWOFYIQ(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HDWYjCul5O7mx2fht5pW14LfoJA(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem activityDetailPackageTrackingItem, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(242221745, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailPackageTrackingCompose.<anonymous>.<anonymous>.<anonymous> (ActivityDetailOrderSummaryComposableMapper.kt:179)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(activityDetailPackageTrackingItem.getTrackingNumber(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), null, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, null, composer, 12782592, 0, 1876);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HiS6g8CVj1SbRxmvlEBP-qsOkSo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11840$r8$lambda$HiS6g8CVj1SbRxmvlEBPqsOkSo(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem activityDetailPackageTrackingItem) {
        function2.invoke(activityDetailPackageTrackingItem.getTrackingNumber(), activityDetailPackageTrackingItem.getCarrierId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Qy-1-f2Vm0TEoqaFXlMj7tI1-9c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11841$r8$lambda$Qy1f2Vm0TEoqaFXlMj7tI19c(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityDetailPackageTrackingCompose(activityDetailOrderSummarySectionModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W3Sl1mpzwAq9yTHAl2m3o73Vh0s(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection activityDetailSKUItemSection, int i, androidx.compose.runtime.Composer composer, int i2) {
        SKUItemImage(activityDetailSKUItemSection, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z2RQy_D-NQqVa4ln0N3n9IOUgl8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11842$r8$lambda$Z2RQy_DNQqVa4ln0N3n9IOUgl8(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(361632353, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailPackageTrackingCompose.<anonymous>.<anonymous>.<anonymous> (ActivityDetailOrderSummaryComposableMapper.kt:188)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_track_label, composer, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer, 1769472, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qxV8O7iQG3f7uHxz_6ZGg321Bd0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityTransactionDetailOrderSummaryCompose(activityDetailOrderSummarySectionModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¨\u0006\u001b"}, d2 = {"ActivityTransactionDetailRewardCompose", "", "rewardModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;", "onTrailingHeaderClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TransactionDetailRewardSectionCompose", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;Landroidx/compose/runtime/Composer;I)V", "RewardChallengeTrackerCompose", "showTitleForCard", "", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ActivityDetailsTransactionStretchCompose", "rewardTrackerModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/RewardChallengeTrackerModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/RewardChallengeTrackerModel;Landroidx/compose/runtime/Composer;I)V", "rewardDetail", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardSection;", "showDividerBefore", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardSection;ZLandroidx/compose/runtime/Composer;II)V", "ActivityDetailRewardNote", "reward", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardSection;Landroidx/compose/runtime/Composer;I)V", "getListStyleForRewardRow", "Lcom/paypal/pds/components/ListStyle;", "isPending", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailRewardComposableMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityTransactionDetailRewardCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRewardModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(429075952);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activityDetailRewardModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = i4 != 0 ? null : function02;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(429075952, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailRewardCompose (ActivityDetailRewardComposableMapper.kt:86)");
                }
                if (activityDetailRewardModel.getCashbackRewards() != null || activityDetailRewardModel.getPointRewards() != null || activityDetailRewardModel.getCurrencyRewards() != null) {
                    startRestartGroup.startReplaceGroup(779318488);
                    com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(true, true, true, com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardModel.getLeadingTitleResId(), new java.lang.Object[0], startRestartGroup, 0), com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardModel.getTrailingTitleResId(), new java.lang.Object[0], startRestartGroup, 0), null, function03, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(485827969, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.$r8$lambda$53vi31YUF89jTaWHLi2Q7lo21Zg(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i3 << 15) & 3670016) | 12583350, 32);
                    startRestartGroup.endReplaceGroup();
                    z = false;
                } else {
                    startRestartGroup.startReplaceGroup(779804754);
                    startRestartGroup.endReplaceGroup();
                }
                composer2 = startRestartGroup;
                RewardChallengeTrackerCompose(activityDetailRewardModel, z, function03, startRestartGroup, (i3 & 14) | ((i3 << 3) & 896), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function02 = function03;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.m11847$r8$lambda$qXXghE95dzQ7Zgxtc1DyNB1o(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel.this, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        boolean z2 = true;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TransactionDetailRewardSectionCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRewardModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1167141296);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetailRewardModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z2 = true;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1167141296, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.TransactionDetailRewardSectionCompose (ActivityDetailRewardComposableMapper.kt:108)");
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
            if (activityDetailRewardModel.getPointRewards() != null) {
                startRestartGroup.startReplaceGroup(-1959399904);
                TransactionDetailRewardSectionCompose(activityDetailRewardModel.getPointRewards(), false, startRestartGroup, 0, 2);
                startRestartGroup.endReplaceGroup();
                z = true;
            } else {
                startRestartGroup.startReplaceGroup(-1959280740);
                startRestartGroup.endReplaceGroup();
                z = false;
            }
            if (activityDetailRewardModel.getCashbackRewards() != null) {
                startRestartGroup.startReplaceGroup(-1959226614);
                TransactionDetailRewardSectionCompose(activityDetailRewardModel.getCashbackRewards(), z, startRestartGroup, 0, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1959086308);
                startRestartGroup.endReplaceGroup();
                z2 = z;
            }
            if (activityDetailRewardModel.getCurrencyRewards() != null) {
                startRestartGroup.startReplaceGroup(-1959033329);
                TransactionDetailRewardSectionCompose(activityDetailRewardModel.getCurrencyRewards(), z2, startRestartGroup, 0, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1958928580);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.m11845$r8$lambda$SGOSyWOAzHLAda9FwnfsAr32fI(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RewardChallengeTrackerCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, final boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRewardModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(335938811);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailRewardModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            function02 = function0;
            i6 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            i3 = i6;
            boolean z3 = true;
            int i8 = 0;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
            } else {
                function03 = i7 != 0 ? null : function02;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(335938811, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.RewardChallengeTrackerCompose (ActivityDetailRewardComposableMapper.kt:130)");
                }
                int i9 = 0;
                for (java.lang.Object obj : activityDetailRewardModel.getRewardChallengeTrackers()) {
                    if (i9 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel = (com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel) obj;
                    if (i9 == 0 && z) {
                        startRestartGroup.startReplaceGroup(-827607465);
                        i4 = i8;
                        i5 = i3;
                        com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(true, true, true, com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardModel.getLeadingTitleResId(), new java.lang.Object[i8], startRestartGroup, i8), com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardModel.getTrailingTitleResId(), new java.lang.Object[i8], startRestartGroup, i8), null, function03, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2045482674, z3, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.$r8$lambda$rxCZL8qz9AtC7vjvrwI_p6aYV8g(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i3 << 12) & 3670016) | 12583350, 32);
                        startRestartGroup.endReplaceGroup();
                        z2 = true;
                    } else {
                        i4 = i8;
                        i5 = i3;
                        startRestartGroup.startReplaceGroup(-827089517);
                        z2 = true;
                        com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(true, false, false, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-340475995, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.m11844$r8$lambda$Qi8flGm2dvXphfXilTu9dwMpmk(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 12582918, 126);
                        startRestartGroup.endReplaceGroup();
                    }
                    i9++;
                    i3 = i5;
                    i8 = i4;
                    z3 = z2;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function03;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.m11846$r8$lambda$eOjvXXVQ3RX_89hBmyjX3DTa6c(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel.this, z, function04, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        i3 = i6;
        boolean z32 = true;
        int i82 = 0;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ActivityDetailsTransactionStretchCompose(final com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardChallengeTrackerModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(700131204);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(rewardChallengeTrackerModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(700131204, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailsTransactionStretchCompose (ActivityDetailRewardComposableMapper.kt:158)");
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
            int totalPurchases = rewardChallengeTrackerModel.getTotalPurchases();
            int completedPurchases = rewardChallengeTrackerModel.getCompletedPurchases();
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(rewardChallengeTrackerModel.getDescription(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing0(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 5, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            com.paypal.pds.components.BadgeKt.Badge(com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(rewardChallengeTrackerModel.getTimeRemainingResId()), new java.lang.Object[]{rewardChallengeTrackerModel.getTimeLeft()}, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), com.paypal.pds.components.BadgeStyle.Info.INSTANCE, null, null, com.paypal.pds.core.Icon.Calendar.INSTANCE, null, startRestartGroup, 196992, 88);
            com.paypal.pds.components.ProgressBarKt.ProgressBar(totalPurchases, completedPurchases, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing0(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, 0, 0, 0L, null, startRestartGroup, 3072, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            int i3 = com.paypal.oslo.feature.activity.R.string.feature_activity_reward_tracker_progress_text;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(completedPurchases), java.lang.Integer.valueOf(totalPurchases)};
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(i3), objArr, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.$r8$lambda$MJ8K8SNeTH10TdYhmPnFa0LINqQ(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransactionDetailRewardSectionCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z3;
        int i4;
        boolean z4;
        java.lang.String resolveString;
        java.lang.String str;
        java.lang.String rewardValue;
        java.lang.String totalRewardCompleted;
        boolean z5;
        java.lang.String resolveString2;
        java.lang.String str2;
        java.lang.String rewardValue2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRewardSection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-389902008);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailRewardSection) ? 4 : 2) | i : i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i5 |= startRestartGroup.changed(z2) ? 32 : 16;
            i3 = i5;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                boolean z6 = i6 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-389902008, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.TransactionDetailRewardSectionCompose (ActivityDetailRewardComposableMapper.kt:193)");
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
                if (z6) {
                    startRestartGroup.startReplaceGroup(-1472592413);
                    com.paypal.pds.components.DividerKt.Divider(null, startRestartGroup, 0, 1);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1472560700);
                    startRestartGroup.endReplaceGroup();
                }
                if (activityDetailRewardSection.getCompletedRewardsList().isEmpty()) {
                    z3 = true;
                    i4 = i3;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1470944732);
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1472451580);
                    z3 = true;
                    i4 = i3;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(activityDetailRewardSection.getCompletedRewardTitle(), startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
                    composer2.startReplaceGroup(91057167);
                    for (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem : activityDetailRewardSection.getCompletedRewardsList()) {
                        java.lang.String rewardDescription = activityDetailRewardItem.getRewardDescription();
                        if (activityDetailRewardItem.getRewardValueResId() != null || (rewardValue2 = activityDetailRewardItem.getRewardValue()) == null || rewardValue2.length() == 0) {
                            java.lang.String rewardValue3 = activityDetailRewardItem.getRewardValue();
                            if (rewardValue3 == null || rewardValue3.length() == 0) {
                                z5 = false;
                                composer2.startReplaceGroup(1759752318);
                                resolveString2 = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardItem.getRewardValueResId(), new java.lang.Object[0], composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1759841040);
                                z5 = false;
                                resolveString2 = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardItem.getRewardValueResId(), new java.lang.Object[]{activityDetailRewardItem.getRewardValue()}, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            str2 = resolveString2;
                        } else {
                            composer2.startReplaceGroup(1759648499);
                            composer2.endReplaceGroup();
                            str2 = activityDetailRewardItem.getRewardValue();
                            z5 = false;
                        }
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(rewardDescription, null, null, str2, null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), Camera2StreamConfigurationMap(z5), null, false, composer2, 0, com.paypal.pds.components.ListStyle.$stable << 18, 409590);
                    }
                    composer2.endReplaceGroup();
                    java.lang.String totalRewardCompleted2 = activityDetailRewardSection.getTotalRewardCompleted();
                    if (totalRewardCompleted2 == null || totalRewardCompleted2.length() == 0) {
                        composer2.startReplaceGroup(-1470954652);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1471478397);
                        java.lang.String resolveString3 = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_total_label), new java.lang.Object[0], composer2, 0);
                        if (activityDetailRewardSection.getTotalRewardCompletedResId() != null) {
                            composer2.startReplaceGroup(-1471291715);
                            totalRewardCompleted = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardSection.getTotalRewardCompletedResId(), new java.lang.Object[]{activityDetailRewardSection.getTotalRewardCompleted()}, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1471153517);
                            composer2.endReplaceGroup();
                            totalRewardCompleted = activityDetailRewardSection.getTotalRewardCompleted();
                        }
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(resolveString3, null, null, totalRewardCompleted, null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), null, null, false, composer2, 0, 0, 475126);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                }
                if (activityDetailRewardSection.getPendingRewardsList().isEmpty()) {
                    composer2.startReplaceGroup(-1469944796);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1470856785);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(activityDetailRewardSection.getPendingRewardTitle(), composer2, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 0, 6, 1020);
                    for (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem2 : activityDetailRewardSection.getPendingRewardsList()) {
                        java.lang.String rewardDescription2 = activityDetailRewardItem2.getRewardDescription();
                        if (activityDetailRewardItem2.getRewardValueResId() != null || (rewardValue = activityDetailRewardItem2.getRewardValue()) == null || rewardValue.length() == 0) {
                            java.lang.String rewardValue4 = activityDetailRewardItem2.getRewardValue();
                            if (rewardValue4 == null || rewardValue4.length() == 0) {
                                z4 = false;
                                composer2.startReplaceGroup(1588912861);
                                resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardItem2.getRewardValueResId(), new java.lang.Object[0], composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1589001583);
                                z4 = false;
                                resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(activityDetailRewardItem2.getRewardValueResId(), new java.lang.Object[]{activityDetailRewardItem2.getRewardValue()}, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            str = resolveString;
                        } else {
                            composer2.startReplaceGroup(1588809042);
                            composer2.endReplaceGroup();
                            str = activityDetailRewardItem2.getRewardValue();
                            z4 = false;
                        }
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(rewardDescription2, null, null, str, null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), Camera2StreamConfigurationMap(z3), null, false, composer2, 0, com.paypal.pds.components.ListStyle.$stable << 18, 409590);
                    }
                    composer2.endReplaceGroup();
                }
                ActivityDetailRewardNote(activityDetailRewardSection, composer2, i4 & 14);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z2 = z6;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.$r8$lambda$66VSUte21KYFBhI1FrqMWlFKzcM(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection.this, z2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        i3 = i5;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ActivityDetailRewardNote(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String resolveString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRewardSection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(86804414);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetailRewardSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(86804414, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardNote (ActivityDetailRewardComposableMapper.kt:259)");
            }
            java.lang.String note = activityDetailRewardSection.getNote();
            if (note != null && note.length() != 0) {
                startRestartGroup.startReplaceGroup(420102185);
                startRestartGroup.endReplaceGroup();
                resolveString = activityDetailRewardSection.getNote();
            } else {
                startRestartGroup.startReplaceGroup(420163844);
                java.lang.Integer noteResId = activityDetailRewardSection.getNoteResId();
                if (noteResId == null) {
                    startRestartGroup.startReplaceGroup(420163843);
                    startRestartGroup.endReplaceGroup();
                    resolveString = null;
                } else {
                    startRestartGroup.startReplaceGroup(1814668990);
                    resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(noteResId, new java.lang.Object[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.STRING_VALUE_NINETY}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str = resolveString;
            if (str != null && str.length() != 0) {
                startRestartGroup.startReplaceGroup(420270887);
                com.paypal.pds.components.DividerKt.Divider(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), startRestartGroup, 0, 0);
                com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailEtaTrackerComposableMapperKt.DescriptionAndLinkSection(null, new com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel(resolveString, null, 2, null), null, startRestartGroup, 0, 5);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(420514020);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.$r8$lambda$Id_aMyhTtODN0FvvK35isd7AFnY(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final com.paypal.pds.components.ListStyle Camera2StreamConfigurationMap(boolean z) {
        if (z) {
            com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
            com.paypal.pds.core.Color.ContentMuted contentMuted2 = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
            return new com.paypal.pds.components.ListStyle(contentMuted, com.paypal.pds.core.Color.ContentBase.INSTANCE, contentMuted2, com.paypal.pds.core.Color.ContentBase.INSTANCE);
        }
        com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
        com.paypal.pds.core.Color.ContentRoleBasePositive contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
        return new com.paypal.pds.components.ListStyle(contentBase, com.paypal.pds.core.Color.ContentBase.INSTANCE, contentRoleBasePositive, com.paypal.pds.core.Color.ContentBase.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$53vi31YUF89jTaWHLi2Q7lo21Zg(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(485827969, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailRewardCompose.<anonymous> (ActivityDetailRewardComposableMapper.kt:97)");
            }
            TransactionDetailRewardSectionCompose(activityDetailRewardModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$66VSUte21KYFBhI1FrqMWlFKzcM(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TransactionDetailRewardSectionCompose(activityDetailRewardSection, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Id_aMyhTtODN0FvvK35isd7AFnY(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityDetailRewardNote(activityDetailRewardSection, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MJ8K8SNeTH10TdYhmPnFa0LINqQ(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityDetailsTransactionStretchCompose(rewardChallengeTrackerModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Qi8flGm2dvXphfXilT-u9dwMpmk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11844$r8$lambda$Qi8flGm2dvXphfXilTu9dwMpmk(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-340475995, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.RewardChallengeTrackerCompose.<anonymous>.<anonymous> (ActivityDetailRewardComposableMapper.kt:148)");
            }
            ActivityDetailsTransactionStretchCompose(rewardChallengeTrackerModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SGOS-yWOAzHLAda9FwnfsAr32fI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11845$r8$lambda$SGOSyWOAzHLAda9FwnfsAr32fI(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        TransactionDetailRewardSectionCompose(activityDetailRewardModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eOjvXXVQ3RX_89hBmy-jX3DTa6c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11846$r8$lambda$eOjvXXVQ3RX_89hBmyjX3DTa6c(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, boolean z, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RewardChallengeTrackerCompose(activityDetailRewardModel, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qXXghE95dzQ--7Zgxtc1D-yNB1o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11847$r8$lambda$qXXghE95dzQ7Zgxtc1DyNB1o(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityTransactionDetailRewardCompose(activityDetailRewardModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rxCZL8qz9AtC7vjvrwI_p6aYV8g(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2045482674, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.RewardChallengeTrackerCompose.<anonymous>.<anonymous> (ActivityDetailRewardComposableMapper.kt:141)");
            }
            ActivityDetailsTransactionStretchCompose(rewardChallengeTrackerModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

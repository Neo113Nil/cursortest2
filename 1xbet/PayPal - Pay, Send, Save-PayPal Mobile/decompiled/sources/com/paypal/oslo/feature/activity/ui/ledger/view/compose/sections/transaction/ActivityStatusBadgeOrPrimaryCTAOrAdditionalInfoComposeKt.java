package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a5\u0010\t\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo", "", "activityItemUIModel", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "primaryCTAModel", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "onPrimaryCTAClick", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RenderPrimaryActionOrUserNotes", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RenderPrimaryAction", "ctaDisplayTextResId", "", "onClick", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RenderStatusBadgeOrPrimaryCTAOrAdditionalInfoPreview", "(Landroidx/compose/runtime/Composer;I)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function12;
        final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1811344336);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityTransactionModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            activityActionModel2 = activityActionModel;
            i3 |= startRestartGroup.changed(activityActionModel2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    activityActionModel3 = activityActionModel2;
                    function13 = function12;
                } else {
                    com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel4 = i5 != 0 ? null : activityActionModel2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.m11916$r8$lambda$F1fdhogpdpWX_6DkEuK4lthW8w((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1811344336, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo (ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoCompose.kt:47)");
                    }
                    com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel create$activity_prodRelease = com.paypal.oslo.feature.activity.ui.common.factory.ActivityStatusModelFactory.INSTANCE.create$activity_prodRelease(activityTransactionModel.getActivityStatus(), activityTransactionModel.getPaymentStatus(), activityTransactionModel.getShipmentPackages());
                    com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo = activityTransactionModel.getRewardInfo();
                    java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem> redeemedRewards = rewardInfo != null ? rewardInfo.getRedeemedRewards() : null;
                    if (redeemedRewards != null && !redeemedRewards.isEmpty()) {
                        startRestartGroup.startReplaceGroup(-209367369);
                        com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt.RenderActivityRedeemedRewardCompose(activityTransactionModel, startRestartGroup, i3 & 14);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        java.lang.String badgeDisplayMessage = create$activity_prodRelease.getBadgeDisplayMessage();
                        if (badgeDisplayMessage != null && !kotlin.text.StringsKt.isBlank(badgeDisplayMessage)) {
                            startRestartGroup.startReplaceGroup(-209203596);
                            com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.RenderStatusBadge(create$activity_prodRelease, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null)), 0.0f, 1, null), null, false, 3, null), null, startRestartGroup, 0, 4);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-208916319);
                            getHighSpeedVideoFpsRanges(activityActionModel4, activityTransactionModel, function14, startRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896), 0);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    activityActionModel3 = activityActionModel4;
                    function13 = function14;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$_8BTgeqYX_zjxSamzZilZXuW4H8(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, activityActionModel3, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        activityActionModel2 = activityActionModel;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2140709527);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityActionModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(activityTransactionModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$yFRWiFbSRC8WGUmXGvjM3IxHWi4((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2140709527, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderPrimaryActionOrUserNotes (ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoCompose.kt:90)");
            }
            int actionDisplayValue$activity_prodRelease = com.paypal.oslo.feature.activity.domain.common.models.ActionsMapper.INSTANCE.getActionDisplayValue$activity_prodRelease(activityActionModel != null ? activityActionModel.getType() : null);
            if (activityActionModel != null && actionDisplayValue$activity_prodRelease != -1) {
                startRestartGroup.startReplaceGroup(2092253552);
                boolean z = (i3 & 896) == 256;
                boolean z2 = (i3 & 14) == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$b_BQ9t4scd6YIbt4DGOOlECIlh0(kotlin.jvm.functions.Function1.this, activityActionModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                getHighSpeedVideoFpsRanges(actionDisplayValue$activity_prodRelease, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2092424703);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityTransactionNotesOrETANotesComposeKt.RenderAdditionalInfoOrUserNotes(activityTransactionModel, startRestartGroup, (i3 >> 3) & 14);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function12 = function1;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$N1jhWR9UKfXiyahzMNa7lu_jJ9w(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel.this, activityTransactionModel, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final int i, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1775409466);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1775409466, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderPrimaryAction (ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoCompose.kt:106)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i, startRestartGroup, i3 & 14);
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null)), 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            com.paypal.pds.components.ButtonKt.Button(function0, stringResource, null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, ((i3 >> 3) & 14) | 1769472, 412);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$9QuuRpGyn25bm7g9KFUMEF23bNs(i, function0, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$52M0M5FEieI48J_xcMzS-Brv42I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11915$r8$lambda$52M0M5FEieI48J_xcMzSBrv42I(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9QuuRpGyn25bm7g9KFUMEF23bNs(int i, kotlin.jvm.functions.Function0 function0, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(i, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$F1fdhogpdpWX_6DkEuK4-lthW8w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11916$r8$lambda$F1fdhogpdpWX_6DkEuK4lthW8w(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N1jhWR9UKfXiyahzMNa7lu_jJ9w(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(activityActionModel, activityTransactionModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PY7SiwtaEypErw_Qfr0Vb3zQzLc(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_8BTgeqYX_zjxSamzZilZXuW4H8(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(activityTransactionModel, activityActionModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b_BQ9t4scd6YIbt4DGOOlECIlh0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        function1.invoke(activityActionModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i_Xga5Zobsm09Ssbwd16KKBKzCo(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel purchaseTransaction$activity_prodRelease;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-304038997);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-304038997, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderStatusBadgeOrPrimaryCTAOrAdditionalInfoPreview (ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoCompose.kt:131)");
            }
            purchaseTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.purchaseTransaction$activity_prodRelease((r19 & 1) != 0 ? "crypto_tx_001" : null, (r19 & 2) != 0 ? "crypto_group_001" : null, (r19 & 4) != 0 ? "PayPal" : null, (r19 & 8) != 0 ? "Feb 9, 2026" : null, (r19 & 16) != 0 ? "Money Received" : null, (r19 & 32) != 0 ? "2500.00" : null, (r19 & 64) != 0 ? "USD" : null, (r19 & 128) != 0 ? false : true, (r19 & 256) != 0 ? null : null);
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
            copy = purchaseTransaction$activity_prodRelease.copy((r41 & 1) != 0 ? purchaseTransaction$activity_prodRelease.id : null, (r41 & 2) != 0 ? purchaseTransaction$activity_prodRelease.groupId : null, (r41 & 4) != 0 ? purchaseTransaction$activity_prodRelease.invoiceId : null, (r41 & 8) != 0 ? purchaseTransaction$activity_prodRelease.avatar : null, (r41 & 16) != 0 ? purchaseTransaction$activity_prodRelease.title : null, (r41 & 32) != 0 ? purchaseTransaction$activity_prodRelease.date : null, (r41 & 64) != 0 ? purchaseTransaction$activity_prodRelease.createdTime : null, (r41 & 128) != 0 ? purchaseTransaction$activity_prodRelease.amountInformation : null, (r41 & 256) != 0 ? purchaseTransaction$activity_prodRelease.transactionShortDescription : null, (r41 & 512) != 0 ? purchaseTransaction$activity_prodRelease.paymentStatus : null, (r41 & 1024) != 0 ? purchaseTransaction$activity_prodRelease.transactionETANote : null, (r41 & 2048) != 0 ? purchaseTransaction$activity_prodRelease.additionalInfo : null, (r41 & 4096) != 0 ? purchaseTransaction$activity_prodRelease.rewardInfo : new com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo((com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem(50, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.POINTS)), (java.lang.Integer) null, 11, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r41 & 8192) != 0 ? purchaseTransaction$activity_prodRelease.activityMoneyMovementDirection : null, (r41 & 16384) != 0 ? purchaseTransaction$activity_prodRelease.action : null, (r41 & 32768) != 0 ? purchaseTransaction$activity_prodRelease.type : null, (r41 & 65536) != 0 ? purchaseTransaction$activity_prodRelease.activityStatus : null, (r41 & 131072) != 0 ? purchaseTransaction$activity_prodRelease.shipmentPackages : null, (r41 & 262144) != 0 ? purchaseTransaction$activity_prodRelease.activityFlags : null, (r41 & 524288) != 0 ? purchaseTransaction$activity_prodRelease.activityPartnerInfo : null, (r41 & 1048576) != 0 ? purchaseTransaction$activity_prodRelease.subdomain : null, (r41 & 2097152) != 0 ? purchaseTransaction$activity_prodRelease.channels : null, (r41 & 4194304) != 0 ? purchaseTransaction$activity_prodRelease.purposes : null);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL, null, null);
            java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action = purchaseTransaction$activity_prodRelease.getAction();
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel2 = action != null ? (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) action) : null;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$PY7SiwtaEypErw_Qfr0Vb3zQzLc((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(copy, activityActionModel2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 384, 0);
            java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action2 = purchaseTransaction$activity_prodRelease.getAction();
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel3 = action2 != null ? (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) action2) : null;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$wrSkf9iGONPASx9MtGWD436TpwU((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(purchaseTransaction$activity_prodRelease, activityActionModel3, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 384, 0);
            copy2 = purchaseTransaction$activity_prodRelease.copy((r41 & 1) != 0 ? purchaseTransaction$activity_prodRelease.id : null, (r41 & 2) != 0 ? purchaseTransaction$activity_prodRelease.groupId : null, (r41 & 4) != 0 ? purchaseTransaction$activity_prodRelease.invoiceId : null, (r41 & 8) != 0 ? purchaseTransaction$activity_prodRelease.avatar : null, (r41 & 16) != 0 ? purchaseTransaction$activity_prodRelease.title : null, (r41 & 32) != 0 ? purchaseTransaction$activity_prodRelease.date : null, (r41 & 64) != 0 ? purchaseTransaction$activity_prodRelease.createdTime : null, (r41 & 128) != 0 ? purchaseTransaction$activity_prodRelease.amountInformation : null, (r41 & 256) != 0 ? purchaseTransaction$activity_prodRelease.transactionShortDescription : null, (r41 & 512) != 0 ? purchaseTransaction$activity_prodRelease.paymentStatus : null, (r41 & 1024) != 0 ? purchaseTransaction$activity_prodRelease.transactionETANote : null, (r41 & 2048) != 0 ? purchaseTransaction$activity_prodRelease.additionalInfo : null, (r41 & 4096) != 0 ? purchaseTransaction$activity_prodRelease.rewardInfo : null, (r41 & 8192) != 0 ? purchaseTransaction$activity_prodRelease.activityMoneyMovementDirection : null, (r41 & 16384) != 0 ? purchaseTransaction$activity_prodRelease.action : kotlin.collections.CollectionsKt.listOf(activityActionModel), (r41 & 32768) != 0 ? purchaseTransaction$activity_prodRelease.type : null, (r41 & 65536) != 0 ? purchaseTransaction$activity_prodRelease.activityStatus : null, (r41 & 131072) != 0 ? purchaseTransaction$activity_prodRelease.shipmentPackages : null, (r41 & 262144) != 0 ? purchaseTransaction$activity_prodRelease.activityFlags : null, (r41 & 524288) != 0 ? purchaseTransaction$activity_prodRelease.activityPartnerInfo : null, (r41 & 1048576) != 0 ? purchaseTransaction$activity_prodRelease.subdomain : null, (r41 & 2097152) != 0 ? purchaseTransaction$activity_prodRelease.channels : null, (r41 & 4194304) != 0 ? purchaseTransaction$activity_prodRelease.purposes : null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.m11915$r8$lambda$52M0M5FEieI48J_xcMzSBrv42I((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(copy2, activityActionModel, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 384, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.$r8$lambda$i_Xga5Zobsm09Ssbwd16KKBKzCo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wrSkf9iGONPASx9MtGWD436TpwU(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yFRWiFbSRC8WGUmXGvjM3IxHWi4(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }
}

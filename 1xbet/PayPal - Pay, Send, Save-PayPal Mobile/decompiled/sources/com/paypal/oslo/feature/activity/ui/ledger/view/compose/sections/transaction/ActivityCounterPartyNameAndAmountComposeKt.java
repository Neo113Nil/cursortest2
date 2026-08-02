package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0016"}, d2 = {"RenderCounterPartyNameAndAmount", "", "title", "", "activityItemUIModel", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "titleWidth", "", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;FLandroidx/compose/runtime/Composer;II)V", "AmountWithCurrencyCode", "amountInformation", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "activityMoneyMovementDirection", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "amountTypography", "Lcom/paypal/pds/core/Typography;", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Lcom/paypal/pds/core/Typography;Landroidx/compose/runtime/Composer;I)V", "ActivityItemViewMoneyReceivedTransactionAmountStrikeThroughPreview", "(Landroidx/compose/runtime/Composer;I)V", "ActivityItemViewWithCryptoCreditPreview", "ActivityItemViewMoneyReceivedTransactionPreview", "ActivityItemViewWithCryptoPreview", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityCounterPartyNameAndAmountComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderCounterPartyNameAndAmount(final java.lang.String str, final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final float f2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1242445070);
        int currentMarker = startRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                float f3 = i4 != 0 ? 0.75f : f2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1242445070, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderCounterPartyNameAndAmount (ActivityCounterPartyNameAndAmountCompose.kt:50)");
                }
                androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
                startRestartGroup.startReplaceGroup(1489465084);
                final float f4 = f3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, f3), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i3 & 14) | 12779904, 6, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
                if (activityTransactionModel.getType() == com.paypal.oslo.api.graphql.schema.type.ActivityType.PACKAGE || activityTransactionModel.getType() == com.paypal.oslo.api.graphql.schema.type.ActivityType.REWARDS) {
                    startRestartGroup.endToMarker(currentMarker);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScope = startRestartGroup.endRestartGroup();
                    if (scopeUpdateScope != null) {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.$r8$lambda$JxYYtJvia3qwTx4lJwxbFasOxB8(str, activityTransactionModel, f4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        scopeUpdateScope.updateScope(function2);
                        return;
                    }
                    return;
                }
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation amountInformation = activityTransactionModel.getAmountInformation();
                com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown activityMoneyMovementDirection = activityTransactionModel.getActivityMoneyMovementDirection();
                if (activityMoneyMovementDirection == null) {
                    activityMoneyMovementDirection = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown.INSTANCE;
                }
                composer2 = startRestartGroup;
                AmountWithCurrencyCode(amountInformation, activityMoneyMovementDirection, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, (com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.$stable << 3) | 384);
                composer2.endReplaceGroup();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                f2 = f4;
            }
            scopeUpdateScope = composer2.endRestartGroup();
            if (scopeUpdateScope == null) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.m11912$r8$lambda$pKebexvcTDylAl_jZHBUhBKOBE(str, activityTransactionModel, f2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                scopeUpdateScope.updateScope(function2);
                return;
            }
            return;
        }
        f2 = f;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope == null) {
        }
    }

    public static final void AmountWithCurrencyCode(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, final com.paypal.pds.core.Typography typography, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        com.paypal.pds.core.Color.ContentMuted contentMuted;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCounterPartyAmountInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyMovementDirection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1274854900);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityCounterPartyAmountInformation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(activityMoneyMovementDirection) : startRestartGroup.changedInstance(activityMoneyMovementDirection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(typography) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1274854900, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.AmountWithCurrencyCode (ActivityCounterPartyNameAndAmountCompose.kt:94)");
            }
            if (activityCounterPartyAmountInformation.isAmountNeutral()) {
                contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
            } else if (activityMoneyMovementDirection instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit) {
                contentMuted = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
            } else if (activityMoneyMovementDirection instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit) {
                contentMuted = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            } else {
                if (!(activityMoneyMovementDirection instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
            }
            com.paypal.pds.core.Color color = contentMuted;
            if (!activityCounterPartyAmountInformation.isAmountNeutral()) {
                if (activityMoneyMovementDirection instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit) {
                    str = "+";
                } else if (activityMoneyMovementDirection instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit) {
                    str = "-";
                } else if (!(activityMoneyMovementDirection instanceof com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            java.lang.String formatAmount$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils.INSTANCE.formatAmount$activity_prodRelease(activityCounterPartyAmountInformation, str);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(formatAmount$activity_prodRelease, androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null), color, !activityCounterPartyAmountInformation.isStrikeThroughAmount() ? null : androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough(), androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, typography, startRestartGroup, 12779520, (i2 >> 6) & 14, 832);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.m11909$r8$lambda$eBfBgnD5xtCbMUEBj1Mfyb0Tg(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation.this, activityMoneyMovementDirection, typography, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$56R_X0HxUJKmTAdQzd8dOaYzpzQ(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5JR-xYVDvkrZXpOWSj5x0PRZdjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11905$r8$lambda$5JRxYVDvkrZXpOWSj5x0PRZdjk(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel purchaseTransaction$activity_prodRelease;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-739626577);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-739626577, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityItemViewMoneyReceivedTransactionPreview (ActivityCounterPartyNameAndAmountCompose.kt:185)");
            }
            purchaseTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.purchaseTransaction$activity_prodRelease((r19 & 1) != 0 ? "crypto_tx_001" : null, (r19 & 2) != 0 ? "crypto_group_001" : null, (r19 & 4) != 0 ? "PayPal" : null, (r19 & 8) != 0 ? "Feb 9, 2026" : null, (r19 & 16) != 0 ? "Money Received" : null, (r19 & 32) != 0 ? "2500.00" : null, (r19 & 64) != 0 ? "USD" : null, (r19 & 128) != 0 ? false : false, (r19 & 256) != 0 ? null : null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.$r8$lambda$56R_X0HxUJKmTAdQzd8dOaYzpzQ((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(purchaseTransaction$activity_prodRelease, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.m11905$r8$lambda$5JRxYVDvkrZXpOWSj5x0PRZdjk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6cPxeAfoSq7gYR6sJB4ZKGTtSXA(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GgESyGCvgjE2yntHhqukk2E8Tco(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel purchaseTransaction$activity_prodRelease;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1491696728);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1491696728, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityItemViewMoneyReceivedTransactionAmountStrikeThroughPreview (ActivityCounterPartyNameAndAmountCompose.kt:145)");
            }
            purchaseTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.purchaseTransaction$activity_prodRelease((r19 & 1) != 0 ? "crypto_tx_001" : null, (r19 & 2) != 0 ? "crypto_group_001" : null, (r19 & 4) != 0 ? "PayPal" : null, (r19 & 8) != 0 ? "Feb 9, 2026" : null, (r19 & 16) != 0 ? "Money Received" : null, (r19 & 32) != 0 ? "2500.00" : null, (r19 & 64) != 0 ? "USD" : null, (r19 & 128) != 0 ? false : true, (r19 & 256) != 0 ? null : null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.$r8$lambda$6cPxeAfoSq7gYR6sJB4ZKGTtSXA((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(purchaseTransaction$activity_prodRelease, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.$r8$lambda$GgESyGCvgjE2yntHhqukk2E8Tco(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JxYYtJvia3qwTx4lJwxbFasOxB8(java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderCounterPartyNameAndAmount(str, activityTransactionModel, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SZT5TzCZoQGM8h9PngmK8Id-ucg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11907$r8$lambda$SZT5TzCZoQGM8h9PngmK8Iducg(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eBfBgnD-5xtCbMUEBj1Mf-yb0Tg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11909$r8$lambda$eBfBgnD5xtCbMUEBj1Mfyb0Tg(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, com.paypal.pds.core.Typography typography, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountWithCurrencyCode(activityCounterPartyAmountInformation, activityMoneyMovementDirection, typography, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h07Lo0C-3DCLH9jVBmBZMrmGaOU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11910$r8$lambda$h07Lo0C3DCLH9jVBmBZMrmGaOU(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pKebex-vcTDylAl_jZHBUhBKOBE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11912$r8$lambda$pKebexvcTDylAl_jZHBUhBKOBE(java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderCounterPartyNameAndAmount(str, activityTransactionModel, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qzhGepHcGJIc0nT5pOILPacS2ow(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel bitcoinPurchaseTransaction$activity_prodRelease;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1705556965);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1705556965, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityItemViewWithCryptoPreview (ActivityCounterPartyNameAndAmountCompose.kt:209)");
            }
            bitcoinPurchaseTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.bitcoinPurchaseTransaction$activity_prodRelease((r19 & 1) != 0 ? "crypto_tx_001" : null, (r19 & 2) != 0 ? "crypto_group_001" : null, (r19 & 4) != 0 ? "Bitcoin Purchase" : null, (r19 & 8) != 0 ? "Feb 9, 2026" : null, (r19 & 16) != 0 ? "Crypto Wallet" : null, (r19 & 32) != 0 ? "0.05" : null, (r19 & 64) != 0 ? "2500.00" : null, (r19 & 128) != 0 ? "USD" : null, (r19 & 256) != 0 ? null : null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.m11907$r8$lambda$SZT5TzCZoQGM8h9PngmK8Iducg((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(bitcoinPurchaseTransaction$activity_prodRelease, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.$r8$lambda$qzhGepHcGJIc0nT5pOILPacS2ow(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ufAKZ8XDqzYPI2BiBTDscORu1Yo(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel ethereumReceivedTransaction$activity_prodRelease;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1000324268);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1000324268, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityItemViewWithCryptoCreditPreview (ActivityCounterPartyNameAndAmountCompose.kt:168)");
            }
            ethereumReceivedTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.ethereumReceivedTransaction$activity_prodRelease((r21 & 1) != 0 ? "crypto_tx_002" : null, (r21 & 2) != 0 ? "crypto_group_002" : null, (r21 & 4) != 0 ? "Ethereum Received" : null, (r21 & 8) != 0 ? "Feb 8, 2026" : null, (r21 & 16) != 0 ? "From Crypto Exchange" : null, (r21 & 32) != 0 ? "1.25" : null, (r21 & 64) != 0 ? "3750.00" : null, (r21 & 128) != 0 ? "USD" : null, (r21 & 256) != 0 ? "Reference: ETH-2026-02" : null, (r21 & 512) != 0 ? null : null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.m11910$r8$lambda$h07Lo0C3DCLH9jVBmBZMrmGaOU((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(ethereumReceivedTransaction$activity_prodRelease, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.$r8$lambda$ufAKZ8XDqzYPI2BiBTDscORu1Yo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}

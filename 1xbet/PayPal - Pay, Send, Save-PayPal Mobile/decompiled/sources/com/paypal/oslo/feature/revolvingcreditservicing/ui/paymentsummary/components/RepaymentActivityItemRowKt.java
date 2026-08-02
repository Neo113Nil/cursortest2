package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;", "uiModel", "Lkotlin/Function0;", "", "onItemClick", "onCancelPaymentClick", "RepaymentActivityItemView", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/pds/core/Icon;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/pds/core/Icon;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RepaymentActivityItemRowKt {
    public static final void RepaymentActivityItemView(final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivityUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(889646240);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(repaymentActivityUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(889646240, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemView (RepaymentActivityItemRow.kt:43)");
            }
            java.lang.String asString = repaymentActivityUiModel.getTitleText().asString(startRestartGroup, 0);
            java.lang.String asString2 = repaymentActivityUiModel.getSubtitleText().asString(startRestartGroup, 0);
            if (repaymentActivityUiModel.getShowCancelButton()) {
                startRestartGroup.startReplaceGroup(-791507692);
                composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-761301042, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.m18569$r8$lambda$YdavUuo64yf5m2aLJNupS6HmEQ(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-791394914);
                startRestartGroup.endReplaceGroup();
                composableLambda = null;
            }
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(asString, asString2, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1643834301, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.$r8$lambda$EdIUiZ1zXRMaU0fDtbrDdCFXab4(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-13273956, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.m18565$r8$lambda$9dcge_VdPp8XsndTnujqCBLZLQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composableLambda, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), 1596, null), null, repaymentActivityUiModel.isClickable(), function0, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable | ((i2 << 6) & 7168), 114);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.m18564$r8$lambda$4ScU0Eaq5DHjyysg2yPY8Lk5Go(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1548475445);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1548475445, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentIconSlot (RepaymentActivityItemRow.kt:69)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(icon), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseInfo.INSTANCE), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.$r8$lambda$5ZYl3LLr0uSkMDiTrIErKmGf1sk(com.paypal.pds.core.Icon.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1136884666);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(repaymentActivityUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1136884666, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentAmountSlot (RepaymentActivityItemRow.kt:84)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(repaymentActivityUiModel.getDisplayAmountText().asString(startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), repaymentActivityUiModel.getAmountColor(), null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.$r8$lambda$cYYboVRO1n3RTVRZImJEqrLZabc(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1107482785);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1107482785, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.CancelButtonSlot (RepaymentActivityItemRow.kt:96)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_cancel, startRestartGroup, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, (i2 & 14) | 1769472, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.m18571$r8$lambda$v260akS8OHEt29e9hpIl9ujChg(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4ScU0Eaq5DH-jyysg2yPY8Lk5Go, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18564$r8$lambda$4ScU0Eaq5DHjyysg2yPY8Lk5Go(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        RepaymentActivityItemView(repaymentActivityUiModel, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ZYl3LLr0uSkMDiTrIErKmGf1sk(com.paypal.pds.core.Icon icon, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(icon, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8RMTyzT9goeDLAARfOoLA5253Y0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(844445549);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(844445549, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemViewAutopayTodayPreview (RepaymentActivityItemRow.kt:144)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel createMockPayment$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-autopay-003", "$75.00", "Nov 17", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING, true, "Chase Checking", "9012", true, false, 256, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RepaymentActivityItemView(createMockPayment$default, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.$r8$lambda$8RMTyzT9goeDLAARfOoLA5253Y0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9dcge_-VdPp8XsndTnujqCBLZLQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18565$r8$lambda$9dcge_VdPp8XsndTnujqCBLZLQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-13273956, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemView.<anonymous> (RepaymentActivityItemRow.kt:51)");
            }
            getHighResolutionOutputSizeshNQ4ISI(repaymentActivityUiModel.getLeadingIcon(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EdIUiZ1zXRMaU0fDtbrDdCFXab4(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1643834301, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemView.<anonymous> (RepaymentActivityItemRow.kt:52)");
            }
            getHighSpeedVideoSizes(repaymentActivityUiModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I_GmR8OnDTbzKEpbf4DDKP3rS9s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2116161618);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2116161618, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemViewNonCancelablePreview (RepaymentActivityItemRow.kt:126)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel createMockPayment$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-processed-002", "$250.00", "Nov 15", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, null, null, true, true, 96, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RepaymentActivityItemView(createMockPayment$default, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.$r8$lambda$I_GmR8OnDTbzKEpbf4DDKP3rS9s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NorXodZXehj0SkJ99g5aaUBsEr8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1877300455);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1877300455, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemViewCancelablePreview (RepaymentActivityItemRow.kt:107)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel createMockPayment$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-cancelable-001", "$100.00", "Nov 20", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING, true, "Wells Fargo", "1234", false, false, 256, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RepaymentActivityItemView(createMockPayment$default, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.$r8$lambda$NorXodZXehj0SkJ99g5aaUBsEr8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PyT-7CHAcHqLnhkZ4UTE65fTM-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18568$r8$lambda$PyT7CHAcHqLnhkZ4UTE65fTMU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-806715796);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-806715796, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemViewLongNamePreview (RepaymentActivityItemRow.kt:163)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel createMockPayment$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-long-name-004", "$1,250.00", "Dec 1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, "First National Bank of Very Long Name Association", "3456", false, false, 256, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RepaymentActivityItemView(createMockPayment$default, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.m18568$r8$lambda$PyT7CHAcHqLnhkZ4UTE65fTMU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Yda-vUuo64yf5m2aLJNupS6HmEQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18569$r8$lambda$YdavUuo64yf5m2aLJNupS6HmEQ(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-761301042, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemView.<anonymous> (RepaymentActivityItemRow.kt:55)");
            }
            getHighSpeedVideoFpsRangesFor(function0, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cYYboVRO1n3RTVRZImJEqrLZabc(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(repaymentActivityUiModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v260akS8OHE-t29e9hpIl9ujChg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18571$r8$lambda$v260akS8OHEt29e9hpIl9ujChg(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

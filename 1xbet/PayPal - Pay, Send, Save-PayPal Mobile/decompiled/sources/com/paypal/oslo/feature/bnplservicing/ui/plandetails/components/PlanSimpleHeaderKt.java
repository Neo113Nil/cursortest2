package com.paypal.oslo.feature.bnplservicing.ui.plandetails.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"PreviewMerchantName", "", "PlanSimpleHeader", "", "merchantName", "modifier", "Landroidx/compose/ui/Modifier;", "alertModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;", "paymentProgressBarModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;Landroidx/compose/runtime/Composer;II)V", "PlanSimpleHeaderPendingPreview", "(Landroidx/compose/runtime/Composer;I)V", "PlanSimpleHeaderPaidOffPreview", "PlanSimpleHeaderMaturedPreview", "PlanSimpleHeaderRefundPreview", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanSimpleHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanSimpleHeader(final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel, com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel2 = planSimpleHeaderAlertModel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(408736158);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? startRestartGroup.changed(planSimpleHeaderAlertModel2) : startRestartGroup.changedInstance(planSimpleHeaderAlertModel2) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paymentProgressBarModel2 = paymentProgressBarModel;
                i3 |= startRestartGroup.changed(paymentProgressBarModel2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                } else {
                    androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel3 = i4 != 0 ? null : planSimpleHeaderAlertModel2;
                    final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel3 = i5 != 0 ? null : paymentProgressBarModel2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(408736158, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeader (PlanSimpleHeader.kt:50)");
                    }
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderTestTags.PLAN_SIMPLE_HEADER_CARD), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                    com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel4 = paymentProgressBarModel3;
                    planSimpleHeaderAlertModel2 = planSimpleHeaderAlertModel3;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.CardKt.Card(m1706padding3ABfNKs, com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, (androidx.compose.ui.graphics.painter.Painter) null, outlined, new com.paypal.pds.components.HeaderConfig(str, null, null, null, null, 30, null), (com.paypal.pds.components.FooterConfig) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1287156526, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt.$r8$lambda$ut04bdTWk8ipQkL525j3DX21ais(com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel.this, planSimpleHeaderAlertModel3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 48 | (com.paypal.pds.components.HeaderConfig.$stable << 12), 6, 996);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    paymentProgressBarModel2 = paymentProgressBarModel4;
                }
                final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel4 = planSimpleHeaderAlertModel2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel5 = paymentProgressBarModel2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt.$r8$lambda$dcbjRNbDQTnwIgVpuEXZCaEIPJk(str, modifier5, planSimpleHeaderAlertModel4, paymentProgressBarModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            paymentProgressBarModel2 = paymentProgressBarModel;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel42 = planSimpleHeaderAlertModel2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        paymentProgressBarModel2 = paymentProgressBarModel;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel422 = planSimpleHeaderAlertModel2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I4vETaSWxE_jZV1aUQK3jt_7Q88(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(523563181);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(523563181, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderPaidOffPreview (PlanSimpleHeader.kt:109)");
            }
            PlanSimpleHeader("Best Buy", null, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_all_payments_made_label, new java.lang.Object[0]), com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE), new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(4, 4), startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.pds.components.ContextualAlertStyle.$stable) << 6) | 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt.$r8$lambda$I4vETaSWxE_jZV1aUQK3jt_7Q88(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dcbjRNbDQTnwIgVpuEXZCaEIPJk(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel, com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanSimpleHeader(str, modifier, planSimpleHeaderAlertModel, paymentProgressBarModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hta0WjJIWfTSKCAPcPTkHT3pZYA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1559791858);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1559791858, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderRefundPreview (PlanSimpleHeader.kt:143)");
            }
            PlanSimpleHeader("Best Buy", null, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_sending_refund_label, "$225.00"), com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE), null, startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.pds.components.ContextualAlertStyle.$stable) << 6) | 6, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt.$r8$lambda$hta0WjJIWfTSKCAPcPTkHT3pZYA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p50uZPRPsjiHNnBPQPg8WUlfJdY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1495002559);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1495002559, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderPendingPreview (PlanSimpleHeader.kt:90)");
            }
            PlanSimpleHeader("Best Buy", null, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_all_payments_made_label, new java.lang.Object[0]), com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE), new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(0, 4), startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.pds.components.ContextualAlertStyle.$stable) << 6) | 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt.$r8$lambda$p50uZPRPsjiHNnBPQPg8WUlfJdY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sNNitHxPnE5uDyzx9joAgBQP4uk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1341245498);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1341245498, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderMaturedPreview (PlanSimpleHeader.kt:128)");
            }
            PlanSimpleHeader("Best Buy", null, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_completed, "Apr 11, 2020"), com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE), null, startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.pds.components.ContextualAlertStyle.$stable) << 6) | 6, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderKt.$r8$lambda$sNNitHxPnE5uDyzx9joAgBQP4uk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ut04bdTWk8ipQkL525j3DX21ais(com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1287156526, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeader.<anonymous> (PlanSimpleHeader.kt:61)");
            }
            if (paymentProgressBarModel == null) {
                composer.startReplaceGroup(-212009061);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-212009060);
                com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarKt.PaymentProgressBar(paymentProgressBarModel, null, composer, 0, 2);
                composer.endReplaceGroup();
            }
            if (planSimpleHeaderAlertModel == null) {
                composer.startReplaceGroup(-211869034);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-211869033);
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(com.paypal.oslo.core.commonui.utils.RefTextKt.value(planSimpleHeaderAlertModel.getText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderTestTags.CONTEXTUAL_ALERT), planSimpleHeaderAlertModel.getStyle(), composer, (com.paypal.pds.components.ContextualAlertStyle.$stable << 6) | 48, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}

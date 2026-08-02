package com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/PaymentTypeAccordion;", "", "<init>", "()V", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeAccordion {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentTypeAccordion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData paymentTypeAccordionData, final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2035481380);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentTypeAccordionConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(paymentTypeAccordionData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(paymentTypeAccordionCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2035481380, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion.Content (PaymentTypeAccordion.kt:37)");
                }
                com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state = paymentTypeAccordionData.getState();
                if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading) {
                    startRestartGroup.startReplaceGroup(1617755921);
                    if (((com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading) state).isExpanded()) {
                        startRestartGroup.startReplaceGroup(1617790734);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionLoadingKt.PaymentTypeAccordionLoading(modifier5, startRestartGroup, (i3 >> 9) & 14, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1617884261);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionLoadingCollapsedKt.PaymentTypeAccordionLoadingCollapsed(modifier5, startRestartGroup, (i3 >> 9) & 14, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                } else if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready) {
                    startRestartGroup.startReplaceGroup(1618087404);
                    if (!paymentTypeAccordionConfig.getHardDefault()) {
                        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready) state;
                        if (ready.getEnabled()) {
                            if (ready.isExpanded()) {
                                startRestartGroup.startReplaceGroup(1618560991);
                                composer2 = startRestartGroup;
                                com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionExpandedKt.PaymentTypeAccordionExpanded(paymentTypeAccordionConfig, ready, paymentTypeAccordionCallbacks, modifier5, composer2, i3 & 8078, 0);
                                startRestartGroup.endReplaceGroup();
                                modifier4 = modifier5;
                            } else {
                                startRestartGroup.startReplaceGroup(1618886925);
                                modifier4 = modifier5;
                                composer2 = startRestartGroup;
                                com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.PaymentTypeAccordionCollapsed(ready, true, paymentTypeAccordionConfig.getShowInfoLinks(), paymentTypeAccordionCallbacks.getOnInfoLinkClick(), modifier4, paymentTypeAccordionCallbacks.getOnExpand(), composer2, ((i3 << 3) & 57344) | 48, 0);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                        }
                    }
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1618143111);
                    com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.PaymentTypeAccordionCollapsed((com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready) state, false, paymentTypeAccordionConfig.getShowInfoLinks(), paymentTypeAccordionCallbacks.getOnInfoLinkClick(), modifier4, null, composer2, ((i3 << 3) & 57344) | 48, 32);
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1887478362);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion.$r8$lambda$oOdos5Puzoq_Je451G6CpWEQhcc(com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion.this, paymentTypeAccordionConfig, paymentTypeAccordionData, paymentTypeAccordionCallbacks, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oOdos5Puzoq_Je451G6CpWEQhcc(com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion paymentTypeAccordion, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData paymentTypeAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        paymentTypeAccordion.Content(paymentTypeAccordionConfig, paymentTypeAccordionData, paymentTypeAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

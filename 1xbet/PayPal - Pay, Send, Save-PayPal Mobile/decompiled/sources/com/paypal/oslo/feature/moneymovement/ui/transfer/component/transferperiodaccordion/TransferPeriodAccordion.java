package com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/TransferPeriodAccordion;", "", "<init>", "()V", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferPeriodAccordion {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TransferPeriodAccordion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig transferPeriodAccordionConfig, final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData transferPeriodAccordionData, final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionCallbacks transferPeriodAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption transferPeriodOption;
        androidx.compose.ui.Modifier modifier4;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(409010084);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transferPeriodAccordionConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(transferPeriodAccordionData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(transferPeriodAccordionCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(409010084, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion.Content (TransferPeriodAccordion.kt:34)");
                }
                com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State state = transferPeriodAccordionData.getState();
                if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading) {
                    startRestartGroup.startReplaceGroup(-2492865);
                    if (((com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading) state).isExpanded()) {
                        startRestartGroup.startReplaceGroup(-2461369);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionLoadingKt.TransferPeriodAccordionLoading(transferPeriodAccordionConfig.getLabel(), modifier5, startRestartGroup, (i3 >> 6) & 112, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-2273230);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionLoadingCollapsedKt.TransferPeriodAccordionLoadingCollapsed(modifier5, transferPeriodAccordionConfig.getShowChevron(), startRestartGroup, (i3 >> 9) & 14, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                } else if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready) {
                    startRestartGroup.startReplaceGroup(-1965927);
                    com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready) state;
                    java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption> transferPeriodOptions = com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodMapperKt.toTransferPeriodOptions(ready.getPeriods());
                    com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod selectedPeriod = ready.getSelectedPeriod();
                    if (selectedPeriod != null) {
                        java.util.Iterator<T> it = transferPeriodOptions.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (((com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption) obj).getTransferSpeed() == selectedPeriod.getTransferSpeed()) {
                                    break;
                                }
                            }
                        }
                        transferPeriodOption = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption) obj;
                    } else {
                        transferPeriodOption = null;
                    }
                    if (ready.isExpanded() && ready.getEnabled()) {
                        startRestartGroup.startReplaceGroup(-1658159);
                        modifier4 = modifier5;
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionExpandedKt.TransferPeriodAccordionExpanded(transferPeriodAccordionConfig.getLabel(), transferPeriodOptions, ready.getSelectedSpeed(), transferPeriodAccordionCallbacks.getOnCollapse(), transferPeriodAccordionCallbacks.getOnSelectPeriod(), ready.getEnabled(), modifier5, transferPeriodAccordionConfig.getShowChevron(), startRestartGroup, (i3 << 9) & 3670016, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        modifier4 = modifier5;
                        startRestartGroup.startReplaceGroup(-1149511);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordionCollapsedKt.TransferPeriodAccordionCollapsed(transferPeriodOption, ready.getEnabled(), modifier4, (ready.getEnabled() && transferPeriodAccordionConfig.getShowChevron()) ? transferPeriodAccordionCallbacks.getOnExpand() : null, startRestartGroup, (i3 >> 3) & 896, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2078291958);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion.$r8$lambda$JauF7QGajkVgR4ZKjU7GjO0THCk(com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion.this, transferPeriodAccordionConfig, transferPeriodAccordionData, transferPeriodAccordionCallbacks, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JauF7QGajkVgR4ZKjU7GjO0THCk(com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion transferPeriodAccordion, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig transferPeriodAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData transferPeriodAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionCallbacks transferPeriodAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        transferPeriodAccordion.Content(transferPeriodAccordionConfig, transferPeriodAccordionData, transferPeriodAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

package com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposecodeaccordion/PurposeCodeAccordion;", "", "<init>", "()V", "Content", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PurposeCodeAccordion {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PurposeCodeAccordion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData purposeAccordionData, final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks purposeCodeAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCodeAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-23962654);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(purposeAccordionData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(purposeCodeAccordionCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-23962654, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion.Content (PurposeCodeAccordion.kt:31)");
                }
                com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State state = purposeAccordionData.getState();
                if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Loading.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-906618297);
                    com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordionLoadingCollapsedKt.PurposeCodeAccordionLoadingCollapsed(modifier4, startRestartGroup, (i3 >> 6) & 14, 0);
                } else if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready) {
                    startRestartGroup.startReplaceGroup(-906454307);
                    com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready) state;
                    if (ready.isExpanded() && ready.getEnabled()) {
                        startRestartGroup.startReplaceGroup(-906410318);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordionExpandedKt.PurposeCodeAccordionExpanded(ready.getSupportedCodes(), ready.getSelectedCode(), purposeCodeAccordionCallbacks.getOnCollapse(), purposeCodeAccordionCallbacks.getOnCodeSelected(), ready.getEnabled(), modifier4, startRestartGroup, (i3 << 9) & 458752, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-905980968);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordionCollapsedKt.PurposeCodeAccordionCollapsed(ready.getSelectedCode(), ready.getEnabled(), modifier4, ready.getEnabled() ? purposeCodeAccordionCallbacks.getOnExpand() : null, startRestartGroup, i3 & 896, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(-1553268049);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion.m15736$r8$lambda$KJhaTTrLvLM3DPl6W4ZjYFoUFs(com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion.this, purposeAccordionData, purposeCodeAccordionCallbacks, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$KJhaTTrLvLM3DPl6W4ZjYFo-UFs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15736$r8$lambda$KJhaTTrLvLM3DPl6W4ZjYFoUFs(com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion purposeCodeAccordion, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData purposeAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks purposeCodeAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        purposeCodeAccordion.Content(purposeAccordionData, purposeCodeAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

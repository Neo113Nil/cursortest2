package com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/ShippingAccordion;", "", "<init>", "()V", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingAccordion {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ShippingAccordion() {
    }

    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData shippingAccordionData, final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1179615416);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(shippingAccordionConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(shippingAccordionData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(shippingAccordionCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1179615416, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion.Content (ShippingAccordion.kt:67)");
            }
            final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state = shippingAccordionData.getState();
            if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Loading) {
                startRestartGroup.startReplaceGroup(-500161880);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionKt.getHighSpeedVideoSizes(modifier, com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ComposableSingletons$ShippingAccordionKt.INSTANCE.getLambda$1851574715$money_movement_prodRelease(), startRestartGroup, ((i3 >> 9) & 14) | 48, 0);
                startRestartGroup.endReplaceGroup();
            } else if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready) {
                startRestartGroup.startReplaceGroup(-499935580);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionKt.getHighSpeedVideoSizes(modifier, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(470106930, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion.$r8$lambda$6yIVwVWCx_IyeLnkAkFgn7qSeSk(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.this, shippingAccordionConfig, shippingAccordionCallbacks, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 9) & 14) | 48, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(260958854);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion.m15757$r8$lambda$_lx6RA6rtn8KE0HZFbG89IhZlo(com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion.this, shippingAccordionConfig, shippingAccordionData, shippingAccordionCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6yIVwVWCx_IyeLnkAkFgn7qSeSk(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(470106930, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion.Content.<anonymous> (ShippingAccordion.kt:78)");
            }
            com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready) state;
            if (!ready.getEnabled()) {
                composer.startReplaceGroup(-932753938);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionKt.getHighSpeedVideoFpsRangesFor(ready, null, composer, 0, 2);
                composer.endReplaceGroup();
            } else if (ready.isExpanded()) {
                composer.startReplaceGroup(-932559816);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionKt.Camera2StreamConfigurationMap(shippingAccordionConfig, ready, shippingAccordionCallbacks, null, composer, 0, 8);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-932214445);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordionKt.Camera2StreamConfigurationMap(ready, shippingAccordionCallbacks, null, composer, 0, 4);
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

    /* renamed from: $r8$lambda$_lx6R-A6rtn8KE0HZFbG89IhZlo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15757$r8$lambda$_lx6RA6rtn8KE0HZFbG89IhZlo(com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion shippingAccordion, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData shippingAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        shippingAccordion.Content(shippingAccordionConfig, shippingAccordionData, shippingAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}

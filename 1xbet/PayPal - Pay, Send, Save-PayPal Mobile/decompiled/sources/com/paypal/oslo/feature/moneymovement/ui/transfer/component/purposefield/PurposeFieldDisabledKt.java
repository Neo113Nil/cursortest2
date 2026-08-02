package com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"PurposeFieldDisabled", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PurposeFieldDisabledPreview", "(Landroidx/compose/runtime/Composer;I)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PurposeFieldDisabledKt {
    public static final void PurposeFieldDisabled(final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(896195474);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ready) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(896195474, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabled (PurposeFieldDisabled.kt:33)");
            }
            com.paypal.oslo.core.commonui.components.ProgressiveDisclosureAccordionKt.ProgressiveDisclosureAccordion(modifier, true, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2015537936, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt.$r8$lambda$8JZzrWc7VvZEwf6soe92SfcOwlA(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.ComposableSingletons$PurposeFieldDisabledKt.INSTANCE.getLambda$1242312783$money_movement_prodRelease(), startRestartGroup, ((i3 >> 3) & 14) | 1769904, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt.$r8$lambda$mSoSGXRpxH8QEbUm6L7YncuHnp8(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8JZzrWc7VvZEwf6soe92SfcOwlA(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2015537936, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabled.<anonymous> (PurposeFieldDisabled.kt:39)");
            }
            com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldCollapsedKt.PurposeFieldCollapsed(ready, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mSoSGXRpxH8QEbUm6L7YncuHnp8(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PurposeFieldDisabled(ready, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yGQfC6mkKEFatqV1mFL8tUUZ24w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1454003090);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1454003090, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledPreview (PurposeFieldDisabled.kt:53)");
            }
            PurposeFieldDisabled(new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready(com.paypal.pds.core.Icon.Send.INSTANCE, com.google.common.net.HttpHeaders.PURPOSE, "Transportation", null, false, null, false, 40, null), null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt.$r8$lambda$yGQfC6mkKEFatqV1mFL8tUUZ24w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}

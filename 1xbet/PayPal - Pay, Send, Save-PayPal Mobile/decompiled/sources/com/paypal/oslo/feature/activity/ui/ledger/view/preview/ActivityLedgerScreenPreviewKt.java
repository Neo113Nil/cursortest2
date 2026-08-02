package com.paypal.oslo.feature.activity.ui.ledger.view.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "ActivityLedgerScreenPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerScreenPreviewKt {
    public static final void ActivityLedgerScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1013066808);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1013066808, i, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.preview.ActivityLedgerScreenPreview (ActivityLedgerScreenPreview.kt:23)");
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.screen.ActivityLedgerScreenKt.ActivityLedgerScreen(null, null, startRestartGroup, 0, 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.preview.ActivityLedgerScreenPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.preview.ActivityLedgerScreenPreviewKt.$r8$lambda$JbcQAWUtTX6rmPozuT0xwd5zfdU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JbcQAWUtTX6rmPozuT0xwd5zfdU(int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityLedgerScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

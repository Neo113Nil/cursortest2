package com.paypal.oslo.feature.activity.ui.detail.view.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "ActivityTransactionDetailScreenPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTransactionDetailScreenPreviewKt {
    public static final void ActivityTransactionDetailScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-639991702);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-639991702, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.preview.ActivityTransactionDetailScreenPreview (ActivityTransactionDetailScreenPreview.kt:23)");
            }
            com.paypal.oslo.feature.activity.ui.detail.view.screen.ActivityTransactionDetailScreenKt.ActivityTransactionDetailScreen(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.preview.ActivityTransactionDetailScreenPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.preview.ActivityTransactionDetailScreenPreviewKt.$r8$lambda$mLnZvaD7MNcafAuAvmBNJ03MbBg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mLnZvaD7MNcafAuAvmBNJ03MbBg(int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityTransactionDetailScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

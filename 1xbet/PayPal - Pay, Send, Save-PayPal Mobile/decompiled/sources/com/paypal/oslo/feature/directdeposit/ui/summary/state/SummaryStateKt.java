package com.paypal.oslo.feature.directdeposit.ui.summary.state;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "routingNumber", "bankAccountNumber", "", "SummaryHeader", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SummaryStateKt {
    public static final void SummaryHeader(final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1967627067);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1967627067, i2, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryHeader (SummaryState.kt:28)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Routing number: ".concat(java.lang.String.valueOf(str)), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Bank account number: ".concat(java.lang.String.valueOf(str2)), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryStateKt.$r8$lambda$mbgQXgHF8x8A_sDLLQV1u97f2kY(str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mbgQXgHF8x8A_sDLLQV1u97f2kY(java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        SummaryHeader(str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}

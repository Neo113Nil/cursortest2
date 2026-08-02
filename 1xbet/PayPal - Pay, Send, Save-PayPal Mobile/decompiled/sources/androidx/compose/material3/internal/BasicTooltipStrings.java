package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/material3/internal/BasicTooltipStrings;", "", "<init>", "()V", "", "label", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicTooltipStrings {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.BasicTooltipStrings INSTANCE = new androidx.compose.material3.internal.BasicTooltipStrings();

    private BasicTooltipStrings() {
    }

    public final java.lang.String label(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1966841262, i, -1, "androidx.compose.material3.internal.BasicTooltipStrings.label (BasicTooltip.android.kt:23)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(androidx.compose.foundation.R.string.tooltip_label, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public final java.lang.String description(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1282333990, i, -1, "androidx.compose.material3.internal.BasicTooltipStrings.description (BasicTooltip.android.kt:25)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(androidx.compose.foundation.R.string.tooltip_description, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }
}

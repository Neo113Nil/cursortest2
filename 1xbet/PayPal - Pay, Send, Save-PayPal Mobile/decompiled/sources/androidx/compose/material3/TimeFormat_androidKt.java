package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002"}, d2 = {"", "is24HourFormat", "(Landroidx/compose/runtime/Composer;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeFormat_androidKt {
    public static final boolean is24HourFormat(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-972868615, i, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean is24HourFormat = android.text.format.DateFormat.is24HourFormat((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return is24HourFormat;
    }
}

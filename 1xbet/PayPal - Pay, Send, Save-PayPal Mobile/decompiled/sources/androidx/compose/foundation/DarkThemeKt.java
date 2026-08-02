package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "isSystemInDarkTheme", "(Landroidx/compose/runtime/Composer;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DarkThemeKt {
    public static final boolean isSystemInDarkTheme(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1100791446, i, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:36)");
        }
        boolean _isSystemInDarkTheme = androidx.compose.foundation.DarkTheme_androidKt._isSystemInDarkTheme(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return _isSystemInDarkTheme;
    }
}

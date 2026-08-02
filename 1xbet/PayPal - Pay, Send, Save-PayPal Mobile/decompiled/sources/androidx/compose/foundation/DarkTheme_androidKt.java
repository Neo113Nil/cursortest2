package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "_isSystemInDarkTheme", "(Landroidx/compose/runtime/Composer;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DarkTheme_androidKt {
    public static final boolean _isSystemInDarkTheme(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z = (((android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return z;
    }
}

package androidx.compose.foundation;

/* compiled from: DarkTheme.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"_isSystemInDarkTheme", "", "(Landroidx/compose/runtime/Composer;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DarkTheme_androidKt {
    public static final boolean _isSystemInDarkTheme(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -882615028, "C(_isSystemInDarkTheme)47@2141L7:DarkTheme.android.kt#71ulvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.res.Configuration> localConfiguration = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localConfiguration);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        boolean z = (((android.content.res.Configuration) consume).uiMode & 48) == 32;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return z;
    }
}

package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/Color;", "colorResource", "(ILandroidx/compose/runtime/Composer;I)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ColorResources_androidKt {
    public static final long colorResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1777644873, i2, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:34)");
        }
        long Color = androidx.compose.ui.graphics.ColorKt.Color(androidx.core.content.res.ResourcesCompat.getColor((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()), i, ((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getTheme()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return Color;
    }
}

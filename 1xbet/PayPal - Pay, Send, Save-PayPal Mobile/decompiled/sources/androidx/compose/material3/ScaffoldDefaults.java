package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/material3/ScaffoldDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsets;", "getContentWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaffoldDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.ScaffoldDefaults INSTANCE = new androidx.compose.material3.ScaffoldDefaults();

    private ScaffoldDefaults() {
    }

    public final androidx.compose.foundation.layout.WindowInsets getContentWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(757124140, i, -1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:301)");
        }
        androidx.compose.foundation.layout.WindowInsets systemBarsForVisualComponents = androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return systemBarsForVisualComponents;
    }
}

package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "getWindowContainerHeight", "(Landroidx/compose/runtime/Composer;I)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchBar_androidKt {
    public static final float getWindowContainerHeight(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1909557323, i, -1, "androidx.compose.material3.getWindowContainerHeight (SearchBar.android.kt:27)");
        }
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(((android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m8601constructorimpl;
    }
}

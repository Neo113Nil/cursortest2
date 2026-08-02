package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets$Companion;", "Landroidx/compose/foundation/layout/WindowInsets;", "getSystemBarsForVisualComponents", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "systemBarsForVisualComponents"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemBarsDefaultInsets_androidKt {
    public static final androidx.compose.foundation.layout.WindowInsets getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2011811170, i, -1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
        }
        int i2 = i & 14;
        androidx.compose.foundation.layout.WindowInsets union = androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(companion, composer, i2), androidx.compose.foundation.layout.WindowInsets_androidKt.getDisplayCutout(companion, composer, i2));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return union;
    }
}

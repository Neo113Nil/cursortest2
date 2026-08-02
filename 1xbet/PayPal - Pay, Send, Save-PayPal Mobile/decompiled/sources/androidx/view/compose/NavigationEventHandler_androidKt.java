package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "isInspectionMode", "(Landroidx/compose/runtime/Composer;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationEventHandler_androidKt {
    public static final boolean isInspectionMode(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1476766739, i, -1, "androidx.navigationevent.compose.isInspectionMode (NavigationEventHandler.android.kt:21)");
        }
        boolean booleanValue = ((java.lang.Boolean) composer.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return booleanValue;
    }
}

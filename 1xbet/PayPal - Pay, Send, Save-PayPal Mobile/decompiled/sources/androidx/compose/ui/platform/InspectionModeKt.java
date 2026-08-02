package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalInspectionMode", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalInspectionMode", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InspectionModeKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalInspectionMode = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.InspectionModeKt$LocalInspectionMode$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.FALSE;
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}

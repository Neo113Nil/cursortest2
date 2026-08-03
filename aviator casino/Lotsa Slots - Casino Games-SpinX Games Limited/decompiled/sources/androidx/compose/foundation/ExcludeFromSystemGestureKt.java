package androidx.compose.foundation;

/* compiled from: ExcludeFromSystemGesture.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¨\u0006\u0006"}, d2 = {"excludeFromSystemGesture", "Landroidx/compose/ui/Modifier;", "exclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @kotlin.Deprecated(message = "Use systemGestureExclusion", replaceWith = @kotlin.ReplaceWith(expression = "systemGestureExclusion", imports = {}))
    public static final androidx.compose.ui.Modifier excludeFromSystemGesture(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @kotlin.Deprecated(message = "Use systemGestureExclusion", replaceWith = @kotlin.ReplaceWith(expression = "systemGestureExclusion", imports = {}))
    public static final androidx.compose.ui.Modifier excludeFromSystemGesture(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        return androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion(modifier, function1);
    }
}

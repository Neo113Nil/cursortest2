package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\u0001\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0001\u0010\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "preferKeepClear", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "rectProvider", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreferKeepClear_androidKt {
    public static final androidx.compose.ui.Modifier preferKeepClear(androidx.compose.ui.Modifier modifier) {
        return android.os.Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new androidx.compose.foundation.PreferKeepClearElement(null));
    }

    public static final androidx.compose.ui.Modifier preferKeepClear(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        return android.os.Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new androidx.compose.foundation.PreferKeepClearElement(function1));
    }
}

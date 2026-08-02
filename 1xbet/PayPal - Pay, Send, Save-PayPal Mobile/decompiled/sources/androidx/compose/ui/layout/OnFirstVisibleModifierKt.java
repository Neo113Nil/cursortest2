package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "minDurationMs", "", "minFractionVisible", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "viewportBounds", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "onFirstVisible", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/ui/layout/LayoutBoundsHolder;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnFirstVisibleModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier onFirstVisible$default(androidx.compose.ui.Modifier modifier, long j, float f, androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onFirstVisible(modifier, j2, f2, layoutBoundsHolder, function0);
    }

    public static final androidx.compose.ui.Modifier onFirstVisible(androidx.compose.ui.Modifier modifier, long j, float f, androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return modifier.then(new androidx.compose.ui.layout.OnFirstVisibleElement(j, f, layoutBoundsHolder, function0));
    }
}

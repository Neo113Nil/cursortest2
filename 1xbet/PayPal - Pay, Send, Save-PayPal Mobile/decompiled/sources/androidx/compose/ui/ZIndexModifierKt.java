package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "zIndex", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ZIndexModifierKt {
    public static final androidx.compose.ui.Modifier zIndex(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(new androidx.compose.ui.ZIndexElement(f));
    }
}

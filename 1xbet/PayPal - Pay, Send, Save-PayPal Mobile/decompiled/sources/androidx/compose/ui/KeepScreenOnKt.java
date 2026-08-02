package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "keepScreenOn", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeepScreenOnKt {
    public static final androidx.compose.ui.Modifier keepScreenOn(androidx.compose.ui.Modifier modifier) {
        return modifier.then(androidx.compose.ui.KeepScreenOnElement.INSTANCE);
    }
}

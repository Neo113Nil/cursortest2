package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "nestedScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier nestedScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return nestedScroll(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }

    public static final androidx.compose.ui.Modifier nestedScroll(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.then(new androidx.compose.ui.input.nestedscroll.NestedScrollElement(nestedScrollConnection, nestedScrollDispatcher));
    }
}

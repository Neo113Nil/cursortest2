package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u00020\u00058'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u00020\u00058'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/SearchBarScrollBehavior;", "", "Landroidx/compose/ui/Modifier;", "searchBarScrollBehavior", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "getScrollOffset", "()F", "setScrollOffset", "(F)V", "scrollOffset", "getScrollOffsetLimit", "setScrollOffsetLimit", "scrollOffsetLimit", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SearchBarScrollBehavior {
    androidx.compose.ui.input.nestedscroll.NestedScrollConnection getNestedScrollConnection();

    float getScrollOffset();

    float getScrollOffsetLimit();

    androidx.compose.ui.Modifier searchBarScrollBehavior(androidx.compose.ui.Modifier modifier);

    void setScrollOffset(float f);

    void setScrollOffsetLimit(float f);
}

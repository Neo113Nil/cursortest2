package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "", "", "itemsPerViewport", "()I", "getItemCount", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LazyLayoutBeyondBoundsState {
    int getFirstPlacedIndex();

    boolean getHasVisibleItems();

    int getItemCount();

    int getLastPlacedIndex();

    int itemsPerViewport();
}

package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0014\u0010#\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0016\u0010)\u001a\u0004\u0018\u00010&8'X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/CacheWindowScope;", "", "", "lineIndex", "Lkotlin/Function2;", "", "onItemPrefetched", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "(ILkotlin/jvm/functions/Function2;)Ljava/util/List;", "indexInVisibleLines", "getVisibleItemSize", "(I)I", "getVisibleItemLine", "getVisibleLineKey", "(I)Ljava/lang/Object;", "getLastIndexInLine", "getLastLineIndex", "()I", "getTotalItemsCount", "totalItemsCount", "getVisibleLineCount", "visibleLineCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getMainAxisExtraSpaceStart", "mainAxisExtraSpaceStart", "getMainAxisExtraSpaceEnd", "mainAxisExtraSpaceEnd", "getFirstVisibleLineIndex", "firstVisibleLineIndex", "getLastVisibleLineIndex", "lastVisibleLineIndex", "getMainAxisViewportSize", "mainAxisViewportSize", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheWindowScope {
    androidx.compose.ui.unit.Density getDensity();

    int getFirstVisibleLineIndex();

    boolean getHasVisibleItems();

    int getLastIndexInLine(int lineIndex);

    int getLastLineIndex();

    int getLastVisibleLineIndex();

    int getMainAxisExtraSpaceEnd();

    int getMainAxisExtraSpaceStart();

    int getMainAxisViewportSize();

    int getTotalItemsCount();

    int getVisibleItemLine(int indexInVisibleLines);

    int getVisibleItemSize(int indexInVisibleLines);

    int getVisibleLineCount();

    java.lang.Object getVisibleLineKey(int indexInVisibleLines);

    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int lineIndex, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onItemPrefetched);
}

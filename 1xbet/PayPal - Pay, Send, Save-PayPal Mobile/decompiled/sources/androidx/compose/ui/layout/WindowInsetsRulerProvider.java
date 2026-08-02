package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/WindowInsetsRulerProvider;", "", "Landroidx/collection/ScatterMap;", "Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "getInsetsValues", "()Landroidx/collection/ScatterMap;", "insetsValues", "", "Landroidx/compose/ui/layout/RectRulers;", "getCutoutRulers", "()Ljava/util/List;", "cutoutRulers", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;", "insetsListener", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/MutableState;", "Landroid/graphics/Rect;", "getCutoutRects", "()Landroidx/collection/MutableObjectList;", "cutoutRects"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WindowInsetsRulerProvider {
    androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> getCutoutRects();

    java.util.List<androidx.compose.ui.layout.RectRulers> getCutoutRulers();

    androidx.compose.ui.layout.InsetsListener getInsetsListener();

    androidx.collection.ScatterMap<java.lang.Object, androidx.compose.ui.layout.WindowWindowInsetsAnimationValues> getInsetsValues();
}

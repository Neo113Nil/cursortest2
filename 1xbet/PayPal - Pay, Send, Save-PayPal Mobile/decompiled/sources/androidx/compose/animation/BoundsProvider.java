package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/BoundsProvider;", "", "Landroidx/compose/ui/geometry/Rect;", "targetBoundsBeforeDisposed", "calculateAlternativeTargetBounds", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "getLastBoundsInSharedTransitionScope", "()Landroidx/compose/ui/geometry/Rect;", "lastBoundsInSharedTransitionScope"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BoundsProvider {
    androidx.compose.ui.geometry.Rect calculateAlternativeTargetBounds(androidx.compose.ui.geometry.Rect targetBoundsBeforeDisposed);

    androidx.compose.ui.geometry.Rect getLastBoundsInSharedTransitionScope();
}

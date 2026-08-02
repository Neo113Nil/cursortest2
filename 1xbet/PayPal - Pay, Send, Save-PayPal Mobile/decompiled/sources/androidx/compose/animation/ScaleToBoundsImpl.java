package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/animation/ScaleToBoundsImpl;", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/Alignment;", "alignment", "<init>", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaleToBoundsImpl implements androidx.compose.animation.SharedTransitionScope.ResizeMode {
    public static final int $stable = 0;
    private final androidx.compose.ui.Alignment alignment;
    private final androidx.compose.ui.layout.ContentScale contentScale;

    public ScaleToBoundsImpl(androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Alignment alignment) {
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }
}

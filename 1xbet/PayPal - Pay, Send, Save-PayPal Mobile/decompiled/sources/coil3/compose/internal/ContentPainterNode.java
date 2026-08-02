package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcoil3/compose/internal/ContentPainterNode;", "Lcoil3/compose/internal/AbstractContentPainterNode;", "Lcoil3/compose/AsyncImagePainter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Lcoil3/compose/ConstraintsSizeResolver;", "constraintSizeResolver", "<init>", "(Lcoil3/compose/AsyncImagePainter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLjava/lang/String;Lcoil3/compose/ConstraintsSizeResolver;)V", "", "onAttach", "()V", "onDetach", "onReset", "Lcoil3/compose/AsyncImagePainter;", "getPainter", "()Lcoil3/compose/AsyncImagePainter;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentPainterNode extends coil3.compose.internal.AbstractContentPainterNode {
    public static final int $stable = 8;
    private final coil3.compose.AsyncImagePainter painter;

    public ContentPainterNode(coil3.compose.AsyncImagePainter asyncImagePainter, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, boolean z, java.lang.String str, coil3.compose.ConstraintsSizeResolver constraintsSizeResolver) {
        super(alignment, contentScale, f, colorFilter, z, str, constraintsSizeResolver);
        this.painter = asyncImagePainter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public final coil3.compose.AsyncImagePainter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getPainter().setScope$coil_compose_core(getCoroutineScope());
        getPainter().onRemembered();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        getPainter().onForgotten();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        getPainter().set_input$coil_compose_core(null);
    }
}

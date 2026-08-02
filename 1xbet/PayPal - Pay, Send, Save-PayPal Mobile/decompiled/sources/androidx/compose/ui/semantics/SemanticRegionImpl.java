package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/semantics/SemanticRegionImpl;", "Landroidx/compose/ui/semantics/SemanticsRegion;", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "p0", "", "set", "(Landroidx/compose/ui/unit/IntRect;)V", "", "intersect", "(Landroidx/compose/ui/semantics/SemanticsRegion;)Z", "difference", "(Landroidx/compose/ui/unit/IntRect;)Z", "Landroid/graphics/Region;", "Camera2StreamConfigurationMap", "Landroid/graphics/Region;", "getHighSpeedVideoSizes", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "getHighSpeedVideoFpsRanges", "isEmpty", "()Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SemanticRegionImpl implements androidx.compose.ui.semantics.SemanticsRegion {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.graphics.Region getHighSpeedVideoSizes = new android.graphics.Region();

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final void set(androidx.compose.ui.unit.IntRect p0) {
        this.getHighSpeedVideoSizes.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final androidx.compose.ui.unit.IntRect getBounds() {
        return androidx.compose.ui.graphics.RectHelper_androidKt.toComposeIntRect(this.getHighSpeedVideoSizes.getBounds());
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final boolean intersect(androidx.compose.ui.semantics.SemanticsRegion p0) {
        android.graphics.Region region = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
        return region.op(((androidx.compose.ui.semantics.SemanticRegionImpl) p0).getHighSpeedVideoSizes, android.graphics.Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final boolean difference(androidx.compose.ui.unit.IntRect p0) {
        return this.getHighSpeedVideoSizes.op(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), android.graphics.Region.Op.DIFFERENCE);
    }
}

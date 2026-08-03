package androidx.compose.ui.graphics.vector;

/* compiled from: ImageVector.kt */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\t\u0010\b\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "it", "getIt", "()Ljava/util/Iterator;", "hasNext", "", io.ktor.http.LinkHeader.Rel.Next, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorGroup$iterator$1 implements java.util.Iterator<androidx.compose.ui.graphics.vector.VectorNode>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Iterator<androidx.compose.ui.graphics.vector.VectorNode> it;

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    VectorGroup$iterator$1(androidx.compose.ui.graphics.vector.VectorGroup vectorGroup) {
        java.util.List list;
        list = vectorGroup.children;
        this.it = list.iterator();
    }

    public final java.util.Iterator<androidx.compose.ui.graphics.vector.VectorNode> getIt() {
        return this.it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.it.hasNext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public androidx.compose.ui.graphics.vector.VectorNode next() {
        return this.it.next();
    }
}

package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material/AnchoredDragScope;", "", "", "newOffset", "lastKnownVelocity", "", "dragTo", "(FF)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnchoredDragScope {
    void dragTo(float newOffset, float lastKnownVelocity);

    static /* synthetic */ void dragTo$default(androidx.compose.material.AnchoredDragScope anchoredDragScope, float f, float f2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        anchoredDragScope.dragTo(f, f2);
    }
}

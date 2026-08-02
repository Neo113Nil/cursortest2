package androidx.constraintlayout.compose;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0002\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b"}, d2 = {"Landroidx/constraintlayout/compose/VerticalChainScope;", "", "id", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getBottom", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "getTop"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalChainScope {
    public static final int $stable = 0;
    private final androidx.constraintlayout.compose.HorizontalAnchorable bottom;
    private final java.lang.Object id;
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference parent = new androidx.constraintlayout.compose.ConstrainedLayoutReference("parent");
    private final androidx.constraintlayout.compose.HorizontalAnchorable top;

    public VerticalChainScope(java.lang.Object obj, androidx.constraintlayout.core.parser.CLObject cLObject) {
        this.id = obj;
        this.top = new androidx.constraintlayout.compose.ChainHorizontalAnchorable(cLObject, 0);
        this.bottom = new androidx.constraintlayout.compose.ChainHorizontalAnchorable(cLObject, 1);
    }

    /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final androidx.constraintlayout.compose.HorizontalAnchorable getTop() {
        return this.top;
    }

    public final androidx.constraintlayout.compose.HorizontalAnchorable getBottom() {
        return this.bottom;
    }
}

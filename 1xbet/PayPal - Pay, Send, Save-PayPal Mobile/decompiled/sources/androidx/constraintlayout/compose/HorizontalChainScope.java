package androidx.constraintlayout.compose;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalChainScope;", "", "id", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteLeft", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteRight", "getAbsoluteRight", "end", "getEnd", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HorizontalChainScope {
    public static final int $stable = 0;
    private final androidx.constraintlayout.compose.VerticalAnchorable absoluteLeft;
    private final androidx.constraintlayout.compose.VerticalAnchorable absoluteRight;
    private final androidx.constraintlayout.compose.VerticalAnchorable end;
    private final java.lang.Object id;
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference parent = new androidx.constraintlayout.compose.ConstrainedLayoutReference("parent");
    private final androidx.constraintlayout.compose.VerticalAnchorable start;

    public HorizontalChainScope(java.lang.Object obj, androidx.constraintlayout.core.parser.CLObject cLObject) {
        this.id = obj;
        this.start = new androidx.constraintlayout.compose.ChainVerticalAnchorable(cLObject, -2);
        this.absoluteLeft = new androidx.constraintlayout.compose.ChainVerticalAnchorable(cLObject, 0);
        this.end = new androidx.constraintlayout.compose.ChainVerticalAnchorable(cLObject, -1);
        this.absoluteRight = new androidx.constraintlayout.compose.ChainVerticalAnchorable(cLObject, 1);
    }

    /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getStart() {
        return this.start;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getEnd() {
        return this.end;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }
}

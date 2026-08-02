package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00168\u0007¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\b\u0012\u0004\b\u001e\u0010\f\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\"\u0010\b\u0012\u0004\b$\u0010\f\u001a\u0004\b#\u0010\nR\u001d\u0010%\u001a\u00020\u00168\u0007¢\u0006\u0012\n\u0004\b%\u0010\u0018\u0012\u0004\b'\u0010\f\u001a\u0004\b&\u0010\u001a"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft$annotations", "()V", "absoluteRight", "getAbsoluteRight", "getAbsoluteRight$annotations", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "baseline", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline$annotations", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom$annotations", "end", "getEnd", "getEnd$annotations", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getStart", "getStart$annotations", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "getTop", "getTop$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstrainedLayoutReference extends androidx.constraintlayout.compose.LayoutReference {
    public static final int $stable = 0;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor baseline;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor end;
    private final java.lang.Object id;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor start;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor top;

    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    public static /* synthetic */ void getBaseline$annotations() {
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public ConstrainedLayoutReference(java.lang.Object obj) {
        super(obj);
        this.id = obj;
        androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference = this;
        this.start = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(getId(), -2, constrainedLayoutReference);
        this.absoluteLeft = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(getId(), 0, constrainedLayoutReference);
        this.top = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor(getId(), 0, constrainedLayoutReference);
        this.end = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(getId(), -1, constrainedLayoutReference);
        this.absoluteRight = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(getId(), 1, constrainedLayoutReference);
        this.bottom = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor(getId(), 1, constrainedLayoutReference);
        this.baseline = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor(getId(), constrainedLayoutReference);
    }

    @Override // androidx.constraintlayout.compose.LayoutReference
    /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor getBaseline() {
        return this.baseline;
    }
}

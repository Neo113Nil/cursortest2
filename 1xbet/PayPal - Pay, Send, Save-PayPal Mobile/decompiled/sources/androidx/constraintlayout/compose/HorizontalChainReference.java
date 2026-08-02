package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u0010\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0013\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\n"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalChainReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft$annotations", "()V", "absoluteRight", "getAbsoluteRight", "getAbsoluteRight$annotations", "end", "getEnd", "getEnd$annotations", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getStart", "getStart$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HorizontalChainReference extends androidx.constraintlayout.compose.LayoutReference {
    public static final int $stable = 0;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor end;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor start;

    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public HorizontalChainReference(java.lang.Object obj) {
        super(obj);
        androidx.constraintlayout.compose.HorizontalChainReference horizontalChainReference = this;
        this.start = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, horizontalChainReference);
        this.absoluteLeft = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(obj, 0, horizontalChainReference);
        this.end = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, horizontalChainReference);
        this.absoluteRight = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor(obj, 1, horizontalChainReference);
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }
}

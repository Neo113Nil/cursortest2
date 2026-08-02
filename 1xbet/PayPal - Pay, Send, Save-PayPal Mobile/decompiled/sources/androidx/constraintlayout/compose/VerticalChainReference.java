package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n"}, d2 = {"Landroidx/constraintlayout/compose/VerticalChainReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom$annotations", "()V", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "getTop", "getTop$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalChainReference extends androidx.constraintlayout.compose.LayoutReference {
    public static final int $stable = 0;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    private final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor top;

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public VerticalChainReference(java.lang.Object obj) {
        super(obj);
        androidx.constraintlayout.compose.VerticalChainReference verticalChainReference = this;
        this.top = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, verticalChainReference);
        this.bottom = new androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, verticalChainReference);
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }
}

package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/Arc;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Arc {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.Arc.Companion INSTANCE = new androidx.constraintlayout.compose.Arc.Companion(null);
    private static final androidx.constraintlayout.compose.Arc None = new androidx.constraintlayout.compose.Arc("none");
    private static final androidx.constraintlayout.compose.Arc StartVertical = new androidx.constraintlayout.compose.Arc("startVertical");
    private static final androidx.constraintlayout.compose.Arc StartHorizontal = new androidx.constraintlayout.compose.Arc("startHorizontal");
    private static final androidx.constraintlayout.compose.Arc Flip = new androidx.constraintlayout.compose.Arc("flip");
    private static final androidx.constraintlayout.compose.Arc Below = new androidx.constraintlayout.compose.Arc("below");
    private static final androidx.constraintlayout.compose.Arc Above = new androidx.constraintlayout.compose.Arc("above");

    public Arc(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/Arc$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/Arc;", "Above", "Landroidx/constraintlayout/compose/Arc;", "getAbove", "()Landroidx/constraintlayout/compose/Arc;", "Below", "getBelow", "Flip", "getFlip", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone", "StartHorizontal", "getStartHorizontal", "StartVertical", "getStartVertical"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.Arc getNone() {
            return androidx.constraintlayout.compose.Arc.None;
        }

        public final androidx.constraintlayout.compose.Arc getStartVertical() {
            return androidx.constraintlayout.compose.Arc.StartVertical;
        }

        public final androidx.constraintlayout.compose.Arc getStartHorizontal() {
            return androidx.constraintlayout.compose.Arc.StartHorizontal;
        }

        public final androidx.constraintlayout.compose.Arc getFlip() {
            return androidx.constraintlayout.compose.Arc.Flip;
        }

        public final androidx.constraintlayout.compose.Arc getBelow() {
            return androidx.constraintlayout.compose.Arc.Below;
        }

        public final androidx.constraintlayout.compose.Arc getAbove() {
            return androidx.constraintlayout.compose.Arc.Above;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String getName() {
        return this.name;
    }
}

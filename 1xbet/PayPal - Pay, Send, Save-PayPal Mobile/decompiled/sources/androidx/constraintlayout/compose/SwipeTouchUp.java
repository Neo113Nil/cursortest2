package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/SwipeTouchUp;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeTouchUp {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.SwipeTouchUp.Companion INSTANCE = new androidx.constraintlayout.compose.SwipeTouchUp.Companion(null);
    private static final androidx.constraintlayout.compose.SwipeTouchUp AutoComplete = new androidx.constraintlayout.compose.SwipeTouchUp("autocomplete");
    private static final androidx.constraintlayout.compose.SwipeTouchUp ToStart = new androidx.constraintlayout.compose.SwipeTouchUp("toStart");
    private static final androidx.constraintlayout.compose.SwipeTouchUp ToEnd = new androidx.constraintlayout.compose.SwipeTouchUp("toEnd");
    private static final androidx.constraintlayout.compose.SwipeTouchUp Stop = new androidx.constraintlayout.compose.SwipeTouchUp("stop");
    private static final androidx.constraintlayout.compose.SwipeTouchUp Decelerate = new androidx.constraintlayout.compose.SwipeTouchUp("decelerate");
    private static final androidx.constraintlayout.compose.SwipeTouchUp NeverCompleteStart = new androidx.constraintlayout.compose.SwipeTouchUp("neverCompleteStart");
    private static final androidx.constraintlayout.compose.SwipeTouchUp NeverCompleteEnd = new androidx.constraintlayout.compose.SwipeTouchUp("neverCompleteEnd");

    public SwipeTouchUp(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/SwipeTouchUp$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/SwipeTouchUp;", "AutoComplete", "Landroidx/constraintlayout/compose/SwipeTouchUp;", "getAutoComplete", "()Landroidx/constraintlayout/compose/SwipeTouchUp;", "Decelerate", "getDecelerate", "NeverCompleteEnd", "getNeverCompleteEnd", "NeverCompleteStart", "getNeverCompleteStart", "Stop", "getStop", "ToEnd", "getToEnd", "ToStart", "getToStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getAutoComplete() {
            return androidx.constraintlayout.compose.SwipeTouchUp.AutoComplete;
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getToStart() {
            return androidx.constraintlayout.compose.SwipeTouchUp.ToStart;
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getToEnd() {
            return androidx.constraintlayout.compose.SwipeTouchUp.ToEnd;
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getStop() {
            return androidx.constraintlayout.compose.SwipeTouchUp.Stop;
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getDecelerate() {
            return androidx.constraintlayout.compose.SwipeTouchUp.Decelerate;
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getNeverCompleteStart() {
            return androidx.constraintlayout.compose.SwipeTouchUp.NeverCompleteStart;
        }

        public final androidx.constraintlayout.compose.SwipeTouchUp getNeverCompleteEnd() {
            return androidx.constraintlayout.compose.SwipeTouchUp.NeverCompleteEnd;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String getName() {
        return this.name;
    }
}

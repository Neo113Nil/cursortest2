package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/Visibility;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName$constraintlayout_compose_release", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Visibility {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.Visibility.Companion INSTANCE = new androidx.constraintlayout.compose.Visibility.Companion(null);
    private static final androidx.constraintlayout.compose.Visibility Visible = new androidx.constraintlayout.compose.Visibility("visible");
    private static final androidx.constraintlayout.compose.Visibility Invisible = new androidx.constraintlayout.compose.Visibility("invisible");
    private static final androidx.constraintlayout.compose.Visibility Gone = new androidx.constraintlayout.compose.Visibility("gone");

    public Visibility(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/Visibility$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/Visibility;", "Gone", "Landroidx/constraintlayout/compose/Visibility;", "getGone", "()Landroidx/constraintlayout/compose/Visibility;", "getGone$annotations", "Invisible", "getInvisible", "getInvisible$annotations", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, "getVisible", "getVisible$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getGone$annotations() {
        }

        public static /* synthetic */ void getInvisible$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }

        private Companion() {
        }

        public final androidx.constraintlayout.compose.Visibility getVisible() {
            return androidx.constraintlayout.compose.Visibility.Visible;
        }

        public final androidx.constraintlayout.compose.Visibility getInvisible() {
            return androidx.constraintlayout.compose.Visibility.Invisible;
        }

        public final androidx.constraintlayout.compose.Visibility getGone() {
            return androidx.constraintlayout.compose.Visibility.Gone;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: getName$constraintlayout_compose_release, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}

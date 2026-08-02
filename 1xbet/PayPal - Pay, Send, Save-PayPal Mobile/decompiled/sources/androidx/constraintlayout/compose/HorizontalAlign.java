package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalAlign;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName$constraintlayout_compose_release", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HorizontalAlign {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.HorizontalAlign.Companion INSTANCE = new androidx.constraintlayout.compose.HorizontalAlign.Companion(null);
    private static final androidx.constraintlayout.compose.HorizontalAlign Start = new androidx.constraintlayout.compose.HorizontalAlign(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
    private static final androidx.constraintlayout.compose.HorizontalAlign End = new androidx.constraintlayout.compose.HorizontalAlign("end");
    private static final androidx.constraintlayout.compose.HorizontalAlign Center = new androidx.constraintlayout.compose.HorizontalAlign(com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER);

    public HorizontalAlign(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalAlign$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/HorizontalAlign;", "Center", "Landroidx/constraintlayout/compose/HorizontalAlign;", "getCenter", "()Landroidx/constraintlayout/compose/HorizontalAlign;", "End", "getEnd", "Start", "getStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.HorizontalAlign getStart() {
            return androidx.constraintlayout.compose.HorizontalAlign.Start;
        }

        public final androidx.constraintlayout.compose.HorizontalAlign getEnd() {
            return androidx.constraintlayout.compose.HorizontalAlign.End;
        }

        public final androidx.constraintlayout.compose.HorizontalAlign getCenter() {
            return androidx.constraintlayout.compose.HorizontalAlign.Center;
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

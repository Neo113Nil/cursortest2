package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/Easing;", "Landroidx/constraintlayout/compose/NamedPropertyOrValue;", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Easing implements androidx.constraintlayout.compose.NamedPropertyOrValue {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.Easing.Companion INSTANCE = new androidx.constraintlayout.compose.Easing.Companion(null);
    private static final androidx.constraintlayout.compose.Easing Standard = new androidx.constraintlayout.compose.Easing("standard");
    private static final androidx.constraintlayout.compose.Easing Accelerate = new androidx.constraintlayout.compose.Easing("accelerate");
    private static final androidx.constraintlayout.compose.Easing Decelerate = new androidx.constraintlayout.compose.Easing("decelerate");
    private static final androidx.constraintlayout.compose.Easing Linear = new androidx.constraintlayout.compose.Easing("linear");
    private static final androidx.constraintlayout.compose.Easing Anticipate = new androidx.constraintlayout.compose.Easing("anticipate");
    private static final androidx.constraintlayout.compose.Easing Overshoot = new androidx.constraintlayout.compose.Easing("overshoot");

    public Easing(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f"}, d2 = {"Landroidx/constraintlayout/compose/Easing$Companion;", "", "<init>", "()V", "", "x1", "y1", "x2", "y2", "Landroidx/constraintlayout/compose/Easing;", "cubic", "(FFFF)Landroidx/constraintlayout/compose/Easing;", "Accelerate", "Landroidx/constraintlayout/compose/Easing;", "getAccelerate", "()Landroidx/constraintlayout/compose/Easing;", "Anticipate", "getAnticipate", "Decelerate", "getDecelerate", "Linear", "getLinear", "Overshoot", "getOvershoot", "Standard", "getStandard"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.Easing getStandard() {
            return androidx.constraintlayout.compose.Easing.Standard;
        }

        public final androidx.constraintlayout.compose.Easing getAccelerate() {
            return androidx.constraintlayout.compose.Easing.Accelerate;
        }

        public final androidx.constraintlayout.compose.Easing getDecelerate() {
            return androidx.constraintlayout.compose.Easing.Decelerate;
        }

        public final androidx.constraintlayout.compose.Easing getLinear() {
            return androidx.constraintlayout.compose.Easing.Linear;
        }

        public final androidx.constraintlayout.compose.Easing getAnticipate() {
            return androidx.constraintlayout.compose.Easing.Anticipate;
        }

        public final androidx.constraintlayout.compose.Easing getOvershoot() {
            return androidx.constraintlayout.compose.Easing.Overshoot;
        }

        public final androidx.constraintlayout.compose.Easing cubic(float x1, float y1, float x2, float y2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cubic(");
            sb.append(x1);
            sb.append(", ");
            sb.append(y1);
            sb.append(", ");
            sb.append(x2);
            sb.append(", ");
            sb.append(y2);
            sb.append(')');
            return new androidx.constraintlayout.compose.Easing(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.constraintlayout.compose.NamedPropertyOrValue
    public final java.lang.String getName() {
        return this.name;
    }
}

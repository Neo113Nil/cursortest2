package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/RelativePosition;", "Landroidx/constraintlayout/compose/NamedPropertyOrValue;", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RelativePosition implements androidx.constraintlayout.compose.NamedPropertyOrValue {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.RelativePosition.Companion INSTANCE = new androidx.constraintlayout.compose.RelativePosition.Companion(null);
    private static final androidx.constraintlayout.compose.RelativePosition Delta = new androidx.constraintlayout.compose.RelativePosition("deltaRelative");
    private static final androidx.constraintlayout.compose.RelativePosition Path = new androidx.constraintlayout.compose.RelativePosition("pathRelative");
    private static final androidx.constraintlayout.compose.RelativePosition Parent = new androidx.constraintlayout.compose.RelativePosition("parentRelative");

    public RelativePosition(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/RelativePosition$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/RelativePosition;", "Delta", "Landroidx/constraintlayout/compose/RelativePosition;", "getDelta", "()Landroidx/constraintlayout/compose/RelativePosition;", "Parent", "getParent", "Path", "getPath"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.RelativePosition getDelta() {
            return androidx.constraintlayout.compose.RelativePosition.Delta;
        }

        public final androidx.constraintlayout.compose.RelativePosition getPath() {
            return androidx.constraintlayout.compose.RelativePosition.Path;
        }

        public final androidx.constraintlayout.compose.RelativePosition getParent() {
            return androidx.constraintlayout.compose.RelativePosition.Parent;
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

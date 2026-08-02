package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle;", "", "", "name", "", "bias", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "Ljava/lang/Float;", "getBias$constraintlayout_compose_release", "()Ljava/lang/Float;", "Ljava/lang/String;", "getName$constraintlayout_compose_release", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChainStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.ChainStyle.Companion INSTANCE;
    private static final androidx.constraintlayout.compose.ChainStyle Packed;
    private static final androidx.constraintlayout.compose.ChainStyle Spread;
    private static final androidx.constraintlayout.compose.ChainStyle SpreadInside;
    private final java.lang.Float bias;
    private final java.lang.String name;

    public ChainStyle(java.lang.String str, java.lang.Float f) {
        this.name = str;
        this.bias = f;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\r\u0010\t\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle$Companion;", "", "<init>", "()V", "", "bias", "Landroidx/constraintlayout/compose/ChainStyle;", "Packed", "(F)Landroidx/constraintlayout/compose/ChainStyle;", "Landroidx/constraintlayout/compose/ChainStyle;", "getPacked", "()Landroidx/constraintlayout/compose/ChainStyle;", "getPacked$annotations", "Spread", "getSpread", "getSpread$annotations", "SpreadInside", "getSpreadInside", "getSpreadInside$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getPacked$annotations() {
        }

        public static /* synthetic */ void getSpread$annotations() {
        }

        public static /* synthetic */ void getSpreadInside$annotations() {
        }

        private Companion() {
        }

        public final androidx.constraintlayout.compose.ChainStyle getSpread() {
            return androidx.constraintlayout.compose.ChainStyle.Spread;
        }

        public final androidx.constraintlayout.compose.ChainStyle getSpreadInside() {
            return androidx.constraintlayout.compose.ChainStyle.SpreadInside;
        }

        public final androidx.constraintlayout.compose.ChainStyle getPacked() {
            return androidx.constraintlayout.compose.ChainStyle.Packed;
        }

        public final androidx.constraintlayout.compose.ChainStyle Packed(float bias) {
            return new androidx.constraintlayout.compose.ChainStyle("packed", java.lang.Float.valueOf(bias));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChainStyle(java.lang.String str, java.lang.Float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : f);
    }

    /* renamed from: getBias$constraintlayout_compose_release, reason: from getter */
    public final java.lang.Float getBias() {
        return this.bias;
    }

    /* renamed from: getName$constraintlayout_compose_release, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        androidx.constraintlayout.compose.ChainStyle.Companion companion = new androidx.constraintlayout.compose.ChainStyle.Companion(null);
        INSTANCE = companion;
        int i = 2;
        Spread = new androidx.constraintlayout.compose.ChainStyle("spread", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        SpreadInside = new androidx.constraintlayout.compose.ChainStyle("spread_inside", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Packed = companion.Packed(0.5f);
    }
}

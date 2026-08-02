package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\u00020\u00198\u0007¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u001d"}, d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", "TopLeft", "Landroidx/compose/ui/Alignment;", "getTopLeft", "()Landroidx/compose/ui/Alignment;", "getTopLeft$annotations", "TopRight", "getTopRight", "getTopRight$annotations", "CenterLeft", "getCenterLeft", "getCenterLeft$annotations", "CenterRight", "getCenterRight", "getCenterRight$annotations", "BottomLeft", "getBottomLeft", "getBottomLeft$annotations", "BottomRight", "getBottomRight", "getBottomRight$annotations", "Landroidx/compose/ui/Alignment$Horizontal;", "Left", "Landroidx/compose/ui/Alignment$Horizontal;", "getLeft", "()Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "Right", "getRight", "getRight$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbsoluteAlignment {
    public static final int $stable = 0;
    public static final androidx.compose.ui.AbsoluteAlignment INSTANCE = new androidx.compose.ui.AbsoluteAlignment();
    private static final androidx.compose.ui.Alignment TopLeft = new androidx.compose.ui.BiasAbsoluteAlignment(-1.0f, -1.0f);
    private static final androidx.compose.ui.Alignment TopRight = new androidx.compose.ui.BiasAbsoluteAlignment(1.0f, -1.0f);
    private static final androidx.compose.ui.Alignment CenterLeft = new androidx.compose.ui.BiasAbsoluteAlignment(-1.0f, 0.0f);
    private static final androidx.compose.ui.Alignment CenterRight = new androidx.compose.ui.BiasAbsoluteAlignment(1.0f, 0.0f);
    private static final androidx.compose.ui.Alignment BottomLeft = new androidx.compose.ui.BiasAbsoluteAlignment(-1.0f, 1.0f);
    private static final androidx.compose.ui.Alignment BottomRight = new androidx.compose.ui.BiasAbsoluteAlignment(1.0f, 1.0f);
    private static final androidx.compose.ui.Alignment.Horizontal Left = new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(-1.0f);
    private static final androidx.compose.ui.Alignment.Horizontal Right = new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(1.0f);

    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    public static /* synthetic */ void getBottomRight$annotations() {
    }

    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    public static /* synthetic */ void getCenterRight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    public static /* synthetic */ void getTopLeft$annotations() {
    }

    public static /* synthetic */ void getTopRight$annotations() {
    }

    private AbsoluteAlignment() {
    }

    public final androidx.compose.ui.Alignment getTopLeft() {
        return TopLeft;
    }

    public final androidx.compose.ui.Alignment getTopRight() {
        return TopRight;
    }

    public final androidx.compose.ui.Alignment getCenterLeft() {
        return CenterLeft;
    }

    public final androidx.compose.ui.Alignment getCenterRight() {
        return CenterRight;
    }

    public final androidx.compose.ui.Alignment getBottomLeft() {
        return BottomLeft;
    }

    public final androidx.compose.ui.Alignment getBottomRight() {
        return BottomRight;
    }

    public final androidx.compose.ui.Alignment.Horizontal getLeft() {
        return Left;
    }

    public final androidx.compose.ui.Alignment.Horizontal getRight() {
        return Right;
    }
}

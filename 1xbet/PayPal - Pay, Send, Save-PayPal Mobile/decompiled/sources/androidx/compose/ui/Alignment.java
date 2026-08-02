package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0003\f\r\u000bJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "Companion", "Horizontal", "Vertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Alignment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.Alignment.Companion INSTANCE = androidx.compose.ui.Alignment.Companion.Camera2StreamConfigurationMap;

    /* renamed from: align-KFBX0sM, reason: not valid java name */
    long mo5504alignKFBX0sM(long size, long space, androidx.compose.ui.unit.LayoutDirection layoutDirection);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "Landroidx/compose/ui/Alignment$Vertical;", "other", "Landroidx/compose/ui/Alignment;", "plus", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Horizontal {
        int align(int size, int space, androidx.compose.ui.unit.LayoutDirection layoutDirection);

        default androidx.compose.ui.Alignment plus(androidx.compose.ui.Alignment.Vertical other) {
            return new androidx.compose.ui.CombinedAlignment(this, other);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H¦\u0002¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "space", "align", "(II)I", "Landroidx/compose/ui/Alignment$Horizontal;", "other", "Landroidx/compose/ui/Alignment;", "plus", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Vertical {
        int align(int size, int space);

        default androidx.compose.ui.Alignment plus(androidx.compose.ui.Alignment.Horizontal other) {
            return new androidx.compose.ui.CombinedAlignment(other, this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR\u001d\u0010#\u001a\u00020\"8\u0007¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u001d\u0010(\u001a\u00020\"8\u0007¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010&R\u001d\u0010+\u001a\u00020\"8\u0007¢\u0006\u0012\n\u0004\b+\u0010$\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010&R\u001d\u0010/\u001a\u00020.8\u0007¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0003\u001a\u0004\b1\u00102R\u001d\u00104\u001a\u00020.8\u0007¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u0010\u0003\u001a\u0004\b5\u00102R\u001d\u00107\u001a\u00020.8\u0007¢\u0006\u0012\n\u0004\b7\u00100\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u00102"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", "TopStart", "Landroidx/compose/ui/Alignment;", "getTopStart", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "TopCenter", "getTopCenter", "getTopCenter$annotations", "TopEnd", "getTopEnd", "getTopEnd$annotations", "CenterStart", "getCenterStart", "getCenterStart$annotations", "Center", "getCenter", "getCenter$annotations", "CenterEnd", "getCenterEnd", "getCenterEnd$annotations", "BottomStart", "getBottomStart", "getBottomStart$annotations", "BottomCenter", "getBottomCenter", "getBottomCenter$annotations", "BottomEnd", "getBottomEnd", "getBottomEnd$annotations", "Landroidx/compose/ui/Alignment$Vertical;", "Top", "Landroidx/compose/ui/Alignment$Vertical;", "getTop", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "CenterVertically", "getCenterVertically", "getCenterVertically$annotations", "Bottom", "getBottom", "getBottom$annotations", "Landroidx/compose/ui/Alignment$Horizontal;", "Start", "Landroidx/compose/ui/Alignment$Horizontal;", "getStart", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "CenterHorizontally", "getCenterHorizontally", "getCenterHorizontally$annotations", "End", "getEnd", "getEnd$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.Alignment.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.Alignment.Companion();
        private static final androidx.compose.ui.Alignment TopStart = new androidx.compose.ui.BiasAlignment(-1.0f, -1.0f);
        private static final androidx.compose.ui.Alignment TopCenter = new androidx.compose.ui.BiasAlignment(0.0f, -1.0f);
        private static final androidx.compose.ui.Alignment TopEnd = new androidx.compose.ui.BiasAlignment(1.0f, -1.0f);
        private static final androidx.compose.ui.Alignment CenterStart = new androidx.compose.ui.BiasAlignment(-1.0f, 0.0f);
        private static final androidx.compose.ui.Alignment Center = new androidx.compose.ui.BiasAlignment(0.0f, 0.0f);
        private static final androidx.compose.ui.Alignment CenterEnd = new androidx.compose.ui.BiasAlignment(1.0f, 0.0f);
        private static final androidx.compose.ui.Alignment BottomStart = new androidx.compose.ui.BiasAlignment(-1.0f, 1.0f);
        private static final androidx.compose.ui.Alignment BottomCenter = new androidx.compose.ui.BiasAlignment(0.0f, 1.0f);
        private static final androidx.compose.ui.Alignment BottomEnd = new androidx.compose.ui.BiasAlignment(1.0f, 1.0f);
        private static final androidx.compose.ui.Alignment.Vertical Top = new androidx.compose.ui.BiasAlignment.Vertical(-1.0f);
        private static final androidx.compose.ui.Alignment.Vertical CenterVertically = new androidx.compose.ui.BiasAlignment.Vertical(0.0f);
        private static final androidx.compose.ui.Alignment.Vertical Bottom = new androidx.compose.ui.BiasAlignment.Vertical(1.0f);
        private static final androidx.compose.ui.Alignment.Horizontal Start = new androidx.compose.ui.BiasAlignment.Horizontal(-1.0f);
        private static final androidx.compose.ui.Alignment.Horizontal CenterHorizontally = new androidx.compose.ui.BiasAlignment.Horizontal(0.0f);
        private static final androidx.compose.ui.Alignment.Horizontal End = new androidx.compose.ui.BiasAlignment.Horizontal(1.0f);

        public static /* synthetic */ void getBottom$annotations() {
        }

        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        public static /* synthetic */ void getBottomStart$annotations() {
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        public static /* synthetic */ void getCenterStart$annotations() {
        }

        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }

        public static /* synthetic */ void getTop$annotations() {
        }

        public static /* synthetic */ void getTopCenter$annotations() {
        }

        public static /* synthetic */ void getTopEnd$annotations() {
        }

        public static /* synthetic */ void getTopStart$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.Alignment getTopStart() {
            return TopStart;
        }

        public final androidx.compose.ui.Alignment getTopCenter() {
            return TopCenter;
        }

        public final androidx.compose.ui.Alignment getTopEnd() {
            return TopEnd;
        }

        public final androidx.compose.ui.Alignment getCenterStart() {
            return CenterStart;
        }

        public final androidx.compose.ui.Alignment getCenter() {
            return Center;
        }

        public final androidx.compose.ui.Alignment getCenterEnd() {
            return CenterEnd;
        }

        public final androidx.compose.ui.Alignment getBottomStart() {
            return BottomStart;
        }

        public final androidx.compose.ui.Alignment getBottomCenter() {
            return BottomCenter;
        }

        public final androidx.compose.ui.Alignment getBottomEnd() {
            return BottomEnd;
        }

        public final androidx.compose.ui.Alignment.Vertical getTop() {
            return Top;
        }

        public final androidx.compose.ui.Alignment.Vertical getCenterVertically() {
            return CenterVertically;
        }

        public final androidx.compose.ui.Alignment.Vertical getBottom() {
            return Bottom;
        }

        public final androidx.compose.ui.Alignment.Horizontal getStart() {
            return Start;
        }

        public final androidx.compose.ui.Alignment.Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        public final androidx.compose.ui.Alignment.Horizontal getEnd() {
            return End;
        }
    }
}

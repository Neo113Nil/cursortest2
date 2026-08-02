package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ:\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0002\b\u0007H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout;", "", "T", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "BeyondBoundsScope", "LayoutDirection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "", "", "getHasMoreContent", "()Z", "hasMoreContent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo1839layouto7g1Pn8(int direction, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class LayoutDirection {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion INSTANCE = new androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion(null);
        private static final int Before = m7338constructorimpl(1);
        private static final int After = m7338constructorimpl(2);
        private static final int Left = m7338constructorimpl(3);
        private static final int Right = m7338constructorimpl(4);
        private static final int Above = m7338constructorimpl(5);
        private static final int Below = m7338constructorimpl(6);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7338constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7340equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "Before", com.visa.cbp.getEncExpo.warmup, "getBefore-hoxUOeE", "()I", "After", "getAfter-hoxUOeE", "Left", "getLeft-hoxUOeE", "Right", "getRight-hoxUOeE", "Above", "getAbove-hoxUOeE", "Below", "getBelow-hoxUOeE"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m7346getBeforehoxUOeE() {
                return androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Before;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m7345getAfterhoxUOeE() {
                return androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.After;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m7348getLefthoxUOeE() {
                return androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m7349getRighthoxUOeE() {
                return androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Right;
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m7344getAbovehoxUOeE() {
                return androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Above;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m7347getBelowhoxUOeE() {
                return androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Below;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ LayoutDirection(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        public final java.lang.String toString() {
            return m7342toStringimpl(this.Camera2StreamConfigurationMap);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m7342toStringimpl(int i) {
            return m7340equalsimpl0(i, Before) ? "Before" : m7340equalsimpl0(i, After) ? "After" : m7340equalsimpl0(i, Left) ? "Left" : m7340equalsimpl0(i, Right) ? "Right" : m7340equalsimpl0(i, Above) ? "Above" : m7340equalsimpl0(i, Below) ? "Below" : "invalid LayoutDirection";
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int hashCode() {
            return m7341hashCodeimpl(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object other) {
            return m7339equalsimpl(this.Camera2StreamConfigurationMap, other);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7341hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7339equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection) && i == ((androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection) obj).getCamera2StreamConfigurationMap();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection m7337boximpl(int i) {
            return new androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection(i);
        }
    }
}

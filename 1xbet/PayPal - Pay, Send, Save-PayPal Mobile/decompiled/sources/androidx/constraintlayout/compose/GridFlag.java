package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0004ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0088\u0001\u001b\u0092\u0001\u00020\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/GridFlag;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "or-90j8xCw", "(II)I", "or", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "isPlaceLayoutsOnSpansFirst-impl", "(I)Z", "isPlaceLayoutsOnSpansFirst", "isSubGridByColRow-impl$constraintlayout_compose_release", "isSubGridByColRow", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class GridFlag {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.GridFlag.Companion INSTANCE = new androidx.constraintlayout.compose.GridFlag.Companion(null);
    private static final int None = 2;
    private static final int PlaceLayoutsOnSpansFirst = 0;
    private static final int SubGridByColRow = 3;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8953equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: isPlaceLayoutsOnSpansFirst-impl, reason: not valid java name */
    public static final boolean m8955isPlaceLayoutsOnSpansFirstimpl(int i) {
        return (i & 2) == 0;
    }

    /* renamed from: isSubGridByColRow-impl$constraintlayout_compose_release, reason: not valid java name */
    public static final boolean m8956isSubGridByColRowimpl$constraintlayout_compose_release(int i) {
        return (i & 1) > 0;
    }

    private /* synthetic */ GridFlag(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    /* renamed from: or-90j8xCw, reason: not valid java name */
    public static final int m8957or90j8xCw(int i, int i2) {
        return (m8956isSubGridByColRowimpl$constraintlayout_compose_release(i) ? 1 : 0) | (m8956isSubGridByColRowimpl$constraintlayout_compose_release(i2) ? 1 : 0) | (m8955isPlaceLayoutsOnSpansFirstimpl(i) | m8955isPlaceLayoutsOnSpansFirstimpl(i2) ? 0 : 2);
    }

    public final java.lang.String toString() {
        return m8958toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8958toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GridFlag(isPlaceLayoutsOnSpansFirst = ");
        sb.append(m8955isPlaceLayoutsOnSpansFirstimpl(i));
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/GridFlag$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/GridFlag;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-dTRCCdc", "()I", "PlaceLayoutsOnSpansFirst", "getPlaceLayoutsOnSpansFirst-dTRCCdc", "SubGridByColRow", "getSubGridByColRow-dTRCCdc$constraintlayout_compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-dTRCCdc, reason: not valid java name */
        public final int m8960getNonedTRCCdc() {
            return androidx.constraintlayout.compose.GridFlag.None;
        }

        /* renamed from: getPlaceLayoutsOnSpansFirst-dTRCCdc, reason: not valid java name */
        public final int m8961getPlaceLayoutsOnSpansFirstdTRCCdc() {
            return androidx.constraintlayout.compose.GridFlag.PlaceLayoutsOnSpansFirst;
        }

        /* renamed from: getSubGridByColRow-dTRCCdc$constraintlayout_compose_release, reason: not valid java name */
        public final int m8962getSubGridByColRowdTRCCdc$constraintlayout_compose_release() {
            return androidx.constraintlayout.compose.GridFlag.SubGridByColRow;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m8954hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object obj) {
        return m8952equalsimpl(this.Camera2StreamConfigurationMap, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8954hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8952equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.constraintlayout.compose.GridFlag) && i == ((androidx.constraintlayout.compose.GridFlag) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.constraintlayout.compose.GridFlag m8951boximpl(int i) {
        return new androidx.constraintlayout.compose.GridFlag(i);
    }
}

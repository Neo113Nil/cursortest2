package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "zOrder", com.visa.cbp.getEncExpo.warmup, "getZOrder", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.AndroidExternalSurfaceZOrder.Companion INSTANCE = new androidx.compose.foundation.AndroidExternalSurfaceZOrder.Companion(null);
    private static final int Behind = 0;
    private static final int MediaOverlay = 1;
    private static final int OnTop = 2;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1271equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "Behind", com.visa.cbp.getEncExpo.warmup, "getBehind-B_4ceCc", "()I", "MediaOverlay", "getMediaOverlay-B_4ceCc", "OnTop", "getOnTop-B_4ceCc"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m1275getBehindB_4ceCc() {
            return androidx.compose.foundation.AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m1276getMediaOverlayB_4ceCc() {
            return androidx.compose.foundation.AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m1277getOnTopB_4ceCc() {
            return androidx.compose.foundation.AndroidExternalSurfaceZOrder.OnTop;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i) {
        this.zOrder = i;
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1274unboximpl() {
        return this.zOrder;
    }

    public final java.lang.String toString() {
        return m1273toStringimpl(this.zOrder);
    }

    public final int hashCode() {
        return m1272hashCodeimpl(this.zOrder);
    }

    public final boolean equals(java.lang.Object obj) {
        return m1270equalsimpl(this.zOrder, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1273toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AndroidExternalSurfaceZOrder(zOrder=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1272hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1270equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.AndroidExternalSurfaceZOrder) && i == ((androidx.compose.foundation.AndroidExternalSurfaceZOrder) obj).m1274unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.AndroidExternalSurfaceZOrder m1269boximpl(int i) {
        return new androidx.compose.foundation.AndroidExternalSurfaceZOrder(i);
    }
}

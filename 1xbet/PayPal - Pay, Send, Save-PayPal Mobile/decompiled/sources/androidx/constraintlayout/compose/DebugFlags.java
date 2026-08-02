package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\t\u0092\u0001\u00020\b"}, d2 = {"Landroidx/constraintlayout/compose/DebugFlags;", "", "", "showBounds", "showPaths", "showKeyPositions", "constructor-impl", "(ZZZ)I", "", "flags", "(I)I", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getShowBounds-impl", "(I)Z", "getShowKeyPositions-impl", "getShowPaths-impl", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class DebugFlags {
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.DebugFlags.Companion INSTANCE = new androidx.constraintlayout.compose.DebugFlags.Companion(null);
    private static final int None = m8935constructorimpl(0);
    private static final int All = m8935constructorimpl(-1);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8935constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8939equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getShowBounds-impl, reason: not valid java name */
    public static final boolean m8940getShowBoundsimpl(int i) {
        return (i & 1) > 0;
    }

    /* renamed from: getShowKeyPositions-impl, reason: not valid java name */
    public static final boolean m8941getShowKeyPositionsimpl(int i) {
        return (i & 4) > 0;
    }

    /* renamed from: getShowPaths-impl, reason: not valid java name */
    public static final boolean m8942getShowPathsimpl(int i) {
        return (i & 2) > 0;
    }

    private /* synthetic */ DebugFlags(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m8937constructorimpl$default(boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return m8936constructorimpl(z, z2, z3);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8936constructorimpl(boolean z, boolean z2, boolean z3) {
        return m8935constructorimpl((z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0));
    }

    public final java.lang.String toString() {
        return m8944toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8944toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebugFlags(showBounds = ");
        sb.append(m8940getShowBoundsimpl(i));
        sb.append(", showPaths = ");
        sb.append(m8942getShowPathsimpl(i));
        sb.append(", showKeyPositions = ");
        sb.append(m8941getShowKeyPositionsimpl(i));
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/DebugFlags$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/DebugFlags;", "All", com.visa.cbp.getEncExpo.warmup, "getAll-bfy_xzQ", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-bfy_xzQ"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-bfy_xzQ, reason: not valid java name */
        public final int m8947getNonebfy_xzQ() {
            return androidx.constraintlayout.compose.DebugFlags.None;
        }

        /* renamed from: getAll-bfy_xzQ, reason: not valid java name */
        public final int m8946getAllbfy_xzQ() {
            return androidx.constraintlayout.compose.DebugFlags.All;
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
        return m8943hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object obj) {
        return m8938equalsimpl(this.Camera2StreamConfigurationMap, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8943hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8938equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.constraintlayout.compose.DebugFlags) && i == ((androidx.constraintlayout.compose.DebugFlags) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.constraintlayout.compose.DebugFlags m8934boximpl(int i) {
        return new androidx.constraintlayout.compose.DebugFlags(i);
    }
}

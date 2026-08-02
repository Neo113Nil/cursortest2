package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation;", "", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(J)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "flag", "J", "getFlag", "()J", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class LayoutCacheOperation {
    private final long flag;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.modifiers.LayoutCacheOperation.Companion INSTANCE = new androidx.compose.foundation.text.modifiers.LayoutCacheOperation.Companion(null);
    private static final long MarkDirtyStyle = getHighResolutionOutputSizeshNQ4ISI(0);
    private static final long MarkDirtyDensity = getHighResolutionOutputSizeshNQ4ISI(1);
    private static final long MarkDirtyNode = getHighResolutionOutputSizeshNQ4ISI(2);
    private static final long LayoutWithConstraints = getHighResolutionOutputSizeshNQ4ISI(3);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2333equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(long j) {
        return j;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation;", "MarkDirtyStyle", "J", "getMarkDirtyStyle-DEKiAbY", "()J", "MarkDirtyDensity", "getMarkDirtyDensity-DEKiAbY", "MarkDirtyNode", "getMarkDirtyNode-DEKiAbY", "LayoutWithConstraints", "getLayoutWithConstraints-DEKiAbY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getMarkDirtyStyle-DEKiAbY, reason: not valid java name */
        public final long m2340getMarkDirtyStyleDEKiAbY() {
            return androidx.compose.foundation.text.modifiers.LayoutCacheOperation.MarkDirtyStyle;
        }

        /* renamed from: getMarkDirtyDensity-DEKiAbY, reason: not valid java name */
        public final long m2338getMarkDirtyDensityDEKiAbY() {
            return androidx.compose.foundation.text.modifiers.LayoutCacheOperation.MarkDirtyDensity;
        }

        /* renamed from: getMarkDirtyNode-DEKiAbY, reason: not valid java name */
        public final long m2339getMarkDirtyNodeDEKiAbY() {
            return androidx.compose.foundation.text.modifiers.LayoutCacheOperation.MarkDirtyNode;
        }

        /* renamed from: getLayoutWithConstraints-DEKiAbY, reason: not valid java name */
        public final long m2337getLayoutWithConstraintsDEKiAbY() {
            return androidx.compose.foundation.text.modifiers.LayoutCacheOperation.LayoutWithConstraints;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ LayoutCacheOperation(long j) {
        this.flag = j;
    }

    public final long getFlag() {
        return this.flag;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2336unboximpl() {
        return this.flag;
    }

    public final java.lang.String toString() {
        return m2335toStringimpl(this.flag);
    }

    public final int hashCode() {
        return m2334hashCodeimpl(this.flag);
    }

    public final boolean equals(java.lang.Object other) {
        return m2332equalsimpl(this.flag, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2335toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutCacheOperation(flag=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2334hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2332equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.modifiers.LayoutCacheOperation) && j == ((androidx.compose.foundation.text.modifiers.LayoutCacheOperation) obj).m2336unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.modifiers.LayoutCacheOperation m2331boximpl(long j) {
        return new androidx.compose.foundation.text.modifiers.LayoutCacheOperation(j);
    }
}

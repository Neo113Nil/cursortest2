package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "", com.daon.sdk.face.license.License.FEATURE_MASK, "constructor-impl", "(I)I", "reader", "withReadIn-3QSx2Dw", "(II)I", "withReadIn", "", "isReadIn-h_f27i8", "(II)Z", "isReadIn", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMask", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class ReaderKind {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.snapshots.ReaderKind.Companion INSTANCE = new androidx.compose.runtime.snapshots.ReaderKind.Companion(null);
    private final int mask;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5475constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5478equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m5480isReadInh_f27i8(int i, int i2) {
        return (i & i2) != 0;
    }

    private /* synthetic */ ReaderKind(int i) {
        this.mask = i;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m5476constructorimpl$default(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m5475constructorimpl(i);
    }

    public final int getMask() {
        return this.mask;
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m5482withReadIn3QSx2Dw(int i, int i2) {
        return m5475constructorimpl(i | i2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0007\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "Composition", "getSnapshotStateObserver-6f8NoZ8", "SnapshotStateObserver", "getSnapshotFlow-6f8NoZ8", "SnapshotFlow"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m5484getComposition6f8NoZ8() {
            return androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(1);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m5486getSnapshotStateObserver6f8NoZ8() {
            return androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(2);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m5485getSnapshotFlow6f8NoZ8() {
            return androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(4);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5483unboximpl() {
        return this.mask;
    }

    public final java.lang.String toString() {
        return m5481toStringimpl(this.mask);
    }

    public final int hashCode() {
        return m5479hashCodeimpl(this.mask);
    }

    public final boolean equals(java.lang.Object other) {
        return m5477equalsimpl(this.mask, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5481toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReaderKind(mask=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5479hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5477equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.snapshots.ReaderKind) && i == ((androidx.compose.runtime.snapshots.ReaderKind) obj).m5483unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.snapshots.ReaderKind m5474boximpl(int i) {
        return new androidx.compose.runtime.snapshots.ReaderKind(i);
    }
}

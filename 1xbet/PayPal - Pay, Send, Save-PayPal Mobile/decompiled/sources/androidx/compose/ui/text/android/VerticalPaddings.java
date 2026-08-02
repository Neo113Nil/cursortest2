package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0019\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoSizes", "getTopPadding-impl", "topPadding", "getBottomPadding-impl", "bottomPadding"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class VerticalPaddings {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8088constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8090equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m8091getBottomPaddingimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m8092getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ VerticalPaddings(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m8094toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m8093hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object obj) {
        return m8089equalsimpl(this.getHighSpeedVideoSizes, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8094toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerticalPaddings(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8093hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8089equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.android.VerticalPaddings) && j == ((androidx.compose.ui.text.android.VerticalPaddings) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.android.VerticalPaddings m8087boximpl(long j) {
        return new androidx.compose.ui.text.android.VerticalPaddings(j);
    }
}

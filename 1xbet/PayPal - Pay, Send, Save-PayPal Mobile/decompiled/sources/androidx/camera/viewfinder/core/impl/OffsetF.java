package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/viewfinder/core/impl/OffsetF;", "", "", "packedOffsets", "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "", "getX-impl", "(J)F", "x", "getY-impl", "y"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class OffsetF {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1050constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1052equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ OffsetF(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m1053getXimpl(long j) {
        float intBitsToFloat;
        intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        return intBitsToFloat;
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m1054getYimpl(long j) {
        float intBitsToFloat;
        intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m1056toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m1055hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object obj) {
        return m1051equalsimpl(this.getHighSpeedVideoFpsRangesFor, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1056toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OffsetF(packedOffsets=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1055hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1051equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.camera.viewfinder.core.impl.OffsetF) && j == ((androidx.camera.viewfinder.core.impl.OffsetF) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.viewfinder.core.impl.OffsetF m1049boximpl(long j) {
        return new androidx.camera.viewfinder.core.impl.OffsetF(j);
    }
}

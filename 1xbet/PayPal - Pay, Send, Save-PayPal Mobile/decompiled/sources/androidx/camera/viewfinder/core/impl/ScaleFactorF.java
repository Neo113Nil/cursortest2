package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/viewfinder/core/impl/ScaleFactorF;", "", "", "packedScales", "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Camera2StreamConfigurationMap", "J", "", "getScaleX-impl", "(J)F", "scaleX", "getScaleY-impl", "scaleY"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ScaleFactorF {
    private final long Camera2StreamConfigurationMap;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1059constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1061equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ ScaleFactorF(long j) {
        this.Camera2StreamConfigurationMap = j;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m1062getScaleXimpl(long j) {
        float intBitsToFloat;
        intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        return intBitsToFloat;
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m1063getScaleYimpl(long j) {
        float intBitsToFloat;
        intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return m1065toStringimpl(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return m1064hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object obj) {
        return m1060equalsimpl(this.Camera2StreamConfigurationMap, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1065toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScaleFactorF(packedScales=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1064hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1060equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.camera.viewfinder.core.impl.ScaleFactorF) && j == ((androidx.camera.viewfinder.core.impl.ScaleFactorF) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.viewfinder.core.impl.ScaleFactorF m1058boximpl(long j) {
        return new androidx.camera.viewfinder.core.impl.ScaleFactorF(j);
    }
}

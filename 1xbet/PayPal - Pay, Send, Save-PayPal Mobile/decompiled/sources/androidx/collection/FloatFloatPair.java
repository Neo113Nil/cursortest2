package androidx.collection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0012\u0010\u0003\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0012\u0010\u0004\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000b\u0088\u0001\b\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/collection/FloatFloatPair;", "", "", "first", "second", "constructor-impl", "(FF)J", "", "packedValue", "(J)J", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getFirst-impl", "J", "getSecond-impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FloatFloatPair {
    public final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1071constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1073equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ FloatFloatPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1077toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String toString() {
        return m1077toStringimpl(this.packedValue);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1070constructorimpl(float f, float f2) {
        return m1071constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m1074getFirstimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m1075getSecondimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m1068component1impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m1069component2impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m1076hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object obj) {
        return m1072equalsimpl(this.packedValue, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1076hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1072equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.collection.FloatFloatPair) && j == ((androidx.collection.FloatFloatPair) obj).getPackedValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.collection.FloatFloatPair m1067boximpl(long j) {
        return new androidx.collection.FloatFloatPair(j);
    }
}

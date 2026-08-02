package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmConstantValue {
    private final java.lang.Object getHighSpeedVideoSizes;

    public KmConstantValue(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KmConstantValue(value=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Object obj = this.getHighSpeedVideoSizes;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmConstantValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.km.KmConstantValue) obj).getHighSpeedVideoSizes);
    }
}

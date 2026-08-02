package kotlin.reflect.jvm.internal.impl.km.jvm;

/* loaded from: classes17.dex */
public final class JvmMethodSignature extends kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMethodSignature(java.lang.String str, java.lang.String str2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = str2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public final java.lang.String getDescriptor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public final java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getName());
        sb.append(getDescriptor());
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature = (kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, jvmMethodSignature.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, jvmMethodSignature.Camera2StreamConfigurationMap);
    }
}

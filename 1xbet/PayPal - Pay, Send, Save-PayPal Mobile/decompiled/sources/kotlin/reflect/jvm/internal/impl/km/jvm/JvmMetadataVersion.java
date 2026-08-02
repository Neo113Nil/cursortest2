package kotlin.reflect.jvm.internal.impl.km.jvm;

/* loaded from: classes5.dex */
public final class JvmMetadataVersion implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion> {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion LATEST_STABLE_SUPPORTED = new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE.toArray());
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion HIGHEST_ALLOWED_TO_WRITE = new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE_NEXT.toArray());

    public JvmMetadataVersion(int i, int i2, int i3) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Major version should be not less than 0".toString());
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Minor version should be not less than 0".toString());
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("Patch version should be not less than 0".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMetadataVersion, "");
        int compare = kotlin.jvm.internal.Intrinsics.compare(this.Camera2StreamConfigurationMap, jvmMetadataVersion.Camera2StreamConfigurationMap);
        if (compare != 0) {
            return compare;
        }
        int compare2 = kotlin.jvm.internal.Intrinsics.compare(this.getHighSpeedVideoFpsRanges, jvmMetadataVersion.getHighSpeedVideoFpsRanges);
        return compare2 != 0 ? compare2 : kotlin.jvm.internal.Intrinsics.compare(this.getHighSpeedVideoFpsRangesFor, jvmMetadataVersion.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.Camera2StreamConfigurationMap * 31) + this.getHighSpeedVideoFpsRanges) * 31) + this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion = (kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion) obj;
        return this.Camera2StreamConfigurationMap == jvmMetadataVersion.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == jvmMetadataVersion.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == jvmMetadataVersion.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

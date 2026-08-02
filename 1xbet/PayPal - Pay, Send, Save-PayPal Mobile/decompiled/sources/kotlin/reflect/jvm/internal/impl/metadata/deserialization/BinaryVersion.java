package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public abstract class BinaryVersion {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion.Companion(null);
    private final int Camera2StreamConfigurationMap;
    private final int[] getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final java.util.List<java.lang.Integer> getHighSpeedVideoSizes;

    public BinaryVersion(int... iArr) {
        java.util.List<java.lang.Integer> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        java.lang.Integer orNull = kotlin.collections.ArraysKt.getOrNull(iArr, 0);
        this.Camera2StreamConfigurationMap = orNull != null ? orNull.intValue() : -1;
        java.lang.Integer orNull2 = kotlin.collections.ArraysKt.getOrNull(iArr, 1);
        this.getHighSpeedVideoFpsRangesFor = orNull2 != null ? orNull2.intValue() : -1;
        java.lang.Integer orNull3 = kotlin.collections.ArraysKt.getOrNull(iArr, 2);
        this.getHighSpeedVideoFpsRanges = orNull3 != null ? orNull3.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length > 1024) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length ");
                sb.append(iArr.length);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            emptyList = kotlin.collections.CollectionsKt.toList(kotlin.collections.ArraysKt.asList(iArr).subList(3, iArr.length));
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        this.getHighSpeedVideoSizes = emptyList;
    }

    public final int getMajor() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getMinor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int[] toArray() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected final boolean isCompatibleTo(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        int i = this.Camera2StreamConfigurationMap;
        return i == 0 ? binaryVersion.Camera2StreamConfigurationMap == 0 && this.getHighSpeedVideoFpsRangesFor == binaryVersion.getHighSpeedVideoFpsRangesFor : i == binaryVersion.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor <= binaryVersion.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isAtLeast(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        return isAtLeast(binaryVersion.Camera2StreamConfigurationMap, binaryVersion.getHighSpeedVideoFpsRangesFor, binaryVersion.getHighSpeedVideoFpsRanges);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.Camera2StreamConfigurationMap;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.getHighSpeedVideoFpsRanges >= i3;
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.Camera2StreamConfigurationMap;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.getHighSpeedVideoFpsRanges <= i3;
    }

    public java.lang.String toString() {
        int[] array = toArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : array) {
            if (i == -1) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        java.util.ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? "unknown" : kotlin.collections.CollectionsKt.joinToString$default(arrayList2, ".", null, null, 0, null, null, 62, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion) obj;
        return this.Camera2StreamConfigurationMap == binaryVersion.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == binaryVersion.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == binaryVersion.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, binaryVersion.getHighSpeedVideoSizes);
    }

    public int hashCode() {
        int i = this.Camera2StreamConfigurationMap;
        int i2 = i + (i * 31) + this.getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + (i2 * 31) + this.getHighSpeedVideoFpsRanges;
        return i3 + (i3 * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

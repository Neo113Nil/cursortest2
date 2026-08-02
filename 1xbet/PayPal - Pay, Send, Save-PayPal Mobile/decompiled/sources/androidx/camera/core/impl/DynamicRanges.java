package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"Landroidx/camera/core/impl/DynamicRanges;", "", "<init>", "()V", "Landroidx/camera/core/DynamicRange;", "dynamicRangeToTest", "", "fullySpecifiedDynamicRanges", "", "canResolve", "(Landroidx/camera/core/DynamicRange;Ljava/util/Set;)Z", "dynamicRangesToTest", "findAllPossibleMatches", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/DynamicRange;)Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRanges {
    public static final androidx.camera.core.impl.DynamicRanges INSTANCE = new androidx.camera.core.impl.DynamicRanges();

    private DynamicRanges() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canResolve(androidx.camera.core.DynamicRange dynamicRangeToTest, java.util.Set<androidx.camera.core.DynamicRange> fullySpecifiedDynamicRanges) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRangeToTest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "");
        if (dynamicRangeToTest.isFullySpecified()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        java.util.Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) obj;
            if (getHighResolutionOutputSizeshNQ4ISI(dynamicRangeToTest, dynamicRange) && getHighSpeedVideoFpsRanges(dynamicRangeToTest, dynamicRange)) {
                break;
            }
        }
        return obj != null;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<androidx.camera.core.DynamicRange> findAllPossibleMatches(java.util.Set<androidx.camera.core.DynamicRange> dynamicRangesToTest, java.util.Set<androidx.camera.core.DynamicRange> fullySpecifiedDynamicRanges) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRangesToTest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "");
        if (dynamicRangesToTest.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        for (androidx.camera.core.DynamicRange dynamicRange : dynamicRangesToTest) {
            if (dynamicRange.isFullySpecified()) {
                if (fullySpecifiedDynamicRanges.contains(dynamicRange)) {
                    createSetBuilder.add(dynamicRange);
                }
            } else {
                for (androidx.camera.core.DynamicRange dynamicRange2 : fullySpecifiedDynamicRanges) {
                    if (getHighResolutionOutputSizeshNQ4ISI(dynamicRange, dynamicRange2) && getHighSpeedVideoFpsRanges(dynamicRange, dynamicRange2)) {
                        createSetBuilder.add(dynamicRange2);
                    }
                }
            }
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.DynamicRange p0, androidx.camera.core.DynamicRange p1) {
        androidx.core.util.Preconditions.checkState(p1.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return p0.getBitDepth() == 0 || p0.getBitDepth() == p1.getBitDepth();
    }

    private static boolean getHighSpeedVideoFpsRanges(androidx.camera.core.DynamicRange p0, androidx.camera.core.DynamicRange p1) {
        androidx.core.util.Preconditions.checkState(p1.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = p0.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = p1.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }
}

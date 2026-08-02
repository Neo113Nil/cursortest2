package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR#\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;", "Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;)V", "Landroid/util/Range;", "", "getTargetAeFpsRange", "()Landroid/util/Range;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AeFpsRangeLegacyQuirk implements androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk.Companion(null);
    private final kotlin.Lazy getHighSpeedVideoSizes;

    public AeFpsRangeLegacyQuirk(final androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk.$r8$lambda$M08z1plyKIceWjdadH5XAqm54nQ(androidx.camera.camera2.pipe.CameraMetadata.this, this);
            }
        });
    }

    private final android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRangesFor() {
        return (android.util.Range) this.getHighSpeedVideoSizes.getValue();
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public final android.util.Range<java.lang.Integer> getTargetAeFpsRange() {
        android.util.Range<java.lang.Integer> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor;
        }
        android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range, "");
        return range;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            return androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraMetadata);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ android.util.Range $r8$lambda$M08z1plyKIceWjdadH5XAqm54nQ(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        android.util.Range[] rangeArr = (android.util.Range[]) cameraMetadata.get(key);
        android.util.Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (android.util.Range range2 : rangeArr) {
                java.lang.Integer num = (java.lang.Integer) range2.getUpper();
                java.lang.Integer num2 = (java.lang.Integer) range2.getLower();
                if (((java.lang.Number) range2.getUpper()).intValue() >= 1000) {
                    num = java.lang.Integer.valueOf(((java.lang.Number) range2.getUpper()).intValue() / 1000);
                }
                if (((java.lang.Number) range2.getLower()).intValue() >= 1000) {
                    num2 = java.lang.Integer.valueOf(((java.lang.Number) range2.getLower()).intValue() / 1000);
                }
                android.util.Range range3 = new android.util.Range(num2, num);
                java.lang.Integer num3 = (java.lang.Integer) range3.getUpper();
                if (num3 != null && num3.intValue() == 30 && (range == null || ((java.lang.Number) range3.getLower()).intValue() < ((java.lang.Number) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        return range;
    }
}

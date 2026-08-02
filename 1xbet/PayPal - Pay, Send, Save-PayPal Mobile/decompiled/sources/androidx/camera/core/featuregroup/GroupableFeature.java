package androidx.camera.core.featuregroup;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/core/featuregroup/GroupableFeature;", "", "<init>", "()V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "", "isSupportedIndividually", "(Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/SessionConfig;)Z", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureTypeInternal", "", "featureType$delegate", "Lkotlin/Lazy;", "getFeatureType", "()I", "featureType", "Companion", "FeatureType"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GroupableFeature {
    public static final int FEATURE_TYPE_DYNAMIC_RANGE = 0;
    public static final int FEATURE_TYPE_FPS_RANGE = 1;
    public static final int FEATURE_TYPE_IMAGE_FORMAT = 3;
    public static final int FEATURE_TYPE_RECORDING_QUALITY = 4;
    public static final int FEATURE_TYPE_VIDEO_STABILIZATION = 2;
    public static final androidx.camera.core.featuregroup.GroupableFeature FPS_60;
    public static final androidx.camera.core.featuregroup.GroupableFeature HDR_HLG10;
    public static final androidx.camera.core.featuregroup.GroupableFeature IMAGE_ULTRA_HDR;
    public static final androidx.camera.core.featuregroup.GroupableFeature PREVIEW_STABILIZATION;

    /* renamed from: featureType$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy featureType = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.core.featuregroup.GroupableFeature$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(androidx.camera.core.featuregroup.GroupableFeature.$r8$lambda$5wZzs3lk5429yTODBHOaNC_0Qs8(androidx.camera.core.featuregroup.GroupableFeature.this));
        }
    });

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/core/featuregroup/GroupableFeature$FeatureType;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface FeatureType {
    }

    public abstract androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getFeatureTypeInternal();

    public final int getFeatureType() {
        return ((java.lang.Number) this.featureType.getValue()).intValue();
    }

    static {
        androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.HLG_10_BIT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange, "");
        HDR_HLG10 = new androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature(dynamicRange);
        FPS_60 = new androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature(60, 60);
        PREVIEW_STABILIZATION = new androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature(androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW);
        IMAGE_ULTRA_HDR = new androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature(1);
    }

    public static /* synthetic */ int $r8$lambda$5wZzs3lk5429yTODBHOaNC_0Qs8(androidx.camera.core.featuregroup.GroupableFeature groupableFeature) {
        int i = androidx.camera.core.featuregroup.GroupableFeature.WhenMappings.$EnumSwitchMapping$0[groupableFeature.getFeatureTypeInternal().ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.values().length];
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean isSupportedIndividually(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return true;
    }
}

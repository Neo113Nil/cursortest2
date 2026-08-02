package androidx.camera.core.featuregroup.impl.feature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "", "<init>", "(Ljava/lang/String;I)V", "DYNAMIC_RANGE", "FPS_RANGE", "VIDEO_STABILIZATION", "IMAGE_FORMAT", "RECORDING_QUALITY"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureTypeInternal {
    private static final /* synthetic */ androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal[] Camera2StreamConfigurationMap;
    public static final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal DYNAMIC_RANGE;
    public static final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal FPS_RANGE;
    public static final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal IMAGE_FORMAT;
    public static final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal RECORDING_QUALITY;
    public static final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal VIDEO_STABILIZATION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private FeatureTypeInternal(java.lang.String str, int i) {
    }

    static {
        androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal = new androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal("DYNAMIC_RANGE", 0);
        DYNAMIC_RANGE = featureTypeInternal;
        androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal2 = new androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal("FPS_RANGE", 1);
        FPS_RANGE = featureTypeInternal2;
        androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal3 = new androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal("VIDEO_STABILIZATION", 2);
        VIDEO_STABILIZATION = featureTypeInternal3;
        androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal4 = new androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal("IMAGE_FORMAT", 3);
        IMAGE_FORMAT = featureTypeInternal4;
        androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal5 = new androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal("RECORDING_QUALITY", 4);
        RECORDING_QUALITY = featureTypeInternal5;
        androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal[] featureTypeInternalArr = {featureTypeInternal, featureTypeInternal2, featureTypeInternal3, featureTypeInternal4, featureTypeInternal5};
        Camera2StreamConfigurationMap = featureTypeInternalArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(featureTypeInternalArr);
    }

    public static androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal[] values() {
        return (androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal valueOf(java.lang.String str) {
        return (androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal) java.lang.Enum.valueOf(androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

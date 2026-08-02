package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010\u001e\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/camera/video/MimeMatchedVideoCapabilities;", "Landroidx/camera/video/VideoCapabilities;", "", "mime", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "<init>", "(Ljava/lang/String;Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)V", "", "Landroidx/camera/core/DynamicRange;", "getSupportedDynamicRanges", "()Ljava/util/Set;", "dynamicRange", "", "Landroidx/camera/video/Quality;", "getSupportedQualities", "(Landroidx/camera/core/DynamicRange;)Ljava/util/List;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "isQualitySupported", "(Landroidx/camera/video/Quality;Landroidx/camera/core/DynamicRange;)Z", "Landroid/util/Size;", "getResolution", "(Landroidx/camera/video/Quality;Landroidx/camera/core/DynamicRange;)Landroid/util/Size;", "isStabilizationSupported", "()Z", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/CameraInfoInternal;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/video/MimeMatchedVideoCapabilities$ValidatedData;", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "()Landroidx/camera/video/MimeMatchedVideoCapabilities$ValidatedData;", "ValidatedData"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MimeMatchedVideoCapabilities implements androidx.camera.video.VideoCapabilities {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public MimeMatchedVideoCapabilities(java.lang.String str, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finder, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = cameraInfoInternal;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.MimeMatchedVideoCapabilities$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.video.MimeMatchedVideoCapabilities.$r8$lambda$n5XMUnTC0mYqj_QZDJcpYORFhXc(androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder.this, this);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a"}, d2 = {"Landroidx/camera/video/MimeMatchedVideoCapabilities$ValidatedData;", "", "", "Landroidx/camera/core/DynamicRange;", "p0", "", "Landroidx/camera/video/Quality;", "Landroid/util/Size;", "p1", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "()Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "()Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class ValidatedData {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.Map<androidx.camera.video.Quality, android.util.Size> getHighSpeedVideoSizes;
        private final java.util.Set<androidx.camera.core.DynamicRange> getHighSpeedVideoFpsRangesFor;

        public ValidatedData(java.util.Set<androidx.camera.core.DynamicRange> set, java.util.Map<androidx.camera.video.Quality, android.util.Size> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.getHighSpeedVideoFpsRangesFor = set;
            this.getHighSpeedVideoSizes = map;
        }

        public /* synthetic */ ValidatedData(java.util.Set set, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Set<androidx.camera.core.DynamicRange> Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.util.Map<androidx.camera.video.Quality, android.util.Size> getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidatedData(getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData)) {
                return false;
            }
            androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData validatedData = (androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, validatedData.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, validatedData.getHighSpeedVideoSizes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ValidatedData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    private final androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData Camera2StreamConfigurationMap() {
        return (androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return Camera2StreamConfigurationMap().Camera2StreamConfigurationMap();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final java.util.List<androidx.camera.video.Quality> getSupportedQualities(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        if (androidx.camera.core.impl.DynamicRanges.canResolve(dynamicRange, Camera2StreamConfigurationMap().Camera2StreamConfigurationMap())) {
            return kotlin.collections.CollectionsKt.toList(Camera2StreamConfigurationMap().getHighSpeedVideoFpsRangesFor().keySet());
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isQualitySupported(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        return androidx.camera.core.impl.DynamicRanges.canResolve(dynamicRange, Camera2StreamConfigurationMap().Camera2StreamConfigurationMap()) && Camera2StreamConfigurationMap().getHighSpeedVideoFpsRangesFor().containsKey(quality);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final android.util.Size getResolution(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        if (androidx.camera.core.impl.DynamicRanges.canResolve(dynamicRange, Camera2StreamConfigurationMap().Camera2StreamConfigurationMap())) {
            return Camera2StreamConfigurationMap().getHighSpeedVideoFpsRangesFor().get(quality);
        }
        return null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isStabilizationSupported() {
        return this.getHighSpeedVideoFpsRanges.isVideoStabilizationSupported();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MimeMatchedVideoCapabilities(mime=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", cameraInfo=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData $r8$lambda$n5XMUnTC0mYqj_QZDJcpYORFhXc(androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder, androidx.camera.video.MimeMatchedVideoCapabilities mimeMatchedVideoCapabilities) {
        java.lang.Object obj;
        androidx.camera.video.internal.encoder.VideoEncoderInfo find = finder.find(mimeMatchedVideoCapabilities.getHighResolutionOutputSizeshNQ4ISI);
        int i = 3;
        java.util.Set set = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        java.lang.Object[] objArr8 = 0;
        java.lang.Object[] objArr9 = 0;
        java.lang.Object[] objArr10 = 0;
        java.lang.Object[] objArr11 = 0;
        if (find == null) {
            return new androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData(set, objArr11 == true ? 1 : 0, i, objArr10 == true ? 1 : 0);
        }
        java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = mimeMatchedVideoCapabilities.getHighSpeedVideoFpsRanges.getSupportedDynamicRanges();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedDynamicRanges, "");
        if (supportedDynamicRanges.isEmpty()) {
            return new androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0);
        }
        java.util.Set intersect = kotlin.collections.CollectionsKt.intersect(supportedDynamicRanges, androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.getDynamicRangesForMime(mimeMatchedVideoCapabilities.getHighResolutionOutputSizeshNQ4ISI));
        if (intersect.isEmpty()) {
            return new androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i, objArr4 == true ? 1 : 0);
        }
        java.util.List<android.util.Size> supportedResolutions = mimeMatchedVideoCapabilities.getHighSpeedVideoFpsRanges.getSupportedResolutions(34);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedResolutions, "");
        java.util.HashSet hashSet = kotlin.collections.CollectionsKt.toHashSet(supportedResolutions);
        java.util.List<androidx.camera.video.Quality> sortedQualities = androidx.camera.video.Quality.getSortedQualities();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sortedQualities, "");
        java.util.ArrayList<androidx.camera.video.Quality.ConstantQuality> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : sortedQualities) {
            if (obj2 instanceof androidx.camera.video.Quality.ConstantQuality) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (androidx.camera.video.Quality.ConstantQuality constantQuality : arrayList) {
            java.util.List<android.util.Size> typicalSizes = constantQuality.getTypicalSizes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typicalSizes, "");
            java.util.Iterator<T> it = typicalSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                android.util.Size size = (android.util.Size) obj;
                if (hashSet.contains(size) && find.isSizeSupported(size.getWidth(), size.getHeight())) {
                    break;
                }
            }
            android.util.Size size2 = (android.util.Size) obj;
            kotlin.Pair pair = size2 != null ? kotlin.TuplesKt.to(constantQuality, size2) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        java.util.Map map = kotlin.collections.MapsKt.toMap(arrayList2);
        if (map.isEmpty()) {
            return new androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        return new androidx.camera.video.MimeMatchedVideoCapabilities.ValidatedData(intersect, map);
    }
}

package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001a*\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2ColorSpaceProfiles;", "Landroidx/camera/camera2/pipe/CameraColorSpaceProfiles;", "Landroid/hardware/camera2/params/ColorSpaceProfiles;", "colorSpaceProfiles", "<init>", "(Landroid/hardware/camera2/params/ColorSpaceProfiles;)V", "Landroidx/camera/camera2/pipe/StreamFormat;", "imageFormat", "", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "getSupportedColorSpaces-hNQ4ISI", "(I)Ljava/util/Set;", "getSupportedColorSpaces", "cameraColorSpace", "getSupportedImageFormatsForColorSpace-jRxjvBE", "(Ljava/lang/String;)Ljava/util/Set;", "getSupportedImageFormatsForColorSpace", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getSupportedDynamicRangeProfiles-6Yu6yh8", "(Ljava/lang/String;I)Ljava/util/Set;", "getSupportedDynamicRangeProfiles", "dynamicRangeProfile", "getSupportedColorSpacesForDynamicRange-sNWL0t8", "(IJ)Ljava/util/Set;", "getSupportedColorSpacesForDynamicRange", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/hardware/camera2/params/ColorSpaceProfiles;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ColorSpaceProfiles implements androidx.camera.camera2.pipe.CameraColorSpaceProfiles {
    private final android.hardware.camera2.params.ColorSpaceProfiles getHighResolutionOutputSizeshNQ4ISI;

    public Camera2ColorSpaceProfiles(android.hardware.camera2.params.ColorSpaceProfiles colorSpaceProfiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorSpaceProfiles, "");
        this.getHighResolutionOutputSizeshNQ4ISI = colorSpaceProfiles;
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpaces-hNQ4ISI */
    public final java.util.Set<androidx.camera.camera2.pipe.CameraColorSpace> mo268getSupportedColorSpaceshNQ4ISI(int imageFormat) {
        java.util.Set<android.graphics.ColorSpace.Named> supportedColorSpaces = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedColorSpaces(imageFormat);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedColorSpaces, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.graphics.ColorSpace.Named named : supportedColorSpaces) {
            androidx.camera.camera2.pipe.CameraColorSpace.Companion companion = androidx.camera.camera2.pipe.CameraColorSpace.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(named);
            java.lang.String m248fromColorSpaceNamed5GKeQC8 = companion.m248fromColorSpaceNamed5GKeQC8(named);
            if (m248fromColorSpaceNamed5GKeQC8 == null) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            }
            androidx.camera.camera2.pipe.CameraColorSpace m240boximpl = m248fromColorSpaceNamed5GKeQC8 != null ? androidx.camera.camera2.pipe.CameraColorSpace.m240boximpl(m248fromColorSpaceNamed5GKeQC8) : null;
            if (m240boximpl != null) {
                arrayList.add(m240boximpl);
            }
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedImageFormatsForColorSpace-jRxjvBE */
    public final java.util.Set<androidx.camera.camera2.pipe.StreamFormat> mo271getSupportedImageFormatsForColorSpacejRxjvBE(java.lang.String cameraColorSpace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraColorSpace, "");
        android.graphics.ColorSpace.Named m245toColorSpaceNamedimpl = androidx.camera.camera2.pipe.CameraColorSpace.m245toColorSpaceNamedimpl(cameraColorSpace);
        if (m245toColorSpaceNamedimpl != null) {
            java.util.Set<java.lang.Integer> supportedImageFormatsForColorSpace = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedImageFormatsForColorSpace(m245toColorSpaceNamedimpl);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedImageFormatsForColorSpace, "");
            java.util.Set<java.lang.Integer> set = supportedImageFormatsForColorSpace;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            for (java.lang.Integer num : set) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                arrayList.add(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(num.intValue())));
            }
            return kotlin.collections.CollectionsKt.toSet(arrayList);
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedDynamicRangeProfiles-6Yu6yh8 */
    public final java.util.Set<androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile> mo270getSupportedDynamicRangeProfiles6Yu6yh8(java.lang.String cameraColorSpace, int imageFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraColorSpace, "");
        android.graphics.ColorSpace.Named m245toColorSpaceNamedimpl = androidx.camera.camera2.pipe.CameraColorSpace.m245toColorSpaceNamedimpl(cameraColorSpace);
        if (m245toColorSpaceNamedimpl != null) {
            java.util.Set<java.lang.Long> supportedDynamicRangeProfiles = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedDynamicRangeProfiles(m245toColorSpaceNamedimpl, imageFormat);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedDynamicRangeProfiles, "");
            java.util.Set<java.lang.Long> set = supportedDynamicRangeProfiles;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            for (java.lang.Long l : set) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(l);
                arrayList.add(androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m576boximpl(androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m577constructorimpl(l.longValue())));
            }
            return kotlin.collections.CollectionsKt.toSet(arrayList);
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpacesForDynamicRange-sNWL0t8 */
    public final java.util.Set<androidx.camera.camera2.pipe.CameraColorSpace> mo269getSupportedColorSpacesForDynamicRangesNWL0t8(int imageFormat, long dynamicRangeProfile) {
        java.util.Set<android.graphics.ColorSpace.Named> supportedColorSpacesForDynamicRange = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedColorSpacesForDynamicRange(imageFormat, dynamicRangeProfile);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedColorSpacesForDynamicRange, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.graphics.ColorSpace.Named named : supportedColorSpacesForDynamicRange) {
            androidx.camera.camera2.pipe.CameraColorSpace.Companion companion = androidx.camera.camera2.pipe.CameraColorSpace.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(named);
            java.lang.String m248fromColorSpaceNamed5GKeQC8 = companion.m248fromColorSpaceNamed5GKeQC8(named);
            if (m248fromColorSpaceNamed5GKeQC8 == null) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            }
            androidx.camera.camera2.pipe.CameraColorSpace m240boximpl = m248fromColorSpaceNamed5GKeQC8 != null ? androidx.camera.camera2.pipe.CameraColorSpace.m240boximpl(m248fromColorSpaceNamed5GKeQC8) : null;
            if (m240boximpl != null) {
                arrayList.add(m240boximpl);
            }
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.params.ColorSpaceProfiles.class))) {
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (T) obj;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.compat.Camera2ColorSpaceProfiles.class))) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return (T) this;
    }
}

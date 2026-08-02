package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012$\b\u0002\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/camera2/compat/workaround/EncoderProfilesProviderFallback;", "", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "Landroidx/camera/core/impl/Quirks;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "providerFactory", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "cameraId", "quirks", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "resolveProvider", "(Ljava/lang/String;Landroidx/camera/core/impl/Quirks;Landroidx/camera/camera2/pipe/CameraDevices;)Landroidx/camera/core/impl/EncoderProfilesProvider;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/camera/camera2/pipe/CameraDevices;)Landroidx/camera/core/impl/EncoderProfilesProvider;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncoderProfilesProviderFallback {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.String, androidx.camera.core.impl.Quirks, androidx.camera.core.impl.EncoderProfilesProvider> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderProfilesProviderFallback(kotlin.jvm.functions.Function2<? super java.lang.String, ? super androidx.camera.core.impl.Quirks, ? extends androidx.camera.core.impl.EncoderProfilesProvider> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    public /* synthetic */ EncoderProfilesProviderFallback(kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function2() { // from class: androidx.camera.camera2.compat.workaround.EncoderProfilesProviderFallback$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.camera.camera2.compat.workaround.EncoderProfilesProviderFallback.$r8$lambda$qWM6G2hgeyB65qGWGV37_VBOjBA((java.lang.String) obj, (androidx.camera.core.impl.Quirks) obj2);
            }
        } : function2);
    }

    public final androidx.camera.core.impl.EncoderProfilesProvider resolveProvider(java.lang.String cameraId, androidx.camera.core.impl.Quirks quirks, androidx.camera.camera2.pipe.CameraDevices cameraDevices) {
        java.util.List emptyList;
        android.util.Size[] outputSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
        androidx.camera.core.impl.EncoderProfilesProvider invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(cameraId, quirks);
        androidx.camera.core.impl.SizeFilteredEncoderProfilesProvider sizeFilteredEncoderProfilesProvider = null;
        androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(cameraDevices, androidx.camera.camera2.pipe.CameraId.m393constructorimpl(cameraId), null, 2, null);
        if (m281awaitCameraMetadataFpsL5FU$default != null) {
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Integer num = (java.lang.Integer) m281awaitCameraMetadataFpsL5FU$default.get(key);
            if (num != null && num.intValue() == 2 && !invoke.hasProfile(1) && (sizeFilteredEncoderProfilesProvider = Camera2StreamConfigurationMap(cameraDevices)) != null) {
                android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) m281awaitCameraMetadataFpsL5FU$default.get(key2);
                if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(34)) == null || (emptyList = kotlin.collections.ArraysKt.toList(outputSizes)) == null) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                sizeFilteredEncoderProfilesProvider = new androidx.camera.core.impl.SizeFilteredEncoderProfilesProvider(sizeFilteredEncoderProfilesProvider, emptyList);
            }
            if (sizeFilteredEncoderProfilesProvider != null) {
                return sizeFilteredEncoderProfilesProvider;
            }
        }
        return invoke;
    }

    private final androidx.camera.core.impl.EncoderProfilesProvider Camera2StreamConfigurationMap(androidx.camera.camera2.pipe.CameraDevices p0) {
        java.lang.Object m23436constructorimpl;
        androidx.camera.core.impl.Quirks quirks;
        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles;
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.camera.camera2.compat.workaround.EncoderProfilesProviderFallback encoderProfilesProviderFallback = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(androidx.camera.camera2.pipe.CameraDevices.m280awaitCameraIdsSeavPBo$default(p0, null, 1, null));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.util.List list = (java.util.List) m23436constructorimpl;
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider = null;
        int i = 0;
        while (it.hasNext()) {
            java.lang.String m399unboximpl = ((androidx.camera.camera2.pipe.CameraId) it.next()).m399unboximpl();
            androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(p0, m399unboximpl, null, 2, null);
            kotlin.jvm.functions.Function2<java.lang.String, androidx.camera.core.impl.Quirks, androidx.camera.core.impl.EncoderProfilesProvider> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (m281awaitCameraMetadataFpsL5FU$default == null) {
                quirks = new androidx.camera.core.impl.Quirks(kotlin.collections.CollectionsKt.emptyList());
            } else {
                android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) m281awaitCameraMetadataFpsL5FU$default.get(key);
                quirks = new androidx.camera.camera2.compat.quirk.CameraQuirks(m281awaitCameraMetadataFpsL5FU$default, new androidx.camera.camera2.compat.StreamConfigurationMapCompat(streamConfigurationMap, new androidx.camera.camera2.compat.workaround.OutputSizesCorrector(m281awaitCameraMetadataFpsL5FU$default, streamConfigurationMap))).getQuirks();
            }
            androidx.camera.core.impl.EncoderProfilesProvider invoke = function2.invoke(m399unboximpl, quirks);
            androidx.camera.core.impl.EncoderProfilesProxy all = invoke.getAll(1);
            int area = (all == null || (videoProfiles = all.getVideoProfiles()) == null || (videoProfileProxy = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) videoProfiles)) == null) ? 0 : androidx.camera.core.internal.utils.SizeUtil.getArea(videoProfileProxy.getWidth(), videoProfileProxy.getHeight());
            if (area > i) {
                encoderProfilesProvider = invoke;
                i = area;
            }
        }
        return encoderProfilesProvider;
    }

    public static /* synthetic */ androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter $r8$lambda$qWM6G2hgeyB65qGWGV37_VBOjBA(java.lang.String str, androidx.camera.core.impl.Quirks quirks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
        return new androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter(str, quirks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderProfilesProviderFallback() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

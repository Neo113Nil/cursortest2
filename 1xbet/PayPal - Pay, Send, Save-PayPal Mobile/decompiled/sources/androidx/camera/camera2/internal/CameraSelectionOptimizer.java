package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/internal/CameraSelectionOptimizer;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraSelectionOptimizer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.internal.CameraSelectionOptimizer.Companion INSTANCE = new androidx.camera.camera2.internal.CameraSelectionOptimizer.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ;\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0011J#\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/internal/CameraSelectionOptimizer$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/CameraFactory;", "cameraFactory", "Landroidx/camera/core/CameraSelector;", "availableCamerasSelector", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "", "", "getSelectedAvailableCameraIds", "(Landroidx/camera/core/impl/CameraFactory;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/internal/StreamSpecsCalculator;)Ljava/util/List;", "Landroidx/camera/camera2/config/CameraAppComponent;", "cameraAppComponent", "cameraIdList", "(Landroidx/camera/camera2/config/CameraAppComponent;Landroidx/camera/core/CameraSelector;Ljava/util/List;Landroidx/camera/core/internal/StreamSpecsCalculator;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/CameraDevices;", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/camera2/pipe/CameraDevices;Ljava/lang/Integer;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<java.lang.String> getSelectedAvailableCameraIds(androidx.camera.core.impl.CameraFactory cameraFactory, androidx.camera.core.CameraSelector availableCamerasSelector, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraFactory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            java.lang.Object cameraManager = cameraFactory.getCameraManager();
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraManager, "");
            androidx.camera.camera2.config.CameraAppComponent cameraAppComponent = (androidx.camera.camera2.config.CameraAppComponent) cameraManager;
            java.util.List m280awaitCameraIdsSeavPBo$default = androidx.camera.camera2.pipe.CameraDevices.m280awaitCameraIdsSeavPBo$default(cameraAppComponent.getCameraDevices(), null, 1, null);
            if (m280awaitCameraIdsSeavPBo$default == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            java.util.List list = m280awaitCameraIdsSeavPBo$default;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.camera.camera2.pipe.CameraId) it.next()).m399unboximpl());
            }
            return getSelectedAvailableCameraIds(cameraAppComponent, availableCamerasSelector, arrayList, streamSpecsCalculator);
        }

        public final java.util.List<java.lang.String> getSelectedAvailableCameraIds(androidx.camera.camera2.config.CameraAppComponent cameraAppComponent, androidx.camera.core.CameraSelector availableCamerasSelector, java.util.List<java.lang.String> cameraIdList, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraAppComponent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIdList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                androidx.camera.camera2.pipe.CameraDevices cameraDevices = cameraAppComponent.getCameraDevices();
                if (availableCamerasSelector == null) {
                    return cameraIdList;
                }
                try {
                    str = getHighResolutionOutputSizeshNQ4ISI(cameraDevices, availableCamerasSelector.getLensFacing());
                } catch (java.lang.IllegalStateException e) {
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    java.lang.IllegalStateException illegalStateException = e;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    str = null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str2 : cameraIdList) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, str)) {
                        androidx.camera.core.impl.CameraInfoInternal camera2StreamConfigurationMap = cameraAppComponent.cameraBuilder().config(new androidx.camera.camera2.config.CameraConfig(androidx.camera.camera2.pipe.CameraId.m393constructorimpl(str2), null)).streamSpecsCalculator(streamSpecsCalculator).build().getCameraInternal().getCamera2StreamConfigurationMap();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(camera2StreamConfigurationMap, "");
                        arrayList2.add(camera2StreamConfigurationMap);
                    }
                }
                java.util.List<androidx.camera.core.CameraInfo> filter = availableCamerasSelector.filter(arrayList2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filter, "");
                for (androidx.camera.core.CameraInfo cameraInfo : filter) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(cameraInfo, "");
                    java.lang.String cameraId = ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getCameraId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
                    arrayList.add(cameraId);
                }
                return arrayList;
            } catch (java.lang.IllegalStateException e2) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                java.lang.IllegalStateException illegalStateException2 = e2;
                if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                throw new androidx.camera.core.InitializationException(illegalStateException2);
            }
        }

        private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.pipe.CameraDevices p0, java.lang.Integer p1) {
            if (p1 == null) {
                return null;
            }
            try {
                if (p1.intValue() == 1) {
                    androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(p0, androidx.camera.camera2.pipe.CameraId.m393constructorimpl("0"), null, 2, null);
                    if (m281awaitCameraMetadataFpsL5FU$default == null) {
                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                    }
                    android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                    java.lang.Integer num = (java.lang.Integer) m281awaitCameraMetadataFpsL5FU$default.get(key);
                    if (num != null && num.intValue() == 1) {
                        return "1";
                    }
                } else if (p1.intValue() == 0) {
                    androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default2 = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(p0, androidx.camera.camera2.pipe.CameraId.m393constructorimpl("1"), null, 2, null);
                    if (m281awaitCameraMetadataFpsL5FU$default2 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                    }
                    android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
                    java.lang.Integer num2 = (java.lang.Integer) m281awaitCameraMetadataFpsL5FU$default2.get(key2);
                    if (num2 != null && num2.intValue() == 0) {
                        return "0";
                    }
                }
            } catch (androidx.camera.camera2.pipe.DoNotDisturbException unused) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

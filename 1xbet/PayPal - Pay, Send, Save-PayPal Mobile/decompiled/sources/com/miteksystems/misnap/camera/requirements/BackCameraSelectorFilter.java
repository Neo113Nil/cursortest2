package com.miteksystems.misnap.camera.requirements;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058@X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010*\u001a\u00020#8@X\u0080\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001a\u00100\u001a\u00020+8@X\u0080D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/miteksystems/misnap/camera/requirements/BackCameraSelectorFilter;", "Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;", "", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "cameraInfoList", "", "filterCameras", "cameraInfo", "", "focusRequired", "forceSupportedSizes", "requireHighResolution", "isCameraSufficient$camera_release", "(Landroidx/camera/camera2/interop/Camera2CameraInfo;ZZZ)Z", "isCameraSufficient", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "getCameraInfo", "Lcom/miteksystems/misnap/camera/a/a;", "cameraCapabilities", "Landroid/util/Size;", "getMaxPreviewSizeMatchingAspectRatio$camera_release", "(Lcom/miteksystems/misnap/camera/a/a;)Landroid/util/Size;", "getMaxPreviewSizeMatchingAspectRatio", "availableSizes", "getMaxHighResolutionImageSize$camera_release", "(Ljava/util/List;)Landroid/util/Size;", "getMaxHighResolutionImageSize", "a", "Z", "requestHighResolution", util.h.xy.cb.b.f1091, "Ljava/util/List;", "getTargetSizes$camera_release", "()Ljava/util/List;", "targetSizes", "Landroid/util/Rational;", "c", "Landroid/util/Rational;", "getTargetAspectRatio$camera_release", "()Landroid/util/Rational;", "getTargetAspectRatio$camera_release$annotations", "()V", "targetAspectRatio", "", "d", com.visa.cbp.getEncExpo.warmup, "getTargetCameraFacingDirection$camera_release", "()I", "targetCameraFacingDirection", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;", "cameraSettings", "<init>", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;)V", "e", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class BackCameraSelectorFilter implements com.miteksystems.misnap.camera.requirements.CameraSelectorFilter {
    private static final com.miteksystems.misnap.camera.requirements.BackCameraSelectorFilter.a getHighSpeedVideoSizes = new com.miteksystems.misnap.camera.requirements.BackCameraSelectorFilter.a(0);
    private final java.util.List<android.util.Size> Camera2StreamConfigurationMap;
    private final android.util.Rational getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getTargetAspectRatio$camera_release$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (getMaxHighResolutionImageSize$camera_release(r0.f()) != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (getMaxHighResolutionImageSize$camera_release(r0.g()) != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d9, code lost:
    
        if (com.miteksystems.misnap.camera.a.b.f3961a.a(r0.f(), (android.util.Size) kotlin.collections.CollectionsKt.first((java.util.List) r9.Camera2StreamConfigurationMap), r9.getHighResolutionOutputSizeshNQ4ISI) != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0086, code lost:
    
        if (getMaxPreviewSizeMatchingAspectRatio$camera_release(r0) != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean isCameraSufficient$camera_release(androidx.camera.camera2.interop.Camera2CameraInfo cameraInfo, boolean focusRequired, boolean forceSupportedSizes, boolean requireHighResolution) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        com.miteksystems.misnap.camera.a.a aVar = new com.miteksystems.misnap.camera.a.a(cameraInfo);
        com.miteksystems.misnap.camera.a.b bVar = com.miteksystems.misnap.camera.a.b.f3961a;
        com.miteksystems.misnap.camera.a.b.a a2 = bVar.a(aVar.c());
        boolean z4 = aVar.getFacing() == this.getHighSpeedVideoFpsRanges;
        boolean z5 = !focusRequired || (a2.a(com.miteksystems.misnap.camera.a.k.AUTO_FOCUS) || a2.a(com.miteksystems.misnap.camera.a.k.CONTINUOUS_PICTURE_FOCUS) || a2.a(com.miteksystems.misnap.camera.a.k.CONTINUOUS_VIDEO_FOCUS));
        boolean a3 = bVar.a(aVar.getHardwareLevel(), aVar.a());
        boolean a4 = bVar.a(aVar.getHardwareLevel());
        if (forceSupportedSizes) {
            java.util.List<android.util.Size> list = this.Camera2StreamConfigurationMap;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (com.miteksystems.misnap.camera.a.b.f3961a.a(aVar.h(), (android.util.Size) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (requireHighResolution) {
            if (a3) {
            }
            z2 = false;
        } else if (forceSupportedSizes) {
            java.util.List<android.util.Size> list2 = this.Camera2StreamConfigurationMap;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (com.miteksystems.misnap.camera.a.b.f3961a.a(aVar.f(), (android.util.Size) it2.next())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        }
        if (requireHighResolution) {
            if (a4) {
            }
            z3 = false;
        } else {
            java.util.List<android.util.Size> list3 = this.Camera2StreamConfigurationMap;
            if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                java.util.Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (com.miteksystems.misnap.camera.a.b.f3961a.a(aVar.g(), (android.util.Size) it3.next())) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
        }
        return z4 && z5 && z && z3 && z2;
    }

    /* renamed from: getTargetSizes$camera_release, reason: from getter */
    public final /* synthetic */ java.util.List getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getTargetCameraFacingDirection$camera_release, reason: from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getTargetAspectRatio$camera_release, reason: from getter */
    public final /* synthetic */ android.util.Rational getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final /* synthetic */ android.util.Size getMaxPreviewSizeMatchingAspectRatio$camera_release(com.miteksystems.misnap.camera.a.a cameraCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCapabilities, "");
        return com.miteksystems.misnap.camera.a.b.f3961a.a(cameraCapabilities.h(), new android.util.Size(1920, 1080), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final /* synthetic */ android.util.Size getMaxHighResolutionImageSize$camera_release(java.util.List availableSizes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableSizes, "");
        com.miteksystems.misnap.camera.a.b bVar = com.miteksystems.misnap.camera.a.b.f3961a;
        android.util.Size a2 = bVar.a(availableSizes, new android.util.Size(2688, 1512), this.getHighResolutionOutputSizeshNQ4ISI);
        if (a2 == null || bVar.a(a2) <= bVar.a(new android.util.Size(1920, 1080))) {
            return null;
        }
        return a2;
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public final com.miteksystems.misnap.core.MiSnapCameraInfo getCameraInfo(androidx.camera.camera2.interop.Camera2CameraInfo cameraInfo) {
        android.util.Size size;
        android.util.Size size2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        com.miteksystems.misnap.camera.a.a aVar = new com.miteksystems.misnap.camera.a.a(cameraInfo);
        if (aVar.getFacing() != this.getHighSpeedVideoFpsRanges) {
            return null;
        }
        com.miteksystems.misnap.camera.a.b bVar = com.miteksystems.misnap.camera.a.b.f3961a;
        com.miteksystems.misnap.camera.a.b.a a2 = bVar.a(aVar.c());
        boolean z2 = a2.a(com.miteksystems.misnap.camera.a.k.AUTO_FOCUS) || a2.a(com.miteksystems.misnap.camera.a.k.CONTINUOUS_PICTURE_FOCUS) || a2.a(com.miteksystems.misnap.camera.a.k.CONTINUOUS_VIDEO_FOCUS);
        boolean hasTorch = aVar.getHasTorch();
        boolean a3 = bVar.a(aVar.getHardwareLevel(), aVar.a());
        boolean a4 = bVar.a(aVar.getHardwareLevel());
        android.util.Size a5 = bVar.a(aVar.h(), this.Camera2StreamConfigurationMap);
        android.util.Size a6 = bVar.a(aVar.f(), this.Camera2StreamConfigurationMap);
        android.util.Size a7 = bVar.a(aVar.g(), this.Camera2StreamConfigurationMap);
        if (a5 == null || a6 == null) {
            if (a5 == null) {
                a5 = getMaxPreviewSizeMatchingAspectRatio$camera_release(aVar);
            }
            if (a6 == null) {
                a6 = bVar.a(aVar.f(), (android.util.Size) kotlin.collections.CollectionsKt.first((java.util.List) this.Camera2StreamConfigurationMap), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            size = a5;
            size2 = a6;
            z = false;
        } else {
            size = a5;
            size2 = a6;
            z = true;
        }
        android.util.Size maxHighResolutionImageSize$camera_release = a3 ? getMaxHighResolutionImageSize$camera_release(aVar.f()) : null;
        android.util.Size maxHighResolutionImageSize$camera_release2 = a4 ? getMaxHighResolutionImageSize$camera_release(aVar.g()) : null;
        if (size == null || size2 == null || a7 == null) {
            return null;
        }
        return new com.miteksystems.misnap.core.MiSnapCameraInfo(z2 && z, z2, hasTorch, size, size2, a7, aVar.getHardwareLevel().toString(), bVar.a(aVar.getFacing()), maxHighResolutionImageSize$camera_release, maxHighResolutionImageSize$camera_release2);
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public final java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> filterCameras(java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> cameraInfoList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : cameraInfoList) {
            if (isCameraSufficient$camera_release((androidx.camera.camera2.interop.Camera2CameraInfo) obj, true, true, this.getHighSpeedVideoFpsRangesFor)) {
                arrayList.add(obj);
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor && arrayList.isEmpty()) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : cameraInfoList) {
                if (isCameraSufficient$camera_release((androidx.camera.camera2.interop.Camera2CameraInfo) obj2, true, true, false)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : cameraInfoList) {
                if (isCameraSufficient$camera_release((androidx.camera.camera2.interop.Camera2CameraInfo) obj3, false, false, false)) {
                    arrayList.add(obj3);
                }
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/miteksystems/misnap/camera/requirements/BackCameraSelectorFilter$a;", "", "", "HEIGHT_1080P", com.visa.cbp.getEncExpo.warmup, "HEIGHT_720P", "HEIGHT_MAX_RES", "WIDTH_1080P", "WIDTH_720P", "WIDTH_MAX_RES", "<init>", "()V", "camera_release"}, k = 1, mv = {1, 8, 0})
    static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    public BackCameraSelectorFilter(com.miteksystems.misnap.core.MiSnapSettings.Camera camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        this.getHighSpeedVideoFpsRangesFor = com.miteksystems.misnap.camera.CameraSettings.shouldEnableHighResolutionFrames(camera);
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(1920, 1080), new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)});
        this.getHighResolutionOutputSizeshNQ4ISI = new android.util.Rational(16, 9);
        this.getHighSpeedVideoFpsRanges = 1;
    }
}

package com.miteksystems.misnap.camera.requirements;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058@X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158@X\u0080D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/miteksystems/misnap/camera/requirements/FrontCameraSelectorFilter;", "Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;", "", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "cameraInfoList", "", "filterCameras", "cameraInfo", "", "forceSupportedSizes", "isCameraSufficient$camera_release", "(Landroidx/camera/camera2/interop/Camera2CameraInfo;Z)Z", "isCameraSufficient", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "getCameraInfo", "Landroid/util/Size;", "a", "Ljava/util/List;", "getTargetSizes$camera_release", "()Ljava/util/List;", "targetSizes", "", util.h.xy.cb.b.f1091, com.visa.cbp.getEncExpo.warmup, "getTargetCameraFacingDirection$camera_release", "()I", "targetCameraFacingDirection", "<init>", "()V", "c", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class FrontCameraSelectorFilter implements com.miteksystems.misnap.camera.requirements.CameraSelectorFilter {
    private static final com.miteksystems.misnap.camera.requirements.FrontCameraSelectorFilter.a getHighSpeedVideoFpsRanges = new com.miteksystems.misnap.camera.requirements.FrontCameraSelectorFilter.a(0);
    private final int Camera2StreamConfigurationMap;
    private final java.util.List<android.util.Size> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(1920, 1080), new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)});

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (com.miteksystems.misnap.camera.a.b.f3961a.a(r0.f(), (android.util.Size) kotlin.collections.CollectionsKt.first((java.util.List) r9.getHighResolutionOutputSizeshNQ4ISI), r6) != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009c, code lost:
    
        if (r4.a(r0.h(), (android.util.Size) kotlin.collections.CollectionsKt.first((java.util.List) r9.getHighResolutionOutputSizeshNQ4ISI), r6) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean isCameraSufficient$camera_release(androidx.camera.camera2.interop.Camera2CameraInfo cameraInfo, boolean forceSupportedSizes) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        com.miteksystems.misnap.camera.a.a aVar = new com.miteksystems.misnap.camera.a.a(cameraInfo);
        java.util.List<android.util.Size> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (com.miteksystems.misnap.camera.a.b.f3961a.a(aVar.g(), (android.util.Size) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z4 = aVar.getFacing() == this.Camera2StreamConfigurationMap;
        com.miteksystems.misnap.camera.a.b bVar = com.miteksystems.misnap.camera.a.b.f3961a;
        android.util.Size a2 = bVar.a(aVar.g(), this.getHighResolutionOutputSizeshNQ4ISI);
        android.util.Rational rational = a2 != null ? new android.util.Rational(a2.getWidth(), a2.getHeight()) : null;
        if (forceSupportedSizes) {
            java.util.List<android.util.Size> list2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (com.miteksystems.misnap.camera.a.b.f3961a.a(aVar.h(), (android.util.Size) it2.next())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            if (rational != null) {
            }
            z2 = false;
        }
        if (forceSupportedSizes) {
            java.util.List<android.util.Size> list3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                java.util.Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (com.miteksystems.misnap.camera.a.b.f3961a.a(aVar.f(), (android.util.Size) it3.next())) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
        } else {
            if (rational != null) {
            }
            z3 = false;
        }
        return z4 && z2 && z && z3;
    }

    /* renamed from: getTargetSizes$camera_release, reason: from getter */
    public final /* synthetic */ java.util.List getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getTargetCameraFacingDirection$camera_release, reason: from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public final com.miteksystems.misnap.core.MiSnapCameraInfo getCameraInfo(androidx.camera.camera2.interop.Camera2CameraInfo cameraInfo) {
        android.util.Size size;
        android.util.Size size2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        com.miteksystems.misnap.camera.a.a aVar = new com.miteksystems.misnap.camera.a.a(cameraInfo);
        if (aVar.getFacing() != this.Camera2StreamConfigurationMap) {
            return null;
        }
        com.miteksystems.misnap.camera.a.b bVar = com.miteksystems.misnap.camera.a.b.f3961a;
        com.miteksystems.misnap.camera.a.b.a a2 = bVar.a(aVar.c());
        boolean z2 = a2.a(com.miteksystems.misnap.camera.a.k.AUTO_FOCUS) || a2.a(com.miteksystems.misnap.camera.a.k.CONTINUOUS_PICTURE_FOCUS) || a2.a(com.miteksystems.misnap.camera.a.k.CONTINUOUS_VIDEO_FOCUS);
        boolean hasTorch = aVar.getHasTorch();
        android.util.Size a3 = bVar.a(aVar.h(), this.getHighResolutionOutputSizeshNQ4ISI);
        android.util.Size a4 = bVar.a(aVar.f(), this.getHighResolutionOutputSizeshNQ4ISI);
        android.util.Size a5 = bVar.a(aVar.g(), this.getHighResolutionOutputSizeshNQ4ISI);
        android.util.Rational rational = a5 != null ? new android.util.Rational(a5.getWidth(), a5.getHeight()) : null;
        if ((a3 == null || a4 == null) && rational != null) {
            if (a3 == null) {
                a3 = bVar.a(aVar.h(), (android.util.Size) kotlin.collections.CollectionsKt.first((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI), rational);
            }
            if (a4 == null) {
                a4 = bVar.a(aVar.f(), (android.util.Size) kotlin.collections.CollectionsKt.first((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI), rational);
            }
            size = a3;
            size2 = a4;
            z = false;
        } else {
            size = a3;
            size2 = a4;
            z = true;
        }
        if (size == null || size2 == null || a5 == null) {
            return null;
        }
        return new com.miteksystems.misnap.core.MiSnapCameraInfo(z, z2, hasTorch, size, size2, a5, aVar.getHardwareLevel().toString(), bVar.a(aVar.getFacing()), (android.util.Size) null, (android.util.Size) null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public final java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> filterCameras(java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> cameraInfoList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : cameraInfoList) {
            if (isCameraSufficient$camera_release((androidx.camera.camera2.interop.Camera2CameraInfo) obj, true)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : cameraInfoList) {
                if (isCameraSufficient$camera_release((androidx.camera.camera2.interop.Camera2CameraInfo) obj2, false)) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/camera/requirements/FrontCameraSelectorFilter$a;", "", "", "HEIGHT_1080P", com.visa.cbp.getEncExpo.warmup, "HEIGHT_720P", "WIDTH_1080P", "WIDTH_720P", "<init>", "()V", "camera_release"}, k = 1, mv = {1, 8, 0})
    static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}

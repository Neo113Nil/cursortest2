package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\b\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/camera/a/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "a", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraControl;", "cameraControl", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "(Landroidx/camera/core/CameraControl;)Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;", "Landroid/hardware/camera2/CameraManager;", util.h.xy.cb.b.f1091, "(Landroid/content/Context;)Landroid/hardware/camera2/CameraManager;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ androidx.camera.camera2.interop.Camera2CameraControl a(androidx.camera.core.CameraControl cameraControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraControl, "");
        androidx.camera.camera2.interop.Camera2CameraControl from = androidx.camera.camera2.interop.Camera2CameraControl.from(cameraControl);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        return from;
    }

    public final /* synthetic */ androidx.camera.camera2.interop.Camera2CameraInfo a(androidx.camera.core.CameraInfo cameraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        androidx.camera.camera2.interop.Camera2CameraInfo from = androidx.camera.camera2.interop.Camera2CameraInfo.from(cameraInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        return from;
    }

    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return androidx.camera.lifecycle.ProcessCameraProvider.INSTANCE.getInstance(context);
    }

    public final /* synthetic */ android.hardware.camera2.CameraManager b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) android.hardware.camera2.CameraManager.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(systemService, "");
        return (android.hardware.camera2.CameraManager) systemService;
    }
}

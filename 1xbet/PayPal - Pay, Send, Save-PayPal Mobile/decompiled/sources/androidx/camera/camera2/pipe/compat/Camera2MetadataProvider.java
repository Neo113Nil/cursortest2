package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getCameraMetadata-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCameraMetadata", "awaitCameraMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitCameraMetadata", "", "extension", "Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "getCameraExtensionMetadata-RzXb1QE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCameraExtensionMetadata", "awaitCameraExtensionMetadata-0r8Bogc", "(Ljava/lang/String;I)Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "awaitCameraExtensionMetadata", "", "getSupportedCameraExtensions-EfqyGwQ", "(Ljava/lang/String;)Ljava/util/Set;", "getSupportedCameraExtensions"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Camera2MetadataProvider {
    /* renamed from: awaitCameraExtensionMetadata-0r8Bogc */
    androidx.camera.camera2.pipe.CameraExtensionMetadata mo795awaitCameraExtensionMetadata0r8Bogc(java.lang.String cameraId, int extension);

    /* renamed from: awaitCameraMetadata-EfqyGwQ */
    androidx.camera.camera2.pipe.CameraMetadata mo796awaitCameraMetadataEfqyGwQ(java.lang.String cameraId);

    /* renamed from: getCameraExtensionMetadata-RzXb1QE */
    java.lang.Object mo797getCameraExtensionMetadataRzXb1QE(java.lang.String str, int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraExtensionMetadata> continuation);

    /* renamed from: getCameraMetadata-0r8Bogc */
    java.lang.Object mo798getCameraMetadata0r8Bogc(java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraMetadata> continuation);

    /* renamed from: getSupportedCameraExtensions-EfqyGwQ */
    java.util.Set<java.lang.Integer> mo799getSupportedCameraExtensionsEfqyGwQ(java.lang.String cameraId);
}

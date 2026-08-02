package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ0\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "frameMetadata", "", "shouldUseTorchAsFlash", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldDisableAePrecapture", "()Z", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UseTorchAsFlash {
    boolean shouldDisableAePrecapture();

    java.lang.Object shouldUseTorchAsFlash(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameMetadata>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash$Bindings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.workaround.UseTorchAsFlash.Bindings.Companion INSTANCE = new androidx.camera.camera2.compat.workaround.UseTorchAsFlash.Bindings.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash$Bindings$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "intrinsicZoomCalculator", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "provideUseTorchAsFlash", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;Landroidx/camera/camera2/pipe/CameraDevices;Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;)Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @dagger.Provides
            public final androidx.camera.camera2.compat.workaround.UseTorchAsFlash provideUseTorchAsFlash(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.camera2.pipe.CameraDevices cameraDevices, androidx.camera.camera2.internal.IntrinsicZoomCalculator intrinsicZoomCalculator) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicZoomCalculator, "");
                if (cameraQuirks.getQuirks().contains(androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk.class)) {
                    return new androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl(cameraQuirks, cameraDevices, intrinsicZoomCalculator);
                }
                return androidx.camera.camera2.compat.workaround.NotUseTorchAsFlash.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}

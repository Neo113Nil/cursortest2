package androidx.camera.core.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "load", "()Z", "", "cameraId", "", "Landroidx/camera/core/UseCase;", "appUseCases", "shouldForceEnableStreamSharing", "(Ljava/lang/String;Ljava/util/Collection;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewGreenTintQuirk implements androidx.camera.core.impl.Quirk {
    public static final androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk INSTANCE = new androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return kotlin.text.StringsKt.equals("motorola", android.os.Build.BRAND, true) && kotlin.text.StringsKt.equals("moto e20", android.os.Build.MODEL, true);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean shouldForceEnableStreamSharing(java.lang.String cameraId, java.util.Collection<? extends androidx.camera.core.UseCase> appUseCases) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appUseCases, "");
        if (kotlin.text.StringsKt.equals("motorola", android.os.Build.BRAND, true) && kotlin.text.StringsKt.equals("moto e20", android.os.Build.MODEL, true) && kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "0") && appUseCases.size() == 2) {
            java.util.Collection<? extends androidx.camera.core.UseCase> collection = appUseCases;
            boolean z3 = collection instanceof java.util.Collection;
            if (!z3 || !collection.isEmpty()) {
                java.util.Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((androidx.camera.core.UseCase) it.next()) instanceof androidx.camera.core.Preview) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z3 || !collection.isEmpty()) {
                for (androidx.camera.core.UseCase useCase : collection) {
                    if (useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z && z2) {
                return true;
            }
        }
        return false;
    }
}

package androidx.window.area.reflectionguard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ#\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\n"}, d2 = {"Landroidx/window/area/reflectionguard/WindowAreaComponentValidator;", "", "<init>", "()V", "Ljava/lang/Class;", "windowAreaComponent", "", "apiLevel", "", "isWindowAreaComponentValid$window_release", "(Ljava/lang/Class;I)Z", "extensionWindowAreaStatus", "isExtensionWindowAreaStatusValid$window_release", "extensionWindowAreaPresentation", "isExtensionWindowAreaPresentationValid$window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowAreaComponentValidator {
    public static final androidx.window.area.reflectionguard.WindowAreaComponentValidator INSTANCE = new androidx.window.area.reflectionguard.WindowAreaComponentValidator();

    private WindowAreaComponentValidator() {
    }

    public final boolean isWindowAreaComponentValid$window_release(java.lang.Class<?> windowAreaComponent, int apiLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowAreaComponent, "");
        if (apiLevel <= 2) {
            return false;
        }
        return androidx.window.reflection.ReflectionUtils.INSTANCE.validateImplementation$window_release(windowAreaComponent, androidx.window.area.reflectionguard.WindowAreaComponentApi3Requirements.class);
    }

    public final boolean isExtensionWindowAreaStatusValid$window_release(java.lang.Class<?> extensionWindowAreaStatus, int apiLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionWindowAreaStatus, "");
        if (apiLevel <= 2) {
            return false;
        }
        return androidx.window.reflection.ReflectionUtils.INSTANCE.validateImplementation$window_release(extensionWindowAreaStatus, androidx.window.area.reflectionguard.ExtensionWindowAreaStatusRequirements.class);
    }

    public final boolean isExtensionWindowAreaPresentationValid$window_release(java.lang.Class<?> extensionWindowAreaPresentation, int apiLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionWindowAreaPresentation, "");
        if (apiLevel <= 2) {
            return false;
        }
        return androidx.window.reflection.ReflectionUtils.INSTANCE.validateImplementation$window_release(extensionWindowAreaPresentation, androidx.window.extensions.area.ExtensionWindowAreaPresentation.class);
    }
}

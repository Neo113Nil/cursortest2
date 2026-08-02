package androidx.window;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048WX\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/window/WindowSdkExtensions;", "", "<init>", "()V", "", "version", "", "requireExtensionVersion$window_release", "(I)V", "Lkotlin/ranges/IntRange;", "range", "(Lkotlin/ranges/IntRange;)V", "extensionVersion", com.visa.cbp.getEncExpo.warmup, "getExtensionVersion", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class WindowSdkExtensions {
    private final int extensionVersion = androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.WindowSdkExtensions.Companion INSTANCE = new androidx.window.WindowSdkExtensions.Companion(null);
    private static androidx.window.WindowSdkExtensionsDecorator Camera2StreamConfigurationMap = androidx.window.EmptyDecoratorWindowSdk.INSTANCE;

    public int getExtensionVersion() {
        return this.extensionVersion;
    }

    public final void requireExtensionVersion$window_release(int version) {
        if (getExtensionVersion() >= version) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This API requires extension version ");
        sb.append(version);
        sb.append(", but the device is on ");
        sb.append(getExtensionVersion());
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    public final void requireExtensionVersion$window_release(kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        int first = range.getFirst();
        int last = range.getLast();
        int extensionVersion = getExtensionVersion();
        if (first > extensionVersion || extensionVersion > last) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("This API requires extension version ");
            sb.append(range);
            sb.append(", but the device is on ");
            sb.append(getExtensionVersion());
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/window/WindowSdkExtensions$Companion;", "", "<init>", "()V", "Landroidx/window/WindowSdkExtensions;", "getInstance", "()Landroidx/window/WindowSdkExtensions;", "Landroidx/window/WindowSdkExtensionsDecorator;", "overridingDecorator", "", "overrideDecorator", "(Landroidx/window/WindowSdkExtensionsDecorator;)V", "reset", "Camera2StreamConfigurationMap", "Landroidx/window/WindowSdkExtensionsDecorator;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.WindowSdkExtensions getInstance() {
            return androidx.window.WindowSdkExtensions.Camera2StreamConfigurationMap.decorate(new androidx.window.WindowSdkExtensions() { // from class: androidx.window.WindowSdkExtensions$Companion$getInstance$1
            });
        }

        public final void overrideDecorator(androidx.window.WindowSdkExtensionsDecorator overridingDecorator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overridingDecorator, "");
            androidx.window.WindowSdkExtensions.Camera2StreamConfigurationMap = overridingDecorator;
        }

        public final void reset() {
            androidx.window.WindowSdkExtensions.Camera2StreamConfigurationMap = androidx.window.EmptyDecoratorWindowSdk.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.WindowSdkExtensions getInstance() {
        return INSTANCE.getInstance();
    }
}

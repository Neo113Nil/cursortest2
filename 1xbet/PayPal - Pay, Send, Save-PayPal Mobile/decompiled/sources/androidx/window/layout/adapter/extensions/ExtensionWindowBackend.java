package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackend;", "Landroidx/window/layout/adapter/WindowBackend;", "backend", "<init>", "(Landroidx/window/layout/adapter/WindowBackend;)V", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowLayoutInfo;", "getCurrentWindowLayoutInfo", "(Landroid/content/Context;)Landroidx/window/layout/WindowLayoutInfo;", "", "hasRegisteredListeners", "()Z", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", com.sun.jna.Callback.METHOD_NAME, "", "registerLayoutChangeCallback", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "unregisterLayoutChangeCallback", "(Landroidx/core/util/Consumer;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/layout/adapter/WindowBackend;", "getHighSpeedVideoSizes", "", "Landroidx/window/layout/SupportedPosture;", "getSupportedPostures", "()Ljava/util/List;", "supportedPostures", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionWindowBackend implements androidx.window.layout.adapter.WindowBackend {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.adapter.extensions.ExtensionWindowBackend.Companion INSTANCE = new androidx.window.layout.adapter.extensions.ExtensionWindowBackend.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.window.layout.adapter.WindowBackend getHighSpeedVideoSizes;

    public ExtensionWindowBackend(androidx.window.layout.adapter.WindowBackend windowBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowBackend, "");
        this.getHighSpeedVideoSizes = windowBackend;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackend$Companion;", "", "<init>", "()V", "newInstance", "Landroidx/window/layout/adapter/WindowBackend;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Landroidx/window/extensions/layout/WindowLayoutComponent;", "adapter", "Landroidx/window/core/ConsumerAdapter;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.layout.adapter.WindowBackend newInstance(androidx.window.extensions.layout.WindowLayoutComponent component, androidx.window.core.ConsumerAdapter adapter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
            int safeVendorApiLevel = androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
            if (safeVendorApiLevel >= 9) {
                return new androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi9(component, adapter);
            }
            if (safeVendorApiLevel >= 6) {
                return new androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi6(component, adapter);
            }
            if (safeVendorApiLevel >= 2) {
                return new androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi2(component, adapter);
            }
            if (safeVendorApiLevel == 1) {
                return new androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1(component, adapter);
            }
            return new androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighSpeedVideoSizes.unregisterLayoutChangeCallback(callback);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final void registerLayoutChangeCallback(android.content.Context context, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighSpeedVideoSizes.registerLayoutChangeCallback(context, executor, callback);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final boolean hasRegisteredListeners() {
        return this.getHighSpeedVideoSizes.hasRegisteredListeners();
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final java.util.List<androidx.window.layout.SupportedPosture> getSupportedPostures() {
        return this.getHighSpeedVideoSizes.getSupportedPostures();
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final androidx.window.layout.WindowLayoutInfo getCurrentWindowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return this.getHighSpeedVideoSizes.getCurrentWindowLayoutInfo(context);
    }
}

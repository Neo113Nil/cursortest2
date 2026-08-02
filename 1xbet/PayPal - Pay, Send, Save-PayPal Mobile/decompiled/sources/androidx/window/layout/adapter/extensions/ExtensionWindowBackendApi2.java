package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi2;", "Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi1;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Landroidx/window/extensions/layout/WindowLayoutComponent;", "adapter", "Landroidx/window/core/ConsumerAdapter;", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Landroidx/window/core/ConsumerAdapter;)V", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "contextToListeners", "", "Landroid/content/Context;", "Landroidx/window/layout/adapter/extensions/MulticastConsumerApi2;", "listenerToContext", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "registerLayoutChangeCallback", "", "context", "executor", "Ljava/util/concurrent/Executor;", com.sun.jna.Callback.METHOD_NAME, "unregisterLayoutChangeCallback", "hasRegisteredListeners", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ExtensionWindowBackendApi2 extends androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1 {
    private final java.util.concurrent.locks.ReentrantLock Camera2StreamConfigurationMap;
    private final java.util.Map<android.content.Context, androidx.window.layout.adapter.extensions.MulticastConsumerApi2> getHighSpeedVideoFpsRanges;
    private final java.util.Map<androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo>, android.content.Context> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionWindowBackendApi2(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, androidx.window.core.ConsumerAdapter consumerAdapter) {
        super(windowLayoutComponent, consumerAdapter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAdapter, "");
        this.Camera2StreamConfigurationMap = new java.util.concurrent.locks.ReentrantLock();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(android.content.Context context, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.Camera2StreamConfigurationMap;
        reentrantLock.lock();
        try {
            androidx.window.layout.adapter.extensions.MulticastConsumerApi2 multicastConsumerApi2 = this.getHighSpeedVideoFpsRanges.get(context);
            if (multicastConsumerApi2 != null) {
                multicastConsumerApi2.addListener(callback);
                this.getHighSpeedVideoSizes.put(callback, context);
            } else {
                androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi2 extensionWindowBackendApi2 = this;
                androidx.window.layout.adapter.extensions.MulticastConsumerApi2 multicastConsumerApi22 = new androidx.window.layout.adapter.extensions.MulticastConsumerApi2(context);
                this.getHighSpeedVideoFpsRanges.put(context, multicastConsumerApi22);
                this.getHighSpeedVideoSizes.put(callback, context);
                multicastConsumerApi22.addListener(callback);
                getCamera2StreamConfigurationMap().addWindowLayoutInfoListener(context, multicastConsumerApi22);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.Camera2StreamConfigurationMap;
        reentrantLock.lock();
        try {
            android.content.Context context = this.getHighSpeedVideoSizes.get(callback);
            if (context == null) {
                return;
            }
            androidx.window.layout.adapter.extensions.MulticastConsumerApi2 multicastConsumerApi2 = this.getHighSpeedVideoFpsRanges.get(context);
            if (multicastConsumerApi2 == null) {
                return;
            }
            multicastConsumerApi2.removeListener(callback);
            this.getHighSpeedVideoSizes.remove(callback);
            if (multicastConsumerApi2.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.remove(context);
                getCamera2StreamConfigurationMap().removeWindowLayoutInfoListener(multicastConsumerApi2);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, androidx.window.layout.adapter.WindowBackend
    public boolean hasRegisteredListeners() {
        return (this.getHighSpeedVideoFpsRanges.isEmpty() && this.getHighSpeedVideoSizes.isEmpty()) ? false : true;
    }
}

package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi1;", "Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi0;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Landroidx/window/extensions/layout/WindowLayoutComponent;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Landroidx/window/core/ConsumerAdapter;)V", "getComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "contextToListeners", "", "Landroid/content/Context;", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "listenerToContext", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "consumerToToken", "Landroidx/window/core/ConsumerAdapter$Subscription;", "registerLayoutChangeCallback", "", "context", "executor", "Ljava/util/concurrent/Executor;", com.sun.jna.Callback.METHOD_NAME, "unregisterLayoutChangeCallback", "hasRegisteredListeners", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ExtensionWindowBackendApi1 extends androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0 {
    private final androidx.window.extensions.layout.WindowLayoutComponent Camera2StreamConfigurationMap;
    private final androidx.window.core.ConsumerAdapter getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<android.content.Context, androidx.window.layout.adapter.extensions.MulticastConsumer> getHighSpeedVideoFpsRanges;
    private final java.util.Map<androidx.window.layout.adapter.extensions.MulticastConsumer, androidx.window.core.ConsumerAdapter.Subscription> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoSizes;
    private final java.util.Map<androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo>, android.content.Context> getOutputFormats;

    /* renamed from: getComponent, reason: from getter */
    public final androidx.window.extensions.layout.WindowLayoutComponent getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public ExtensionWindowBackendApi1(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, androidx.window.core.ConsumerAdapter consumerAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAdapter, "");
        this.Camera2StreamConfigurationMap = windowLayoutComponent;
        this.getHighResolutionOutputSizeshNQ4ISI = consumerAdapter;
        this.getHighSpeedVideoSizes = new java.util.concurrent.locks.ReentrantLock();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        this.getOutputFormats = new java.util.LinkedHashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(android.content.Context context, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            androidx.window.layout.adapter.extensions.MulticastConsumer multicastConsumer = this.getHighSpeedVideoFpsRanges.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.addListener(callback);
                this.getOutputFormats.put(callback, context);
            } else {
                androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1 extensionWindowBackendApi1 = this;
                androidx.window.layout.adapter.extensions.MulticastConsumer multicastConsumer2 = new androidx.window.layout.adapter.extensions.MulticastConsumer(context);
                this.getHighSpeedVideoFpsRanges.put(context, multicastConsumer2);
                this.getOutputFormats.put(callback, context);
                multicastConsumer2.addListener(callback);
                if (context instanceof android.app.Activity) {
                    this.getHighSpeedVideoFpsRangesFor.put(multicastConsumer2, this.getHighResolutionOutputSizeshNQ4ISI.createSubscription((java.lang.Object) this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.extensions.layout.WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (android.app.Activity) context, (kotlin.jvm.functions.Function1) new androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(multicastConsumer2)));
                } else {
                    multicastConsumer2.accept(new androidx.window.extensions.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList()));
                    return;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            android.content.Context context = this.getOutputFormats.get(callback);
            if (context == null) {
                return;
            }
            androidx.window.layout.adapter.extensions.MulticastConsumer multicastConsumer = this.getHighSpeedVideoFpsRanges.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.removeListener(callback);
            this.getOutputFormats.remove(callback);
            if (multicastConsumer.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.remove(context);
                androidx.window.core.ConsumerAdapter.Subscription remove = this.getHighSpeedVideoFpsRangesFor.remove(multicastConsumer);
                if (remove != null) {
                    remove.dispose();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public boolean hasRegisteredListeners() {
        return (this.getHighSpeedVideoFpsRanges.isEmpty() && this.getOutputFormats.isEmpty() && this.getHighSpeedVideoFpsRangesFor.isEmpty()) ? false : true;
    }
}

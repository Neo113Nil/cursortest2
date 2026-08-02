package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi0;", "Landroidx/window/layout/adapter/WindowBackend;", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", com.sun.jna.Callback.METHOD_NAME, "", "registerLayoutChangeCallback", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "unregisterLayoutChangeCallback", "(Landroidx/core/util/Consumer;)V", "getCurrentWindowLayoutInfo", "(Landroid/content/Context;)Landroidx/window/layout/WindowLayoutInfo;", "", "Landroidx/window/layout/SupportedPosture;", "getSupportedPostures", "()Ljava/util/List;", "supportedPostures"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ExtensionWindowBackendApi0 implements androidx.window.layout.adapter.WindowBackend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.core.util.Consumer consumer) {
        consumer.accept(new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList()));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(android.content.Context context, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        executor.execute(new java.lang.Runnable() { // from class: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0.getHighSpeedVideoFpsRangesFor(androidx.core.util.Consumer.this);
            }
        });
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public java.util.List<androidx.window.layout.SupportedPosture> getSupportedPostures() {
        throw new java.lang.UnsupportedOperationException("Extensions version must be at least 6");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public androidx.window.layout.WindowLayoutInfo getCurrentWindowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        throw new java.lang.UnsupportedOperationException("Extensions version must be at least 9");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }
}

package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi6;", "Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi2;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Landroidx/window/extensions/layout/WindowLayoutComponent;", "adapter", "Landroidx/window/core/ConsumerAdapter;", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Landroidx/window/core/ConsumerAdapter;)V", "supportedPostures", "", "Landroidx/window/layout/SupportedPosture;", "getSupportedPostures", "()Ljava/util/List;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ExtensionWindowBackendApi6 extends androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionWindowBackendApi6(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, androidx.window.core.ConsumerAdapter consumerAdapter) {
        super(windowLayoutComponent, consumerAdapter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAdapter, "");
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public java.util.List<androidx.window.layout.SupportedPosture> getSupportedPostures() {
        androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter.INSTANCE;
        androidx.window.extensions.layout.SupportedWindowFeatures supportedWindowFeatures = getCamera2StreamConfigurationMap().getSupportedWindowFeatures();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedWindowFeatures, "");
        return extensionsWindowLayoutInfoAdapter.translate$window_release(supportedWindowFeatures);
    }
}

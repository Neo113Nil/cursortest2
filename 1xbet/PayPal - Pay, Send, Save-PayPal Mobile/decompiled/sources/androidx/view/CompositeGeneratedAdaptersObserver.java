package androidx.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "Landroidx/lifecycle/GeneratedAdapter;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/GeneratedAdapter;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "getHighResolutionOutputSizeshNQ4ISI", "[Landroidx/lifecycle/GeneratedAdapter;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompositeGeneratedAdaptersObserver implements androidx.view.LifecycleEventObserver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.GeneratedAdapter[] Camera2StreamConfigurationMap;

    public CompositeGeneratedAdaptersObserver(androidx.view.GeneratedAdapter[] generatedAdapterArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generatedAdapterArr, "");
        this.Camera2StreamConfigurationMap = generatedAdapterArr;
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        androidx.view.MethodCallsLogger methodCallsLogger = new androidx.view.MethodCallsLogger();
        for (androidx.view.GeneratedAdapter generatedAdapter : this.Camera2StreamConfigurationMap) {
            generatedAdapter.callMethods(source, event, false, methodCallsLogger);
        }
        for (androidx.view.GeneratedAdapter generatedAdapter2 : this.Camera2StreamConfigurationMap) {
            generatedAdapter2.callMethods(source, event, true, methodCallsLogger);
        }
    }
}

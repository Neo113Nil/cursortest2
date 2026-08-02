package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", "<init>", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateHandleAttacher implements androidx.view.LifecycleEventObserver {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandlesProvider getHighSpeedVideoSizes;

    public SavedStateHandleAttacher(androidx.view.SavedStateHandlesProvider savedStateHandlesProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandlesProvider, "");
        this.getHighSpeedVideoSizes = savedStateHandlesProvider;
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event != androidx.lifecycle.Lifecycle.Event.ON_CREATE) {
            throw new java.lang.IllegalStateException("Next event must be ON_CREATE, it was ".concat(java.lang.String.valueOf(event)).toString());
        }
        source.getLifecycle().removeObserver(this);
        this.getHighSpeedVideoSizes.performRestore();
    }
}

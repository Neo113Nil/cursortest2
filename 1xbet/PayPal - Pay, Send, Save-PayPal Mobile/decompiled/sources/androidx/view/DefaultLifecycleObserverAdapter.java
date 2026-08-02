package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleEventObserver;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "getHighSpeedVideoSizes", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/LifecycleEventObserver;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultLifecycleObserverAdapter implements androidx.view.LifecycleEventObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.LifecycleEventObserver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.DefaultLifecycleObserver Camera2StreamConfigurationMap;

    public DefaultLifecycleObserverAdapter(androidx.view.DefaultLifecycleObserver defaultLifecycleObserver, androidx.view.LifecycleEventObserver lifecycleEventObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "");
        this.Camera2StreamConfigurationMap = defaultLifecycleObserver;
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycleEventObserver;
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        switch (androidx.lifecycle.DefaultLifecycleObserverAdapter.WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.Camera2StreamConfigurationMap.onCreate(source);
                break;
            case 2:
                this.Camera2StreamConfigurationMap.onStart(source);
                break;
            case 3:
                this.Camera2StreamConfigurationMap.onResume(source);
                break;
            case 4:
                this.Camera2StreamConfigurationMap.onPause(source);
                break;
            case 5:
                this.Camera2StreamConfigurationMap.onStop(source);
                break;
            case 6:
                this.Camera2StreamConfigurationMap.onDestroy(source);
                break;
            case 7:
                throw new java.lang.IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.view.LifecycleEventObserver lifecycleEventObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(source, event);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

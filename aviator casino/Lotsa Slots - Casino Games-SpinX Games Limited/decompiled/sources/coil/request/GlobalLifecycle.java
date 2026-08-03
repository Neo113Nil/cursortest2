package coil.request;

/* compiled from: GlobalLifecycle.kt */
@kotlin.Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "<init>", "()V", "owner", "coil/request/GlobalLifecycle$owner$1", "Lcoil/request/GlobalLifecycle$owner$1;", "currentState", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "addObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "removeObserver", "toString", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GlobalLifecycle extends androidx.lifecycle.Lifecycle {
    public static final coil.request.GlobalLifecycle INSTANCE = new coil.request.GlobalLifecycle();
    private static final coil.request.GlobalLifecycle$owner$1 owner = new androidx.lifecycle.LifecycleOwner() { // from class: coil.request.GlobalLifecycle$owner$1
        @Override // androidx.lifecycle.LifecycleOwner
        public coil.request.GlobalLifecycle getLifecycle() {
            return coil.request.GlobalLifecycle.INSTANCE;
        }
    };

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver observer) {
    }

    private GlobalLifecycle() {
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: getCurrentState */
    public androidx.lifecycle.Lifecycle.State getState() {
        return androidx.lifecycle.Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver observer) {
        if (!(observer instanceof androidx.lifecycle.DefaultLifecycleObserver)) {
            throw new java.lang.IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.DefaultLifecycleObserver defaultLifecycleObserver = (androidx.lifecycle.DefaultLifecycleObserver) observer;
        coil.request.GlobalLifecycle$owner$1 globalLifecycle$owner$1 = owner;
        defaultLifecycleObserver.onCreate(globalLifecycle$owner$1);
        defaultLifecycleObserver.onStart(globalLifecycle$owner$1);
        defaultLifecycleObserver.onResume(globalLifecycle$owner$1);
    }

    public java.lang.String toString() {
        return "coil.request.GlobalLifecycle";
    }
}

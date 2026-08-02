package androidx.view;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final java.lang.Object NOT_SET = new java.lang.Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile java.lang.Object mData;
    final java.lang.Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private androidx.arch.core.internal.SafeIterableMap<androidx.view.Observer<? super T>, androidx.view.LiveData<T>.ObserverWrapper> mObservers;
    volatile java.lang.Object mPendingData;
    private final java.lang.Runnable mPostValueRunnable;
    private int mVersion;

    public void onActive() {
    }

    public void onInactive() {
    }

    public LiveData(T t) {
        this.mDataLock = new java.lang.Object();
        this.mObservers = new androidx.arch.core.internal.SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Object obj;
                synchronized (androidx.view.LiveData.this.mDataLock) {
                    obj = androidx.view.LiveData.this.mPendingData;
                    androidx.view.LiveData.this.mPendingData = androidx.view.LiveData.NOT_SET;
                }
                androidx.view.LiveData.this.setValue(obj);
            }
        };
        this.mData = t;
        this.mVersion = 0;
    }

    public LiveData() {
        this.mDataLock = new java.lang.Object();
        this.mObservers = new androidx.arch.core.internal.SafeIterableMap<>();
        this.mActiveCount = 0;
        java.lang.Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Object obj2;
                synchronized (androidx.view.LiveData.this.mDataLock) {
                    obj2 = androidx.view.LiveData.this.mPendingData;
                    androidx.view.LiveData.this.mPendingData = androidx.view.LiveData.NOT_SET;
                }
                androidx.view.LiveData.this.setValue(obj2);
            }
        };
        this.mData = obj;
        this.mVersion = -1;
    }

    private void considerNotify(androidx.view.LiveData<T>.ObserverWrapper observerWrapper) {
        if (observerWrapper.Camera2StreamConfigurationMap) {
            if (!observerWrapper.getHighSpeedVideoSizes()) {
                observerWrapper.Camera2StreamConfigurationMap(false);
                return;
            }
            int i = observerWrapper.getHighSpeedVideoFpsRangesFor;
            int i2 = this.mVersion;
            if (i >= i2) {
                return;
            }
            observerWrapper.getHighSpeedVideoFpsRangesFor = i2;
            observerWrapper.getInputSizeshNQ4ISI.onChanged((java.lang.Object) this.mData);
        }
    }

    void dispatchingValue(androidx.view.LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                considerNotify(observerWrapper);
                observerWrapper = null;
            } else {
                androidx.arch.core.internal.SafeIterableMap<androidx.view.Observer<? super T>, androidx.view.LiveData<T>.ObserverWrapper>.IteratorWithAdditions iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    considerNotify((androidx.lifecycle.LiveData.ObserverWrapper) iteratorWithAdditions.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observe(androidx.view.LifecycleOwner lifecycleOwner, androidx.view.Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() != androidx.lifecycle.Lifecycle.State.DESTROYED) {
            androidx.lifecycle.LiveData.LifecycleBoundObserver lifecycleBoundObserver = new androidx.lifecycle.LiveData.LifecycleBoundObserver(lifecycleOwner, observer);
            androidx.view.LiveData<T>.ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
            if (putIfAbsent != null && !putIfAbsent.getHighSpeedVideoFpsRangesFor(lifecycleOwner)) {
                throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (putIfAbsent != null) {
                return;
            }
            lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
        }
    }

    public void observeForever(androidx.view.Observer<? super T> observer) {
        assertMainThread("observeForever");
        androidx.lifecycle.LiveData.AlwaysActiveObserver alwaysActiveObserver = new androidx.lifecycle.LiveData.AlwaysActiveObserver(observer);
        androidx.view.LiveData<T>.ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, alwaysActiveObserver);
        if (putIfAbsent instanceof androidx.lifecycle.LiveData.LifecycleBoundObserver) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (putIfAbsent != null) {
            return;
        }
        alwaysActiveObserver.Camera2StreamConfigurationMap(true);
    }

    public void removeObserver(androidx.view.Observer<? super T> observer) {
        assertMainThread("removeObserver");
        androidx.view.LiveData<T>.ObserverWrapper remove = this.mObservers.remove(observer);
        if (remove == null) {
            return;
        }
        remove.getHighResolutionOutputSizeshNQ4ISI();
        remove.Camera2StreamConfigurationMap(false);
    }

    public void removeObservers(androidx.view.LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        java.util.Iterator<java.util.Map.Entry<androidx.view.Observer<? super T>, androidx.view.LiveData<T>.ObserverWrapper>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<androidx.view.Observer<? super T>, androidx.view.LiveData<T>.ObserverWrapper> next = it.next();
            if (next.getValue().getHighSpeedVideoFpsRangesFor(lifecycleOwner)) {
                removeObserver(next.getKey());
            }
        }
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            androidx.arch.core.executor.ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        }
    }

    protected void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    onActive();
                } else if (z2) {
                    onInactive();
                }
                i2 = i3;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    /* loaded from: classes3.dex */
    class LifecycleBoundObserver extends androidx.view.LiveData<T>.ObserverWrapper implements androidx.view.LifecycleEventObserver {
        final androidx.view.LifecycleOwner getHighSpeedVideoSizes;

        LifecycleBoundObserver(androidx.view.LifecycleOwner lifecycleOwner, androidx.view.Observer<? super T> observer) {
            super(observer);
            this.getHighSpeedVideoSizes = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        final boolean getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED);
        }

        @Override // androidx.view.LifecycleEventObserver
        public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
            androidx.lifecycle.Lifecycle.State currentState = this.getHighSpeedVideoSizes.getLifecycle().getCurrentState();
            if (currentState == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                androidx.view.LiveData.this.removeObserver(this.getInputSizeshNQ4ISI);
                return;
            }
            androidx.lifecycle.Lifecycle.State state = null;
            while (state != currentState) {
                Camera2StreamConfigurationMap(getHighSpeedVideoSizes());
                state = currentState;
                currentState = this.getHighSpeedVideoSizes.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        final boolean getHighSpeedVideoFpsRangesFor(androidx.view.LifecycleOwner lifecycleOwner) {
            return this.getHighSpeedVideoSizes == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizes.getLifecycle().removeObserver(this);
        }
    }

    /* loaded from: classes3.dex */
    abstract class ObserverWrapper {
        boolean Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor = -1;
        final androidx.view.Observer<? super T> getInputSizeshNQ4ISI;

        void getHighResolutionOutputSizeshNQ4ISI() {
        }

        boolean getHighSpeedVideoFpsRangesFor(androidx.view.LifecycleOwner lifecycleOwner) {
            return false;
        }

        abstract boolean getHighSpeedVideoSizes();

        ObserverWrapper(androidx.view.Observer<? super T> observer) {
            this.getInputSizeshNQ4ISI = observer;
        }

        final void Camera2StreamConfigurationMap(boolean z) {
            if (z != this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = z;
                androidx.view.LiveData.this.changeActiveCounter(z ? 1 : -1);
                if (this.Camera2StreamConfigurationMap) {
                    androidx.view.LiveData.this.dispatchingValue(this);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class AlwaysActiveObserver extends androidx.view.LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        final boolean getHighSpeedVideoSizes() {
            return true;
        }

        AlwaysActiveObserver(androidx.view.Observer<? super T> observer) {
            super(observer);
        }
    }

    static void assertMainThread(java.lang.String str) {
        if (androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new java.lang.IllegalStateException(sb.toString());
    }
}

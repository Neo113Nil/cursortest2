package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\tj\u0002`\n0\b\"\u00060\tj\u0002`\n¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\tj\u0002`\n0\b\"\u00060\tj\u0002`\n¢\u0006\u0004\b\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\tj\u0002`\nJ\u0012\u0010\u0017\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\tj\u0002`\nJ#\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\f\b\u0000\u0010\u001b*\u00060\tj\u0002`\n2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u00060\tj\u0002`\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeables", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "keyToCloseables", "", "", "", "isCleared", "", "clear", "", "addCloseable", "key", "closeable", "getCloseable", "T", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "closeWithRuntimeException", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelImpl {
    private final java.util.Map<java.lang.String, java.lang.AutoCloseable> Camera2StreamConfigurationMap;
    private final androidx.view.viewmodel.internal.SynchronizedObject getHighResolutionOutputSizeshNQ4ISI;
    private volatile boolean getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<java.lang.AutoCloseable> getHighSpeedVideoSizes;

    public ViewModelImpl() {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.viewmodel.internal.SynchronizedObject();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        this.getHighSpeedVideoSizes = new java.util.LinkedHashSet();
    }

    public ViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.viewmodel.internal.SynchronizedObject();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        this.getHighSpeedVideoSizes = new java.util.LinkedHashSet();
        addCloseable(androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.asCloseable(coroutineScope));
    }

    public ViewModelImpl(java.lang.AutoCloseable... autoCloseableArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.viewmodel.internal.SynchronizedObject();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.getHighSpeedVideoSizes = linkedHashSet;
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    public ViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.AutoCloseable... autoCloseableArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.viewmodel.internal.SynchronizedObject();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.getHighSpeedVideoSizes = linkedHashSet;
        addCloseable(androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.asCloseable(coroutineScope));
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    public final void clear() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.util.Iterator it = this.Camera2StreamConfigurationMap.values().iterator();
            while (it.hasNext()) {
                access$closeWithRuntimeException(this, (java.lang.AutoCloseable) it.next());
            }
            java.util.Iterator it2 = this.getHighSpeedVideoSizes.iterator();
            while (it2.hasNext()) {
                access$closeWithRuntimeException(this, (java.lang.AutoCloseable) it2.next());
            }
            this.getHighSpeedVideoSizes.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void addCloseable(java.lang.String key, java.lang.AutoCloseable closeable) {
        java.lang.AutoCloseable autoCloseable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (closeable != null) {
                try {
                    androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) closeable);
                    return;
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
            return;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            autoCloseable = (java.lang.AutoCloseable) this.Camera2StreamConfigurationMap.put(key, closeable);
        }
        if (autoCloseable != null) {
            try {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) autoCloseable);
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
    }

    public final void addCloseable(java.lang.AutoCloseable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        if (!this.getHighSpeedVideoFpsRangesFor) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizes.add(closeable);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        if (closeable != null) {
            try {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) closeable);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public final <T extends java.lang.AutoCloseable> T getCloseable(java.lang.String key) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            t = (T) this.Camera2StreamConfigurationMap.get(key);
        }
        return t;
    }

    public static final /* synthetic */ void access$closeWithRuntimeException(androidx.view.viewmodel.internal.ViewModelImpl viewModelImpl, java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) autoCloseable);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
